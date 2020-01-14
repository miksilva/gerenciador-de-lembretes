package edu.ifal.br.lembretes_controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RepositoryRestController
public class Controlador {
    
    @Autowired
    repoLembrete repoLembrete;
    Lembretes lembretes = new Lembretes();
    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping("/Formulario")
    public ModelAndView form(Lembretes lembretes) {
        ModelAndView mv = new ModelAndView("formulario.html");
        mv.addObject("Lembretes", lembretes);
        return mv;
    }

    @RequestMapping("/adicionar")
    public ModelAndView adicionar(Lembretes lembretes, RedirectAttributes redirect) {
        repoLembrete.save(lembretes);
        ModelAndView mv = new ModelAndView("redirect:/lista");
        redirect.addFlashAttribute("mensagem", lembretes.getDescricao() + "adicionado com sucesso");
        return mv;
    }

    @RequestMapping("/lista")
    public ModelAndView listaLembretes(){
        ModelAndView mv = new ModelAndView("lista.html");
        Iterable<Lembretes> lembretes = repoLembrete.findAll();
        mv.addObject("lembretes", lembretes);
        return mv;
   }

}