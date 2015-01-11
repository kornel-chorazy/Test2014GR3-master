package repositories.impl;

import java.util.List;

import domain.Person;
import repositories.IRepository;

public class DummyPersonRepository implements IRepository<Person>{

	private DummyDb db;
	
	public DummyPersonRepository(DummyDb db) {
		super();
		this.db = db;
	}

	@Override
	public void save(Person entity) {
		db.persons.add(entity);
		
	}

	@Override
	public void update(Person entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Person entity) {
		db.persons.remove(entity);
	}

	@Override
	public Person get(int id) {
		for(Person person : db.persons)
			if(person.getId()==id)
				return person;
		return null;
	}

	@Override
	public List<Person> getAll() {
		return db.persons;
	}

}
