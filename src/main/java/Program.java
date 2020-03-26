public class Program {
    public static void main(String[] args)
    {

        Student student = new Student();
        Student firstStudent = new Student("Vitalii",75);
        Student secondStudent = new Student("Danylo",82);
        Student thirdStudent = new Student("Maksum",70);
        Student fourthStudent = new Student("Andrii",60);
        System.out.println(firstStudent.getName()+" "+firstStudent.getRating());
        System.out.println(secondStudent.getName()+" "+secondStudent.getRating());
        System.out.println(thirdStudent.getName()+" "+thirdStudent.getRating());
        System.out.println(fourthStudent.getName()+" "+fourthStudent.getRating());

        System.out.println("Average rating : "+student.averageRating(firstStudent,secondStudent,thirdStudent,fourthStudent));



        System.out.println("Changing the rating ");
        System.out.println("Rating before changing : "+firstStudent.getRating());
        student.changeRating(firstStudent,65);
        System.out.println("Rating after changing : "+firstStudent.getRating());

        System.out.println("Average rating after changing : "
                + student.averageRating(firstStudent,secondStudent,thirdStudent,fourthStudent));
    }
}
