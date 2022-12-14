package lines;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("\nTASK1\n");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        System.out.println("Full name is: " + firstName + middleName + lastName);
    }

    //done
    public static void task2() {
        System.out.println("\nTASK2\n");
        String firstName = "Ivan ";
        String middleName = "Ivanov ";
        String lastName = "Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println("Full name for report : " + fullName.toUpperCase());
    }

    public static void task3() {
        System.out.println("\nTASK3\n");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Full name of coworker is " + fullName);
    }
}
