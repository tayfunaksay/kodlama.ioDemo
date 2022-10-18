package kodlama.ioDemo.core.logging;

import kodlama.ioDemo.core.logging.interfaces.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Mail olarak loglandı: " + data);

		
	}

}
