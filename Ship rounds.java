import java.util.*;
public class shipRounds{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the capacity of the ship(C):");
        int capacity=sc.nextInt();

        System.out.println("Enter the number of people(N):");
        int people=sc.nextInt();

        if(capacity<=0||people<0){
            System.out.println("Invalid input");    
        }else{
            if(people==0){
                System.out.println("Number of rounds required: 0"); 
            }else{
               int rounds=(people+capacity-1)/capacity;
               System.out.println("Number of rounds required: "+rounds);
            }
        }
    }
}
