public class Student extends Person {
    private Section[] students = new Section[10];
    private int grade;
    private int sectionCount;



    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }


    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }


    public Section[] getSections() {
        return students;
    }


    public void addSection(Section s) {
        students[sectionCount] = s;
        sectionCount++;
    }

    public String toString(){
        String str = name + " is in grade " + this.grade + " and is enrolled in the following sections: ";
        for (int i=0; i<this.sectionCount; i++){
            str += students[i].getName() + " (" + students[i].getTeacher() + ")";
        }
        return str;
    }



}