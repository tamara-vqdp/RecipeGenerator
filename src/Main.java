import java.io.*;
import java.util.Scanner;

public class Main {

    private final Scanner scanner = new Scanner(System.in);
    private String input;

    public static void main(String[] args) throws IOException {

        Main main = new Main();
        main.mainMenu();

    }

    public void mainMenu() throws IOException {
        System.out.println("\n");
        System.out.println("===================================================");
        System.out.println("====== Welcome to Tamara's Recipe Generator! ======");
        System.out.println("===================================================");
        System.out.println("\n");


        System.out.println("Ever Struggled To Think Of Lunch Ideas Under 30 Minutes?\n"
                + "Well Look No Further! With Different Food Categories Available, We Can Cater To Your Needs");

        foodChoices();


    }


    public void foodChoices() throws IOException {
        System.out.println("\nPlease Choose A Food Category");

        System.out.println("""
                1: Chicken\s
                2: Beef
                3: Vegetarian
                4: Vegan
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
                displayVegRecipes();
                break;

            case "4":
                displayVeganRecipes();
                break;

        }

    }

    public void displayChickenRecipes() throws IOException {

        System.out.println("\nHere Are Two Chicken Recipes 30 Minutes And Under\n");
        ReadFile readChicken = new ReadFile();
        readChicken.readChickenRecipes2();
        foodChoices();
    }

    public void displayBeefRecipes() throws IOException {
        ReadFile readBeef = new ReadFile();
        readBeef.readBeefRecipes();
        foodChoices();
    }

    public void displayVegRecipes() {
        System.out.println("Nothing Here Yet");
    }

    public void displayVeganRecipes() {
        System.out.println("Nothing Here Yet");

    }


}



