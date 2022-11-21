package com.Indian_Census.java;

import org.junit.Assert;
import org.junit.Test;

public class CensusAnalyserTest {
    @Test
    public void givenIndianStateCSV_ShouldReturnExactCount() {
        try {
        	 final String INDIAN_STATE_CSV_FILE = "C:\\Users\\menad\\OneDrive\\Desktop\\Blabz practice problem\\Day2Problems\\CensusAnalyser\\IndianStates.csv";
   		  CensusAnalyser censusAnalyser = new CensusAnalyser();
             int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIAN_STATE_CSV_FILE);
             Assert.assertEquals(37,numOfRecords);
        } catch (CensusAnalyserException e) { }
    }
}