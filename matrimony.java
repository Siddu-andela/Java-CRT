import java.util.Scanner;
public class matrimony {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the gender:");
        String gender=sc.next();
        if(gender.equals("male")){
            System.out.println("enter your age:");
            int age=sc.nextInt();
            if(age==21){
                System.out.println("you are elgible to marriage ");
            }
             else{
                System.out.println("you are not elgible to marriage because your age is " +age+ " for " +gender+ " age should be greather then 21");
            }
        }
        else if(gender.equals("female"))    
        {
            System.out.println("enter your age :");
            int age=sc.nextInt();
            if (age>=18){
                System.out.println("you are elgible to marriage....!");
            }
            else{
                System.out.println("you are not elgible to marriage because your age is " +age+" for "+gender+" age should be greather then 18");
            }
        }
    }
}