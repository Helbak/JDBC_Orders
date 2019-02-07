package ordersJDBC;

import java.util.Scanner;

public class MainOrders {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter operation");
        System.out.println("1: add client");
        System.out.println("2: add product");
        System.out.println("3: add order");
        System.out.print("-> ");
        Executor e = new Executor();

        int o = sc.nextInt();

        if (o == 1) {
            e.execution(1);
        }
        if (o == 2) {
            e.execution(2);
        }
        if (o == 3) {
            e.execution(3);


        }
    }
}

