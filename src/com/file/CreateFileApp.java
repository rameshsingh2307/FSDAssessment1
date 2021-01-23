package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileApp {
	public void FileCreate(String path, String fileName)
	{				
		File file = null; 			
		try {
			
			file = new File(path+"\\"+fileName);
			
			if (file.createNewFile())
			{								
				System.out.println("File successfully added!");
			}
			else
			{
				System.out.println("File already exist in given path, please give another name to file!");
			}			
		}
		catch (IOException e)
		{		
			System.out.println("Entered path is not correct!");
			//e.printStackTrace();
		}
	}
}
