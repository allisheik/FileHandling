package fileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteFileMethod1 {
		
		public static void createFileUsingFileClass() throws IOException
		{
			//create file
			File file= new File("D:\\FSD\\Files\\NewFile1.txt");
			
			if(file.createNewFile()) {
				System.out.println("File is Created Successfully" );
			}
			else {
				System.out.println("File  is already Exist");
			}
			
			//write data to that file
			//appends File
			FileWriter  writer= new  FileWriter(file,true);
			writer.write("Welcome Everyone ");
			writer.close();
			
			
		}
		
		
		
		public static void main(String[] args) {
			try {
				 createFileUsingFileClass();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
