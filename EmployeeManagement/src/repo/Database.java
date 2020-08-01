package repo;
import java.util.Map;
import java.util.TreeMap;
import beans.Employee;

public class Database {
	public Map<String,Employee> map;
	public Database() {
		map = new TreeMap<String,Employee>();
	}
}
