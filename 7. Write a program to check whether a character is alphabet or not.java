import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        char ch = console.next().charAt(0);
       
        if(ch >= 'a' && ch <= 'z' || ch >='A' && ch <='Z')
        {
            System.out.println("Alphabets");
        }
        else{
            System.out.println("Not a Alphabets");
        }
        
        
        
        console.close();
         
    }
}