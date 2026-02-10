package mcon364.las.touro.edu;//placeholder

import java.util.List;
import java.util.Optional;


public class Main {

    public static Optional<String> getUserName(String envVarName) {
        return Optional.ofNullable(System.getenv(envVarName));
    }

    public static String getGreeting(String envVarName) {
        var userName = getUserName(envVarName);
        StringBuilder sb = new StringBuilder();
        if (userName.isPresent()) {

            sb.append("Hi welcome: ").append(userName.get());
            return sb.toString();
        }
            return null;
        }


    public static int processValues(List<List<Integer>> data) {
        int counter = 0;
        outerloop:
        for (List<Integer> row : data) {

            for (int i = 0; i < row.size(); i++) {
                if (row.get(i) == 0) {
                    continue outerloop;
                }
                if (row.get(i) == 99) {
                    break outerloop;
                }
            }
                if (!row.contains(0)) {
                    counter+=1;
                }

        }

        return counter;
    }
    public static void main(String[] args) {
        var Str = getGreeting("USERNAME");
        var Sr = getGreeting("NO_SUCH_VAR");
        var ctr= processValues(List.of(
                List.of(5, 10, 15),     // Processes completely
                List.of(20, 0, 25),     // Finds 0, skips to next list
                List.of(30, 35, 40),    // Processes completely
                List.of(45, 99, 50),    // Finds 99, terminates everything
                List.of(55, 60, 65)     // Never reached
        ));

    }
}