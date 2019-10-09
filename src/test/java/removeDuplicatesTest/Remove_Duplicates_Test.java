package removeDuplicatesTest;

import Remove_Dups.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Remove_Duplicates_Test {
    Solution SUT = new Solution();

    @Test
    public void Test_For_Duplicates(){
        String string = "abbccaca";
        String result = SUT.removeDuplicates(string);
        String expected = "ca";
        assertEquals(expected,result);
    }

    @Test
    public void Test_For_Duplicates2(){
        String string = "abcabcccc";
        String result = SUT.removeDuplicates(string);
        String expected = "abcab";
        assertEquals(expected,result);
    }
}
