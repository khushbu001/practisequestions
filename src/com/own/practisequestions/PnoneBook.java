package com.own.practisequestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PnoneBook {

		public static void main(String []argh)
		{
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			in.nextLine();
	        Map<String, Integer> phonebook=new HashMap<>();
			for(int i=0;i<n;i++)
			{
				String name=in.nextLine();
				int phone=in.nextInt();
	            phonebook.put(name,phone);
				in.nextLine();
			}
			while(in.hasNext())
			{
				String s=in.nextLine();
	            findNumber(phonebook,s);

			}

		}
	    static void findNumber(Map<String, Integer> phonebook, String s){
	        for (Map.Entry<String,Integer> entry : phonebook.entrySet())  {
	            if(entry.getKey().equals(s)){
	                System.out.println("Key = " + entry.getKey() + 
	                             ", Value = " + entry.getValue()); 
	                             break;
	            }
	            
	        }
	            
	    }  

}
