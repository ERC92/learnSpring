package com.luv2code.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach {
	
	private FortuneService fortuneService;

	@Autowired
	public void depInMethod(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Break a hockey stick";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() + " is with you";
	}

}
