//9-18-2025
//ncruz   video 5 module 4

// File name: Cat.java

public class Cat {

    public static final int MAX_LIVES = 9;
    private static int catCount = 0;
    String name;
    int age;
    int livesLeft;

    public void meow() {
        System.out.println("meow");
    }

    public Cat() {
        catCount++;
        livesLeft = MAX_LIVES;
    }

    public static int getCatCount() {
        return catCount;
    }
}
