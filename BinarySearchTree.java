public class BinarySearchTree {

    public int value;
    public int depth;
    public BinarySearchTree left;
    public BinarySearchTree right;

    public BinarySearchTree(int value, int depth) {
        this.value = value;
        this.depth = depth;
        this.left = null;
        this.right = null;
    }

    public BinarySearchTree(int value) {
        this.value = value;
        this.depth = 1;
        this.left = null;
        this.right = null;
    }

    public void insert(int value) {
        if (value < this.value) {
            if (this.left == null) {
                this.left = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Inserting %d to the left since %d is less than current value", value, this.value);
            } else {
                this.left.insert(value);
            }
        } else {
            if (this.right == null) {
                this.right = new BinarySearchTree(value, this.depth + 1);
                System.out.printf("Inserting %d to the right since %d is greater than current value", value, this.value);
            } else {
                this.right.insert(value);
            }
        }
    }

    public BinarySearchTree getNodeByValue(int value) {
        if (value == this.value) {
            return this;
        } else if ((value < this.value) && (this.left != null)) {
            return this.left.getNodeByValue(value);
        } else if ((value > this.value) && (this.right != null)) {
            return this.right.getNodeByValue(value);
        } else {
            return null;
        }
    }

    public void depthFirstTraversal() {
        if (this.left != null) {
            this.left.depthFirstTraversal();
            System.out.println(this.value);
        } else {
            if (this.right != null) {
                this.right.depthFirstTraversal();
                System.out.println(this.value);
            }
        }
    }
}
