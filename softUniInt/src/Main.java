import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.next();
       int row = Integer.parseInt(scan.next());
       int con = Integer.parseInt(scan.next());
       double result = 0;

       switch (type)
       {
           case "Premiere":
               result = row*con*12;
               break;
           case "Normal":
               result = row*con*7.50;
               break;
           case "discount":
               result = row*con*5;
               break;
       }
        System.out.printf("%.2f", result);
    }
}


