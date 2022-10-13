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
        input.add("cat");
        input.add("dog");
        input.add("cow");
        input.add("lamb");
        test.add("cat");
        test.add("dog");
        test.add("cow");
        test.add("lamb");

        assertArrayEquals(input.toArray(), ListExamples.filter(input, new check()).toArray());

    }
    @Test
    public void testMerge(){
        List<String> input = new ArrayList<>();
        List<String> input2 = new ArrayList<>();

        List<String> test = new ArrayList<>();
        input2.add("sand");
        input2.add("train");
        input2.add("scarf");
        input2.add("puke");
        input.add("cat");
        input.add("dog");
        input.add("cow");
        input.add("lamb");
        test.add("sand");
        test.add("train");
        test.add("scarf");
        test.add("puke");
        test.add("cat");
        test.add("dog");
        test.add("cow");
        test.add("lamb");

        assertArrayEquals(test.toArray(), ListExamples.merge(input2, input).toArray());

    }
}
