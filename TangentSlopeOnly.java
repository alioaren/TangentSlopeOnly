public class TangentSlopeOnly {

    public static double f(double x) {
        return Math.pow(x, 2); // f(x) = x^2
    }
    //تابع مشتقو برگردونه
    public static double calculateSlope(double t) {
        double h = 0.00001;
        return (f(t + h) - f(t)) / h;
    }

    public static void main(String[] args) {
        System.out.println("Tangent Slope Values from t = -6 to 6:");
        //صرفا برای حفظ ظاهر
        System.out.println("=====================================================");

        System.out.printf("%-5s | %-12s | %-10s\n", "t", "Point (x,y)", "Slope (m)");
        //صرفا برای حفظ ظاهر
        System.out.println("=====================================================");

        for (double t = -6; t <= 6; t++) {
            double y = f(t);
            double m = calculateSlope(t);


            System.out.printf("%-5.1f | (%.1f, %.1f) | %.2f\n", t, t, y, m);
        }
    }
}