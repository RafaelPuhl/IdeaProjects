package AlgoritimoEstrutura1.Trees;

public class GenericTree {
    private NodeTree root;

    public GenericTree(){
        this.root.setFather(null);
    }

    public boolean add(String item, String father){
        // TODO: 17/06/2020  
        return true;
    }

    private NodeTree searchNodeRef(String item, NodeTree origem){
        if(origem == null) return null;
        if(item.equals(origem.getElement())){
            return origem;
        }else{
            for (int i = 0; i < origem.contSubTree() ; i++) {
                searchNodeRef(item, origem.getSubTree(i));
            }
        }
        return null;
    }
}
