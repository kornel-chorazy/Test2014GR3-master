package repositories.impl;

import java.util.List;

import domain.Role;
import repositories.IRepository;

public class DummyRoleRepository implements IRepository<Role>{

	private DummyDb db;
	
	public DummyRoleRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Role entity) {
		db.roles.add(entity);
		
	}

	@Override
	public void update(Role entity) {

		
	}

	@Override
	public void delete(Role entity) {
		db.roles.remove(entity);
	}

	@Override
	public Role get(int id) {
		
		for(Role role : db.roles)
			if(role.getId()==id)
				return role;
		return null;
	}

	@Override
	public List<Role> getAll() {
		return db.roles;
	}

}
