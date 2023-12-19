
public class Main {
    public static void main(String... args){

        Car car = new Car();
        car.color= "yashil";
        car.model = "Nexia";
        car.autoMech = "Avtomat";
        car.price = 15898;

        System.out.println(car);
        System.out.println("------------------------------");

        Uchburchak uchburchak = new Uchburchak();
        uchburchak.a=12;
        uchburchak.b=8;
        uchburchak.c=25;
        uchburchak.getInfo();

        System.out.println("------------------------------");

        Person person = new Person();
        person.firstname = "Adham";
        person.lastname = "Makhmudov";
        person.age = 27;

        System.out.println(person);
    }
}