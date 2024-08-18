import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n1 = console.nextInt();
        
        if(n1 > 0)
        {
             System.out.println("The Number is positive");
        }
        else if(n1 < 0)
        {
             System.out.println("The Number is Negative");
        }
        else{
             System.out.println("The Number is Zero");
        }
        
        
        
        console.close();
         
    }
}