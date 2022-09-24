import java.util.Scanner;
public class Tree {

    Scanner scan = new Scanner(System.in);
    private String type;
    private double height;
    private int animals;
    private boolean everGreen;

    public Tree(String treeType, double treeHeight, int animalsLivingInTree, boolean isItEverGreen){
        type = treeType;
        height = treeHeight;
        animals = animalsLivingInTree;
        everGreen = isItEverGreen;
    }

    public void askSeason() {
        System.out.println();

        if (everGreen) {
            System.out.println("I am an ever green tree seasons don't affect me");
            System.out.println("-----------------------------------------------");
            System.out.println();
        } else {
            System.out.println("I am not an ever green tree seasons affects me");
            System.out.println("----------------------------------------------");
            System.out.println();

            System.out.println("---enter in all lowercase---");
            System.out.print("What season is it: ");
            String season = scan.nextLine();

            if (season.equals("winter")) {
                System.out.println("The leaves will come back in the spring and summer!");
            } else {
                if (season.equals("fall") || (season.equals("autumn"))) {
                System.out.println("The leaves are different colors :D!");
            } else {
                if (season.equals("spring") || (season.equals("summer"))) {
                    System.out.println("There should be leaves on the trees");
                    System.out.println();
                }
            }
            }
        }
    }

    public void printTreeInfo() {
        System.out.println("Type of Tree: " + type);
        System.out.println("Height of tree: " + height);
        System.out.println("Amount of animals living in tree: " + animals);
        System.out.println("Is it a ever green tree?: " + everGreen);
    }
}
