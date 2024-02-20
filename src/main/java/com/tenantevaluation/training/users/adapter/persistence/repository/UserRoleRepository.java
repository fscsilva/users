package com.tenantevaluation.training.users.adapter.persistence.repository;

import com.tenantevaluation.training.users.adapter.persistence.model.UserRoleCompositeKey;
import com.tenantevaluation.training.users.adapter.persistence.model.UserRoleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface UserRoleRepository extends CrudRepository<UserRoleEntity, UserRoleCompositeKey> {


    Optional<UserRoleEntity> findUserRoleEntityByUser_id (@Param("userId") BigInteger userId);

}
