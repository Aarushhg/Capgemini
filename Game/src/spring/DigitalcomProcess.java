package spring;

import java.util.List;
import java.util.Scanner;

public class DigitalcomProcess {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();
        GameService gameService = new GameService();

        boolean isLoggedIn = false;
        int choice;

        while (true) {

            System.out.println("------ DigitalCom Main Menu ------");
            System.out.println("1) RegisterUser");
            System.out.println("2) Login");
            System.out.println("3) ViewGames");
            System.out.println("4) SearchByAuthor");
            System.out.println("5) Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    String userId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String password = sc.nextLine();

                    user.addUser(userId, password);
                    break;

                case 2:
                    System.out.print("Enter User ID: ");
                    String loginId = sc.nextLine();

                    System.out.print("Enter Password: ");
                    String loginPass = sc.nextLine();

                    if (user.IsAuthenticated(loginId, loginPass)) {
                        isLoggedIn = true;
                        System.out.println("Login Successful!");
                    } else {
                        System.out.println("Invalid Credentials!");
                    }
                    break;

                case 3:
                    if (isLoggedIn) {
                        List<Game> games = gameService.viewAll();
                        System.out.println("\nAvailable Games:");
                        for (Game game : games) {
                            System.out.println(game);
                        }
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;

                case 4:
                    if (isLoggedIn) {
                        System.out.print("Enter Author Name: ");
                        String author = sc.nextLine();

                        String result = gameService.authorSearch(author);
                        System.out.println("Search Result: " + result);
                    } else {
                        System.out.println("Please login first!");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using DigitalCom!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}