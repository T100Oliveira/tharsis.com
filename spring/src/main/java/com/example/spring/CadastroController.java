package com.example.spring;





  
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Model.Usuario;
import Repository.UsuarioRepository;


@RestController

@RequestMapping("/brasilia")
 public class CadastroController {
	
	@Autowired  private UsuarioRepository usuarioRepository;

    @GetMapping("/cadastro")
    public String salvarCadastro() {    
		return  "<!DOCTYPE html>\r\n" + 
				"<html lang=\"pt-br\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <title>Cadastro</title>\r\n" + 
				"    <style>\r\n" + 
				"        body {\r\n" + 
				"            font-family: Arial, sans-serif;\r\n" + 
				"            background-color: #f2f2f2;\r\n" + 
				"            display: flex;\r\n" + 
				"            justify-content: center;\r\n" + 
				"            align-items: center;\r\n" + 
				"            height: 100vh;\r\n" + 
				"            margin: 0;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .container {\r\n" + 
				"            background-color: white;\r\n" + 
				"            padding: 20px;\r\n" + 
				"            border-radius: 10px;\r\n" + 
				"            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n" + 
				"            width: 100%;\r\n" + 
				"            max-width: 400px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .container h2 {\r\n" + 
				"            margin-bottom: 20px;\r\n" + 
				"            color: #333;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group {\r\n" + 
				"            margin-bottom: 15px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group label {\r\n" + 
				"            display: block;\r\n" + 
				"            margin-bottom: 5px;\r\n" + 
				"            color: #676;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group input {\r\n" + 
				"            width: 100%;\r\n" + 
				"            padding: 10px;\r\n" + 
				"            border: 1px solid #ddd;\r\n" + 
				"            border-radius: 5px;\r\n" + 
				"            box-sizing: border-box;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group input:focus {\r\n" + 
				"            border-color: #5cb85c;\r\n" + 
				"            outline: none;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .btn {\r\n" + 
				"            width: 100%;\r\n" + 
				"            padding: 10px;\r\n" + 
				"            background-color: #5cb85c;\r\n" + 
				"            color: white;\r\n" + 
				"            border: none;\r\n" + 
				"            border-radius: 5px;\r\n" + 
				"            cursor: pointer;\r\n" + 
				"            font-size: 16px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .btn:hover {\r\n" + 
				"            background-color: #4cae4c;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group a {\r\n" + 
				"            color: #5cb85c;\r\n" + 
				"            text-decoration: none;\r\n" + 
				"            font-size: 14px;\r\n" + 
				"            display: block;\r\n" + 
				"            text-align: right;\r\n" + 
				"            margin-top: 10px;\r\n" + 
				"        }\r\n" + 
				"\r\n" + 
				"        .form-group a:hover {\r\n" + 
				"            text-decoration: underline;\r\n" + 
				"        }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <div class=\"container\">\r\n" + 
				"        <h2>Cadastro</h2>\r\n" +
				" <div class=\"form-group\">\r\n" +
				"  <form action=\"cadastrado\" action=\"{/cadastrar}\" method=\"post\">\r\n" + 
				"        <label for=\"nome\">Nome:</label>\r\n" + 
				
				"        <input type=\"text\" id=\"nome\" name=\"nome\"/><br/>\r\n" + 
				
				"        <label for=\"email\">Email:</label>\r\n" + 
				
				"        <input type=\"text\" id=\"email\" name=\"email\"/><br/>\r\n"+
				
				"        <label for=\"senha\">Senha:</label>\r\n" +
				
				"        <input type=\"password\" id=\"senha\" name=\"senha\"/><br/>\r\n" +
				
				"        <input type=\"submit\" value=\"cadastrar\"/>\r\n" + 
				"    </form>" + 
				"    </div>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"";
   
    }
    
   
    
    @PostMapping("/cadastrado")
      public  ResponseEntity<Usuario> CrerateUsuario (@RequestBody Usuario usuario) {
    	
    	Usuario salvaUsuario = usuarioRepository.save(usuario);
    	
   	return new ResponseEntity<>(salvaUsuario,HttpStatus.CREATED);

	}
    
    @DeleteMapping("/cadestro/{id}")
    
    public String deletaCadastro(@PathVariable long id) {
    	
    	usuarioRepository.deleteById(id);
    	
    	
    	return "";
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    @PutMapping("/cadastro/{id}")
    	
    	
   public ResponseEntity<Usuario> Updateusuario(@RequestBody Usuario usuario,@PathVariable long id){
    Optional<Usuario> updateUsuario = usuarioRepository.findById(id);
    
    if(updateUsuario.isPresent()) {
    	Usuario mudaUsuario = updateUsuario.get();
        mudaUsuario.setNome(mudaUsuario.getNome());
    	mudaUsuario.setAgenda(mudaUsuario.getAgenda());
    	Usuario usuarioMudado = usuarioRepository.save(usuario);
    	return ResponseEntity.ok(usuarioMudado);
    	
    }else {  return ResponseEntity.notFound().build();}
    	
    	
    	
    }	
    	
    	
    	
    
    
    
    
    
    
    };

