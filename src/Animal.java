public class Animal {

    int num;
    String name;

    public static void main(String[] args) {
        System.out.println("Hello World");
        Animal animal = new Animal();
        animal.concat();
    }

    public void concat(){
        num = 2;
        name = "Ajay";
        System.out.println(num + name);
    }
}
