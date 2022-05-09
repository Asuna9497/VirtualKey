package com.LockedMe;

public class Welcome {

	public static void showWelcomeMessage() {
		System.out.println("*********************** WELCOME to Lockedme.com ***********************");
		System.out.println("");
		System.out.println("           APPLICATION NAME: Virtual Key Repository");
		System.out.println("");

		System.out.println("*************************** DEVELOPER DETAILS ********************************");
		System.out.println("");
		System.out.println(" * Name: Priyanka Shinde");
		System.out.println(" * Designation: Software Developer");
		System.out.println(" * Date: 05-05-2022");
		System.out.println("");
		System.out.println("*********************************************************************");

	}

	public static void displayMainSelectionOptions() {
		System.out.println("\n You can select below options");
		System.out.println("");

		String[] arr = { "1. I wish to get file names in ascending order",
				"2. I wish to perform Business Level Operation", "3. Close the application" };
		int[] arr1 = { 1, 2, 3 };
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
	}
	
	public static void displayBussinessOperationOptions() {
		System.out.println("");
		System.out.println("You can select below options");
		System.out.println("");

		String[] arr = { "1. I wish to add a file to the existing directory list",
				"2. I wish to delete a file from the existing directory list", 
				"3. I wish to search a file from the main directory",
				"4. Back to the main context" };
		int[] arr1 = { 1, 2, 3, 4};
		int slen = arr1.length;
		for (int i = 0; i < slen; i++) {
			System.out.println(arr[i]);
			// display the all the Strings mentioned in the String array
		}
	}
	
}
