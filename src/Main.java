public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 73;
        double height = 165;
        String resultHeight = String.format("%.0f",height);

        double heightMeter = service.calculate(height);

        double heightMeterDouble = heightMeter * heightMeter;
        double bmi = weight / heightMeterDouble;

        String resultBmi = String.format("%.1f",bmi);

        System.out.println("Ваш Вес, кг: " + weight);
        System.out.println("Ваш рост, см: " + resultHeight);
        System.out.println("Ваш ИМТ: " + resultBmi);
    }
}
