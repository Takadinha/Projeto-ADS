package com.mackenzie.genericos.Genericos.controle;

import com.mackenzie.genericos.Genericos.modelo.Filme;
import com.mackenzie.genericos.Genericos.modelo.Livro;
import com.mackenzie.genericos.Genericos.modelo.Obra;
import com.mackenzie.genericos.Genericos.modelo.Serie;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioFilme;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioLivro;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioObra;
import com.mackenzie.genericos.Genericos.repositorio.RepositorioSerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexControle {

    @Autowired
    private RepositorioObra repositorioObra;
    @Autowired
    private RepositorioLivro repositorioLivro;
    @Autowired
    private RepositorioSerie repositorioSerie;
    @Autowired
    private RepositorioFilme repositorioFilme;

    @GetMapping("/index")
    public String index(Model model){
        List<Obra> obras = repositorioObra.findAll();
        model.addAttribute("obras", obras);
        return "index";
    }
}
