package it.ocramsoft.usercrud.repository;

import it.ocramsoft.usercrud.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
