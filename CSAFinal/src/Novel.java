//COMMENTS!!!!!!! and SUBCLASS!!!!!!! (Extends Press to get access to its instance variables and methods)
public class Novel extends Press {

    //MEANINGFUL VARIABLE NAMES!!!!!!! (Instance variables Novel objects)
    String genre;
    String purpose;

    //Constructor for Novel objects
    public Novel(String author, String title, String releaseDate) {
        super(author, title, releaseDate);
        genre = "fiction";
        purpose = "entertainment";
    }

    //Used in main method to make a user-created Novel object and return it
    static public Press createNovel(String a, String t, String r) {
        Press userWant = new Novel(a, t, r);
        return userWant;
    }

    //Get methods for each attribute unique to a Novel/Newspaper object
    public String getGenre() {
        return genre;
    }

    public String getPurpose() {
        return purpose;
    }

    //Allows printing the Novel object to output its attributes
    public String toString() {
        return "Author: " + this.getAuthor() + ", title: " + this.getTitle() + ", release date: " + this.getReleaseDate() + ", genre: " + this.getGenre() + ", purpose: " + this.getPurpose();
    }

}
