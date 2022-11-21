package com.Indian_Census.java;

public class CensusAnalyserException extends Exception {
	  enum ExceptionType {
	        CENSUS_FILE_PROBLEM
	    }

	    public ExceptionType type;

	    public CensusAnalyserException(String message, ExceptionType type) {
	        super(message);
	        this.type = type;
	    }

	    public CensusAnalyserException(String message, ExceptionType type, Throwable cause) {
	        super(message, cause);
	        this.type = type;
	    }
	}