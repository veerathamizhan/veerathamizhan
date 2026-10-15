import java.util.*;
public class Reverse{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the value");
int n=scan.nextInt();
int reverse=0;
for(int i=n;i>0;i=10){
reverse=reverse*10;
reverse+=i%10;
}
System.out.println("" + reverse);
scan.close();
}
}
