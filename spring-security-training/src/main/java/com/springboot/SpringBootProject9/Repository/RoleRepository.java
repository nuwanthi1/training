package com.springboot.SpringBootProject9.Repository;
import com.springboot.SpringBootProject9.Models.ERole;
import com.springboot.SpringBootProject9.Models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;


public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
