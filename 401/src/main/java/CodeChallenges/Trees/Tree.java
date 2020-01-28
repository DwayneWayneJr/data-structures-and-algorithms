package codechallenges.Trees;



public class Tree {
    Node root;

    Tree() {
        root = null;
    }

    void preOrder(Node node) {
        if (node == null)
            return;

        printPreorder(node.left);
    }
}
