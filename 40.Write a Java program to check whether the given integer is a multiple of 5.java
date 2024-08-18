import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        
        if(n%5 == 0)
        {
            System.out.println("The given integer "+ n +" is a multiple of 5");
        }
        else
        {
            
            System.out.println("The given integer " + n + " is a not multiple of 5");
        }
        
        console.close();
        
    }
}