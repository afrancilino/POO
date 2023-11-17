import br.com.devflix.gui.*;
import br.com.devflix.gui.botoes.*;
import br.com.devflix.videos.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Anime anime = new Anime();
        Documentario documentario = new Documentario();
        Filme filme = new Filme();
        Novela novela = new Novela();
        Serie serie = new Serie();


        Janela janelinha = new Janela();
        MiniaturaVideo miniaturaVideo = new MiniaturaVideo();

        BotaoPause botaoPause = new BotaoPause();
        BotaoPlay botaoPlay = new BotaoPlay();
        BotaoVoltar botaoVoltar = new BotaoVoltar();

        System.out.println(anime.toString() + documentario.toString() + filme.toString() +
        novela.toString() + serie.toString());

        System.out.println(janelinha.toString() + miniaturaVideo.toString());

        System.out.println(botaoPause.toString() + botaoPlay.toString() + botaoVoltar.toString());

    }
}
