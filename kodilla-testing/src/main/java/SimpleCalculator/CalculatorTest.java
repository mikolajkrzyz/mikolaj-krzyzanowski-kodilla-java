package SimpleCalculator;
import SimpleCalculator.FirstCalculator;
public class CalculatorTest {
    public static void main(String[] args) {
        FirstCalculator simpleCalculator = new FirstCalculator();
        double sum = simpleCalculator.add(4, 5);
        if (sum == 9) {
            System.out.println("Super");
        } else {
            System.out.println("Nie udało się");
        }
        FirstCalculator simpleCalculator2 = new FirstCalculator();
        double summary = simpleCalculator2.add(12, 4);
        if (summary == 8) {
            System.out.println("brawo");
        } else {
            System.out.println("coś poszło nie tak");
        }
    }
}


