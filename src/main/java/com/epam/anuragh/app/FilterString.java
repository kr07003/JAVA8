package com.epam.anuragh.app;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterString {
	private List<Object> filteredStrings;
	public void filter(List<String> listOfStrings)
	{
		Stream<String> stringsstream=listOfStrings.stream();
        this.filteredStrings=stringsstream.filter((t)->{
        	if(t.length()==3 && t.charAt(0)=='a')
        	{
        		return true;
        	}
        	else
        	{
        	return false;
       		}
        }).collect(Collectors.toList());
	}
	public void displayList(Consumer<String> consumer)
    {
    	for(Object str:filteredStrings)
    	{
    		consumer.accept((String) str);
    	}
    }
}
