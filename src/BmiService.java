public class BmiService {
    public double calculate(double weight, double height) {
        double bmi = weight * 10_000 / Math.pow(height, 2);
        return bmi;
    }
}