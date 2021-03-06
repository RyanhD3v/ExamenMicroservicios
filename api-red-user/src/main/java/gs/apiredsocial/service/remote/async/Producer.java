package gs.apiredsocial.service.remote.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

//import com.segurosguadalupe.RabbitConfigConsumer;

@Component
public class Producer {

	private RabbitTemplate rabbitTemplate;

	public static final Logger logger = LoggerFactory.getLogger(Producer.class);

	public Producer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}

	/*public void sendMessage(String contractEvent) {
		rabbitTemplate.convertAndSend(Consumer.QUEUE_USER_AUTORIZACION, contractEvent);
		logger.info(">>>Envio de USUARIO correctamente...");
	}*/
}
