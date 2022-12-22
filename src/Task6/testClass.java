package Task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

class SortingStudentsByGPA implements Comparable<SortingStudentsByGPA>{

    private String name;
    private int score;
    SortingStudentsByGPA(String name, int bal){
        this.score = score;
        this.name = name;
    }
    String getName(){return name;}

    public int compareTo(SortingStudentsByGPA p){

        return name.length()-p.getName().length();
    }
    public interface Comparator<E> {

        int compare(int a, String b);
        // остальные методы
    }
    int ScoreN(){return score;}
    public static int  tetsClass() {
        ArrayList<Student> list = new ArrayList<Student>();
        int ln = 10;
        int[] iDNumber = new int[ln];
        for (int i = 1; i < ln; i++){
            int key = iDNumber[i], j = i-1;
            while(j >=0 && iDNumber[i] > key){
                iDNumber[i +1]= iDNumber[i];
                i = i -1;
            }
            iDNumber[i+1] = key;
        }
        return 0;
    }
    public static void main(String[] args) {
        Comparator<SortingStudentsByGPA> pcomp = (Comparator<SortingStudentsByGPA>) new PersonNameComparator().thenComparing(new ScoreComparator());
        TreeSet<SortingStudentsByGPA> people = new TreeSet((java.util.Comparator) pcomp);
        people.add(new SortingStudentsByGPA("Tom", 23));
        people.add(new SortingStudentsByGPA("Nick",34));
        people.add(new SortingStudentsByGPA("Tom",10));
        people.add(new SortingStudentsByGPA("Bill",14));

        for(SortingStudentsByGPA  p : people){

            System.out.println(p.getName() + " " + p.ScoreN());
        }

    }

}
class ScoreComparator implements Comparator<SortingStudentsByGPA>{

    public int compare(SortingStudentsByGPA a, SortingStudentsByGPA b){

        if(a.ScoreN()> b.ScoreN())
            return 1;
        else if(a.ScoreN()< b.ScoreN())
            return -1;
        else
            return 0;
    }
}
class PersonNameComparator implements Comparator<SortingStudentsByGPA>{

    public int compare(SortingStudentsByGPA a, SortingStudentsByGPA b){

        return a.getName().compareTo(b.getName());
    }
}


