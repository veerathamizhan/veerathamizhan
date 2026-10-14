import java.util.*;
public class Conditional{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the 1st Number");
int a=scan.nextInt();
System.out.println("Enter the 2nd Number");
int b=scan.nextInt();
System.out.println("Enter the 3rd Number");
int c=scan.nextInt();
if(a>b && a>c) {
System.out.println("Greater Number is: "+a);}
else if(b>a && b>c){
System.out.println("Greater Number is: "+b);}
else{
System.out.println("Greater Nuumber is: "+c);
}
}
}
