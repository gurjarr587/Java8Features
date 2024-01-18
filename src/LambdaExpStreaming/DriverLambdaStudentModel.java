package LambdaExpStreaming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DriverLambdaStudentModel {
    public static void main(String[] args){
        List<StudentModel> studentModelList = new ArrayList<StudentModel>();

        //Adding Students
        studentModelList.add(new StudentModel(3,"UT"));
        studentModelList.add(new StudentModel(5,"RG"));

        //using Lambda to filter data
        Stream<StudentModel> filterData = studentModelList.stream().filter(s->s.rollNo>2);

        //using lambda to iterate
//        for(StudentModel item:studentModelList){
//            System.out.println(item.name);
//        }
        //using foreach same for above

        filterData.forEach(x-> System.out.println(x.name));
    }
}
