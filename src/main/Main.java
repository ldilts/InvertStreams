package main;

import java.io.IOException;
import java.util.Scanner;
import java.io.InputStream;

import invertInput.InvertInputStream;
import invertOutput.InvertOutputStream;

public class Main {
	
	static Scanner scanner;

	public static void main(String[] args) {
		
		String text = "Hello World";
		
		// Inverted Output
		byte[] outputData = text.getBytes();
		
		InvertOutputStream invertOutputStream = new InvertOutputStream(System.out);
		
		System.out.println("Let's begin!\n");
		
		try {
			invertOutputStream.write(outputData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		try {
			invertOutputStream.write(outputData, 2, 3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\n");
		
		try {
			invertOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Inverted Input
		
		InputStream inputStream = System.in;
		scanner = new Scanner(inputStream);
		
		InvertInputStream invertInputStream = new InvertInputStream(inputStream);
		
		System.out.println("Type an input:\n");
		String input = scanner.nextLine();
		
		byte[] inputData = input.getBytes();
		
		try {
			invertInputStream.read(inputData);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			invertInputStream.read(inputData, 2, 3);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			invertInputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
