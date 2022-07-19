

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Vegan extends RecipeBook {

    private ArrayList<File> veganFiles = new ArrayList<>();


    public static void main(String[] args) {
        Vegan v = new Vegan();
        v.creatingVeganFiles();
    }


    public void addVeganFiles() {
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Caprese-Couscous"));
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Puff-Pastry-Vegetable-Tart"));
        veganFiles.add(new File("D:\\Users\\Student\\Desktop\\VeganRecipes\\Vegan-Style-Quesadillas"));
    }


    public void creatingVeganFiles() {
        addVeganFiles();
        //assign variable to name of files to be used as parameters in parent class method createFiles
        String fileOne = "Caprese-Couscous";
        String fileTwo = "Puff-Pastry-Vegetable-Tart";
        String fileThree = "Vegan-Style-Quesadillas";

        //assign variable to path to be used in parent class method getFileName
        String filepath = "D:\\Users\\Student\\Desktop\\VeganRecipes";
        String directoryPath = "C:\\Users\\Student\\IdeaProjects\\RecipeGenerator\\.idea\\VeganFiles";

        //surround with try catch to avoid crashing and catch the exception instead
        try {
            //use method from parent class to create files
            createFiles(getFileName(filepath), veganFiles, directoryPath, fileOne, fileTwo, fileThree);
        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }

    }




}



