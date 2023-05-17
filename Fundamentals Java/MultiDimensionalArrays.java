import java.util.*;
import java.util.Arrays;
public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[] values = { 3, 5, 2343 };

        // System.out.println(values[2]);

        int[][] grid = {
                { 3, 5, 2343 },
                { 2, 4 },
                { 1, 2, 3, 4 }
        };
        // System.out.println(grid[1][1]);
        // System.out.println(grid[0][2]);

        // String[][] texts = new String[2][3];
        // texts[0][1] = "hello there";

        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[row].length;col++){
                System.out.print(grid[row][col] + "\t");
                // System.out.print(row);
                // System.out.print(col);
                // System.out.print("\t");
            }
            System.out.println();
        }

        // System.out.print(Arrays.toString(grid[0]));
        // System.out.print(grid[0].length);

        for (int[] b: grid){
            for (int a : b) {
                System.out.print(a + "\t");
            }
                System.out.println();
        }

        // for (int a : grid[0]) {
        //     System.out.println(a);
        // }


        String[][]  words = new String [2][];
        words[0] = new String[3];
        words[0][2] = "hi there";
        // words[2][1] = "hi there";
        System.out.println(words[0][2]);

    }
}
