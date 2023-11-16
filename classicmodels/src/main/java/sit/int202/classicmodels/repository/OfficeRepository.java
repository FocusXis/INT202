package sit.int202.classicmodels.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import sit.int202.classicmodels.entities.Office;

import java.util.List;

public class OfficeRepository {
    private EntityManager entityManager;

    private EntityManager getEntityManager() {
        if (entityManager == null || !entityManager.isOpen()) {
            entityManager = EntityManagerBuilder.getEntityManager();
        }
        return entityManager;
    }

    public List<Office> findAll() {
        return getEntityManager().createQuery("select o from Office o").getResultList();
    }
    public List<Office> findAllPageSize(int page, int pageSize) {
        int startPosition = (page - 1) * pageSize;
        EntityManager entityManager = getEntityManager();
        Query query = entityManager.createQuery("select o from Office o");
        query.setFirstResult(startPosition);
        query.setMaxResults(pageSize);
        List<Office> officeList = query.getResultList();
        entityManager.close();
        return officeList;
    }

    public Office find(String officeCode) {
        return getEntityManager().find(Office.class, officeCode);
    }

    public boolean insert(Office office) {
        try {
            EntityManager entityManager = getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(office);
            entityManager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public boolean delete(String officeCode) {
        EntityManager entityManager = getEntityManager();
        Office office = find(officeCode);
        try {
            if (office != null) {
                entityManager.getTransaction().begin();
                entityManager.remove(office);
                entityManager.getTransaction().commit();
            }
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean delete(Office office) {
        if (office != null) {
            EntityManager entityManager = getEntityManager();
            if (entityManager.contains(office)) {
                entityManager.getTransaction().begin();
                entityManager.remove(office);
                entityManager.getTransaction().commit();
                return true;
            } else {
                return delete(office.getOfficeCode());
            }
        }
        return false;
    }

    public boolean update(Office newOffice) {
        if (newOffice != null) {
            EntityManager entityManager = getEntityManager();
            Office office = find(newOffice.getOfficeCode());
            if (office != null) {
                entityManager.getTransaction().begin();
                office.setCity(newOffice.getCity());
                office.setPhone(newOffice.getPhone());
                office.setAddressLine1(newOffice.getAddressLine1());
                office.setAddressLine2(newOffice.getAddressLine2());
                office.setState(newOffice.getState());
                office.setCountry(newOffice.getCountry());
                office.setPostalCode(newOffice.getPostalCode());
                office.setTerritory(newOffice.getTerritory());
                entityManager.getTransaction().commit();
                return true;
            }
        }
        return false;
    }

    public EntityTransaction getTransaction() {
        return getEntityManager().getTransaction();
    }

    public List<Office> findByCityOrCountry(String cityOrCountry) {
        cityOrCountry = cityOrCountry.toLowerCase() + '%';
        Query query = getEntityManager().createNamedQuery("OFFICE.FIND_BY_CITY_OR_COUNTRY");
        query.setParameter("city", cityOrCountry);
        query.setParameter("country", cityOrCountry);
        return query.getResultList();
    }
    public void close() {
        if (entityManager != null && entityManager.isOpen()) {
            entityManager.close();
        }
    }

}
