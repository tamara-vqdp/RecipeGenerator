import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Meat extends RecipeBook {

    public ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();



    public void addChickenRecipes() {

        //adding new files to chicken files array
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Chicken-Curry"));
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Honey-Garlic-Chicken"));
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Last-Minute-Chicken"));
    }

    public void addBeefRecipes() {


        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\Beef-Stir-Fry"));
        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\Broccoli-Beef-Braids"));
        beefFiles.add(new File("D:\\Users\\Student\\Desktop\\BeefRecipes\\Chilli-Ghetti"));

    }

    public void addPorkRecipes() {

        porkFiles.add(new File("D:\\Users\\Student\\Desktop\\PorkRecipes\\Creamy-Garlic-Pork-Chops"));
        porkFiles.add(new File("D:\\Users\\Student\\Desktop\\PorkRecipes\\Garlic-Butter-Pork-Bites"));
        porkFiles.add(new File("D:\\Users\\Student\\Desktop\\PorkRecipes\\Mongolian-Pork"));

    }


    public void creatingChickenFiles() {
        String fileOne = "Chicken-Curry";
        String fileTwo = "Honey-Garlic-Chicken";
        String fileThree = "Last-Minute-Chicken";
       
    }
    @Override
    public String selectingRecipesToRead(ArrayList<File> recipes, int index) {
        addChickenRecipes();
        String fileSelection;
        fileSelection = String.valueOf(recipes.get(index));

        return fileSelection;
    }










}
