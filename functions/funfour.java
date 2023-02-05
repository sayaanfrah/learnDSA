import java.util.*;
public class funfour{
    public static void printHelloworld(){
        System.out.println("Hello world");
        return;
    }
    public static int CalculateSum(int a,int b){
        int sum=a+b;
        return 3;
    }
    public static int myMultiplication(int a,int b){
        
        int prod=a*b;
        return prod;
    }
    public static int Addition(int a,int b){
        int sum=a+b;
        return 10;
    }
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;

        }return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int product=myMultiplication(a,b);
        System.out.println("The product of a and b is : "+ product);
        
        System.out.println(factorial(5));
    }
}