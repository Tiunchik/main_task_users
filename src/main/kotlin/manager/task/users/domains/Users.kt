package manager.task.users.domains

import manager.task.users.enums.UserType
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Users(
    @Id
    var id: Long = 0,
    var type: UserType,
    var name: String,
    var surname: String?,
    var position: String?,
    var email: String?,
    var login: String?,
    var password: String?,
    var relations: List<Long> = listOf()
)
