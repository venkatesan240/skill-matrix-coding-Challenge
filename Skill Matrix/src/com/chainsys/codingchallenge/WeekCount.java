package com.chainsys.codingchallenge;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class WeekCount {
		public static long getWeeksBetween(LocalDate startDate, LocalDate endDate) {
	        return ChronoUnit.WEEKS.between(startDate, endDate);
	    }

	    public static void main(String[] args) {
	        LocalDate startDate = LocalDate.of(2023, 1, 1);
	        LocalDate endDate = LocalDate.of(2023, 3, 1);

	        long weeks = getWeeksBetween(startDate, endDate);
	        System.out.println("Number of weeks between " + startDate + " and " + endDate + ": " + weeks);
	    }

	

}
