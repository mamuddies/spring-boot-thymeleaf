package sample.metrics.dropwizard;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeCompare {

    public static void main(String[] args) throws ParseException {
        // Cache map start
        String stringArrayDate[] = {"08", "2018"};
        Map<String, Map<String, Object>> cacheParentMap = new HashMap<String, Map<String, Object>>();
        Map<String, Object> cacheChaildMap = new HashMap<String, Object>();
        cacheChaildMap.put("course.start.details", stringArrayDate);
        cacheParentMap.put("course-start-date-details", cacheChaildMap);
        // Cache map End

        // Your code will start from here
        String StringDate = "08/2018";
        Date d2 = new SimpleDateFormat("MM/yyyy").parse(StringDate);

        StringBuffer strDate = new StringBuffer();
        Map<String, Map<String, Object>> newParentMap = new HashMap<String, Map<String, Object>>(cacheParentMap);

        if (newParentMap.get("course-start-date-details") != null
                && newParentMap.get("course-start-date-details").get("course.start.details") != null) {
            String dateArray[] = (String[]) newParentMap.get("course-start-date-details").get("course.start.details");

            for (int i = 0; i <= dateArray.length - 1; i++) {
                strDate = strDate.append(dateArray[i]);
                if (i != dateArray.length - 1) {
                    strDate.append("/");

                }
            }
            Date d1 = new SimpleDateFormat("MM/yyyy").parse(strDate.toString());
            if (d1.compareTo(d2) >= 0) {
                System.out.println("Course start aug 18 or later");
                return;// It will come out from this method
            } else {
                // write your remaining logic here
                System.out.println("Continue... Your logic here");

            }

        }
    }

}
