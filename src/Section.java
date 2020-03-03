public class Section {
    private String name;
    private int currentSize;
    private Teacher teacher;
    private Student[] students = new Student[50];



    public Section(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addStudents(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }


    public String toString(){
        String str = this.name + " is taught by " + this.teacher.getName() + " and has " + this.currentSize + " students: ";
        for (int i=0; i<this.currentSize; i++){
            str += students[i].getName() + " , ";
        }
        return str;
    }


}