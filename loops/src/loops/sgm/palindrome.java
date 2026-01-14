package loops.sgm;

public class palindrome {
	 public static void main(String args[])
	 {
		 int l=121;
		 int temp=0;
		 int rem;
		 int a=l;
		 
		 while(l>0)
		 {
			 rem=l%10;
			 temp=temp*10+rem;
			 l=l/10; 
		 }
		 if(temp==a)
		 {
		   System.out.println("palindrome number");
		   
		 }
		 else
		 {
			 System.out.println("not an palindrome number");
		 }
	 }

}
