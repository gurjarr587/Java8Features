package LambdaExpOnPojo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LambdaStudent {
    public static void main(String[] args){
        List<StudentModel> studentModelList = new ArrayList<StudentModel>();
        studentModelList.add(new StudentModel(9,"ram"));
        studentModelList.add(new StudentModel(0,"syam"));
        studentModelList.add(new StudentModel(-1,"jake"));
        System.out.println("Sorting on the basis of name");

        //Implemeting Lambda

        Collections.sort(studentModelList,(p1,p2)->{return p1.name.compareToIgnoreCase(p2.name);});

        for(StudentModel studentList:studentModelList){
            System.out.println(studentList.rollNo+" "+studentList.name);
        }
    }
}
