package com.freshreview.onlineshopping.dao;

import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import com.freshreview.onlineshopping.entity.Order;

public class OrderDaoImpl implements OrderDao {

	@Autowired
	private SessionFactory sf;			

	@Override
	public boolean createOrder(Order order) {
		Session session = null;
		boolean isCreateed = false;

		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(order);
			transaction.commit();
			isCreateed = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return isCreateed;
	}

	@Override
	public List<Order> getAllOrders() {
		return null;
	}

	@Override
	public <S extends Order> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Order> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Order> findById(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Order> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll(Iterable<? extends Order> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
