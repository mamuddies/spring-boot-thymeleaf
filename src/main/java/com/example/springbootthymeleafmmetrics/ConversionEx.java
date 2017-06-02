package com.example.springbootthymeleafmmetrics;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversionEx {

    public static void main(String[] args) {

        // Map object example start
        Map<String, String> pageOneMap = new HashMap<String, String>();
        pageOneMap.put("What is your name.?", "rama");

        Map<String, String> pageTwoMap = new HashMap<String, String>();
        pageTwoMap.put("From where you came.?", "india");

        Map<String, String> pageThreeMap = new HashMap<String, String>();
        pageThreeMap.put("What is your age.?", "20");

        Map<String, Map<String, String>> pageMap = new HashMap<String, Map<String, String>>();
        pageMap.put("P1", pageOneMap);
        pageMap.put("P2", pageTwoMap);
        pageMap.put("P3", pageThreeMap);
        System.out.println("PageMap Data ---: " + pageMap);
        // Map object example End

        // converting 'Map' object to 'JSONObject' start
        JSONObject json = new JSONObject(pageMap);
        System.out.println("Convert Map to JSON ---: " + json);
        // Now you can use this "json" where ever you want. Also you can send this 'json' response as method parameter
        // where ever you what to convert 'json' to map object
        // converting 'Map' object to 'JSONObject' End

        // converting 'JSONObject' object to 'Map' start
        // Where ever you what to convert 'json' object to 'map' use below code
        Gson gson = new GsonBuilder().create();
        Map<String, Map<String, String>> convertJsonToMap = gson.fromJson(json.toString(), HashMap.class);
        System.out.println("JSON to MAP----: " + convertJsonToMap);
        // converting 'JSONObject' object to 'Map' END

    }

}
