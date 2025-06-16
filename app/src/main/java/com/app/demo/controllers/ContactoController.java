package com.app.demo.controllers;
import com.app.demo.models.Contacto;
import com.app.demo.services.EmailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/contacto")
@CrossOrigin(origins = "*") 
public class ContactoController {

    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<String> recibirFormulario(@RequestBody Contacto datos) {
        System.out.println("Formulario recibido:");
        System.out.println("Nombre: " + datos.getNombre());
        System.out.println("Email: " + datos.getEmail());
        System.out.println("Mensaje: " + datos.getMensaje());
        emailService.enviarFormulario(datos); 
        return ResponseEntity.ok("Formulario recibido correctamente");
    }
}
