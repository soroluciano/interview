import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        String toOrder = "a,b,c,d";
        orderStringWithStream(toOrder);
        orderStringWithFor(toOrder);
    }

    public static void orderStringWithFor(String toOrder) throws Exception {
        String[] arrayString = toOrder.split(",");
        String output = "";
        int length = arrayString.length;
        for (int i = length - 1; i >= 0; i--) {
            output = output + arrayString[i];
            output.trim();
        }
        System.out.println(output);
    }

    public static void orderStringWithStream(String toOrder) {
        String[] tran = toOrder.split(",");
        List<String> collect = Arrays.stream(tran).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        String sortedString = collect.toString();
        String outputString = sortedString.replace("[", "").replace("]", "").replaceAll(",", "");
        System.out.println(outputString);
    }
}