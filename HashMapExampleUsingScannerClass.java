package com.example.training.Collections;
//we perform the sum of food items ordered by customer until he stops the order ,it has to continue
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExampleUsingScannerClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> menu = new HashMap<>();

        // Menu items
        menu.put("Biryani", 450);
        menu.put("Mutton", 500);
        menu.put("Fish Fry", 650);
        menu.put("Roasted Fish", 650);

        int sum = 0;
        String choice = "";

        System.out.println("Tell me what is your order (type 'stop ' to finish):");

        while(true) {
            choice = sc.nextLine();
             //To check condition when it stops then break it
            if(choice.equalsIgnoreCase("stop")) {
                break;
            }

            if(menu.containsKey(choice)) {
                System.out.println("This is your ordered food item: " + choice);
                sum += menu.get(choice);
            } else {
                System.out.println("This food item is not available in our hotel");
            }
        }
        System.out.println("Total bill = " + sum);
     
        sc.close();
    }
}
/*
Tell me what is your order (type 'stop' to finish):
Roasted Fish
This is your ordered food item: Roasted Fish
Fish Fry
This is your ordered food item: Fish Fry
Mutton
This is your ordered food item: Mutton
stop
Total bill = 1800
*/