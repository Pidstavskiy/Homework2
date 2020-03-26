

public class Student {
    private String name;
    private double rating;

    public boolean betterStudent(Student firstStudent,Student secondStudent){
        if (firstStudent.getRating()>secondStudent.getRating()) {
            System.out.println(firstStudent.getName() + " has better rating ");
            return true;
        }
        else {
            System.out.println(secondStudent.getName() + " has better rating ");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Student{"+ "name:"+name+'|'+"rating:"+rating+'}';
    }

    public void changeRating(Student Student,double rating)
    {
        Student.setRating(rating);
        System.out.println("Successful");
    }

    public double averageRating(Student firstStudent,Student secondStudent,Student thirdStudent,Student fourthStudent)
    {
        double average = (firstStudent.getRating()+secondStudent.getRating()+thirdStudent.getRating()+fourthStudent.getRating())/4;
        return average;
    }

    public Student(){}


    public Student(String name,double rating) {
        this.name=name;
        this.rating=rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }



}
