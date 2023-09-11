package com.hlebnikov.topbodyapp.utils

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.engine.cio.CIO
import io.ktor.client.request.get
import io.ktor.client.request.headers
import kotlinx.serialization.Serializable


@Serializable
data class Call(
    val id: Number,
    val name: String,
    val image_list: String,
    val avatar: Array<String>,
    val count_users: Number,
    val status: String
)

@Serializable
data class CallListBody(
    val count: Number? = null,
    val next: Number? = null,
    val previous: Number? = null,
    val results: List<Call>? = null

    )


suspend fun getCallList(): CallListBody {
    val client = HttpClient(CIO) {};
    client.use { client ->
        val response: CallListBody = client.get(
            "https://trainer.top-body.ru/api/challenges_list/"
        ) {
            headers{
                append("X-CSRFToken", "r4e7wxy5Sh0gs0RMEUB4ABNvId8t1bPbGZGx1sje28AHEdSarvKf082Xo0ZYz6zq")
                append("accept", "application/json")
            }
        }.body()
        println(response)
        return response
    }
}





@Serializable
data class CallInfoBody(
    val name: String? = null,
    val count_users: Number? = null,
    val image_card: String? = null,
    val avatar: Array<String>? = null,
    val count_users_4: Number? = null,
    val task_minutes: Number? = null,
    val frequence: String? = null,
    val skip_days: Number? = null,
    val status: String? = null,
    val achive_win: String? = null,
    val duration: Number? = null,
    val count_exercises: Number? = null,
    val exercises: Array<Number>? = null,
    val name_exercises: Array<String>? = null,
    val repeats_or_time: Array<Number>? = null

)


