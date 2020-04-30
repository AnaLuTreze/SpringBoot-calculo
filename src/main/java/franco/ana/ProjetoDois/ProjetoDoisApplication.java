package franco.ana.ProjetoDois;

import franco.ana.ProjetoDois.model.Venda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoDoisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDoisApplication.class, args);


		Venda v = new Venda();

		v.setValorProduto1(30);
		v.setValorProduto2(50);
	}
}


