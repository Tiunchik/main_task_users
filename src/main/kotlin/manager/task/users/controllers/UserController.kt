package manager.task.users.controllers;

import manager.task.users.domains.Users
import manager.task.users.services.UserCrudService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userCrudService: UserCrudService
) {

    @GetMapping
    fun getAllTasks(): Flux<Users> = userCrudService.getAllTasks()

    @GetMapping("/{id}")
    fun getTask(@PathVariable("id") id: Long): Mono<Users> = userCrudService.getTask(id)

    @PutMapping
    fun saveTask(@RequestBody users: Users): Mono<Users> = userCrudService.saveTask(users);

    @PostMapping
    fun updateTask(@RequestBody users: Users): Mono<Users> = userCrudService.updateTask(users)

    @DeleteMapping("/{id}")
    fun deleteTask(@PathVariable("id") id: Long): Mono<Void> = userCrudService.deleteTask(id)

}
