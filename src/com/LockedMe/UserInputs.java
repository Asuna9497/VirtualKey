package com.LockedMe;

import java.util.Scanner;

public class UserInputs {
	
	public static int getMainOperationSelection(Scanner sc) {
		System.out.println("enter any of above option");
		return sc.nextInt();
		
	}	
	public static int getBussinessOperationSelection(Scanner sc) {
		System.out.println("enter any of above bussiness operation you want to perform");
		return sc.nextInt();		
	}
	
	public static String getFileNameFromUser(Scanner sc) {
		System.out.println("Enter file name to perform file operations: ");
		return sc.next();
	}
}
