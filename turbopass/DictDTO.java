package com.turbopass;

import java.util.ArrayList;
import java.util.List;

public class DictDTO {
	private String name;
	private ArrayList<String> words;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List getWords() {
		return words;
	}
	public void setWords(ArrayList<String> words) {
		this.words = words;
	}
}
