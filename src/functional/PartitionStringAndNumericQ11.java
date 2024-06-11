package functional;

import java.util.stream.Collectors;

public class PartitionStringAndNumericQ11 {
    public static void main(String[] args) {
        /*
        Given an alphanumeric string;
        how to get the alphabet string and numeric string from that string separately using java stream
         */
        String str = "ab1c4de3f2";
        String aplaString = str.chars()
                .filter(Character::isLetter)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String numString = str.chars()
                .filter(Character::isDigit)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println(aplaString + " - " + numString);
    }
}
