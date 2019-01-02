public static BinaryTree<Integer> LCA ( BinaryTree <Integer > noder, BinaryTree <Integer > nodel) {

int depthr = getDepth(noder), depthl = getDepth(node1);

            if (depthl > depthr) {
                       BinaryTree <Integer> temp = noder;
                       noder = node1 ;
                       nodel = temp;
                }

int depthDiff = Math.abs (depthr - depthl);
 while (depthDiff-- > 0) {
     noder = noder.parent ;
     }

 while (noder != nodel)
 { 
 noder = noder.parent ; 
 nodel = node1.parent ;
}

return noder;
}


private static int getDepth(BinaryTree<Integer> node) { 
int depth = 0;
while (node. parent != null){
   ++depth ;
   node = node. parent;
  }
 return depth;
}
//2/1/2019
