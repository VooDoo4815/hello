package first.hello

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class HelloApplication

fun main(args: Array<String>) {
	runApplication<HelloApplication>(*args){
		setDefaultProperties(Collections
				.singletonMap("server.port", "8015") as Map<String, Any>?)
	}
}
