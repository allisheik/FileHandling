package fileHandling;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadingFileUsing3Methods {
	
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("D:\\FSD\\Files\\NewFile1.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}
	
	public static  void readFileFileInputStream() throws IOException
	{
		
		FileInputStream stream= new FileInputStream("D:\\FSD\\Files\\NewFile2.txt");
		int data;
		
		while((data=stream.read())!=-1){
			
			System.out.print((char)data);
		}
		
	}
	
	public static void readDataUsingNIO()  throws IOException
	{
		List<String> list=Collections.emptyList();
		Path path=  Paths.get("D:\\FSD\\Files\\NewFile3.txt");
		list= Files.readAllLines(path,StandardCharsets.UTF_8);
		
		Iterator<String> it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void main(String[] args) {
		
		
		try {
			readFileReaderClass();
			readFileFileInputStream();
			readDataUsingNIO();
		} catch (IOException e) {
			System.out.println("File not available");
		}
	}

}