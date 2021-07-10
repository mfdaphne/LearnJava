package com.anagram.reader.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.anagram.reader.core.AnagramFileReader;
import com.anagram.reader.exception.FileNotReadException;

public class FindAnagramsInTextService {

	public void checkGroupsOfAnagrams() throws FileNotReadException {

//		List<Set<String>> groupOfAnagrams = new ArrayList<>();

		Map<String, Boolean> words = AnagramFileReader.getContentAsList();

		for (String word : words.keySet()) {
			if (words.get(word).equals(Boolean.FALSE)) {
				continue;
			}
			Set<String> matchingSet = new HashSet<>();
			matchingSet.add(word);

			for (String word1 : words.keySet()) {
				if (words.get(word1).equals(Boolean.FALSE)) {
					continue;
				}
				if (checkIfTwoWordsAreAnagrams(word, word1)) {
					matchingSet.add(word1);
					words.put(word1, Boolean.FALSE);
				}
			}
//			groupOfAnagrams.add(matchingSet);
			System.out.println(matchingSet.toString());

		}

	}

	public void anotherFastWay() throws FileNotReadException {
		Map<Integer, String> words = AnagramFileReader.getContentAsSomething();
		Map<Integer, String> wordDuplicate = new HashMap<>(words);

		Map<Integer, String> convertedWords = sortWords(wordDuplicate);

		Map<String, List<Integer>> groupKeysWithSameValues = convertedWords
				.keySet().stream()
				.collect(Collectors.groupingBy(k -> convertedWords.get(k)));

		for (List<Integer> sameValueKeys : groupKeysWithSameValues.values()) {
			for (Integer key : sameValueKeys) {
				System.out.print(words.get(key) + " ");
			}
			System.out.println();
		}
	}

	private Map<Integer, String> sortWords(Map<Integer, String> words) {
		for (Integer wordKey : words.keySet()) {
			String s1 = words.get(wordKey).replaceAll("\\s", "");
			char[] char1 = s1.toLowerCase().toCharArray();
			Arrays.sort(char1);
			words.put(wordKey, String.valueOf(char1));
		}
		return words;
	}

	private boolean checkIfTwoWordsAreAnagrams(String str1, String str2) {
		boolean isAnagram = true;

		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");

		if (s1.length() != s2.length()) {
			isAnagram = false;
		} else {
			char[] char1 = s1.toLowerCase().toCharArray();
			char[] char2 = s2.toLowerCase().toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			isAnagram = Arrays.equals(char1, char2);
		}

		return isAnagram;
	}

}
