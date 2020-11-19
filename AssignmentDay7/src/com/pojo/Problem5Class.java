package com.pojo;

import java.util.Calendar;

public class Problem5Class {
	public static int display(int year, int month) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.YEAR, year);
	    cal.set(Calendar.MONTH, month);
	    int DAY_OF_MONTH = cal.getActualMaximum(cal.DAY_OF_MONTH);
	    return DAY_OF_MONTH;
	  }

}
