package nonlineardatastructures.tree;

import algorithmicconcepts.dfs.DFS;

import static algorithmicconcepts.bfs.BFS.bfs;
import static algorithmicconcepts.dfs.DFS.dfs;

public class TreeTest {

    public static void main(String[] args) {
        TreeNode treeRoot = new TreeNode("S");
        TreeNode child1 = new TreeNode("N");
        TreeNode child2 = new TreeNode("O");
        TreeNode grandchild1 = new TreeNode("W");
        TreeNode grandchild2 = new TreeNode("Y");
        treeRoot.addChild(child1);
        treeRoot.addChild(child2);
        child1.addChild(grandchild1);
        child2.addChild(grandchild2);

        Tree tree = new Tree(treeRoot);
        DFS dfs = new DFS();
        dfs(treeRoot);
        System.out.println(" ");
        bfs(treeRoot);
    }
}
