package com.example.test.Service;

import com.example.test.dao.UsuarioRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
@Slf4j
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;


}
