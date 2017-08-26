'moduleBuildTarget' @ [31:22] ==> value-parameter moduleBuildTarget: ModuleBuildTarget defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[ValueParameterDescriptorImpl]

'module' @ [31:40] ==> public final val ModuleBuildTarget.module: JpsModule[MyPropertyDescriptor]

'!' @ [32:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAndroidJpsPlugin' @ [32:14] ==> private final fun hasAndroidJpsPlugin(): Boolean defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'!' @ [32:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAndroidModuleWithoutGradle' @ [32:40] ==> private final fun isAndroidModuleWithoutGradle(module: JpsModule): Boolean defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'module' @ [32:69] ==> val module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'emptyList' @ [32:85] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'ANDROID_COMPILER_PLUGIN_ID' @ [34:24] ==> private final val ANDROID_COMPILER_PLUGIN_ID: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'getAndroidResPath' @ [35:23] ==> private final fun getAndroidResPath(module: JpsModule): String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'module' @ [35:41] ==> val module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'getAndroidManifest' @ [36:29] ==> private final fun getAndroidManifest(module: JpsModule): File? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'module' @ [36:48] ==> val module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'let' @ [36:57] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> String?): String? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> String?

'getApplicationPackageFromManifest' @ [36:63] ==> private final fun getApplicationPackageFromManifest(manifestFile: File): String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[SimpleFunctionDescriptorImpl]

'it' @ [36:97] ==> value-parameter it: File defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments.<anonymous>[ValueParameterDescriptorImpl]

'if (resPath != null && applicationId != null) {
            listOf(
                    getPluginOptionString(pluginId, VARIANT_OPTION_NAME, "main;$resPath"),
                    getPluginOptionString(pluginId, PACKAGE_OPTION_NAME, applicationId))
        }
        else emptyList()' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'resPath' @ [38:20] ==> val resPath: String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'applicationId' @ [38:39] ==> val applicationId: String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'listOf' @ [39:13] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getPluginOptionString' @ [40:21] ==> private final fun getPluginOptionString(pluginId: String, key: String, value: String): String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[SimpleFunctionDescriptorImpl]

'pluginId' @ [40:43] ==> val pluginId: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'VARIANT_OPTION_NAME' @ [40:53] ==> private final val VARIANT_OPTION_NAME: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'resPath' @ [40:81] ==> val resPath: String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'getPluginOptionString' @ [41:21] ==> private final fun getPluginOptionString(pluginId: String, key: String, value: String): String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[SimpleFunctionDescriptorImpl]

'pluginId' @ [41:43] ==> val pluginId: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'PACKAGE_OPTION_NAME' @ [41:53] ==> private final val PACKAGE_OPTION_NAME: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'applicationId' @ [41:74] ==> val applicationId: String? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getExtraArguments[LocalVariableDescriptor]

'emptyList' @ [43:14] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'?:' @ [47:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JpsAndroidModuleExtension?, right: JpsAndroidModuleExtension): JpsAndroidModuleExtension[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JpsAndroidModuleExtension

'getExtension' @ [47:43] ==> @Nullable public open fun getExtension(@NotNull p0: JpsModule): JpsAndroidModuleExtension? defined in org.jetbrains.jps.android.AndroidJpsUtil[JavaMethodDescriptor]

'module' @ [47:56] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.isAndroidModuleWithoutGradle[ValueParameterDescriptorImpl]

'!' @ [48:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'androidFacet' @ [48:17] ==> val androidFacet: JpsAndroidModuleExtension defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.isAndroidModuleWithoutGradle[LocalVariableDescriptor]

'isGradleProject' @ [48:30] ==> public final val JpsAndroidModuleExtension.isGradleProject: Boolean[MyPropertyDescriptor]

'forName' @ [53:19] ==> public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'ANDROID_JPS_UTIL_CLASS_FQNAME' @ [53:27] ==> private final val ANDROID_JPS_UTIL_CLASS_FQNAME: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'moduleBuildTarget' @ [62:22] ==> value-parameter moduleBuildTarget: ModuleBuildTarget defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[ValueParameterDescriptorImpl]

'module' @ [62:40] ==> public final val ModuleBuildTarget.module: JpsModule[MyPropertyDescriptor]

'!' @ [63:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasAndroidJpsPlugin' @ [63:14] ==> private final fun hasAndroidJpsPlugin(): Boolean defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'!' @ [63:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isAndroidModuleWithoutGradle' @ [63:40] ==> private final fun isAndroidModuleWithoutGradle(module: JpsModule): Boolean defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'module' @ [63:69] ==> val module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[LocalVariableDescriptor]

'emptyList' @ [63:85] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'File' @ [65:21] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getJarPathForClass' @ [65:35] ==> @NotNull public open fun getJarPathForClass(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): String defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'this' @ [65:54] ==> <this> defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[LazyClassReceiverParameterDescriptor]

'java' @ [65:66] ==> public val <T> KClass<out KotlinAndroidJpsPlugin>.java: Class<out KotlinAndroidJpsPlugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAndroidJpsPlugin)

'isFile' @ [65:73] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'getAndroidManifest' @ [66:28] ==> private final fun getAndroidManifest(module: JpsModule): File? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[SimpleFunctionDescriptorImpl]

'moduleBuildTarget' @ [66:47] ==> value-parameter moduleBuildTarget: ModuleBuildTarget defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[ValueParameterDescriptorImpl]

'module' @ [66:65] ==> public final val ModuleBuildTarget.module: JpsModule[MyPropertyDescriptor]

'if (manifestFile != null) {
            listOf(
                    if (inJar) {
                        val libDirectory = File(PathUtil.getJarPathForClass(this::class.java)).parentFile.parentFile
                        File(libDirectory, JAR_FILE_NAME).absolutePath
                    } else {
                        // We're in tests now (in out/production/android-extensions/android-extensions-jps)
                        val kotlinProjectDirectory = File(PathUtil.getJarPathForClass(this::class.java)).parentFile.parentFile.parentFile
                        File(kotlinProjectDirectory, "dist/kotlinc/lib/$JAR_FILE_NAME").absolutePath
                    })
        }
        else emptyList()' @ [67:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<String>, elseBranch: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<String>

'manifestFile' @ [67:20] ==> val manifestFile: File? defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[LocalVariableDescriptor]

'listOf' @ [68:13] ==> public fun <T> listOf(element: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'if (inJar) {
                        val libDirectory = File(PathUtil.getJarPathForClass(this::class.java)).parentFile.parentFile
                        File(libDirectory, JAR_FILE_NAME).absolutePath
                    } else {
                        // We're in tests now (in out/production/android-extensions/android-extensions-jps)
                        val kotlinProjectDirectory = File(PathUtil.getJarPathForClass(this::class.java)).parentFile.parentFile.parentFile
                        File(kotlinProjectDirectory, "dist/kotlinc/lib/$JAR_FILE_NAME").absolutePath
                    }' @ [69:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'inJar' @ [69:25] ==> val inJar: Boolean defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[LocalVariableDescriptor]

'File' @ [70:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getJarPathForClass' @ [70:58] ==> @NotNull public open fun getJarPathForClass(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): String defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'this' @ [70:77] ==> <this> defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[LazyClassReceiverParameterDescriptor]

'java' @ [70:89] ==> public val <T> KClass<out KotlinAndroidJpsPlugin>.java: Class<out KotlinAndroidJpsPlugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAndroidJpsPlugin)

'parentFile' @ [70:96] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'parentFile' @ [70:107] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'File' @ [71:25] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'libDirectory' @ [71:30] ==> val libDirectory: (File..File?) defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[LocalVariableDescriptor]

'JAR_FILE_NAME' @ [71:44] ==> private final val JAR_FILE_NAME: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'absolutePath' @ [71:59] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'File' @ [74:54] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getJarPathForClass' @ [74:68] ==> @NotNull public open fun getJarPathForClass(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): String defined in com.intellij.util.PathUtil[JavaMethodDescriptor]

'this' @ [74:87] ==> <this> defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin[LazyClassReceiverParameterDescriptor]

'java' @ [74:99] ==> public val <T> KClass<out KotlinAndroidJpsPlugin>.java: Class<out KotlinAndroidJpsPlugin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out KotlinAndroidJpsPlugin)

'parentFile' @ [74:106] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'parentFile' @ [74:117] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'parentFile' @ [74:128] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'File' @ [75:25] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinProjectDirectory' @ [75:30] ==> val kotlinProjectDirectory: (File..File?) defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getClasspath[LocalVariableDescriptor]

'JAR_FILE_NAME' @ [75:73] ==> private final val JAR_FILE_NAME: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[PropertyDescriptorImpl]

'absolutePath' @ [75:89] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'emptyList' @ [78:14] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'?:' @ [82:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JpsAndroidModuleExtension?, right: JpsAndroidModuleExtension): JpsAndroidModuleExtension[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JpsAndroidModuleExtension

'getExtension' @ [82:40] ==> @Nullable public open fun getExtension(@NotNull p0: JpsModule): JpsAndroidModuleExtension? defined in org.jetbrains.jps.android.AndroidJpsUtil[JavaMethodDescriptor]

'module' @ [82:53] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getAndroidResPath[ValueParameterDescriptorImpl]

'getResourceDirForCompilationPath' @ [83:31] ==> @Nullable public open fun getResourceDirForCompilationPath(@NotNull p0: JpsAndroidModuleExtension): File? defined in org.jetbrains.jps.android.AndroidJpsUtil[JavaMethodDescriptor]

'extension' @ [83:64] ==> val extension: JpsAndroidModuleExtension defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getAndroidResPath[LocalVariableDescriptor]

'absolutePath' @ [83:76] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'?:' @ [87:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JpsAndroidModuleExtension?, right: JpsAndroidModuleExtension): JpsAndroidModuleExtension[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JpsAndroidModuleExtension

'getExtension' @ [87:40] ==> @Nullable public open fun getExtension(@NotNull p0: JpsModule): JpsAndroidModuleExtension? defined in org.jetbrains.jps.android.AndroidJpsUtil[JavaMethodDescriptor]

'module' @ [87:53] ==> value-parameter module: JpsModule defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getAndroidManifest[ValueParameterDescriptorImpl]

'getManifestFileForCompilationPath' @ [88:31] ==> @Nullable public open fun getManifestFileForCompilationPath(@NotNull p0: JpsAndroidModuleExtension): File? defined in org.jetbrains.jps.android.AndroidJpsUtil[JavaMethodDescriptor]

'extension' @ [88:65] ==> val extension: JpsAndroidModuleExtension defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.getAndroidManifest[LocalVariableDescriptor]

'manifestFile' @ [102:24] ==> value-parameter manifestFile: File defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.getApplicationPackageFromManifest[ValueParameterDescriptorImpl]

'parseXml' @ [102:37] ==> private final fun File.parseXml(): Document defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion[SimpleFunctionDescriptorImpl]

'documentElement' @ [102:48] ==> public final val Document.documentElement: (Element..Element?)[MyPropertyDescriptor]

'getAttribute' @ [102:64] ==> public abstract fun getAttribute(p0: (String..String?)): (String..String?) defined in org.w3c.dom.Element[JavaMethodDescriptor]

'newInstance' @ [110:50] ==> public open fun newInstance(): (DocumentBuilderFactory..DocumentBuilderFactory?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'factory' @ [111:27] ==> val factory: (DocumentBuilderFactory..DocumentBuilderFactory?) defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.parseXml[LocalVariableDescriptor]

'newDocumentBuilder' @ [111:35] ==> public abstract fun newDocumentBuilder(): (DocumentBuilder..DocumentBuilder?) defined in javax.xml.parsers.DocumentBuilderFactory[JavaMethodDescriptor]

'builder' @ [112:20] ==> val builder: (DocumentBuilder..DocumentBuilder?) defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.parseXml[LocalVariableDescriptor]

'parse' @ [112:28] ==> public open fun parse(p0: (File..File?)): (Document..Document?) defined in javax.xml.parsers.DocumentBuilder[JavaMethodDescriptor]

'this' @ [112:34] ==> <this> defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.parseXml[ReceiverParameterDescriptorImpl]

'pluginId' @ [116:29] ==> value-parameter pluginId: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.getPluginOptionString[ValueParameterDescriptorImpl]

'key' @ [116:39] ==> value-parameter key: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.getPluginOptionString[ValueParameterDescriptorImpl]

'value' @ [116:44] ==> value-parameter value: String defined in org.jetbrains.kotlin.android.jps.KotlinAndroidJpsPlugin.Companion.getPluginOptionString[ValueParameterDescriptorImpl]

