package controllers;

import models.Pessoa;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

public class PessoaController extends Controller {
    public Result listarPessoas(){
        Pessoa pessoaService = new Pessoa();

        System.out.println(pessoaService.find.all());
        return ok(index.render());
    }
}