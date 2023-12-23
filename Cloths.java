package T3;

public class Cloths extends Item{
    private static int cloths_num = 0;
    private String size = null; //衣服尺码
    private String color = null; //衣服颜色

    public Cloths(String name,String size,String color,double price){
        super(name,price);
        this.color = color;
        this.size = size;
    }

    public void Add(Item item){
        this.cloths_num++;
        System.out.println("Now you get "+cloths_num+" cloths");
        setAmount_Add(getPrice());

    }

    public void Pop(Item item){
        this.cloths_num--;
        System.out.println("Now you get "+cloths_num+" books");
        setAmount_Pop(getPrice());

    }


    public String getSize(){
        return this.size;
    }

    public String getColor(){
        return this.color;
    }

    public String toString(){
        String print = null;
        print = String.format("name:%s,size:%s,color:%s,price:%.2f ",getName(),getSize(),getColor(),getPrice());
        return print;
    }
}
