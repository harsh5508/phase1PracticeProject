package phase1programs;
import java.util.*;
 
public class ValidationOfEmail {
  public static void main(String[] args) {
	  
  
  List<String> list_Strings = new ArrayList<String>();
  list_Strings.add("akverma@gmail.com");
  list_Strings.add("mayursoni00@gmail.com");
  list_Strings.add("shashanksinha114@gmail.com");
  list_Strings.add("abhishekshukla908@gmail.com");
  list_Strings.add("abhijeetsingh675@gmail.com");
    
  
  String searchElement = null;
  System.out.println("Enter the email to search");
  Scanner sc = new Scanner(System.in);
  searchElement = sc.nextLine();
  
    if (list_Strings.contains(searchElement)) {
    
    	System.out.println("Email validation successfull.");
    } else {
     
    	System.out.println("There is no such Email.");
    }
 }
}