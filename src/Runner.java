public class Runner {
    public static void main(String[] args){
        School berkeleyHigh = new School(" Berkeley High School ");

        Section math = new Section("Math");
        Section bio = new Section("Biology");
        Section computerScience = new Section("Computer Science");

        Teacher albinson = new Teacher("Albinson", "Computer Science");
        Teacher palen = new Teacher("Palen", "math");
        Teacher mueller = new Teacher("Mueller", "Biology");

        Student me = new Student("Me", 11);
        Student jame = new Student("Jame",2);
        Student fin = new Student("Fin", 12);
        Student linda = new Student("Linda", 9);
        Student humble = new Student("Humble", 11);
        Student anna = new Student("Anna", 12);

        berkeleyHigh.addSection(math);
        berkeleyHigh.addSection(bio);
        berkeleyHigh.addSection(computerScience);

        math.setTeacher(palen);
        bio.setTeacher(mueller);
        computerScience.setTeacher(albinson);

        palen.addSection(math);
        albinson.addSection(computerScience);
        mueller.addSection(bio);

        math.addStudents(humble);
        math.addStudents(anna);
        bio.addStudents(jame);
        bio.addStudents(linda);
        computerScience.addStudents(me);
        computerScience.addStudents(fin);

        jame.addSection(math);
        anna.addSection(math);
        humble.addSection(bio);
        fin.addSection(bio);
        me.addSection(computerScience);
        linda.addSection(computerScience);


        System.out.println(berkeleyHigh.toString());
        System.out.println(math.toString());
        System.out.println(bio.toString());
        System.out.println(computerScience.toString());
        System.out.println(albinson.toString());
        System.out.println(palen.toString());
        System.out.println(mueller.toString());
        System.out.println(me.toString());
        System.out.println(jame.toString());
        System.out.println(fin.toString());
        System.out.println(linda.toString());
        System.out.println(humble.toString());
        System.out.println(anna.toString());
    }
}