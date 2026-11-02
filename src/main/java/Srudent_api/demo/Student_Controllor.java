package Srudent_api.demo;
import org.hibernate.annotations.processing.Find;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Student_Controllor {

@Autowired
    private StudentService service;

@GetMapping("/get_AlL_Students_Data")
    public ArrayList<Student_1> getStudents(){
    return service.getAllStudents();
}

@PostMapping("/Add_new_Student_Data")
    public String addStudent(@RequestBody Student_1 newstudent){
    service.addStudent(newstudent);
    return "Added student successfully";
}

@DeleteMapping("/Students_By/{id}")
    public String deleteStudent(@PathVariable int id){
    boolean removed = service.deleteStudentById(id);
    if(removed){
        return "Student with ID " + id + " successfully deleted";

    }else  {
        return "Student with ID " + id + " not found";
    }
}
@PutMapping("/UPDATE_Student_By/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student_1 updatedStudent){
    boolean updated = service.updateStudent(id, updatedStudent);
    if(updated){
        return "Student with ID " + id + " successfully updated";

    }
    else {
        return "Student with ID " + id + " not found";
    }
}
@GetMapping("/Students_By/{id}")
public Student_1 getStudentById(@PathVariable int id){
return service.findStudentById(id);


}

}
