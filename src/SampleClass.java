package src;
public class SampleClass {
    public static void main(String[] args) {
        String x = "Hello World";
        System.out.println(x);
        System.out.println("This is fun");
        greetings();
        Increment();
    }

    public static void greetings() {
        String name = "Rougekid";
        System.out.println("Welcome to the java playzone " + name);
    }

    public static void Increment() {
        int val = 0;
        for(int i = 0; i < 11; i++) {
            val = i;
            System.out.println(val);
        }
    }

    public static void random() {}
}
