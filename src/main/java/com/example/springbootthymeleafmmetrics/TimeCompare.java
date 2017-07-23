.isVisible(()->{
			String answer[] = new String[2];
			Date courseStartDate = null;
			Date actualDate = null;
			Map<String, Map<String, Object>> applicationAnswer = null;
			Map<String, Object> isAnsweredPreviousQuestion = null;
			SimpleDateFormat sdf= new SimpleDateFormat("MM/yyyy");

			if (null != this.applicationAnswers.getAnsweres()) {
				try {
					applicationAnswer = applicationAnswers.getAnsweres();
					isAnsweredPreviousQuestion = applicationAnswer.get("course-start-date-details");
					if (null != isAnsweredPreviousQuestion) {
						answer = (String[]) isAnsweredPreviousQuestion.get("course-start-details");
					}

					Page page =pageService.getPageForm("sample-exit");
					if (null != applicationAnswer.get("course-started-date-details")) {
						page.getConditions.get(0).setVisibilityConfig(true);
					} else if (answer[0] != null && answer[1] != null) {
						actualDate = sdf.parse("08/2018");
						courseStartDate = sdf.parse(answer[0] + "/" + answer[1]);
						page.getConditions.get(0).setVisibilityConfig(courseStartDate.before(actualDate));
					}else {
						page.getConditions.get(0).setVisibilityConfig(false);
					}

				} catch (Exception e) {
					logger.error("Exception occured while getting course start details information" + e);
				}
			}
		}).doneCondition().build();


//Below one for if condition check

if (page.getConditions().isEmpty()|| (conditionalQuestions.contails(page.getName()) && page.getConditions().get(0).isVisibilityConfig()) || (!page.getConditions().isEmpty() && page.getConditions().get(0).isVisibilityConfig())) {



