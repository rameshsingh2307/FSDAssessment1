package com.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class CurrentFiles {
	ArrayList<String> fileNames = new ArrayList<String>();
	public void currentFileList(String path)
	{
		
		File file = new File(path);
		if (file.exists())
		{
			File [] files = file.listFiles();
			if (files.length>0)
			{
				ArrayList<String> fileNames = retrievFileName(file,files);
				Collections.sort(fileNames,String.CASE_INSENSITIVE_ORDER);
				for(String str:fileNames)
				{
					System.out.println(str);
				}
			}
			else
			{
				System.out.println("There is no files in provided path!");
			}
		}
		else
		{
			System.out.println("Entered path is not correct!");
		}
		
	}
	
	public ArrayList<String> retrievFileName(File file, File [] files)
	{				
		for(File fle:files)
		{
			if(fle.isDirectory())
			{				 
				File [] files1 = fle.listFiles();
				retrievFileName(file, files1);			
			}
			else
			{
				if(!fle.getName().isEmpty())
				{
					fileNames.add(fle.getName());				
				}
			}
		}
		return fileNames;
	}
}
