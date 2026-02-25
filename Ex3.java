package spring;

@FunctionalInterface
interface Login {
    boolean validate(String username, String password);
}

public class Ex3 {

    public static void main(String[] args) {

        Login login = (username, password) ->
                username.equals("admin") && password.equals("1234");

        System.out.println(login.validate("admin", "1234")); 
        System.out.println(login.validate("admin", "0000")); 
    }
}