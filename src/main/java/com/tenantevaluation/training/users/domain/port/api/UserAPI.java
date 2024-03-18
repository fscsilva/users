package com.tenantevaluation.training.users.domain.port.api;

import com.tenantevaluation.training.users.domain.user.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0.0/users")
public interface UserAPI {

    @Operation(summary = "Find user by username with role")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "User retrieved", content = { @Content(mediaType = "application/json", schema = @Schema(implementation = User.class)) }),
        @ApiResponse(responseCode = "500", description = "There was an error trying to retrieve user"),
        @ApiResponse(responseCode = "400", description = "Malformed request")})
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    ResponseEntity<User> findUserByUsernameWithRole(@RequestParam String username);

}
