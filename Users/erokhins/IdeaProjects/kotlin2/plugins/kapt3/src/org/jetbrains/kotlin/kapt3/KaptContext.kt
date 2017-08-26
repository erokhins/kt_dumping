'emptyMap' @ [44:45] ==> public fun <K, V> emptyMap(): Map<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'Context' @ [46:19] ==> public constructor Context() defined in com.sun.tools.javac.util.Context[JavaClassConstructorDescriptor]

'KaptJavaLog' @ [53:9] ==> public companion object defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog[FakeCallableDescriptorForObject]

'preRegister' @ [53:21] ==> internal final fun preRegister(context: Context, messageCollector: MessageCollector): Unit defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion[SimpleFunctionDescriptorImpl]

'context' @ [53:33] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'logger' @ [53:42] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'messageCollector' @ [53:49] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[PropertyDescriptorImpl]

'preRegister' @ [54:26] ==> public open fun preRegister(p0: (Context..Context?)): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'context' @ [54:38] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'KaptTreeMaker' @ [55:9] ==> public companion object defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker[FakeCallableDescriptorForObject]

'preRegister' @ [55:23] ==> internal final fun preRegister(context: Context, kaptContext: KaptContext<*>): Unit defined in org.jetbrains.kotlin.kapt3.javac.KaptTreeMaker.Companion[SimpleFunctionDescriptorImpl]

'context' @ [55:35] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'this' @ [55:44] ==> <this> defined in org.jetbrains.kotlin.kapt3.KaptContext[LazyClassReceiverParameterDescriptor]

'KaptJavaCompiler' @ [56:9] ==> public companion object defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[FakeCallableDescriptorForObject]

'preRegister' @ [56:26] ==> internal final fun preRegister(context: Context): Unit defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler.Companion[SimpleFunctionDescriptorImpl]

'context' @ [56:38] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'fileManager' @ [58:9] ==> public final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'context' @ [58:23] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'get' @ [58:31] ==> public open operator fun <T : (Any..Any?)> get(p0: (Class<(JavaFileManager..JavaFileManager?)>..Class<(JavaFileManager..JavaFileManager?)>?)): (JavaFileManager..JavaFileManager?) defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (javax.tools.JavaFileManager..javax.tools.JavaFileManager?)

'java' @ [58:58] ==> public val <T> KClass<JavaFileManager>.java: Class<JavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaFileManager

'compiler' @ [59:9] ==> public final val compiler: KaptJavaCompiler defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'instance' @ [59:33] ==> public open fun instance(p0: (Context..Context?)): (JavaCompiler..JavaCompiler?) defined in com.sun.tools.javac.main.JavaCompiler[JavaMethodDescriptor]

'context' @ [59:42] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'instance' @ [61:21] ==> public open fun instance(p0: (Context..Context?)): (ClassReader..ClassReader?) defined in com.sun.tools.javac.jvm.ClassReader[JavaMethodDescriptor]

'context' @ [61:30] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'saveParameterNames' @ [61:39] ==> public final var saveParameterNames: Boolean defined in com.sun.tools.javac.jvm.ClassReader[JavaPropertyDescriptor]

'javaLog' @ [63:9] ==> public final val javaLog: KaptJavaLog defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'compiler' @ [63:19] ==> public final val compiler: KaptJavaCompiler defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'log' @ [63:28] ==> public final var log: (Log..Log?) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[JavaPropertyDescriptor]

'options' @ [65:9] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'instance' @ [65:27] ==> public open fun instance(p0: (Context..Context?)): (Options..Options?) defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'context' @ [65:36] ==> public final val context: Context defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'component1' @ [66:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [66:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'processorOptions' @ [66:30] ==> value-parameter processorOptions: Map<String, String> defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[ValueParameterDescriptorImpl]

'if (value.isEmpty()) "-A$key" else "-A$key=$value"' @ [67:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'value' @ [67:30] ==> val value: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'isEmpty' @ [67:36] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'key' @ [67:51] ==> val key: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'key' @ [67:65] ==> val key: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'value' @ [67:70] ==> val value: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'options' @ [68:13] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'put' @ [68:21] ==> public open fun put(p0: (String..String?), p1: (String..String?)): Unit defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'option' @ [68:25] ==> val option: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'option' @ [68:33] ==> val option: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'component1' @ [71:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [71:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'javacOptions' @ [71:30] ==> value-parameter javacOptions: Map<String, String> = ... defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[ValueParameterDescriptorImpl]

'if (value.isNotEmpty()) {
                options.put(key, value)
            } else {
                options.put(key, key)
            }' @ [72:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'value' @ [72:17] ==> val value: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'isNotEmpty' @ [72:23] ==> @InlineOnly public inline fun CharSequence.isNotEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'options' @ [73:17] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'put' @ [73:25] ==> public open fun put(p0: (String..String?), p1: (String..String?)): Unit defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'key' @ [73:29] ==> val key: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'value' @ [73:34] ==> val value: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'options' @ [75:17] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'put' @ [75:25] ==> public open fun put(p0: (String..String?), p1: (String..String?)): Unit defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'key' @ [75:29] ==> val key: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'key' @ [75:34] ==> val key: String defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>[LocalVariableDescriptor]

'logger' @ [79:13] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'isVerbose' @ [79:20] ==> public final val isVerbose: Boolean defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[PropertyDescriptorImpl]

'logger' @ [80:13] ==> public final val logger: KaptLogger defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'info' @ [80:20] ==> public final fun info(message: String): Unit defined in org.jetbrains.kotlin.kapt3.util.KaptLogger[SimpleFunctionDescriptorImpl]

'+' @ [80:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'options' @ [80:45] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'keySet' @ [80:53] ==> public open fun keySet(): (MutableSet<(String..String?)>..Set<(String..String?)>?) defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'keysToMap' @ [80:62] ==> public fun <K, V> Iterable<(String..String?)>.keysToMap(value: ((String..String?)) -> String): Map<(String..String?), String> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (kotlin.String..kotlin.String?)
    <V> -> String

'options' @ [80:81] ==> public final val options: Options defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'key' @ [80:89] ==> value-parameter key: (String..String?) defined in org.jetbrains.kotlin.kapt3.KaptContext.<init>.<anonymous>[ValueParameterDescriptorImpl]

'compiler' @ [85:9] ==> public final val compiler: KaptJavaCompiler defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'close' @ [85:18] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaCompiler[JavaMethodDescriptor]

'fileManager' @ [86:9] ==> public final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'close' @ [86:21] ==> public open fun close(): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'generationState' @ [87:9] ==> public final val generationState: GState defined in org.jetbrains.kotlin.kapt3.KaptContext[PropertyDescriptorImpl]

'destroy' @ [87:26] ==> public final fun destroy(): Unit defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedSimpleFunctionDescriptor]

