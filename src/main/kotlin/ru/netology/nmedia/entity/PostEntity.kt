package ru.netology.nmedia.entity

import ru.netology.nmedia.dto.Post
import javax.persistence.Id
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType

@Entity
data class PostEntity(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Long,
    var author: String,
    var content: String,
    var published: Long,
    val sharing: Int = 0,
    var likes: Int = 0,
    var countVisability: Int = 0,
    val video: String,
    var likedByMe: Boolean,
) {
    fun toDto() = Post(id, author, content, published, sharing, likes, countVisability, video, likedByMe)

    companion object {
        fun fromDto(dto: Post) = PostEntity(dto.id, dto.author, dto.content, dto.published, dto.sharing, dto.likes, dto.countVisability, dto.video, dto.likedByMe)
    }
}