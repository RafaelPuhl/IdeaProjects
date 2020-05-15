package AlgoritimoEstrutura1.EstruturasEncadeadas;

public class ColecaoEncadeada {
    private class Node {
        private Node refNext;
        private String item;

        public Node getRefNext() {
            return refNext;
        }

        public void setRefNext(Node refNext) {
            this.refNext = refNext;
        }

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;
        }
    }

    private Node refHead = null;
    private int qtdElem = 0;

}
