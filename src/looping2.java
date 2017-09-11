import java.util.Scanner;

public class looping2 {
    public static void main(String[] args){
        int youPick;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pick your Boozy Ice Cream: ");
            System.out.println("1: Dark Chocolate Whiskey Salted Caramel");
            System.out.println("2: Spiked Mint Chocolate Chip");
            System.out.println("3: Maple Bacon Bourbon");
            System.out.println("4: Tequila Mexican Hot Chocolate");
            System.out.println("5: Vanilla Bean Bourbon");
            youPick = scanner.nextInt();

        } while (Integer.valueOf(youPick) == null);
        switch (youPick){
            case 1:
                System.out.println("You have picked: Dark Chocolate Whiskey Salted Caramel");
                break;

            case 2:
                System.out.println("You have picked: Spiked Mint Chocolate Chip");
                break;

            case 3:
                System.out.println("You have picked: Maple Bacon Bourbon");
                break;

            case 4:
                System.out.println("You have picked: Tequila Mexican Hot Chocolate");
                break;

            case 5:
                System.out.println("You have picked: Vanilla Bean Bourbon");
                break;

            default:
                System.out.println("That is not an option on the menu");
                break;
        }
    }
}
