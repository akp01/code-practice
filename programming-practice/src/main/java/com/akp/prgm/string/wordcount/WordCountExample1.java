package com.akp.prgm.string.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.Map;
import static java.util.stream.Collectors.toMap;

public class WordCountExample1 {
	public static void main(String[] args) throws IOException {
		   Path path = Paths.get("src/main/resources/book.txt");
		   Map<String, Integer> wordCount = Files.lines(path).flatMap(line -> Arrays.stream(line.trim().split("s")))
		           .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
		           .filter(word -> word.length() > 0)
		           .map(word -> new SimpleEntry<>(word, 1))
		           .collect(toMap(e -> e.getKey(), e -> e.getValue(), (v1, v2) -> v1 + v2));
		 
		   wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
		}

}
