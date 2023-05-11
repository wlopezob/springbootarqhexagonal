package pe.edu.galaxy.appcomisaria.adapter.in.apis.rest.annotation;


import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Documented
@Retention(RetentionPolicy.RUNTIME)
@RestController
public @interface RestControllerAdapter {

}
