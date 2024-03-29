package nonlineardatastructures.tree;

import java.util.ArrayList;

public class TreeNode {
    public Object data;
    public ArrayList<TreeNode> children;

    public TreeNode(Object data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public void addChild(Object childData) {
        this.children.add(new TreeNode(childData));
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }

    public void removeChild(TreeNode childToRemove) {
        if (this.children.isEmpty()) {
            return;
        } else if (this.children.contains(childToRemove)) {
            this.children.remove(childToRemove);
            return;
        } else {
            for (TreeNode child : this.children) {
                child.removeChild(childToRemove);
            }
        }
    }

    public void removeChild(Object targetData) {
        if (this.children.isEmpty()) {
            return;
        }
        for (TreeNode child : this.children) {
            if (child.data == targetData) {
                this.children.remove(child);
                return;
            }
        }
        for (TreeNode child: this.children) {
            child.removeChild(targetData);
        }
    }


}
