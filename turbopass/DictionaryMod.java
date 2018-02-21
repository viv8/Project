package com.turbopass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class DictionaryMod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, ArrayList<String>> dictionary = new TreeMap<String, ArrayList<String>>();
		// DictDTO ref=new DictDTO();
		while (true) {
			System.out.println("PLEASE ENTER THE CHOICE FOR DICTIONARY");
			System.out.println("ENTER 1 FOR INSERTION IN DICTIONARY");
			System.out.println("ENTER 2 FOR UPDATION IN DICTIONARY ");
			System.out.println("ENTER 3 FOR DELETION  IN IT");
			System.out.println("ENTER 4 FOR SEARCH IN IT ");
			System.out.println("ENTER 5 FOR EXIT FROM IT ");
			int choice = sc.nextInt();
			String word;
			ArrayList<String> meanings;
			switch (choice) {
			case 1:
				while (true) {
					System.out.println("\"enter the word\"");
					// ref.setName(sc.next());
					word = sc.next();
					meanings = meanEntry();
					// ref.setWords(words);
					// dictionary=new InsertionSection().InsertPair(ref);

					dictionary.putIfAbsent(word, meanings);
					System.out.println("want to enter more words Yes or No");
					if (sc.next().equalsIgnoreCase("no")) {
						break;
					}
				}
				break;
			case 2:
				System.out.println("enter the word to delete");
				String keyUpdate = sc.next();
				System.out.println("dictioray elemets before deletion are");
				showResult(dictionary);
				meanings=meanEntry();
				dictionary.replace(keyUpdate,meanings);
				System.out.println("Updated dictioray elemets are");
				showResult(dictionary);
				break;
			case 3:
				System.out.println("enter the word to delete");
				String keyDelete = sc.next();
				System.out.println("dictioray elemets before deletion are");
				showResult(dictionary);
				dictionary.remove(keyDelete);
				System.out.println("Updated dictioray elemets are");
				showResult(dictionary);
				break;
			case 4:
				System.out.println("\"enter 1 to search all words and \n2 to search meanings by particular world \"");
				switch (sc.nextInt()) {
				case 1:
					showResult(dictionary);
					break;
				case 2:
					Set<String> dict = dictionary.keySet();
					System.out.println("enter the word to search meanings");
					String keySearch = sc.next();
					System.out.println("values for key " + keySearch + " are:");
					ArrayList<String> ar = dictionary.get(keySearch);
					int count = 0;
					for (String string : ar) {
						++count;
						System.out.println("meaning " + count + ":" + string);
					}
					break;
				default:
					System.err.println("Invalid Choice For Search");
					break;
				}

				break;
			case 5:
				sc.close();
				Runtime.getRuntime().exit(0);
				break;
			default:
				System.err.println("Invalid Choice/n Please Try again");
				break;
			}
		}
	}

	private static ArrayList<String> meanEntry() {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> meanings = new ArrayList<String>();
		while (true) {
			System.out.println("\"enter the meaning\"");
			sc.nextLine();
			meanings.add(sc.nextLine());

			// words.add("nice");
			System.out.println("want to enter more meanings Yes or No");
			if (sc.next().equalsIgnoreCase("no")) {
				break;
			}
		}
		return meanings;
	}

	private static void showResult(TreeMap<String, ArrayList<String>> dictionary) {
		Set<String> dic = dictionary.keySet();
		for (String key : dic) {
			System.out.println("values for key " + key + " are:");
			ArrayList<String> ar = dictionary.get(key);
			int count = 0;
			for (String string : ar) {
				++count;
				System.out.println("meaning " + count + ":" + string);
			}
		}
		
	}
}
