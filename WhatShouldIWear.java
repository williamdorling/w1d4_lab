import java.util.Scanner;
public class WhatShouldIWear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        prompt user to describe weather conditions
        System.out.println("What is the weather today?");

//        Collect user input
        String weather = sc.nextLine();

//        prompt user to input day's temperature
        System.out.println("What is the temperature today?");

//        Collect user input
        int temperature = sc.nextInt();

//        return clothing suggestions based on the above
        if (weather.equalsIgnoreCase("rainy") || weather.equalsIgnoreCase("snow")) {
            System.out.println("wear a waterproof coat");
        } else if (weather.equalsIgnoreCase("sunny") && temperature > 20){
            System.out.println("wear a sunhat and suncream");
        } else if (weather.equalsIgnoreCase("cloudy") || temperature < 8){
            System.out.println("wear a woolly hat");
        } else if (weather.equalsIgnoreCase("sunny")) {
            System.out.println("wear sunglasses");
        } else {
            System.out.println("Please check your spelling");
        }
    }
}
