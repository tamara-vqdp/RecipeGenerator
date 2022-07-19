import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Meat extends RecipeBook {

    private ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();


    public static void main(String[] args) {
        Meat m = new Meat();
        m.creatingChickenFiles();
        m.creatingPorkFiles();
        m.creatingBeefFiles();
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
            //use method from parent class to create files
            createFiles(getFileName(filepath), chickenFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }
    //C:\Users\Student\IdeaProjects\RecipeGenerator\.idea\ChickenFiles

    public void creatingBeefFiles() {

        addBeefRecipes();
        String fileOne = "Beef-Stir-Fry";
        String fileTwo = "Broccoli-Beef-Braids";
        String fileThree = "Chilli-Ghetti";


        String filepath = "D:\\Users\\Student\\Desktop\\BeefRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\BeefFiles";
        try {
            createFiles(getFileName(filepath), beefFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void creatingPorkFiles() {
        addPorkRecipes();
        String fileOne = "Creamy-Garlic-Pork-Chops";
        String fileTwo = "Garlic-Butter-Pork-Bites";
        String fileThree =  "Mongolian-Pork";

        String filepath = "D:\\Users\\Student\\Desktop\\PorkRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\PorkFiles";

        try {
            createFiles(getFileName(filepath), porkFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }



}
