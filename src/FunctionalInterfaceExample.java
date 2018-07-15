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
                    default: return "default number found";
                }
            }
        };
        String text = numberToText.apply(2);
        System.out.println("Number to text: " + text);

        Function<String, Integer> wordCountFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.split(" ").length;
            }
        };

        //Functional Interface chaining example
        String stringOutput = wordCountFunction.andThen(numberToText).apply("Whats this");
        System.out.println("stringOutput: " + stringOutput);

        //Functional Interface compose example
        Integer integerOutput = wordCountFunction.compose(numberToText).apply(4);
        System.out.println("integerOutput: " + integerOutput);

    }

}
