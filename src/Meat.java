import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Meat extends RecipeBook {

    public ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();
    private String name;




    public void getChickenRecipes() throws IOException, InterruptedException {
        //calling add recipe method to populate array
        //this adds bounds for the random value

        //override parent class method to read chicken files array
        //and randomise file to print out
        readRecipes(randFile(chickenFiles));
    }


    public void getBeefRecipes() throws IOException, InterruptedException {

        readRecipes(randFile(beefFiles));
    }


}
