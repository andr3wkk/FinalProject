package Main;
public class Games {
    private String name;
    private int releaseYear;
    private String genre;
    private String developer;
    private int hoursToComplete;

    public Games(String name, int releaseYear, String genre, String developer, int hoursToComplete, int count) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.developer = developer;
        this.hoursToComplete = hoursToComplete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getHoursToComplete() {
        return hoursToComplete;
    }

    public void setHoursToComplete(int hoursToComplete) {
        this.hoursToComplete = hoursToComplete;
    }

    public void print() {
        System.out.println("Name of the game: " + name + ".\n" +
                "This game was released in " + releaseYear + " and developed by " + developer +".\n" +
                "Genre of " + "'" + name + "'" + " is " + genre + ".\n" +
                "Hours to comlete this game: " + hoursToComplete);
        System.out.println();
    }
    public void printList() {
        System.out.println(name + "; " + releaseYear + "; " + genre + "; " + developer + "; " + hoursToComplete);
    }
}
