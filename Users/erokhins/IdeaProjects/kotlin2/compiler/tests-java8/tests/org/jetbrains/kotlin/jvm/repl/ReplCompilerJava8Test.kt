'TestCase' @ [49:31] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'super' @ [56:9] ==> <this> defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[LazyClassReceiverParameterDescriptor]

'setUp' @ [56:15] ==> protected/*protected and package*/ open fun setUp(): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'tmpdir' @ [57:9] ==> public final var tmpdir: File? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'tmpDirForTest' @ [57:34] ==> @NotNull public open fun tmpDirForTest(p0: (TestCase..TestCase?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [57:48] ==> <this> defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[LazyClassReceiverParameterDescriptor]

'File' @ [59:9] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [59:14] ==> public final var tmpdir: File? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'writeText' @ [59:36] ==> public fun File.writeText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'library' @ [59:46] ==> private const val library: String defined in org.jetbrains.kotlin.jvm.repl in file ReplCompilerJava8Test.kt[PropertyDescriptorImpl]

'disposable' @ [61:9] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'newDisposable' @ [61:31] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'newConfiguration' @ [63:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [63:80] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [63:97] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'apply' @ [63:107] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: (CompilerConfiguration).() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'put' @ [64:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(MessageCollector..MessageCollector?)>, @NotNull p1: MessageCollector): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MessageCollector

'MESSAGE_COLLECTOR_KEY' @ [64:38] ==> public final val MESSAGE_COLLECTOR_KEY: (CompilerConfigurationKey<(MessageCollector..MessageCollector?)>..CompilerConfigurationKey<(MessageCollector..MessageCollector?)>?) defined in org.jetbrains.kotlin.cli.common.CLIConfigurationKeys[JavaPropertyDescriptor]

'PrintingMessageCollector' @ [64:61] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'out' @ [64:93] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'WITHOUT_PATHS' @ [64:114] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'addKotlinSourceRoot' @ [65:13] ==> public fun CompilerConfiguration.addKotlinSourceRoot(source: String): Unit defined in org.jetbrains.kotlin.config[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [65:33] ==> public final var tmpdir: File? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'absolutePath' @ [65:42] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'put' @ [66:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(File..File?)>, @NotNull p1: File): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> File

'OUTPUT_DIRECTORY' @ [66:38] ==> public final val OUTPUT_DIRECTORY: (CompilerConfigurationKey<(File..File?)>..CompilerConfigurationKey<(File..File?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'tmpdir' @ [66:56] ==> public final var tmpdir: File? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'put' @ [67:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>, @NotNull p1: JvmTarget): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [67:38] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmTarget' @ [67:50] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_8' @ [67:60] ==> enum entry JVM_1_8 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'KotlinCoreEnvironment' @ [70:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForProduction' @ [70:49] ==> @JvmStatic public final fun createForProduction(parentDisposable: Disposable, configuration: CompilerConfiguration, configFiles: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'disposable' @ [70:69] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'configuration' @ [70:83] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.setUp[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [70:121] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'KotlinToJVMBytecodeCompiler' @ [72:19] ==> public object KotlinToJVMBytecodeCompiler defined in org.jetbrains.kotlin.cli.jvm.compiler[FakeCallableDescriptorForObject]

'compileBunchOfSources' @ [72:47] ==> public final fun compileBunchOfSources(environment: KotlinCoreEnvironment): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinToJVMBytecodeCompiler[DeserializedSimpleFunctionDescriptor]

'environment' @ [72:69] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.setUp[LocalVariableDescriptor]

'assertTrue' @ [73:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'res' @ [73:27] ==> val res: Boolean defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.setUp[LocalVariableDescriptor]

'dispose' @ [77:18] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'disposable' @ [77:26] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'Test' @ [80:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeConfiguration' @ [83:29] ==> private final fun makeConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'apply' @ [83:49] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: (CompilerConfiguration).() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'put' @ [84:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(JvmTarget..JvmTarget?)>, @NotNull p1: JvmTarget): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JvmTarget

'JVM_TARGET' @ [84:38] ==> public final val JVM_TARGET: (CompilerConfigurationKey<(JvmTarget..JvmTarget?)>..CompilerConfigurationKey<(JvmTarget..JvmTarget?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'JvmTarget' @ [84:50] ==> public companion object defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'JVM_1_6' @ [84:60] ==> enum entry JVM_1_6 defined in org.jetbrains.kotlin.config.JvmTarget[FakeCallableDescriptorForObject]

'runTest' @ [87:22] ==> private final fun runTest(configuration: CompilerConfiguration): ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'configuration' @ [87:30] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetConfig[LocalVariableDescriptor]

'assertTrue' @ [88:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'result' @ [88:27] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetConfig[LocalVariableDescriptor]

'assertTrue' @ [89:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'result' @ [89:28] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetConfig[LocalVariableDescriptor]

'message' @ [89:63] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[DeserializedPropertyDescriptor]

'contains' @ [89:71] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Test' @ [92:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeConfiguration' @ [95:29] ==> private final fun makeConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'setProperty' @ [96:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_REPL_JVM_TARGET_PROPERTY' @ [96:28] ==> public const val KOTLIN_REPL_JVM_TARGET_PROPERTY: String defined in org.jetbrains.kotlin.cli.jvm.repl[DeserializedPropertyDescriptor]

'runTest' @ [98:26] ==> private final fun runTest(configuration: CompilerConfiguration): ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'configuration' @ [98:34] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetProperty[LocalVariableDescriptor]

'assertTrue' @ [99:20] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'result' @ [99:31] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetProperty[LocalVariableDescriptor]

'assertTrue' @ [100:20] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'result' @ [100:32] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testIncompatibleScriptJvmTargetProperty[LocalVariableDescriptor]

'message' @ [100:67] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[DeserializedPropertyDescriptor]

'contains' @ [100:75] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'clearProperty' @ [103:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_REPL_JVM_TARGET_PROPERTY' @ [103:34] ==> public const val KOTLIN_REPL_JVM_TARGET_PROPERTY: String defined in org.jetbrains.kotlin.cli.jvm.repl[DeserializedPropertyDescriptor]

'Test' @ [107:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeConfiguration' @ [110:29] ==> private final fun makeConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'runTest' @ [111:22] ==> private final fun runTest(configuration: CompilerConfiguration): ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'configuration' @ [111:30] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testCompatibleScriptJvmTargetJavaVersionDetect[LocalVariableDescriptor]

'assertTrue' @ [112:16] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'result' @ [112:27] ==> val result: ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testCompatibleScriptJvmTargetJavaVersionDetect[LocalVariableDescriptor]

'Test' @ [115:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'makeConfiguration' @ [118:29] ==> private final fun makeConfiguration(): CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'setProperty' @ [119:16] ==> public open fun setProperty(p0: (String..String?), p1: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_REPL_JVM_TARGET_PROPERTY' @ [119:28] ==> public const val KOTLIN_REPL_JVM_TARGET_PROPERTY: String defined in org.jetbrains.kotlin.cli.jvm.repl[DeserializedPropertyDescriptor]

'assertTrue' @ [121:20] ==> public open fun assertTrue(p0: Boolean): Unit defined in org.junit.Assert[JavaMethodDescriptor]

'runTest' @ [121:31] ==> private final fun runTest(configuration: CompilerConfiguration): ReplCompileResult defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[SimpleFunctionDescriptorImpl]

'configuration' @ [121:39] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.testCompatibleScriptJvmTargetProperty[LocalVariableDescriptor]

'clearProperty' @ [124:20] ==> public open fun clearProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'KOTLIN_REPL_JVM_TARGET_PROPERTY' @ [124:34] ==> public const val KOTLIN_REPL_JVM_TARGET_PROPERTY: String defined in org.jetbrains.kotlin.cli.jvm.repl[DeserializedPropertyDescriptor]

'newConfiguration' @ [128:55] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [128:90] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'FULL_JDK' @ [128:107] ==> enum entry FULL_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'File' @ [128:117] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getCompilerLib' @ [128:148] ==> public open fun getCompilerLib(): (File..File?) defined in org.jetbrains.kotlin.integration.KotlinIntegrationTestBase[JavaMethodDescriptor]

'tmpdir' @ [128:188] ==> public final var tmpdir: File? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'GenericReplCompiler' @ [131:28] ==> public constructor GenericReplCompiler(disposable: Disposable, scriptDefinition: KotlinScriptDefinition, compilerConfiguration: CompilerConfiguration, messageCollector: MessageCollector) defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedClassConstructorDescriptor]

'disposable' @ [131:48] ==> private final var disposable: Disposable? defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test[PropertyDescriptorImpl]

'StandardScriptDefinition' @ [131:62] ==> public object StandardScriptDefinition : KotlinScriptDefinition defined in org.jetbrains.kotlin.script[FakeCallableDescriptorForObject]

'configuration' @ [131:88] ==> value-parameter configuration: CompilerConfiguration defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.runTest[ValueParameterDescriptorImpl]

'PrintingMessageCollector' @ [131:103] ==> public constructor PrintingMessageCollector(@NotNull p0: PrintStream, @NotNull p1: MessageRenderer, p2: Boolean) defined in org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector[JavaClassConstructorDescriptor]

'out' @ [131:135] ==> public final val out: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'WITHOUT_PATHS' @ [131:156] ==> public final val WITHOUT_PATHS: (MessageRenderer..MessageRenderer?) defined in org.jetbrains.kotlin.cli.common.messages.MessageRenderer[JavaPropertyDescriptor]

'replCompiler' @ [132:21] ==> val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.runTest[LocalVariableDescriptor]

'createState' @ [132:34] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'replCompiler' @ [134:16] ==> val replCompiler: GenericReplCompiler defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.runTest[LocalVariableDescriptor]

'compile' @ [134:29] ==> public open fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompiler[DeserializedSimpleFunctionDescriptor]

'state' @ [134:37] ==> val state: IReplStageState<*> defined in org.jetbrains.kotlin.jvm.repl.ReplCompilerJava8Test.runTest[LocalVariableDescriptor]

'ReplCodeLine' @ [134:44] ==> public constructor ReplCodeLine(no: Int, generation: Int, code: String) defined in org.jetbrains.kotlin.cli.common.repl.ReplCodeLine[DeserializedClassConstructorDescriptor]

'script' @ [134:63] ==> private const val script: String defined in org.jetbrains.kotlin.jvm.repl in file ReplCompilerJava8Test.kt[PropertyDescriptorImpl]

