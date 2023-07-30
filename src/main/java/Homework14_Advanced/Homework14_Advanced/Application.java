package Homework14_Advanced.Homework14_Advanced;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Application {
    public static void main(String[] args) {
        // Завантажте конфігурацію Hibernate
        Configuration configuration = new Configuration().configure();

        // Створіть фабрику сесій
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Відкрийте нову сесію
        try (Session session = sessionFactory.openSession()) {
            // Почати транзакцію
            session.beginTransaction();

            // Створіть об'єкт Cart
            Cart cart = new Cart();
            cart.setName("Cart1");

            // Створіть об'єкти Item
            Item item1 = new Item();
            Item item2 = new Item();
            Item item3 = new Item();
            Item item4 = new Item();

            // Додайте Item в Cart та зворотньо
            cart.getItems().addAll((Collection<? extends org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item>) item1);
            cart.getItems().addAll((Collection<? extends org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item>) item2);
            cart.getItems().addAll((Collection<? extends org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item>) item3);
            cart.getItems().addAll((Collection<? extends org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item>) item4);

            item1.getCarts().add(cart);
            item2.getCarts().add(cart);
            item3.getCarts().add(cart);
            item4.getCarts().add(cart);

            // Збережіть Cart в базу даних
            session.save(cart);

            // Завершити транзакцію
            session.getTransaction().commit();
        }
    }
}
