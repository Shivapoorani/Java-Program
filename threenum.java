import java.util.*;
class threenum{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter A value: ");
int a=sc.nextInt();
System.out.println("Enter B value: ");
int b=sc.nextInt();
System.out.println("Enter C value: ");
int c=sc.nextInt();
if (a>b && a>c){
System.out.println("A is greater than B and C");
}
else if (b>a && b>c){
System.out.println("B is greater than A and C");
}
else{
System.out.println("C is greater than A and B");
}
}
}