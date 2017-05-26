package model;

public interface ITreeDao {


	public int addPerson(Person person);
	public Person getPerson(Integer id);
	public void updatePerson(Person person);
	
}
