import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        double perimeter = 0, area = 0, side = 0;
        String choice;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please type in a shape name you're interested in knowing the totals of.\n" +
                "Available choices: square, circle.");
        choice = scanner.nextLine();
        switch(choice){
            case "square":
                System.out.println("Please input the side length:");
                side = Double.parseDouble(scanner.nextLine());
                SquareTotalizer squareTotalizer = new SquareTotalizer(side);

                perimeter = squareTotalizer.perimeterTotalizer();
                area = squareTotalizer.areaTotalizer();
                System.out.print("Square's");
                break;
            case "circle":
                System.out.println("Please input the radius length:");
                side/*(radius)*/ = Double.parseDouble(scanner.nextLine());
                CircleTotalizer circleTotalizer = new CircleTotalizer(side);

                perimeter = circleTotalizer.perimeterTotalizer();
                area = circleTotalizer.areaTotalizer();
                System.out.print("Circle's");
                break;
        }
        System.out.println(" totals are as follows:\n" +
                "perimeter is equal to " + perimeter + "\n" +
                "area is equal to " + area);
    }
}
