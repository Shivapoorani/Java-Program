import java.util.*;
class circle{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the Pi Value: ");
float pi = sc.nextFloat();
System.out.println("Enter the Radius Value: ");
int r = sc.nextInt();
System.out.println("Area Of the Circle: " +(2*pi*r));
System.out.println("Circumference of the Circle: " +(pi*r*r));
}
}
