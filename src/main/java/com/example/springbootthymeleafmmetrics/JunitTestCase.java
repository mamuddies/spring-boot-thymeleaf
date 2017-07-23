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

	// below one is you code change class modify this class name
	private PageDetails pageDetails;

	@Before
	public void setUp() {
		// below one is you code change class modify this class name and create
		// object
		pageDetails = new PageDetails();

		applicationAnswers = new ApplicationAnsweres();
		applicationAnswers.setAnsweres(getRequest());

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
