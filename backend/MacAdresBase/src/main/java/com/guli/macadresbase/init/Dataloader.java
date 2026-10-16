package com.guli.macadresbase.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class Dataloader implements CommandLineRunner {

    private final PasswordEncoder passwordEncoder;

}
