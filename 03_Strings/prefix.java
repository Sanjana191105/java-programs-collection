package basic_problems;

public class prefix {

	public static void main(String[] args) {
		String arr[]= {"flower","flight","flow"};
		String res=longestcommonprefix(arr);
		System.out.println(res);
	
	}
	private static String longestcommonprefix(String[] arr) {
		if(arr==null || arr.length==0) {
			return "";
		}
		String prefix=arr[0];
		for(int i=1;i<arr.length;i++) {
			while(arr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix.isEmpty())
                    return "";
			}
		}
		return prefix;
	}

}
