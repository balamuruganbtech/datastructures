package com.app.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {

	public static SimpleDateFormat DATE_FORMAT_E_M_D_H_M_S_Y_INDIA = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy");
	public static SimpleDateFormat DATE_FORMAT_E_M_D_H_M_S_Y_FRANCE = new SimpleDateFormat("EEE MMM dd hh:mm:ss yyyy",Locale.FRANCE);

	public static String getFranceTime() {
		return DATE_FORMAT_E_M_D_H_M_S_Y_FRANCE.format(new Date());
	}

	public static String getIndiaTime() {
		return DATE_FORMAT_E_M_D_H_M_S_Y_INDIA.format(new Date());
	}
	public static void main(String[] args) {
		System.out.println(getFranceTime());
		Calendar calParis = Calendar.getInstance();

	    calParis.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
	    System.out.println("Time in Paris: " + calParis.get(Calendar.HOUR_OF_DAY) + ":"+ calParis.get(Calendar.MINUTE));

	}

}

