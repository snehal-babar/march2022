import java.util.*;
class Eseries
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number upto which you have to print Even numbers=  ");
   int num=sc.nextInt();
   for(int i=1;i<=num;i++)
     { 
	    if(i%2==0)
		   System.out.print(i);
		else
		System.out.print(" ");
	 }
	 
  }
}