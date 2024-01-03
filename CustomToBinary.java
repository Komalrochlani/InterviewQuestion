package com.code;

import java.util.Arrays;

public class CustomToBinary {

	public static void main(String[] args) {
		int[] arr = {10,14,5,6,35};
		String[] binary = new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			binary[i] = decimalToBinary(arr[i]);
		}
		System.out.println(Arrays.toString(binary));
	}
	
	public static String decimalToBinary(int num)
	{
		StringBuilder str = new StringBuilder();
		while(num > 0)
		{
			str.insert(0, num%2);
			num /= 2;
		}
		return str.toString();
	}
}
