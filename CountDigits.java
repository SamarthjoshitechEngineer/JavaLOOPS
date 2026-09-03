import java.util.Scanner;
public class CountDigits {
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number");
int n=sc.nextInt();
int count=0, r;
while(n!=0){
    r=n%10;
    n=n/10;
    count++;
}
System.out.println("The number of digits is: " + count);
    }
}



