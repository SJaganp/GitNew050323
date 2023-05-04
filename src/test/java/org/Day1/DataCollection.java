package org.Day1;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataCollection extends BaseClass {
	
	@DataProvider(name="Course")
	private Object loginData() throws IOException {
		return new Object[][]{
		
		{toReadDataFromExcel("Information", 1, 1), toReadDataFromExcel("Information", 1, 3)},
		{toReadDataFromExcel("Information", 2, 1), toReadDataFromExcel("Information", 2, 3)},
		{toReadDataFromExcel("Information", 3, 1), toReadDataFromExcel("Information", 3, 3)},
		{toReadDataFromExcel("Information", 4, 1), toReadDataFromExcel("Information", 4, 3)},
		{toReadDataFromExcel("Information", 5, 1), toReadDataFromExcel("Information", 5, 3)}
		
		
		};
	}
	

}
