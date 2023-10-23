package use_case.clear_users;


public class ClearInputData {
    final private String username;
    final private String password;
    public ClearInputData(String username, String password) {
        this.username = null;
        this.password = null;
    }

    String getUsername() {
        return username;
    }
    String getPassword() {
        return password;
    }
}
