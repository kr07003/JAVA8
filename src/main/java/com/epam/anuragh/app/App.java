package com.epam.anuragh.app;
import java.util.*;
import java.util.Scanner;

public class App 
{
	public static Scanner input= new Scanner(System.in);
    public static void main( String[] args )
    {	
    	//Average of list of Integers
    	Integer inputNumbers[]= {6,5,4,3,4,5,6,99};
    	List<Integer> listOfNumbers=Arrays.asList(inputNumbers);
    	System.out.println("Average of list of Integers");
    	System.out.println(Operations.average(listOfNumbers));
    	System.out.println();
    	
    	//list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters
        String[] stringCheck= {"","abb","amamam","gsj","aee","aaa","bca","caa","Acc"};
        List<String> strings=Arrays.asList(stringCheck);
        FilterString filterString=new FilterString();
        filterString.filter(strings);
        System.out.println("list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters");
        filterString.displayList(System.out::println);
        System.out.println();
        
        // list of all the palindrome strings.  
        String[] palindromeCheck= {"malayalam","abcba","hello","amma","","abab"};
        strings=new ArrayList<>();
        strings=Arrays.asList(palindromeCheck);
        FilterPalindromes filterPalindromes=new FilterPalindromes();
        filterPalindromes.filterPalindromes(strings, FilterPalindromes::isPalindrome);
        System.out.println("list of all the palindrome strings. ");
        filterPalindromes.display(System.out::println);
    }
    
}
