package com.akp.prgm.string.wordcount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCountExample {

	public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/main/resources/book.txt");
        Map<String, Integer> wordCount = Files.lines(path)
           .flatMap(line -> Arrays.stream(line.trim().split(" ")))
           .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
           .filter(word -> word.length() > 0)
           .map(word -> new SimpleEntry<>(word, 1))
           .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
            .reduce(new LinkedHashMap<>(), (acc, entry) -> {
               acc.put(entry.getKey(), acc.compute(entry.getKey(), (k, v) -> v == null ? 1 : v + 1));
               return acc;
            }, (m1, m2) -> m1);
 
        wordCount.forEach((k, v) -> System.out.println(String.format("%s ==>> %d", k, v)));
    }
}


