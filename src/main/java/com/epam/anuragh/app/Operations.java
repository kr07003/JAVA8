package com.epam.anuragh.app;

import java.util.List;

public class Operations {
	public static int average(List<Integer> listOfNumbers)
    {
    	int sum=0;
    	for(Integer iterator:listOfNumbers)
    	{
    		sum=sum+iterator;
    	}
    	return sum/listOfNumbers.size();
    }

}
