import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        
        int a = console.nextInt();
        int b = console.nextInt();
        
        if(a > b){
            System.out.println("A is greater");
        }
        else{
            System.out.println("B is greater");
        }
        
    }
}