import java.util.*;

class Student {
    int id;
    String name;
    double cgpa;

    Student(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
}

class StudentComparator implements Comparator<Student> {
    public int compare(Student a, Student b){
        if(a.cgpa != b.cgpa)
            return Double.compare(b.cgpa, a.cgpa);
        if(!a.name.equals(b.name))
            return a.name.compareTo(b.name);
        return a.id - b.id;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Student> pq =
            new PriorityQueue<>(new StudentComparator());

        while(n-- > 0){
            String event = sc.next();
            if(event.equals("ENTER")){
                String name = sc.next();
                double cgpa = sc.nextDouble();
                int id = sc.nextInt();
                pq.add(new Student(id, name, cgpa));
            } else {
                pq.poll();
            }
        }

        if(pq.isEmpty()){
            System.out.println("EMPTY");
        } else {
            while(!pq.isEmpty()){
                System.out.println(pq.poll().name);
            }
        }
    }
                            }
              
