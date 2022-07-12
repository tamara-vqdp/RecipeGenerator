
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {

    private String path;
    private ArrayList<File> chickenFiles = new ArrayList<File>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> vegFiles = new ArrayList<>();
    private ArrayList<File> veganFiles = new ArrayList<>();

    public void readChickenRecipes() throws IOException {
        File dir = new File("D:\\Users\\Student\\Documents\\ChickenRecipes");
        File[] files = dir.listFiles();
        // Fetching all the files
        for (File file : files) {
            if (file.isFile()) {
                BufferedReader inputStream = null;
                String line;
                try {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println(e);
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }
    }


    public void readChickenRecipes2() throws IOException {

        chickenFiles.add(new File("D:\\Users\\Student\\Documents\\ChickenRecipes\\RecipeOne"));
        BufferedReader br = new BufferedReader(new FileReader(chickenFiles.get(0)+".txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }


    }


    public void readBeefRecipes() throws IOException {

        File dir = new File("D:\\Users\\Student\\Documents\\BeefRecipes");
        File[] files = dir.listFiles();
        // Fetching all the files
        for (File file : files) {
            if (file.isFile()) {
                BufferedReader inputStream = null;
                String line;
                try {
                    inputStream = new BufferedReader(new FileReader(file));
                    while ((line = inputStream.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (IOException e) {
                    System.out.println(e);
                } finally {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            }
        }

    }

}
