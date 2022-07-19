

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Vegan extends RecipeBook {

    private ArrayList<File> veganFiles = new ArrayList<>();

    public String directoryPath;
    public String filePath;
    public String fileOne;
    public String fileTwo;
    public String fileThree;


    public void addVeganFiles() {
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Caprese-Couscous"));
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Puff-Pastry-Vegetable-Tart"));
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Vegan-Style-Quesadillas"));
    }


    public void creatingVeganFiles() {
        addVeganFiles();
        //assign variable to name of files to be used as parameters in parent class method createFiles
        fileOne = "Caprese-Couscous";
        fileTwo = "Puff-Pastry-Vegetable-Tart";
        fileThree = "Vegan-Style-Quesadillas";

        //assign variable to path to be used in parent class method getFileName
        filePath = "D:\\Users\\Student\\Desktop\\VeganRecipes";
        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeganFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            //use method from parent class to create files
            createFiles(getFileName(filePath), veganFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void getRandomVeganRecipes() {

        directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeganFiles";
        try {
            readRandomRecipes(randomFile(directoryPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}



