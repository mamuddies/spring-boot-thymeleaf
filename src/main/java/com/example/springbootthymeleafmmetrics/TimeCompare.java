package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeCompare {

    public static void main(String[] args) throws ParseException {
        // Cache map start
        String stringDate = "08/2017";
        List<String> listDate = new ArrayList<String>();
        listDate.add(stringDate);
        // Date inputDate = new SimpleDateFormat("MM/yyyy").parse(stringDate);
        Map<String, Map<String, Object>> cacheParentMap = new HashMap<String, Map<String, Object>>();
        Map<String, Object> cacheChaildMap = new HashMap<String, Object>();
        cacheChaildMap.put("disabilly-Date", listDate);
        cacheParentMap.put("disabilly", cacheChaildMap);
        // Cache map End

        // Your code will start from here
        String StringDate = "08/2018";
        Date d2 = new SimpleDateFormat("MM/yyyy").parse(StringDate);

        Map<String, Map<String, Object>> newParentMap = new HashMap<String, Map<String, Object>>(cacheParentMap);

        if (newParentMap.get("disabilly") != null && newParentMap.get("disabilly").get("disabilly-Date") != null) {
            List<String> dateList = (List<String>) newParentMap.get("disabilly").get("disabilly-Date");
            System.out.println(dateList.get(0));
            Date d1 = new SimpleDateFormat("MM/yyyy").parse(dateList.get(0));
            if (d2.compareTo(d1) <= 0) {
                System.out.println("Course start aug 18 or later");
            } else {
                System.out.println("Continue... Your logic here"); // write your remaining logic here }

            }

        }
    }



}