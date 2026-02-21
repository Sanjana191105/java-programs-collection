package JAVA;
import java.util.Scanner;
public class stringMethods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println("string length: "+str1.length());
		System.out.println("character index: "+str1.charAt(1));
		System.out.println("sub String : "+str1.substring(1,4));
		System.out.println("string equal: "+str1.equals(str2));
		System.out.println("equal ingnore: "+str1.equalsIgnoreCase(str2));
		System.out.println("string lowercase: "+str1.toLowerCase());
		System.out.println("string Uppercase: "+str1.toUpperCase());
		System.out.println("Trim: "+str1.trim());
		System.out.println("string replace: " + str1.replace('e', 'a'));
		System.out.println("string replaceall: "+str1.replaceAll("[^a-z\\s]",""));
		System.out.println("string endswith: "+str1.endsWith(str2));
		System.out.println("string indexOf: "+str1.indexOf(str1));
		System.out.println("string split: "+str1.split("\\s+"));
		System.out.println(str1.endsWith("World"));   
	    System.out.println(str1.indexOf("o"));         
	    System.out.println(str1.lastIndexOf("o"));  
	    System.out.println(str1.isEmpty());             
	    System.out.println(str1.concat(" Java"));   
	    System.out.println(str1.toCharArray()[0]);    
	    System.out.println(String.valueOf(123));       
	    System.out.println("abc".compareTo("abd"));
	    System.out.println(str2.contains("World"));     
	    System.out.println(str1.startsWith("Hello"));   
	}

}
