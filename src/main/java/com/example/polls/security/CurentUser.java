package com.example.polls.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER, )
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {

}
