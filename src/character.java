import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        int count=0;
        char ch;
        do {
            Scanner sc=new Scanner(System.in);

            System.out.println("enter the character ");
             ch=sc.next().charAt(0);

            count++;
        }
        while (ch!='q'&& ch!='Q');{

            System.out.println("you enter the total character   "+count);
        }
    }
}
