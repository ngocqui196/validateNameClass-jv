import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExampleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên lớp học: ");
        String className = sc.nextLine();

         Pattern pattern = Pattern.compile("^[CAP][0-9]{4}[G-M]");
        Matcher matcher = pattern.matcher(className);
        System.out.println("Tên lớp " + className + ": " + pattern.matcher(className).matches());
    }
}
