package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaz.InterfazProducto;
import model.TblProductocl2;

public class DaoProducto implements InterfazProducto{

	@Override
	public List<TblProductocl2> ListarProducto() {

			EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_EXAMEN_CRUZ_RODRIGUEZ");
			EntityManager emanager = conex.createEntityManager();
			emanager.getTransaction().begin();
			List<TblProductocl2> list = emanager.createQuery("SELECT c FROM TblProductocl2 c",TblProductocl2.class).getResultList();
			emanager.getTransaction().commit();
			emanager.close();
			return list;
			
	}

	@Override
	public void AgregarProducto(TblProductocl2 productocl2) {
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_EXAMEN_CRUZ_RODRIGUEZ");
		EntityManager emanager = conex.createEntityManager();
		emanager.getTransaction().begin();
		emanager.persist(productocl2);
		emanager.getTransaction().commit();
		emanager.close();
	}
}

