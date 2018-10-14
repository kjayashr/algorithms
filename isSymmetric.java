public static boolean isSymmetric (BinaryTreeNode <Integer> tree) 

{
 return tree == null || checkSymmetric (tree .left , tree. right);
}

private static boolean checkSymmetric (BinaryTreeNode <Integer>  subtreeer, BinaryTreeNode <Integer> subtreel) {
if(subtreer ==null && subtreel ==null)
{ 
return true;
} 
else if (subtree® != null <&& subtreel != null)
{ 
return 
  (subtreer .data == subtree 1 .data)
   && checkSymmetric (subtreer .left , subtreel .right) 
   && checkSymmetric(subtreer .right , subtree1.left) ;
}

  return false;

}
