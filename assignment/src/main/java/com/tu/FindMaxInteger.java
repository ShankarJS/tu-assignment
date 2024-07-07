package com.tu;

public class FindMaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMax(int arr[]) {
		int max = 0;
//		int max = arr[0];
		
		for(int i =1; i<arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}

}
