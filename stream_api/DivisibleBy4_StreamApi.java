package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibleBy4_StreamApi {
    public static void main(String[] args) {
        List<Integer> outputList = Arrays.asList(1, 2, 3, 4, 6, 7, 8).stream()
                .filter(num -> (num * num) % 4 == 0)
                .collect(Collectors.toList());
        System.out.println(outputList); //^ [2, 4, 6, 8]
    }
}
