package functional;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumbersQ8 {
    public static void main(String[] args) {
        /*
        Question: Generate a list of 10 random integers using streams.
         */
        Random random = new Random();
        List<Integer> randomNumbers = Stream.generate(random::nextInt)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(randomNumbers);
    }
}
