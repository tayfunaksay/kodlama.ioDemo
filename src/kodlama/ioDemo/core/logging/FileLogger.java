package kodlama.ioDemo.core.logging;

import kodlama.ioDemo.core.logging.interfaces.Logger;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		
		System.out.println("Dosyaya loglandı: " + data);

		
	}

}
