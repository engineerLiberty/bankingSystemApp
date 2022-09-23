import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Calculation().factorial(5);
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("ENTER THE LENGTH OF THE RECTANGLE: ");
//        int length = sc.nextInt();
//
//        System.out.print("ENTER THE WIDTH OF THE RECTANGLE: ");
//        int width = sc.nextInt();
//        int area = width * length;
//        System.out.println("THE AREA IS: "+ area);
        Rectangle rectangleFirst = new Rectangle();
        Rectangle rectangleSecond = new Rectangle();

        rectangleFirst.insert(11,5);
        rectangleSecond.insert(3,15);

        rectangleFirst.areaOfRectangle();
        rectangleSecond.areaOfRectangle();

        //Creating a test class to deposit and withdraw amount

        AccountBalance a1= new AccountBalance();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

    }
}