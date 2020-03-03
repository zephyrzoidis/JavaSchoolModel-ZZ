public class School {
    private String name;
    private int sectionCount;
    private Section[] sections = new Section[100];



    public void addSection(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }


    public School(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Section[] getSections() {
        return sections;
    }


    public String toString() {
        String str = "The school," + this.name + " has " + sectionCount + " sections: ";
        for (int i = 0; i < sectionCount; i++) {
            str += sections[i].getName() + ", ";
        }
        return str;
    }

}
