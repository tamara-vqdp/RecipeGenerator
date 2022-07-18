import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBook {

    private String randomFile;
    private Random rand = new Random();


    public File[] getFileName(String file) {

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

    //using parameters to get the file names from folder, choose from file from arraylist and pass in name of files
    public void createFiles(File[] arrays, ArrayList<File> recipeList, String filePath, String fileNameOne, String fileNameTwo, String fileNameThree) throws InterruptedException, IOException {

        //for each loop to go through every file in the array
        for (File file2 : arrays) {
            //assign filename to a string to pass it through filewriter method
            String getFileName = file2.getName();

            //declare variable index to go through chicken files array
            // and write each recipe to matching file name
            int index = 0;
            //declare array to grab return value from read recipes method
            String[] array;
            try {
                File f = new File(filePath + "\\" + getFileName);
                FileWriter writer = new FileWriter(f);
                Writer output = new BufferedWriter(writer);


                //check for filename
                if (getFileName.contains(fileNameOne)) {
                    //reassign value of index to corresponding file recipe
                    index = 0;
                    //reassign array to
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    for (String str : array) {
                        output.write(str);
                        ((BufferedWriter) output).newLine();
                    }
                } else if (getFileName.contains(fileNameTwo)) {
                    index = 1;
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    for (String str : array) {
                        output.write(str);
                        ((BufferedWriter) output).newLine();
                    }
                } else if (getFileName.contains(fileNameThree)) {
                    index = 2;
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    for (String str : array) {
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

    public String selectingRecipesToRead(ArrayList<File> recipes, int index) {

        String fileSelection;
        fileSelection = String.valueOf(recipes.get(index));

        return fileSelection;
    }

//this method will read the recipe from my computer
    //this method will then be used to write to the files created 
    public String[] readRecipes(String selectedFile) throws IOException, InterruptedException {

        ArrayList<String> listOfStrings
                = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(selectedFile + ".txt"));

        String line = br.readLine();
        while (line != null) {

            listOfStrings.add(line);
            line = br.readLine();


        }

        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String randomFile(String directoryPath) {
        Random rand = new Random();
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        File file = files[rand.nextInt(files.length)];
        String filename = file.toString();
        return filename;

    }

    public void readRandomRecipes(String selectedFile) throws IOException, InterruptedException {

        ArrayList<String> listOfStrings
                = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(selectedFile));

        String line = br.readLine();
        while (line != null) {

            listOfStrings.add(line);
            line = br.readLine();


        }

        String[] array
                = listOfStrings.toArray(new String[0]);

        for(String str : array) {
            System.out.println(str);
        }


    }


}


