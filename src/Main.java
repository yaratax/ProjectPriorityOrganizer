/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ya
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        BinaryTree<Integer> tree = new BinaryTree<>();
        tree.addRoot(20);
        tree.addLeft(18, 20);
        tree.addRight(90, 20);
        tree.addLeft(2, 18);
        tree.addRight(0, 18);
        tree.addLeft(3, 20);
        tree.addRight(15, 20);

        SingleLinkedList<Integer> mySortedList = new SingleLinkedList<>();
        mySortedList.addFirst(5);
        mySortedList.addLast(7);
        mySortedList.printList();

        int Temp = greaterSearch(mySortedList, 2);
        mySortedList.addAtPosition(Temp, 2);
        Temp = greaterSearch(mySortedList, 6);
        mySortedList.addAtPosition(Temp, 6);

        Project P1 = new Project("CS210", "High");
        Project P2 = new Project("IT434", "High");
        Project P3 = new Project("SW232", "Low");
        Project P4 = new Project("LS235", "Low");
        Project P5 = new Project("WI445", "Low");

        LLstack<Project> ProjectSatck1 = new LLstack<>();
        LLstack<Project> ProjectSatck2 = new LLstack<>();
        LLstack<Project> AllProjects = new LLstack<>();

        ProjectSatck1.push(P1);
        ProjectSatck1.push(P4);
        ProjectSatck1.push(P2);
        ProjectSatck2.push(P5);
        ProjectSatck2.push(P3);
        ProjectSatck2.push(P4);

        AllProjects = AllProjects.MergeDistinct(ProjectSatck1, ProjectSatck2);
        ArrangePriority(AllProjects);

        BinaryTree<Project> MyTree = new BinaryTree<>();
        MyTree.addRoot(P1);
        MyTree.addLeft(P2, P1);
        MyTree.addRight(P3, P1);
        MyTree.addLeft(P4, P2);
        MyTree.addRight(P5, P3);

        MyTree.Mirror(MyTree.Root);

        BinaryTree<Project> SubTree = new BinaryTree<>();
        SubTree.addRoot(P3);

        BinaryTree.TreeNode<Project> MyTreeRoot = MyTree.Root;
        BinaryTree.TreeNode<Project> SubTreeRoot = SubTree.Root;
        CreateSubTree(MyTreeRoot, SubTree, SubTreeRoot);
    }

    public static int greaterSearch(SingleLinkedList<Integer> mySortedList, int e) {
        int position = 1;
        SingleLinkedList.Node<Integer> current = mySortedList.head;
        while (current.getElement() != null) {
            if (current.getElement() > e) {
                return position;
            }
            current = current.getNext();
            position++;
        }
        return -1;
    }

    public static void ArrangePriority(LLstack<Project> ProjectsStack) {
        // priortity ( low , high ).
        // in rearrange priority the low while be in bottom and high on top of stack list.
        LLstack<Project> result = new LLstack<>();
        LLstack<Project> temp = new LLstack<>();
        if (!ProjectsStack.isEmpty()) {
            Project p = ProjectsStack.pop();
            if (p.getPriority() == "High") {
                result.push(p);
            } else {
                temp.push(p);
            }
        }
        if (!temp.isEmpty()) {
            result.push(temp.pop());
        }
        if (!result.isEmpty()) {
            ProjectsStack.push(result.pop());
        }
    }

    public static void CreateSubTree(TreeNode<Project> MyTreeRoot, BinaryTree<Project> SubTree, TreeNode<Project> SubTreeRoot) {
        // Recursive method.
        // I have to update the root to the position 
        if (MyTreeRoot != null) {
            CreateSubTree(MyTreeRoot.left, SubTree, SubTreeRoot);
            if (MyTreeRoot.left != null) {
                SubTree.addLeft(MyTreeRoot.left.element, MyTreeRoot.element);
            }
            if (MyTreeRoot.right != null) {
                SubTree.addRight(MyTreeRoot.right.element, MyTreeRoot.element);
            }
            CreateSubTree(MyTreeRoot.right, SubTree, SubTreeRoot);

        }

    }

    private static void CreateSubTree(BinaryTree.TreeNode<Project> MyTreeRoot, BinaryTree<Project> SubTree, BinaryTree.TreeNode<Project> SubTreeRoot) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
