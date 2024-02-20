package com.tenantevaluation.training.users.adapter.persistence.repository;


import com.tenantevaluation.training.users.adapter.persistence.model.RoleEntity;
import com.tenantevaluation.training.users.adapter.persistence.model.UserEntity;
import com.tenantevaluation.training.users.adapter.persistence.model.UserRoleEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.math.BigInteger;
import java.util.Optional;

@RepositoryRestResource(collectionResourceRel = "role", path = "role-service")
public interface RoleRepository extends CrudRepository<RoleEntity, BigInteger> {

    @Operation(summary = "Get role from ID")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Role retrieved", content = { @Content(mediaType = "application/json",
            schema = @Schema(implementation = UserRoleEntity.class)) }),
        @ApiResponse(responseCode = "500", description = "There was an error searching the Role"),
        @ApiResponse(responseCode = "400", description = "Malformed request")})
    Optional<RoleEntity> findRoleEntityById (@Param("id") BigInteger id);


}
