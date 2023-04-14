/*
Roan Mason
03/02/23
Teacher class for StudentTestHarness
*/
package studenttestharnessidcp2;

/**
 *
 * @author roanm
 */
public class Teacher implements Person{
    
    private String name;
    private Student s1;
    private Student s2;
    private Student s3;

    public Teacher(String name){
        this.name = name;
        s1 = null;
        s2 = null;
        s3 = null;
    }
    
    public Teacher(String name, Student s1, Student s2, Student s3){
        this(name);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
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
    
    public void setStudent(int studentNumber, Student student){
        switch (studentNumber) {
            case 2:
                s2 = student;
                break;
            case 3:
                s3 = student;
                break;
            default:
                s1 = student;
                break;
        }
        
        
    }
    
    public Student getStudent(int studentNumber){
        switch (studentNumber) {
            case 2:
                return s2;
            case 3:
                return s3;
            default:
                return s1;
        }
        
    }
    
    public String toString(){
        return "Teacher\nName = "+name+"\nStudent 1: "+s1.getName()+"\nStudent 2: "+s2.getName()+"\nStudent 3: "+s3.getName();
    }
    
}
