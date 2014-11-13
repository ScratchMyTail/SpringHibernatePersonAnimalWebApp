package no.hinesna;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
public class AppTests {

    @Autowired
    PersonService personService;

    @Ignore
    @Test
    public void testHusdyr(){
        Person person = new Person();
        person.setFornavn("test");

        Husdyr husdyr = new Husdyr();
        husdyr.setArt("Katt");
        husdyr.setNavn("Pixie");
        ArrayList<Husdyr> dyr = new ArrayList<Husdyr>();
        dyr.add(husdyr);
        person.setHusdyr(dyr);

        personService.savePerson(person);
    }

    @Test
    public void testGetPersonId(){
        Person person = personService.getPerson(1);
        System.out.println(person.getFornavn());
        System.out.println(person.getHusdyr().size());
    }
}
