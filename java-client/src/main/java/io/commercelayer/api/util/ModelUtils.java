package io.commercelayer.api.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ModelUtils {

	public static enum DigestType {
		MD5, SHA, SHA256, SHA384, SHA512
	}

	public static boolean isEmpty(byte[] b) {
		return (b == null) || (b.length == 0);
	}

	public static String[] split(String str, String separator) {

		if (str == null)
			return null;
		if (separator == null)
			return new String[] { str };

		if (str.indexOf(separator) == -1)
			return new String[] { str };

		return str.split(separator);

	}

	public static String concat(char separator, String... strings) {
		return concat(String.valueOf(separator), strings);
	}

	public static String concat(String separator, String... strings) {

		if ((strings == null) || (strings.length == 0))
			return "";

		String sep = "";
		if (strings.length > 1)
			sep = separator;

		if (sep == null)
			sep = "";

		StringBuffer str = new StringBuffer();
		for (String s : strings)
			str.append(s).append(sep);

		str.deleteCharAt(str.length() - 1);

		return str.toString();

	}

	public static List<List<?>> getSubLists(List<?> list, int subListSize) {

		List<List<?>> subLists = new ArrayList<List<?>>((int) (list.size() / subListSize));
		int fromIndex = 0;
		int toIndex = subListSize;

		boolean end = false;
		while (!end) {
			if (list.size() < toIndex) {
				toIndex = list.size();
				end = true;
			}
			subLists.add(list.subList(fromIndex, toIndex));
			fromIndex += subListSize;
			toIndex += subListSize;
		}

		return subLists;

	}

	public static Map<String, String> sortMapByValue(Map<String, String> mappa) {

		final class MapValueComparator implements Comparator<String>, Serializable {

			private static final long serialVersionUID = -2498288325394273499L;

			private Map<String, String> mappa;

			public MapValueComparator(Map<String, String> mappa) {
				this.mappa = mappa;
			}

			@Override
			public int compare(String o1, String o2) {
				return (mappa.get(o1).toLowerCase().compareTo(mappa.get(o2).toLowerCase()));
			}

		}

		Map<String, String> map = null;

		if (mappa != null) {
			map = new TreeMap<String, String>(new MapValueComparator(mappa));
			map.putAll(mappa);
		}

		return map;

	}

	public static Map<String, String> cloneMap(Map<String, String> mappa) {

		if (mappa == null)
			return null;

		Map<String, String> mappa_ = new LinkedHashMap<String, String>();

		for (Map.Entry<String, String> entry : mappa.entrySet())
			mappa_.put(entry.getKey(), entry.getValue());

		return mappa_;

	}

	public static String removeLeadingZeroes(String str) {
		return str.replaceFirst("^0+(?!$)", "");
	}

}
