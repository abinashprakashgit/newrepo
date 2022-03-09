package org.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoginPage {

	public static void main(String[] args) {
		Banking a = new Banking();
		a.setUserID(11);
		a.setPassword("ABNASH");
		
		Banking b = new Banking();
		b.setUserID(11);
		b.setPassword("AISHU");
		
		Banking c = new Banking();
		c.setUserID(11);
		c.setPassword("SARAN");
		
		Map<Integer, Banking> l= new LinkedHashMap<>();
		l.put(100, a);
		l.put(30, b);
		l.put(40, c);
		
		Set<Entry<Integer, Banking>> entrySet = l.entrySet();
		
		for (Entry<Integer, Banking> entry : entrySet) {
			Banking value = entry.getValue();
			int userID = value.getUserID();
			System.out.println(userID);
			String password = value.getPassword();
			System.out.println(password);
			
		}
		
		
			
		
		
		
		
		
//		
//		int userID = a.getUserID();
//		System.out.println(userID);
//		String password = a.getPassword();
//		System.out.println(password);
		
	}
	}


