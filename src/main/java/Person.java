import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age;
    protected String city;


    public Person(String name, String surname,  int age, String city){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public PersonBuilder newChildBuilder(){
        String childSurname = getSurname();
        String childAddress = getCity();
        return new PersonBuilder().setSurname(childSurname).setAddress(childAddress);
    }

    public boolean hasAge() {
        return age != 0;
    }

    public boolean hasAddress(){
        return city != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public void setAddress (String address) {
        this.city = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, city);
    }
}
