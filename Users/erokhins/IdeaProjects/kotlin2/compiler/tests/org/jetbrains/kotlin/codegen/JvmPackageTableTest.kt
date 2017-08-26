'KtUsefulTestCase' @ [28:29] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'+' @ [30:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [30:41] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'relativeDirectory' @ [30:65] ==> value-parameter relativeDirectory: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[ValueParameterDescriptorImpl]

'tmpDir' @ [31:38] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [31:45] ==> <this> defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest[LazyClassReceiverParameterDescriptor]

'simpleName' @ [31:57] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'component1' @ [34:14] ==> public final operator fun component1(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [34:22] ==> public final operator fun component2(): (ExitCode..ExitCode?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'executeCompilerGrabOutput' @ [34:50] ==> @NotNull public open fun executeCompilerGrabOutput(@NotNull compiler: CLITool<*>, @NotNull args: (MutableList<(String..String?)>..List<(String..String?)>)): Pair<(String..String?), (ExitCode..ExitCode?)> defined in org.jetbrains.kotlin.cli.AbstractCliTest[JavaMethodDescriptor]

'K2JVMCompiler' @ [34:76] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'listOf' @ [34:93] ==> public fun <T> listOf(vararg elements: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'directory' @ [35:17] ==> val directory: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'tmpdir' @ [36:23] ==> val tmpdir: File defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'path' @ [36:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'moduleName' @ [37:33] ==> val moduleName: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'err' @ [39:16] ==> public final val err: (PrintStream..PrintStream?) defined in java.lang.System[JavaPropertyDescriptor]

'println' @ [39:20] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintStream[JavaMethodDescriptor]

'output' @ [39:28] ==> val output: (String..String?) defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'assertEquals' @ [40:9] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'OK' @ [40:75] ==> enum entry OK defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exitCode' @ [40:79] ==> val exitCode: (ExitCode..ExitCode?) defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'ModuleMapping' @ [42:23] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'create' @ [42:37] ==> public final fun create(bytes: ByteArray?, debugName: String, configuration: DeserializationConfiguration): ModuleMapping defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedSimpleFunctionDescriptor]

'File' @ [43:17] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [43:22] ==> val tmpdir: File defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'moduleName' @ [43:41] ==> val moduleName: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'ModuleMapping' @ [43:54] ==> public companion object defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[FakeCallableDescriptorForObject]

'MAPPING_FILE_EXT' @ [43:68] ==> @field:JvmField public final val MAPPING_FILE_EXT: String defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping.Companion[DeserializedPropertyDescriptor]

'readBytes' @ [43:88] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'Default' @ [44:46] ==> public object Default : DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[FakeCallableDescriptorForObject]

'buildString' @ [46:22] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [47:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, PackageParts>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'component2' @ [47:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, PackageParts>.component2(): PackageParts defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> PackageParts

'mapping' @ [47:44] ==> val mapping: ModuleMapping defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'packageFqName2Parts' @ [47:52] ==> public final val packageFqName2Parts: Map<String, PackageParts> defined in org.jetbrains.kotlin.load.kotlin.ModuleMapping[DeserializedPropertyDescriptor]

'appendln' @ [48:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqName' @ [48:26] ==> val fqName: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'packageParts' @ [49:30] ==> val packageParts: PackageParts defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'parts' @ [49:43] ==> public final val parts: Set<String> defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedPropertyDescriptor]

'append' @ [50:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [51:21] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'part' @ [51:28] ==> val part: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'packageParts' @ [52:38] ==> val packageParts: PackageParts defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'getMultifileFacadeName' @ [52:51] ==> public final fun getMultifileFacadeName(partShortName: String): String? defined in org.jetbrains.kotlin.load.kotlin.PackageParts[DeserializedSimpleFunctionDescriptor]

'part' @ [52:74] ==> val part: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'facadeName' @ [53:25] ==> val facadeName: String? defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'append' @ [54:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'append' @ [55:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'facadeName' @ [55:32] ==> val facadeName: String? defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest.<anonymous>[LocalVariableDescriptor]

'append' @ [56:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'appendln' @ [58:21] ==> public fun StringBuilder /* = StringBuilder */.appendln(): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertEqualsToFile' @ [63:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [63:44] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'directory' @ [63:49] ==> val directory: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'result' @ [63:86] ==> val result: String defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest.doTest[LocalVariableDescriptor]

'doTest' @ [67:9] ==> private final fun doTest(relativeDirectory: String): Unit defined in org.jetbrains.kotlin.codegen.JvmPackageTableTest[SimpleFunctionDescriptorImpl]

