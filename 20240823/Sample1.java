import java.util.Scanner;

public class Sample1 {
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = "";

        for(;;)
        {
            System.out.print("Enter a digit(c is escape): ");
            s = scanner.nextLine();
            if(s.equals("c"))
            {
                break;
            }
            else{
                System.out.println(s);
            }
        }
    }
}
