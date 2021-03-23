package ru.netology.nmedia.dto

data class Post(
    val id: Long,
    val author: String,
    val content: String,
    val published: Long = 0,
    val sharing: Int = 0,
    var likes: Int = 0,
    var countVisability: Int = 0,
    val video: String,
    var likedByMe: Boolean,
)