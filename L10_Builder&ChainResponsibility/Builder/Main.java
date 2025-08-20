package Builder;

public class Main {
    public static void main(String[] args) {
        //Example 1: Creating a user in a single line
        UserProfile user1 = new UserProfileBuilder("Louis")
                .email("louis@gmail.com")
                .phoneNumber("12345")
                .address("123 St")
                .age(21)
                .build();

        //Example 2: Building the object step by step
        UserProfileBuilder builder = new UserProfileBuilder("Bob");
        builder.email("bob@gmail.com").phoneNumber("123123");

        UserProfile user2 = builder.address("555 st").age(30).build();

        System.out.println(user1);
        System.out.println(user2);


    }
}
