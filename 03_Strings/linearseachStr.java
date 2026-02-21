package JAVA;

public class linearseachStr {
		    static void linearSearch(String[] arr, String key) {
		        boolean found = false;

		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i].equalsIgnoreCase(key)) {
		                System.out.println("Found at index: " + i);
		                found = true;
		            }
		        }

		        if (!found) {
		            System.out.println("Not found");
		        }
		    }

		    public static void main(String[] args) {
		        String[] names = {"Hari", "Sanj", "Sri", "suj", "Sanj", "Kir"};
		        String key = "Sanj";

		        linearSearch(names, key);
		    }
		}