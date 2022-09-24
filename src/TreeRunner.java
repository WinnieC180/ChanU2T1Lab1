public class TreeRunner {
    public static void main(String[] arg) {

        Tree tree1 = new Tree("Oak Tree", 60.56, 1, false);
        tree1.askSeason();
        tree1.printTreeInfo();

        Tree tree2 = new Tree("Pine Tree", 70.27, 4, true);
        tree2.askSeason();
        tree2.printTreeInfo();
    }
}
