package aaaaaa;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws IOException {
		//input variable
		Scanner scn = null;
		// file writer
		PrintWriter out=null;
		try {
			// initializing file reader and file writer
			scn = new Scanner(new File("logs.csv"));
			
			try {
				 out = new PrintWriter("abc.csv");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		// taking first line input;
		
// splitting first line into small parts upon finding comma between them
		// deleting browser ver 
		String [] list;
		String s1="";
	while(scn.hasNextLine()){
		//taking a row
		String  s = scn.nextLine();
		// splitting each line into small parts upon finding comma between them
		 list = s.split(",");
		// initialize a string that will hold the resulting row after deleting 2 columns
 
//for eachh column of input row
for(int i=0;i<21;i++){
	//skip browser id and browser ver column
if(i==0 || i==1 || i==9 || i==14 || i==15 || i==17 || i==18|| i==19 )//continue;
// putting other columns to output
	s1=s1+list[i]+",";
}
// writing to file writer
			s1+="\n";
	

	}
	out.println(s1);
	out.close();
	}
}
