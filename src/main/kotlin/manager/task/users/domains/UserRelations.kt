package manager.task.users.domains

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class UserRelations(
    @Id
    var id: Long = 0,
    var ownerId: Long,
    var employeeId: Long
)
