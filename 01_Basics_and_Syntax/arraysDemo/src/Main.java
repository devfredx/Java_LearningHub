public class Main {

    public static void main(String[] args) {

        String student1 = "Fred";
        String student2 = "Jack";
        String student3 = "Tom";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("----------------");

        String[] students = new String[2];
        students[0] = "Fred";
        students[1] = "Jack";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        for (String student : students) {
            System.out.println(student);

        }



    }
}
