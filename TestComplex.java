package T1;

public class TestComplex {

    public static void main(String[] args) {
        Complex a = new Complex(3, 4);
        Complex b = new Complex(2, 3);
        Complex c = new Complex();        //创建一个默认复数c
        Complex d = new Complex();
        System.out.println(a.getReal());  //输出复数a的实部
        System.out.println(a.getImag());  //输出复数a的虚部
        c.setReal(5);
        c.setImag(4);                     //对c设置他的实部和虚部
        System.out.println(c.toString()); //输出复数c
        d.setValue(1,2);        //直接设置d的实部和虚部
        System.out.println(d.toString()); //输出复数d
        System.out.println(a.isReal());                       //判断a是否为实数
        System.out.println(a.isImaginary());                  //判断a是否为纯虚数
        System.out.println(a.equals(3,4));        //判断a和3+4i是否相等
        System.out.println(a.equals(b));                    //判断a,b是否相等
        System.out.println(a.abs());                        //计算a的模
        System.out.println(a.subtract(b).add(c));           //计算a-b+c
        System.out.println(a.multiply(b).subtract(d));      //计算a*b-d;
        System.out.println(a.divide(b));                    //计算a/b
    }
}