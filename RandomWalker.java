import java.util.Scanner;

public class RandomWalker {

    // Initial Position of the rabbit
    private int axis_x = 0;
    private int axis_y = 0;
    private int n = 0;
    private int trails = 0;
    double distance = 0.0;

    RandomWalker(int n,int trails){
        this.n = n;
        this.trails = trails;
    }

    public void getParameter(){
        Scanner input  = new Scanner(System.in);

        System.out.println("Please input n and trials");
        this.n = input.nextInt();
        this.trails = input.nextInt();
    }

    public void move()
    {
        int num = -1;
        for(int i =1;i<n+1;i++) {
            num = 0;
            num = 1+(int) (Math.random() * 4);
            switch (num) {
                case 1:
                    axis_x++;
                    break;
                case 2:
                    axis_x--;
                    break;
                case 3:
                    axis_y++;
                    break;
                case 4:
                    axis_y--;
                    break;

            }
        }
    }

    public void Distance(){
        double[] Trails = new double[trails];
        for(int i =0;i<trails;i++){
            move();
            distance = Math.sqrt(axis_x * axis_x + axis_y*axis_y);
            Trails[i] = distance;
        }
        distance = 0;
        for(int i =0;i<Trails.length;i++){
            distance += Trails[i];
        }
        System.out.printf("Now the Distance is %.3f\n",distance);
    }
    public static void main(String[] args) {

           RandomWalker rb1 = new RandomWalker(100,1);
           rb1.Distance();
           RandomWalker rb2 = new RandomWalker(1000,1);
           rb2.Distance();
           RandomWalker rb3 = new RandomWalker(1000,2);
           rb3.Distance();
           RandomWalker rb4 = new RandomWalker(1000,3);
           rb4.Distance();
           RandomWalker rb5 = new RandomWalker(10000,3);
           rb5.Distance();
    }
}
