package phase1programs_2;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.*;

public class FileHandling {
	
	public static List<String> readFileInList(String fileName) 
	  { 
	  
	    List<String> lines = Collections.emptyList(); 
	    try
	    { 
	      lines = 
	       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
	    } 
	  
	    catch (IOException e) 
	    { 
	      e.printStackTrace(); 
	    } 
	    return lines; 
	  } 

	public static void main(String[] args) 
	  { //read
	    List l = readFileInList("d://P7//ReadWriteAppend.txt"); 
	  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	    
	    //write
	    try {
            FileWriter Writer  = new FileWriter("d://P7//ReadWriteAppend.txt");
            Writer.write("This text is written after execution of the program.");
            Writer.close();
            System.out.println("Successfully written. - This text is written after execution of the program.");
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
	    
	    //append
	    try(FileWriter fw = new FileWriter("d://P7//ReadWriteAppend.txt", true);
	    	    BufferedWriter bw = new BufferedWriter(fw);
	    	    PrintWriter out = new PrintWriter(bw))
	    	{
	    	    out.println("This Text is appended.");
	    	    System.out.println("Successfully appended. - This Text is appended.");
	    	    
	    	} catch (IOException e) {
	    		System.out.println("An error has occurred.");
	            e.printStackTrace();
	    	}
	  } 
	}