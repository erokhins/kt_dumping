'PathUtil' @ [34:17] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'kotlinPathsForDistDirectory' @ [34:26] ==> @JvmStatic public final val kotlinPathsForDistDirectory: KotlinPaths defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedPropertyDescriptor]

'MessageCollectorToOutputItemsCollectorAdapter' @ [36:35] ==> public constructor MessageCollectorToOutputItemsCollectorAdapter(delegate: MessageCollector, outputCollector: OutputItemsCollector) defined in org.jetbrains.kotlin.compilerRunner.MessageCollectorToOutputItemsCollectorAdapter[DeserializedClassConstructorDescriptor]

'messageCollector' @ [36:81] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[ValueParameterDescriptorImpl]

'outputItemsCollector' @ [36:99] ==> value-parameter outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[ValueParameterDescriptorImpl]

'JpsCompilerEnvironment' @ [37:12] ==> public constructor JpsCompilerEnvironment(kotlinPaths: KotlinPaths, services: Services, classesToLoadByParent: ClassCondition, messageCollector: MessageCollector, outputItemsCollector: OutputItemsCollectorImpl) defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedClassConstructorDescriptor]

'paths' @ [37:35] ==> val paths: KotlinPaths defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[LocalVariableDescriptor]

'services' @ [37:42] ==> value-parameter services: Services defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[ValueParameterDescriptorImpl]

'classesToLoadByParent' @ [37:66] ==> public final val classesToLoadByParent: ClassCondition defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[DeserializedPropertyDescriptor]

'wrappedMessageCollector' @ [37:89] ==> val wrappedMessageCollector: MessageCollectorToOutputItemsCollectorAdapter defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[LocalVariableDescriptor]

'outputItemsCollector' @ [37:114] ==> value-parameter outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.jps.incremental.createTestingCompilerEnvironment[ValueParameterDescriptorImpl]

'convertArgumentsToStringList' @ [41:35] ==> @NotNull public open fun convertArgumentsToStringList(@NotNull p0: CommonToolArguments): (MutableList<(String..String?)>..List<(String..String?)>) defined in org.jetbrains.kotlin.compilerRunner.ArgumentUtils[JavaMethodDescriptor]

'args' @ [41:64] ==> value-parameter args: K2JSCompilerArguments defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[ValueParameterDescriptorImpl]

'toTypedArray' @ [41:70] ==> public inline fun <reified T> Collection<(String..String?)>.toTypedArray(): Array<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> (kotlin.String..kotlin.String?)

'ByteArrayOutputStream' @ [43:18] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [44:15] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'stream' @ [44:27] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

'invokeExecMethod' @ [45:39] ==> @Nullable public open fun invokeExecMethod(@NotNull p0: String, @NotNull p1: (Array<(String..String?)>..Array<out (String..String?)>), @NotNull p2: JpsCompilerEnvironment, @NotNull p3: PrintStream): Any? defined in org.jetbrains.kotlin.compilerRunner.CompilerRunnerUtil[JavaMethodDescriptor]

'K2JSCompiler' @ [45:56] ==> public constructor K2JSCompiler() defined in org.jetbrains.kotlin.cli.js.K2JSCompiler[JavaClassConstructorDescriptor]

'java' @ [45:76] ==> public val <T> KClass<K2JSCompiler>.java: Class<K2JSCompiler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> K2JSCompiler

'name' @ [45:81] ==> public final val <T : (Any..Any?)> Class<K2JSCompiler>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> K2JSCompiler

'argsArray' @ [45:87] ==> val argsArray: Array<(String..String?)> defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

'env' @ [45:98] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[ValueParameterDescriptorImpl]

'out' @ [45:103] ==> val out: PrintStream defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

'BufferedReader' @ [46:18] ==> public constructor BufferedReader(p0: (Reader..Reader?)) defined in java.io.BufferedReader[JavaClassConstructorDescriptor]

'StringReader' @ [46:33] ==> public constructor StringReader(p0: (String..String?)) defined in java.io.StringReader[JavaClassConstructorDescriptor]

'stream' @ [46:46] ==> val stream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

'toString' @ [46:53] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'CompilerOutputParser' @ [47:5] ==> public object CompilerOutputParser defined in org.jetbrains.kotlin.compilerRunner[FakeCallableDescriptorForObject]

'parseCompilerMessagesFromReader' @ [47:26] ==> public final fun parseCompilerMessagesFromReader(messageCollector: MessageCollector, reader: Reader, collector: OutputItemsCollector): Unit defined in org.jetbrains.kotlin.compilerRunner.CompilerOutputParser[DeserializedSimpleFunctionDescriptor]

'env' @ [47:58] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[ValueParameterDescriptorImpl]

'messageCollector' @ [47:62] ==> public final val messageCollector: MessageCollector defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'reader' @ [47:80] ==> val reader: BufferedReader defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

'env' @ [47:88] ==> value-parameter env: JpsCompilerEnvironment defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[ValueParameterDescriptorImpl]

'outputItemsCollector' @ [47:92] ==> public open val outputItemsCollector: OutputItemsCollectorImpl defined in org.jetbrains.kotlin.compilerRunner.JpsCompilerEnvironment[DeserializedPropertyDescriptor]

'exitCode' @ [48:12] ==> val exitCode: Any? defined in org.jetbrains.kotlin.jps.incremental.runJSCompiler[LocalVariableDescriptor]

