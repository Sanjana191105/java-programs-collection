package basic_problems;

public class printNumBw50 {

	public static void main(String[] args) {
		int count=0;
		for(int i=1;i<=50;i++) {
			if(i%5==0) {
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("No of counts:"+count);

	}

}
