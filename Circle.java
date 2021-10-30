public class Circle {

    public static double getLength(double r) {

        return 2 * Math.PI * r;
    }

    public static double getArea(double r) {

        return Math.PI * Math.pow(r, 2);
    }

    public static void main(String[] args) {
        double r = 5.0;
        System.out.printf("半径为%f的圆，其周长为%.2f，面积为%.2f。%n", r, getLength(r), getArea(r));
    }
}

