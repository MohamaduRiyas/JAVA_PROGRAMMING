import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        char ch = console.next().charAt(0);
       
        if(ch >='a' && ch <='z' || ch>='A' && ch <= 'Z')
        {
            System.out.println("ALPHABETS.");
        }
        else if(ch >='1' && ch <='9'){
            System.out.println("DIGITS.");
        }
        
        else{
            System.out.println("SPECIAL CHARACTERS.");
        }
        
        
        
        console.close();
         
    }
}