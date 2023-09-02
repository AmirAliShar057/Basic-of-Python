import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0,sum=0;
        System.out.println("enter the number ");
        int num= sc.nextInt();
            while (num>=100&&num<=200){
                sum+=num;
                System.out.println("enter the number ");
                 num = sc.nextInt();
    }
        System.out.println(sum);
    }
}
