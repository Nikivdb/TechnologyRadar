package helloworld;

import infrastructure.Person;
import infrastructure.PersonRepository;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class HelloWorldController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(path = "/hello/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String index() {
        return "Hello World!";
    }

    @RequestMapping(path = "/hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String index(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(path = "/lastNames/", produces = MediaType.APPLICATION_JSON_VALUE)
    public String lastNames() {
        return String.join(", ", personRepository.findAllLastNames());
    }

    @RequestMapping(path = "/persons/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> persons() {
        return personRepository.findAllPersons();
    }

}
