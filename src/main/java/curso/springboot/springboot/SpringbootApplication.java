package curso.springboot.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication // starta o projeto na web atraves do RUN
@EntityScan(basePackages = "curso.springboot.model")
@ComponentScan(basePackages = { "curso.*" }) // essa anotaçao varre todos o pacotes com inicio (curso.*) do projeto
												// para// subir o projeto
@EnableJpaRepositories(basePackages = "curso.springboot.repository")// ativando a pasta de repository para que seja reconhcida a interface
@EnableTransactionManagement // ativando a parte de transaçao de persistencia
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

}
