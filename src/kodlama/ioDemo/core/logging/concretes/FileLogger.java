package kodlama.ioDemo.core.logging.concretes;

import kodlama.ioDemo.core.logging.abstracts.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Dosyaya loglandı: " + data);

		
	}

}
