import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);
        
        int a = console.nextInt();
        // int b = console.nextInt();
        // int c = console.nextInt();
        if(a%5 == 0 && a%11 == 0){
            System.out.println("A is divisible by both.");
        }
        else{
            System.out.println("A  is not divisible by both.");
        }
        
    }
}