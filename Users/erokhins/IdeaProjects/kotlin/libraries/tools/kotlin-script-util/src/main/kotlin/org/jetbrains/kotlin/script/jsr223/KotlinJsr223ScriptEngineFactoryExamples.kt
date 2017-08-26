'Suppress' @ [17:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'KotlinJsr223JvmScriptEngineFactoryBase' @ [37:49] ==> public constructor KotlinJsr223JvmScriptEngineFactoryBase() defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineFactoryBase[DeserializedClassConstructorDescriptor]

'KotlinJsr223JvmLocalScriptEngine' @ [40:13] ==> public constructor KotlinJsr223JvmLocalScriptEngine(disposable: Disposable, factory: ScriptEngineFactory, templateClasspath: List<File>, templateClassName: String, getScriptArgs: (ScriptContext, Array<out KClass<out Any>>?) -> ScriptArgsWithTypes?, scriptArgsTypes: Array<out KClass<out Any>>?) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngine[ClassConstructorDescriptorImpl]

'newDisposable' @ [41:30] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'this' @ [42:21] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngineFactory[LazyClassReceiverParameterDescriptor]

'scriptCompilationClasspathFromContext' @ [43:21] ==> private fun scriptCompilationClasspathFromContext(keyName: String, classLoader: ClassLoader = ...): List<File> defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'KotlinStandardJsr223ScriptTemplate' @ [44:21] ==> public constructor KotlinStandardJsr223ScriptTemplate(jsr223Bindings: Bindings) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[ClassConstructorDescriptorImpl]

'qualifiedName' @ [44:63] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'ScriptArgsWithTypes' @ [45:37] ==> public constructor ScriptArgsWithTypes(scriptArgs: Array<out Any?>, scriptArgsTypes: Array<out KClass<out Any>>) defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[DeserializedClassConstructorDescriptor]

'arrayOf' @ [45:57] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (Bindings..Bindings?)): Array<(Bindings..Bindings?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javax.script.Bindings..javax.script.Bindings?)

'ctx' @ [45:65] ==> value-parameter ctx: ScriptContext defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngineFactory.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'getBindings' @ [45:69] ==> public abstract fun getBindings(p0: Int): (Bindings..Bindings?) defined in javax.script.ScriptContext[JavaMethodDescriptor]

'ENGINE_SCOPE' @ [45:95] ==> public const final val ENGINE_SCOPE: Int defined in javax.script.ScriptContext[JavaPropertyDescriptor]

'types' @ [45:111] ==> value-parameter types: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmLocalScriptEngineFactory.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [45:120] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<KClass<out Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<out Any>

'arrayOf' @ [46:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KClass<Bindings>): Array<KClass<Bindings>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<Bindings>

'KotlinJsr223JvmScriptEngineFactoryBase' @ [50:59] ==> public constructor KotlinJsr223JvmScriptEngineFactoryBase() defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmScriptEngineFactoryBase[DeserializedClassConstructorDescriptor]

'KotlinJsr223JvmDaemonCompileScriptEngine' @ [53:13] ==> public constructor KotlinJsr223JvmDaemonCompileScriptEngine(disposable: Disposable, factory: ScriptEngineFactory, compilerJar: File, templateClasspath: List<File>, templateClassName: String, getScriptArgs: (ScriptContext, Array<out KClass<out Any>>?) -> ScriptArgsWithTypes?, scriptArgsTypes: Array<out KClass<out Any>>?, compilerOut: OutputStream = ...) defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonCompileScriptEngine[ClassConstructorDescriptorImpl]

'newDisposable' @ [54:30] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'this' @ [55:21] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonLocalEvalScriptEngineFactory[LazyClassReceiverParameterDescriptor]

'kotlinCompilerJar' @ [56:21] ==> private val kotlinCompilerJar: File defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'scriptCompilationClasspathFromContext' @ [57:21] ==> private fun scriptCompilationClasspathFromContext(keyName: String, classLoader: ClassLoader = ...): List<File> defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'KotlinStandardJsr223ScriptTemplate' @ [58:21] ==> public constructor KotlinStandardJsr223ScriptTemplate(jsr223Bindings: Bindings) defined in org.jetbrains.kotlin.script.jsr223.KotlinStandardJsr223ScriptTemplate[ClassConstructorDescriptorImpl]

'qualifiedName' @ [58:63] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'ScriptArgsWithTypes' @ [59:37] ==> public constructor ScriptArgsWithTypes(scriptArgs: Array<out Any?>, scriptArgsTypes: Array<out KClass<out Any>>) defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[DeserializedClassConstructorDescriptor]

'arrayOf' @ [59:57] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (Bindings..Bindings?)): Array<(Bindings..Bindings?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (javax.script.Bindings..javax.script.Bindings?)

'ctx' @ [59:65] ==> value-parameter ctx: ScriptContext defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonLocalEvalScriptEngineFactory.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'getBindings' @ [59:69] ==> public abstract fun getBindings(p0: Int): (Bindings..Bindings?) defined in javax.script.ScriptContext[JavaMethodDescriptor]

'ENGINE_SCOPE' @ [59:95] ==> public const final val ENGINE_SCOPE: Int defined in javax.script.ScriptContext[JavaPropertyDescriptor]

'types' @ [59:111] ==> value-parameter types: Array<out KClass<out Any>>? defined in org.jetbrains.kotlin.script.jsr223.KotlinJsr223JvmDaemonLocalEvalScriptEngineFactory.getScriptEngine.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [59:120] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<KClass<out Any>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<out Any>

'arrayOf' @ [60:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: KClass<Bindings>): Array<KClass<Bindings>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KClass<Bindings>

'existsAndCheckOrNull' @ [68:42] ==> private inline fun File.existsAndCheckOrNull(check: File.() -> Boolean): File? defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'if (exists() && check()) this else null' @ [69:84] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File?, elseBranch: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File?

'exists' @ [69:88] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'invoke' @ [69:100] ==> public abstract operator fun File.invoke(): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'this' @ [69:109] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.existsAndCheckOrNull[ReceiverParameterDescriptorImpl]

'if (any(predicate)) this else null' @ [71:68] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Iterable<T>?, elseBranch: Iterable<T>?): Iterable<T>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Iterable<T>?

'any' @ [71:72] ==> public inline fun <T> Iterable<T>.any(predicate: (T) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'predicate' @ [71:76] ==> value-parameter predicate: (T) -> Boolean defined in org.jetbrains.kotlin.script.jsr223.anyOrNull[ValueParameterDescriptorImpl]

'this' @ [71:88] ==> <this> defined in org.jetbrains.kotlin.script.jsr223.anyOrNull[ReceiverParameterDescriptorImpl]

'name' @ [74:9] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'baseName' @ [74:17] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.script.jsr223.matchMaybeVersionedFile[ValueParameterDescriptorImpl]

'name' @ [75:9] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'baseName' @ [75:17] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.script.jsr223.matchMaybeVersionedFile[ValueParameterDescriptorImpl]

'removeSuffix' @ [75:26] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [76:9] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [76:14] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'baseName' @ [76:25] ==> value-parameter baseName: String defined in org.jetbrains.kotlin.script.jsr223.matchMaybeVersionedFile[ValueParameterDescriptorImpl]

'removeSuffix' @ [76:34] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classpathFromClassloader' @ [79:10] ==> public fun classpathFromClassloader(classLoader: ClassLoader): List<File>? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]

'classLoader' @ [79:35] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.script.jsr223.contextClasspath[ValueParameterDescriptorImpl]

'anyOrNull' @ [79:49] ==> private fun <T> Iterable<File>.anyOrNull(predicate: (File) -> Boolean): Iterable<File>? defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File

'it' @ [79:61] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.contextClasspath.<anonymous>[ValueParameterDescriptorImpl]

'matchMaybeVersionedFile' @ [79:64] ==> private fun File.matchMaybeVersionedFile(baseName: String): Boolean defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'keyName' @ [79:88] ==> value-parameter keyName: String defined in org.jetbrains.kotlin.script.jsr223.contextClasspath[ValueParameterDescriptorImpl]

'manifestClassPath' @ [80:13] ==> public fun manifestClassPath(classLoader: ClassLoader): List<File>? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]

'classLoader' @ [80:31] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.script.jsr223.contextClasspath[ValueParameterDescriptorImpl]

'anyOrNull' @ [80:45] ==> private fun <T> Iterable<File>.anyOrNull(predicate: (File) -> Boolean): Iterable<File>? defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> File

'it' @ [80:57] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.contextClasspath.<anonymous>[ValueParameterDescriptorImpl]

'matchMaybeVersionedFile' @ [80:60] ==> private fun File.matchMaybeVersionedFile(baseName: String): Boolean defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'keyName' @ [80:84] ==> value-parameter keyName: String defined in org.jetbrains.kotlin.script.jsr223.contextClasspath[ValueParameterDescriptorImpl]

'toList' @ [81:12] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'setOf' @ [83:34] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'currentThread' @ [85:102] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [85:118] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'?:' @ [86:10] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<File>?, right: List<File>?): List<File>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<File>?

'getProperty' @ [86:17] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'split' @ [86:57] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pathSeparator' @ [86:68] ==> public const final val pathSeparator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'map' @ [86:84] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'contextClasspath' @ [87:14] ==> private fun contextClasspath(keyName: String, classLoader: ClassLoader): List<File>? defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'keyName' @ [87:31] ==> value-parameter keyName: String defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext[ValueParameterDescriptorImpl]

'classLoader' @ [87:40] ==> value-parameter classLoader: ClassLoader = ... defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext[ValueParameterDescriptorImpl]

'let' @ [88:11] ==> @InlineOnly public inline fun <T, R> List<File>?.let(block: (List<File>?) -> List<File?>): List<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File>?
    <R> -> List<File?>

'it' @ [89:13] ==> value-parameter it: List<File>? defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'plus' @ [89:17] ==> public operator fun <T> Collection<File?>.plus(elements: Iterable<File?>): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'kotlinScriptStandardJars' @ [89:22] ==> private val kotlinScriptStandardJars: List<File?> defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'kotlinScriptStandardJars' @ [89:51] ==> private val kotlinScriptStandardJars: List<File?> defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'mapNotNull' @ [91:10] ==> public inline fun <T, R : Any> Iterable<File?>.mapNotNull(transform: (File?) -> File?): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?
    <R : Any> -> File

'it' @ [91:23] ==> value-parameter it: File? defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'canonicalFile' @ [91:27] ==> public final val File.canonicalFile: (File..File?)[MyPropertyDescriptor]

'distinct' @ [92:10] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'filter' @ [93:10] ==> public inline fun <T> Iterable<File>.filter(predicate: (File) -> Boolean): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [93:20] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [93:23] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'it' @ [93:39] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'isFile' @ [93:42] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'it' @ [93:52] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [93:55] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'toLowerCase' @ [93:65] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'validJarExtensions' @ [93:82] ==> private val validJarExtensions: Set<String> defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'it' @ [93:106] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.scriptCompilationClasspathFromContext.<anonymous>[ValueParameterDescriptorImpl]

'exists' @ [93:109] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'lazy' @ [95:40] ==> public fun <T> lazy(initializer: () -> File): Lazy<File> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'?:' @ [97:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File?

'getProperty' @ [97:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [97:48] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'existsOrNull' @ [97:61] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'classpathFromClass' @ [99:9] ==> public fun classpathFromClass(classLoader: ClassLoader, klass: KClass<out Any>): List<File>? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]

'currentThread' @ [99:35] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [99:51] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'K2JVMCompiler' @ [99:71] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[FakeCallableDescriptorForObject]

'contextClasspath' @ [100:12] ==> private fun contextClasspath(keyName: String, classLoader: ClassLoader): List<File>? defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'KOTLIN_COMPILER_JAR' @ [100:29] ==> private const val KOTLIN_COMPILER_JAR: String defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'currentThread' @ [100:57] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [100:73] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'classpathFromClasspathProperty' @ [101:12] ==> public fun classpathFromClasspathProperty(): List<File>? defined in org.jetbrains.kotlin.script.util[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [102:11] ==> public inline fun <T> Iterable<File>.firstOrNull(predicate: (File) -> Boolean): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [102:25] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.kotlinCompilerJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'matchMaybeVersionedFile' @ [102:28] ==> private fun File.matchMaybeVersionedFile(baseName: String): Boolean defined in org.jetbrains.kotlin.script.jsr223[SimpleFunctionDescriptorImpl]

'KOTLIN_COMPILER_JAR' @ [102:52] ==> private const val KOTLIN_COMPILER_JAR: String defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'FileNotFoundException' @ [103:14] ==> public constructor FileNotFoundException(p0: (String..String?)) defined in java.io.FileNotFoundException[JavaClassConstructorDescriptor]

'lazy' @ [106:39] ==> public fun <T> lazy(initializer: () -> File?): Lazy<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'?:' @ [107:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File?

'getProperty' @ [107:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [107:52] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'existsOrNull' @ [107:65] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'kotlinCompilerJar' @ [108:8] ==> private val kotlinCompilerJar: File defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'let' @ [108:26] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'File' @ [108:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [108:37] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.kotlinStdlibJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [108:40] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'KOTLIN_JAVA_STDLIB_JAR' @ [108:52] ==> private const val KOTLIN_JAVA_STDLIB_JAR: String defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'existsOrNull' @ [108:78] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'PathUtil' @ [109:8] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getResourcePathForClass' @ [109:17] ==> @JvmStatic public final fun getResourcePathForClass(aClass: Class<*>): File defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'JvmStatic' @ [109:41] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'java' @ [109:58] ==> public val <T> KClass<JvmStatic>.java: Class<JvmStatic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JvmStatic

'existsOrNull' @ [109:64] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'lazy' @ [112:46] ==> public fun <T> lazy(initializer: () -> File?): Lazy<File?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'?:' @ [113:5] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: File?, right: File?): File?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> File?

'getProperty' @ [113:12] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'let' @ [113:54] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'existsOrNull' @ [113:67] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'kotlinCompilerJar' @ [114:8] ==> private val kotlinCompilerJar: File defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'let' @ [114:26] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> File

'File' @ [114:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [114:37] ==> value-parameter it: File defined in org.jetbrains.kotlin.script.jsr223.kotlinScriptRuntimeJar.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parentFile' @ [114:40] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'KOTLIN_JAVA_SCRIPT_RUNTIME_JAR' @ [114:52] ==> private const val KOTLIN_JAVA_SCRIPT_RUNTIME_JAR: String defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'existsOrNull' @ [114:86] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'PathUtil' @ [115:8] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getResourcePathForClass' @ [115:17] ==> @JvmStatic public final fun getResourcePathForClass(aClass: Class<*>): File defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'ScriptTemplateWithArgs' @ [115:41] ==> public constructor ScriptTemplateWithArgs(args: Array<String>) defined in kotlin.script.templates.standard.ScriptTemplateWithArgs[DeserializedClassConstructorDescriptor]

'java' @ [115:71] ==> public val <T> KClass<ScriptTemplateWithArgs>.java: Class<ScriptTemplateWithArgs> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ScriptTemplateWithArgs

'existsOrNull' @ [115:77] ==> private fun File.existsOrNull(): File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[SimpleFunctionDescriptorImpl]

'lazy' @ [118:41] ==> public fun <T> lazy(initializer: () -> List<File?>): Lazy<List<File?>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<File?>

'listOf' @ [118:48] ==> public fun <T> listOf(vararg elements: File?): List<File?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File?

'kotlinStdlibJar' @ [118:55] ==> private val kotlinStdlibJar: File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

'kotlinScriptRuntimeJar' @ [118:72] ==> private val kotlinScriptRuntimeJar: File? defined in org.jetbrains.kotlin.script.jsr223 in file KotlinJsr223ScriptEngineFactoryExamples.kt[PropertyDescriptorImpl]

