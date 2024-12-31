package site.ylan.greeting

import platform.UIKit.UIDevice

class IOSPlatform : Platform {
    override val name: String = modelName + " " + UIDevice.currentDevice.systemVersion
}

actual val modelName: String = "IOS"

actual fun getPlatform(): Platform = IOSPlatform()