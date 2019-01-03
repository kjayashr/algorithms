/*Recusrsive inorder traversal*/

public static List<Integer> findKLargestlnBST (BSTNode <Integer> tree, int k) { List dnteger > kLargestElements = new ArrayList <>() ; 

findKLargestlnBSTHelper (tree , k, kLargestElements);
return

kLargestElements;

}

private static void findKLargestlnBSTHelper (BSTNode dnteger > tree, int k, List <Integer> kLargestElements)

// Perform reverse inorder traversal .

if (tree != null &<& kLargestElements . size () < k) {


{ findKLargestlnBSTHelper (tree .right , k, kLargestElements) ; if (kLargestElements . size () < k) {

kLargestElements . add (tree.data) ;

findKLargestlnBSTHelper (tree . left , k, kLargestElements);

}

}
//InOrder
