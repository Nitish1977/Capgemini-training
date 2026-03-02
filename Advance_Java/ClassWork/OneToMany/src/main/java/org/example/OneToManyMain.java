package org.example;

import org.example.entity.Customer;
import org.example.entity.Product;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

public class OneToManyMain {

    private static SessionFactory factory;

    public static void main(String[] args) {

        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- One-To-Many CRUD Menu ---");
            System.out.println("1. Create Customer with Products");
            System.out.println("2. Read Customer by ID");
            System.out.println("3. Update Customer Name");
            System.out.println("4. Delete Customer");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1 -> create(sc);
                case 2 -> read(sc);
                case 3 -> update(sc);
                case 4 -> delete(sc);
                case 5 -> {
                    factory.close();
                    System.out.println("Program Ended.");
                    System.exit(0);
                }

                default -> System.out.println("Invalid Choice!");
            }
        }
    }

    // ================= CREATE =================
    private static void create(Scanner sc) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter Customer Name: ");
        String name = sc.next();

        Customer customer = new Customer(name);

        System.out.print("How many products? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nProduct " + i);

            System.out.print("Name: ");
            String pname = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            Product product = new Product(pname, price);

            customer.addProduct(product);
        }

        session.persist(customer);

        tx.commit();
        session.close();

        System.out.println("Customer & Products Saved Successfully!");
    }

    // ================= READ =================
    private static void read(Scanner sc) {

        Session session = factory.openSession();

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();

        Customer customer = session.get(Customer.class, id);

        if (customer == null) {
            System.out.println("Customer Not Found!");
        } else {

            System.out.println("\nCustomer ID: " + customer.getId());
            System.out.println("Name: " + customer.getName());

            System.out.println("Products:");

            List<Product> products = customer.getProducts();

            if (products.isEmpty()) {
                System.out.println("No Products");
            } else {
                for (Product p : products) {
                    System.out.println(
                            "  ID: " + p.getId() +
                                    " | Name: " + p.getName() +
                                    " | Price: " + p.getPrice()
                    );
                }
            }
        }

        session.close();
    }

    // ================= UPDATE =================
    private static void update(Scanner sc) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter Customer ID to Update: ");
        int id = sc.nextInt();

        Customer customer = session.get(Customer.class, id);

        if (customer == null) {
            System.out.println("Customer Not Found!");
        } else {

            System.out.print("Enter New Name: ");
            String newName = sc.next();

            customer.setName(newName);

            session.merge(customer);

            tx.commit();

            System.out.println("Customer Updated Successfully!");
        }

        session.close();
    }

    // ================= DELETE =================
    private static void delete(Scanner sc) {

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        System.out.print("Enter Customer ID to Delete: ");
        int id = sc.nextInt();

        Customer customer = session.get(Customer.class, id);

        if (customer == null) {
            System.out.println("Customer Not Found!");
        } else {

            session.remove(customer); // Cascade deletes products

            tx.commit();

            System.out.println("Customer & Products Deleted!");
        }

        session.close();
    }
}
