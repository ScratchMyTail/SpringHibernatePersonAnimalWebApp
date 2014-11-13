package no.hinesna;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonDao  {
    public void savePerson(Person person);
    public List<Person> getAll();
    public void saveHusdyr(Husdyr husdyr);
    public Person getPerson(int id);
}
