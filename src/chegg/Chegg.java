package chegg;

public class Chegg {
    public static void main(String[] args) {
        Courses course1 = new Courses();
        Courses course2 = new Courses("Chegg",123);
        System.out.println(course1.toString());
        System.out.println(course2.toString());

    }
}
