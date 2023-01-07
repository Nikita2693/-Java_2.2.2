public class BmiService {
    public double calculate(double weight, double height) {

        if (height <= 0) return 0;

        return weight / Math.pow(height, 2);
    }
}