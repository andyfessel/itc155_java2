
public class C17ExCq2 {

    public static void main(String[] args) {
        IntTree t = new IntTree(12);
        System.out.println("Tree structure:");
        t.printSideways();
        System.out.println();
        t.printPreorder();
        t.printInorder();
        t.printPostorder();
        
        t.countEmpty();
        
        System.out.println("The total number of empty branches is: " + t.countEmpty());
    }
    
    
//	System.out.println(t.countEmpty());
}
