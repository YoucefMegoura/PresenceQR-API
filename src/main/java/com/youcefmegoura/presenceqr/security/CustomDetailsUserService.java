package com.youcefmegoura.presenceqr.security;

import com.youcefmegoura.presenceqr.model.AdUser;
import com.youcefmegoura.presenceqr.service.AdUserService;
import com.youcefmegoura.presenceqr.utils.SecurityUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

/**
 * @author youcefmegoura
 * @created 18/02/2023
 */
@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class CustomDetailsUserService implements UserDetailsService {

    private final AdUserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AdUser adUser = userService.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(email));

        Set<GrantedAuthority> authoritySet = Set.of(SecurityUtils.convertToAuthority(adUser.getAdRole().getName()));
        return UserPrincipal.builder()
                .adUser(adUser).guId(adUser.getAdUserGuid())
                .password(adUser.getPassword())
                .authoritySet(authoritySet)
                .build();
    }
}
