package CompanyInterviewsQuestions.Zillow;

public class RunTrinaryTree {

    public static void main(String[] args){

        TrinaryTree tt = new TrinaryTree();


        tt.insert(50);
        tt.insert(25);
        tt.insert(75);
        tt.insert(50);
        tt.insert(35);

        System.out.println("Number of node: " + tt.countNodes(tt.getRoot()));

      //  tt.delete(50);

        System.out.println("Number of node: " + tt.countNodes(tt.getRoot()));



    }


}
