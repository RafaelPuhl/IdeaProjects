package AlgoritimoEstrutura1.Trees;

public class AppTree {
    public static void main(String[] args) {
        GenericTree genericTree = new GenericTree();
        genericTree.add("A", null);
        genericTree.add("B", "A");
        System.out.println(genericTree);
    }
}
