import java.util.*;
public class funthree{
    public static void printHelloWorld(){
        System.out.println("Hello world");
    }
    public static int CalculcateSum(int num1,int num2){
        int sum=num1+num2;
        return sum;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = CalculcateSum(a,b);
        System.out.println("sum is :"+sum);
       
    }
}