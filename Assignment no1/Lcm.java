import java.util.*;
class Lcm
{
 public static void main(String args[])
 {

   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number1=  ");
   int n1=sc.nextInt();
   System.out.println("Enter number2=  ");
   int n2=sc.nextInt();
   int lcm;
   lcm=(n1>n2)?n1:n2;
   while(true)
   { 
	   if(lcm%n1==0&&lcm%n2==0){
		   System.out.println("Lcm of given two number is= "+lcm);
	   break;
	   }
	   ++lcm;
   }
  }
}