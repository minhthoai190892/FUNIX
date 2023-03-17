package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    /**
     * Student
     */
    public static class Student implements Comparable {
        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Object o) {
            Student other = (Student) o;
            return Integer.compare(this.age, other.age);

        }

    }

    public static void main(String[] args) {

        // Queue<Integer> minheap = new PriorityQueue<>();
        // minheap.add(1);
        // minheap.add(100);
        // minheap.add(10);
        // minheap.add(5);
        // minheap.add(16);
        // while (minheap.isEmpty() == false) {
        // System.out.println(minheap.poll());
        // }
        Queue<Student> minStudent = new PriorityQueue<>();
        minStudent.add(new Student("a", 10));
        minStudent.add(new Student("b", 5));
        minStudent.add(new Student("c", 20));
        minStudent.add(new Student("d", 1));
        while (minStudent.isEmpty() == false) {
            Student youngestStudent = minStudent.poll();
            System.out.println(youngestStudent.name + " - " + youngestStudent.age);
        }
        System.out.println();
        Queue<Student> maxStudent = new PriorityQueue<>(Comparator.reverseOrder());
        maxStudent.add(new Student("a", 10));
        maxStudent.add(new Student("b", 5));
        maxStudent.add(new Student("c", 20));
        maxStudent.add(new Student("d", 1));
        while (maxStudent.isEmpty() == false) {
            Student youngestStudent = maxStudent.poll();
            System.out.println(youngestStudent.name + " - " + youngestStudent.age);
        }
    }
}
