
public class Cylinder {
    public static double getArea(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double Area = perimeter * height + 2 * baseArea;
        return Area;
    }

    private static double getPerimeter(int radius) {
        double perimeter = 2 * Math.PI  * radius;
        return perimeter;
    }

    private static double getBaseArea(int radius) {
        double baseArea = Math.PI * radius * radius;
        return baseArea;
    }
}