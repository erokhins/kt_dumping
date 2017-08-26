'DeprecatedVirtualFileSystem' @ [33:27] ==> public constructor DeprecatedVirtualFileSystem() defined in com.intellij.openapi.vfs.DeprecatedVirtualFileSystem[JavaClassConstructorDescriptor]

'ConcurrentFactoryMap<String, CoreJrtHandler?>' @ [34:37] ==> public constructor ConcurrentFactoryMap<T : (Any..Any?), V : (Any..Any?)>() defined in com.intellij.util.containers.ConcurrentFactoryMap[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> String
    <V : (Any..Any?)> -> CoreJrtHandler?

'File' @ [36:27] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jdkHomePath' @ [36:32] ==> value-parameter jdkHomePath: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[ValueParameterDescriptorImpl]

'create' @ [37:31] ==> public open fun create(p0: (String..String?)): (URI..URI?) defined in java.net.URI[JavaMethodDescriptor]

'+' @ [37:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'JRT_PROTOCOL' @ [37:58] ==> public const final val JRT_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'loadJrtFsJar' @ [38:28] ==> private final fun loadJrtFsJar(jdkHome: File): File? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion[SimpleFunctionDescriptorImpl]

'jdkHome' @ [38:41] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'if (SystemInfo.isJavaVersionAtLeast("9")) {
                        FileSystems.newFileSystem(rootUri, mapOf("java.home" to jdkHome.absolutePath))
                    }
                    else {
                        val classLoader = URLClassLoader(arrayOf(jrtFsJar.toURI().toURL()), null)
                        FileSystems.newFileSystem(rootUri, emptyMap<String, Nothing>(), classLoader)
                    }' @ [40:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (FileSystem..FileSystem?), elseBranch: (FileSystem..FileSystem?)): (FileSystem..FileSystem?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (java.nio.file.FileSystem..java.nio.file.FileSystem?)

'isJavaVersionAtLeast' @ [40:36] ==> public open fun isJavaVersionAtLeast(p0: (String..String?)): Boolean defined in com.intellij.openapi.util.SystemInfo[JavaMethodDescriptor]

'newFileSystem' @ [41:37] ==> public open fun newFileSystem(p0: (URI..URI?), p1: (MutableMap<(String..String?), *>..Map<(String..String?), *>?)): (FileSystem..FileSystem?) defined in java.nio.file.FileSystems[JavaMethodDescriptor]

'rootUri' @ [41:51] ==> val rootUri: (URI..URI?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'mapOf' @ [41:60] ==> public fun <K, V> mapOf(pair: Pair<(String..String?), (String..String?)>): Map<(String..String?), (String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> (kotlin.String..kotlin.String?)

'to' @ [41:66] ==> public infix fun <A, B> String.to(that: (String..String?)): Pair<String, (String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> (kotlin.String..kotlin.String?)

'jdkHome' @ [41:81] ==> val jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'absolutePath' @ [41:89] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'URLClassLoader' @ [44:43] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [44:58] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'jrtFsJar' @ [44:66] ==> val jrtFsJar: File defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'toURI' @ [44:75] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [44:83] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'newFileSystem' @ [45:37] ==> public open fun newFileSystem(p0: (URI..URI?), p1: (MutableMap<(String..String?), *>..Map<(String..String?), *>?), p2: (ClassLoader..ClassLoader?)): (FileSystem..FileSystem?) defined in java.nio.file.FileSystems[JavaMethodDescriptor]

'rootUri' @ [45:51] ==> val rootUri: (URI..URI?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'emptyMap' @ [45:60] ==> public fun <K, V> emptyMap(): Map<String, Nothing> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Nothing

'classLoader' @ [45:89] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'CoreJrtHandler' @ [47:20] ==> public constructor CoreJrtHandler(virtualFileSystem: CoreJrtFileSystem, jdkHomePath: String, root: Path) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[ClassConstructorDescriptorImpl]

'this@CoreJrtFileSystem' @ [47:35] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[LazyClassReceiverParameterDescriptor]

'jdkHomePath' @ [47:59] ==> value-parameter jdkHomePath: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[ValueParameterDescriptorImpl]

'fileSystem' @ [47:72] ==> val fileSystem: (FileSystem..FileSystem?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.handlers.<no name provided>.create[LocalVariableDescriptor]

'getPath' @ [47:83] ==> public abstract fun getPath(p0: (String..String?), vararg p1: (String..String?)): (Path..Path?) defined in java.nio.file.FileSystem[JavaMethodDescriptor]

'root' @ [57:24] ==> private final val root: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[PropertyDescriptorImpl]

'resolve' @ [57:29] ==> public abstract fun resolve(p0: (String..String?)): (Path..Path?) defined in java.nio.file.Path[JavaMethodDescriptor]

'fileName' @ [57:37] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler.findFile[ValueParameterDescriptorImpl]

'if (Files.exists(path)) CoreJrtVirtualFile(this, path) else null' @ [58:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'exists' @ [58:30] ==> public open fun exists(p0: (Path..Path?), vararg p1: (LinkOption..LinkOption?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [58:37] ==> val path: (Path..Path?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler.findFile[LocalVariableDescriptor]

'CoreJrtVirtualFile' @ [58:44] ==> public constructor CoreJrtVirtualFile(handler: CoreJrtFileSystem.CoreJrtHandler, path: Path) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[ClassConstructorDescriptorImpl]

'this' @ [58:63] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[LazyClassReceiverParameterDescriptor]

'path' @ [58:69] ==> val path: (Path..Path?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler.findFile[LocalVariableDescriptor]

'JRT_PROTOCOL' @ [62:62] ==> public const final val JRT_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'component1' @ [65:14] ==> public final operator fun component1(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [65:27] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'splitPath' @ [65:42] ==> private final fun splitPath(path: String): Pair<String, String> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[SimpleFunctionDescriptorImpl]

'path' @ [65:52] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.findFileByPath[ValueParameterDescriptorImpl]

'handlers' @ [66:16] ==> private final val handlers: <no name provided> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[PropertyDescriptorImpl]

'jdkHomePath' @ [66:25] ==> val jdkHomePath: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.findFileByPath[LocalVariableDescriptor]

'findFile' @ [66:39] ==> public final fun findFile(fileName: String): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[SimpleFunctionDescriptorImpl]

'pathInImage' @ [66:48] ==> val pathInImage: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.findFileByPath[LocalVariableDescriptor]

'path' @ [70:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[ValueParameterDescriptorImpl]

'indexOf' @ [70:30] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JAR_SEPARATOR' @ [70:46] ==> public const final val JAR_SEPARATOR: String defined in com.intellij.util.io.URLUtil[JavaPropertyDescriptor]

'separator' @ [71:13] ==> val separator: Int defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[LocalVariableDescriptor]

'IllegalArgumentException' @ [72:19] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'path' @ [72:98] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[ValueParameterDescriptorImpl]

'path' @ [74:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[ValueParameterDescriptorImpl]

'substring' @ [74:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'separator' @ [74:43] ==> val separator: Int defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[LocalVariableDescriptor]

'path' @ [75:25] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[ValueParameterDescriptorImpl]

'substring' @ [75:30] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'separator' @ [75:40] ==> val separator: Int defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[LocalVariableDescriptor]

'Pair' @ [76:16] ==> public constructor Pair<out A, out B>(first: String, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> String

'localPath' @ [76:21] ==> val localPath: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[LocalVariableDescriptor]

'pathInJar' @ [76:32] ==> val pathInJar: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.splitPath[LocalVariableDescriptor]

'findFileByPath' @ [81:73] ==> public open fun findFileByPath(path: String): VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem[SimpleFunctionDescriptorImpl]

'path' @ [81:88] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.refreshAndFindFileByPath[ValueParameterDescriptorImpl]

'File' @ [85:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'jdkHome' @ [85:22] ==> value-parameter jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion.loadJrtFsJar[ValueParameterDescriptorImpl]

'takeIf' @ [85:49] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'exists' @ [85:62] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'loadJrtFsJar' @ [88:17] ==> private final fun loadJrtFsJar(jdkHome: File): File? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion[SimpleFunctionDescriptorImpl]

'jdkHome' @ [88:30] ==> value-parameter jdkHome: File defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.Companion.isModularJdk[ValueParameterDescriptorImpl]

