package no.hinesna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by christerhansen on 06.11.14.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao personDao;

    public void savePerson(Person person){
        personDao.savePerson(person);
    }

    public List<Person> getAll(){
        return personDao.getAll();
    }

    public void saveHusdyr(Husdyr husdyr){ personDao.saveHusdyr(husdyr);}

    public Person getPerson(int id){
        return personDao.getPerson(id);
    }
}
