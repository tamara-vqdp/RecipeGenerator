import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBook {

    private String randomFile;
    private Random rand = new Random();


    public void createFiles(ArrayList<File> arrays) {

        for (File file : arrays) {

            String temp = String.valueOf(arrays);
            try {
                FileWriter writer = new FileWriter(temp + ".txt");
                Writer output = new BufferedWriter(writer);
                output.write(file.getName());
                output.close();

            } catch (IOException e) {
                System.out.println("File Creation Unsuccessful");
                e.printStackTrace();
            }

        }

    }


    public String randFile(ArrayList<File> recipes) {

        int index = rand.nextInt(recipes.size());
        randomFile = String.valueOf(recipes.get(index));

        return randomFile;
    }

    public void readRecipes(String randomRecipe) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new FileReader(randomRecipe + ".txt"));

        String line;
        while ((line = br.readLine()) != null) {

            Thread.sleep(700);

            System.out.println(line);

        }

    }

}
