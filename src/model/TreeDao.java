package model;


public class TreeDao extends DbContentProvider implements ITreeDao {


    private DbContentProvider dbContentProvider;

    @Override
    public int addPerson(Person person) {
        dbContentProvider = new DbContentProvider();
        return 0;
//        return dbContentProvider.insert(person);
    }

    @Override
    public Person getPerson(Integer id) {
        dbContentProvider = new DbContentProvider();
//        Person person = dbContentProvider.query(id);
        return null;
    }

    @Override
    public void updatePerson(Person person) {
        dbContentProvider = new DbContentProvider();
//        dbContentProvider.update(person);
    }
}
