package mypack;

import java.util.Scanner;

public class javaproject {
     int Code;
     String FoodName;
     String Sticker;
     String FoodType;

    // Function to assign FoodType based on Sticker
    public void GetType() {
        switch (Sticker.toLowerCase()) {
            case "green":
                FoodType = "Vegetarian";
                break;
            case "yellow":
                FoodType = "Contains Egg";
                break;
            case "red":
                FoodType = "Non Vegetarian";
                break;
            default:
                FoodType = "Unknown";
                break;
        }
    }

    // Function to enter values for Code, FoodName, Sticker and call GetType()
    public void FoodIn() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Code: ");
        Code = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        System.out.print("Enter Food Name: ");
        FoodName = scanner.nextLine();

        System.out.print("Enter Sticker (Green/Yellow/Red): ");
        Sticker = scanner.nextLine();

        // Assign FoodType based on Sticker
        GetType();
    }

    // Function to view the content of all the data given the code
    public void FoodOut() {
        System.out.println("Code: " + Code);
        System.out.println("Food Name: " + FoodName);
        System.out.println("Sticker: " + Sticker);
        System.out.println("Food Type: " + FoodType);
    }

    public static void main(String[] args) {
        javaproject supply = new javaproject();
        supply.FoodIn();
        supply.FoodOut();
    }
}