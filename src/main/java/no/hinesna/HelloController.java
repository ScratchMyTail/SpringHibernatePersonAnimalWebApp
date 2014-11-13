package no.hinesna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    PersonService personService;

	@RequestMapping(method = RequestMethod.GET)
	public String printMenu(ModelMap model) {
		return "menu";
	}

    @RequestMapping(value="/add", method = RequestMethod.GET)
    public Person showAddForm(){
        return new Person();
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public String saveAddForm(Person person){
        personService.savePerson(person);
        return "saved";
    }

    @RequestMapping(value="/addhusdyr", method = RequestMethod.GET)
    public Husdyr showAddHusdyr(Model model){
        List<Person> personer = personService.getAll();
        model.addAttribute("personer", personer);
        return new Husdyr();
    }

    @RequestMapping(value="/addhusdyr", method = RequestMethod.POST)
    public String saveHusdyr(Husdyr husdyr){
        Person person = personService.getPerson(husdyr.getP_id());
        List<Husdyr> dyr = person.getHusdyr();
        dyr.add(husdyr);
        person.setHusdyr(dyr);
        personService.savePerson(person);
        return "savedhusdyr";
    }

    @RequestMapping(value="/list", method = RequestMethod.GET)
    public void list(Model model){
        List<Person> personer = personService.getAll();
        model.addAttribute("personer", personer);
    }
}































