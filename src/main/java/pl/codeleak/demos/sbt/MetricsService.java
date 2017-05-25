package com.example.springbootthymeleafmmetrics;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

@Service
public class MetricsService {

    @Autowired
    private RestTemplate restTemplate;

    public MetricsResponse getMetricsResponse() {
        String url = "http://localhost:8080/metrics";
        HttpHeaders header = new HttpHeaders();
        header.add("Content-Type", "application/json");
        header.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<?> request = new HttpEntity<Object>(header);
        Map<String, String> urlVariables = new HashMap<String, String>();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class,
                urlVariables);
        JSONObject jsonObject = new JSONObject(response.getBody());

        return formateMatricsResponse(jsonObject);
    }

    private MetricsResponse formateMatricsResponse(JSONObject jsonObject) {
        JSONObject responseJson = new JSONObject();
        responseJson.put("mem", jsonObject.has("mem") ? jsonObject.get("mem") : 0);
        responseJson.put("memFree", jsonObject.has("mem.free") ? jsonObject.get("mem.free") : 0);
        responseJson.put("systemloadAverage",
                jsonObject.has("systemload.average") ? jsonObject.get("systemload.average") : 0);
        responseJson.put("heap", jsonObject.has("heap") ? jsonObject.get("heap") : 0);
        responseJson.put("heapUsed", jsonObject.has("heap.used") ? jsonObject.get("heap.used") : 0);
        responseJson.put("threads", jsonObject.has("threads") ? jsonObject.get("threads") : 0);
        responseJson.put("threadsTotalStarted",
                jsonObject.has("threads.totalStarted") ? jsonObject.get("threads.totalStarted") : 0);
        responseJson.put("counterStatus200Metrics",
                jsonObject.has("counter.status.200.metrics") ? jsonObject.get("counter.status.200.metrics") : 0);
        responseJson.put("counterStatus200Home",
                jsonObject.has("counter.status.200.home") ? jsonObject.get("counter.status.200.home") : 0);
        responseJson.put("counterStatus404StarStar",
                jsonObject.has("counter.status.404.star-star") ? jsonObject.get("counter.status.404.star-star") : 0);
        responseJson.put("gaugeResponseRoot",
                jsonObject.has("gauge.response.root") ? jsonObject.get("gauge.response.root") : 0);
        responseJson.put("gaugeResponseHome",
                jsonObject.has("gauge.response.home") ? jsonObject.get("gauge.response.home") : 0);
        responseJson.put("gaugeResponseMetrics",
                jsonObject.has("gauge.response.metrics") ? jsonObject.get("gauge.response.metrics") : 0);
        responseJson.put("httpsessionsMax",
                jsonObject.has("httpsessions.max") ? jsonObject.get("httpsessions.max") : 0);
        responseJson.put("httpsessionsActive",
                jsonObject.has("httpsessions.active") ? jsonObject.get("httpsessions.active") : 0);
        responseJson.put("counterStatus200Root",
                jsonObject.has("counter.status.200.root") ? jsonObject.get("counter.status.200.root") : 0);

        Gson gson = new GsonBuilder().create();
        MetricsResponse respon = gson.fromJson(responseJson.toString(), MetricsResponse.class);
        return respon;
    }
}
