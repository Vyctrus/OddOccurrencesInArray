import org.example.Solution;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestCase1 {

    static Stream<Arguments> methodSourceArgs(){
        return Stream.of(
                arguments(new int[]{9, 3, 9, 3, 9,7,9},7),
                arguments(new int[]{3,3,1,1,1,1,1},1),
                arguments(new int[]{6,3,8,7,8,3,8,6,8},7),
                arguments(new int[]{1,1,69},69)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A,int expected){
        Solution s=new Solution();
        System.out.println(arrayToString(A) +"  ---  "+expected);
        assertTrue((s.solution(A)==expected));
    }

    private String arrayToString(int[] array){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        String joinedString = stringBuilder.toString();
        return joinedString;
    }
    public static void endTestCase(int numberOfTestCase){
        System.out.println("---------------------End of Test Case "+numberOfTestCase+"------------");
    }

    @AfterAll
    public static void endT0(){
        endTestCase(1);
    }
}
