import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Meat extends RecipeBook {

    private ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();

    public String directoryPath;
    public String filePath;
    public String fileOne;
    public String fileTwo;
    public String fileThree;

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
        fileOne = "Chicken-Curry";
        fileTwo = "Honey-Garlic-Chicken";
        fileThree = "Last-Minute-Chicken";

        //assign variable to path to be used in parent class method getFileName
        filePath = "D:\\Users\\Student\\Desktop\\ChickenRecipes";
        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\ChickenFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            //use method from parent class to create files
            createFiles(getFileName(filePath), chickenFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }


    public void creatingBeefFiles() {

        addBeefRecipes();
        fileOne = "Beef-Stir-Fry";
        fileTwo = "Broccoli-Beef-Braids";
        fileThree = "Chilli-Ghetti";


        filePath = "D:\\Users\\Student\\Desktop\\BeefRecipes";
        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\BeefFiles";
        try {
            createFiles(getFileName(filePath), beefFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void creatingPorkFiles() {
        addPorkRecipes();
        fileOne = "Creamy-Garlic-Pork-Chops";
        fileTwo = "Garlic-Butter-Pork-Bites";
        fileThree = "Mongolian-Pork";

        filePath = "D:\\Users\\Student\\Desktop\\PorkRecipes";
        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\PorkFiles";

        try {
            createFiles(getFileName(filePath), porkFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    //call parent
    public void getRandomChickenRecipes() {

        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\ChickenFiles";

        try {
            readRandomRecipes(randomFile(directoryPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void getRandomBeefRecipes() {

        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\BeefFiles";

        try {
            readRandomRecipes(randomFile(directoryPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void getRandomPorkRecipes() {

       directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\PorkFiles";

        try {
            readRandomRecipes(randomFile(directoryPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
