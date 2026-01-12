package br.com.myprojects.screenmatch;

import br.com.myprojects.screenmatch.model.DadosSerie;
import br.com.myprojects.screenmatch.service.ConsumoAPI;
import br.com.myprojects.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication
                .class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        String chave = "ac7a2d76";
        String busca = "sherlock ";

        String endereco = "http://www.omdbapi.com/?t="
                + busca.replace(" ", "+")
                + "&apikey=" + chave;

        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados(endereco);
        System.out.println(json);
        ConverteDados conversor = new ConverteDados();
        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
