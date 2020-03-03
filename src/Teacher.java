public class Teacher extends Person {
    private String subject;
    private int sectionCount;
    private Section[] sections = new Section[10];


    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }


    public Section[] getSections() {
        return sections;
    }


    public String getSubject() {
        return subject;
    }

    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }


    public String toString(){
        String str = name + " teaches the following sections: ";
        for (int i=0; i<this.sectionCount; i++){
            str += sections[i].getName() + "(" + this.sectionCount + ")";
        }
        return str;
    }


}
