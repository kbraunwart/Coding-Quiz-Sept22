import java.io.*;

class Result {

    /*
     * Complete the 'hackerrankInString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String hackerrankInString(String s) {
        // Write your code here
        String hackerrank = "hackerrank";
        return helperFunction(hackerrank, s);
    }

    public static String helperFunction(String hackerrank, String substring) {
        if (hackerrank.isEmpty()) {
            return "YES";
        } else if (substring.isEmpty()) {
            return "NO";
        }

        if (hackerrank.charAt(0) == substring.charAt(0)) {
            return helperFunction(hackerrank.substring(1), substring.substring(1));
        } else {
            return helperFunction(hackerrank, substring.substring(1));
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
