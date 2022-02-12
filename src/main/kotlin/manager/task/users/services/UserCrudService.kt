package manager.task.users.services

import manager.task.users.domains.Users
import manager.task.users.repositories.UserRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class UserCrudService(
    private val userRepository: UserRepository
) {

    fun getAllUsers(): Flux<Users> = userRepository.findAll()

    fun getUser(id: Long) = userRepository.findById(id)

    fun saveUser(users: Users) = userRepository.save(users)

    fun updateUser(users: Users) = userRepository.save(users)

    fun deleteUser(id: Long) = userRepository.deleteById(id)

}
