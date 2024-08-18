import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n1 = console.nextInt();
        
        if(n1 % 2 == 0)
        {
            System.out.println("The Given Number is Even");
        }
        
        else
        {
            System.out.println("The Given Number is Odd");
        }
        
        
        
        console.close();
         
    }
}