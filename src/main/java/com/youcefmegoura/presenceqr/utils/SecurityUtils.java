package com.youcefmegoura.presenceqr.utils;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

/**
 * @author youcefmegoura
 * @created 18/02/2023
 */
public class SecurityUtils {

    public static final String ROLE_PREFIX = "ROLE_";

    public static SimpleGrantedAuthority convertToAuthority(String role) {
        String formattedRole = role.startsWith(ROLE_PREFIX) ? role : ROLE_PREFIX + role;

        return new SimpleGrantedAuthority(formattedRole);
    }
}
