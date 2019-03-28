package fr.fabien.webcrawler.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateParseUtils {

	private DateParseUtils() {

	}

	public static boolean isDate(String lDate) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		try {
			format.parse(lDate);
		} catch (ParseException lException) {
			return false;
		}
		return true;

	}

	public static int setDateCalculee(String lDate) {
		int value = 0;

		String formattedDate = lDate.replaceAll("il y a ", "");
		if (formattedDate.contains("heures")) {
			formattedDate = formattedDate.replaceAll("heures", "").trim();
			value = Integer.parseInt(formattedDate);
		} else if (formattedDate.contains("jour")) {
			formattedDate = formattedDate.replaceAll("jours", "").replaceAll("jour", "").trim();
			value = Integer.parseInt(formattedDate) * 24;

		} else if (formattedDate.contains("semaine")) {
			formattedDate = formattedDate.replaceAll("semaines", "").replaceAll("semaine", "").trim();
			value = Integer.parseInt(formattedDate) * 24 * 7;

		} else if (formattedDate.contains("mois")) {
			formattedDate = formattedDate.replaceAll("mois", "").trim();
			value = Integer.parseInt(formattedDate) * 24 * 31;
		}

		return value;
	}

}
