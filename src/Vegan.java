

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Vegan extends RecipeBook {

    private ArrayList<File> veganFiles = new ArrayList<>();


    public void listFilesForFolder(File folder) {
        folder = new File("D:\\Users\\Student\\Desktop\\ChickenRecipes");
        for (File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                System.out.println(fileEntry.getName());
            }
        }
    }

    public void testRead(String path) {
        File folder = new File("D:\\Users\\Student\\Documents\\ChickenRecipes");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile() && file.getName().endsWith(".txt")) {
                /*String content = FileUtils.readFileToString(file);
                System.out.println(content);*/

            }
        }
    }

    public void readingAgain() throws IOException {
        File folder = new File("D:\\Users\\Student\\Desktop\\ChickenRecipes");
        File[] listOfFiles = folder.listFiles();
        for (File fileEntry : folder.listFiles()) {

            BufferedWriter writer = new BufferedWriter(new FileWriter("myFile.txt", false));
            /*for (int i = 0; i < fileEntry.length(); i++) {
                writer.write(fileEntry[i]);
                writer.newLine();
            }*/
        }
    }

}



