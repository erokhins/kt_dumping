'File' @ [12:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'toURI' @ [12:18] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'schemeSpecificPart' @ [12:26] ==> public final val URI.schemeSpecificPart: (String..String?)[MyPropertyDescriptor]

'if (protocol != "file") null
            else File(file)' @ [15:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'protocol' @ [15:17] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'File' @ [16:18] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [16:23] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

'generateSequence' @ [20:9] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassLoader?, nextFunction: (ClassLoader) -> ClassLoader?): Sequence<ClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassLoader

'classLoader' @ [20:26] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.script.util.classpathFromClassloader[ValueParameterDescriptorImpl]

'it' @ [20:41] ==> value-parameter it: ClassLoader defined in org.jetbrains.kotlin.script.util.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [20:44] ==> public final val ClassLoader.parent: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'toList' @ [20:53] ==> public fun <T> Sequence<ClassLoader>.toList(): List<ClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoader

'flatMap' @ [20:62] ==> public inline fun <T, R> Iterable<ClassLoader>.flatMap(transform: (ClassLoader) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoader
    <R> -> File

'?:' @ [20:72] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>

'it' @ [20:73] ==> value-parameter it: ClassLoader defined in org.jetbrains.kotlin.script.util.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'urLs' @ [20:97] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [20:103] ==> public inline fun <T, R : Any> Array<out (URL..URL?)>.mapNotNull(transform: ((URL..URL?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R : Any> -> File

'toFile' @ [20:119] ==> private fun URL.toFile(): File? defined in org.jetbrains.kotlin.script.util in file context.kt[SimpleFunctionDescriptorImpl]

'emptyList' @ [20:130] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'getProperty' @ [23:16] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'split' @ [24:19] ==> @InlineOnly public inline fun CharSequence.split(regex: Regex, limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'format' @ [24:32] ==> @InlineOnly public inline fun String.Companion.format(format: String, vararg args: Any?): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparatorChar' @ [24:52] ==> public const final val pathSeparatorChar: Char defined in java.io.File[JavaPropertyDescriptor]

'toRegex' @ [24:71] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'dropLastWhile' @ [25:19] ==> public inline fun <T> List<String>.dropLastWhile(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'String' @ [25:33] ==> public companion object defined in kotlin.String[FakeCallableDescriptorForObject]

'isEmpty' @ [25:41] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [26:19] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [26:25] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'klass' @ [29:18] ==> value-parameter klass: KClass<out Any> defined in org.jetbrains.kotlin.script.util.classpathFromClass[ValueParameterDescriptorImpl]

'qualifiedName' @ [29:24] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'replace' @ [29:39] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classLoader' @ [30:15] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.script.util.classpathFromClass[ValueParameterDescriptorImpl]

'getResource' @ [30:27] ==> public open fun getResource(p0: (String..String?)): (URL..URL?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'clp' @ [30:39] ==> val clp: String defined in org.jetbrains.kotlin.script.util.classpathFromClass[LocalVariableDescriptor]

'url' @ [31:12] ==> val url: (URL..URL?) defined in org.jetbrains.kotlin.script.util.classpathFromClass[LocalVariableDescriptor]

'toURI' @ [31:17] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'path' @ [31:26] ==> public final val URI.path: (String..String?)[MyPropertyDescriptor]

'removeSuffix' @ [31:32] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'clp' @ [31:45] ==> val clp: String defined in org.jetbrains.kotlin.script.util.classpathFromClass[LocalVariableDescriptor]

'let' @ [31:51] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> List<File>): List<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> List<File>

'listOf' @ [32:9] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [32:16] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [32:21] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.util.classpathFromClass.<anonymous>[ValueParameterDescriptorImpl]

'classLoader' @ [38:9] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.script.util.manifestClassPath[ValueParameterDescriptorImpl]

'getResources' @ [38:21] ==> public open fun getResources(p0: (String..String?)): (Enumeration<(URL..URL?)>..Enumeration<(URL..URL?)>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'asSequence' @ [39:18] ==> @InlineOnly public inline fun <T> Enumeration<(URL..URL?)>.asSequence(): Sequence<(URL..URL?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)

'mapNotNull' @ [40:18] ==> public fun <T, R : Any> Sequence<(URL..URL?)>.mapNotNull(transform: ((URL..URL?)) -> Manifest?): Sequence<Manifest> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R : Any> -> Manifest

'ifFailed' @ [40:31] ==> private inline fun <R> ifFailed(default: Manifest?, block: () -> Manifest?): Manifest? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> Manifest?

'it' @ [40:48] ==> value-parameter it: (URL..URL?) defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>[ValueParameterDescriptorImpl]

'openStream' @ [40:51] ==> public final fun openStream(): (InputStream..InputStream?) defined in java.net.URL[JavaMethodDescriptor]

'use' @ [40:64] ==> @InlineOnly public inline fun <T : Closeable?, R> (InputStream..InputStream?).use(block: ((InputStream..InputStream?)) -> Nothing?): Nothing? defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.io.InputStream..java.io.InputStream?)
    <R> -> Nothing?

'Manifest' @ [40:70] ==> public constructor Manifest() defined in java.util.jar.Manifest[JavaClassConstructorDescriptor]

'apply' @ [40:81] ==> @InlineOnly public inline fun <T> ???.apply(block: ???.() -> Unit): ??? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@b9b6fe3

'read' @ [40:89] ==> public open fun read(p0: (InputStream..InputStream?)): Unit defined in java.util.jar.Manifest[JavaMethodDescriptor]

'it' @ [40:94] ==> value-parameter it: (InputStream..InputStream?) defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flatMap' @ [41:18] ==> public fun <T, R> Sequence<Manifest>.flatMap(transform: (Manifest) -> Sequence<String>): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Manifest
    <R> -> String

'it' @ [41:28] ==> value-parameter it: Manifest defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>[ValueParameterDescriptorImpl]

'mainAttributes' @ [41:31] ==> public final val Manifest.mainAttributes: (Attributes..Attributes?)[MyPropertyDescriptor]

'getValue' @ [41:47] ==> public open fun getValue(p0: (String..String?)): (String..String?) defined in java.util.jar.Attributes[JavaMethodDescriptor]

'splitToSequence' @ [41:71] ==> public fun CharSequence.splitToSequence(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): Sequence<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'emptySequence' @ [41:95] ==> public fun <T> emptySequence(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'mapNotNull' @ [42:18] ==> public fun <T, R : Any> Sequence<String>.mapNotNull(transform: (String) -> File?): Sequence<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Any> -> File

'ifFailed' @ [42:31] ==> private inline fun <R> ifFailed(default: File?, block: () -> File?): File? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <R> -> File?

'File' @ [42:48] ==> public constructor File(p0: (URI..URI?)) defined in java.io.File[JavaClassConstructorDescriptor]

'create' @ [42:57] ==> public open fun create(p0: (String..String?)): (URI..URI?) defined in java.net.URI[JavaMethodDescriptor]

'it' @ [42:64] ==> value-parameter it: String defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [43:18] ==> public fun <T> Sequence<File>.toList(): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'let' @ [44:18] ==> @InlineOnly public inline fun <T, R> List<File>.let(block: (List<File>) -> List<File>?): List<File>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>
    <R> -> List<File>?

'if (it.isNotEmpty()) it else null' @ [44:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<File>?, elseBranch: List<File>?): List<File>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<File>?

'it' @ [44:28] ==> value-parameter it: List<File> defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [44:31] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [44:45] ==> value-parameter it: List<File> defined in org.jetbrains.kotlin.script.util.manifestClassPath.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [47:5] ==> public abstract operator fun invoke(): R defined in kotlin.Function0[FunctionInvokeDescriptor]

'default' @ [49:5] ==> value-parameter default: R defined in org.jetbrains.kotlin.script.util.ifFailed[ValueParameterDescriptorImpl]

