package anonymousClass;

public class Test {
    public static void main(String[] args) {
        doMath(new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 * arg2;
            }
        }, 2, 3);

        Math adder = new Math() {
            @Override
            public double calculate(double arg1, double arg2) {
                return arg1 + arg2;
            }
        };

        doMath(adder, 2, 3);
    }

    public static void doMath(Math math, double arg1, double arg2) {
        System.out.println(math.calculate(arg1, arg2));
    }
}
