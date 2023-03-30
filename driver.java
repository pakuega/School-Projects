import java.io.*;
import java.util.*;
public class driver 
{

	  public static void main(String[] args) throws IOException
	  {
	        int [] listNumber = {13,29,3,56,12,44,57,23,17,25};
	        FileWriter File = new FileWriter("listnumber.txt");
	        
	        //read and write the array of numbers
	        for (int i = 0; i < listNumber.length; i++)
	        {   
	        	File.write("Numbers ");
	            File.write(i +" = "+ listNumber[i]+"\n");
	        }

	        //close the file
	        File.close();
	  }

}
