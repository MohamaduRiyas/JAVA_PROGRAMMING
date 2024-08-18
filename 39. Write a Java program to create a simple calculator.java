import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        
        Scanner console = new Scanner(System.in);
        
       int n1=console.nextInt();
       int n2=console.nextInt();
       
       char ch = console.next().charAt(0);
       
       if(ch == '+'){
           System.out.println(n1+n2);
       }else if(ch == '-'){
           System.out.println(n1-n2);
       }else if(ch == '*'){
           System.out.println(n1*n2);
       }else if(ch == '/'){
           if(n2 !=0){
               System.out.println(n1/n2);
           }else {
           System.out.println("Zero Dicision Error");}
       }
       else {
           System.out.println("Invalid");
       }
      
        console.close();
        
        
    }
}