import java.util.*;
import java.util.List;
import java.util.Arrays;

public class GetPairFromList{

    public static void main(String args[]) {
        final List<String> in = new ArrayList<String>() {
            {
                add("A");
                add("B");
                add("C");
                add("D");
                add("E");
                //add("F");
            }
        };
        final List<String[]> pairs = new ArrayList<>();
        for (int i = 0; i < in.size(); i+=2) {
            String[] pair = new String[2];
            pair[0] = in.get(i);
            for (int j = i + 1; j < in.size(); ++j) {
                pair[1] = in.get(j);
                break;
            }
            pairs.add(pair);
        }
        
        for (final String[] pair : pairs) {
            System.out.println(Arrays.toString(pair));
        }
    }
}