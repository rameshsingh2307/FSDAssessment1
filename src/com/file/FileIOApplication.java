package com.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileIOApplication {

	public static void main(String[] args) {

		System.out.println("********************************************************************************");		
		System.out.println("***Application name : LockedMe.com");
		System.out.println("***Developer Details : Ramesh Singh");		
		System.out.println("********************************************************************************");
		System.out.println("");
		System.out.println("");
		CreateFileApp fileCreate = new CreateFileApp();
		CurrentFiles currentFiles = new CurrentFiles();
		String filePath = null;
		String fileName = null;

		

		String choice = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String choice1 = null;		
		do
		{
			
			System.out.println("********************************************************************************");
			System.out.println("***Please select operations with file");
			System.out.println("***Press '1' -> Retrieving the file names from folder");
			System.out.println("***Press '2' -> Business-level operations(like create file, delete file, search file)");
			System.out.println("***Press '9' -> Close the application");
			System.out.println("********************************************************************************");			
			try {			
				choice = in.readLine();				
			}catch (NullPointerException e) {
				System.out.println("You didn't select any operation!");
			} catch (IOException e) {
				
			}
			
			if (choice.equals("9"))
			{
				System.out.println("********************************************************************************");
				System.out.println("Application is closed now!");
				System.out.println("********************************************************************************");
				System.exit(0);
			}
				
			
			switch (choice) 
			{
				case "1":				
					System.out.println("Enter the path from where you want retrieves files");
		
					try {
						filePath = in.readLine();
					}catch(NullPointerException e)
					{
						System.out.println("You didn't enter the directory path!");
					}catch (IOException e) {
						e.printStackTrace();
					}
					currentFiles.currentFileList(filePath);
					break;
				case "2":												
					do
					{
						System.out.println("");
						System.out.println("********************************************************************************");
						System.out.println("Press '1' -> To add file to the application");
						System.out.println("Press '2' -> To delete file from the application");
						System.out.println("Press '3' -> To search file from the application");
						System.out.println("Press '4' -> Return to the main context");
						System.out.println("********************************************************************************");
						
						try {
							//in.readLine();
							choice1 = in.readLine();							
						} catch (NullPointerException e) {
							System.out.println("You didn't select any operation!");
						} catch (IOException e) {
			
						}
						
						if (choice1.equals("4"))
							break;
						
						Scanner pathnameIn = new Scanner(System.in);
						System.out.println("Enter the location of folder:");
							
						filePath = pathnameIn.nextLine();
						
		
						System.out.println("Enter the file name:");
						Scanner fileNameIn = new Scanner(System.in);
						
						fileName = fileNameIn.nextLine();
						
						switch (choice1) 
						{
							case "1":						
								fileCreate.FileCreate(filePath, fileName);
								break;		
							case "2":
								DeleteFile delFile = new DeleteFile();
								delFile.deleteFile(filePath,fileName);
								break;
							case "3":
								SearchFile searchFile = new SearchFile();
								searchFile.searchFile(filePath,fileName);
								break;
							default:
								System.out.println("You didn't choose correct option from listed options!");
						}
					}while(true);									
				break;	
				default:
					System.out.println("You didn't choose correct option from listed options!");
			}
		}	while(true);
		
		
		
}
}
