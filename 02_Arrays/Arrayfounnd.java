package basic_problems;
import java.util.*;

public class Arrayfounnd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int maxMul = 0;
        int x = 0, y = 0;
        boolean found = false;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(a[i] + a[j] == 18){
                    int mul = a[i] * a[j];

                    if(mul > maxMul){
                        maxMul = mul;
                        x = a[i];
                        y = a[j];
                        found = true;
                    }
                }
            }
        }

        if(found){
  
            System.out.println(y + " " + x);
        }
        else{
            System.out.println("No pair with sum 18");
        }

        sc.close();
    }
}