package com.luv2code.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TableTennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice serves and slams";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
