package javalab.ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) {
		int a = 2;
		int b = 0;
		int c = 0;
		
		
		
		
		try {
			c = a / b;
			System.out.println(c);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("An error occurred during the operation");
		}
		
		System.out.println("Operation completed");
		
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a.txt");
			// When dividing by data in a file

		
		//When using multiple catch statements, 
		//they are applied in order from the smallest to the largest range.
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("An error occurred during the operation");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				}
				catch(IOException e){
					System.out.println(e);
				}
			}
			
		}
		
		
		
		
		
		// try with resource
		
		try (
				FileInputStream fis1 = new FileInputStream("a.txt");
				){
			
		}
		
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("An error occurred during the operation");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
	}

}
