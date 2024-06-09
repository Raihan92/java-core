package functional;

import java.util.List;
import java.util.stream.Collectors;

public class StringOperations {

    List<String> stringList;

    public StringOperations(List<String> stringList) {
        this.stringList = stringList;
    }

    public void CommaSeparatedStringPrint() {
        System.out.println(stringList.stream().collect(Collectors.joining(",")));
    }

    public void CommaSeparatedStringPrint(List<String> stringList) {
        System.out.println(stringList.stream().collect(Collectors.joining(",")));
    }

    public void Sort() {
        List<String> sortedList = stringList.stream().sorted().collect(Collectors.toList());
        CommaSeparatedStringPrint(sortedList);
    }
}
