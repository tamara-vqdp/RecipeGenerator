import java.io.*;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private String input;
    private final Meat  meatRecipes = new Meat();
    private final Veg vegRecipes = new Veg();
    private final Vegan veganRecipes = new Vegan();


    public static void main(String[] args) throws IOException, InterruptedException {

        Main main = new Main();
        main.initialiseApp();


    }


    public void initialiseApp() throws InterruptedException, IOException {

        //thread sleeps added throughout to display content in a smoother way

        System.out.println("\n");
        System.out.println("====== Initialising App..... ======");
        Thread.sleep(700);
        System.out.println("====== Please Wait.........  ======");
        Thread.sleep(700);
        System.out.println("====== Creating Files..... ======");
        //calling createfile methods from each class
        meatRecipes.creatingChickenFiles();
        meatRecipes.creatingBeefFiles();
        meatRecipes.creatingPorkFiles();
        vegRecipes.creatingVeggieFiles();
        veganRecipes.creatingVeganFiles();
        Thread.sleep(700);
        System.out.println("\n");

        mainMenu();

    }


    public void mainMenu() throws IOException, InterruptedException {
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
        Thread.sleep(300);
        System.out.println("\nPlease Choose A Food Category");

        System.out.println("""
                1: Meat\s
                2: Vegetarian
                3: Vegan
                4: Exit Program
                """);

        input = scanner.next();

        do {
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
                default:
                    if (!input.equals("4")) {
                        System.out.println("Please Enter A Valid Number");
                        Thread.sleep(300);
                        mainMenu();
                    }

            }

        }while(!input.equals("4"));

    }

    public void displayMeatOptions() throws IOException, InterruptedException {
        Thread.sleep(300);

        System.out.println("\nPlease Choose A Meat Option");

        System.out.println("""
                1: Chicken\s
                2: Beef
                3: Pork
                4: Back To Food Choices
                5: Exit To Main Menu
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
            case "5":
                mainMenu();
                break;
            default:
                if (!input.equals("5")) {
                    System.out.println("Please Enter A Valid Number");
                    Thread.sleep(300);
                    displayMeatOptions();
                }

        }

    }


    public void displayChickenRecipes() throws IOException, InterruptedException {

        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(3000);
        meatRecipes.getRandomChickenRecipes();
        Thread.sleep(1000);
        displayMeatOptions();
    }

    public void displayBeefRecipes() throws IOException, InterruptedException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(3000);
        meatRecipes.getRandomBeefRecipes();
        Thread.sleep(1000);
        displayMeatOptions();
    }

    public void displayPorkRecipes() throws InterruptedException, IOException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(3000);
        meatRecipes.getRandomPorkRecipes();
        Thread.sleep(1000);
        displayMeatOptions();
    }

    public void displayVegRecipes() throws InterruptedException, IOException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(3000);
       vegRecipes.getRandomVegRecipes();
        Thread.sleep(1000);
        foodChoices();
    }

    public void displayVeganRecipes() throws InterruptedException, IOException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(3000);
        veganRecipes.getRandomVeganRecipes();
        Thread.sleep(1000);
        foodChoices();

    }


}




