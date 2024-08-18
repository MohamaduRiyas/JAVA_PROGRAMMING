import java.util.*;

class Main{
    public static void main(String args[]){
        
        
        Scanner console = new Scanner(System.in);
        
        char ch = console.next().charAt(0);
       
        if(ch == 'a' || ch == 'e' || ch =='i' ||ch == 'o' || ch == 'u' || ch =='A'
        || ch == 'E' || ch == 'I' || ch =='O' || ch == 'U')
        {
            System.out.println("Vowels.");
        }
        else{
            System.out.println("Consonants.");
        }
        
        
        
        console.close();
         
    }
}