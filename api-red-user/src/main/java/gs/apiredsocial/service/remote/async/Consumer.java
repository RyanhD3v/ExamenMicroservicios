package gs.apiredsocial.service.remote.async;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
//import com.segurosguadalupe.RabbitConfigConsumer;
//import com.segurosguadalupe.modelo.remote.ConfirmacionDto;
//import com.segurosguadalupe.service.SegurosService;

import gs.apiredsocial.entity.Usuario;
import gs.apiredsocial.service.UsuarioDaoImp;

@Component
public class Consumer {

	
	private UsuarioDaoImp serUsuarioService;
	private Gson json = new Gson();

	public Consumer(UsuarioDaoImp serUsuarioService) {
		this.serUsuarioService = serUsuarioService;
	}

	@RabbitListener(queues = gs.apiredsocial.RabbitConfigConsumer.QUEUE_USER_CONFIRMACION)
	public void listenConfirmaciones(Message message) {
		String body = new String(message.getBody());
		

		Usuario usuarioConfirmado = json.fromJson(body, Usuario.class);

		serUsuarioService.save(usuarioConfirmado);
	}
}

