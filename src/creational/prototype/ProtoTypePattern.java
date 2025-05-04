package src.creational.prototype;

class ProtoTypePattern{
    public static void main(String[] args) {

        Address address=new Address("Kadiri","kadiri");
        User user1=new User("Arshad","email","0123456789","leetcode",1,address);
        User user2=user1.clone();
        user2.getAddress().setCity("Anantapur");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}