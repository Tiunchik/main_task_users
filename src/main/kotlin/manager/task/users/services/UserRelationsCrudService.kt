package manager.task.users.services

import manager.task.users.domains.UserRelations
import manager.task.users.repositories.UserRelationsCrudRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

@Service
class UserRelationsCrudService(
    private val userRelRepository: UserRelationsCrudRepository
) {

    fun getAllUsers(): Flux<UserRelations> = userRelRepository.findAll()

    fun getUser(id: Long) = userRelRepository.findById(id)

    fun saveUser(userRel: UserRelations) = userRelRepository.save(userRel)

    fun updateUser(userRel: UserRelations) = userRelRepository.save(userRel)

    fun deleteUser(id: Long) = userRelRepository.deleteById(id)

}
