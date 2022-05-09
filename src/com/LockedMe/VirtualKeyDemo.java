package com.LockedMe;

import java.util.Scanner;

public class VirtualKeyDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Welcome.showWelcomeMessage();
		
		MainOperations.performOperations(sc);

	}

}
