package Practice;

public class Book<T> {
    private T myBook;
    private int i=5;
    public Book(T in){
        this.myBook=in;
    }
    public T getMyBook(){
        return myBook;
    }
    public int getI()
    {
        return i;
    }
}
