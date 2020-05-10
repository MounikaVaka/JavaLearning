package learning.inheritance;

public class Novel extends Book {

    public String title;

    public String author;

    //Constructor
    public Novel(int len, int bdth, int num, String title, String author){

        super(len,bdth,num);//Calling the Super Class constructor

        this.title = title;

        this.author = author;


    }

//override
    @Override
    public String openBook(){

        System.out.println("Opened the book in subclass...");

        return "hi in subclass";

    }

    public void pagesRead(){

        System.out.println(" 20 ");
    }




    // Main method
    public static void main(String[] args){


        Book book = new Book(10,20,300);

        book.printProps();

        book.openBook();


        Novel novel =new Novel(10, 20, 400, "Magic", "Rhonda");

        novel.printProps();
        novel.openBook();


        Book novel2 = new Novel(20,15,500, "ALchemist", "Coelho");

        novel2.printProps();

        novel2.openBook();



        //Book book = new Book(10, 15, 200);


       // Book book1 = new Novel(10, 20, 300, "Wings of Fire", "APJ Abdul Kalam"); //this is called upcasting


       // Novel novel = new Novel(30, 40, 400, "The Alchemist", "Paulo Coelho");





    }
}
