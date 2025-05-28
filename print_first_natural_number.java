import java.util.Scanner;
public class print_first_natural_number {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int sum=0;
        int num=1;
        while(num<=n){
            sum += num; // This line accumulates the sum of natural numbers
            num++;
        }
          System.out.println(sum);
          

          
    //     for(int i=1;i<=n;i++){
    //         sum += i;
    //     }
    //     System.out.println(sum);
    }
    
}
