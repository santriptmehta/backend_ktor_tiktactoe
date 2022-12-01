package com.blankspace.plugins

import com.blankspace.socket
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import models.TicTacToeGame

fun Application.configureRouting(game: TicTacToeGame) {

    routing {
        socket(game)
    }
}
