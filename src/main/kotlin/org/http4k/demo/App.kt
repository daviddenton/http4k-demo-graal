package org.http4k.demo

import org.http4k.core.then
import org.http4k.filter.ServerFilters.BasicAuth
import org.http4k.routing.ResourceLoader
import org.http4k.routing.static

object App {
    operator fun invoke() = BasicAuth("http4k", "graal", "graal")
            .then(static(ResourceLoader.Classpath()))
}