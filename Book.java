package T3;

public class Book extends Item{

    String id = null;
    private static int num_book = 0;


    public Book(String name,double price,String id){
        super(name,price);
        this.id = id;
    }


    public void Add(Item item){
        this.num_book++;
        System.out.println("Now you get "+num_book+" books");
        setAmount_Add(getPrice());


    }

    public void Pop(Item item){
        this.num_book--;
        System.out.println("Now you get "+num_book+" books");
        setAmount_Pop(getPrice());

    }



    public String toString(){
        String print = null;
        print = String.format("name:《%s》,price:%.2f ",getName(),getPrice());
        return print;
    }



}
