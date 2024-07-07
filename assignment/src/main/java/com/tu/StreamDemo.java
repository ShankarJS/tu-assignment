package com.tu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNum = Arrays.asList(3, 4, 5, 6, 7);
		List<Integer> squares = listNum.stream().map(a -> a*a).collect(Collectors.toList());
		System.out.println("Squares: "+squares);
		
		List<Integer> evenSquares = listNum.stream().filter(e->e%2==0).map(a-> a*a).collect(Collectors.toList());
		System.out.println("Squares of evens: "+evenSquares);
		
		try (Scanner scanner = new Scanner(new File("test.txt"))) {
		    while (scanner.hasNext()) {
		        System.out.println(scanner.nextLine());
		    }
		} catch (FileNotFoundException fnfe) {
		    fnfe.printStackTrace();
		} 
	}

}
