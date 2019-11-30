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

		String formattedDate = lDate.replace("il y a ", "").replace("Candidature simplifiée", "");
		if (formattedDate.contains("heures")) {
			formattedDate = formattedDate.replace("heures", "").trim();
			value = Integer.parseInt(formattedDate);
		} else if (formattedDate.contains("jour")) {
			formattedDate = formattedDate.replace("jours", "").replace("jour", "").trim();
			value = Integer.parseInt(formattedDate) * 24;

		} else if (formattedDate.contains("semaine")) {
			formattedDate = formattedDate.replace("semaines", "").replace("semaine", "").trim();
			value = Integer.parseInt(formattedDate) * 24 * 7;

		} else if (formattedDate.contains("mois")) {
			formattedDate = formattedDate.replace("mois", "").trim();
			value = Integer.parseInt(formattedDate) * 24 * 31;
		}

		return value;
	}

}
