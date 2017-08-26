'Suppress' @ [31:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KotlinJsr223JvmScriptEngineFactoryBase' @ [32:54] ==> public constructor KotlinJsr223JvmScriptEngineFactoryBase() defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineFactoryBase[DeserializedClassConstructorDescriptor]

'KotlinJsr223JvmScriptEngine4Idea' @ [35:13] ==> public constructor KotlinJsr223JvmScriptEngine4Idea(factory: ScriptEngineFactory, templateClasspath: List<File>, templateClassName: String, getScriptArgs: (ScriptContext, Array<out KClass<out Any>>?) -> ScriptArgsWithTypes?, scriptArgsTypes: Array<out KClass<out Any>>?) defined in org.jetbrains.kotlin.jsr223.KotlinJsr223JvmScriptEngine4Idea[ClassConstructorDescriptorImpl]

'this' @ [36:21] ==> <this> defined in org.jetbrains.kotlin.jsr223.KotlinJsr223StandardScriptEngineFactory4Idea[LazyClassReceiverParameterDescriptor]

'scriptCompilationClasspathFromContext' @ [37:21] ==> private fun scriptCompilationClasspathFromContext(classLoader: ClassLoader): List<File> defined in org.jetbrains.kotlin.jsr223[SimpleFunctionDescriptorImpl]

'currentThread' @ [37:66] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [37:82] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'ScriptArgsWithTypes' @ [39:40] ==> public constructor ScriptArgsWithTypes(scriptArgs: Array<out Any?>, scriptArgsTypes: Array<out KClass<out Any>>) defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[DeserializedClassConstructorDescriptor]

'arrayOf' @ [39:60] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (Bindings..Bindings?)): Array<(Bindings..Bindings?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javax.script.Bindings..javax.script.Bindings?)

'ctx' @ [39:68] ==> value-parameter ctx: ScriptContext defined in org.jetbrains.kotlin.jsr223.KotlinJsr223StandardScriptEngineFactory4Idea.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'getBindings' @ [39:72] ==> public abstract fun getBindings(p0: Int): (Bindings..Bindings?) defined in javax.script.ScriptContext[JavaMethodDescriptor]

'ENGINE_SCOPE' @ [39:98] ==> public const final val ENGINE_SCOPE: Int defined in javax.script.ScriptContext[JavaPropertyDescriptor]

'argTypes' @ [39:114] ==> value-parameter argTypes: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.jsr223.KotlinJsr223StandardScriptEngineFactory4Idea.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [39:126] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<KClass<out Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<out Any>

'arrayOf' @ [40:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KClass<Map<*, *>>): Array<KClass<Map<*, *>>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<Map<*, *>>

'File' @ [48:13] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'toURI' @ [48:18] ==> public open fun toURI(): (URI..URI?) defined in java.net.URL[JavaMethodDescriptor]

'schemeSpecificPart' @ [48:26] ==> public final val URI.schemeSpecificPart: (String..String?)[MyPropertyDescriptor]

'if (protocol != "file") null
            else File(file)' @ [51:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'protocol' @ [51:17] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'File' @ [52:18] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'file' @ [52:23] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

'generateSequence' @ [56:9] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassLoader?, nextFunction: (ClassLoader) -> ClassLoader?): Sequence<ClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassLoader

'classLoader' @ [56:26] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.jsr223.classpathFromClassloader[ValueParameterDescriptorImpl]

'it' @ [56:41] ==> value-parameter it: ClassLoader defined in org.jetbrains.kotlin.jsr223.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [56:44] ==> public final val ClassLoader.parent: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'toList' @ [56:53] ==> public fun <T> Sequence<ClassLoader>.toList(): List<ClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoader

'flatMap' @ [56:62] ==> public inline fun <T, R> Iterable<ClassLoader>.flatMap(transform: (ClassLoader) -> Iterable<File>): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassLoader
    <R> -> File

'?:' @ [56:72] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>): List<File>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>

'it' @ [56:73] ==> value-parameter it: ClassLoader defined in org.jetbrains.kotlin.jsr223.classpathFromClassloader.<anonymous>[ValueParameterDescriptorImpl]

'urLs' @ [56:97] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [56:103] ==> public inline fun <T, R : Any> Array<out (URL..URL?)>.mapNotNull(transform: ((URL..URL?)) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R : Any> -> File

'emptyList' @ [56:130] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'lazy' @ [58:40] ==> public fun <T> lazy(initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'?:' @ [60:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File

'getProperty' @ [60:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [60:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'takeIf' @ [60:61] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'PathUtil' @ [61:8] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForIdeaPlugin' @ [61:17] ==> @JvmStatic public final val kotlinPathsForIdeaPlugin: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'compilerPath' @ [61:42] ==> public final val KotlinPaths.compilerPath: File[MyPropertyDescriptor]

'FileNotFoundException' @ [62:14] ==> public constructor FileNotFoundException(p0: (String..String?)) defined in java.io.FileNotFoundException[JavaClassConstructorDescriptor]

'?:' @ [66:11] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>?): List<File>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>?

'getProperty' @ [66:18] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'split' @ [66:58] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [66:69] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'map' @ [66:85] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'classpathFromClassloader' @ [67:14] ==> public fun classpathFromClassloader(classLoader: ClassLoader): List<File>? defined in org.jetbrains.kotlin.jsr223[SimpleFunctionDescriptorImpl]

'classLoader' @ [67:39] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.jsr223.scriptCompilationClasspathFromContext[ValueParameterDescriptorImpl]

'let' @ [68:11] ==> @InlineOnly public inline fun <T, R> List<File>?.let(block: (List<File>?) -> List<File?>): List<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>?
    <R> -> List<File?>

'it' @ [69:13] ==> value-parameter it: List<File>? defined in org.jetbrains.kotlin.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'plus' @ [69:17] ==> public operator fun <T> Collection<File?>.plus(elements: Iterable<File?>): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'kotlinScriptStandardJars' @ [69:22] ==> private val kotlinScriptStandardJars: List<File?> defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

'kotlinScriptStandardJars' @ [69:51] ==> private val kotlinScriptStandardJars: List<File?> defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

'map' @ [71:10] ==> public inline fun <T, R> Iterable<File?>.map(transform: (File?) -> File?): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?
    <R> -> File?

'it' @ [71:16] ==> value-parameter it: File? defined in org.jetbrains.kotlin.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'canonicalFile' @ [71:20] ==> public final val File.canonicalFile: (File..File?)[MyPropertyDescriptor]

'distinct' @ [72:10] ==> public fun <T> Iterable<File?>.distinct(): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'mapNotNull' @ [73:10] ==> public inline fun <T, R : Any> Iterable<File?>.mapNotNull(transform: (File?) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?
    <R : Any> -> File

'it' @ [73:23] ==> value-parameter it: File? defined in org.jetbrains.kotlin.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [73:27] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'lazy' @ [76:39] ==> public fun <T> lazy(initializer: () -> File?): Lazy<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'?:' @ [77:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File?

'getProperty' @ [77:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [77:52] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'takeIf' @ [77:65] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [78:8] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinCompilerJar' @ [78:13] ==> private val kotlinCompilerJar: File defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

'parentFile' @ [78:31] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'KOTLIN_JAVA_STDLIB_JAR' @ [78:43] ==> public const final val KOTLIN_JAVA_STDLIB_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[PropertyImportedFromObject]

'takeIf' @ [78:67] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'lazy' @ [81:46] ==> public fun <T> lazy(initializer: () -> File?): Lazy<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'?:' @ [82:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File?

'getProperty' @ [82:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [82:54] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'takeIf' @ [82:67] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'File' @ [83:8] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'kotlinCompilerJar' @ [83:13] ==> private val kotlinCompilerJar: File defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

'parentFile' @ [83:31] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'KOTLIN_JAVA_SCRIPT_RUNTIME_JAR' @ [83:43] ==> public const final val KOTLIN_JAVA_SCRIPT_RUNTIME_JAR: String defined in org.jetbrains.kotlin.utils.PathUtil[PropertyImportedFromObject]

'takeIf' @ [83:75] ==> @InlineOnly @SinceKotlin public inline fun <T> File.takeIf(predicate: (File) -> Boolean): File? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'lazy' @ [86:41] ==> public fun <T> lazy(initializer: () -> List<File?>): Lazy<List<File?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File?>

'listOf' @ [86:48] ==> public fun <T> listOf(vararg elements: File?): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'kotlinStdlibJar' @ [86:55] ==> private val kotlinStdlibJar: File? defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

'kotlinScriptRuntimeJar' @ [86:72] ==> private val kotlinScriptRuntimeJar: File? defined in org.jetbrains.kotlin.jsr223 in file KotlinJsr223StandardScriptEngineFactory4Idea.kt[PropertyDescriptorImpl]

