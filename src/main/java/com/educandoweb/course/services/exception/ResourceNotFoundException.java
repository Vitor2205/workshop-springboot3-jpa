package com.educandoweb.course.services.exception;
//SUBCLASSE DO RUNTIMEEXCEPTION - COMPILADOR NÃO OBRIGA A TRATAR
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
//CONSTRUTOR RECEBE O OBJ ID E QUANDO ELE NÃO ENCONTRAR RETORNA A MENSAGEM NA SUPER()//
	public ResourceNotFoundException(Object id) {
			super("Resource not found. id "+ id);
	}
	

	
}
