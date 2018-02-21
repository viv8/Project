package com.turbopass;

import java.util.Collections;
import java.util.TreeMap;

public class InsertionSection {
	
	public TreeMap InsertPair(DictDTO ref) {
		TreeMap dictionary=new TreeMap();
		System.out.println("name:"+ref.getName());
		//System.out.println("words:"+ref.getWords());
		dictionary.put(ref.getName(), ref.getWords());
		return dictionary;
	}
}
