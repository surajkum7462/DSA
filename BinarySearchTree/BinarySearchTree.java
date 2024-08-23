package BinarySearchTree;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode
    {
         private TreeNode left;
         private TreeNode right;
         private int data;

         public TreeNode(int data)
         {
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }


    public BinarySearchTree()
    {
        this.root=null;
    }


    public void insert(int value)
    {
        root=insert(root, value);
    }

    public TreeNode insert(TreeNode root,int value)
    {
        if(root==null)
        {
            root=new TreeNode(value);
            return root;
        }
        if(value < root.data)
        {
            root.left=insert(root.left, value);
        }
        else
        {
            root.right=insert(root.right, value);
        }
        return root;
    }

    public void Inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }


    public static TreeNode search(TreeNode root , int key)
    {
        if(root==null || root.data==key)
        {
            return root;
        }
        if(key < root.data)
        {
             return search(root.left,key);
        }
        else
        {
            return search(root.right, key);
        }
    }

      public static boolean isValid(TreeNode root , long min, long max)
      {
        if(root==null)
        {
            return true;
        }
        if(root.data<=min || root.data>=max)
        {
            return false;
        }
        boolean left=isValid(root.left, min, root.data);
        if(left)
        {
            boolean right=isValid(root.right,root.data, max);
            return right;
        }
        return false;
      }





    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.Inorder(bst.root);
        System.out.println();
         TreeNode ds=search(bst.root,5);
         if(ds==null)
         {
             System.out.println("The element is not found");
         }
         else
         {
            System.out.println("The element is  found");
         }

         boolean valid=BinarySearchTree.isValid(bst.root, Long.MIN_VALUE, Long.MAX_VALUE);
         System.out.println("Is it Binary Search Tree:"+valid);
        
        
    }
    
}
