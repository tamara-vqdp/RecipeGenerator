import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Meat extends RecipeBook {

    private ArrayList<File> chickenFiles = new ArrayList<>();
    private ArrayList<File> beefFiles = new ArrayList<>();
    private ArrayList<File> porkFiles = new ArrayList<>();


    public static void main(String[] args) throws InterruptedException, IOException {
        Meat m = new Meat();
        m.createFiles2(m.getFileName2("D:\\Users\\Student\\Desktop\\ChickenRecipes"));


    }

    //getters for all meat arrays
    ArrayList<File> getChickenList() {
        return chickenFiles;
    }

    ArrayList<File> getBeefList() {
        return beefFiles;
    }

    ArrayList<File> getPorkList() {
        return porkFiles;
    }

    public void addChickenRecipes() {

        //adding new files to chicken files array
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Chicken-Curry"));
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Honey-Garlic-Chicken"));
        chickenFiles.add(new File("D:\\Users\\Student\\Desktop\\ChickenRecipes\\Last-Minute-Chicken"));
    }

    public void addBeefRecipes() {


        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeOne"));
        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeTwo"));
        beefFiles.add(new File("D:\\Users\\Student\\Documents\\BeefRecipes\\RecipeThree"));

    }

    public void addPorkRecipes() {

        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeOne"));
        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeTwo"));
        porkFiles.add(new File("D:\\Users\\Student\\Documents\\PorkRecipes\\RecipeThree"));

    }

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
            }
            //assign this value to temp
            listOfFiles[i].getName();

        }
        //return value of temp
        return listOfFiles;

    }


    public void createFiles2(File[] arrays) throws InterruptedException, IOException {

        //for each loop to go through every file in the array
        for (File file2 : arrays) {
            //assign filename to a string to pass it through filewriter method
            String getFileName = file2.getName();
            String fileName = null;

            //declare variable index to go through chicken files array
            // and write each recipe to matching file name
            int index = 0;
            //declare array to grab return value from read recipes method
            String[] array;
            ArrayList<File> recipeList = null;
            try {
                FileWriter writer = new FileWriter(getFileName);
                Writer output = new BufferedWriter(writer);


                //check for filename
                if (getFileName.contains(fileName)) {
                    //reassign value of index to corresponding file recipe
                    index = 0;
                    //reassign array to
                    array = readRecipes2(randFile2(recipeList, index));
                    for (String str : array) {
                        output.write(str);
                        ((BufferedWriter) output).newLine();
                    }
                }

                else if(getFileName.contains(fileName)) {
                    index = 1;
                   array = readRecipes2(randFile2(recipeList, index));
                    for(String str: array) {
                        output.write(str);
                        ((BufferedWriter) output).newLine();
                    }
                }

                else if(getFileName.contains(fileName)) {
                    index = 2;
                    array = readRecipes2(randFile2(recipeList, index));
                    for(String str: array) {
                        output.write(str);
                        ((BufferedWriter) output).newLine();
                    }
                }
                output.close();


            } catch (IOException e) {
                System.out.println("File Creation Unsuccessful");
                e.printStackTrace();
            }

            //load the files into intellij through a cloud system
            //google drive, dropbox,

        }

    }


    public String randFile2(ArrayList<File> recipes, int index) {
        addChickenRecipes();

        String randomFile;
        randomFile = String.valueOf(recipes.get(index));

        return randomFile;
    }

    public String[] readRecipes2(String randomRecipe) throws IOException, InterruptedException {

        ArrayList<String> listOfStrings
                = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(randomRecipe + ".txt"));

        String line = br.readLine();
        while (line != null) {

            listOfStrings.add(line);
            line = br.readLine();


        }

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }


    public void getChickenRecipes() {
        //calling add recipe method to populate array
        //this adds bounds for the random value
        addChickenRecipes();
        //override parent class method to read chicken files array
        //and randomise file to print out

        try {
            readRecipes2(randFile2(chickenFiles, 0));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ;
    }

    public void getBeefRecipes() {
        addBeefRecipes();
        try {
            readRecipes(randFile(beefFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void getPorkRecipes() {
        addPorkRecipes();
        try {
            readRecipes(randFile(porkFiles));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
