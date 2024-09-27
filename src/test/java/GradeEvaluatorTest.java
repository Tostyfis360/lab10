import org.junit.jupiter.api.Test;

import com.example.GradeEvaluator;
import com.example.Student;

import static org.junit.jupiter.api.Assertions.*;

public class GradeEvaluatorTest {

    @Test
    public void testEvaluatePerformance() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(70);
        GradeEvaluator evaluator = new GradeEvaluator();
        assertTrue(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformanceFailing() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(50);
        GradeEvaluator evaluator = new GradeEvaluator();
        assertFalse(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testEvaluatePerformanceNoGrades() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();
        assertFalse(evaluator.evaluatePerformance(student));
    }

    @Test
    public void testIsEligibleForHonors() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(95);
        GradeEvaluator evaluator = new GradeEvaluator();
        assertTrue(evaluator.isEligibleForHonors(student));
    }

    @Test
    public void testIsEligibleForHonorsNotEligible() {
        Student student = new Student("John Doe", "12345");
        student.addGrade(85);
        GradeEvaluator evaluator = new GradeEvaluator();
        assertFalse(evaluator.isEligibleForHonors(student));
    }

    @Test
    public void testIsEligibleForHonorsNoGrades() {
        Student student = new Student("John Doe", "12345");
        GradeEvaluator evaluator = new GradeEvaluator();
        assertFalse(evaluator.isEligibleForHonors(student));
    }
}