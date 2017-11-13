package com.codecool.lanowaerp.controller;


import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableOAuth2Sso
public class LogController extends WebSecurityConfigurerAdapter {

}
