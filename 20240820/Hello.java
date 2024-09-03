import java.util.Scanner;

    /*
     * @author  kim
     * @version 1.0
     */

public class Hello {
   
    /*
         * @param args  프로그램이 실행될 때 주어지는 인자값이 포함된배열입니다.
    */
    public static void main(String[] args)
    {
        
        // System.out.print("Hello, "+ "Celine\n");
        // System.out.println("Hello");
        // System.out.printf("Hello, %s, %s\n", "Celine", "James");
        // System.out.printf("%x\n" , 15);

        // System.out.print("Enter your name: ");
        // Scanner scanner = new Scanner(System.in);
        // String name = scanner.nextLine();
        // System.out.println("Hello, " + name);
        // scanner.close();
        try {
            int i = 0, j = 0 ;
            Scanner scanner =new Scanner(System.in);
            String line = scanner.nextLine();
            i = Integer.parseInt(line);
            line = scanner.nextLine();
            j= Integer.parseInt(line);
            
            System.out.printf("%d + %d = %d",i , j , i+j);
        }

        catch(Exception e)
        {
            System.out.println("Exception !");
        }

    }
}
