import java.util.Scanner;
public class print_n_natural_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        // int num=1;
        // while(num<=n){
        //     System.out.println(num);
        //     num++;
        // }

        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
    
}
