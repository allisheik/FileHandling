package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateAndWriteMethod2 {
		
		public static void createFileUsingOutputStream()  throws IOException
		{
			FileOutputStream out= new FileOutputStream("D:\\FSD\\Files\\NewFile2.txt");
			String input="Welcome to OutputStream";
			byte array[]=  input.getBytes();
			out.write(array);
			System.out.println("Data Written Successfully");
			out.close();
		}
		
		
		public static void main(String[] args) {
			try {
				 createFileUsingOutputStream();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
