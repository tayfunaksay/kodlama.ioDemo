package kodlama.ioDemo.core.logging.concretes;

import kodlama.ioDemo.core.logging.abstracts.Logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Veritabanına loglandı: " + data);
		
	}

}
