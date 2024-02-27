import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String usernameAdmin = "Admin";
        String passwordAdmin = "Admin123";

        String[] mahasiswaNIM = {"123456789101112", "202310370311029"};

        System.out.println("1. Login sebagai Student");
        System.out.println("2. Login sebagai Admin");
        System.out.println("3. Exit");
        System.out.print("Choose Option (1-3): ");
        int option = scanner.nextInt();

        switch (option){
            case 1 :
                System.out.print("Enter your NIM: ");
                String yourNIM = scanner.next();

                boolean isValidNIM = false;
                for (String nim : mahasiswaNIM){
                    if (nim.equals(yourNIM)){
                        isValidNIM = true;
                        break;
                    }
                }

                if (isValidNIM){
                    System.out.println("Successfull login as Student");
                } else {
                    System.out.println("User Not Found");
                }
                break;
            case 2 :
                System.out.println("Enter your NIM: ");
                String nameAdmin = scanner.next();
                System.out.println("Enter your Password: ");
                String pwAdmin = scanner.next();
                if (nameAdmin.equals(usernameAdmin) && pwAdmin.equals(passwordAdmin)){
                    System.out.println("Berhasil login sebagai Admin");
                } else {
                    System.out.println("Admin user tidak ketemu!!");
                }
                break;
            case 3 :
                System.out.println("ADA ADA AJAHH");

        }
    }
}