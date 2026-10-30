import java.util.*;
public class Loop{
public static void main(String[]args){
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number:");
int num=scan.nextInt();
int even=0;
int odd=0;
for(int i=1;i<=num;i++){
if(i%2==0){
even+=i;
}else{
odd+=i;
}
}
System.out.println("Even:" +even);
System.out.println("Odd:" +odd);
}
}