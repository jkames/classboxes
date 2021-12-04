public interface StudentCourse {
    void addCourse(String course) throws NoCourseNameException;
    void viewCourse() throws NoCourseAddedException;
    void addFee(double price) throws FeeRangeException;
}
