package manager.task.users.repositories

import manager.task.users.domains.Users
import org.springframework.data.repository.reactive.ReactiveCrudRepository

interface UserRepository : ReactiveCrudRepository<Users, Long> {
}
