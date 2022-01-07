
package readwrite3;

import java.util.Scanner;

/*
Hãy định nghĩa class Book gồm các thuộc tính id, authors, title, category
(nhận 1 trong các giá trị: tạp chí, KHXH, KHTN, luận văn) và các phương thức
khởi tạo, các getters/setters.
*/

public class Book {
    private String id;
    private String authors;
    private String title;
    private String category; 

    public Book() {
    }

    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}';
    }
    
    public void input(){
        System.out.println("nhập id");
        id = new Scanner(System.in).nextLine();
        System.out.println("nhập authors");
        authors = new Scanner(System.in).nextLine();
        System.out.println("nhập title");
        title = new Scanner(System.in).nextLine();
        System.out.println("nhập category");
        category = new Scanner(System.in).nextLine();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
}
