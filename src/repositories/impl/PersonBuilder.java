package repositories.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import domain.Person;

public class PersonBuilder implements IEntityBuilder<Person> {

	@Override
	public Person build(ResultSet rs) throws SQLException {
		Person person = new Person();
		person.setId(rs.getInt("id"));
		person.setFirstName(rs.getString("name"));
		person.setSurname(rs.getString("surname"));
		person.setPesel(rs.getString("pesel"));
		return person;
	}

}
