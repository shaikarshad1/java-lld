package src.creational.builder;

public class User {

    private String name;
    private String email;

    private String phone;
    private String leetcodeProfileUrl;
    private int age;

    public User(UserBuilder userBuilder){
        this.age=userBuilder.age;
        this.leetcodeProfileUrl=userBuilder.leetcodeProfileUrl;
        this.phone=userBuilder.phone;
        this.name=userBuilder.name;
        this.email=userBuilder.email;
    }

    public static class UserBuilder{
        private String name;
        private String email;

        private String phone;
        private String leetcodeProfileUrl;
        private int age;

        public UserBuilder(String name,String email){
            this.name=name;
            this.email=email;
        }
        public UserBuilder phone(String phone){
            this.phone=phone;
            return this;
        }
        public UserBuilder leetcodeProfileUrl(String leetcodeProfileUrl){
            this.leetcodeProfileUrl=leetcodeProfileUrl;
            return this;
        }
        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }

    @Override
    public String toString(){
        return this.name+"  -- this is from to string";
    }
}
