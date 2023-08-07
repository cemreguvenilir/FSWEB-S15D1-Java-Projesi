package model;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class MarketCar {
    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
    public static void addItems(List<String> groceryList){
        System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
        String input = getInput();

        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements){
                if(element != null && !element.trim().isEmpty()){
                    if(!checkItemIsInList(groceryList, element)){
                        groceryList.add(element.trim());

                    }
                }
            }

        } else {
            if(input != null && !input.isEmpty()){
                groceryList.add(input);
            }
        }
        printSorted(groceryList);
    }
    public static void removeItems(List<String> groceryList){
        System.out.println("Çıkarılmasını istediğiniz elemanları giriniz.");
        String input = getInput();
        if(input.contains(",")){
            String[] elements = input.split(",");
            for(String element: elements){
                if(element != null && !element.trim().isEmpty()){
                    if(checkItemIsInList(groceryList, element)){
                        groceryList.remove(element.trim());

                    }
                }
            }

        } else {
            if(input != null && !input.isEmpty()){
                groceryList.remove(input);
            }
        }
        printSorted(groceryList);
    }
    public static boolean checkItemIsInList(List<String> items, String item){
        return items.contains(item.trim());
    }
    public static void printSorted(List<String> items){
        Collections.sort(items);
        for(String item : items){
            System.out.println(item);
        }

    }

}


