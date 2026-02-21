package JAVA;
import java.util.Scanner;

public class linearsearch {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no of elements: ");
         int n = sc.nextInt();
         int[] arr = new int[n];
         System.out.println("Enter the elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }
         
         System.out.print("search element: ");
         int key = sc.nextInt();

         boolean found = false;
         for (int i = 0; i < n; i++) {
             if (arr[i] == key) {
                 System.out.println(i);  
                 found = true;
             }
         }
         if (!found) {
             System.out.println("Element not found in the array.");
         }

         sc.close();
     }
 }
