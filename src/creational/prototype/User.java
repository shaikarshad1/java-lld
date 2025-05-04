package src.creational.prototype;

public class User implements Cloneable {

    private String name;
    private String email;

    private String phone;
    private String leetcodeProfileUrl;
    private int age;
    private Address address;

    public User(String name, String email, String phone, String leetcodeProfileUrl, int age,Address address) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.leetcodeProfileUrl = leetcodeProfileUrl;
        this.age = age;
        this.address=address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLeetcodeProfileUrl() {
        return leetcodeProfileUrl;
    }

    public void setLeetcodeProfileUrl(String leetcodeProfileUrl) {
        this.leetcodeProfileUrl = leetcodeProfileUrl;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString(){
        return this.name+" -- "+this.address.getCity()+" ---- this is from proto type to string";
    }

    @Override
    public User clone() {
        try {
            User user=(User) super.clone();
            user.address= this.address.clone();
            return user;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
