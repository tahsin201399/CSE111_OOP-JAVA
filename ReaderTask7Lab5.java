package CSE111_LAB05_OOP;

public class ReaderTask7Lab5 {
    String name;
    int capacity;
    int counts = 0;
    String[] books;

    public void createReader(String name , int capacity){
        this.name = name;
        this.capacity = capacity;
        this.books = new String[capacity];
    }

    public void readerInfo(){
        System.out.println("Name : " + name);
        System.out.println("Capacity : " + capacity);
        System.out.println("Books : ");

        if(counts == 0){
            System.out.println("No books added yet");
        }
        else{
            for(int i = 0 ; i < counts ; i++){
                System.out.println("Book " + (i+1) + " :" +books[i] );

            }
       }

    }

    public void addBook(String x){
        if(counts < capacity){
            books[counts] = x;
            counts++;
        }
        else{
            System.out.println("No more space for new book");
        }
    }

    public void increaseCapacity(int y){
        if( y > capacity){
            String[] afteraddedbooks = new String[y];
            for (int i = 0; i < counts; i++) {
                afteraddedbooks[i] = books[i];
            }
            this.capacity = y;
            this.books = afteraddedbooks;
            System.out.println(name + "'s capacity increased to " + y);
        }
    }
}
