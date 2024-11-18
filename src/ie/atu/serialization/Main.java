package ie.atu.serialization;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        //Make a new movie
        Movie movie = new Movie("Wolf Of Wallstreet" , "Martin Scorsese" , 2014 , 9.9);

        //Serialize
        try(FileOutputStream fileOut = new FileOutputStream("movie.ser.");
            ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(movie);
            System.out.println("\nMovie has been serialized\n");
        } catch(IOException e) {
            System.out.println( "\nMovie did not complete serialization\n\n");
            e.printStackTrace();
            
        } 


        //Desirialization
        try (FileInputStream fileIn = new FileInputStream("Movie.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn)){
            Movie desirializedMovie = (Movie) in.readObject();
            System.out.println("Movie has been desirialized");
            System.out.println("Deserialized Movie: " + desirializedMovie);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

           
    }
}
