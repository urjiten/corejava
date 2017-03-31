package com.innowake.formatter;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

// formatter for dates
public class DateFormatter extends Formatter {

	@Override
	public String format(Object object) {
		
		DateFormat dateFormatter = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, Locale.GERMAN);
		String formattedDate = dateFormatter.format(object);
		return formattedDate;

		/*
		 * data = (Date) object;
		 * return data.toString();
		 */
	}

	@SuppressWarnings("unchecked")
	@Override
	public Date parse(String text) {
		Date date = null;
		try {
			date = getDateFormat().parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}

		return date;

		/*
		 * try { data = getDateFormat().parse(text); } catch (ParseException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); return
		 * (Date) null; } return (Date) data;
		 */
	}

	@Override
	public boolean isValid(String text) {
		// TODO Auto-generated method stub
		try {
			 getDateFormat().parse(text);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	// returns the date format for this formatter
	public DateFormat getDateFormat() {
		return sdf;
	}

}
