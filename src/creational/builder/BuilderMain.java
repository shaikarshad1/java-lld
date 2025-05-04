package src.creational.builder;

public class BuilderMain {
    public static void main(String[] args) {
        User user= new User.UserBuilder("Arshad","Arshad@email.com")
                .leetcodeProfileUrl("leetcode")
                .age(01).build();

        System.out.println(user.toString());
    }
}
