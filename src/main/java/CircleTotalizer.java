/**
 * Calculates circumference and area of the circle
 */
public class CircleTotalizer {
    private double radius;
    public CircleTotalizer(double radius){
        this.radius = radius;
    }

    public double perimeterTotalizer(){
        return 2*Math.PI*radius;
    }

    public double areaTotalizer(){
        return Math.PI*radius*radius;
    }
}
