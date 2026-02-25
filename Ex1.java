package spring;

@FunctionalInterface
interface Power {
    double calculate(double x, double y);
}

public class Ex1 {

    public static void main(String[] args) {

        Power power = (x, y) -> Math.pow(x, y);

        System.out.println(power.calculate(5, 2)); 
    }
}