package loops.sgm;

public class palindrome_num {
   public static void main(String[] args) {
	int count=0;
	  for(int i=1; i <=100;i++) {
		  
		  int n=i,n1=n; 
		  int rem, temp=0;
		  while(n>0) {
			  
			  rem = n%10;
			  
			  temp=temp*10+rem;
			  n=n/10;
			  
			  
		  }
		  if(temp==n1) {
			  count++;
			  System.out.println(temp);
		  }
		 
		  
		  
		  
		  
	  }
	  System.out.println("there are "+count+" numbers in the givern condition");
}

}
