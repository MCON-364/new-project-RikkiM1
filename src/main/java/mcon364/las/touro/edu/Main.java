import java.util.Optional;

public class Main{

    //1.
    public static Optional<String> getUserName(String envVarName){

        return Optional.of(System.getenv(envVarName));
    }

    //2.
    public static String getGreeting(String envVarName){
       var userName = getUserName(envVarName);
       StringBuilder str= new StringBuilder();
        String greeting = switch (userName) {

            }
    }
}