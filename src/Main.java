import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private String input;
    private Meat readMeatRecipes = new Meat();



    public static void main(String[] args) throws IOException, InterruptedException {

        Main main = new Main();
        main.mainMenu();


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
        System.out.println("\nPlease Choose A Food Category");

        System.out.println("""
                1: Meat\s
                2: Vegetarian
                3: Vegan
                """);

        input = scanner.next();

        switch (input) {
            case "1":
                displayMeatRecipes();
                break;

            case "2":
                displayVegRecipes();
                break;

            case "3":
                displayVeganRecipes();
                break;

        }

    }

    public void displayMeatRecipes() throws IOException, InterruptedException {

        System.out.println("\nPlease Choose A Meat Option");

        System.out.println("""
                1: Chicken\s
                2: Beef
                3: Lamb
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
        Thread.sleep(700);
        displayMeatRecipes();
    }

    public void displayBeefRecipes() throws IOException, InterruptedException {
        System.out.println("\nLunch Time!");
        System.out.println("Finding Recipe....\n");
        Thread.sleep(2000);
        readMeatRecipes.getBeefRecipes();
        Thread.sleep(200);
        displayMeatRecipes();
    }

    public void displayPorkRecipes() {
        System.out.println("Nothing Here Yet");
    }

    public void displayVegRecipes() {
        System.out.println("Nothing Here Yet");
    }

    public void displayVeganRecipes() {
        System.out.println("Nothing Here Yet");

    }


}



