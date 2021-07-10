package com.anagram.reader.core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import com.anagram.reader.exception.FileNotReadException;

public class AnagramFileReader {

	private static String fileContent;

	public static void getFileContent(String filePath)
			throws FileNotFoundException, IOException {

		File file = new File(filePath);

		try (FileReader fileReader = new FileReader(file)) {
			fileContent = readAllCharactersOneByOne(fileReader);
		}
	}

	private static String readAllCharactersOneByOne(Reader reader)
			throws IOException {
		StringBuilder content = new StringBuilder();
		int nextChar;
		while ((nextChar = reader.read()) != -1) {
			content.append((char) nextChar);
		}
		return String.valueOf(content);
	}

	public static String getFileContent() throws FileNotReadException {
		if (fileContent == null) {
			throw new FileNotReadException();
		}
		return fileContent;
	}

	public static String[] getFileContentAsArray() throws FileNotReadException {
		if (fileContent == null) {
			throw new FileNotReadException();
		}

		String[] fileContentArray = fileContent.split("\n");
		return fileContentArray;
	}

	public static Map<String, Boolean> getContentAsList()
			throws FileNotReadException {

		String[] strArray = getFileContentAsArray();
		Map<String, Boolean> listMap = new HashMap<>();
		for (String str : strArray) {
			listMap.put(str, Boolean.TRUE);
		}
		return listMap;
	}

	public static Map<Integer, String> getContentAsSomething()
			throws FileNotReadException {
		if (fileContent == null) {
			throw new FileNotReadException();
		}

		String[] strArray = fileContent.split("\n");
		Map<Integer, String> listMap = new HashMap<>();
		int count = 0;
		for (String str : strArray) {
			listMap.put(Integer.valueOf(count++), str);
		}
		return listMap;
	}

}
