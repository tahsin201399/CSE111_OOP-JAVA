package CSE111_LAB06_OOP;

public class ShelfTask2Lab06 {
    int capacity;
    int books;

    public void showDetails(){
        System.out.println("Shef capacity : " + capacity);
        System.out.println("Number of books : " + books);
    }

    public void addBooks(int x){
        if(capacity == 0){
            System.out.println("Zero capacity. Cannot add books.");
        }
        else if (x + books > capacity){
            System.out.println("Exceeds capacity");
        }
        else{
            books = books + x;
            System.out.println(books + " books added to shelf");
        }

    }
}
