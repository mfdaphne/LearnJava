package com.anagram.reader;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.anagram.reader.core.AnagramFileReader;
import com.anagram.reader.exception.FileNotReadException;
import com.anagram.reader.service.FindAnagramsInTextService;

public class AnagramProcessor {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, FileNotReadException {
		AnagramFileReader.getFileContent(
				"/Users/dthompson/Documents/DaffyDocs/Applications/InterviewQuestions/words.txt");

//		AnagramFileReader.getContentAsList();

		FindAnagramsInTextService ser = new FindAnagramsInTextService();
		ser.anotherFastWay();

	}

}
