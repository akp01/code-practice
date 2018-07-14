package com.akp.java8.stringjoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerTest {

	public static void main(String[] args) {

		// 1. StringJoiner
		// 1.1 Join String by a delimiter
		StringJoiner sj = new StringJoiner(",");
		sj.add("aaa");
		sj.add("bbb");
		sj.add("ccc");
		String result = sj.toString();
		System.out.println(result); // aaa,bbb,ccc

		// 1.2 Join String by a delimiter and starting with a supplied prefix and ending
		// with a supplied suffix.
		StringJoiner sj1 = new StringJoiner("/", "prefix-", "-suffix");
		sj1.add("2016");
		sj1.add("02");
		sj1.add("26");
		String result1 = sj1.toString();
		System.out.println(result1); // prefix-2016/02/26-suffix

		// 2. String.join
		// 2.1 Join String by a delimiter.
		// 2015-10-31
		String result2 = String.join("-", "2015", "10", "31");
		System.out.println(result2);

		// 2.2 Join a List by a delimiter.
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		// java, python, nodejs, ruby
		String result3 = String.join(", ", list);
		System.out.println(result3);

		// 3. Collectors.joining
		// 3.1 Join List<String> example.
		List<String> list1 = Arrays.asList("java", "python", "nodejs", "ruby");

		// java | python | nodejs | ruby
		String result4 = list1.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println(result4);

		// 3.2 Join List<Object> example.
		List<Game> list2 = Arrays.asList(new Game("Dragon Blaze", 5), new Game("Angry Bird", 5),
				new Game("Candy Crush", 5));

		// {Dragon Blaze, Angry Bird, Candy Crush}
		String result5 = list2.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));
		System.out.println(result5);

	}

}

class Game {
	String name;
	int ranking;

	public Game(String name, int ranking) {
		this.name = name;
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
}
