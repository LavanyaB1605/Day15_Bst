public class Main extends BST_Class {
    public static void main(String[] args) {
        //create a BST object
        BST_Class bst = new BST_Class();
        /* BST tree example
              56
           /     \
          30      70
         /  \    /  \
        22   40  60  95
       /        /
      11       65
         */
        //insert data into BST
        bst.insert(56);
        bst.insert(30);
        bst.insert(70);
        bst.insert(22);
        bst.insert(11);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(65);
        bst.insert(95);
        //print the BST
        System.out.println("The BST Created with input data(Left-root-right):");
        bst.inorder();
    }
}
