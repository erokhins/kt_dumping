'classLoader' @ [28:21] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.codegen.clearReflectionCache[ValueParameterDescriptorImpl]

'loadClass' @ [28:33] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'REFLECTION_FACTORY_IMPL' @ [28:50] ==> public final val REFLECTION_FACTORY_IMPL: (ClassId..ClassId?) defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'asSingleFqName' @ [28:74] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'asString' @ [28:91] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'klass' @ [29:22] ==> val klass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.codegen.clearReflectionCache[LocalVariableDescriptor]

'getDeclaredMethod' @ [29:28] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'method' @ [30:9] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.codegen.clearReflectionCache[LocalVariableDescriptor]

'invoke' @ [30:16] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'classLoader' @ [40:16] ==> value-parameter classLoader: ClassLoader defined in org.jetbrains.kotlin.codegen.getGeneratedClass[ValueParameterDescriptorImpl]

'loadClass' @ [40:28] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'className' @ [40:38] ==> value-parameter className: String defined in org.jetbrains.kotlin.codegen.getGeneratedClass[ValueParameterDescriptorImpl]

'error' @ [43:9] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'+' @ [43:15] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'className' @ [43:53] ==> value-parameter className: String defined in org.jetbrains.kotlin.codegen.getGeneratedClass[ValueParameterDescriptorImpl]

'aClass' @ [49:16] ==> value-parameter aClass: Class<*> defined in org.jetbrains.kotlin.codegen.getBoxMethodOrNull[ValueParameterDescriptorImpl]

'getMethod' @ [49:23] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'?:' @ [57:12] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<URL>?, right: List<URL>): List<URL>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<URL>

'this' @ [57:13] ==> <this> defined in org.jetbrains.kotlin.codegen.extractUrls[ReceiverParameterDescriptorImpl]

'let' @ [57:39] ==> @InlineOnly public inline fun <T, R> URLClassLoader.let(block: (URLClassLoader) -> List<URL>): List<URL> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URLClassLoader
    <R> -> List<URL>

'it' @ [58:9] ==> value-parameter it: URLClassLoader defined in org.jetbrains.kotlin.codegen.extractUrls.<anonymous>[ValueParameterDescriptorImpl]

'urLs' @ [58:12] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'toList' @ [58:17] ==> public fun <T> Array<out (URL..URL?)>.toList(): List<(URL..URL?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URL..java.net.URL?)

'it' @ [58:28] ==> value-parameter it: URLClassLoader defined in org.jetbrains.kotlin.codegen.extractUrls.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [58:31] ==> public final val URLClassLoader.parent: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'extractUrls' @ [58:38] ==> public fun ClassLoader?.extractUrls(): List<URL> defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'emptyList' @ [59:10] ==> public fun <T> emptyList(): List<URL> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> URL

