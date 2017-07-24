/**
 * 
 */
package com.insticator.restapi.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Akash.Palewar
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.insticator.restapi.web.controller")
public class RestApplicationConfig{
	
}
