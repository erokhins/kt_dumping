'BaseKotlinJpsBuildTestCase' @ [64:5] ==> public constructor BaseKotlinJpsBuildTestCase() defined in org.jetbrains.kotlin.jps.build.BaseKotlinJpsBuildTestCase[ClassConstructorDescriptorImpl]

'File' @ [69:45] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getTempDirectory' @ [69:61] ==> @NotNull public open fun getTempDirectory(): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'==' @ [71:45] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getProperty' @ [71:52] ==> public open fun getProperty(p0: (String..String?)): (String..String?) defined in java.lang.System[JavaMethodDescriptor]

'hashMapOf' @ [81:70] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<File, File> /* = HashMap<File, File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> File

'BuildLogFinder' @ [84:17] ==> public constructor BuildLogFinder(isDataContainerBuildLogEnabled: Boolean = ..., isGradleEnabled: Boolean = ...) defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder[DeserializedClassConstructorDescriptor]

'setFactory' @ [87:48] ==> public open fun setFactory(@NotNull p0: Class<out (Logger.Factory..Logger.Factory?)>): Unit defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'TestLoggerFactory' @ [87:59] ==> private constructor TestLoggerFactory() defined in com.intellij.testFramework.TestLoggerFactory[JavaClassConstructorDescriptor]

'java' @ [87:84] ==> public val <T> KClass<TestLoggerFactory>.java: Class<TestLoggerFactory> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TestLoggerFactory

'dumpLogToStdout' @ [88:27] ==> public open fun dumpLogToStdout(@NotNull p0: String): Unit defined in com.intellij.testFramework.TestLoggerFactory[JavaMethodDescriptor]

'enableDebugLogging' @ [89:27] ==> public open fun enableDebugLogging(@NotNull p0: Disposable, @NotNull vararg p1: (String..String?)): Unit defined in com.intellij.testFramework.TestLoggerFactory[JavaMethodDescriptor]

'testRootDisposable' @ [89:46] ==> public final val AbstractIncrementalJpsTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'ConsoleAppender' @ [91:23] ==> public constructor ConsoleAppender() defined in org.apache.log4j.ConsoleAppender[JavaClassConstructorDescriptor]

'console' @ [92:9] ==> val console: ConsoleAppender defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.enableDebugLogging[LocalVariableDescriptor]

'layout' @ [92:17] ==> public final var ConsoleAppender.layout: (Layout..Layout?)[MyPropertyDescriptor]

'PatternLayout' @ [92:26] ==> public constructor PatternLayout(p0: (String..String?)) defined in org.apache.log4j.PatternLayout[JavaClassConstructorDescriptor]

'console' @ [93:9] ==> val console: ConsoleAppender defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.enableDebugLogging[LocalVariableDescriptor]

'threshold' @ [93:17] ==> public final var ConsoleAppender.threshold: (Priority..Priority?)[MyPropertyDescriptor]

'ALL' @ [93:35] ==> public final val ALL: (Level..Level?) defined in org.apache.log4j.Level[JavaPropertyDescriptor]

'console' @ [94:9] ==> val console: ConsoleAppender defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.enableDebugLogging[LocalVariableDescriptor]

'activateOptions' @ [94:17] ==> public open fun activateOptions(): Unit defined in org.apache.log4j.ConsoleAppender[JavaMethodDescriptor]

'getRootLogger' @ [95:16] ==> public open fun getRootLogger(): (Logger..Logger?) defined in org.apache.log4j.Logger[JavaMethodDescriptor]

'addAppender' @ [95:32] ==> public open fun addAppender(p0: (Appender..Appender?)): Unit defined in org.apache.log4j.Logger[JavaMethodDescriptor]

'console' @ [95:44] ==> val console: ConsoleAppender defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.enableDebugLogging[LocalVariableDescriptor]

'run' @ [98:42] ==> @InlineOnly public inline fun <T, R> AbstractIncrementalJpsTest.run(block: AbstractIncrementalJpsTest.() -> (ByteArray..ByteArray?)): (ByteArray..ByteArray?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractIncrementalJpsTest
    <R> -> (kotlin.ByteArray..kotlin.ByteArray?)

'getProperties' @ [99:28] ==> public open fun getProperties(): (Properties..Properties?) defined in java.lang.System[JavaMethodDescriptor]

'ByteArrayOutputStream' @ [100:22] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'props' @ [101:9] ==> val props: (Properties..Properties?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.systemPropertiesBackup.<anonymous>[LocalVariableDescriptor]

'store' @ [101:15] ==> public open fun store(p0: (OutputStream..OutputStream?), p1: (String..String?)): Unit defined in java.util.Properties[JavaMethodDescriptor]

'output' @ [101:21] ==> val output: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.systemPropertiesBackup.<anonymous>[LocalVariableDescriptor]

'output' @ [102:9] ==> val output: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.systemPropertiesBackup.<anonymous>[LocalVariableDescriptor]

'toByteArray' @ [102:16] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'ByteArrayInputStream' @ [106:21] ==> public constructor ByteArrayInputStream(p0: (ByteArray..ByteArray?)) defined in java.io.ByteArrayInputStream[JavaClassConstructorDescriptor]

'systemPropertiesBackup' @ [106:42] ==> private final var systemPropertiesBackup: (ByteArray..ByteArray?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'Properties' @ [107:21] ==> public constructor Properties() defined in java.util.Properties[JavaClassConstructorDescriptor]

'props' @ [108:9] ==> val props: Properties defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.restoreSystemProperties[LocalVariableDescriptor]

'load' @ [108:15] ==> public open fun load(p0: (InputStream..InputStream?)): Unit defined in java.util.Properties[JavaMethodDescriptor]

'input' @ [108:20] ==> val input: ByteArrayInputStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.restoreSystemProperties[LocalVariableDescriptor]

'setProperties' @ [109:16] ==> public open fun setProperties(p0: (Properties..Properties?)): Unit defined in java.lang.System[JavaMethodDescriptor]

'props' @ [109:30] ==> val props: Properties defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.restoreSystemProperties[LocalVariableDescriptor]

'super' @ [113:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[LazyClassReceiverParameterDescriptor]

'setUp' @ [113:15] ==> @Throws protected open fun setUp(): Unit defined in org.jetbrains.kotlin.jps.build.BaseKotlinJpsBuildTestCase[SimpleFunctionDescriptorImpl]

'lookupsDuringTest' @ [114:9] ==> protected final lateinit var lookupsDuringTest: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'hashSetOf' @ [114:29] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<LookupSymbol> /* = HashSet<LookupSymbol> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupSymbol

'isICEnabledBackup' @ [115:9] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'isEnabled' @ [115:52] ==> public open fun isEnabled(): Boolean defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'setIsEnabled' @ [116:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'DEBUG_LOGGING_ENABLED' @ [118:13] ==> private final val DEBUG_LOGGING_ENABLED: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.Companion[PropertyDescriptorImpl]

'enableDebugLogging' @ [119:13] ==> private final fun enableDebugLogging(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'restoreSystemProperties' @ [124:9] ==> private final fun restoreSystemProperties(): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'!!' @ [125:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Field?): Field[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Field

'AbstractIncrementalJpsTest' @ [125:10] ==> public companion object defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[FakeCallableDescriptorForObject]

'myProject' @ [125:38] ==> @NotNull protected/*protected and package*/ final var myProject: JpsProject defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'javaField' @ [125:49] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'this' @ [125:61] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[LazyClassReceiverParameterDescriptor]

'!!' @ [126:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Field?): Field[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Field

'AbstractIncrementalJpsTest' @ [126:10] ==> public companion object defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[FakeCallableDescriptorForObject]

'projectDescriptor' @ [126:38] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'javaField' @ [126:57] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'this' @ [126:69] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[LazyClassReceiverParameterDescriptor]

'!!' @ [127:9] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Field?): Field[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Field

'AbstractIncrementalJpsTest' @ [127:10] ==> public companion object defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[FakeCallableDescriptorForObject]

'systemPropertiesBackup' @ [127:38] ==> private final var systemPropertiesBackup: (ByteArray..ByteArray?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'javaField' @ [127:62] ==> public val KProperty<*>.javaField: Field? defined in kotlin.reflect.jvm[DeserializedPropertyDescriptor]

'this' @ [127:74] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[LazyClassReceiverParameterDescriptor]

'lookupsDuringTest' @ [128:9] ==> protected final lateinit var lookupsDuringTest: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'clear' @ [128:27] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'setIsEnabled' @ [129:32] ==> public open fun setIsEnabled(p0: Boolean): Unit defined in org.jetbrains.kotlin.config.IncrementalCompilation[JavaMethodDescriptor]

'isICEnabledBackup' @ [129:45] ==> private final var isICEnabledBackup: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'super' @ [130:9] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[LazyClassReceiverParameterDescriptor]

'tearDown' @ [130:15] ==> @Throws protected open fun tearDown(): Unit defined in org.jetbrains.kotlin.jps.build.BaseKotlinJpsBuildTestCase[SimpleFunctionDescriptorImpl]

'make' @ [136:80] ==> public open fun make(): (CompileScopeTestBuilder..CompileScopeTestBuilder?) defined in org.jetbrains.jps.builders.CompileScopeTestBuilder[JavaMethodDescriptor]

'allModules' @ [136:87] ==> public open fun allModules(): (CompileScopeTestBuilder..CompileScopeTestBuilder?) defined in org.jetbrains.jps.builders.CompileScopeTestBuilder[JavaMethodDescriptor]

'toSystemIndependentName' @ [137:36] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'workDir' @ [137:60] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'absolutePath' @ [137:68] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'MyLogger' @ [138:22] ==> public constructor MyLogger(rootPath: String) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[ClassConstructorDescriptorImpl]

'workDirPath' @ [138:31] ==> val workDirPath: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'projectDescriptor' @ [139:9] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'createProjectDescriptor' @ [139:29] ==> protected/*protected and package*/ open fun createProjectDescriptor(p0: (BuildLoggingManager..BuildLoggingManager?)): (ProjectDescriptor..ProjectDescriptor?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'BuildLoggingManager' @ [139:53] ==> public constructor BuildLoggingManager(@NotNull p0: ProjectBuilderLogger) defined in org.jetbrains.jps.builders.logging.BuildLoggingManager[JavaClassConstructorDescriptor]

'logger' @ [139:73] ==> val logger: AbstractIncrementalJpsTest.MyLogger defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'TestLookupTracker' @ [141:29] ==> public constructor TestLookupTracker() defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[ClassConstructorDescriptorImpl]

'projectDescriptor' @ [142:9] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'project' @ [142:27] ==> public final val ProjectDescriptor.project: (JpsProject..JpsProject?)[MyPropertyDescriptor]

'setTestingContext' @ [142:35] ==> public fun JpsProject.setTestingContext(context: TestingContext): Unit defined in org.jetbrains.kotlin.jps.build[DeserializedSimpleFunctionDescriptor]

'TestingContext' @ [142:53] ==> public constructor TestingContext(lookupTracker: LookupTracker, buildLogger: BuildLogger) defined in org.jetbrains.kotlin.jps.build.TestingContext[DeserializedClassConstructorDescriptor]

'lookupTracker' @ [142:68] ==> val lookupTracker: TestLookupTracker defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'logger' @ [142:83] ==> val logger: AbstractIncrementalJpsTest.MyLogger defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'IncProjectBuilder' @ [145:27] ==> public constructor IncProjectBuilder(p0: (ProjectDescriptor..ProjectDescriptor?), p1: (BuilderRegistry..BuilderRegistry?), p2: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?), p3: (CanceledStatus..CanceledStatus?), @Nullable p4: Callbacks.ConstantAffectionResolver?, p5: Boolean) defined in org.jetbrains.jps.incremental.IncProjectBuilder[JavaClassConstructorDescriptor]

'projectDescriptor' @ [145:45] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'getInstance' @ [145:80] ==> public open fun getInstance(): (BuilderRegistry..BuilderRegistry?) defined in org.jetbrains.jps.incremental.BuilderRegistry[JavaMethodDescriptor]

'myBuildParams' @ [145:95] ==> protected/*protected and package*/ final var myBuildParams: (MutableMap<(String..String?), (String..String?)>..Map<(String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'NULL' @ [145:125] ==> public final val NULL: (CanceledStatus..CanceledStatus?) defined in org.jetbrains.jps.api.CanceledStatus[JavaPropertyDescriptor]

'mockConstantSearch' @ [145:131] ==> protected open val mockConstantSearch: Callbacks.ConstantAffectionResolver? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'BuildResult' @ [146:31] ==> public constructor BuildResult() defined in org.jetbrains.jps.builders.BuildResult[JavaClassConstructorDescriptor]

'builder' @ [147:13] ==> val builder: IncProjectBuilder defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'addMessageHandler' @ [147:21] ==> public open fun addMessageHandler(p0: (MessageHandler..MessageHandler?)): Unit defined in org.jetbrains.jps.incremental.IncProjectBuilder[JavaMethodDescriptor]

'buildResult' @ [147:39] ==> val buildResult: BuildResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'builder' @ [148:13] ==> val builder: IncProjectBuilder defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'build' @ [148:21] ==> public open fun build(p0: (CompileScope..CompileScope?), p1: Boolean): Unit defined in org.jetbrains.jps.incremental.IncProjectBuilder[JavaMethodDescriptor]

'scope' @ [148:27] ==> value-parameter scope: CompileScopeTestBuilder = ... defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[ValueParameterDescriptorImpl]

'build' @ [148:33] ==> public open fun build(): (CompileScope..CompileScope?) defined in org.jetbrains.jps.builders.CompileScopeTestBuilder[JavaMethodDescriptor]

'lookupTracker' @ [150:13] ==> val lookupTracker: TestLookupTracker defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'lookups' @ [150:27] ==> public final val lookups: ArrayList<LookupInfo> /* = ArrayList<LookupInfo> */ defined in org.jetbrains.kotlin.jps.build.TestLookupTracker[PropertyDescriptorImpl]

'mapTo' @ [150:35] ==> public inline fun <T, R, C : MutableCollection<in LookupSymbol>> Iterable<LookupInfo>.mapTo(destination: MutableSet<LookupSymbol>, transform: (LookupInfo) -> LookupSymbol): MutableSet<LookupSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LookupInfo
    <R> -> LookupSymbol
    <C : MutableCollection<in R>> -> MutableSet<LookupSymbol>

'lookupsDuringTest' @ [150:41] ==> protected final lateinit var lookupsDuringTest: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'LookupSymbol' @ [150:62] ==> public constructor LookupSymbol(name: String, scope: String) defined in org.jetbrains.kotlin.incremental.LookupSymbol[DeserializedClassConstructorDescriptor]

'it' @ [150:75] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [150:78] ==> public final val name: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'it' @ [150:84] ==> value-parameter it: LookupInfo defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build.<anonymous>[ValueParameterDescriptorImpl]

'scopeFqName' @ [150:87] ==> public final val scopeFqName: String defined in org.jetbrains.kotlin.incremental.components.LookupInfo[DeserializedPropertyDescriptor]

'if (!buildResult.isSuccessful) {
                val errorMessages =
                        buildResult
                                .getMessages(BuildMessage.Kind.ERROR)
                                .map { it.messageText }
                                .map { it.replace("^.+:\\d+:\\s+".toRegex(), "").trim() }
                                .joinToString("\n")
                return MakeResult(logger.log + "$COMPILATION_FAILED\n" + errorMessages + "\n", true, null)
            }
            else {
                return MakeResult(logger.log, false, createMappingsDump(projectDescriptor))
            }' @ [152:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [152:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'buildResult' @ [152:18] ==> val buildResult: BuildResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'isSuccessful' @ [152:30] ==> public final val BuildResult.isSuccessful: Boolean[MyPropertyDescriptor]

'buildResult' @ [154:25] ==> val buildResult: BuildResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'getMessages' @ [155:34] ==> @NotNull public open fun getMessages(@NotNull p0: BuildMessage.Kind): (MutableList<(BuildMessage..BuildMessage?)>..List<(BuildMessage..BuildMessage?)>) defined in org.jetbrains.jps.builders.BuildResult[JavaMethodDescriptor]

'ERROR' @ [155:64] ==> enum entry ERROR defined in org.jetbrains.jps.incremental.messages.BuildMessage.Kind[FakeCallableDescriptorForObject]

'map' @ [156:34] ==> public inline fun <T, R> Iterable<(BuildMessage..BuildMessage?)>.map(transform: ((BuildMessage..BuildMessage?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.incremental.messages.BuildMessage..org.jetbrains.jps.incremental.messages.BuildMessage?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [156:40] ==> value-parameter it: (BuildMessage..BuildMessage?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build.<anonymous>[ValueParameterDescriptorImpl]

'messageText' @ [156:43] ==> public final val BuildMessage.messageText: (String..String?)[MyPropertyDescriptor]

'map' @ [157:34] ==> public inline fun <T, R> Iterable<(String..String?)>.map(transform: ((String..String?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> String

'it' @ [157:40] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [157:43] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toRegex' @ [157:67] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'trim' @ [157:82] ==> @InlineOnly public inline fun String.trim(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'joinToString' @ [158:34] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'MakeResult' @ [159:24] ==> public constructor MakeResult(log: String, makeFailed: Boolean, mappingsDump: String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[ClassConstructorDescriptorImpl]

'logger' @ [159:35] ==> val logger: AbstractIncrementalJpsTest.MyLogger defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'log' @ [159:42] ==> public final val log: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'COMPILATION_FAILED' @ [159:50] ==> private final val COMPILATION_FAILED: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.Companion[PropertyDescriptorImpl]

'errorMessages' @ [159:74] ==> val errorMessages: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'MakeResult' @ [162:24] ==> public constructor MakeResult(log: String, makeFailed: Boolean, mappingsDump: String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[ClassConstructorDescriptorImpl]

'logger' @ [162:35] ==> val logger: AbstractIncrementalJpsTest.MyLogger defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.build[LocalVariableDescriptor]

'log' @ [162:42] ==> public final val log: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'createMappingsDump' @ [162:54] ==> private final fun createMappingsDump(project: ProjectDescriptor): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'projectDescriptor' @ [162:73] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'projectDescriptor' @ [166:13] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'dataManager' @ [166:31] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'flush' @ [166:43] ==> public open fun flush(p0: Boolean): Unit defined in org.jetbrains.jps.incremental.storage.BuildDataManager[JavaMethodDescriptor]

'projectDescriptor' @ [167:13] ==> protected final lateinit var projectDescriptor: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'release' @ [167:31] ==> public open fun release(): Unit defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaMethodDescriptor]

'build' @ [172:26] ==> private final fun build(scope: CompileScopeTestBuilder = ...): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'File' @ [174:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDir' @ [174:37] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'if (initBuildLogFile.exists()) {
            UsefulTestCase.assertSameLinesWithFile(initBuildLogFile.absolutePath, makeResult.log)
        }
        else {
            assertFalse("Initial make failed:\n$makeResult", makeResult.makeFailed)
        }' @ [175:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'initBuildLogFile' @ [175:13] ==> val initBuildLogFile: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'exists' @ [175:30] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertSameLinesWithFile' @ [176:28] ==> public open fun assertSameLinesWithFile(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'initBuildLogFile' @ [176:52] ==> val initBuildLogFile: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'absolutePath' @ [176:69] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'makeResult' @ [176:83] ==> val makeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'log' @ [176:94] ==> public final val log: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'assertFalse' @ [179:13] ==> public open fun assertFalse(p0: (String..String?), p1: Boolean): Unit defined in org.jetbrains.jps.builders.JpsBuildTestCase[JavaMethodDescriptor]

'makeResult' @ [179:49] ==> val makeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'makeResult' @ [179:62] ==> val makeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'makeFailed' @ [179:73] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'makeResult' @ [182:16] ==> val makeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.initialMake[LocalVariableDescriptor]

'build' @ [186:16] ==> private final fun build(scope: CompileScopeTestBuilder = ...): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'build' @ [190:16] ==> private final fun build(scope: CompileScopeTestBuilder = ...): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'rebuild' @ [190:46] ==> public open fun rebuild(): (CompileScopeTestBuilder..CompileScopeTestBuilder?) defined in org.jetbrains.jps.builders.CompileScopeTestBuilder[JavaMethodDescriptor]

'allModules' @ [190:56] ==> public open fun allModules(): (CompileScopeTestBuilder..CompileScopeTestBuilder?) defined in org.jetbrains.jps.builders.CompileScopeTestBuilder[JavaMethodDescriptor]

'File' @ [194:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getAbsolutePath' @ [194:27] ==> public open fun getAbsolutePath(p0: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'File' @ [195:28] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'getAbsolutePath' @ [195:33] ==> public open fun getAbsolutePath(p0: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'outDir' @ [197:13] ==> val outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'exists' @ [197:20] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'copyDir' @ [198:22] ==> public open fun copyDir(@NotNull p0: File, @NotNull p1: File): Unit defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outDir' @ [198:30] ==> val outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'outAfterMake' @ [198:38] ==> val outAfterMake: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'rebuild' @ [201:29] ==> private final fun rebuild(): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'assertEquals' @ [202:9] ==> public open fun assertEquals(p0: (String..String?), p1: Boolean, p2: Boolean): Unit defined in org.jetbrains.jps.builders.JpsBuildTestCase[JavaMethodDescriptor]

'rebuildResult' @ [202:41] ==> val rebuildResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'makeFailed' @ [202:55] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'makeOverallResult' @ [202:88] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'makeFailed' @ [202:106] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'rebuildResult' @ [202:136] ==> val rebuildResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'rebuildResult' @ [203:22] ==> val rebuildResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'makeFailed' @ [203:36] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'makeOverallResult' @ [203:48] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'makeFailed' @ [203:66] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'if (!outAfterMake.exists()) {
            assertFalse(outDir.exists())
        }
        else {
            assertEqualDirectories(outDir, outAfterMake, makeOverallResult.makeFailed)
        }' @ [205:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [205:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'outAfterMake' @ [205:14] ==> val outAfterMake: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'exists' @ [205:27] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertFalse' @ [206:13] ==> public open fun assertFalse(p0: Boolean): Unit defined in org.jetbrains.jps.builders.JpsBuildTestCase[JavaMethodDescriptor]

'outDir' @ [206:25] ==> val outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'exists' @ [206:32] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertEqualDirectories' @ [209:13] ==> public fun assertEqualDirectories(expected: File, actual: File, forgiveExtraFiles: Boolean): Unit defined in org.jetbrains.kotlin.incremental.testingUtils[DeserializedSimpleFunctionDescriptor]

'outDir' @ [209:36] ==> val outDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'outAfterMake' @ [209:44] ==> val outAfterMake: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'makeOverallResult' @ [209:58] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'makeFailed' @ [209:76] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'!' @ [212:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'makeOverallResult' @ [212:14] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'makeFailed' @ [212:32] ==> public final val makeFailed: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'if (checkDumpsCaseInsensitively && rebuildResult.mappingsDump?.toLowerCase() == makeOverallResult.mappingsDump?.toLowerCase()) {
                // do nothing
            }
            else {
                TestCase.assertEquals(rebuildResult.mappingsDump, makeOverallResult.mappingsDump)
            }' @ [213:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'checkDumpsCaseInsensitively' @ [213:17] ==> private final val checkDumpsCaseInsensitively: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'rebuildResult' @ [213:48] ==> val rebuildResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'mappingsDump' @ [213:62] ==> public final val mappingsDump: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'toLowerCase' @ [213:76] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'makeOverallResult' @ [213:93] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'mappingsDump' @ [213:111] ==> public final val mappingsDump: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'toLowerCase' @ [213:125] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEquals' @ [217:26] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'rebuildResult' @ [217:39] ==> val rebuildResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'mappingsDump' @ [217:53] ==> public final val mappingsDump: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'makeOverallResult' @ [217:67] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[ValueParameterDescriptorImpl]

'mappingsDump' @ [217:85] ==> public final val mappingsDump: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'delete' @ [221:18] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'outAfterMake' @ [221:25] ==> val outAfterMake: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.rebuildAndCheckOutput[LocalVariableDescriptor]

'delete' @ [225:18] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'BuildDataPathsImpl' @ [225:25] ==> public constructor BuildDataPathsImpl(p0: (File..File?)) defined in org.jetbrains.jps.builders.impl.BuildDataPathsImpl[JavaClassConstructorDescriptor]

'myDataStorageRoot' @ [225:44] ==> protected/*protected and package*/ final var myDataStorageRoot: (File..File?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'dataStorageRoot' @ [225:63] ==> public final val BuildDataPathsImpl.dataStorageRoot: (File..File?)[MyPropertyDescriptor]

'rebuildAndCheckOutput' @ [227:9] ==> private final fun rebuildAndCheckOutput(makeOverallResult: AbstractIncrementalJpsTest.MakeResult): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'makeOverallResult' @ [227:31] ==> value-parameter makeOverallResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.clearCachesRebuildAndCheckOutput[ValueParameterDescriptorImpl]

'File' @ [231:31] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDir' @ [231:36] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'!' @ [232:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dependenciesTxt' @ [232:14] ==> val dependenciesTxt: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'exists' @ [232:30] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'HashMap' @ [234:22] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> List<DependencyDescriptor>

'dependenciesTxt' @ [235:22] ==> val dependenciesTxt: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'readLines' @ [235:38] ==> public fun File.readLines(charset: Charset = ...): List<String> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'line' @ [236:25] ==> val line: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'split' @ [236:30] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [237:26] ==> val split: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'if (split.size > 1) split[1] else ""' @ [238:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'split' @ [238:36] ==> val split: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'size' @ [238:42] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'split' @ [238:52] ==> val split: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'dependencies' @ [239:34] ==> val dependencies: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'split' @ [239:47] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filterNot' @ [239:58] ==> public inline fun <T> Iterable<String>.filterNot(predicate: (String) -> Boolean): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [239:70] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies.<anonymous>[ValueParameterDescriptorImpl]

'isEmpty' @ [239:73] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'result' @ [240:13] ==> val result: HashMap<String, List<DependencyDescriptor>> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'module' @ [240:20] ==> val module: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'dependencyList' @ [240:30] ==> val dependencyList: List<String> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'map' @ [240:45] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> DependencyDescriptor): List<DependencyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> DependencyDescriptor

'result' @ [243:16] ==> val result: HashMap<String, List<DependencyDescriptor>> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.readModuleDependencies[LocalVariableDescriptor]

'buildString' @ [247:13] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'incrementalMakeResults' @ [248:17] ==> value-parameter incrementalMakeResults: List<AbstractIncrementalJpsTest.MakeResult> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createBuildLog[ValueParameterDescriptorImpl]

'forEachIndexed' @ [248:40] ==> public inline fun <T> Iterable<AbstractIncrementalJpsTest.MakeResult>.forEachIndexed(action: (index: Int, AbstractIncrementalJpsTest.MakeResult) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MakeResult

'i' @ [249:25] ==> value-parameter i: Int defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createBuildLog.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [249:32] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [250:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'i' @ [250:54] ==> value-parameter i: Int defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createBuildLog.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [251:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'makeResult' @ [251:28] ==> value-parameter makeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createBuildLog.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'log' @ [251:39] ==> public final val log: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MakeResult[PropertyDescriptorImpl]

'testDataDir' @ [256:9] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'File' @ [256:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataPath' @ [256:28] ==> value-parameter testDataPath: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[ValueParameterDescriptorImpl]

'workDir' @ [257:9] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'createTempDirectory' @ [257:30] ==> @NotNull public open fun createTempDirectory(@NotNull p0: File, @NotNull @NonNls p1: String, @Nullable @NonNls p2: String?): File defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'TEMP_DIRECTORY_TO_USE' @ [257:50] ==> private final val TEMP_DIRECTORY_TO_USE: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.Companion[PropertyDescriptorImpl]

'register' @ [258:18] ==> public open fun register(@NotNull p0: Disposable, @NotNull p1: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'testRootDisposable' @ [258:27] ==> public final val AbstractIncrementalJpsTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'Disposable' @ [258:47] ==> public fun Disposable(function: () -> Unit): Disposable defined in com.intellij.openapi[SimpleFunctionDescriptorImpl]

'delete' @ [258:71] ==> public open fun delete(@NotNull p0: File): Boolean defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'workDir' @ [258:78] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'configureModules' @ [260:27] ==> private final fun configureModules(): Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'initialMake' @ [261:9] ==> private final fun initialMake(): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'performModificationsAndMake' @ [263:32] ==> private final fun performModificationsAndMake(moduleNames: Set<String>?): List<AbstractIncrementalJpsTest.MakeResult> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'moduleNames' @ [263:60] ==> val moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'buildLogFinder' @ [264:28] ==> protected open val buildLogFinder: BuildLogFinder defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'findBuildLog' @ [264:43] ==> public final fun findBuildLog(dir: File): File? defined in org.jetbrains.kotlin.incremental.testingUtils.BuildLogFinder[DeserializedSimpleFunctionDescriptor]

'testDataDir' @ [264:56] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'createBuildLog' @ [265:20] ==> protected open fun createBuildLog(incrementalMakeResults: List<AbstractIncrementalJpsTest.MakeResult>): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'otherMakeResults' @ [265:35] ==> val otherMakeResults: List<AbstractIncrementalJpsTest.MakeResult> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'if (buildLogFile != null && buildLogFile.exists()) {
            UsefulTestCase.assertSameLinesWithFile(buildLogFile.absolutePath, logs)
        }
        else if (!allowNoBuildLogFileInTestData) {
            throw IllegalStateException("No build log file in $testDataDir")
        }' @ [267:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'buildLogFile' @ [267:13] ==> val buildLogFile: File? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'buildLogFile' @ [267:37] ==> val buildLogFile: File? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'exists' @ [267:50] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'assertSameLinesWithFile' @ [268:28] ==> public open fun assertSameLinesWithFile(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'buildLogFile' @ [268:52] ==> val buildLogFile: File? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'absolutePath' @ [268:65] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'logs' @ [268:79] ==> val logs: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'!' @ [270:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowNoBuildLogFileInTestData' @ [270:19] ==> private final val allowNoBuildLogFileInTestData: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'IllegalStateException' @ [271:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'testDataDir' @ [271:64] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'otherMakeResults' @ [274:30] ==> val otherMakeResults: List<AbstractIncrementalJpsTest.MakeResult> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'last' @ [274:47] ==> public fun <T> List<AbstractIncrementalJpsTest.MakeResult>.last(): AbstractIncrementalJpsTest.MakeResult defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MakeResult

'rebuildAndCheckOutput' @ [275:9] ==> private final fun rebuildAndCheckOutput(makeOverallResult: AbstractIncrementalJpsTest.MakeResult): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'lastMakeResult' @ [275:31] ==> val lastMakeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'clearCachesRebuildAndCheckOutput' @ [276:9] ==> private final fun clearCachesRebuildAndCheckOutput(makeOverallResult: AbstractIncrementalJpsTest.MakeResult): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'lastMakeResult' @ [276:42] ==> val lastMakeResult: AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.doTest[LocalVariableDescriptor]

'createKotlinIncrementalCacheDump' @ [280:13] ==> private final fun createKotlinIncrementalCacheDump(project: ProjectDescriptor): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'project' @ [280:46] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createMappingsDump[ValueParameterDescriptorImpl]

'createLookupCacheDump' @ [281:13] ==> private final fun createLookupCacheDump(project: ProjectDescriptor): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'project' @ [281:35] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createMappingsDump[ValueParameterDescriptorImpl]

'createCommonMappingsDump' @ [282:13] ==> private final fun createCommonMappingsDump(project: ProjectDescriptor): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'project' @ [282:38] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createMappingsDump[ValueParameterDescriptorImpl]

'createJavaMappingsDump' @ [283:13] ==> private final fun createJavaMappingsDump(project: ProjectDescriptor): String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'project' @ [283:36] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createMappingsDump[ValueParameterDescriptorImpl]

'buildString' @ [286:16] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'project' @ [287:28] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump[ValueParameterDescriptorImpl]

'allModuleTargets' @ [287:36] ==> internal val ProjectDescriptor.allModuleTargets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

'sortedBy' @ [287:53] ==> public inline fun <T, R : Comparable<String>> Iterable<ModuleBuildTarget>.sortedBy(crossinline selector: (ModuleBuildTarget) -> String?): List<ModuleBuildTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleBuildTarget
    <R : Comparable<R>> -> String

'it' @ [287:64] ==> value-parameter it: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'presentableName' @ [287:67] ==> public final val ModuleBuildTarget.presentableName: String[MyPropertyDescriptor]

'append' @ [288:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'target' @ [288:34] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump.<anonymous>[LocalVariableDescriptor]

'append' @ [289:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'project' @ [289:24] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump[ValueParameterDescriptorImpl]

'dataManager' @ [289:32] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'getKotlinCache' @ [289:44] ==> public fun BuildDataManager.getKotlinCache(target: ModuleBuildTarget): JpsIncrementalCacheImpl defined in org.jetbrains.kotlin.jps.incremental[DeserializedSimpleFunctionDescriptor]

'target' @ [289:59] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump.<anonymous>[LocalVariableDescriptor]

'dump' @ [289:67] ==> public final fun dump(): String defined in org.jetbrains.kotlin.jps.incremental.JpsIncrementalCacheImpl[DeserializedSimpleFunctionDescriptor]

'append' @ [290:17] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'target' @ [290:35] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createKotlinIncrementalCacheDump.<anonymous>[LocalVariableDescriptor]

'StringBuilder' @ [296:18] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Printer' @ [297:17] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'sb' @ [297:25] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'p' @ [298:9] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'println' @ [298:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [299:9] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'println' @ [299:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'project' @ [301:29] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[ValueParameterDescriptorImpl]

'dataManager' @ [301:37] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'getStorage' @ [301:49] ==> @NotNull public open fun <S : (StorageOwner..StorageOwner?)> getStorage(@NotNull p0: BuildTarget<*>, @NotNull p1: StorageProvider<(JpsLookupStorage..JpsLookupStorage?)>): JpsLookupStorage defined in org.jetbrains.jps.incremental.storage.BuildDataManager[JavaMethodDescriptor]
Inferred types:
    <S : (StorageOwner..StorageOwner?)> -> JpsLookupStorage

'KotlinDataContainerTarget' @ [301:60] ==> public object KotlinDataContainerTarget : BuildTarget<BuildRootDescriptor> defined in org.jetbrains.kotlin.jps.incremental[FakeCallableDescriptorForObject]

'JpsLookupStorageProvider' @ [301:87] ==> public object JpsLookupStorageProvider : StorageProvider<JpsLookupStorage> defined in org.jetbrains.kotlin.jps.incremental[FakeCallableDescriptorForObject]

'lookupStorage' @ [302:9] ==> val lookupStorage: JpsLookupStorage defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'forceGC' @ [302:23] ==> public final fun forceGC(): Unit defined in org.jetbrains.kotlin.jps.incremental.JpsLookupStorage[DeserializedSimpleFunctionDescriptor]

'p' @ [303:9] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'print' @ [303:11] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'lookupStorage' @ [303:17] ==> val lookupStorage: JpsLookupStorage defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'dump' @ [303:31] ==> public final fun dump(lookupSymbols: Set<LookupSymbol>, basePath: File?): String defined in org.jetbrains.kotlin.jps.incremental.JpsLookupStorage[DeserializedSimpleFunctionDescriptor]

'lookupsDuringTest' @ [303:36] ==> protected final lateinit var lookupsDuringTest: MutableSet<LookupSymbol> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'p' @ [305:9] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'println' @ [305:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [306:9] ==> val p: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'println' @ [306:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'sb' @ [307:16] ==> val sb: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createLookupCacheDump[LocalVariableDescriptor]

'toString' @ [307:19] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'StringBuilder' @ [311:25] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'Printer' @ [312:22] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'resultBuf' @ [312:30] ==> val resultBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'result' @ [314:9] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'println' @ [314:16] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'result' @ [315:9] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'pushIndent' @ [315:16] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'project' @ [317:24] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[ValueParameterDescriptorImpl]

'allModuleTargets' @ [317:32] ==> internal val ProjectDescriptor.allModuleTargets: Collection<ModuleBuildTarget> defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

'result' @ [318:13] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'println' @ [318:20] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'target' @ [318:28] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'result' @ [319:13] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'pushIndent' @ [319:20] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'project' @ [321:27] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[ValueParameterDescriptorImpl]

'dataManager' @ [321:35] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'getSourceToOutputMap' @ [321:47] ==> public open fun getSourceToOutputMap(p0: (BuildTarget<*>..BuildTarget<*>?)): (SourceToOutputMapping..SourceToOutputMapping?) defined in org.jetbrains.jps.incremental.storage.BuildDataManager[JavaMethodDescriptor]

'target' @ [321:68] ==> val target: ModuleBuildTarget defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'mapping' @ [322:13] ==> val mapping: (SourceToOutputMapping..SourceToOutputMapping?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'sources' @ [322:21] ==> public final val SourceToOutputMapping.sources: (MutableCollection<(String..String?)>..Collection<(String..String?)>)[MyPropertyDescriptor]

'sorted' @ [322:29] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'forEach' @ [322:38] ==> @HidesMembers public inline fun <T> Iterable<(String..String?)>.forEach(action: ((String..String?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'mapping' @ [323:31] ==> val mapping: (SourceToOutputMapping..SourceToOutputMapping?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'getOutputs' @ [323:39] ==> @Nullable public abstract fun getOutputs(@NotNull p0: String): (MutableCollection<(String..String?)>?..Collection<(String..String?)>?) defined in org.jetbrains.jps.builders.storage.SourceToOutputMapping[JavaMethodDescriptor]

'it' @ [323:50] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump.<anonymous>[ValueParameterDescriptorImpl]

'sorted' @ [323:56] ==> public fun <T : Comparable<(String..String?)>> Iterable<(String..String?)>.sorted(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> (kotlin.String..kotlin.String?)

'outputs' @ [324:21] ==> val outputs: List<(String..String?)> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [324:29] ==> @InlineOnly public inline fun <T> Collection<(String..String?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'result' @ [325:21] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'println' @ [325:28] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'it' @ [325:45] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump.<anonymous>[ValueParameterDescriptorImpl]

'outputs' @ [325:52] ==> val outputs: List<(String..String?)> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump.<anonymous>[LocalVariableDescriptor]

'result' @ [329:13] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'popIndent' @ [329:20] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'result' @ [332:9] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'popIndent' @ [332:16] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'result' @ [333:9] ==> val result: Printer defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'println' @ [333:16] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'resultBuf' @ [335:16] ==> val resultBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createCommonMappingsDump[LocalVariableDescriptor]

'toString' @ [335:26] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ByteArrayOutputStream' @ [339:37] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [340:9] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'byteArrayOutputStream' @ [340:21] ==> val byteArrayOutputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createJavaMappingsDump[LocalVariableDescriptor]

'use' @ [340:44] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintStream.use(block: (PrintStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintStream
    <R> -> Unit

'project' @ [341:13] ==> value-parameter project: ProjectDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createJavaMappingsDump[ValueParameterDescriptorImpl]

'dataManager' @ [341:21] ==> public final val dataManager: (BuildDataManager..BuildDataManager?) defined in org.jetbrains.jps.cmdline.ProjectDescriptor[JavaPropertyDescriptor]

'mappings' @ [341:33] ==> public final val BuildDataManager.mappings: (Mappings..Mappings?)[MyPropertyDescriptor]

'toStream' @ [341:42] ==> public open fun toStream(p0: (PrintStream..PrintStream?)): Unit defined in org.jetbrains.jps.builders.java.dependencyView.Mappings[JavaMethodDescriptor]

'it' @ [341:51] ==> value-parameter it: PrintStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createJavaMappingsDump.<anonymous>[ValueParameterDescriptorImpl]

'byteArrayOutputStream' @ [343:16] ==> val byteArrayOutputStream: ByteArrayOutputStream defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.createJavaMappingsDump[LocalVariableDescriptor]

'toString' @ [343:38] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'arrayListOf' @ [349:23] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<AbstractIncrementalJpsTest.MakeResult> /* = ArrayList<AbstractIncrementalJpsTest.MakeResult> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MakeResult

'getModificationsToPerform' @ [350:29] ==> public fun getModificationsToPerform(testDataDir: File, moduleNames: Collection<String>?, allowNoFilesWithSuffixInTestData: Boolean, touchPolicy: TouchPolicy): List<List<Modification>> defined in org.jetbrains.kotlin.incremental.testingUtils[DeserializedSimpleFunctionDescriptor]

'testDataDir' @ [350:55] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'moduleNames' @ [350:68] ==> value-parameter moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[ValueParameterDescriptorImpl]

'allowNoFilesWithSuffixInTestData' @ [350:81] ==> private final val allowNoFilesWithSuffixInTestData: Boolean defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'TIMESTAMP' @ [350:127] ==> enum entry TIMESTAMP defined in org.jetbrains.kotlin.incremental.testingUtils.TouchPolicy[FakeCallableDescriptorForObject]

'modifications' @ [352:22] ==> val modifications: List<List<Modification>> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[LocalVariableDescriptor]

'step' @ [353:13] ==> val step: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[LocalVariableDescriptor]

'forEach' @ [353:18] ==> @HidesMembers public inline fun <T> Iterable<Modification>.forEach(action: (Modification) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'it' @ [353:28] ==> value-parameter it: Modification defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake.<anonymous>[ValueParameterDescriptorImpl]

'perform' @ [353:31] ==> public abstract fun perform(workDir: File, mapping: MutableMap<File, File>): File? defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[DeserializedSimpleFunctionDescriptor]

'workDir' @ [353:39] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'mapWorkingToOriginalFile' @ [353:48] ==> protected final var mapWorkingToOriginalFile: MutableMap<File, File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'performAdditionalModifications' @ [354:13] ==> protected open fun performAdditionalModifications(modifications: List<Modification>): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'step' @ [354:44] ==> val step: List<Modification> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[LocalVariableDescriptor]

'if (moduleNames == null) {
                preProcessSources(File(workDir, "src"))
            }
            else {
                moduleNames.forEach { preProcessSources(File(workDir, "$it/src")) }
            }' @ [355:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'moduleNames' @ [355:17] ==> value-parameter moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[ValueParameterDescriptorImpl]

'preProcessSources' @ [356:17] ==> protected open fun preProcessSources(srcDir: File): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'File' @ [356:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [356:40] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'moduleNames' @ [359:17] ==> value-parameter moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[ValueParameterDescriptorImpl]

'forEach' @ [359:29] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'preProcessSources' @ [359:39] ==> protected open fun preProcessSources(srcDir: File): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'File' @ [359:57] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [359:62] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'it' @ [359:73] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake.<anonymous>[ValueParameterDescriptorImpl]

'results' @ [362:13] ==> val results: ArrayList<AbstractIncrementalJpsTest.MakeResult> /* = ArrayList<AbstractIncrementalJpsTest.MakeResult> */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[LocalVariableDescriptor]

'add' @ [362:21] ==> public open fun add(element: AbstractIncrementalJpsTest.MakeResult): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'make' @ [362:25] ==> private final fun make(): AbstractIncrementalJpsTest.MakeResult defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'results' @ [364:16] ==> val results: ArrayList<AbstractIncrementalJpsTest.MakeResult> /* = ArrayList<AbstractIncrementalJpsTest.MakeResult> */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.performModificationsAndMake[LocalVariableDescriptor]

'moduleName' @ [373:33] ==> value-parameter moduleName: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[ValueParameterDescriptorImpl]

'let' @ [373:45] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [373:53] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources.<anonymous>[ValueParameterDescriptorImpl]

'moduleName' @ [374:30] ==> value-parameter moduleName: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[ValueParameterDescriptorImpl]

'let' @ [374:42] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [374:51] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources.<anonymous>[ValueParameterDescriptorImpl]

'File' @ [375:40] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [375:45] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'sourceDirName' @ [375:54] ==> val sourceDirName: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[LocalVariableDescriptor]

'copyTestSources' @ [376:34] ==> public fun copyTestSources(testDataDir: File, sourceDestinationDir: File, filePrefix: String): Map<File, File> defined in org.jetbrains.kotlin.incremental.testingUtils[DeserializedSimpleFunctionDescriptor]

'testDataDir' @ [376:50] ==> protected final lateinit var testDataDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'sourceDestinationDir' @ [376:63] ==> val sourceDestinationDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[LocalVariableDescriptor]

'filePrefix' @ [376:85] ==> val filePrefix: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[LocalVariableDescriptor]

'mapWorkingToOriginalFile' @ [377:13] ==> protected final var mapWorkingToOriginalFile: MutableMap<File, File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'putAll' @ [377:38] ==> public abstract fun putAll(from: Map<out File, File>): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'sourcesMapping' @ [377:45] ==> val sourcesMapping: Map<File, File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[LocalVariableDescriptor]

'preProcessSources' @ [378:13] ==> protected open fun preProcessSources(srcDir: File): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'sourceDestinationDir' @ [378:31] ==> val sourceDestinationDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.prepareModuleSources[LocalVariableDescriptor]

'getInstance' @ [381:33] ==> public open fun getInstance(): (JpsJavaExtensionService..JpsJavaExtensionService?) defined in org.jetbrains.jps.model.java.JpsJavaExtensionService[JavaMethodDescriptor]

'getOrCreateProjectExtension' @ [381:47] ==> @NotNull public abstract fun getOrCreateProjectExtension(@NotNull p0: JpsProject): JpsJavaProjectExtension defined in org.jetbrains.jps.model.java.JpsJavaExtensionService[JavaMethodDescriptor]

'myProject' @ [381:75] ==> @NotNull protected/*protected and package*/ final var myProject: JpsProject defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'outputUrl' @ [381:86] ==> public final var JpsJavaProjectExtension.outputUrl: (String..String?)[MyPropertyDescriptor]

'pathToUrl' @ [381:110] ==> public open fun pathToUrl(p0: (String..String?)): (String..String?) defined in org.jetbrains.jps.util.JpsPathUtil[JavaMethodDescriptor]

'getAbsolutePath' @ [381:120] ==> public open fun getAbsolutePath(p0: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'addJdk' @ [383:19] ==> protected/*protected and package*/ open fun addJdk(p0: (String..String?)): (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'readModuleDependencies' @ [384:34] ==> private final fun readModuleDependencies(): Map<String, List<DependencyDescriptor>>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[SimpleFunctionDescriptorImpl]

'mapWorkingToOriginalFile' @ [385:9] ==> protected final var mapWorkingToOriginalFile: MutableMap<File, File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'hashMapOf' @ [385:36] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<File, File> /* = HashMap<File, File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> File

'if (moduleDependencies == null) {
            addModule("module", arrayOf(getAbsolutePath("src")), null, null, jdk)
            prepareModuleSources(moduleName = null)
            moduleNames = null
        }
        else {
            val nameToModule = moduleDependencies.keys
                    .keysToMap { addModule(it, arrayOf(getAbsolutePath("$it/src")), null, null, jdk)!! }

            for ((moduleName, dependencies) in moduleDependencies) {
                val module = nameToModule[moduleName]!!

                for (dependency in dependencies) {
                    JpsModuleRootModificationUtil.addDependency(module, nameToModule[dependency.name],
                                                                JpsJavaDependencyScope.COMPILE, dependency.exported)
                }
            }

            for (module in nameToModule.values) {
                prepareModuleSources(module.name)
            }

            moduleNames = nameToModule.keys
        }' @ [388:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'moduleDependencies' @ [388:13] ==> val moduleDependencies: Map<String, List<DependencyDescriptor>>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'addModule' @ [389:13] ==> protected/*protected and package*/ open fun <T : (JpsElement..JpsElement?)> addModule(p0: (String..String?), p1: (Array<(String..String?)>..Array<out (String..String?)>?), @Nullable p2: String?, @Nullable p3: String?, p4: (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?)): (JpsModule..JpsModule?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]
Inferred types:
    <T : (JpsElement..JpsElement?)> -> JpsDummyElement

'arrayOf' @ [389:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (String..String?)): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'getAbsolutePath' @ [389:41] ==> public open fun getAbsolutePath(p0: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'jdk' @ [389:78] ==> val jdk: (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'prepareModuleSources' @ [390:13] ==> local final fun prepareModuleSources(moduleName: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[SimpleFunctionDescriptorImpl]

'moduleNames' @ [391:13] ==> val moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'moduleDependencies' @ [394:32] ==> val moduleDependencies: Map<String, List<DependencyDescriptor>>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'keys' @ [394:51] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'keysToMap' @ [395:22] ==> public fun <K, V> Iterable<String>.keysToMap(value: (String) -> JpsModule): Map<String, JpsModule> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JpsModule

'addModule' @ [395:34] ==> protected/*protected and package*/ open fun <T : (JpsElement..JpsElement?)> addModule(p0: (String..String?), p1: (Array<(String..String?)>..Array<out (String..String?)>?), @Nullable p2: String?, @Nullable p3: String?, p4: (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?)): (JpsModule..JpsModule?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]
Inferred types:
    <T : (JpsElement..JpsElement?)> -> JpsDummyElement

'it' @ [395:44] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.<anonymous>[ValueParameterDescriptorImpl]

'arrayOf' @ [395:48] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (String..String?)): Array<(String..String?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (kotlin.String..kotlin.String?)

'getAbsolutePath' @ [395:56] ==> public open fun getAbsolutePath(p0: (String..String?)): (String..String?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaMethodDescriptor]

'it' @ [395:74] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules.<anonymous>[ValueParameterDescriptorImpl]

'jdk' @ [395:97] ==> val jdk: (JpsSdk<(JpsDummyElement..JpsDummyElement?)>..JpsSdk<(JpsDummyElement..JpsDummyElement?)>?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'component1' @ [397:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<DependencyDescriptor>>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<DependencyDescriptor>

'component2' @ [397:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, List<DependencyDescriptor>>.component2(): List<DependencyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> List<DependencyDescriptor>

'moduleDependencies' @ [397:48] ==> val moduleDependencies: Map<String, List<DependencyDescriptor>>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'nameToModule' @ [398:30] ==> val nameToModule: Map<String, JpsModule> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'moduleName' @ [398:43] ==> val moduleName: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'dependencies' @ [400:36] ==> val dependencies: List<DependencyDescriptor> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'addDependency' @ [401:51] ==> public open fun addDependency(p0: (JpsModule..JpsModule?), p1: (JpsModule..JpsModule?), p2: (JpsJavaDependencyScope..JpsJavaDependencyScope?), p3: Boolean): Unit defined in org.jetbrains.jps.model.JpsModuleRootModificationUtil[JavaMethodDescriptor]

'module' @ [401:65] ==> val module: JpsModule defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'nameToModule' @ [401:73] ==> val nameToModule: Map<String, JpsModule> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'dependency' @ [401:86] ==> val dependency: DependencyDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'name' @ [401:97] ==> public final val name: String defined in org.jetbrains.kotlin.jps.build.DependencyDescriptor[PropertyDescriptorImpl]

'COMPILE' @ [402:88] ==> enum entry COMPILE defined in org.jetbrains.jps.model.java.JpsJavaDependencyScope[FakeCallableDescriptorForObject]

'dependency' @ [402:97] ==> val dependency: DependencyDescriptor defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'exported' @ [402:108] ==> public final val exported: Boolean defined in org.jetbrains.kotlin.jps.build.DependencyDescriptor[PropertyDescriptorImpl]

'nameToModule' @ [406:28] ==> val nameToModule: Map<String, JpsModule> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'values' @ [406:41] ==> public abstract val values: Collection<JpsModule> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'prepareModuleSources' @ [407:17] ==> local final fun prepareModuleSources(moduleName: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[SimpleFunctionDescriptorImpl]

'module' @ [407:38] ==> val module: JpsModule defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'name' @ [407:45] ==> public final var JpsModule.name: String[MyPropertyDescriptor]

'moduleNames' @ [410:13] ==> val moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'nameToModule' @ [410:27] ==> val nameToModule: Map<String, JpsModule> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'keys' @ [410:40] ==> public abstract val keys: Set<String> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'addKotlinStdlibDependency' @ [412:40] ==> public/*package*/ open fun addKotlinStdlibDependency(@NotNull project: JpsProject): (JpsLibrary..JpsLibrary?) defined in org.jetbrains.kotlin.jps.build.AbstractKotlinJpsBuildTestCase[JavaMethodDescriptor]

'myProject' @ [412:66] ==> @NotNull protected/*protected and package*/ final var myProject: JpsProject defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'addKotlinTestDependency' @ [413:40] ==> public/*package*/ open fun addKotlinTestDependency(@NotNull project: JpsProject): (JpsLibrary..JpsLibrary?) defined in org.jetbrains.kotlin.jps.build.AbstractKotlinJpsBuildTestCase[JavaMethodDescriptor]

'myProject' @ [413:64] ==> @NotNull protected/*protected and package*/ final var myProject: JpsProject defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[JavaPropertyDescriptor]

'moduleNames' @ [414:16] ==> val moduleNames: Set<String>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.configureModules[LocalVariableDescriptor]

'workDir' @ [421:45] ==> protected final lateinit var workDir: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest[PropertyDescriptorImpl]

'ProjectBuilderLoggerBase' @ [423:52] ==> public constructor ProjectBuilderLoggerBase() defined in org.jetbrains.jps.builders.impl.logging.ProjectBuilderLoggerBase[JavaClassConstructorDescriptor]

'ArrayList' @ [425:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> File

'actions' @ [428:17] ==> value-parameter actions: List<CacheVersion.Action> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.actionsOnCacheVersionChanged[ValueParameterDescriptorImpl]

'size' @ [428:25] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'actions' @ [428:37] ==> value-parameter actions: List<CacheVersion.Action> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.actionsOnCacheVersionChanged[ValueParameterDescriptorImpl]

'any' @ [428:45] ==> public inline fun <T> Iterable<CacheVersion.Action>.any(predicate: (CacheVersion.Action) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Action

'it' @ [428:51] ==> value-parameter it: CacheVersion.Action defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.actionsOnCacheVersionChanged.<anonymous>[ValueParameterDescriptorImpl]

'DO_NOTHING' @ [428:77] ==> enum entry DO_NOTHING defined in org.jetbrains.kotlin.incremental.CacheVersion.Action[FakeCallableDescriptorForObject]

'logLine' @ [429:17] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'actions' @ [429:56] ==> value-parameter actions: List<CacheVersion.Action> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.actionsOnCacheVersionChanged[ValueParameterDescriptorImpl]

'dirtyFiles' @ [434:13] ==> private final val dirtyFiles: ArrayList<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'addAll' @ [434:24] ==> public fun <T> MutableCollection<in File>.addAll(elements: Iterable<File>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'files' @ [434:31] ==> value-parameter files: Iterable<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.markedAsDirty[ValueParameterDescriptorImpl]

'!' @ [438:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'chunk' @ [438:18] ==> value-parameter chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted[ValueParameterDescriptorImpl]

'isDummy' @ [438:24] ==> public fun ModuleChunk.isDummy(context: CompileContext): Boolean defined in org.jetbrains.kotlin.jps.build[DeserializedSimpleFunctionDescriptor]

'context' @ [438:32] ==> value-parameter context: CompileContext defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted[ValueParameterDescriptorImpl]

'context' @ [438:44] ==> value-parameter context: CompileContext defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted[ValueParameterDescriptorImpl]

'projectDescriptor' @ [438:52] ==> public final val CompileContext.projectDescriptor: (ProjectDescriptor..ProjectDescriptor?)[MyPropertyDescriptor]

'project' @ [438:70] ==> public final val ProjectDescriptor.project: (JpsProject..JpsProject?)[MyPropertyDescriptor]

'modules' @ [438:78] ==> public final val JpsProject.modules: (MutableList<(JpsModule..JpsModule?)>..List<(JpsModule..JpsModule?)>)[MyPropertyDescriptor]

'size' @ [438:86] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'logLine' @ [439:17] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'chunk' @ [439:37] ==> value-parameter chunk: ModuleChunk defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted[ValueParameterDescriptorImpl]

'modules' @ [439:43] ==> public final val ModuleChunk.modules: (MutableSet<(JpsModule..JpsModule?)>..Set<(JpsModule..JpsModule?)>?)[MyPropertyDescriptor]

'sortedBy' @ [439:51] ==> public inline fun <T, R : Comparable<String>> Iterable<(JpsModule..JpsModule?)>.sortedBy(crossinline selector: ((JpsModule..JpsModule?)) -> String?): List<(JpsModule..JpsModule?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.model.module.JpsModule..org.jetbrains.jps.model.module.JpsModule?)
    <R : Comparable<R>> -> String

'it' @ [439:62] ==> value-parameter it: (JpsModule..JpsModule?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [439:65] ==> public final var JpsModule.name: String[MyPropertyDescriptor]

'joinToString' @ [439:72] ==> public fun <T> Iterable<(JpsModule..JpsModule?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((JpsModule..JpsModule?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.jps.model.module.JpsModule..org.jetbrains.jps.model.module.JpsModule?)

'it' @ [439:87] ==> value-parameter it: (JpsModule..JpsModule?) defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildStarted.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [439:90] ==> public final var JpsModule.name: String[MyPropertyDescriptor]

'dirtyFiles' @ [445:17] ==> private final val dirtyFiles: ArrayList<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'isNotEmpty' @ [445:28] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'logLine' @ [446:17] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'dirtyFiles' @ [447:17] ==> private final val dirtyFiles: ArrayList<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'map' @ [448:26] ==> public inline fun <T, R> Iterable<File>.map(transform: (File) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> String

'toSystemIndependentName' @ [448:41] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'it' @ [448:65] ==> value-parameter it: File defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildFinished.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [448:68] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'sorted' @ [449:26] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'forEach' @ [450:26] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'logLine' @ [450:36] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'it' @ [450:44] ==> value-parameter it: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildFinished.<anonymous>[ValueParameterDescriptorImpl]

'dirtyFiles' @ [451:17] ==> private final val dirtyFiles: ArrayList<File> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'clear' @ [451:28] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'logLine' @ [453:13] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'exitCode' @ [453:34] ==> value-parameter exitCode: ModuleLevelBuilder.ExitCode defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.buildFinished[ValueParameterDescriptorImpl]

'logLine' @ [454:13] ==> protected open fun logLine(message: String?): Unit defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[SimpleFunctionDescriptorImpl]

'StringBuilder' @ [457:30] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'logBuf' @ [459:21] ==> private final val logBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'toString' @ [459:28] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'hashSetOf' @ [461:29] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<File> /* = HashSet<File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'super' @ [466:13] ==> <this> defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[LazyClassReceiverParameterDescriptor]

'logCompiledFiles' @ [466:19] ==> public open fun logCompiledFiles(p0: (MutableCollection<(File..File?)>..Collection<(File..File?)>?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.jps.builders.impl.logging.ProjectBuilderLoggerBase[JavaMethodDescriptor]

'files' @ [466:36] ==> value-parameter files: MutableCollection<File>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logCompiledFiles[ValueParameterDescriptorImpl]

'builderName' @ [466:43] ==> value-parameter builderName: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logCompiledFiles[ValueParameterDescriptorImpl]

'description' @ [466:56] ==> value-parameter description: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logCompiledFiles[ValueParameterDescriptorImpl]

'builderName' @ [468:17] ==> value-parameter builderName: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logCompiledFiles[ValueParameterDescriptorImpl]

'KotlinBuilder' @ [468:32] ==> public companion object defined in org.jetbrains.kotlin.jps.build.KotlinBuilder[FakeCallableDescriptorForObject]

'KOTLIN_BUILDER_NAME' @ [468:46] ==> @field:JvmField public final val KOTLIN_BUILDER_NAME: String defined in org.jetbrains.kotlin.jps.build.KotlinBuilder.Companion[DeserializedPropertyDescriptor]

'compiledFiles' @ [469:17] ==> public final val compiledFiles: HashSet<File> /* = HashSet<File> */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'addAll' @ [469:31] ==> public open fun addAll(elements: Collection<File>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'files' @ [469:38] ==> value-parameter files: MutableCollection<File>? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logCompiledFiles[ValueParameterDescriptorImpl]

'logBuf' @ [474:13] ==> private final val logBuf: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'append' @ [474:20] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'replaceHashWithStar' @ [474:43] ==> @NotNull public open fun replaceHashWithStar(@NotNull p0: String): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'message' @ [474:63] ==> value-parameter message: String? defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger.logLine[ValueParameterDescriptorImpl]

'replace' @ [474:73] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'rootPath' @ [474:84] ==> public final val rootPath: String defined in org.jetbrains.kotlin.jps.build.AbstractIncrementalJpsTest.MyLogger[PropertyDescriptorImpl]

'toRegex' @ [474:95] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [474:114] ==> public open fun append(p0: Char): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'buildTargetIndex' @ [480:13] ==> public final val ProjectDescriptor.buildTargetIndex: (BuildTargetIndex..BuildTargetIndex?)[MyPropertyDescriptor]

'allTargets' @ [480:30] ==> public final val BuildTargetIndex.allTargets: (MutableList<(BuildTarget<*>..BuildTarget<*>?)>..List<(BuildTarget<*>..BuildTarget<*>?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [480:41] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ModuleBuildTarget> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ModuleBuildTarget

'DependencyDescriptor' @ [485:9] ==> public constructor DependencyDescriptor(name: String, exported: Boolean) defined in org.jetbrains.kotlin.jps.build.DependencyDescriptor[ClassConstructorDescriptorImpl]

'dependency' @ [485:30] ==> value-parameter dependency: String defined in org.jetbrains.kotlin.jps.build.parseDependency[ValueParameterDescriptorImpl]

'removeSuffix' @ [485:41] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'EXPORTED_SUFFIX' @ [485:54] ==> private val EXPORTED_SUFFIX: String defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

'dependency' @ [485:72] ==> value-parameter dependency: String defined in org.jetbrains.kotlin.jps.build.parseDependency[ValueParameterDescriptorImpl]

'endsWith' @ [485:83] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'EXPORTED_SUFFIX' @ [485:92] ==> private val EXPORTED_SUFFIX: String defined in org.jetbrains.kotlin.jps.build in file AbstractIncrementalJpsTest.kt[PropertyDescriptorImpl]

