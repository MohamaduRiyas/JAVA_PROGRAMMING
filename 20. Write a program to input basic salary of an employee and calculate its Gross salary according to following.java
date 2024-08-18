import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        int bs = console.nextInt();
        float hra, da, gs;
        
        if(bs <= 10000){
            hra = bs * 0.2f;
            da  = bs * 0.8f;
        }
        else if(bs <= 20000){
            hra = bs * 0.25f;
            da  = bs * 0.9f;
        }
        else{
            hra = bs * 0.3f;
            da = bs *0.95f;
        }
        
        System.out.println(bs+hra+da);

    }
}