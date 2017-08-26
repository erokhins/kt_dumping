'JvmField' @ [48:5] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'compile' @ [49:55] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'compile' @ [50:57] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'compile' @ [51:58] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'File' @ [54:27] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'JvmStatic' @ [56:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (ApplicationManager.getApplication().isUnitTestMode)
            kotlinPathsForDistDirectory
        else
            KotlinPathsFromHomeDir(compilerPathForIdeaPlugin)' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinPaths, elseBranch: KotlinPaths): KotlinPaths[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinPaths

'getApplication' @ [58:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [58:57] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'kotlinPathsForDistDirectory' @ [59:13] ==> @JvmStatic public final val kotlinPathsForDistDirectory: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'KotlinPathsFromHomeDir' @ [61:13] ==> public constructor KotlinPathsFromHomeDir(@NotNull homePath: File) defined in org.jetbrains.kotlin.utils.KotlinPathsFromHomeDir[JavaClassConstructorDescriptor]

'compilerPathForIdeaPlugin' @ [61:36] ==> private final val compilerPathForIdeaPlugin: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'JvmStatic' @ [63:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (!pathUtilJar.isFile) {
            // Not running from a jar, i.e. it is it must be a unit test
            kotlinPathsForDistDirectory
        }
        else KotlinPathsFromHomeDir(compilerPathForCompilerJar)' @ [65:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinPaths, elseBranch: KotlinPaths): KotlinPaths[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinPaths

'!' @ [65:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pathUtilJar' @ [65:22] ==> public final val pathUtilJar: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'isFile' @ [65:34] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'kotlinPathsForDistDirectory' @ [67:13] ==> @JvmStatic public final val kotlinPathsForDistDirectory: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'KotlinPathsFromHomeDir' @ [69:14] ==> public constructor KotlinPathsFromHomeDir(@NotNull homePath: File) defined in org.jetbrains.kotlin.utils.KotlinPathsFromHomeDir[JavaClassConstructorDescriptor]

'compilerPathForCompilerJar' @ [69:37] ==> private final val compilerPathForCompilerJar: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'JvmStatic' @ [71:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'KotlinPathsFromHomeDir' @ [73:17] ==> public constructor KotlinPathsFromHomeDir(@NotNull homePath: File) defined in org.jetbrains.kotlin.utils.KotlinPathsFromHomeDir[JavaClassConstructorDescriptor]

'File' @ [73:40] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'HOME_FOLDER_NAME' @ [73:53] ==> public const final val HOME_FOLDER_NAME: String defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'pathUtilJar' @ [77:23] ==> public final val pathUtilJar: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'!' @ [78:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jar' @ [78:18] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForCompilerJar>[LocalVariableDescriptor]

'exists' @ [78:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'NO_PATH' @ [78:39] ==> private final val NO_PATH: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'jar' @ [80:17] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForCompilerJar>[LocalVariableDescriptor]

'name' @ [80:21] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'KOTLIN_COMPILER_JAR' @ [80:29] ==> public const final val KOTLIN_COMPILER_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'jar' @ [81:27] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForCompilerJar>[LocalVariableDescriptor]

'parentFile' @ [81:31] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'lib' @ [82:24] ==> val lib: (File..File?) defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForCompilerJar>[LocalVariableDescriptor]

'parentFile' @ [82:28] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'NO_PATH' @ [85:20] ==> private final val NO_PATH: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'pathUtilJar' @ [90:23] ==> public final val pathUtilJar: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'!' @ [91:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'jar' @ [91:18] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForIdeaPlugin>[LocalVariableDescriptor]

'exists' @ [91:22] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'NO_PATH' @ [91:39] ==> private final val NO_PATH: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'jar' @ [93:17] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForIdeaPlugin>[LocalVariableDescriptor]

'name' @ [93:21] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'jar' @ [94:27] ==> val jar: File defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForIdeaPlugin>[LocalVariableDescriptor]

'parentFile' @ [94:31] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'lib' @ [95:34] ==> val lib: (File..File?) defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForIdeaPlugin>[LocalVariableDescriptor]

'parentFile' @ [95:38] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'File' @ [97:24] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'pluginHome' @ [97:29] ==> val pluginHome: (File..File?) defined in org.jetbrains.kotlin.utils.PathUtil.<get-compilerPathForIdeaPlugin>[LocalVariableDescriptor]

'HOME_FOLDER_NAME' @ [97:41] ==> public const final val HOME_FOLDER_NAME: String defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'NO_PATH' @ [100:20] ==> private final val NO_PATH: File defined in org.jetbrains.kotlin.utils.PathUtil[PropertyDescriptorImpl]

'getResourcePathForClass' @ [104:17] ==> @JvmStatic public final fun getResourcePathForClass(aClass: Class<*>): File defined in org.jetbrains.kotlin.utils.PathUtil[SimpleFunctionDescriptorImpl]

'PathUtil' @ [104:41] ==> public object PathUtil defined in org.jetbrains.kotlin.utils in file PathUtil.kt[FakeCallableDescriptorForObject]

'java' @ [104:57] ==> public val <T> KClass<PathUtil>.java: Class<PathUtil> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PathUtil

'JvmStatic' @ [106:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'+' @ [108:20] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'aClass' @ [108:26] ==> value-parameter aClass: Class<*> defined in org.jetbrains.kotlin.utils.PathUtil.getResourcePathForClass[ValueParameterDescriptorImpl]

'name' @ [108:33] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'replace' @ [108:38] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'?:' @ [109:28] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getResourceRoot' @ [109:40] ==> @Nullable public open fun getResourceRoot(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>), p1: (String..String?)): String? defined in com.intellij.openapi.application.PathManager[JavaMethodDescriptor]

'aClass' @ [109:56] ==> value-parameter aClass: Class<*> defined in org.jetbrains.kotlin.utils.PathUtil.getResourcePathForClass[ValueParameterDescriptorImpl]

'path' @ [109:64] ==> val path: String defined in org.jetbrains.kotlin.utils.PathUtil.getResourcePathForClass[LocalVariableDescriptor]

'IllegalStateException' @ [109:79] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'path' @ [109:123] ==> val path: String defined in org.jetbrains.kotlin.utils.PathUtil.getResourcePathForClass[LocalVariableDescriptor]

'File' @ [110:16] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'resourceRoot' @ [110:21] ==> val resourceRoot: String defined in org.jetbrains.kotlin.utils.PathUtil.getResourcePathForClass[LocalVariableDescriptor]

'absoluteFile' @ [110:35] ==> public final val File.absoluteFile: (File..File?)[MyPropertyDescriptor]

'JvmStatic' @ [113:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getJdkClassesRootsFromJre' @ [115:13] ==> @JvmStatic public final fun getJdkClassesRootsFromJre(javaHome: String): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[SimpleFunctionDescriptorImpl]

'getProperty' @ [115:46] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'JvmStatic' @ [117:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getJdkClassesRoots' @ [119:25] ==> @NotNull public open fun getJdkClassesRoots(@NotNull p0: File, p1: Boolean): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.jps.model.java.impl.JavaSdkUtil[JavaMethodDescriptor]

'File' @ [119:44] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaHome' @ [119:49] ==> value-parameter javaHome: String defined in org.jetbrains.kotlin.utils.PathUtil.getJdkClassesRootsFromJre[ValueParameterDescriptorImpl]

'JvmStatic' @ [121:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getJdkClassesRoots' @ [123:25] ==> @NotNull public open fun getJdkClassesRoots(@NotNull p0: File, p1: Boolean): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.jps.model.java.impl.JavaSdkUtil[JavaMethodDescriptor]

'jdkHome' @ [123:44] ==> value-parameter jdkHome: File defined in org.jetbrains.kotlin.utils.PathUtil.getJdkClassesRoots[ValueParameterDescriptorImpl]

