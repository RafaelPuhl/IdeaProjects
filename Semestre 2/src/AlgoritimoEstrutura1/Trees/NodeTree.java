package AlgoritimoEstrutura1.Trees;

import java.util.ArrayList;

public class NodeTree {
    private NodeTree father;
    private String element;
    private ArrayList<NodeTree> subTrees;

     public NodeTree(String element){
         this.element = element;
         this.subTrees = new ArrayList<>();
     }

    public NodeTree getFather() {
        return father;
    }

    public void setFather(NodeTree father) {
        this.father = father;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public void addSubTree(NodeTree nodeTree){
         this.subTrees.add(nodeTree);
    }

    public boolean removeSubTree(NodeTree nodeTree){
        for (NodeTree node : this.subTrees) {
            if (node == nodeTree){
                this.subTrees.remove(nodeTree);
                return true;
            }
        }
        return false;
    }

    public NodeTree getSubTree(int n){
        return this.subTrees.get(n);
    }

    public int contSubTree(){
         return this.subTrees.size();
    }
}