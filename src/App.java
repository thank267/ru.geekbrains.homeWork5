import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] persArray = new Person[5];

        persArray[0] = new Person("Иванов Иван", "Инженер", "ivivan@mailbox.com", "89991111111", 30000, 30);
        persArray[1] = new Person("Степанов Степан", "Менеджер", "ststepan@mailbox.com", "89992222222", 35000, 28);
        persArray[2] = new Person("Жданова Наталья", "Менеджер", "zdnataly@mailbox.com", "89993333333", 35000, 27);
        persArray[3] = new Person("Стенина Татьна", "Главный бухгалтер", "sttatiana@mailbox.com", "89994444444", 50000,
                48);
        persArray[4] = new Person("Сидоров Павел", "Директор", "sipavel@mailbox.com", "89995555555", 60000, 45);

        overYearsOld1(persArray, 40);
        overYearsOld2(persArray, 40);
    }
    
    public static void overYearsOld1(Person[] persons, int age) {

        System.out.println(String.format("Список сотруников старше %s лет (Вариант 1)\n", age));
        for (Person person : persons) {

            if (person.getAge() > age) {
                person.info();
            }

        }

    }
    
    public static void overYearsOld2(Person[] persons, int age) {

        System.out.println(String.format("Список сотруников старше %s лет (Вариант 2)\n", age));
        
        Arrays.stream(persons)
                .filter(p -> p.getAge() > age)
                .forEach(Person::info);

    }
}
