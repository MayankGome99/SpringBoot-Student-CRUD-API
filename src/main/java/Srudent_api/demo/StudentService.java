package Srudent_api.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // 1. Get all students from SQL Database
    public ArrayList<Student_1> getAllStudents() {
        return new ArrayList<>(repo.findAll());
    }

    // 2. Save a new student to SQL Database
    public void addStudent(Student_1 student) {
        repo.save(student);
    }

    // 3. Delete a student by ID from SQL Database
    public boolean deleteStudentById(int id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return true;
        }
        return false;
    }

    public Student_1 findStudentById(int id) {
        return repo.findById(id).orElse(null);

    }



    // 4. Update a student in SQL Database
    public boolean updateStudent(int id, Student_1 updatedStudent) {
        if (repo.existsById(id)) {
            updatedStudent.setId(id);
            repo.save(updatedStudent);
            return true;
        }
        return false;
    }
}