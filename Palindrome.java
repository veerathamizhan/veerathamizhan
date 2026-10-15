import java.util.*;
public class Palindrome{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number");
int n=scan.nextInt();
int reverse=0;
for(int i=n;i>0;i/=10){
reverse=reverse*10;
reverse+=i%10;}
if(reverse==n){
System.out.println("True");
}
else{
System.out.println("False");
}
}
}

