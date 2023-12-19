public class Person {
    String firstname;
    String lastname;
    int age;

    @Override
    public String toString() {
        return "firstname = "+firstname+'\n'+"lastname = "+lastname+'\n'+"age = "+age;
    }
}
