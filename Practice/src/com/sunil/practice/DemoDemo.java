package com.sunil.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class DemoDemo {

	public static void main(String[] args) {
		Date date=new Date();
		//Date dateBefore30Days = DateUtils.addDays(new Date(),-30);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String str=sdf.format(date);
		//DateTimeFormatter dtf= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date1
        = LocalDate.parse(str);
		 LocalDate returnvalue
         = date1.minusDays(1);
		for(int i=1; i<5; i++) {
			date1=date1.minusDays(1);
			System.out.println(date1);
		}
		
		System.out.println(date1);
		System.out.println(returnvalue);
		
	}

}
