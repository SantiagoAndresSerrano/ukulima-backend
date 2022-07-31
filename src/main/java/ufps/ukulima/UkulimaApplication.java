package ufps.ukulima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//TODO continuar los adaptadores de JPA, revisar los modelos y convertirlos entidades
@SpringBootApplication
public class UkulimaApplication {

    public static void main(String[] args) {
        SpringApplication.run(UkulimaApplication.class, args);
    }

}
