import java.util.*;
import java.util.Scanner.*;
public class Primenumber
{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int num1,num2;
System.out.println("Enter a value for first number");
num1=sc.nextInt();
System.out.println("Enter a value for second number");
num2=sc.nextInt();

System.out.println("Prime Number");
for(i=num1;i<=num2;i++)
{
int j;
for(j=2;j<i;j++)
{
int n=i%j;
if(n==0)
{
break;
}
}
if(i==j)
{
System.out.println("  "+i);
}
}


 