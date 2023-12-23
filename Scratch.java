package T2;
import T1.Complex;

import java.awt.*;
import java.io.IOException;


public class Scratch {

    private double rel = 0.0;
    private double imag = 0.0;

    private Complex c = null;

    private String FileName = new String();

    public Scratch(Complex c){
        this.c = c;
    }

    public int interation(Complex z){  //迭代算法

        for(int t = 0;t<255;t++) {
            if (z.abs() > 2) return 255-t;
            z = z.multiply(z).add(c);
        }
        return 0;
    }

    public String getFileName(String c){
        return c;
    }

    public void draw() throws IOException {
        Picture pic = new Picture(1024,1024); //获得画布
        for(int i = 0;i<1024;i++){
            for(int j = 0;j<1024;j++){
                double real = i*0.00390625-2;
                double imag = j*0.00390625-2;
                Complex z = new Complex(real,imag);
                int q = interation(z);
                Color c = new Color(q,q,q);
                pic.setColor(i,j,c);
            }
        }
        pic.save("image5.png");
    }

    public static void main(String[] args) throws IOException {
        Scratch imag1 = new Scratch(new Complex(-0.8,0.156));
        Scratch imag2 = new Scratch(new Complex(-0.835,-0.2321));
        Scratch imag3 = new Scratch(new Complex(-0.7269,0.1889));
        Scratch imag4 = new Scratch(new Complex(0.285,-0.01));
        Scratch imag5 = new Scratch(new Complex(0.38,-0.18));
        imag5.getFileName("image5.png");
        imag5.draw();
    }
}
