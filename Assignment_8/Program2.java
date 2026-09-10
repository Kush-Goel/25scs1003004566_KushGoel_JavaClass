class Display {
    public void show(String name) {
        System.out.println("Student Name: " + name);
    }

    public void show(String name, int age) {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public void show(String name, int age, double marks) {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Display displayObj = new Display();

        displayObj.show("Kush");
        displayObj.show("Saksham", 20);
        displayObj.show("Yash", 22, 28.5);
    }
}
