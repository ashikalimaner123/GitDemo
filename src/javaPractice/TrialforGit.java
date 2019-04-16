package javaPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class TrialforGit {

	public static void main(String[] args) throws IOException {
		
	FileReader fr=new FileReader(new File("C:\\Users\\Shivam\\Desktop\\NthHighestSalary.txt"));
	BufferedReader br=new BufferedReader(fr);
	String a;
	while((a=br.readLine())!=null)
	{
		System.out.println(a);
	}
	
		
	}

	
}
