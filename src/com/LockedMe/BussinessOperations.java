package com.LockedMe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BussinessOperations {

	private static final int ADD = 1;
	private static final int DELETE = 2;
	private static final int SEARCH = 3;
	private static final int BACK = 4;

	public static void performBussinessOperations(int opr, Scanner sc) {

		switch (opr) {
		case ADD:
			creatNewFile(sc);
			break;
			
		case DELETE:
			deleteExistingFile(sc);
			break;
			
		case SEARCH:
			searchFile(sc);
			break;
			
		case BACK:
			MainOperations.performOperations(sc);
			break;

		default:
			System.out.println("kindly provide correct options");
			break;
		}

	}
	
	private static void searchFile(Scanner sc) {
		String fileName = UserInputs.getFileNameFromUser(sc);
		List<String> results = getFilesInRepo();
		String result = "File not found in repository!";
		for (String item : results) {
			if(item.equalsIgnoreCase(fileName)) {			
				result ="file found in directory!";
				break;
			}
		}
		
		System.out.println(result);
	}

	public static List<String> getFilesInRepo() {
		List<String> results = new ArrayList<String>();
		String dir = "C:\\FSDcourse\\workspace\\VirtualKey\\src\\com\\LockedMe\\Files\\NewFiles";
		
		//If this pathname does not denote a directory, then listFiles() returns null. 
		File[] files = new File(dir).listFiles();

		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		return results;
	}

	private static void deleteExistingFile(Scanner sc) {
		String fileName = UserInputs.getFileNameFromUser(sc);
		
		Path file = Paths.get("C:\\FSDcourse\\workspace\\VirtualKey\\src\\com\\LockedMe\\Files\\NewFiles\\" + fileName + ".txt");
	
		try {
			if(Files.deleteIfExists(file)) {
				System.out.println("file deleted successfully ");
			}else {
				System.out.println("Unable to delete a file");

			}
		} catch (IOException e) {
			System.out.println(" Exception occurred...! Unable to delete a file ");
			e.printStackTrace();
		}
	}

	private static void creatNewFile(Scanner sc) {
		String fileName = UserInputs.getFileNameFromUser(sc);
		File file = new File("C:\\FSDcourse\\workspace\\VirtualKey\\src\\com\\LockedMe\\Files\\NewFiles\\" + fileName + ".txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created successfully\n");
			} else {
				System.out.println("Existing file\n");
			}
		} catch (IOException e) {
			System.out.println("Failed to create new file\n");
			e.printStackTrace();
		}

	}

}
