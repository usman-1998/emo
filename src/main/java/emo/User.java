package emo;

import java.io.PrintStream;
import java.util.Scanner;
class MyException extends ArithmeticException{
	MyException(){
	}
	MyException(String message){
//	super(message);	
		System.out.println(message);
	}
}
public class User{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();
		System.out.println("Enter you choice");
		int age = sc.nextInt();
		if(age<18){
		
			throw new MyException("Age is not matching critaria");
			
		}else{
			System.out.println("Age is matching critaria");
		}
	}
}
