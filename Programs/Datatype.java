import java.util.*; 

class Datatype {   
    public static void main(String args[]) {     
        Scanner sc = new Scanner(System.in);     
        System.out.println("Enter int value :");     
        int num1 = sc.nextInt();    // used nextInt() for int input 
        
        System.out.println("Enter float value :");     
        float num2 = sc.nextFloat();  // Use nextFloat() for float input
        
        System.out.println("Enter name :");     
        String str = sc.next();  // Use next() for string input
        
        System.out.println("Input values are: " + num1 + " " + num2 + " " + str);  
    } 
}
