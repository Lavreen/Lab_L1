/**
 * Calculates perimeter and area of the square.
 */
public class SquareTotalizer {
    private double side;
    public SquareTotalizer(double side){
        this.side = side;
    }

    public double perimeterTotalizer(){
        return side*4;
    }

    public double areaTotalizer(){
        return side*side;
    }
}
