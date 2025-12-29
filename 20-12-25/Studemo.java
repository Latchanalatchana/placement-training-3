class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Student[] s = {
            new Student(1, "sri", 85),
            new Student(2, "Abhi", 78)
        };

        for (Student st : s)
            st.display();
    }
}
