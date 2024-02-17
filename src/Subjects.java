public class Subjects {
    public static enum favSubject {
        MATH("Information regarding math."),
        SCIENCE("Information regarding science."),
        HISTORY("Information regarding history."),
        CS("Information regarding computer science.");

        public String description;

        favSubject(String description) {
            this.description = description;
        }
    }
}