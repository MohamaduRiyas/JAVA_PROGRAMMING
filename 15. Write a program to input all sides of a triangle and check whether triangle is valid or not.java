import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n1 = console.nextInt();
        int n2 = console.nextInt();
        int n3 = console.nextInt();
        
    
        if(n1 == n2 && n2 == n3 && n3 == n1)
        {
            System.out.println("Valid Triangle");
        }
        
        else{
            System.out.println("Not Valid Triangle");
        }
    
        console.close();
         
    }
}