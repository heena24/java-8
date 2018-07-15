import java.util.function.Function;

public class FunctionalInterfaceExample {

    public static void main(String[] ars)
    {
        Function<Integer, String> numberToText = new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) {
                switch (integer)
                {
                    case 0: return "zero";
                    case 1: return "one";
                    case 2: return "two";
                    default: return "default";
                }
            }
        };

        String text = numberToText.apply(2);
        System.out.println("Number to text: " + text);
    }

}
