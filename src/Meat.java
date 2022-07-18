import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Meat extends RecipeBook {

    public ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();


    public static void main(String[] args) throws IOException, InterruptedException {
        Meat m = new Meat();
        m.creatingChickenFiles();
    }


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
        addChickenRecipes();
        //assign variable to name of files to be used as parameters in parent class method createFiles
        String fileOne = "Chicken-Curry";
        String fileTwo = "Honey-Garlic-Chicken";
        String fileThree = "Last-Minute-Chicken";

        //assign variable to path to be used in parent class method getFileName
        String filepath = "D:\\Users\\Student\\Desktop\\ChickenRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\ChickenFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            super.createFiles(super.getFileName(filepath), chickenFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    //C:\Users\Student\IdeaProjects\RecipeGenerator\.idea\ChickenFiles

    public void creatingBeefFiles() {

        addPorkRecipes();
        String fileOne = "Beef-Stir-Fry";
        String fileTwo = "Broccoli-Beef-Braids";
        String fileThree = "Chilli-Ghetti";


        String filepath = "D:\\Users\\Student\\Desktop\\BeefRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\BeefFiles";
        try {
            super.createFiles(super.getFileName(filepath), porkFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void creatingPorkFiles() {

    }

    public String randomFile(String directoryPath) {
        Random rand = new Random();
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        File file = files[rand.nextInt(files.length)];
        String filename = file.toString();
        return filename;

    }

    public void readRandomRecipes(String selectedFile) throws IOException, InterruptedException {

        ArrayList<String> listOfStrings
                = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(selectedFile));

        String line = br.readLine();
        while (line != null) {

            listOfStrings.add(line);
            line = br.readLine();


        }

        String[] array
                = listOfStrings.toArray(new String[0]);

        for(String str : array) {
            System.out.println(str);
        }


    }


}
