public class Main {
    public static void main(String[] args) {
        LL ls=  new LL();
        ls.insertFirst(5);
        ls.insertLast(10);
        ls.insertFirst(20);
        ls.insertLast(50);
        ls.display();
        ls.insert(100,2);
        ls.display();
        ls.deleteFirst();
        ls.display();
        ls.deleteLast();
        ls.delete(2);
        ls.display();
    }
}