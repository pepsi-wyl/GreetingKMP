package site.ylan.greeting

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import site.ylan.greeting.net.RocketComponent
import kotlin.random.Random
import kotlin.time.Duration.Companion.seconds

class Greeting {
    private val platform = getPlatform()
    private val rocketComponent = RocketComponent()

    fun greet(): Flow<String> = flow {
        emit(if (Random.nextBoolean()) "Hi!" else "Hello!")
        delay(1.seconds)
        emit("Guess what this is! > ${platform.name}")
        delay(1.seconds)
        emit(daysPhrase())
        emit(rocketComponent.launchPhrase())
    }
}