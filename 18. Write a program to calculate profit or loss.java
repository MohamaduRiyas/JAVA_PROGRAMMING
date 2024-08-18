import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);

        int cp = console.nextInt();
        int sp = console.nextInt();
        int p,l;
        // int n3 = console.nextInt();

        if(sp > cp)
        {
            p = sp - cp;
            System.out.println(p);
        }
        
        else if(sp < cp)
        {
            l = cp - sp;
            System.out.println(l);
        }
        else{
            System.out.println("Ther is No Profit or Loss");
        }


    }
}