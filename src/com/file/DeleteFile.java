package com.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DeleteFile {
	ArrayList<String> fileNames = new ArrayList<String>();
	public void deleteFile(String pathName, String fileName)
	{
		Path path = Paths.get(pathName+"\\"+fileName);		
		
		File file = new File(pathName);
		if(file.exists())
		{
			File [] files = file.listFiles();		
			if (files.length>0)
			{
				for(File file1:files)
				{
					fileNames.add(file1.getName());
				}	
				if (fileNames.contains(fileName))
				{
					try {						
						Files.delete(path);
						System.out.println("File deleted successfully..");
					}
					catch (IOException e)
					{		
						System.out.println("Entered path or file name is incorrect, please cross check!");					
					}				
				}
				else
				{
					System.out.println("File not found!");
				}			
			}
		}
		else
		{
			System.out.println("Entered path is not correct!");
		}
	}
}
