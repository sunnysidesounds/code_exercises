package Numbers;

public class StairClimbing {

    public int counter1 = 0;



    public static void main(String[] args){

        StairClimbing sc = new StairClimbing();

        int steps = 6;
        int total = sc.climbStairs(steps);

        System.out.println();
        System.out.println(total);

    }


    public  int climbStairs(int n) {
        if(n == 0){return 0;}
        if(n == 1){return 1;}
        if(n == 2){return 2;}

        int total = 0;
        int first = 1;
        int second = 2;
        for(int i = 2; i < n; i++){
            total = first + second;
            first = second;
            second = total;
        }

        return total;

    }
}
