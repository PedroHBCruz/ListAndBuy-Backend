package com.wolfpack.listandbuy.services;

import org.springframework.mail.SimpleMailMessage;

import com.wolfpack.listandbuy.domain.Cliente;
import com.wolfpack.listandbuy.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);

	
}
