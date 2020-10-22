/**
 * Calculates circumference and area of the circle
 */
public class CircleTotalizer {
    private double radius;
    public CircleTotalizer(double radius){
        this.radius = radius;
    }

    public double perimeterTotalizer(){
        return radius*4;
    }

    public double areaTotalizer(){
        return radius*radius;
    }
}
