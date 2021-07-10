package com.anagram.reader.exception;

public class FileNotReadException extends Exception {

	private static final long serialVersionUID = 1L;

	public FileNotReadException() {
		super("File is not yet read !");
	}

}
