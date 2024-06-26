package co.statu.rule.token.db.model

import co.statu.rule.database.DBEntity
import co.statu.rule.token.type.TokenType
import io.vertx.core.json.JsonObject
import java.util.*

data class Token(
    val id: UUID = UUID.randomUUID(),
    val subject: String,
    val token: String,
    val type: TokenType,
    val expireDate: Long,
    val startDate: Long = System.currentTimeMillis(),
    val additionalClaims: JsonObject = JsonObject()
) : DBEntity()