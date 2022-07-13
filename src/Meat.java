import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Meat extends RecipeBook {

    private ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();


    //getters for all meat arrays
    ArrayList<File> getChickenList() {
        return chickenFiles;
    }

    ArrayList<File> getBeefList() {
        return beefFiles;
    }

    ArrayList<File> getPorkList() {
        return porkFiles;
    }

    public void addChickenRecipes() {

        //adding new files to chicken files array
        chickenFiles.add(new File("D:\\Users\\Student\\Documents\\ChickenRecipes\\RecipeOne"));
        chickenFiles.add(new File("D:\\Users\\Student\\Documents\\ChickenRecipes\\RecipeTwo"));
        chickenFiles.add(new File("D:\\Users\\Student\\Documents\\ChickenRecipes\\RecipeThree"));
    }

    public void addBeefRecipes() {


        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\RecipeOne"));
        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\RecipeTwo"));
        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\RecipeThree"));

    }

    public void addPorkRecipes() {

    }

    public void getChickenRecipes() throws IOException, InterruptedException {
        //calling add recipe method to populate array
        //this adds bounds for the random value
        addChickenRecipes();
        //override parent class method to read chicken files array
        //and randomise file to print out
        readRecipes(randFile(chickenFiles));
    }

    public void getBeefRecipes() throws IOException, InterruptedException {
        addBeefRecipes();
        readRecipes(randFile(beefFiles));
    }


}
