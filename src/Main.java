public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(5, 5);
        int b = calculator.minus.apply(12, 6);
        int c = calculator.devide.apply(30, 0);
        int d = calculator.abs.apply(-10);
        int e = calculator.pow.apply(2);

        calculator.println.accept(a);
        calculator.println.accept(b);
        calculator.println.accept(c);
        calculator.println.accept(d);
        calculator.println.accept(e);
    }
}
