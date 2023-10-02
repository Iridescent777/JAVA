public class PIByMonte {
    private double axis_x = 0.0;
    private double axis_y = 0.0;
    private double n = 0;
    private long m = 0;

    PIByMonte(long n)
    {
        this.n = n;
    }
    public void Simulation()
    {
        for(int i=1;i<n+1;i++)
        {
          axis_x = Math.random();
          axis_y = Math.random();
          if(Math.sqrt(axis_x*axis_x+axis_y*axis_y)<1){
              m++;
          }
        }
        System.out.printf("PI is about %.7f\n",4*m/n);
    }
    public static void main(String[] args) {
        PIByMonte simulation = new PIByMonte(100);
        simulation.Simulation();
        PIByMonte simulation2 = new PIByMonte(100000);
        simulation2.Simulation();
        PIByMonte simulation3 = new PIByMonte(10000000);
        simulation3.Simulation();
    }
}
