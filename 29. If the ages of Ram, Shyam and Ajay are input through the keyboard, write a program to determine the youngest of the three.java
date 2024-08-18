import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("");
        
        Scanner console = new Scanner(System.in);
        
       int ram = console.nextInt();
       int shyam = console.nextInt();
       int ajay= console.nextInt();
       
       if(ram < shyam && ram <ajay)
       {
           System.out.println("Younget is ram");
       }
       else if(shyam < ajay && shyam <ram)
       {
           System.out.println("Shyam is Youngest");
       }
       else{
           System.out.println("Ajay is youngest");
       }
       
        console.close();
        
        
    }
}