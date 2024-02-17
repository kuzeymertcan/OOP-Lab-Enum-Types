class Main {
    public static void main(String[] args) {

        Teacher[] teachers = {new Teacher(642842, Subjects.favSubject.MATH),
                new Teacher(253172, Subjects.favSubject.SCIENCE),
                new Teacher(368785, Subjects.favSubject.HISTORY),
                new Teacher(682524, Subjects.favSubject.CS)};

        System.out.println("**************************************************************");
        System.out.println("************TEACHERS AND INFO ABOUT THEIR SUBJECTS************");
        for(int i = 0; i <= 3; i++){

            System.out.println("Teacher " + (i+1));
            System.out.println("Teacher ID: " + teachers[i].id);
            System.out.println("Teacher Subject: " + teachers[i].favSubject);
            System.out.println("Info About " + teachers[i].favSubject + " Subject: " + teachers[i].favSubject.description);
            if(i < 3){
                System.out.println("");
            }
        }
        System.out.println("**************************************************************");
    }
}