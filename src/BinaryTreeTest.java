/**
 * 程序入口
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree mBinaryTree = new BinaryTree();
        //构建二叉树
        TreeNode root = mBinaryTree.CreateTree();

        System.out.print("前序遍历-递归实现:");
        mBinaryTree.preTraversal(root);
        System.out.print("\n中序遍历-递归实现:");
        mBinaryTree.traversal(root);
        System.out.print("\n后序遍历-递归实现:");
        mBinaryTree.postTraversal(root);
        System.out.println();
        System.out.print("\n前序遍历-迭代实现:");
        mBinaryTree.preTraversalIteration(root);
        System.out.print("\n中序遍历-迭代实现:");
        mBinaryTree.TraversalIteration(root);
        System.out.print("\n后序遍历-迭代实现:");
        mBinaryTree.postTraversalIteration(root);
        System.out.println();
        System.out.print("\n层序遍历:");
        mBinaryTree.levelTraversal(root);

    }
}