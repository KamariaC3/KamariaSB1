import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println(name);
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double spice3 = Math.pow(spice,3);
        double fraction = 4.0/3;
        double sqrts = Math.sqrt(5);
        double power = sqrts/spice3;
        double result = fraction * Math.pow(2,power);
        System.out.println("Well Jean Claude, the spice value resulted in " + result);
        System.out.println("And the converted value is "+(Math.round(result*100))/100.0);
    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        double wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        double wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        double area = wallHeight * wallWidth;
        System.out.println("Wall area: " + ((double) area) + " square feet" );
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        double gallons = area/350;
        String result = String.format("%.2f",Math.round(gallons*100)/100.0);
        System.out.println("Paint needed: " + result + " gallons");
        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer
        System.out.println("Cans needed: " + (int)Math.ceil(gallons) + " can(s)");
    }
}
