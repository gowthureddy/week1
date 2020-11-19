package com.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Problem9Class {
	private String name;
	private String designation;
	
	
	public static List<String> obtainDesignation(Map<String,String> empDetails,String designationOutput) {
		
		List<String> listEmployees = new ArrayList(); 
		for(Map.Entry<String, String> mp: empDetails.entrySet()) {
				
				if(mp.getValue().equals(designationOutput)) {
					listEmployees.add(mp.getKey());
				}
		}
		return listEmployees;
	}

}
