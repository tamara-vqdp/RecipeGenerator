import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class RecipeBook {


    public File[] getFileName(String file) {

        //get the pathname of any file directory
        File folder = new File(file + "");
        //create array of files to store the folder and its contents
        File[] listOfFiles = folder.listFiles();


        //for loop goes through each value of the array
        // value being the files in the folder
        for (File listOfFile : listOfFiles) {
            //checks if item in array is a file
            if (listOfFile.isFile()) {
                //gets the name of each file in array
                listOfFile.getName();
            }
            //assign this value to temp
            String temp = listOfFile.getName();
        }
        //return value of temp
        return listOfFiles;

    }

    //using parameters to get the file names from folder, choose from file from arraylist and pass in name of files
    public void createFiles(File[] arrays, ArrayList<File> recipeList, String filePath, String fileNameOne, String fileNameTwo, String fileNameThree) throws InterruptedException, IOException {

        //for each loop to go through every file in the array
        for (File file2 : arrays) {
            //assign filename to a string to pass it through fileWriter method
            String getFileName = file2.getName();

            //declare variable index to go through chicken files array
            // and write each recipe to matching file name
            int index;
            //declare array to grab return value from read recipes method
            String[] array;
            try {
                //adding files from my computer directory to directory created in intelliJ
                File f = new File(filePath + "\\" + getFileName);
                FileWriter writer = new FileWriter(f);
                BufferedWriter output = new BufferedWriter(writer);

                //check for filename
                if (getFileName.contains(fileNameOne)) {
                    //reassign value of index to corresponding file recipe
                    index = 0;
                    //reassign array to method
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    //use for each to print every line of the file to the corresponding recipe
                    //then write these lines to the files created
                    for (String str : array) {
                        output.write(str);
                        output.newLine();
                    }
                } else if (getFileName.contains(fileNameTwo)) {
                    index = 1;
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    for (String str : array) {
                        output.write(str);
                        output.newLine();
                    }
                } else if (getFileName.contains(fileNameThree)) {
                    index = 2;
                    array = readRecipes(selectingRecipesToRead(recipeList, index));
                    for (String str : array) {
                        output.write(str);
                        output.newLine();
                    }
                }
                output.close();


            } catch (IOException e) {
                System.out.println("File Creation Unsuccessful");
                e.printStackTrace();
            }

            //load the files into intellij through a cloud system
            //Google Drive, dropbox,

        }

    }

    public String selectingRecipesToRead(ArrayList<File> recipes, int index) {

        //select file from each array list created in the classes, each index will have a file
        String fileSelection;
        fileSelection = String.valueOf(recipes.get(index));

        return fileSelection;
    }

//this method will read the recipe from my computer
    //this method will then be used to write to the files created
    public String[] readRecipes(String selectedFile) throws IOException {

        //files will be read into an arraylist of strings
        ArrayList<String> listOfStrings
                = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(selectedFile + ".txt"));

        String line = br.readLine();
        while (line != null) {
            //each line will be added to arraylist line by line
            listOfStrings.add(line);
            line = br.readLine();


        }

        //convert arraylist to array to easily be read
        String[] array
                = listOfStrings.toArray(new String[0]);

        return array;
    }

    public String randomFile(String directoryPath) {
        Random rand = new Random();

        //Create an array of the files within the given directory using File.listFiles().
        File dir = new File(directoryPath);
        File[] files = dir.listFiles();
        //use random method and the bound, in this case, is the amount of files in the array
        File file = null;
        if (files != null) {
            file = files[rand.nextInt(files.length)];
        }
        //create variable to get the random file name in string format
        //return variable to be used in another method
        String fileName = "";
        if (file != null) {
            fileName = file.toString();
        }

        return fileName;

    }

    public void readRandomRecipes(String selectedFile) throws IOException {

        //create array list to transfer lines read
        ArrayList<String> list
                = new ArrayList<>();
        //Reading text from a character-input stream
        //selected file will be variable from randomFile method
        BufferedReader br = new BufferedReader(new FileReader(selectedFile));

        String line = br.readLine();
        while (line != null) {
            //random file will then be read line by line
            //each line will be added to the arraylist
           list.add(line);
           line = br.readLine();



        }

        //convert array list to an array for easier readability
        String[] array
                = list.toArray(new String[0]);

        //prints out array contents line by line

        for(String str : array) {
            System.out.println(str);
        }


    }


}


