package AlgoritimoEstrutura1.Trees;

public class GenericTree {
    NodeTree refRoot;

    public GenericTree() {
        this.refRoot = null;
    }

    public boolean add(String item, String father) {
        NodeTree node = new NodeTree(item);
        NodeTree nodeAux = null;
        boolean result = false;

        if (father == null) {
            if (this.refRoot != null) {
                node.addSubTree(this.refRoot);
                this.refRoot.setFather(node);
            }
            this.refRoot = node;
            result = true;
        } else {
            nodeAux = searchNodeRef(father, this.refRoot);
            if (nodeAux != null) {
                nodeAux.addSubTree(node);
                node.setFather(nodeAux);
                result = true;
            }
        }
        return result;
    }

    private NodeTree searchNodeRef(String element, NodeTree target) {
        if (target == null) return null;
        if (element.equals(target.getElement())) {
            return target;
        } else {
            for (int i = 0; i < target.contSubTree(); i++) {
                NodeTree aux = searchNodeRef(element, target.getSubTree(i));
                if (aux != null) return aux;
            }
        }
        return null;
    }
}
