/*
Roan Mason
05/03/23
A student class that has a name and a score.
*/

package sortingexercise6;

public class Student {
    
    private String name;
    private int score;

    public Student(String name) {
        this.name = name;
        score = 0;
    }

    public Student(String name, int score) {
        this(name);
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean equals(Student other) {
        if (other.getName().equals(name) && other.getScore() == score) {
            return true;
        }
        return false;
    }

    public Student clone() {
        return new Student(name, score);
    }

    public String toString() { 
        return "Name: " + name + ",\t Score: " + score;
    }
}
