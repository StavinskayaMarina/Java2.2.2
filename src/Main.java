public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 48; // масса
        double height = 1.63;  // рост в метрах
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}