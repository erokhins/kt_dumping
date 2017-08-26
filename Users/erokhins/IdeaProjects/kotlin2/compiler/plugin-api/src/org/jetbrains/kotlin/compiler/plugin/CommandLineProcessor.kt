'Throws' @ [26:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'CliOptionProcessingException' @ [26:13] ==> public constructor CliOptionProcessingException(message: String, cause: Throwable? = ...) defined in org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException[ClassConstructorDescriptorImpl]

'getList' @ [29:21] ==> @NotNull public open fun <T : (Any..Any?)> getList(@NotNull p0: CompilerConfigurationKey<(MutableList<(T..T?)>..List<(T..T?)>?)>): (MutableList<(T..T?)>..List<(T..T?)>) defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (T..T?)

'option' @ [29:29] ==> value-parameter option: CompilerConfigurationKey<List<T>> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.appendList[ValueParameterDescriptorImpl]

'toMutableList' @ [29:37] ==> public fun <T> Collection<(T..T?)>.toMutableList(): MutableList<(T..T?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'paths' @ [30:9] ==> val paths: MutableList<(T..T?)> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.appendList[LocalVariableDescriptor]

'add' @ [30:15] ==> public abstract fun add(element: (T..T?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'value' @ [30:19] ==> value-parameter value: T defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.appendList[ValueParameterDescriptorImpl]

'put' @ [31:9] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(List<T>..List<T>?)>, @NotNull p1: List<T>): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.List<T>..kotlin.collections.List<T>?)

'option' @ [31:13] ==> value-parameter option: CompilerConfigurationKey<List<T>> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.appendList[ValueParameterDescriptorImpl]

'paths' @ [31:21] ==> val paths: MutableList<(T..T?)> defined in org.jetbrains.kotlin.compiler.plugin.CommandLineProcessor.appendList[LocalVariableDescriptor]

