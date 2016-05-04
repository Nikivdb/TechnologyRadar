package infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PersonRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public PersonRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<String> findAllLastNames() {
        return this.jdbcTemplate.queryForList("select LastName from Persons", String.class);
    }

    public List<Person> findAllPersons() {
        return this.jdbcTemplate.query("select LastName, FirstName, Address, City from Persons", (resultSet, i) -> {
            Person person = new Person();
            person.setAddress(resultSet.getNString("Address"));
            person.setLastName(resultSet.getNString("LastName"));
            person.setFirstName(resultSet.getNString("FirstName"));
            person.setCity(resultSet.getNString("City"));
            return person;
        });
    }

}
