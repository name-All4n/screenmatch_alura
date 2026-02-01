package br.com.myprojects.screenmatch;

import br.com.myprojects.screenmatch.model.DadosEpisodio;
import br.com.myprojects.screenmatch.model.DadosSerie;
import br.com.myprojects.screenmatch.principal.Principal;
import br.com.myprojects.screenmatch.repository.SerieRepository;
import br.com.myprojects.screenmatch.service.ConsumoAPI;
import br.com.myprojects.screenmatch.service.ConverteDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    @Autowired
    private SerieRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication
                .class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorio);
        principal.exibeMenu();
    }
}
