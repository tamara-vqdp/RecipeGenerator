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


        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeOne"));
        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeTwo"));
        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeThree"));

    }

    public void addPorkRecipes() {

        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeOne"));
        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeTwo"));
        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeThree"));

    }

    public void getChickenRecipes() {
        //calling add recipe method to populate array
        //this adds bounds for the random value
        addChickenRecipes();
        //override parent class method to read chicken files array
        //and randomise file to print out
        try {
            readRecipes(randFile(chickenFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getBeefRecipes()  {
        addBeefRecipes();
        try {
            readRecipes(randFile(beefFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getPorkRecipes() {
        addPorkRecipes();
        try {
            readRecipes(randFile(porkFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
