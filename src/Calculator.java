import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    Predicate<Integer> isPositive = x -> x > 0;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y; /* В данном примере может возникнуть исключение
    ArithmeticException, если "y" будет равен 0; Поэтому предлагается выполнить проверку переменной "y" на равенство 0,
    и если это равенство истинно, то результатом деления будет принят 0.
    */

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Consumer<Integer> println = System.out::println;



}
