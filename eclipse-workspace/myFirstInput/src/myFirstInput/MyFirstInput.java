package myFirstInput;
import java.util.Scanner;


public class MyFirstInput {
	 public static void MyFirstInput(String[] args) {
		  
		 Scanner console = new Scanner(System.in);
		  System.out.println("Enter your name ");
		  String name = console.next();
		  
		  System.out.println("My name is " + name);
		  
	 }
	}