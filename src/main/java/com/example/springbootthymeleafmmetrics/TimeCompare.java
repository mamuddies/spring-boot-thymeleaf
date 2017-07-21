.isVisable(()->{
            String[] answer=null;
            int month,year=0;
            Map<String,Object> isAnswaredPreviousQuestion=null;
            Map<String,Map<String,Object>> applicationAnswar=null;
            if(null!=this.applicationAnswar.getAnswers()){
                applicationAnswar=this.applicationAnswar.getAnswers();
                isAnswaredPreviousQuestion =applicationAnswar.get("course-start-date-details");
                if(null!=isAnswaredPreviousQuestion){
                    answer=(String[])isAnswaredPreviousQuestion.get("coursr.start.details");
                    if(null!=answer){
                        month=Integer.parseInt(answer[0]);
                        year=Integer.parseInt(answer[1]);
                        
                        Page page =pageService.gatPageForm("sample-exit");
                        page.getConditions.get(0).setVisibilityConfig(year<2018||(year==2018 && month<8));
                    }
                }
            }
        }).doneCondition().build();
