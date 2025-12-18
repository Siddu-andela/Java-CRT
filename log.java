class Login {
    private String username;
    private String password;

    public void setData(String x, String y) {
        username = x;
        if (y.length() >= 8) {
            password = y;
            System.out.println("Successful");
        } else {
            password = null;
            System.out.println("Password should be at least 8 characters");
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class Log {
    public static void main(String[] args) {
        Login l = new Login();
        l.setData("siddu", "siddu@1010");

        System.out.println(l.getUsername());
        System.out.println(l.getPassword());
    }
}
