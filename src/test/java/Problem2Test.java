import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Problem2Test {

    // Example test
    // Okay to change
    @Test
    public void testBubbleSort() {
        // add your tests here
        int inputs[][] = {
                {},
                {3},
                {2,1},
                {8,2,4},
                {20,8,10,5,1},
        };
        int answer[][] = {
                {},
                {3},
                {1,2},
                {2,4,8},
                {1,5,8,10,20},
        };

        assertEquals(inputs.length, answer.length);

        for (int i=0; i<inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            assertEquals(Arrays.toString(answer[i]), Arrays.toString(inputs[i]));
        }
    }

}
