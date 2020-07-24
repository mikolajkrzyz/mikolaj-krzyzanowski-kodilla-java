package SimpleCalculator;
import SimpleCalculator.FirstCalculator;
public class CalculatorTest {
    public static void main(String[] args) {
        FirstCalculator simpleCalculator = new FirstCalculator();

        System.out.println(simpleCalculator.add(4, 5));
        System.out.println(simpleCalculator.subtract(12, 4));
    }

}
