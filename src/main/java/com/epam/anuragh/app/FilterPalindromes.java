package com.epam.anuragh.app;
import java.util.*;
import java.util.function.*;

public class FilterPalindromes {
	public List<String> inputStrings;
	FilterPalindromes()
	{
		this.inputStrings=new ArrayList<String>();
	}
	public static Boolean isPalindrome(String string)
	{
		int i=0,j=string.length()-1;
		while(i<j)
		{
			if(string.charAt(i)!=string.charAt(j))
			{
				return false;
			}
			i=i+1;
			j=j-1;
		}
		return true;
	}
	public void filterPalindromes(List<String> listOfStrings,Predicate<String> predicate)
	{
		for(String str:listOfStrings)
		{
			if(predicate.test(str))
			{
				this.inputStrings.add(str);
				
			}
		}
	}
	public void display(Consumer<String> consumer)
	{
		for(String str:this.inputStrings)
		{
			consumer.accept(str);
		}
	}
}
