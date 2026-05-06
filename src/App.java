import controllers.PersonController;
import models.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person[] personas = {
            new Person("Juan", 20, new int[]{10,15,20}), // 15
            new Person("Maria", 18, new int[]{15,15,20}), // 16.66
            new Person("Pedro", 25, new int[]{20,15,20}), // 18.33
            new Person("Ana", 22, new int[]{20,20,20}), //
            new Person("Jorge", 15, new int[]{10,10,20}),
        };
        for (Person person : personas) {
            System.out.println(person);
        }
        PersonController pController = new PersonController();
        pController.sortPeopleByAge(personas);
        System.out.println("--- Ordenar por edad ---");
        for (Person person : personas) {
            System.out.println(person);
        }
        pController.sortPeopleByName(personas);
        System.out.println("--- Ordenar por nombre ---");
        for (Person person : personas) {
            System.out.println(person);
        }
        pController.sortPeopleByAvr(personas);
        System.out.println("--- Ordenar por promedio de notas ---");
        for (Person person : personas) {
            System.out.println(person);
        }
        
       
    }
}
