import java.util.Scanner;

public class count_number_of_digits_given_n_number {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int numberofdigit=0;
        int original_n=n;
          while(n>0){
            n=n/10; 
            numberofdigit++;
        }
        System.out.println("The number of digits in " + original_n + "=" + numberofdigit);
           sc.close();

    } 
    
}
