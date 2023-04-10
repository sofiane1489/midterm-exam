package math.problems;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class MakePyramid {

    public static String build(int height) {
        StringBuilder pyramid = new StringBuilder();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                pyramid.append(" ");
            }
            for (int k = 1; k <= i; k++) {
                pyramid.append("* ");
            }
            pyramid.append("\n");
        }
        return pyramid.toString();
    }
    public static void testBuildPyramid() {
        int height = 7;
        String act;
        String expectedOutput =
                "     * \n" +
                "    * * \n" +
                "   * * * \n" +
                "  * * * * \n" +
                " * * * * * \n" +
                "* * * * * * \n";
        String actualOutput = MakePyramid.build(height);
        assertEquals(expectedOutput, actualOutput);
    }
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *
        */

        System.out.println(build(6));

/*........................................Apply unit testing........................................*/
 /*.........................................test data: height=9............................................*/

                    testBuildPyramid();

        }
  }
