public class even_odd_sort {
	    public static void main(String[] args) {
	        int[] arr = {5, 8, 11, 6, 2, 1, 7};

	        int oddCount = 0, evenCount = 0;
	        for (int num : arr) {
	            if (num % 2 == 0) evenCount++;
	            else oddCount++;
	        }

	        int[] odd = new int[oddCount];
	        int[] even = new int[evenCount];
	        int o = 0, e = 0;

	        for (int num : arr) {
	            if (num % 2 == 0) even[e++] = num;
	            else odd[o++] = num;
	        }

	        for (int i = 0; i < odd.length - 1; i++) {
	            for (int j = 0; j < odd.length - i - 1; j++) {
	                if (odd[j] > odd[j + 1]) {
	                    int temp = odd[j];
	                    odd[j] = odd[j + 1];
	                    odd[j + 1] = temp;
	                }
	            }
	        }
	        for (int i = 0; i < even.length - 1; i++) {
	            for (int j = 0; j < even.length - i - 1; j++) {
	                if (even[j] < even[j + 1]) {
	                    int temp = even[j];
	                    even[j] = even[j + 1];
	                    even[j + 1] = temp;
	                }
	            }
	        }

	        for (int i = 0; i < odd.length; i++) {
	            System.out.print(odd[i] + " ");
	        }
	        for (int i = 0; i < even.length; i++) {
	            System.out.print(even[i] + " ");
	        }
	   }
}