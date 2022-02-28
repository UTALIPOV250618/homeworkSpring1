package peaksoft;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personID",Person.class);
        Person person1 = context.getBean("person1ID",Person.class);

        System.out.println(person);
        person.callAnimal();
        person.colorOfAnimal();

        System.out.println(person1);
        person1.callAnimal();
        person1.colorOfAnimal();


    }
}
