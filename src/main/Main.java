package main;

import model.MarketCar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> groceryList = new ArrayList<>();
        startGrocery(groceryList);


    }
    public static void startGrocery(List<String> groceryList){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("İşlem giriniz");
                int process = scanner.nextInt();
                if(process <0 || process >2){
                    System.out.println("0 ve 2 arasında bir rakam giriniz.");
                }
                if (process == 0){
                    System.exit(0);
                }
                if(process == 1) {
                    MarketCar.addItems(groceryList);

                }
                if (process == 2){
                    MarketCar.removeItems(groceryList);
                }
            } catch (Exception ex){
                System.out.println("invalid process" + ex.getMessage());
                break;
            }

        }


    }
}
