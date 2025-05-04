package src.creational.prototype;

class ProtoTypePattern{
    public static void main(String[] args) {

        Address address=new Address("City","place");
        User user1=new User("Arshad","email","0123456789","leetcode",1,address);
        User user2=user1.clone();
        user2.getAddress().setCity("city2");
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }
}