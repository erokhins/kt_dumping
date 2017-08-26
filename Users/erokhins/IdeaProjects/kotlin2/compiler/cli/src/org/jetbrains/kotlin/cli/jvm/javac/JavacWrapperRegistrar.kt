'configuration' @ [41:32] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'getNotNull' @ [41:46] ==> @NotNull public open fun <T : (Any..Any?)> getNotNull(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>): MessageCollector defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [41:78] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'forName' @ [44:19] ==> @CallerSensitive public open fun forName(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'JAVAC_CONTEXT_CLASS' @ [44:27] ==> private const final val JAVAC_CONTEXT_CLASS: String defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar[PropertyDescriptorImpl]

'messageCollector' @ [47:13] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'report' @ [47:30] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'STRONG_WARNING' @ [47:37] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'JAVAC_CONTEXT_CLASS' @ [47:56] ==> private const final val JAVAC_CONTEXT_CLASS: String defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar[PropertyDescriptorImpl]

'Context' @ [51:23] ==> public constructor Context() defined in com.sun.tools.javac.util.Context[JavaClassConstructorDescriptor]

'JavacLogger' @ [52:9] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger[FakeCallableDescriptorForObject]

'preRegister' @ [52:21] ==> public final fun preRegister(context: Context, messageCollector: MessageCollector): Unit defined in org.jetbrains.kotlin.cli.jvm.javac.JavacLogger.Companion[SimpleFunctionDescriptorImpl]

'context' @ [52:33] ==> val context: Context defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'messageCollector' @ [52:42] ==> val messageCollector: MessageCollector defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'configuration' @ [54:33] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'jvmClasspathRoots' @ [54:47] ==> public val CompilerConfiguration.jvmClasspathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.config in file JvmContentRoots.kt[PropertyDescriptorImpl]

'configuration' @ [55:31] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'get' @ [55:45] ==> @Nullable public open operator fun <T : (Any..Any?)> get(@NotNull p0: CompilerConfigurationKey<(File..File?)>): File? defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [55:70] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JavacWrapper' @ [57:28] ==> public constructor JavacWrapper(javaFiles: Collection<File>, kotlinFiles: Collection<KtFile>, arguments: Array<String>?, jvmClasspathRoots: List<File>, outputDirectory: File?, context: Context) defined in org.jetbrains.kotlin.javac.JavacWrapper[DeserializedClassConstructorDescriptor]

'javaFiles' @ [57:41] ==> value-parameter javaFiles: List<File> defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'kotlinFiles' @ [57:52] ==> value-parameter kotlinFiles: List<KtFile> defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'arguments' @ [57:65] ==> value-parameter arguments: Array<String>? defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'jvmClasspathRoots' @ [57:76] ==> val jvmClasspathRoots: List<File> defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'outputDirectory' @ [57:95] ==> val outputDirectory: File? defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'context' @ [57:112] ==> val context: Context defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

'project' @ [59:9] ==> value-parameter project: MockProject defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[ValueParameterDescriptorImpl]

'registerService' @ [59:17] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(JavacWrapper..JavacWrapper?)>, @NotNull p1: JavacWrapper): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavacWrapper

'JavacWrapper' @ [59:33] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'java' @ [59:53] ==> public val <T> KClass<JavacWrapper>.java: Class<JavacWrapper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavacWrapper

'javacWrapper' @ [59:59] ==> val javacWrapper: JavacWrapper defined in org.jetbrains.kotlin.cli.jvm.javac.JavacWrapperRegistrar.registerJavac[LocalVariableDescriptor]

