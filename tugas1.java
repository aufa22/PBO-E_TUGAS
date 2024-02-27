import java.util.Scanner; //untuk mengimport library

public class tugas1 { //untuk menampilkan coding di kelas ini
    public static void main(String[] args) { //method untuk memulai program
        Scanner scan = new Scanner(System.in);
        int option;
        String username, password, nim;
//input
        do {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");
            System.out.print("Choose option (1-3): ");
            option = scan.nextInt();
//proses dan output
            switch (option) {
                case 1:
                    System.out.print("Enter your NIM: ");
                    nim = scan.next();
                    if (nim.length() != 15) {
                        System.out.println("User not found");
                    } else {
                        System.out.println("Successful login as Student");
                    }
                    break;
                case 2:
                    System.out.print("Enter your username (admin): ");
                    username = scan.next();
                    System.out.print("Enter your password (admin): ");
                    password = scan.next();
                    if (username.equals("admin") && password.equals("admin")) {
                        System.out.println("Successful login as Admin");
                    } else {
                        System.out.println("Admin user not found!!");
                    }
                    break;
                case 3:
                    System.out.println("exit");
                    break;
            }
        } while (option != 3);
    }
}