import java.util.*;
class sumofdig{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number: ");
int n=sc.nextInt();
int sum=0;
do{
sum=sum+n%10;
n/= 10;
}
while (n>0);
System.out.println("Sum of digits: "+sum);
}
}
