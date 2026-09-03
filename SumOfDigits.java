import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number");
int n=sc.nextInt();
int sum=0, r;
while(n!=0){
    r=n%10;
    n=n/10;
    sum=sum+r;
}
System.out.println("The sum of digits is: " + sum);
    }
}
