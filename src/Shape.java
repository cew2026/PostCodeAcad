
public class Shape {
    public static void main(String[] args) {
        String color = "Red";
        boolean filled = true;


    class Circle extends Shape {
        public void areaOfCircle() {

            int radius = 3;
            double areaOfCircle = (3.14 * (radius * radius));
            System.out.println("the area of circle is " + areaOfCircle);
        }

    }

    class Rectangle extends Shape {
        int width = 4;
        int height = 2;
    }
}
}

