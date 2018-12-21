/**
 * @ClassName TreeNode
 * @Description 节点实体
 * @Author Administrator
 * @Date 2018/12/21 9:36
 * @Version 1.0
 **/

public class TreeNode<T> {

    // 数据域
    private T data;
    // 左子树
    private TreeNode<T> leftChild;
    // 右子树
    private TreeNode<T> rightChild;

    public TreeNode(T data) {
        this(null, data, null);
    }

    public TreeNode(TreeNode<T> leftChild, T data, TreeNode<T> rightChild) {
        this.leftChild = leftChild;
        this.data = data;
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

}