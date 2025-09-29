class A{
    String name;
    int num;
    A() {
        this("juno",11);
    }
    A(String name, int num) {
        this.name = name;
        this.num = num;
    }
    void display() {
        System.out.println(name + " " + num);
    }
}
public class newClass {
    public static void main(String[] args) {
        A obj = new A();
        A obj1 = new A("princess", 22);
        obj.display();
        obj1.display();
    }
}
