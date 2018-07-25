package org.http4k.demo

import org.http4k.server.ApacheServer
import org.http4k.server.asServer

fun main(args: Array<String>) {
    val port = if (args.isNotEmpty()) args[0].toInt() else 5000
    App().asServer(ApacheServer(port)).start().block()
}
