package hackerRankproblems;
import java.util.*;
class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() { return id; }
    public String getFname() { return fname; }
    public double getCgpa() { return cgpa; }
}

class Checker implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        // Compare by CGPA (descending)
        if (Double.compare(b.getCgpa(), a.getCgpa()) != 0) {
            return Double.compare(b.getCgpa(), a.getCgpa());
        }
        // Compare by First Name (ascending)
        if (!a.getFname().equals(b.getFname())) {
            return a.getFname().compareTo(b.getFname());
        }
        // Compare by ID (ascending)
        return a.getId() - b.getId();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        in.close();

        // Sort using custom comparator
        Collections.sort(studentList, new Checker());

        // Print only names in sorted order
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
/*
Sample Input

5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76
*/
/*
Sample Output

Ashis
Fahim
Samara
Samiha
Rumpa
*/
/*
Short Problem Statement
You are given a list of students with ID, First Name, and CGPA.
You must sort them using these rules:

CGPA → higher first (descending).

If CGPA is the same → sort by First Name alphabetically.

If both are the same → sort by ID (ascending).

Finally, print only the First Name of each student in the sorted order.
*/