package com.example.springbootthymeleafmmetrics;

import java.util.Map;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @Autowired
    private MetricsService metricsService;

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        model.put("message", this.message);
        return "welcome";
    }

    @RequestMapping("/metricsdata")
    public ModelAndView home(ModelAndView model) throws JSONException {
        MetricsResponse metricResponse = metricsService.getMetricsResponse();
        model.addObject("metricResponse", metricResponse);

        model.setViewName("metrics");
        return model;
    }

}