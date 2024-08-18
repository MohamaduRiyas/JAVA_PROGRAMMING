import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        char ch = console.next().charAt(0);
       
        if(ch >='a' && ch <='z')
        {
            System.out.println("LOWERCASE ALPHABETS.");
        }
        else if(ch>='A' && ch <= 'Z'){
            System.out.println("UPPERCASE ALPHABETS.");
        }
        
        else{
            System.out.println("INVALID.");
        }
        
        
        
        console.close();
         
    }
}