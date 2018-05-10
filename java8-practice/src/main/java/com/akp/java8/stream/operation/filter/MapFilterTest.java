/**
 * 
 */
package com.akp.java8.stream.operation.filter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author akp
 *
 */
public class MapFilterTest {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final Map<Integer, String> hostingMap = new HashMap<>();
		hostingMap.put(1, "linode.com");
		hostingMap.put(2, "heroku.com");
		hostingMap.put(3, "digitalocean.com");
		hostingMap.put(4, "aws.amazon.com");

		String result = "";
		for (final Map.Entry<Integer, String> entry : hostingMap.entrySet()) {
			if ("aws.amazon.com".equals(entry.getValue())) {
				result = entry.getValue();
			}
		}
		System.out.println("Before Java 8 : " + result);

		result = hostingMap.entrySet().stream().filter(map -> "aws.amazon.com".equals(map.getValue()))
				.map(map -> map.getValue()).collect(Collectors.joining());
		System.out.println("With Java 8 : " + result);

		result = hostingMap.entrySet().stream().filter(map -> "heroku.com".equals(map.getValue()))
				.map(map -> map.getValue()).collect(Collectors.joining());
		System.out.println("With Java 8 : " + result);

	}

}
