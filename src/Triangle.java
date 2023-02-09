/**
 * @class: CompareTwoCities
 * @date: 07 February 2023
 * @
 */






import java.util.Scanner;
public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.println("Enter the second city: ");
        String city2 = input.nextLine();

        if(city1.compareToIgnoreCase(city2)< 0 ){
            System.out.println("The cities in order are " + city1 + ", " + city2);
        }
        else{
            System.out.println(city2 + " " + city1);
        }
    }
}
