package com.turbopass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

public class NormalDictionary {
	static TreeMap<String,ArrayList> ref=new TreeMap<String,ArrayList>();
	public static void main(String[] args) {
		ArrayList<String> r= new ArrayList<String>();
		r.add("good");
		r.add("well");
		ref.put("nice", r);
		ArrayList e=ref.get("nice");
		Iterator i=e.iterator();
		while (i.hasNext()) {
			String object = (String) i.next();
			System.out.println("object "+i+":"+object);
		}
		/*for (ArrayList object : e) {
			
			
		}*/
//		ref.remove("nice");
		System.out.println(ref);
		ref.remove("nice");
		ArrayList f=ref.get("nice");
		Iterator k=f.iterator();
		while (k.hasNext()) {
			String object = (String) k.next();
			System.out.println("object "+k+":"+object);
		}
		
		
	}
}
