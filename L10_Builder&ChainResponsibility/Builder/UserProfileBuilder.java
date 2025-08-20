package Builder;

public class UserProfileBuilder{
    private final String username;
    private String email = "Not provided";
    private String phoneNumber = "Not provided";
    private String address = "Not provided";
    private int age = 18;

    public UserProfileBuilder(String username) {
        this.username = username;
    }

    public UserProfileBuilder email(String email) {
        this.email = email;
        return this;
    }
    public UserProfileBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserProfileBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserProfileBuilder age(int age) {
        if (age < 13) throw new IllegalArgumentException("Age must be 13 or older.");
        this.age = age;
        return this;
    }

    public UserProfile build() {
        return new UserProfile(username, email, phoneNumber, address, age);
    }
}
