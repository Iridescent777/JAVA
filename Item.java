package T3;
import java.util.*;
import T2.Picture;
public abstract class Item implements Comparable{


    private String name = null;
    private double price = 0.0;
    private static double amount = 0.0;
    private int num = 0;




    public Item(){

    }
    public Item(String name,double price){
        this.name = name;
        this.price = price;
    }

    public abstract void Add(Item item);

    public abstract void Pop(Item item);

    public double getPrice(){
        return this.price;  //得到单价
    }

    public static double getAmount(){
        return amount;
    }   //得到总价



    public double setAmount_Add(double amount){        //增加物品
        this.amount += amount;
        return this.amount;
    }

    public double setAmount_Pop(double amount){         //减少物品
        this.amount = this.amount -amount;
        return this.amount;
    }


    public String getName()
    {
        return name;
    }


    public int compareTo(Object o){
        Item i = (Item) o;
        if(this.price>i.getPrice()){
            return 1;
        }
        else{
            return -1;
        }
    }





}
