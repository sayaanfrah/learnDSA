import java.util.*;
public class prange {
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                
                isPrime=false;
                break;   //reuturn isPrime;
            }
        }
        return isPrime;
    }
    public static void PrimesinRange(int n){
     for(int i=2;i<=n;i++){
        if (isPrime(i)){//true
            System.out.print(i+" ");

        }
     }   
    }
    public static void main(String[] args) {
        PrimesinRange(500);
    }
    
}
