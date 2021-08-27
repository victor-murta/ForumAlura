package br.com.alura.forum.controller;

import br.com.alura.forum.Dto.TopicoDTO;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @Autowired
    private TopicoRepository topicoRepository;

    @GetMapping("/topicos")
    public List<TopicoDTO> lista(){
        List<Topico> topicos = topicoRepository.findAll();

        return TopicoDTO.converter(topicos);
    }
}
