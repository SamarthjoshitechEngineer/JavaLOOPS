import java.util.Scanner;
public class Fibonacci {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the term to find its fibonacci");
int n=sc.nextInt();
int a=1,b=1,sum=0;
for(int i=1;i<=n-2;i++){
    sum=a+b;
    a=b;
    b=sum;
}
System.out.println("The " + n + "th Fibonacci number is: " + sum);

 }
    }
