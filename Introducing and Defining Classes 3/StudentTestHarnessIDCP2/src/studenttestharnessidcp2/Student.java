/**
 * B Cutten
 * Sept 2014
 * Student class, manages a student's name and three test scores
 */
package studenttestharnessidcp2;

public class Student {
    
    private String name;    
    private int test1;      
    private int test2;      
    private int test3;      
    
    /**
     * Constructor that creates student object with default attributes
     */
    public Student(){
        name = "";
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }
    
    /**
     * Constructor that creates student object with name and default test scores
     * @param n - The student's name
     */
    public Student(String n){
        this();
        name = n;
    }
    
    /**
     * Constructor that creates student object with name and copies test scores from another student
     * @param s - another student object
     */
    public Student(Student s){
        this(s.name);
    	test1 = s.test1;
    	test2 = s.test2;
    	test3 = s.test3;
    }
    /**
     * Mutator that changes the name of the student
     * @param nm - New name of the student
     */
    public void setName(String nm){
        name = nm;
    }
    /**
     * Accessor that gets the name of the student
     * @return 
     */
    public String getName(){
        return name;
    }
    /**
     * Mutator that modifies the different test scores
     * @param i - which test score is being updated
     * @param score - score its being updated to
     */
    public void setScore(int i, int score){
        //Can change 1 of the 3 test scores. 'i' determines which that is. if 'i' equals 1, change test score 1. 
        if (i==1){
            test1 = score;
        }else if (i==2){
            test2 = score;
        }else{
            test3 = score;
        }
    }
    /**
     * Accessor that gets a test score based on parameter
     * @param i - which test score is being requested
     * @return 
     */
    public int getScore(int i){
        //Can request 1 of the 3 test scores. 'i' determines which that is. if 'i' equals 1, return test score 1.
        if (i==1){
            return test1;
        }else if(i==2){
            return test2;
        }else{
            return test3;
        }
    }
    /**
     * Accessor that calculates the averages between all the scores and returns the average
     * @return 
     */
    public int getAverage(){
        int average;
        //Calculates the sum of the scores and divids by 3 to find the product
        average = (int)Math.round((test1+test2+test3) / 3.0);
        return average;
    }
    /**
     * Accessor that compares all scores and returns the highest test score
     * @return 
     */
    public int getHighScore(){
        int highscore;
        highscore = test1; //First score is highest by default
        if(test2 > highscore){ //check if second score is higher
            highscore = test2;
        }
        if(test3 > highscore){ //check if third score is higher
            highscore = test3;
        }
        return highscore;
    }
    /**
     * Returns all attributes in string format.
     * @return 
     */
    public String toString(){
        String str;
        str = "Name:    " + name + "\n" +
                "Test 1:    " + test1 + "\n" +
                "Test 2:    " + test2 + "\n" +
                "Test 3:    " + test3 + "\n" +
                "Average:   " + getAverage();
        return str;
    }
}
