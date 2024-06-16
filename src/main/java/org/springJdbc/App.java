package org.springJdbc;

import org.springJdbc.dao.StudentDao;
import org.springJdbc.dao.StudentDaoImpl;
import org.springJdbc.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
        StudentDao studentDao=context.getBean("studentDaoImpl",StudentDao.class);

        Scanner scanner=new Scanner(System.in);
 //To insert

//        Student student=new Student();
//        System.out.print("Enter Student Id : ");
//        student.setId(scanner.nextInt());
//
//        System.out.print("\nEnter Student Name : ");
//        student.setName(scanner.next());
//
//        System.out.print("\nEnter Student City : ");
//        student.setCity(scanner.next());
//
//        int result=studentDao.insert(student);
//        System.out.println("Number of record inserted..."+ result);

        //to update
//        Student student=new Student();
//        System.out.print("Enter Student Id : ");
//        student.setId(scanner.nextInt());

//       System.out.print("\nEnter Student Name : ");
//       student.setName(scanner.next());

//       System.out.print("\nEnter Student City : ");
//       student.setCity(scanner.next());

//        int result=studentDao.change(student);
//        System.out.println("Number of record updated..."+ result);

        // to delete

//        System.out.print("Enter Student Id : ");
//        int result=studentDao.remove(scanner.nextInt());
//        System.out.println(result + " Row is deleted");

        //to select single object
//        System.out.print("Enter Student id : ");
//        Student student=studentDao.fetchStudent(scanner.nextInt());
//        System.out.println(student.toString());

        //to select all object
        List<Student> students=studentDao.featchAllStudent();
        for (Student s:students)
        System.out.println(s);










    }
}
