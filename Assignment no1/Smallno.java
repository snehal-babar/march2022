import java.util.*;
class Smallno
{
  public static void main(String args[])
  {
     Scanner sc= new Scanner(System.in);
	 System.out.println("anter 1st number= ");
	 int n1=sc.nextInt();
	 System.out.println("anter 2nd number= ");
	 int n2=sc.nextInt();
	 System.out.println("anter 3rd number= ");
	 int n3=sc.nextInt();
	 if(n1<n2)
	   { 
	      if(n1<n3)
		  System.out.println("n1 is smallest number");
		  else
	      System.out.println("n3 is smallest number");
	   }
	   else if(n2<n3)
	   System.out.println("n2 is smallest number");
	   else
	   System.out.println("n3 is smallest number");
}
}