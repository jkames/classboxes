class NoCourseNameException extends Exception{
    public NoCourseNameException(String s){
        super(s);
//        System.out.println("No course name entered");
    }

}

class NoCourseAddedException extends Exception{
    public NoCourseAddedException(String s){
        super(s);
//        System.out.println("Please enter a course first");
    }
}

class FeeRangeException extends Exception{
    public FeeRangeException(String s){
        super(s);
//        System.out.println("Enter acceptable fee");
    }
}
class StudentCourseManagement implements StudentCourse{
    String course;
    double price;

    StudentCourseManagement(){
        this.course = "";
        this.price = 0.0;
    }
    @Override
    public void addCourse(String course) throws NoCourseNameException {
        if(course.equals(""))
            throw new NoCourseNameException("no course name");
       this.course = course;
    }

    @Override
    public void viewCourse()throws NoCourseAddedException {
        if(this.course.equals("")){
            throw new NoCourseAddedException("no course added");
        }
        System.out.println(this.course);
    }

    @Override
    public void addFee(double price)throws FeeRangeException {
        if(price <1000 || price > 3000)
            throw new FeeRangeException("Fee out of range");
        else if(price >1500){
            this.price = price-(price*.1);
        }
        else
            this.price = price;
        System.out.println(this.price);
    }
}
public class assignment12_3 {
    public static void main(String[] args) {
        StudentCourseManagement math = new StudentCourseManagement();
        try{
            math.addCourse("");
        }catch(NoCourseNameException e){
            e.printStackTrace();
        }
        try{
            math.viewCourse();
        }catch(NoCourseAddedException e){
            e.printStackTrace();
        }
        try{
            math.addFee(50.00);
        }catch(FeeRangeException e){
            e.printStackTrace();
        }
        StudentCourseManagement english = new StudentCourseManagement();
        try{
            english.addCourse("writing");
        }catch(NoCourseNameException e){
            e.printStackTrace();
        }
        try{
            english.viewCourse();
        }catch(NoCourseAddedException e){
            e.printStackTrace();
        }
        try{
            english.addFee(2000.00);
        }catch(FeeRangeException e){
            e.printStackTrace();
        }
    }
}
