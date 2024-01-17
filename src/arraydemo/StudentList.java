
package arraydemo;

/**
 *Modifies by Harsh on 17 Jan
 * @author singh
 * Commit was checked by me.
 */
public class StudentList {
    public static void main(String[] args)
    {
        Student s1 = new Student(1,"Harsh");
        
        Student[] studentList = new Student[3];
        studentList[0]=s1;
        studentList[1]=new Student(2,"Sahil"); 
        studentList[2]=new Student(3,"Rohan"); 
        
        for(int i=0; i<studentList.length; i++)
        {
            System.out.println(studentList[i].getsName());
        }

        
    }
}
