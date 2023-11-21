package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ReportHandling 
{
	public static ExtentReports Report()
	{
		ExtentReports reports = new ExtentReports("D://Tutorials//report//report.html",false);
		return reports;
		
	}
	
}
