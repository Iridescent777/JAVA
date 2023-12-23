package T3;
import T2.Picture;
import java.util.*;
public class ShoppingCart{

    private String User = null;
    private static ArrayList items = new ArrayList();
    private int num = 0;


    private double balance = 0;  //我的余额

    public ShoppingCart(String User) {
        this.User = User;
    }

    public void Add(Item item) {   // 添加商品
        items.add(item);
        item.Add(item);               // 覆盖函数
        System.out.println("Now you get " + items.size() + " items");
        System.out.println(items);
        System.out.println("The total cost is " + item.getAmount() + " now\n");
    }

    public void Pop(Item item) {  //删除商品
        items.remove(item);
        item.Pop(item);              //覆盖函数
        System.out.println("Now you get " + items.size() + " items");
        System.out.println(items);
        System.out.println("The total cost is " + item.getAmount() + " now\n");

    }

    public void showBalance() {
        System.out.println("your balance is "+this.balance+" $ now");
    }

    public void Pay() {                               //支付
        if (this.balance >= Item.getAmount()) {
            this.balance = this.balance - Item.getAmount();
        } else {
            System.out.println("Sorry you cannot afford the items");
        }
    }

    public static void BubbleSorting(Comparable[] compares){

        int length = compares.length;
        Comparable temp;
        for(int i = 0;i<length;i++){
            for(int j = 0;j<length-1;j++){
                if((compares[j].compareTo(compares[j+1]))>0){
                    temp = compares[j];
                    compares[j] = compares[j+1];
                    compares[j+1] = temp;
                }
            }
        }

        System.out.println("Item List:");
        System.out.println("======================================");
        for(Comparable i : compares){
            System.out.println(i);
            System.out.println("======================================");
        }

    }

    public void InsertMoney(double amount) {        //充值
        this.balance += amount;
        System.out.println("You successfully insert "+amount+" $ in your account");
    }


    public static void main(String[] args) {

        //商品对象
        //三种书
        Item OOP = new Book("Oriented Object Programming",49.0,"000001");
        Item Algorithm = new Book("Algorithm and Date Structure",42.5,"000008");
        Item NLP = new Book("Natural Language Processing",99.9,"000016");

        //三种衣物
        Item Dress1 = new Cloths("dress","L","Red",88.50);
        Item Dress2 = new Cloths("dress","S","Yellow",79.50);
        Item Shirt = new Cloths("Shirt","X","Black",55.0);

        //三种食物
        Item Chocolate = new Food("chocolate",9.90);
        Item Milk = new Food("milk",8.88);
        Item Beef = new Food("beef",19.9);


        //创建我的购物车
        ShoppingCart cl = new ShoppingCart("cl");

        cl.InsertMoney(400.0);
        cl.Add(NLP);
        cl.Add(OOP);
        cl.Add(NLP);
        cl.Add(Dress1);
        cl.Add(Shirt);
        cl.Add(Milk);
        cl.Add(Chocolate);
        Item[] al = new Item[items.size()];
        for(int i = 0;i<items.size();i++){
            al[i] = (Item)items.get(i);
        }
        BubbleSorting(al);
        cl.Pay();
        cl.showBalance();
        cl.InsertMoney(300);
        cl.Pop(NLP);
        cl.Pop(Dress1);
        cl.Pay();
        cl.showBalance();
    }
}
