package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
// import stack1.Stack;
import java.util.Stack;

public class BinaryTree {
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
         public BinaryTree()
         {
            this.root=null;
            
         }


         public void createBinaryTree()
         {
            TreeNode first=new TreeNode(6);
            TreeNode second=new TreeNode(1);
            TreeNode third=new TreeNode(7);
            TreeNode fourth=new TreeNode(2);
            TreeNode fifth=new TreeNode(9);
            root=first;
            root.left=second;
            root.right=third;  //second <--- root   --->third
            second.left=fourth;
            second.right=fifth;

         }

         public void preorderTraversal(TreeNode root)
         {
           
            if(root==null)
            {
               return;
            }
            System.out.print(root.data+" ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
           
         }
         public void  iterativePreorder(TreeNode root)
         {
            System.out.println("Using Iterative method of Preorder Traversal:");
            if(root==null)
            {
               return;
            }

            Stack<TreeNode> stack=new Stack<>();
            stack.push(root);
            while ((!stack.isEmpty()))
            {
                   TreeNode temp=stack.pop();
                   System.out.print(temp.data+" ");
                   if(temp.right!=null)
                   {
                     stack.push(temp.right);
                   }
                   if(temp.left!=null)
                   {
                     stack.push(temp.left);
                   }
            }
         }
 
         public void inorderTraversal(TreeNode root)
         {
           
            if(root==null)
            {
               return;
            }
            
            preorderTraversal(root.left);
            System.out.print(root.data+" ");
            preorderTraversal(root.right);
           
         }



         public void  iterativeInorder(TreeNode root)
         {
            System.out.println("Using Iterative method of Inorder Traversal:");
            if(root==null)
            {
               return;
            }

            Stack<TreeNode> stack=new Stack<>();
            TreeNode temp=root;

            while(!stack.isEmpty() || temp!=null)
            {
               if(temp!=null)
               {
                  stack.push(temp);
                  temp=temp.left;
               }
               else
               {
                   temp=stack.pop();
                   System.out.print(temp.data+" ");
                   temp=temp.right;

               }
            }
         }
         

         public void postorderTraversal(TreeNode root)
         {
           
            if(root==null)
            {
               return;
            }
            
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data+" ");
           
           
         }



         public void  iterativePostorder(TreeNode root)
         {
            TreeNode current =root;
            System.out.println("Using Iterative method of Postorder Traversal:");
            Stack<TreeNode> stack=new Stack<>();
            while(current!=null || !stack.isEmpty())
            {
               if(current!=null)
               {
                  stack.push(current);
                  current=current.left;
               }

               else
               {
                  TreeNode temp=stack.peek().right;
                  if(temp==null)
                  {
                     temp=stack.pop();
                     System.out.print(temp.data+" ");
                     while(!stack.isEmpty() && temp==stack.peek().right)
                     {
                        temp=stack.pop();
                        System.out.print(temp.data+" ");
                     }
                     
                     
                  }
                  else
                     {
                        current=temp;
                     }
                  
               }
            }
         }
         

         public void levelOrderTraversal(TreeNode root)
         {
            System.out.println("Lavel Order Traversal");
            if(root ==null)
            {
               return;
            }
            Queue<TreeNode> queue=new LinkedList<>();
            queue.offer(root);
            while(!queue.isEmpty())
            {
               TreeNode temp=queue.poll();
               System.out.print(temp.data+" ");
               if(temp.left!=null)
               {
                  queue.offer(temp.left);
               }
               if(temp.right!=null)
               {
                  queue.offer(temp.right);
               }
            }
         }



         public static int findMax(TreeNode root)
         {
            if(root==null)
            {
               return Integer.MIN_VALUE;
            }
            int result=root.data;
            int left=findMax(root.left);
            int right=findMax(root.right);
            if(left>result)
            {
               result=left;
            }
            if(right>result)
            {
               result=right;
            }

            return result;
         }









         public static void main(String[] args) 
         {
            BinaryTree bt=new BinaryTree();
            bt.createBinaryTree();
            System.out.println("Using Recursive Method of Preorder Traversal:");
            bt.preorderTraversal(bt.root);
            System.out.println();
            bt.iterativePreorder(bt.root);
            System.out.println();
            System.out.println("Using Recursive Method of Inorder Traversal:");
            bt.inorderTraversal(bt.root);
            System.out.println();
            bt.iterativeInorder(bt.root);
            System.out.println();
            System.out.println("Using Recursive Method of postorder Traversal:");
            bt.postorderTraversal(bt.root);
            System.out.println();
            bt.iterativePostorder(bt.root);
            System.out.println();
            bt.levelOrderTraversal(bt.root);
            System.out.println();
            System.out.println("The Maximum value in tree is:");
            int result=findMax(bt.root);
            System.out.print(result);

           
         }
}
