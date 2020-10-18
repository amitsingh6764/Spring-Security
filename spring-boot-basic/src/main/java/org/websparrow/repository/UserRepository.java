package org.websparrow.repository;

import org.springframework.data.repository.CrudRepository;
import org.websparrow.entity.UserDetails;

public interface UserRepository extends CrudRepository<UserDetails, Integer> {

}
