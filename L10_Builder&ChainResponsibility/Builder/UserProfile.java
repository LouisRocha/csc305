package Builder;

public class UserProfile {
    private final String username;
    private final String email;
    private final String phoneNumber;
    private final String address;
    private final int age;

    public UserProfile(String username, String email, String phoneNumber, String address, int age) {
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.age = age;
    }

    public String toString() {
        return String.format(
                "UserProfile: { Username: %s, Email: %s, Phone: %s, Address: %s, Age: %d }",
                username, email, phoneNumber, address, age
        );
    }
}
