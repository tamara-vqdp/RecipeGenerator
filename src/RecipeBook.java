import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBook {

    private String randomFile;
    private Random rand = new Random();


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
