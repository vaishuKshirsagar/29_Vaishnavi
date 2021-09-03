/**
 * 
 */
package file_IO;
import java.io.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Vaishnavi
 *
 */
public class JPR31 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we are creating a new text file over here
		try {
			File f1=new File("C:\\Users\\Madhav\\javaassignments\\src\\file_IO\\newfile.txt");

			boolean f=f1.createNewFile();
			if(f) {

				System.out.println("Your File has been created successfully...");
			}
			else {
				System.out.println("File already exist...");

			}


		}
		catch(IOException e)
		{

			System.out.println("Exception Occured :");
			e.printStackTrace();

		}
		
		
		// we are writing in the file here
		
		String mycontent="\n \nEnjoy learning Java programming language ";
		FileOutputStream fops=null;
		File f1;
		
		
		
		try
		{

		    f1 = new File("C:\\Users\\Madhav\\javaassignments\\src\\file_IO\\newfile.txt");
			fops=new FileOutputStream(f1);
			
			if(!f1.exists())
			{
				f1.createNewFile();
			}
			
			
			byte [] bytesArr=mycontent.getBytes();
			fops.write(bytesArr);
			fops.flush();
			System.out.println("Your File has been Written successfully...");
	   
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
	
	
		// we are reading the file over here
		
	    f1 =new File("C:\\Users\\Madhav\\javaassignments\\src\\file_IO\\newfile.txt ");
		BufferedInputStream bips=null;
		FileInputStream fips=null;

		try
		{

			fips=new FileInputStream(f1);

			bips=new BufferedInputStream(fips);

			while(bips.available()>0)
			{
				System.out.println((char)bips.read());
			}


		}

		catch(FileNotFoundException fnfe)
		{
			System.out.println("FileNotFoundException has Occured... :");
			fnfe.printStackTrace();
		}
		catch(IOException ioe)
		{
			System.out.println("IOException Occured.. :");
			ioe.printStackTrace();
		}

	
		// we are appending over here in file
		try {
			String content="\n \n Think out of the box";

			f1=new File("C:\\Users\\Madhav\\javaassignments\\src\\file_IO\\newfile.txt");

			if(!f1.exists()) {

				f1.createNewFile();

			}

			FileWriter fwt= new FileWriter(f1,true);

			BufferedWriter bwt=new BufferedWriter(fwt);
			bwt.write(content);
			bwt.close();

			System.out.println("Data has been successfully appended...");

			}//end try

	catch(IOException ie)	
			{
		ie.printStackTrace();

			}//end catch
	
	}//end main
	
} // end class

/* Output:
 * Your File has been created successfully...
 * Your File has been Written successfully...
E
n
j
o
y
 
l
e
a
r
n
i
n
g
 
J
a
v
a
 
p
r
o
g
r
a
m
m
i
n
g
 
l
a
n
g
u
a
g
e
 
Data has been successfully appended...
 * 
 * 
 * 
 * */


