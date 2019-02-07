package ordersJDBC;

import java.util.Scanner;

public class Executor {
private String sql;

    private int operation;

    public Executor() {
    }

    public void execution(int o) {
        if (o == 1)
            sql=addClient();
        if (o == 2)
            sql=addProduct();
        if (o == 3)
            sql=addOrder();
        WriterSQL w = new WriterSQL();
        w.writerSql(sql);
    }

    private String addClient() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String n = sc.nextLine();
        String name = " '"+n+"' ";
        System.out.println("enter phone");
        String p = sc.nextLine();
        String phone = " '"+p+"' ";
        StringSQL t = new StringSQL("NAME", "PHONE", "CLIENTS", name, phone);

        String sql = t.getText();
        return sql;
    }

    private String addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of product");
        String name_p = sc.nextLine();
        String name_product = " '"+name_p+"' ";
        System.out.println("enter price of product");
        String p = sc.nextLine();
        String price = " '"+p+"' ";
        StringSQL t = new StringSQL("NAME_PRODUCT", "PRICE", "PRODUCTS", name_product, price);

        String sql = t.getText();
        return sql;
    }

    private String addOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter id of client");
        String id_client = sc.nextLine();
//        String id_client = " '"+ id_cl +"' ";
        System.out.println("enter id of product");
        String id_product = sc.nextLine();
//        String id_product = " '"+ id_pr +"' ";
        StringSQL t = new StringSQL("CLIENT_ID", "PRODUCT_ID", "ORDERS", id_client, id_product);

        String sql = t.getText();
        return sql;
    }
}
