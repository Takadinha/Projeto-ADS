package com.mackenzie.genericos.Genericos.controle;

import com.mackenzie.genericos.Genericos.modelo.Filme;
import com.mackenzie.genericos.Genericos.modelo.Livro;
import com.mackenzie.genericos.Genericos.modelo.Obra;
import com.mackenzie.genericos.Genericos.modelo.Serie;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioFilme;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioLivro;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioObra;
import com.mackenzie.genericos.Genericos.to.NewFilme;
import com.mackenzie.genericos.Genericos.to.NewLivro;
import com.mackenzie.genericos.Genericos.to.NewSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("obra")
public class ObraControle {

    @Autowired
    private RepositorioObra repositorioObra;

    @GetMapping("cadastrafilmes")
    public String cadastrafilmes(NewFilme requisicao){
        return "/cadastros/cadastraFilmes";
    }

    @GetMapping("cadastralivros")
    public String cadastralivros(NewLivro requisicao){
        return "/cadastros/cadastraLivros";
    }

    @GetMapping("cadastraseries")
    public String cadastraseries(NewSerie requisicao){
        return "/cadastros/cadastraSeries";
    }

    @GetMapping("/index")
    public String index(Model model){
        List<Obra> obras = repositorioObra.findAll();
        model.addAttribute("obras", obras);
        return "index";
    }



    @PostMapping("newFilm")
    public String newfilm(@Valid NewFilme requisicao, BindingResult result){
//        if(result.hasErrors()){
//            return "/cadastros/cadastraFilmes";
//        }
        Filme filme = requisicao.paraFilme();
        repositorioObra.save(filme);
        return "cadastros/cadastraFilmes";
    }

    @PostMapping("newbook")
    public String newbook(@Valid NewLivro requisicao, BindingResult result){
//        if(result.hasErrors()){
//            return "/cadastros/cadastraLivros";
//        }
        Livro livro = requisicao.paraLivro();
        repositorioObra.save(livro);
        return "/cadastros/cadastraLivros";
    }

    @PostMapping("newShow")
    public String newShow(@Valid NewSerie requisicao, BindingResult result){
//        if(result.hasErrors()){
//            return "/cadastros/cadastraSeries";
//        }
        Serie serie = requisicao.paraSerie();
        repositorioObra.save(serie);
        return "/cadastros/cadastraSeries";
    }
}
