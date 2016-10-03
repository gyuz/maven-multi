package exercise2.model;

import java.io.*;

public class FileData{
	private static File filePath;
	
	public FileData(String filePath){
		this.filePath = new File(filePath);
	}
	
	public void setFilePath(String filePath){
		this.filePath = new File(filePath);	
	}
	
	public File getFilePath(){
		return filePath;	
	}
}


