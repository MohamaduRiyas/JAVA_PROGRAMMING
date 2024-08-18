import java.util.*;

class Main{

    public static void main(String args[]){
    
        Scanner console = new Scanner(System.in);
        
        String gender = console.nextLine().toLowerCase();
        int year = console.nextInt();
        console.nextLine();
        String qual = console.nextLine().toLowerCase();
        
        int salary = 0;
        
        if(gender.equals("male")){
            if(year >= 10 && qual.equals("post-graduate")){
                salary = 15000;
            }
            else if(year >= 10 && qual.equals("graduate")){
                salary = 10000;
            }
            else if(year < 10 && qual.equals("post-graduate")){
                salary = 10000;
            }
            else if(year < 10 && qual.equals("graduate")){
                salary = 7000;
            }
            
        }
        else if(gender.equals("female")){
            if(year >= 10 && qual.equals("post-graduate")){
                salary = 12000;
            }
            else if(year >= 10 && qual.equals("graduate")){
                salary = 9000;
            }
            else if(year < 10 && qual.equals("post-graduate")){
                salary = 10000;
            }
            else if(year < 10 && qual.equals("graduate")){
                salary = 6000;
            }
            
        }
        System.out.println(salary);
        
        
        console.close();
    }
}
