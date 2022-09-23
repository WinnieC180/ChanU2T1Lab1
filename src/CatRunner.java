public class CatRunner {
    public static void main(String[] arg){

        System.out.println();
        Cat cat1 = new Cat("Kitty", 4, 4.2);
        cat1.introduce();
        cat1.printCatInfo();

        System.out.println();
        Cat cat2 = new Cat("Chubby", 8, 9.2);
        cat2.introduce();
        cat2.printCatInfo();
    }
}
