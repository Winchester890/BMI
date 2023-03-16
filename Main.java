import Data.Data;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------ BMI calculator ------");
        System.out.print("What's your weight? (in kg) ");
        float weight = Float.parseFloat(scanner.next());
        System.out.print("What's your height? (in meters) ");
        float height = Float.parseFloat(scanner.next());
        float bmi = (float) (weight / (height * height));

        Data data = new Data();
        data.setWeight(weight);
        data.setHeight(height);
        data.setBmi(bmi);

        System.out.println(" ");
        System.out.println("Your results:");
        System.out.println("Weight: " + data.getWeight() + " kg");
        System.out.println("Height: " + data.getHeight() + " m");
        if (bmi < 18.5) {
            System.out.println("Your BMI is: " + data.getBmi() + " - Under weight!");
            System.out.println("We recommend you to eat more pizza.");
        }
        if (bmi > 18.5 && bmi < 25) {
            System.out.println("Your BMI is: " + data.getBmi() + " - Normal weight!");
            System.out.println("Keep with your healthy diet.");
        }
        if (bmi > 25 && bmi < 30) {
            System.out.println("Your BMI is: " + data.getBmi() + " - Over weight!");
            System.out.println("We recommend you to seek a nutritionist.");
        }
        if (bmi > 30) {
            System.out.println("Your BMI is: " + data.getBmi() + " - Obese!");
            System.out.println("Start to take care of yourself, before it's late.");
        }
    }
}

