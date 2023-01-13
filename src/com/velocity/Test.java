package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		list.add("ashutosh");
		list.add("shubham");
		list.add("arohi");
		
	//	System.out.println(list);
	
		for( String s : list) {
			System.out.println(s);
		}
	}

}
