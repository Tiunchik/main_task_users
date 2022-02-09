package manager.task.users.services

import manager.task.users.domains.Users
import manager.task.users.repositories.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class UserCrudService(
    private val userRepository: UserRepository
) {

    fun getAllTasks(): Flux<Users> = userRepository.findAll()

    fun getTask(id: Long) = userRepository.findById(id)

    fun saveTask(users: Users) = userRepository.save(users)

    fun updateTask(users: Users) = userRepository.save(users)

    fun deleteTask(id: Long) = userRepository.deleteById(id)


}
