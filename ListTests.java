import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

class check implements StringChecker{
    public boolean checkString(String s){
        return true;
    }
}

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input = new ArrayList<>();
        List<String> test = new ArrayList<>();
        input.add("a");
        input.add("b");
        input.add("c");
        input.add("d");
        test.add("a");
        test.add("b");
        test.add("c");
        test.add("d");

        assertArrayEquals(input.toArray(), ListExamples.filter(input, new check()).toArray());

    }
    @Test
    public void testMerge(){
        List<String> input = new ArrayList<>();
        List<String> input2 = new ArrayList<>();

        List<String> test = new ArrayList<>();
        input.add("a");
        input.add("d");
        input.add("e");
        input.add("f");
        input2.add("m");
        input2.add("g");
        input2.add("o");
       
        test.add("a");
        test.add("d");
        test.add("e");
        test.add("f");
        test.add("g");
        test.add("m");
        test.add("o");

        assertArrayEquals(test.toArray(), ListExamples.merge(input2, input).toArray());

    }
}
