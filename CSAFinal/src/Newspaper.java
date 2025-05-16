//COMMENTS!!!!!!! and SUBCLASS!!!!!!! (Extends Press to get access to its instance variables and methods)
public class Newspaper extends Press {

    //MEANINGFUL VARIABLE NAMES!!!!!!! (Instance variables Newspaper objects)
    String genre;
    String purpose;

    //Constructor for Newspaper objects
    public Newspaper(String author, String title, String releaseDate) {
        super(author, title, releaseDate);
        genre = "non-fiction";
        purpose = "to inform";
    }

    //Used in main method to make a user-created Newspaper object and return it
    static public Press createNewspaper(String a, String t, String r) {
        Press userWant = new Newspaper(a, t, r);
        return userWant;
    }

    //Get methods for each attribute unique to a Novel/Newspaper object
    public String getGenre() {
        return genre;
    }

    public String getPurpose() {
        return purpose;
    }
    
    //Allows printing the Newspaper object to output its attributes
    public String toString() {
        return "Author: " + this.getAuthor() + ", title: " + this.getTitle() + ", release date: " + this.getReleaseDate() + ", genre: " + this.getGenre() + ", purpose: " + this.getPurpose();
    }

}
