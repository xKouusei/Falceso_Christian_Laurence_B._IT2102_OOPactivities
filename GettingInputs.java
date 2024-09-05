import java.time.Year;
import java.util.Scanner;

public class GettingInputs {
    
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        
        String Year1;
        String Genre;
        String Album, Title, Artist;

        System.out.print("Enter the year: ");
        Year1 = cin.nextLine();
        int Year = Integer.parseInt(Year1);

        System.out.print("Enter the genre: ");
        Genre = cin.nextLine();
        System.out.print("Enter the Album: ");
        Album = cin.nextLine();
        System.out.print("Enter the song title: ");
        Title = cin.nextLine();
        System.out.print("Enter the artist: ");
        Artist = cin.nextLine();

        System.out.println("-------------------------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("-------------------------------------------");

        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + "\"" + Title + "\"");
        System.out.println("Artist: " + Artist);

        
        

    }
    
}

