package src;
public class SampleClass {
    public static void main(String[] args) {
        String x = "Hello World";
        System.out.println(x);
        System.out.println("This is fun");
        // greetings();
        // Increment();
        okay();
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

    public static void random() {
        int num;
        String animal = "Dogg";
        String car = "Honda";
        String full_name = "Mike Hunter";
    }

    public static void okay() {
        String x = "Mike";
        int y = 20;
        int z = 62;
        System.out.println(y + z);
        boolean isColdToday = true;
        String food = "spaghetti";
        char sex = 'm';
        System.out.println(x + " is a boy who is " + y + " and likes " + food);
    }
}
