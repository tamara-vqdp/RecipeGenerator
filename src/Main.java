import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private String input;
    private Meat readMeatRecipes = new Meat();
    private Veg readVegRecipes = new Veg();

    ArrayList<File> chickenFiles = readMeatRecipes.getChickenList();
    ArrayList<File> beefFiles = readMeatRecipes.getBeefList();
    ArrayList<File> porkFiles = readMeatRecipes.getPorkList();
    
    public static void main(String[] args) throws IOException, InterruptedException {

        Main main = new Main();
        main.mainMenu();


    }


    public void createDirectory() {


        try {

            Path pathOne = Paths.get("D:\\Users\\Student\\Documents\\ChickenRecipes");
            Path pathTwo = Paths.get("D:\\Users\\Student\\Documents\\BeefRecipes");
            Path pathThree = Paths.get("D:\\Users\\Student\\Documents\\PorkRecipes");
            Path pathFour = Paths.get("D:\\Users\\Student\\Documents\\VegRecipes");
            Path pathFive = Paths.get("D:\\Users\\Student\\Documents\\VeganRecipes");

            Files.createDirectories(pathOne);
            Files.createDirectories(pathTwo);
            Files.createDirectories(pathThree);
            Files.createDirectories(pathFour);
            Files.createDirectories(pathFive);


            System.out.println("Directories Created For Recipe Management!");

            //Files.createDirectory(path);

        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
        }
    }

    public void createRecipeFiles() {
        String dirName1 = "D:\\Users\\Student\\Documents\\ChickenRecipes\\";
        String dirName2 = "D:\\Users\\Student\\Documents\\BeefRecipes\\";
        String dirName3 = "D:\\Users\\Student\\Documents\\PorkRecipes\\";
        String dirName4 = "D:\\Users\\Student\\Documents\\VegRecipes\\";
        String dirName5 = "D:\\Users\\Student\\Documents\\VeganRecipes\\";
        String[] files = {"RecipeOne.txt", "RecipeTwo.txt", "RecipeThree.txt"};


        try{

            for(int i = 0; i < files.length; i++) {
                File file1 = new File(dirName1 + files[i]);
                File file2 = new File(dirName2 + files[i]);
                File file3 = new File(dirName3 + files[i]);
                File file4 = new File(dirName4 + files[i]);
                File file5 = new File(dirName5 + files[i]);

                file1.createNewFile();
                file2.createNewFile();
                file3.createNewFile();
                file4.createNewFile();
                file5.createNewFile();


            }
            System.out.println("Files Created For Recipe Storage!");

        }catch(Exception e){
            System.out.println("Could not create file");
        }


    }

    public void mainMenu() throws IOException, InterruptedException {
        createDirectory();
        createRecipeFiles();
        System.out.println("\n");
        System.out.println("===================================================");
        System.out.println("====== Welcome to Tamara's Recipe Generator! ======");
        System.out.println("===================================================");
        System.out.println("\n");


        System.out.println("Ever Struggled To Think Of Lunch Ideas Under 30 Minutes?\n"
                + "Well Look No Further! With Different Food Categories Available, We Can Cater To Your Needs");

        foodChoices();


    }


    public void foodChoices() throws IOException, InterruptedException {
        System.out.println("\nPlease Choose A Food Category");

        System.out.println("""
                1: Meat\s
                2: Vegetarian
                3: Vegan
                """);

        input = scanner.next();

        switch (input) {
            case "1":
                displayMeatOptions();
                break;

            case "2":
                displayVegRecipes();
                break;

            case "3":
                displayVeganRecipes();
                break;

        }

    }

    public void displayMeatOptions() throws IOException, InterruptedException {

        System.out.println("\nPlease Choose A Meat Option");

        System.out.println("""
                1: Chicken\s
                2: Beef
                3: Pork
                4: Back To Food Choices
                """);

        input = scanner.next();

        switch (input) {
            case "1":
                displayChickenRecipes();
                break;

            case "2":
                displayBeefRecipes();
                break;

            case "3":
                displayPorkRecipes();
                break;

            case "4":
                foodChoices();
                break;

        }

    }



    public void displayChickenRecipes() throws IOException, InterruptedException {

        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(2000);
        readMeatRecipes.getChickenRecipes();
        Thread.sleep(500);
        displayMeatOptions();
    }

    public void displayBeefRecipes() throws IOException, InterruptedException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(2000);
        readMeatRecipes.getBeefRecipes();
        Thread.sleep(500);
        displayMeatOptions();
    }

    public void displayPorkRecipes() throws InterruptedException, IOException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(2000);
        readMeatRecipes.getPorkRecipes();
        Thread.sleep(500);
        displayMeatOptions();
    }

    public void displayVegRecipes() {
        System.out.println("Nothing Here Yet");
    }

    public void displayVeganRecipes() {
        System.out.println("Nothing Here Yet");

    }


}



