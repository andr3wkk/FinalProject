package Main;
import java.util.ArrayList;
import java.util.Scanner;
public class Run {
    static int answer;
    static String name;
    static int releaseYear;
    static String genre;
    static String developer;
    static int hoursToComplete;
    static int count = 0;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Collection games = new Collection();
        games.add(new Games("Resident Evil Village", 2021, "Survival horror", "Capcom", 36, count));
        do {
            System.out.println("");
            System.out.println("Welcome to the game database!\n" +
                    "Choose an option to proceed:\n" +
                    "1 - add a game to collection\n" +
                    "2 - remove game from collection\n" +
                    "3 - print games\n" +
                    "4 - print list of games\n" +
                    "5 - sort games by year\n" +
                    "6 - search games by title\n" +
                    "7 - search games by year\n" +
                    "8 - read games from file\n" +
                    "9 - save games to file\n" +
                    "0 - exit the program");

            answer = in.nextInt();
            switch (answer) {
                case 1:
                    addGame();
                    games.add(new Games(name, releaseYear, genre, developer, hoursToComplete, count++));
                    break;
                case 2:
                    System.out.println("Please, input index of a game to delete:");
                    games.remove(in.nextInt());
                    break;
                case 3:
                    System.out.println("Do you want to see certain series information?");
                    String info = in.next();
                    if (info.equals("Yes")) {
                        System.out.println("Please, enter number of you collection object:");
                        games.printOne(in.nextInt());
                        } else {
                        games.print();
                    }
                    break;

                case 4:
                    games.printList(0);
                    break;

                case 5:
                    games.sortByYear();
                    System.out.println("Here is sorted array list by release year");
                    games.print();
                    break;

                case 6:
                    searchName(games);
                    break;

                case 7:
                    searchYear(games);
                    break;

                case 8:

                    break;

                case 9:

                    break;

                case 0:
                    System.out.println("Thanks, for using games database!");
                    break;

                default:
                    System.out.println("Incorrect input.");

            }
        } while (answer != 0);
    }

    public static void addGame() {
        System.out.println("Please, enter name of the game:");
        name = in.next();
        System.out.println("Please, enter game release year");
        releaseYear = in.nextInt();
        System.out.println("Please, enter game genre:");
        genre = in.next();
        System.out.println("Please, enter game developer:");
        developer = in.next();
        System.out.println("Please, enter amount of hours to complete this game:");
        hoursToComplete = in.nextInt();
        count++;
    }

    public static void searchName(Collection games) {
        System.out.print("Please, enter name of the game for searching");
        String searchName = in.next();
        System.out.println("Game found:");
        games.findName(searchName);
    }

    public static void searchYear(Collection games) {
        System.out.print("Please, enter game release year for searching");
        int searchYear = in.nextInt();
        System.out.println("Games released in " + searchYear + " :");
        games.findYear(searchYear);
    }
}
