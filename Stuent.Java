import java.util.Objects;

public class Student extends Person {
    private String email;

    public Student() {
        super();
    }

    public Student(String email) {
        super();
        setEmail(email);
    }

    public Student(String firstName, String lastName, String email) {
        super(firstName, lastName);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    /**
     * Sets the student's email. Throws IllegalArgumentException if null or invalid format.
     */
    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("email cannot be null");
        }
        // Simple validation; adjust regex to your needs
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("invalid email format: " + email);
        }
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + " Student[email=" + email + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), email);
    }
}