package manager.task.users.repositories

import manager.task.users.domains.UserRelations
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRelationsCrudRepository: ReactiveCrudRepository<UserRelations, Long> {
}
