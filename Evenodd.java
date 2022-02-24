import java.util.Scanner;
public class Evenodd{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            if(i%2==0)
            System.out.println("Even numbers are"+i);
            else
            System.out.println("Odd numbers are"+i);
            i++;
        }
        
        
    }
}