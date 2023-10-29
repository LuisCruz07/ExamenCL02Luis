package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.TblProductocl2;
import model.TblUsuariocl2;

public class DaoUsuario {
	public boolean Login(String usuario, String password) {
		boolean cx=false;
		EntityManagerFactory conex = Persistence.createEntityManagerFactory("LPII_EXAMEN_CRUZ_RODRIGUEZ");
		EntityManager emanager = conex.createEntityManager();
		emanager.getTransaction().begin();

		Query consulta = emanager.createQuery("SELECT c FROM TblUsuariocl2 c WHERE c.usuariocl2=:x and c.passwordcl2=:y", TblUsuariocl2.class);
		consulta.setParameter("x", usuario);
		consulta.setParameter("y", password);
		TblUsuariocl2 cu;
		try {
			cu = (TblUsuariocl2) consulta.getSingleResult();
			cx = true;
		} catch (Exception e) {
			cu = null;
			cx = false;
		}
		return cx;
	}}