package site.ylan.greeting

import android.os.Build

class AndroidPlatform : Platform {
    override val name: String = "$modelName ${Build.VERSION.SDK_INT}"
}

actual val modelName: String = "Android"

actual fun getPlatform(): Platform = AndroidPlatform()