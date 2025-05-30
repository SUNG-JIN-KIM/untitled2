//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /// 각종 기본타임 변수 선언

        byte b = 10;
        short s = 100;
        int age = 25;
        long count = 1000000000L;
        float pi = 3.14f;
        double salary =  55000.5;
        char grade = 'A';
        boolean isValid = true;


        System.out.print("byte = " + b + "\n");
        System.out.print("short = " + s + "\n");
        System.out.print("int = " + age + "\n");
        System.out.print("long = " + count + "\n");
        System.out.print("float = " + pi + "\n");
        System.out.println("double = " + salary);
        System.out.println("char = " + grade);
        System.out.println("boolean = " + isValid);

        for( int i = 1; i < 50; i++){
            System.out.print("=");
        }

        /// int 변수 선언한 값 변경
        age = 26;

        System.out.print("\n" + age);

        /// double에서 int로 변환 하는 방식

        int s1 = (int) salary;

        System.out.print(salary + "\n");
        System.out.println(s);

        for( int i = 1; i < 50; i++){
            System.out.print("=");
        }

        ///String 문자열 선언

        String name = "KSJ";

        System.out.print("\n" + name);
    }
}