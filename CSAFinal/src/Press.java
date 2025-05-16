//COMMENTS!!!!!!! and SUPERCLASS!!!!!!!
public class Press {
    
    //MEANINGFUL VARIABLE NAMES!!!!!!! (Instance variables for Press objects; also extended to Novel and Newspaper objects)
    String author;
    String title;
    String releaseDate;

    //Constructor for Press objects
    public Press(String author, String title, String releaseDate) {
        this.author = author;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    //Get methods for each attribute of a Press object
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

}
