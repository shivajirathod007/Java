import java.util.*;
import java.io.Console;

class ShoppingCart {
    private List<Vector<Object>> cart; // List to store products in the cart

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    public void addToCart(Vector<Object> product) {
        cart.add(product);
        System.out.println("Product added to cart: " + product.get(0));
    }

    public void processPurchase() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. No purchase to process.");
        } else {
            double totalAmount = 0;
            System.out.println("Items in the cart:");
            for (Vector<Object> product : cart) {
                System.out.println(product.get(0) + " - $" + product.get(1));
                totalAmount += (int) product.get(1); // handeled the exceptions
            }
            System.out.println("Total amount: $" + totalAmount);

            cart.clear();
            System.out.println("Purchase processed successfully. Cart cleared.");
        }
    }
}

class Product extends ShoppingCart {
    public Vector<Object> product1 = new Vector<>(); // [name,price,productId]
    public Vector<Object> product2 = new Vector<>();
    public Vector<Object> product3 = new Vector<>();
    public Vector<Object> product4 = new Vector<>();

    // Method to clear console
    protected void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                // Runtime.getRuntime().exec("cls"); --> not working due to the
                // untraced(unavalible) file
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e) {
            // Handled exceptions
            System.out.println("Error while clearing console: " + e.getMessage());
        }
    }

    Product() {
        product1.add("mobile");
        product1.add(15000);
        product1.add(123);

        product2.add("laptop");
        product2.add(600000);
        product2.add(124);

        product3.add("earbuds");
        product3.add(1500);
        product3.add(125);

        product4.add("laptop");
        product4.add(600000);
        product4.add(124);
    }
}

class UserAuthentication extends Product {
    public long uid;
    public String name;
    public String city;
    public long PNumber;
    public String Password;
    Scanner sc = new Scanner(System.in);

    int showProduct() {
        // System.out.println("product as per the [name,price,productId]");
        // System.out.println("product1: " + product1);
        // System.out.println("product2: " + product2);
        // System.out.println("product3: " + product3);
        // System.out.println("product4: " + product4);
        System.out.printf("\tName\tPrice\tProductID\n");
        System.out.printf("\t%s\t%d\t%d\n", product1.elementAt(0), product1.elementAt(1), product1.elementAt(2));
        System.out.printf("\t%s\t%d\t%d\n", product2.elementAt(0), product2.elementAt(1), product2.elementAt(2));
        System.out.printf("\t%s\t%d\t%d\n", product3.elementAt(0), product3.elementAt(1), product3.elementAt(2));
        System.out.printf("\t%s\t%d\t%d\n", product4.elementAt(0), product4.elementAt(1), product4.elementAt(2));

        return 0;
    }

    UserAuthentication() {
        uid = 0;
        name = null;
        city = null;
        PNumber = 0;
        Password = null;
    }

    public void registration() throws InterruptedException {
        super.clearConsole();
        System.out.println("**************** Registration *****************************");
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("UID is generating by the System. Please wait.");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.print(".");
        }
        System.out.println();
        Random random = new Random();
        uid = random.nextInt(999999) + 1;
        System.out.println("Your UID is: " + uid);
        Console console = System.console();
        if (console == null) {
            System.out.println("Console is not available");
            System.exit(1);
        }

        while (true) {

            // System.out.print("Enter the password: ");
            Password = console.readLine("enter the password: ");

            // System.out.print("Enter the password again to verify: ");
            String vPass = console.readLine("enter the password to verify: ");

            if (Password.equals(vPass)) {
                System.out.println("Password matched. Registration successful!");
                break;
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }

        System.out.print("Enter the phone number: ");
        PNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the city: ");
        city = sc.nextLine();

    }

    void loginUser(UserAuthentication obj1) {
        long uidOrNumber;
        String pass;
        int ch1 = 0;
        int productChoice = 0;
        String productName = null;
        double productPrice = 0;
        int productId = 0;

        System.out.println("Enter the UID or Phone Number: ");
        uidOrNumber = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the password: ");
        pass = sc.nextLine().trim();
        if ((uidOrNumber == uid || uidOrNumber == PNumber) && pass.equalsIgnoreCase(Password)) {
            System.out.println("Login successful for user: " + name);
            super.clearConsole();
            System.out.println("**********************welcome to the online shopping******************");
            do {
                System.out.println(
                        "1. show the products\n 2. add to cart  \n 3. purchase the product \n 4. return the product \n 5. exit");
                System.out.print("Enter the choice: ");
                ch1 = sc.nextInt();
                switch (ch1) {
                    case 1:
                        showProduct();

                        break;
                    case 2:
                        super.clearConsole();
                        System.out.println("Which product do you want to buy?");
                        obj1.showProduct();
                        System.out.print("Enter the product number to add in the cart: ");
                        productChoice = sc.nextInt();
                        Vector<Object> selectedProduct = null;
                        switch (productChoice) {
                            case 1:
                                selectedProduct = obj1.product1;
                                addToCart(selectedProduct);
                                break;
                            case 2:
                                selectedProduct = obj1.product2;
                                addToCart(selectedProduct);
                                break;
                            case 3:
                                selectedProduct = obj1.product3;
                                addToCart(selectedProduct);
                                break;
                            case 4:
                                selectedProduct = obj1.product4;
                                addToCart(selectedProduct);
                                break;
                            default:
                                System.out.println("Invalid product choice.");
                                break;
                        }
                        if (selectedProduct != null) {
                            productName = (String) selectedProduct.get(0);
                            productPrice = (int) selectedProduct.get(1); // handeled exception
                            productId = (int) selectedProduct.get(2);
                            System.out.println("Product selected: " + productName);
                            System.out.println("Price: " + productPrice);
                        }
                        break;
                    case 3:
                        // product purchase section
                        processPurchase();
                        break;
                    case 4:
                        System.out.println("enter the product ID : ");
                        int uid = sc.nextInt();
                        if (uid == productId) {
                            System.out.print("enter the pass: ");
                            String pass1 = sc.nextLine();
                            if (pass1.equalsIgnoreCase(pass)) {
                                System.out.println("succfully validated all things...");
                                System.out.println("returned the product: " + productName);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Exiting..");
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            } while (ch1 != 5);
        } else {
            System.out.println("Password doesn't match with the original password or you're not registered yet.");
        }
    }

}

class AdminLogin extends UserAuthentication {
    long AdminUID = 12345;
    String AdminPass = "Admin";

    void loginAdmin() {
        System.out.println("Enter the UID & Pass");
        long auid = sc.nextLong();
        sc.nextLine(); // Consume newline character
        String apass = sc.nextLine();
        if (auid == AdminUID && apass.equals(AdminPass)) {
            System.out.println("Login successful");
            System.out.println("1. Clear(remove) the product\n2. Add a new product\n3. Clone the product");
            System.out.print("Enter your choice: ");
            int ch2 = sc.nextInt();
            switch (ch2) {
                case 1:
                    product1.clear();
                    break;
                case 2:
                    Vector<Object> product5 = new Vector<>();
                    System.out.println("Do you want to add the element in that vector? (yes/no)");
                    String sc1 = sc.nextLine();
                    if (sc1.equals("yes")) {
                        product5.add("microphone");
                        product5.add(6000);
                        product5.add(126);
                    } else {
                        product5.clear();
                    }
                    break;
                case 3:
                    // Handle cloning
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        } else {
            System.out.println("Password invalid.");
        }
    }
}

public class onlineShoppingSystem1 {
    public static void main(String[] args) throws InterruptedException {
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        UserAuthentication obj1 = null;
        AdminLogin obj2 = new AdminLogin();
        do {
            System.out.println("1. User Registration\n2. User Login\n3. Admin Login\n4. Exit");
            System.out.print("Choose the option from the above list: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj1 = new UserAuthentication();
                    obj1.registration();
                    break;
                case 2:
                    if (obj1 != null) {
                        obj1.loginUser(obj1);
                    } else {
                        System.out.println("User not registered yet. Please register first.");
                    }
                    break;
                case 3:
                    obj2.loginAdmin();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (ch != 4);
        sc.close();
    }
}