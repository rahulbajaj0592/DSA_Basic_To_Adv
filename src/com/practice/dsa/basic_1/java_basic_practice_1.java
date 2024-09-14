package com.practice.dsa.basic_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class java_basic_practice_1 {
	
	public static void main(String arg[]) throws IOException {
		
		//--------------------------------------//
		/*
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(str);
		*/
		//--------------------------------------//

		//--------------- Buffered Reader Gives more Control as well handling. It can handle network stream and files better ----------------------//
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		//int i = br.read();
		//System.out.println((char)i);
		
		String str = br.readLine();
		System.out.println(str);
		
		//-------------------------------------//
	}
	
}
