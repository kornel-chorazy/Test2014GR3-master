package repositories.impl;

import java.sql.Connection;
import java.sql.SQLException;

import domain.Person;

public class PersonRepository 
	extends Repository<Person>
{

	private String insertSql=
			"INSERT INTO person(name,surname,pesel) VALUES(?,?,?)";
	
	private String updateSql=
			"UPDATE person SET (name,surname,pesel)=(?,?,?) WHERE id=?";
	
	public PersonRepository(Connection connection, IEntityBuilder<Person> builder) {
		super(connection, builder);
	}
	
	@Override
	protected String getTableName() {
		return "person";
	}

	@Override
	protected String getInsertQuery() {
		return insertSql;
	}

	@Override
	protected String getUpdateQuery() {
		return updateSql;
	}

	@Override
	protected void setUpInsertQuery(Person entity) throws SQLException {
		insert.setString(1, entity.getFirstName());
		insert.setString(2, entity.getSurname());
		insert.setString(3, entity.getPesel());
	}

	@Override
	protected void setUpUpdateQuery(Person entity) throws SQLException {
		update.setString(1, entity.getFirstName());
		update.setString(2, entity.getSurname());
		update.setString(3, entity.getPesel());
		update.setInt(4, entity.getId());
	}
}
	
	