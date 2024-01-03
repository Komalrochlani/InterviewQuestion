package com.code;

import java.util.Arrays;
import java.util.Stack;

public class BinaryNumber {

	public static void main(String[] args) {
        int num = 5;
        int[] arr = {1,3,4,5,5};
        String[] binary = new String[arr.length];
        Stack<Integer> stack = new Stack<>();
        while(num >= 1)
        {
            int out = num % 2;
            stack.push(out);
            num /= 2;
        }
        while(!stack.isEmpty()) {
        	System.out.print(stack.pop());
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
        	binary[i] = Integer.toBinaryString(arr[i]);
        }
        System.out.println(Arrays.toString(binary));
    }
}
