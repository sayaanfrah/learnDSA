import java.time.chrono.IsoEra;
import java.util.*;
public class practice{
    public static boolean isPrime(int n){
        boolean isPrime=true;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }return isPrime;
    }
    public static void PrimesinRange(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
        PrimesinRange(2);
    }
}