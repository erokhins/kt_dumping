'codeLine' @ [24:17] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.makeScriptBaseName[ValueParameterDescriptorImpl]

'no' @ [24:26] ==> public final val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'if (codeLine.generation > REPL_CODE_LINE_FIRST_GEN) "_gen_${codeLine.generation}" else ""' @ [24:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'codeLine' @ [24:35] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.makeScriptBaseName[ValueParameterDescriptorImpl]

'generation' @ [24:44] ==> public final val generation: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'REPL_CODE_LINE_FIRST_GEN' @ [24:57] ==> public const val REPL_CODE_LINE_FIRST_GEN: Int defined in org.jetbrains.kotlin.cli.common.repl in file ReplApi.kt[PropertyDescriptorImpl]

'codeLine' @ [24:91] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.makeScriptBaseName[ValueParameterDescriptorImpl]

'generation' @ [24:100] ==> public final val generation: Int defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[PropertyDescriptorImpl]

'arrayListOf' @ [27:20] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElement

'cause' @ [29:21] ==> value-parameter cause: Throwable defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[ValueParameterDescriptorImpl]

'stackTrace' @ [29:27] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'reversed' @ [29:38] ==> public fun <T> Array<out (StackTraceElement..StackTraceElement?)>.reversed(): List<(StackTraceElement..StackTraceElement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.StackTraceElement..java.lang.StackTraceElement?)

'==' @ [30:13] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'element' @ [30:16] ==> val element: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'className' @ [30:24] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'element' @ [30:37] ==> val element: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'methodName' @ [30:45] ==> public final val StackTraceElement.methodName: (String..String?)[MyPropertyDescriptor]

'startFromMethodName' @ [30:61] ==> value-parameter startFromMethodName: String defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[ValueParameterDescriptorImpl]

'skip' @ [31:13] ==> var skip: Boolean defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'!' @ [33:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'skip' @ [33:14] ==> var skip: Boolean defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'newTrace' @ [34:13] ==> val newTrace: ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'add' @ [34:22] ==> public open fun add(element: StackTraceElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [34:26] ==> val element: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'newTrace' @ [38:26] ==> val newTrace: ArrayList<StackTraceElement> /* = ArrayList<StackTraceElement> */ defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'reversed' @ [38:35] ==> public fun <T> Iterable<StackTraceElement>.reversed(): List<StackTraceElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElement

'dropLast' @ [38:46] ==> public fun <T> List<StackTraceElement>.dropLast(n: Int): List<StackTraceElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> StackTraceElement

'Suppress' @ [40:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'cause' @ [41:6] ==> value-parameter cause: Throwable defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[ValueParameterDescriptorImpl]

'setStackTrace' @ [41:36] ==> public open fun setStackTrace(p0: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)): Unit defined in java.lang.Throwable[JavaMethodDescriptor]

'resultingTrace' @ [41:50] ==> val resultingTrace: List<StackTraceElement> defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[LocalVariableDescriptor]

'toTypedArray' @ [41:65] ==> public inline fun <reified T> Collection<StackTraceElement>.toTypedArray(): Array<StackTraceElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> StackTraceElement

'getStackTraceAsString' @ [43:23] ==> @GwtIncompatible public open fun getStackTraceAsString(p0: (Throwable..Throwable?)): (String..String?) defined in com.google.common.base.Throwables[JavaMethodDescriptor]

'cause' @ [43:45] ==> value-parameter cause: Throwable defined in org.jetbrains.kotlin.cli.common.repl.renderReplStackTrace[ValueParameterDescriptorImpl]

'trimEnd' @ [43:52] ==> @InlineOnly public inline fun String.trimEnd(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'generateSequence' @ [47:19] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: ClassLoader?, nextFunction: (ClassLoader) -> ClassLoader?): Sequence<ClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassLoader

'this' @ [47:36] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.listAllUrlsAsFiles[ReceiverParameterDescriptorImpl]

'loader' @ [47:54] ==> value-parameter loader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.listAllUrlsAsFiles.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [47:61] ==> public final val ClassLoader.parent: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'filterIsInstance' @ [47:70] ==> public fun <R> Sequence<*>.filterIsInstance(klass: Class<URLClassLoader>): Sequence<URLClassLoader> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> URLClassLoader

'java' @ [47:109] ==> public val <T> KClass<URLClassLoader>.java: Class<URLClassLoader> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> URLClassLoader

'parents' @ [48:12] ==> val parents: Sequence<URLClassLoader> defined in org.jetbrains.kotlin.cli.common.repl.listAllUrlsAsFiles[LocalVariableDescriptor]

'fold' @ [48:20] ==> public inline fun <T, R> Sequence<URLClassLoader>.fold(initial: List<File>, operation: (acc: List<File>, URLClassLoader) -> List<File>): List<File> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URLClassLoader
    <R> -> List<File>

'emptyList' @ [48:25] ==> public fun <T> emptyList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'loader' @ [49:9] ==> value-parameter loader: URLClassLoader defined in org.jetbrains.kotlin.cli.common.repl.listAllUrlsAsFiles.<anonymous>[ValueParameterDescriptorImpl]

'listLocalUrlsAsFiles' @ [49:16] ==> internal fun URLClassLoader.listLocalUrlsAsFiles(): List<File> defined in org.jetbrains.kotlin.cli.common.repl in file replUtil.kt[SimpleFunctionDescriptorImpl]

'accum' @ [49:41] ==> value-parameter accum: List<File> defined in org.jetbrains.kotlin.cli.common.repl.listAllUrlsAsFiles.<anonymous>[ValueParameterDescriptorImpl]

'distinct' @ [50:7] ==> public fun <T> Iterable<File>.distinct(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'this' @ [54:12] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.listLocalUrlsAsFiles[ReceiverParameterDescriptorImpl]

'urLs' @ [54:17] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'mapNotNull' @ [54:22] ==> public inline fun <T, R : Any> Array<out (URL..URL?)>.mapNotNull(transform: ((URL..URL?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)
    <R : Any> -> String

'it' @ [54:35] ==> value-parameter it: (URL..URL?) defined in org.jetbrains.kotlin.cli.common.repl.listLocalUrlsAsFiles.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [54:38] ==> public open fun toString(): String defined in java.net.URL[JavaMethodDescriptor]

'removePrefix' @ [54:49] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'map' @ [54:73] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> File

'File' @ [54:79] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'this' @ [58:9] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.ensureNotEmpty[ReceiverParameterDescriptorImpl]

'isEmpty' @ [58:14] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'IllegalStateException' @ [58:31] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'error' @ [58:53] ==> value-parameter error: String defined in org.jetbrains.kotlin.cli.common.repl.ensureNotEmpty[ValueParameterDescriptorImpl]

'this' @ [59:12] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.ensureNotEmpty[ReceiverParameterDescriptorImpl]

