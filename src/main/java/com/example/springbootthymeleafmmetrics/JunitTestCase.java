package com.example.springbootmetricsdropwizard;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.util.reflection.Whitebox;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JunitTestCase {
	private ApplicationAnsweres applicationAnswers;

	// Instead of PageDetails give your class name in all palces
	private PageDetails pageDetails;

	@Before
	public void setUp() {
		// Instead of PageDetails give your class name in all palces
		pageDetails = new PageDetails();

		applicationAnswers = new ApplicationAnsweres();
		applicationAnswers.setAnsweres(getRequest());
		// Instead of PageDetails give your class name in all palces
		Whitebox.setInternalState(pageDetails, "applicationAnswers", applicationAnswers);

	}

	@Test
	public void testMethod() {

		// Mockito.when(applicationAnswers.getAnsweres()).thenReturn(getRequest());

		pageDetails.myPageDetails();

	}

	private Map<String, Map<String, Object>> getRequest() {
		String[] haveYouStartCourse = { "yes" };
		String[] startDateDetails = { "09", "2018" };

		Map<String, Map<String, Object>> aplicationAnswers = new HashMap<>();
		Map<String, Object> coureseStartDetailssMore = new HashMap<>();
		Map<String, Object> coureseStartDateDetails = new HashMap<>();
		coureseStartDetailssMore.put("Have you start your course ?", haveYouStartCourse);
		aplicationAnswers.put("course-start-details-more", coureseStartDetailssMore);
		coureseStartDateDetails.put("course-start-details", startDateDetails);
		aplicationAnswers.put("course-start-date-details", coureseStartDateDetails);
		aplicationAnswers.put("course-started-date-details", coureseStartDateDetails);
		return aplicationAnswers;

	}

}
