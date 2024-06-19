package com.prashanth.battu;

public class month {

	public static void main(String[] args) {
		String month="feb";
		int year=2023;
		if(month=="jan"||month=="march"||month=="may"||month=="july"||month=="august"||month=="october"||month=="december")
			System.out.println("in this month have 31 days");
		else if(month=="feb")
			if(year%4==0)
			System.out.println("this month have 29 days");
			else
				System.out.println("this year have 28 days");
		else
			System.out.println("this month have 30 days");
	}

}
