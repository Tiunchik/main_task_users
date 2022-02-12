package manager.task.users.dto


data class JmsWrapper<T>(
    val version: String,
    val event: String,
    val payload: T
)
