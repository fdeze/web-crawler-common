package fr.fabien.webcrawler.common;

import java.util.Arrays;
import java.util.List;

public class StringParseUtils {

	private StringParseUtils() {

	}

	public static String extractOfferIdentifier(String stringToExtract) {

		String[] array = stringToExtract.split("\\?");
		array = array[0].split("-");
		List<String> list = Arrays.asList(array);
		
		return list.get(list.size() -1);
	}

}
