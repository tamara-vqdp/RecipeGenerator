import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Meat extends RecipeBook {

    public ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();


    @Override
    public String selectingRecipesToRead(ArrayList<File> recipes, int index) {

        String fileSelection;
        fileSelection = String.valueOf(recipes.get(index));

        return fileSelection;
    }










}
