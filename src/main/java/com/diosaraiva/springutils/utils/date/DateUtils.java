package com.diosaraiva.springutils.utils.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils{
	public String getFormattedDate(LocalDateTime localDateTime) 
	{
		return getDateFormatter().format(localDateTime);
	}

	public String getDatePattern() 
	{
		return "dd-MM-yyyy HH:mm:ss";
	}

	public DateTimeFormatter getDateFormatter()
	{
		return DateTimeFormatter.ofPattern(getDatePattern());
	}
}