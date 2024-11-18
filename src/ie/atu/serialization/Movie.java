package ie.atu.serialization;
import java.io.Serializable;

public class Movie implements Serializable{
    private String Title;
    private String Director;
    private int Year;
    private double Rating;

    public Movie(String Title, String Director, int Year, double Rating){
        this.Title = Title;
        this.Director = Director;
        this.Year = Year;
        this.Rating = Rating;
    }

    @Override
    public String toString(){
        return "Movie{title ='"+ Title + "', Director='" + Director + "', Year = '" + Year + "', Rating = '" + Rating + "'}";
    }

}
