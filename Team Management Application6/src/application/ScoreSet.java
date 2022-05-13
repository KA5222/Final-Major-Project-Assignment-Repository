package application;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ScoreSet {
	 java.io.File file = new java.io.File("TeamList.txt");
	 
	 Scanner input = null;{
	 try {
 		input = new Scanner(file);
 	} catch (FileNotFoundException e1) {
 		// TODO Auto-generated catch block
 		e1.printStackTrace();
 	
	 
	 Set<Integer> set = new HashSet<Integer>(); // initializes new set
 	
 	//writes score from team list onto set
	 while (input.hasNext()) {
     	String name = input.next();
     	String str = input.next();  // sets score from team list text file to str          	            	            	            	
     	int score = Integer.parseInt(str); //converts score form string to integer
     	set.add(score); // adds score to set
     	
     		}	
 	
 	input.close();
 	
 	System.out.println(set);
 		
 		}
	 }
}
