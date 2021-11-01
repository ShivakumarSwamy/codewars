package code.wars.algorithms;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LineNumbering123 {
    public static List<String> number(List<Object> lines) {

        return IntStream.range(0, lines.size())
                .mapToObj(operand -> (operand + 1) + ": " + lines.get(operand))
                .collect(Collectors.toList());
    }

}
