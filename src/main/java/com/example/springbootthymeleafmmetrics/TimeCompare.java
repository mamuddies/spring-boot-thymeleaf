package com.capitalone.digitalmessagingsystem.batch.batchdsvalidator.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeCompare {
    .isVisible(()->{
    String answer[] = new String[2];
    String kiAnswer[]=new String[2];
    Date courseStartDate = null;
    Date actualDate = null;
    Map<String, Map<String, Object>> applicationAnswer = null;
    Map<String, Object> isAnsweredPreviousQuestion = null;
    Map<String, Object> kiAPQ = null;
    SimpleDateFormat sdf= new SimpleDateFormat("MM/yyyy");

    if (null != this.applicationAnswers.getAnsweres()) {
        try {
            applicationAnswer = applicationAnswers.getAnsweres();
            isAnsweredPreviousQuestion = applicationAnswer.get("course-start-date-details");
            kiAPQ = applicationAnswer.get("course-started-date-details");
            if (null != isAnsweredPreviousQuestion) {
                answer = (String[]) isAnsweredPreviousQuestion.get("course-start-details");
            }
            if (null != kiAPQ) {
                kiAnswer = (String[]) kiAPQ.get("ki");
            }
            
            actualDate = sdf.parse("08/2018");
            Page page =pageService.getPageForm("sample-exit");
            if (null != applicationAnswer.get("course-started-date-details") && (kiAnswer[0] != null && kiAnswer[1] != null)) {
                courseStartDate = sdf.parse(kiAnswer[0] + "/" + kiAnswer[1]);
                page.getConditions.get(0).setVisibilityConfig(courseStartDate.before(actualDate));
            } else if (answer[0] != null && answer[1] != null) {
                courseStartDate = sdf.parse(answer[0] + "/" + answer[1]);
                page.getConditions.get(0).setVisibilityConfig(courseStartDate.before(actualDate));
            }else {
                page.getConditions.get(0).setVisibilityConfig(false);
            }

        } catch (Exception e) {
            logger.error("Exception occured while getting course start details information" + e);
        }
    }
}).doneCondition().build();}
