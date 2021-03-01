import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

    @Test
    public void test() {
        List<String> a = new ArrayList<>();
        a.add("2");
        a.add("3");

        List<Integer> newList = new ArrayList<>();
        for (String element: a) {
            newList.add(Integer.valueOf(element));
        }

        List<Integer> b = a.stream().map(Integer::valueOf).collect(Collectors.toList());
        List<String> c = a.stream().map(s->s+"Test").collect(Collectors.toList());

        c.stream().sorted().forEach(s-> System.out.println(s));

        Assertions.assertThat(newList).containsExactly(2, 3);
        Assertions.assertThat(b).containsExactly(2, 3);

    }
}
