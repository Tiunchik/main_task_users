package manager.task.users.domains

import manager.task.users.enums.UserType
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceConstructor
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
    @Transient
    var relations: List<Long> = listOf()
) {

    @PersistenceConstructor
    constructor(
        id: Long = 0,
        type: UserType,
        name: String,
        surname: String?,
        position: String?,
        email: String?,
        login: String?,
        password: String?
    ) : this(id, type, name, surname, position, email, login, password, listOf())

}
