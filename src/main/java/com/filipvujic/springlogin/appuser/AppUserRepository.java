package com.filipvujic.springlogin.appuser;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface AppUserRepository {

    Optional<AppUser> findByEmail(String email);
}
