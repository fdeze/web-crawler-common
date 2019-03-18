package fr.fabien.webcrawler.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateParseUtils {

	public static boolean isDate(String lDate) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			format.parse(lDate);
		} catch (ParseException lException) {
			return false;
		}
		return true;

	}

	private DateParseUtils() {

	}

}
