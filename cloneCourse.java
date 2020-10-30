import java.lang.Cloneable;

class Course implements Cloneable{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(){
        numberOfStudents = 0;
    }

    public Course(String student){
        students[numberOfStudents] = student;
        numberOfStudents ++;
    }

    public void add(String student){
        students[numberOfStudents] = student;
        numberOfStudents ++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudents(String student){
    }

    // 重写clone()
    @Override
    public Course clone() throws CloneNotSupportedException{
        Course copy = new Course();
        String[] x = new String[100];
        x = getStudents();
        System.arraycopy(x, 0, copy.students, 0, 100);
        copy.numberOfStudents = numberOfStudents;
        return copy;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Course java = new Course();
        java.add("1");

        // 深拷贝后对两个Course分别进行不同的操作
        Course java_copy = (Course) java.clone();
        java.add("c");
        java_copy.add("d");
        java_copy.add("e");

        System.out.println(java.getStudents()[1]);
        System.out.println(java_copy.getStudents()[1]);

        System.out.println(java.getNumberOfStudents());
        System.out.println(java_copy.getNumberOfStudents());
    }
}

