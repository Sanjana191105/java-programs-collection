package JAVA;

public class linearsearchmethod {
	
		    static void linearSearch(int[] arr, int key) {
		        boolean found = false;
		        System.out.println("Searching for: " + key);
		        System.out.println("Element found at positions (index values):");

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == key) {
		                System.out.println(i);
		                found = true;
		            }
		        }

		        if (!found) {
		            System.out.println("Element not found in the array.");
		        }
		    }
		    public static void main(String[] args) {
		        int[] arr = {2, 4, 7, 4, 9, 4}; 
		        int key = 4; 

		        System.out.println("Array elements:");
		        for (int x : arr) {
		            System.out.print(x + " ");
		        }
		        System.out.println();

		        
		        linearSearch(arr, key);
		    }
		}