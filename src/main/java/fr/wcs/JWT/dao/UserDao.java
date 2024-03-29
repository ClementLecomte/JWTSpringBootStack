package fr.wcs.JWT.dao;

import fr.wcs.JWT.models.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<DAOUser, Integer> {
    DAOUser findByEmail(String mail);
}
