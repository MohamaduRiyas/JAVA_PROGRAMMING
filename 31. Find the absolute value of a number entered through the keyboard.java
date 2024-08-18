import java.util.*;
class Main{
    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        int n = console.nextInt();
        
        if(n <= 0)
        {
            n = (-1) * n;
        }
        
        System.out.println(n);
        
    }
}