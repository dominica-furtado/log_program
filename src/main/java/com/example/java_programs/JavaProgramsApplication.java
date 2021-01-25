package com.example.java_programs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jdk.internal.org.jline.utils.Log;

import java.util.*;
import java.io.*;

@SpringBootApplication
public class JavaProgramsApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(JavaProgramsApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(JavaProgramsApplication.class, args);
		Scanner sc = new Scanner(System.in);
		
		
		//LOGGER.debug("Test");
		LOGGER.trace("doStuff needed more information - {}");
        LOGGER.debug("doStuff needed to debug - {}");
        LOGGER.info("doStuff took input - {}");
        LOGGER.warn("doStuff needed to warn - {}");
        LOGGER.error("doStuff encountered an error with value - {}");
		System.out.println("Adding logger");
		String str;
		System.out.println("Enter a string :");	//Accept a string from user
		str = sc.nextLine();
		
		if(str.equals(""))
		{
			//logs.info("Entered a blank input");
		}
		
		str = str.toLowerCase(); 	//Convert str to lowercase
		
		StringTokenizer tokenizer = new StringTokenizer(str,"\t \n:,;?.[]()'");
		
		int len_tokens = tokenizer.countTokens(); 	//Number of tokens
		System.out.println("The total number of tokens = "+len_tokens);
		
		
		//Store the word as key & its count as value
		Map <String,Integer> ht = new HashMap<String, Integer>(); 
		
		for(int i=0; i<len_tokens; i++)
		{
			String key_word = tokenizer.nextElement().toString();
			
			if(ht.containsKey(key_word))
			{
				int cnt = ht.get(key_word);
				ht.put(key_word, cnt+1);
			}
			
			else
			{
				ht.put(key_word, 1);
			}
		}
		
		System.out.println("\nWord count : \n"+ht);
		
		TreeMap tm = new TreeMap(ht);
		System.out.println("\nSorted word count :\n"+tm);
	}

}
