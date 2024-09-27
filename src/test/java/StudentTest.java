

import org.junit.jupiter.api.Test;

import com.example.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testAddGrade() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(85);
        assertEquals(1, student.getGrades().size());
        assertEquals(85, student.getGrades().get(0));
    }

    @Test
    public void testCalculateAverage() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(80);
        student.addGrade(90);
        assertEquals(85.0, student.calculateAverage());
    }

    @Test
    public void testCalculateAverageNoGrades() {
        Student student = new Student("John Doe", "12345");
        assertEquals(0.0, student.calculateAverage());
    }

    @Test
    public void testGetGradeLetter() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(85);
        student.addGrade(90);
        assertEquals('B', student.getGradeLetter());
    }

    @Test
    public void testGetGradeLetterBorderline() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(89);
        assertEquals('B', student.getGradeLetter());
        student.addGrade(1); // Now average is 90
        assertEquals('F', student.getGradeLetter());
    }

    @Test
    public void testGetGradeLetterNoGrades() {
        Student student = new Student("John Doe", "12345");
        assertEquals('F', student.getGradeLetter());
    }
}