package T3;

public class Food extends Item{

    private static int food_num = 0;
    public Food(String name,double price){
        super(name,price);
    }

    public void Add(Item item){
        this.food_num++;
        System.out.println("Now you get "+food_num+" food");
        setAmount_Add(getPrice());

    }

    public void Pop(Item item){
        this.food_num--;
        System.out.println("Now you get "+food_num+" food");
        setAmount_Pop(getPrice());

    }


    public String toString(){
        String print = null;
        print = String.format("name:%s,price:%.2f ",getName(),getPrice());
        return print;
    }

}
