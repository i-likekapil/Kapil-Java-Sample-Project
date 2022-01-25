package chegg;

public class Courses {
    private String Course_Code;
    private int Course_Credit;

    public Courses(String Course_Code, int Course_Credit) {
        this.Course_Code = Course_Code;
        this.Course_Credit = Course_Credit;
    }

    public Courses() {
        this.Course_Code = "";
        this.Course_Credit = -1;
    }

    @Override
    public String toString() {
        return "Courses[" +
                "Course_Code='" + Course_Code + ',' +
                ", Course_Credit=" + Course_Credit +
                ']';
    }
}
