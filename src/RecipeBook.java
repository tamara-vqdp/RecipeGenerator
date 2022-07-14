import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBook {

    private String randomFile;
    private Random rand = new Random();

    

    public File[] getFileName2(String file) {

        //get the pathname of any file directory
        File folder = new File(file + "");
        //create array of files to store the folder and its contents
        File[] listOfFiles = folder.listFiles();



        //for loop goes through each value of the array
        // value being the files in the folder
        for (int i = 0; i < listOfFiles.length; i++) {
            //checks if item in array is a file
            if (listOfFiles[i].isFile()) {
                //gets the name of each file in array
                //assign this value to temp
                listOfFiles[i].getName();


            }
        }
        //return value of temp
        return listOfFiles;
    }


    public String getFileName(String file) {

        //get the pathname of any file directory
        File folder = new File(file + "");
        //create array of files to store the folder and its contents
        File[] listOfFiles = folder.listFiles();
        String temp = "";


        //for loop goes through each value of the array
        // value being the files in the folder
        for (int i = 0; i < listOfFiles.length; i++) {
            //checks if item in array is a file
            if (listOfFiles[i].isFile()) {
                //gets the name of each file in array
                //assign this value to temp
                temp = listOfFiles[i].getName();
                System.out.println("File " + i + ": " + temp); // check if iterating through array and getting file names
            }
        }
        //return value of temp
        return temp;
    }

    public void createFiles(ArrayList<File> arrays, String temp) throws InterruptedException {

        for (File file : arrays) {

            temp = "";
            try {
                FileWriter writer = new FileWriter(temp + ".txt");
                Writer output = new BufferedWriter(writer);
                output.write(readRecipes(temp));
                output.close();

            } catch (IOException e) {
                System.out.println("File Creation Unsuccessful");
                e.printStackTrace();
            }

        }

    }

    public void createFiles2(File[] arrays) throws InterruptedException {

        for (File file2 : arrays) {
            String temp = file2.getName();
            try {
                FileWriter writer = new FileWriter(temp);
                Writer output = new BufferedWriter(writer);
              output.write(readRecipes(temp));
                output.close();
                System.out.println("files written");

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

    public String randFile2(ArrayList<String> recipes) {

        int index = rand.nextInt(recipes.size());
        randomFile = String.valueOf(recipes.get(index));

        return randomFile;
    }


    public String readRecipes(String recipe) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new FileReader(recipe));

        String line = "";
        while (br.readLine() != null) {
            line = br.readLine();

            Thread.sleep(200);

            System.out.println(line);
        }
        return line;

    }


    public String readRecipes2(File[] file) throws IOException, InterruptedException {

        BufferedReader br = new BufferedReader(new FileReader(String.valueOf(file)));

        String line = "";
        while (br.readLine() != null) {
            line = br.readLine();

            Thread.sleep(200);

            System.out.println(line);
        }
        return line;

    }


}
