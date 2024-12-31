package site.ylan.greeting

interface Platform {
    val name: String
}

expect val modelName: String

expect fun getPlatform(): Platform