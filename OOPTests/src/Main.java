
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.getSomeStr();
    }

    public static class Animal extends Object {}

    public static class Dog extends Animal {
        public void getSomeStr() {
            System.out.println("hi, u're some dick.");
        }
    }

    public class Bulldog extends Dog {}
}
