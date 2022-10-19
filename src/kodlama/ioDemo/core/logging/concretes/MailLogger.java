package kodlama.ioDemo.core.logging.concretes;

import kodlama.ioDemo.core.logging.abstracts.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Mail olarak loglandı: " + data);

		
	}

}
