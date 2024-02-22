
// import java.util.*;

// class product {
//     public Vector<Object> product1 = new Vector<>(); // [name,price,productId]
//     public Vector<Object> product2 = new Vector<>();
//     public Vector<Object> product3 = new Vector<>();
//     public Vector<Object> product4 = new Vector<>();

//     product() {
//         product1.add("mobile");
//         product1.add(15000);
//         product1.add(123);

//         product2.add("laptop");
//         product2.add(600000);
//         product2.add(124);

//         product3.add("earbuds");
//         product3.add(1500);
//         product3.add(125);

//         product4.add("laptop");
//         product4.add(600000);
//         product4.add(124);
//     }

// }

// class UserAuthentication extends product {
//     public long uid;
//     public String name;
//     protected StringBuffer forgotPass = new StringBuffer();
//     protected StringBuffer password = new StringBuffer();
//     public String city;
//     public long PNumber;
//     Scanner sc = new Scanner(System.in);

//     UserAuthentication() {
//         uid = 0;
//         name = null;
//         password = null;
//         city = null;
//         PNumber = 0;

//     }

//     public void registration() throws InterruptedException {
//         System.out.println("**************** Registration *****************************");
//         System.out.print("Enter the name: ");
//         name = sc.nextLine();
//         System.out.print("UID is generating by the System. Please wait.");
//         for (int i = 0; i < 10; i++) {
//             Thread.sleep(1000);
//             System.out.print(".");
//         }
//         System.out.println();
//         Random random = new Random();
//         uid = random.nextInt(999999) + 1;
//         System.out.println("Your UID is: " + uid);

//         // Password entry and verification
//         while (true) {
//             System.out.print("Enter the password: ");
//             password = new StringBuffer(sc.nextLine());

//             System.out.print("Enter the password again to verify: ");
//             StringBuffer vPass = new StringBuffer(sc.nextLine());

//             if (password.toString().equals(vPass.toString())) {
//                 System.out.println("Password matched. Registration successful!");
//                 break; // Exit the loop if passwords match
//             } else {
//                 System.out.println("Passwords do not match. Please try again.");
//             }
//         }
//         System.out.print("enter the phone number: ");
//         PNumber = sc.nextLong();
//         System.out.print("\nEnter the city: ");
//         city = sc.nextLine();
//     }
// }

// class Adminlogin extends UserAuthentication {
//     long AdminUID = 12345;
//     String AdminPass = "Admin";

//     void loginUser() {
//         long uidOrNumber;
//         String pass;
//         int ch1 = 0;
//         while (true) {
//             System.out.println("enter the UID or Phone Number: ");
//             uidOrNumber = sc.nextInt();
//             System.out.print("enter the password: ");
//             pass = sc.nextLine();
//             if (uidOrNumber == uid || uidOrNumber == PNumber && pass.toString().equals(password.toString())) {
//                 System.out.println("login succfully of user : " + name);
//                 System.out.println("");
//                 System.out.print("enter the choice : ");
//                 ch1 = sc.nextInt();
//                 switch (ch1) {
//                     case 1:
                        
//                         break;
//                    case 2:
                         
//                         3
//                     default:
//                         break;
//                 }


//                 break;
//             } else {
//                 System.out.println("pass doesn't match with original pass or your not registred yet");
//             }
//         }

//     }

//     void LoginAdmin() {

//         System.out.println("enter the UID & Pass");
//         int auid = sc.nextInt();
//         String apass = sc.nextLine();
//         while (true) {
//             if (auid == AdminUID && apass.equals(AdminPass)) {
//                 System.out.println("login successful");
//                 System.out.println("1.clear(remove) the product \n 2. add the new product\n 3. clone the product ");
//                 System.out.println("enter the choice: ");
//                 int ch2 = sc.nextInt();
//                 while (true) {
//                     switch (ch2) {
//                         case 1:
//                             product1.clear();
//                             break;
//                         case 2:
//                             Vector<Object> product5 = new Vector<Object>();
//                             System.out.println("you want add the element in that vector...(yes || no)");
//                             String sc1 = sc.nextLine();
//                             if (sc1 == "yes") {
//                                 product5.add("microphone");
//                                 product5.add(6000);
//                                 product5.add(126);
//                             } else {
//                                 product5.clear();
//                             }
//                             break;
//                         case 3:
//                             Object v1 = product1.clone();
//                         default:
//                             System.out.println("invalid option....");
//                             break;
//                     }
//                     break;
//                 }
//             } else {
//                 System.out.println("password invalid.....");
//             }
//         }
//     }
// }

// public class onlineShoppingSystem1 {
//     public static void main(String arg[]) throws InterruptedException {
//         int ch = 0;
//         Scanner sc = new Scanner(System.in);
//         UserAuthentication obj1 = new UserAuthentication();
//         Adminlogin obj2 = new Adminlogin();
//         do {
//             System.out.println("1. User Registration\n2. User Login\n3. Admin Login\n4. Exit");
//             System.out.print("Choose the option from the above list: ");
//             ch = sc.nextInt();
//             switch (ch) {
//                 case 1:
//                     obj1.registration();
//                     break;
//                 case 2:
//                     obj2.loginUser();
//                     break;
//                 case 3:
//                     obj2.LoginAdmin();
//                     break;
//                 case 4:
//                     System.out.println("Exiting...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter a number between 1 and 4.");
//             }
//         } while (ch != 4);
//     }
// }


import java.util.*;

class Product {
    public List<Object> product1 = new ArrayList<>(); // [name,price,productId]
    public List<Object> product2 = new ArrayList<>();
    public List<Object> product3 = new ArrayList<>();
    public List<Object> product4 = new ArrayList<>();

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
    protected StringBuffer forgotPass = new StringBuffer();
    protected StringBuffer password = new StringBuffer();
    public String city;
    public long PNumber;
    Scanner sc = new Scanner(System.in);

    UserAuthentication() {
        uid = 0;
        name = null;
        city = null;
        PNumber = 0;
    }

    public void registration() throws InterruptedException {
        System.out.println("**************** Registration *****************************");
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("UID is generating by the System. Please wait.");
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.print(".");
        }
        System.out.println();
        Random random = new Random();
        uid = random.nextInt(999999) + 1;
        System.out.println("Your UID is: " + uid);

        // Password entry and verification
        while (true) {
            System.out.print("Enter the password: ");
            password = new StringBuffer(sc.nextLine());

            System.out.print("Enter the password again to verify: ");
            StringBuffer vPass = new StringBuffer(sc.nextLine());

            if (password.toString().equals(vPass.toString())) {
                System.out.println("Password matched. Registration successful!");
                break; // Exit the loop if passwords match
            } else {
                System.out.println("Passwords do not match. Please try again.");
            }
        }
        
        System.out.print("enter the phone number: ");
        PNumber = sc.nextLong();
        sc.nextLine(); // consume newline character
        System.out.print("\nEnter the city: ");
        city = sc.nextLine();
    }
}

class AdminLogin extends UserAuthentication {
    long AdminUID = 12345;
    String AdminPass = "Admin";

    void loginUser() {
        long uidOrNumber;
        String pass;
        int ch1 = 0;
        while (true) {
            System.out.println("enter the UID or Phone Number: ");
            uidOrNumber = sc.nextLong();
            sc.nextLine(); // consume newline character
            System.out.print("enter the password: ");
            pass = sc.nextLine();
            if ((uidOrNumber == uid || uidOrNumber == PNumber) && pass.equals(password.toString())) {
                System.out.println("login successfully of user : " + name);
                System.out.println("");
                System.out.print("enter the choice : ");
                ch1 = sc.nextInt();
                switch (ch1) {
                    case 1:
                        // Handle user choices
                        break;
                    case 2:
                        // Handle user choices
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
                break;
            } else {
                System.out.println("Password doesn't match with original password or you're not registered yet.");
            }
        }
    }

    void loginAdmin() {
        System.out.println("enter the UID & Pass");
        long auid = sc.nextLong();
        sc.nextLine(); // consume newline character
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
                    List<Object> product5 = new ArrayList<>();
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
        UserAuthentication obj1 = new UserAuthentication();
        AdminLogin obj2 = new AdminLogin();
        do {
            System.out.println("1. User Registration\n2. User Login\n3. Admin Login\n4. Exit");
            System.out.print("Choose the option from the above list: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj1.registration();
                    break;
                case 2:
                    obj2.loginUser();
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
    }
}
