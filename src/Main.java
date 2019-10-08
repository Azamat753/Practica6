public class Main {

    public static void main(String[] args) {
        Box<Double, Integer> box1 = new Box<>(2.5, 6);
        Box<Float, Float> box2 = new Box<>(3.5f, 6.2f);
        addition(box1, box2);
        multiplacation(box1, box2);

    }

    public static void addition(Box<? extends Number, ? extends Number> a, Box<? extends Number, ? extends Number> b) {
        System.out.println(a.number1.doubleValue() + a.number2.doubleValue() + b.number1.doubleValue() + b.number2.doubleValue());
    }

    public static void multiplacation(Box<? extends Number, ? extends Number> a, Box<? extends Number, ? extends Number> b) {
        System.out.println(a.number1.doubleValue() * a.number2.doubleValue() * b.number1.doubleValue() * b.number2.doubleValue());
    }
}
