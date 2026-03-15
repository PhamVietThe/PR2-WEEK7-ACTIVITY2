package Activity1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private LocalDate dateOfBirth;
    private String studentID;
    private double gpa;
    private Map<Course, Double> grades;

    public Student(String name, LocalDate dob, String sID) {
        this.name = name;
        this.dateOfBirth = dob;
        this.studentID = sID;
        this.gpa = 0.0;
        this.grades = new HashMap<>();
    }

    public String getName() {
        return name;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getStudentID() {
        return studentID;
    }
    public double getGpa() {
        return gpa;
    }
    public Map<Course, Double> getGrades() {
        return grades;
    }
    public void registerCourse(Course course) {
        if (!grades.containsKey(course)) {
            grades.put(course, null);
        } else {
            System.out.println("Course already registered!");
        }
    }
    public void assignGrade(Course course, double grade) {
        if (grades.containsKey(course)) {
            grades.put(course,  grade);
            calculateGPA();
        } else {
            System.out.println("Cannot assign grade. Course not registered for this student.");
        }
    }
    public void calculateGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (Map.Entry<Course, Double> entry : grades.entrySet()) {
            Double grade = entry.getValue();
            if (grade != null) {
                int credits = entry.getKey().getCredits();
                totalPoints += grade * credits;
                totalCredits += credits;
            }
        }
        if (totalCredits > 0) {
            this.gpa = totalPoints / totalCredits;
        } else {
            this.gpa = 0.0;
        }
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Date of Birth: ").append(dateOfBirth).append("\n");
        sb.append(String.format("GPA: %.2f\n", gpa));
        sb.append("Registered Courses:\n");

        for (Map.Entry<Course, Double> entry : grades.entrySet()) {
            Course c = entry.getKey();
            Double grade = entry.getValue();
            String gradeStr = (grade == null) ? "No grade yet" : String.valueOf(grade);
            sb.append(String.format("- %s (%s): %s (Credits: %d)\n", c.getName(), c.getCoureCode(), gradeStr, c.getCredits()));
            }
        return sb.toString();
        }
    }