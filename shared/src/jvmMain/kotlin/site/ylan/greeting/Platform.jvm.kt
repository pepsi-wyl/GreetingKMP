package site.ylan.greeting

class JVMPlatform : Platform {
    override val name: String = "$modelName ${System.getProperty("java.version")}"
}

actual val modelName: String = "JVM"

actual fun getPlatform(): Platform = JVMPlatform()