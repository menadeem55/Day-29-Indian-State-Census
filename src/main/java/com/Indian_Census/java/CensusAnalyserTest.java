package com.Indian_Census.java;

import org.junit.Assert;
import org.junit.Test;



public class CensusAnalyserTest {
	private static final String INDIA_CENSUS_CSV_FILE_PATH = "C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\CensusAnalyser\\IndianCenses.csv";

	@Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords() {
        try {
            CensusAnalyser censusAnalyser = new CensusAnalyser();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}