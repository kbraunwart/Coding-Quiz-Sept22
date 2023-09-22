import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = arr.get(0);
        int min = arr.get(0);
        int max = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            sum += arr.get(i);
            if (arr.get(i) < min) {
                min = arr.get(i);
            } else if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        System.out.println((sum - max) + " " + (sum - min));


    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
