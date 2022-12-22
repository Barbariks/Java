package Task1;

public class Book {
    private String name;
    private int age;
    private String color;

    public Book(int a, String n, String c){
        name = n;
        age = a;
        color = c;
    }
    public Book(String n){
        name = n;
        color = "blue";
        age = 2001;
    }
    public Book(String n, String c){
        name = n;
        color = c;
        age = 2001;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  void setName(String name){
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return this.name+" color "+color+" data "+age;
    }
    public void PrintName(){
        System.out.println("Name book: "+name+"\n"+"Color: "+color+"\n"+"Data: "+age+"\n--------------------------");
    }
}
class BookTest {
    public static void main(String[] args) {
        book d1 = new book();
        book d2 = new book("MUMU", "1854");
        book d3 = new book("MUMU");
        book d4 = new book("MUMU", "1854", "I.S.Turgenev");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
