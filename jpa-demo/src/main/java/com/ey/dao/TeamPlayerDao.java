package com.ey.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ey.entity.Player;
import com.ey.entity.Team;

public class TeamPlayerDao {
	private EntityManagerFactory factory;

	public TeamPlayerDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}

	public int addTeam(Team t) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();

		txn.begin();
		em.persist(t);
		txn.commit();
		em.close();
		return t.getTeamId();
	}

	public int addPlayer(Player p) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		txn.begin();

		em.persist(p);
		txn.commit();
		em.close();
		return p.getPlayerName();
	}
}
