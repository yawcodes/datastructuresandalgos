package nonlineardatastructures.tree;

public class Tree {
    public TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void print() {
        print(this.root, 0);
    }

    public void print(TreeNode current, int level) {
        String levelMark = "";
        for (int i = 0; i < level; i ++) {
            levelMark += "-- ";
        }
        System.out.println(levelMark + " " + current.data);
        for (TreeNode child : current.children) {
            print(child, level + 1);
        }
    }


}
