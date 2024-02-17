public class Teacher {
    int id;
    Subjects.favSubject favSubject; // Specify the type of favSubject

    Teacher(int id, Subjects.favSubject favSubject) {
        this.id = id;
        this.favSubject = favSubject;
    }
}