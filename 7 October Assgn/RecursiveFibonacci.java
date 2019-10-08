import java.util.Scanner;
 class RecursiveFibonacci {

    public static void main(String args[]) {
    
      
        System.out.print("Enter number upto which Fibonacci series to print: ");
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
      System.out.println();
        
        for(int i=1; i<=number; i++){
            System.out.print(fibonacci2(i) +" ");
        }
  
    
    } 
    
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int a=1, b=1, c=1;
        for(int i= 3; i<= number; i++){
           
            
            c = a + b;             
            a = b;
            b = c;
          
        }
        return c; 
      
    }   
  
}