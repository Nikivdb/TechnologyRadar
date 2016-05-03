package infrastructure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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

}
