package strategy;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("mustikka", "banaani", "peruna", "mansikka", "vadelma", "sukka");

        ListConverter converter = new ListConverterThing(1);
        System.out.println(converter.listToString(list));

        converter = new ListConverterThing(2);
        System.out.println(converter.listToString(list));

        converter = new ListConverterThing(3);
        System.out.println(converter.listToString(list));
    }
    
}
