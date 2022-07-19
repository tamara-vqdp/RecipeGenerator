import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Veg extends RecipeBook{

    private ArrayList<File> vegFiles = new ArrayList<>();

    public String directoryPath;
    public String filePath;
    public String fileOne;
    public String fileTwo;
    public String fileThree;

    public static void main(String[] args) {
        Veg v = new Veg();
        v.creatingVeggieFiles();
    }


    public void addVeggieFiles() {
        vegFiles.add(new File("D:\\Users\\Student\\Desktop\\VegRecipes\\Easy-Chickpea-Curry"));
        vegFiles.add(new File("D:\\Users\\Student\\Desktop\\VegRecipes\\Easy-Rice-Bowl"));
        vegFiles.add(new File("D:\\Users\\Student\\Desktop\\VegRecipes\\Vegetarian-Tortilla-Soup"));
    }


    public void creatingVeggieFiles() {
        addVeggieFiles();
        //assign variable to name of files to be used as parameters in parent class method createFiles
        fileOne = "Easy-Chickpea-Curry";
        fileTwo = "Easy-Rice-Bowl";
        fileThree = "Vegetarian-Tortilla-Soup";

        //assign variable to path to be used in parent class method getFileName
        filePath = "D:\\Users\\Student\\Desktop\\VegRecipes";
        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeggieFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            //use method from parent class to create files
            createFiles(getFileName(filePath), vegFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }



    public void getRandomVegRecipes() {

        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeggieFiles";
        try {
            readRandomRecipes(randomFile(directoryPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
