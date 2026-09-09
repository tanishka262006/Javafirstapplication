package com.example.Javafirstapplication.service;

import com.example.Javafirstapplication.model.Student;
import com.example.Javafirstapplication.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentById(int id) {
        return studentRepository.findById(id).orElse(null);
    }
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updateStudent(int oldId, Student student) {

        if (!studentRepository.existsById(oldId)) {
            return null;
        }

        studentRepository.deleteById(oldId);

        return studentRepository.save(student);
    }
    public boolean deleteStudent(int id) {
        if (!studentRepository.existsById(id)) {
            return false;
        }

        studentRepository.deleteById(id);
        return true;
    }
}