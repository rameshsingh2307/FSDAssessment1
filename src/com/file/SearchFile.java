package com.file;

import java.io.File;
import java.util.ArrayList;

public class SearchFile {
	ArrayList<String> fileNames = new ArrayList<String>(); 
	public void searchFile(String pathName, String fileName)
	{		
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
					System.out.println(fileName+" file found!");
				}
				else
				{
					System.out.println(fileName+" file not found!");
				}
			}
		}
		else
		{
			System.out.println("Entered path is not correct!");
		}
	}
}
