package com.app.demo.services;

import com.app.demo.models.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void enviarFormulario(Contacto datos) {
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo("fraidias27@gmail.com");
        mensaje.setSubject("Nuevo mensaje de contacto");
        mensaje.setText("Nombre: " + datos.getNombre() +
                        "\nEmail: " + datos.getEmail() +
                        "\nMensaje:\n" + datos.getMensaje());

        mailSender.send(mensaje);
    }
}
