

public class App {
    public static void main(String[] args) {
        System.out.println(Cat.getCatCount());

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println(Cat.MAX_LIVES);
        System.out.println(myCat.getCatCount());

    }
}
