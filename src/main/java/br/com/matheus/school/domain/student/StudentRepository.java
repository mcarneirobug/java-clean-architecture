package br.com.matheus.school.domain.student;

import java.util.List;

public interface StudentRepository {

    void enroll(Student student);

    Student findByCpf(CPF cpf);

    List<Student> listAllStudentsEnroll();
}
