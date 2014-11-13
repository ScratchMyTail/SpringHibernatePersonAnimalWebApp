package no.hinesna;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by christerhansen on 06.11.14.
 */
@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {
    @Inject
    private SessionFactory sessionFactory;

    @Override
    public void savePerson(Person person) {
        getSession().saveOrUpdate(person);
    }

    @Override
    public List<Person> getAll() {
        return getSession().createQuery("from Person").list();
    }

    @Override
    public void saveHusdyr(Husdyr husdyr) {
        getSession().save(husdyr);
    }

    @Override
    public Person getPerson(int id){
        Query query = getSession().createQuery("from Person where id = :id ");
        query.setParameter("id", id);

        return (Person)query.uniqueResult();
    }

    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
}
