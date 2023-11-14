package algorithmicconcepts.dfs;

import nonlineardatastructures.tree.TreeNode;

public class DFS {

    public static void dfs(TreeNode current) {
        System.out.print(current.data + " ");
        if (current.children.isEmpty()) {
            return;
        }
        for (TreeNode child : current.children) {
            dfs(child);
        }

    }
}
