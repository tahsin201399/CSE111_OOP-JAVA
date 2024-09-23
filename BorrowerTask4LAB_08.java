package CSE111_LAB08_OOP;

public class BorrowerTask4LAB_08{
    public static int [] book_count  = {3 , 3 , 3};
    public static String [] book_name   = {"Pather Panchali", "Durgesh Nandini", "Anandmath"};
    public String name;
    public String [] borrowbooks = new String [3];
    public int bookbowcount = 0;

    public BorrowerTask4LAB_08(String name){
        this.name = name;
    }
    public static void bookStatus(){
        System.out.println("Available books :");
        for(int i = 0 ; i < book_name.length; i++){
            System.out.println(book_name[i] + " : " + book_count[i]);
        }
    }
    public void borrowBook(String a){
        boolean bookFound = false;  
        for(int i = 0; i < book_name.length; i++){
            if(book_name[i].equals(a)){
                bookFound = true;
                if(book_count[i] > 0){
                    book_count[i]--;
                    borrowbooks[bookbowcount++] = a;
                    return;  
                } 
                else{
                    System.out.println("This book is not available");
                    return;  
                }
            }
        }
        if(!bookFound){
            System.out.println("This book is not available");
        }
    }
    public void borrowerDetails(){
        System.out.println("Name : " + name);
        System.out.println("Books Borrowed: ");
        for(int i = 0 ; i < bookbowcount ; i++){
            System.out.println(borrowbooks[i]);
        }
    }
    public static int remainingBooks(String x){
        for(int i = 0; i < book_name.length; i++){
            if (book_name[i].equals(x)){
                return book_count[i]; 
            }
        }
        return 0;

    }

}
