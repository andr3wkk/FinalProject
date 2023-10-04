package Main;
import java.util.ArrayList;
public class Collection {
    private ArrayList<Games> games;
    private int count;
    private int numeration;

    public Collection() {
        games = new ArrayList<>();
        count = 0;
        numeration = 0;
    }

    public void add(Games newGame) {
        games.add(newGame);
        count++;
    }

    public void remove(int i) {
        if (i >= 0 && i < count) {
            games.remove(i);
        } else {
            System.out.println("Incorrect input.");
        }
    }

    public void print() {
        System.out.println("Collection of games:");
        for (Games games : games) {
            games.print();
        }
    }

    public void printOne(int i) {
        System.out.println("Here is info about game:");
        if (i >= 0 && i < count) {
            games.get(i).print();
        } else {
            System.out.println("Incorrect input.");
        }
    }

    public void printList(int i) {
        i = numeration;
        do {
            System.out.println(numeration);
                games.get(i).printList();
                System.out.println("");
            numeration++;
            i++;
        } while (numeration < count);
    }

    public void sortByYear() {
        for (int i = 0; i < count; i++) {
            boolean isSorted = true;
            for (int j = 0; j < (count - 1); j++) {
                if (games.get(j).getReleaseYear() > games.get(j + 1).getReleaseYear()) {
                    swap(games, j, j + 1);
                    isSorted = false;
                }
            }
            if (isSorted) {
                return;
            }
        }
        for (Games games: games) {
            games.print();
        }
    }

    public static void swap(ArrayList<Games> gamesArrayList, int a, int b) {
        Games temp = gamesArrayList.get(a);
        gamesArrayList.set(a, gamesArrayList.get(b));
        gamesArrayList.set(b, temp);
    }

    public void findName(String searchGames) {
        for (Games games: games) {
            if (games.getName().contains(searchGames)) {
                games.print();
            }
        }
    }

    public void findYear(int searchGames) {
        for (Games games: games) {
            if (games.getReleaseYear() == (searchGames)) {
                games.print();
            }
        }
    }
}
