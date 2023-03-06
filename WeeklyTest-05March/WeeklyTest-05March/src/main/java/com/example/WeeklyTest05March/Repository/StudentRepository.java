package com.example.WeeklyTest05March.Repository;

import com.example.WeeklyTest05March.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
@Query(value="select * from tbl_student where active=:active",nativeQuery=true)
    public List<Student>findByActive(boolean active);
@Query(value="select * from tbl_student where first_name=:name",nativeQuery=true)
    public Student findBYFirstName(String name);
    @Query(value = "select * from tbl_student where first_name= :firstName and last_name = :lastName", nativeQuery = true)
    public Student findByFirstNameAndLastName(String firstName, String lastName);

    @Query(value = "select * from tbl_student where age>:age",nativeQuery = true)
    public Student findByAgeGreaterThan(Integer age);

    @Query(value = "select * from tbl_student where age<:age",nativeQuery = true)
    public Student findByAgeLessThan(Integer age);

}
