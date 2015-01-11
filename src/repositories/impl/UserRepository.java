package repositories.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domain.Person;
import domain.Role;
import domain.User;
import repositories.IRepository;
import repositories.IUserRepository;

public class UserRepository 
	extends Repository<User>
	implements IUserRepository
{

	protected UserRepository(Connection connection, IEntityBuilder<User> builder) {
		super(connection, builder);
	}

	@Override
	protected void setUpUpdateQuery(User entity) throws SQLException {
		update.setString(1, entity.getLogin());
		update.setString(2, entity.getPassword());
		update.setInt(3, entity.getId());
	}

	@Override
	protected void setUpInsertQuery(User entity) throws SQLException {	
		insert.setString(1, entity.getLogin());
		insert.setString(2, entity.getPassword());
		
	}

	@Override
	protected String getTableName() {
		return "users";
	}

	@Override
	protected String getInsertQuery() {
		return "INSERT INTO users(login,password) values(?,?)";
	}

	@Override
	protected String getUpdateQuery() {
		return "update users set (login,password)=(?,?) where id=?";
	}

	@Override
	public List<User> withRole(Role role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withRole(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> withRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
