package fr.wcs.JWT.controllers;

import fr.wcs.JWT.models.Test;
import org.hibernate.dialect.Teradata14Dialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


//@CrossOrigin(maxAge = 3600)
@RestController
public class HelloWorldController {


    @GetMapping("/hello")
    @CrossOrigin()
    public Object firstPage() {
        Test newTest = new Test("Hello");
        return new ResponseEntity<Test>(new Test("Hello"), HttpStatus.OK);
    }


}




