package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;

public class AtualizacaoTopicoForm {

    @NotNull
    @NotBlank
    private String titulo;

    @NotNull @NotBlank
    private String mensagem;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Topico atualizar(Long  id, TopicoRepository topicoRepository){
        Topico topico = topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
