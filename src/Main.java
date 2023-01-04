public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weight = 90;
        double height = 1.68;
        double total = service.calculate(weight, height);
        System.out.println(total);

    }
}