import java.util.*;
public class Multiplication{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a Number:");
int num=scan.nextInt();
for(int i=1;i<=num;i++){
int a=7*i;
System.out.print("7*");
System.out.print(i);
System.out.print("="+a);
System.out.println();
}
}
}