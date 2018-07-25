package org.http4k.demo

import org.http4k.core.Response
import org.http4k.core.Status.Companion.OK
import org.http4k.core.then
import org.http4k.filter.ServerFilters.BasicAuth

object App {
    operator fun invoke() = BasicAuth("http4k", "graal", "graal").then { Response(OK).body("hello!")}
}