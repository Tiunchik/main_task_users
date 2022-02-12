package manager.task.users

import manager.task.users.configuration.jms.ArtemisConfigurationProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(ArtemisConfigurationProperties::class)
class MainTaskUsersApplication

fun main(args: Array<String>) {
    runApplication<MainTaskUsersApplication>(*args)
}
