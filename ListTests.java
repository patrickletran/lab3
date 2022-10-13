import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class ListTests {
    
    @Test
    public void testFilter(){
        List<String> test = new ArrayList<>();
        test.add("dog");
        test.add("cat");
        test.add("banana");

        List<String> result = new ArrayList<>();
        result.add("cat");
        result.add("banana");

        assertEquals(result, ListExamples.filter(test, new ListExamples()));
    }

    @Test
    public void testMerge(){
        List<String> test = new ArrayList<>();
        test.add("apple");
        test.add("bear");
        test.add("cat");

        List<String> test2 = new ArrayList<>();
        test2.add("ankle");
        test2.add("deer");

        List<String> result = new ArrayList<>();
        result.add("ankle");
        result.add("apple");
        result.add("bear");
        result.add("cat");
        result.add("deer");

        assertEquals(result, ListExamples.merge(test,test2));
    }
}
