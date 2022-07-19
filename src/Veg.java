import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Veg extends RecipeBook{

    private ArrayList<File> vegFiles = new ArrayList<>();

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
        String fileOne = "Easy-Chickpea-Curry";
        String fileTwo = "Easy-Rice-Bowl";
        String fileThree = "Vegetarian-Tortilla-Soup";

        //assign variable to path to be used in parent class method getFileName
        String filepath = "D:\\Users\\Student\\Desktop\\VegRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeggieFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            //use method from parent class to create files
            createFiles(getFileName(filepath), vegFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }


}
