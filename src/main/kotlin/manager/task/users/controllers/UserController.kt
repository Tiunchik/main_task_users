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
    fun getAllUsers(): Flux<Users> = userCrudService.getAllUsers()

    @GetMapping("/{id}")
    fun getUser(@PathVariable("id") id: Long): Mono<Users> = userCrudService.getUser(id)

    @PostMapping
    fun saveUser(@RequestBody users: Users): Mono<Users> = userCrudService.saveUser(users);

    @PutMapping
    fun updateUser(@RequestBody users: Users): Mono<Users> = userCrudService.updateUser(users)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable("id") id: Long): Mono<Void> = userCrudService.deleteUser(id)

}
