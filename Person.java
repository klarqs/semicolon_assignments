public class Person {

    private boolean isMarried;
    private String gender;
    private String title;

    public String getTitle() {
        return title;
    }

    public Person (boolean isMarried, String gender) {
        this.isMarried = isMarried;
        this.gender = gender;

        if (gender == "Female" && isMarried == false) {
            this.title = "Miss";
        } else if (gender == "Female" && isMarried == true) {
            this.title = "Mrs";
        } else {
            this.title = "Mister";
        }
    }

    public static void main(String[] args) {

        Person person = new Person(false, "Male");

        System.out.println("\n" + person.getTitle());

    }
}

