package mx.projectpre;

import java.util.List;

public interface ArmasDAO {
	public void create(Arma a);
	public Arma read(Arma s);
	public List<Arma> read();
	public void update(Arma s);
	public void delete(Arma s);

}
