import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Node{
     int val;
     Node Lchild;
     Node Rchild;

    public Node(int val) {
        this.val = val;
        this.Lchild=null;
        this.Rchild=null;
    }
}
public class Exercise3 {

    public static void main(String[] args) {
        Node root=new Node(0);
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        root.Lchild=a;
        root.Rchild=b;
        a.Rchild=d;
        a.Lchild=c;

        proList(root);
    }
    //二叉树的先序遍历（递归）
    private static void proList(Node head){
        if(head==null){
            return ;
        }
        System.out.println(head.val);
        proList(head.Lchild);
        proList(head.Rchild);
    }
    //二叉树的中序遍历（递归）
    private static void ordList(Node head){
        if(head==null){
            return ;
        }
        ordList(head.Lchild);
        System.out.println(head.val);
        ordList(head.Rchild);
    }
    //二叉树后序遍历(递归)
    private static void houList(Node head){
        if(head!=null){
            return;
        }
        houList(head.Lchild);
        houList(head.Rchild);
        System.out.println(head.val);
    }
}
