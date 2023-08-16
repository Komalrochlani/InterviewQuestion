package com.code.string;

import java.util.HashMap;
import java.util.Scanner;

/*
 * i/p = "I Love India"
 * o/p = i -3
 * 		l-1
 * 		o-1
 * */
public class CharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s = "honestyisbessstpolicy";//sc.nextLine();
		char[] ch = s.toCharArray();
		int len = ch.length;
		int count = 0;
		HashMap<Character, Integer> distinctChar = new HashMap<Character, Integer>();
		/*
		 * for(char keyD : ch) { distinctChar.put(keyD, 0); }
		 * System.err.println(distinctChar);
		 */
		for(Character keyD : ch) {
			if(distinctChar.containsKey(keyD)) {
				int a = distinctChar.get(keyD);
				distinctChar.put(keyD, ++a);
			}else {
				distinctChar.put(keyD, 1);
			}
		}
		System.out.println(distinctChar);
		
		
		
		
		
		//		for (int i = 0; i < len; i++) {
//			distinctChar.keySet();
//			System.out.println(distinctChar.keySet());
//			for(int j=0;j<len;j++) {
//				if(s.valueOf(j).contains(s.valueOf(i)))
//				{
//					distinctChar.put(s.valueOf(j),distinctChar.get(s.valueOf(j)) +1);
//				}
//			}
//			System.out.println(distinctChar.keySet() + " : " + distinctChar.values());
//
//		}

	}
}
/*
 * for (int j = 1; j < len; j++) { if (ch[i] == ch[j]) { count++; } }
 */