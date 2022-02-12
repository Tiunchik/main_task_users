package manager.task.users.controllers;

import manager.task.users.domains.UserRelations
import manager.task.users.services.UserRelationsCrudService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/api/v1/users/relations")
class UserRelationsController(
    private val userRelationsCrudService: UserRelationsCrudService
) {

    @GetMapping
    fun getAllUserRelations(): Flux<UserRelations> = userRelationsCrudService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserRelation(@PathVariable("id") id: Long): Mono<UserRelations> = userRelationsCrudService.getUser(id)

    @PutMapping
    fun saveUserRelation(@RequestBody userRel: UserRelations): Mono<UserRelations> = userRelationsCrudService.saveUser(userRel);

    @PostMapping
    fun updateUserRelation(@RequestBody userRel: UserRelations): Mono<UserRelations> = userRelationsCrudService.updateUser(userRel)

    @DeleteMapping("/{id}")
    fun deleteUserRelation(@PathVariable("id") id: Long): Mono<Void> = userRelationsCrudService.deleteUser(id)

}
