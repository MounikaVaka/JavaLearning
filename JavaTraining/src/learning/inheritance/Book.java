package learning.inheritance;

public class Book {

    int length;

    public int breadth;

    public int numOfPages;

    public Book(int len, int bdth, int num ){

        this.length = len;

        this.breadth = bdth;

        this.numOfPages = num;

    }

    public String openBook(){

        System.out.println("Opened the book...");

        return "hi";

    }

    public void closeBook(){

        System.out.println("Closed the book...");

    }

    public void printProps(){


        System.out.println("Length of the book is " + " " + this.length);

        System.out.println("Breadth of the book is " + " " + this.breadth);

        System.out.println("Num of pages" + " " + this.numOfPages);
    }
}
