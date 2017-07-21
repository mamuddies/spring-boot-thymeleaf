.isVisable(()->{
            String[] answer=null;
            int month,year=0;
            Map<String,Object> isAnswaredPreviousQuestion=null;
            Map<String,Map<String,Object>> applicationAnswer=null;
            if(null!=this.applicationAnswer.getAnswers()){
                applicationAnswer=this.applicationAnswer.getAnswers();
                isAnswaredPreviousQuestion =applicationAnswer.get("course-start-date-details");
                if(null!=isAnswaredPreviousQuestion){
                    answer=(String[])isAnswaredPreviousQuestion.get("course.start.details");
                    if(null!=answer){
                        month=Integer.parseInt(answer[0]);
                        year=Integer.parseInt(answer[1]);
                        
                        Page page =pageService.gatPageForm("sample-exit");
                        page.getConditions.get(0).setVisibilityConfig(year<2018||(year==2018 && month<8));
                    }
                }
            }
        }).doneCondition().build();
