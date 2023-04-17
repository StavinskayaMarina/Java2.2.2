public class BmiService {
    public double calculate(double heft, double stature) {
        double result = heft / (stature * stature);

        return result;
    }
}
