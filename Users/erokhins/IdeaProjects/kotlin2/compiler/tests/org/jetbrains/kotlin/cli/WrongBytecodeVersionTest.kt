'KtUsefulTestCase' @ [30:34] ==> public constructor KtUsefulTestCase() defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaClassConstructorDescriptor]

'JvmBytecodeBinaryVersion' @ [31:39] ==> public constructor JvmBytecodeBinaryVersion(vararg numbers: Int) defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[DeserializedClassConstructorDescriptor]

'toArray' @ [31:74] ==> public final fun toArray(): IntArray defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[DeserializedSimpleFunctionDescriptor]

'incompatibleVersion' @ [33:71] ==> private final val incompatibleVersion: IntArray defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest[PropertyDescriptorImpl]

'+' @ [34:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [34:41] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'relativeDirectory' @ [34:65] ==> value-parameter relativeDirectory: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[ValueParameterDescriptorImpl]

'File' @ [35:29] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'directory' @ [35:34] ==> val directory: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'File' @ [36:27] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'directory' @ [36:32] ==> val directory: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'tmpDir' @ [38:38] ==> @NotNull public open fun tmpDir(p0: (String..String?)): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'this' @ [38:45] ==> <this> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest[LazyClassReceiverParameterDescriptor]

'java' @ [38:57] ==> public val <T> KClass<out WrongBytecodeVersionTest>.java: Class<out WrongBytecodeVersionTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out WrongBytecodeVersionTest)

'simpleName' @ [38:62] ==> public final val <T : (Any..Any?)> Class<out WrongBytecodeVersionTest>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out WrongBytecodeVersionTest)

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [40:43] ==> @NotNull public open fun createEnvironmentWithMockJdkAndIdeaAnnotations(p0: (Disposable..Disposable?)): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testRootDisposable' @ [40:90] ==> public final val WrongBytecodeVersionTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'compileKotlinToDirAndGetModule' @ [41:28] ==> @NotNull public open fun compileKotlinToDirAndGetModule(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: File, @NotNull p2: KotlinCoreEnvironment): ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'listOf' @ [41:59] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'librarySource' @ [41:66] ==> val librarySource: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'tmpdir' @ [41:82] ==> val tmpdir: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'environment' @ [41:90] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'File' @ [43:27] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'tmpdir' @ [43:32] ==> val tmpdir: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'listFiles' @ [43:51] ==> public final fun listFiles(p0: (((File..File?)) -> Boolean..(((File..File?)) -> Boolean)?)): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[MyFunctionDescriptor]

'file' @ [43:71] ==> value-parameter file: (File..File?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [43:76] ==> public val File.extension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'INSTANCE' @ [43:107] ==> public final val INSTANCE: (JavaClassFileType..JavaClassFileType?) defined in com.intellij.ide.highlighter.JavaClassFileType[JavaPropertyDescriptor]

'defaultExtension' @ [43:116] ==> public final val JavaClassFileType.defaultExtension: String[MyPropertyDescriptor]

'classFile' @ [44:13] ==> val classFile: (File..File?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'writeBytes' @ [44:23] ==> public fun File.writeBytes(array: ByteArray): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'transformMetadataInClassFile' @ [44:34] ==> public final fun transformMetadataInClassFile(bytes: ByteArray, transform: (fieldName: String, value: Any?) -> Any?): ByteArray defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion[SimpleFunctionDescriptorImpl]

'classFile' @ [44:63] ==> val classFile: (File..File?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'readBytes' @ [44:73] ==> public fun File.readBytes(): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'if (name == JvmAnnotationNames.BYTECODE_VERSION_FIELD_NAME) version else null' @ [45:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntArray?, elseBranch: IntArray?): IntArray?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntArray?

'name' @ [45:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'BYTECODE_VERSION_FIELD_NAME' @ [45:48] ==> public const final val BYTECODE_VERSION_FIELD_NAME: String defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'version' @ [45:77] ==> value-parameter version: IntArray = ... defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[ValueParameterDescriptorImpl]

'component1' @ [49:14] ==> public final operator fun component1(): (String..String?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [49:22] ==> public final operator fun component2(): (ExitCode..ExitCode?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'executeCompilerGrabOutput' @ [49:50] ==> @NotNull public open fun executeCompilerGrabOutput(@NotNull compiler: CLITool<*>, @NotNull args: (MutableList<(String..String?)>..List<(String..String?)>)): Pair<(String..String?), (ExitCode..ExitCode?)> defined in org.jetbrains.kotlin.cli.AbstractCliTest[JavaMethodDescriptor]

'K2JVMCompiler' @ [49:76] ==> public constructor K2JVMCompiler() defined in org.jetbrains.kotlin.cli.jvm.K2JVMCompiler[DeserializedClassConstructorDescriptor]

'listOf' @ [49:93] ==> public fun <T> listOf(vararg elements: (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'usageSource' @ [50:17] ==> val usageSource: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'path' @ [50:29] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [51:31] ==> val tmpdir: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'path' @ [51:38] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'tmpdir' @ [52:23] ==> val tmpdir: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'path' @ [52:30] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'assertEquals' @ [55:9] ==> public open fun assertEquals(p0: (String..String?), p1: (Any..Any?), p2: (Any..Any?)): Unit defined in org.jetbrains.kotlin.test.testFramework.KtUsefulTestCase[JavaMethodDescriptor]

'COMPILATION_ERROR' @ [55:61] ==> enum entry COMPILATION_ERROR defined in org.jetbrains.kotlin.cli.common.ExitCode[FakeCallableDescriptorForObject]

'exitCode' @ [55:80] ==> val exitCode: (ExitCode..ExitCode?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'getNormalizedCompilerOutput' @ [57:42] ==> @NotNull public open fun getNormalizedCompilerOutput(@NotNull pureOutput: String, @NotNull exitCode: ExitCode, @NotNull testDataDir: String): String defined in org.jetbrains.kotlin.cli.AbstractCliTest[JavaMethodDescriptor]

'output' @ [57:70] ==> val output: (String..String?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'exitCode' @ [57:78] ==> val exitCode: (ExitCode..ExitCode?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'tmpdir' @ [57:88] ==> val tmpdir: File defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'path' @ [57:95] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'replace' @ [58:18] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JvmBytecodeBinaryVersion' @ [58:49] ==> public companion object defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion[FakeCallableDescriptorForObject]

'INSTANCE' @ [58:74] ==> @field:JvmField public final val INSTANCE: JvmBytecodeBinaryVersion defined in org.jetbrains.kotlin.load.java.JvmBytecodeBinaryVersion.Companion[DeserializedPropertyDescriptor]

'assertEqualsToFile' @ [60:25] ==> public open fun assertEqualsToFile(@NotNull p0: File, @NotNull p1: String): Unit defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'File' @ [60:44] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'directory' @ [60:49] ==> val directory: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'normalized' @ [60:75] ==> val normalized: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.doTest[LocalVariableDescriptor]

'doTest' @ [64:9] ==> private final fun doTest(relativeDirectory: String, version: IntArray = ...): Unit defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest[SimpleFunctionDescriptorImpl]

'ClassWriter' @ [69:26] ==> public constructor ClassWriter(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaClassConstructorDescriptor]

'ClassReader' @ [70:13] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [70:25] ==> value-parameter bytes: ByteArray defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile[ValueParameterDescriptorImpl]

'accept' @ [70:32] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [70:48] ==> public constructor ClassVisitor(p0: Int, p1: (ClassVisitor..ClassVisitor?)) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [70:69] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'writer' @ [70:75] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile[LocalVariableDescriptor]

'super' @ [72:40] ==> <this> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitAnnotation' @ [72:46] ==> public open fun visitAnnotation(p0: (String..String?), p1: Boolean): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaMethodDescriptor]

'desc' @ [72:62] ==> value-parameter desc: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'visible' @ [72:68] ==> value-parameter visible: Boolean defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'desc' @ [73:25] ==> value-parameter desc: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation[ValueParameterDescriptorImpl]

'METADATA_DESC' @ [73:52] ==> public const final val METADATA_DESC: (String..String?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'AnnotationVisitor' @ [74:41] ==> public constructor AnnotationVisitor(p0: Int, p1: (AnnotationVisitor..AnnotationVisitor?)) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [74:67] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'superVisitor' @ [74:73] ==> val superVisitor: (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'super' @ [76:33] ==> <this> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [76:39] ==> public open fun visit(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'name' @ [76:45] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'invoke' @ [76:51] ==> public abstract operator fun invoke(fieldName: @ParameterName String, value: @ParameterName Any?): Any? defined in kotlin.Function2[FunctionInvokeDescriptor]

'name' @ [76:61] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'value' @ [76:67] ==> value-parameter value: Any defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'value' @ [76:77] ==> value-parameter value: Any defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visit[ValueParameterDescriptorImpl]

'arrayListOf' @ [80:47] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'super' @ [81:54] ==> <this> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitArray' @ [81:60] ==> public open fun visitArray(p0: (String..String?)): (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'name' @ [81:71] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray[ValueParameterDescriptorImpl]

'AnnotationVisitor' @ [82:49] ==> public constructor AnnotationVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaClassConstructorDescriptor]

'ASM5' @ [82:75] ==> public const final val ASM5: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'entries' @ [84:41] ==> val entries: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray[LocalVariableDescriptor]

'add' @ [84:49] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'value' @ [84:53] ==> value-parameter value: Any defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray.<no name provided>.visit[ValueParameterDescriptorImpl]

'Suppress' @ [88:41] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'invoke' @ [89:54] ==> public abstract operator fun invoke(fieldName: @ParameterName String, value: @ParameterName Any?): Any? defined in kotlin.Function2[FunctionInvokeDescriptor]

'name' @ [89:64] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray[ValueParameterDescriptorImpl]

'entries' @ [89:70] ==> val entries: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray[LocalVariableDescriptor]

'toTypedArray' @ [89:78] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'entries' @ [89:115] ==> val entries: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray[LocalVariableDescriptor]

'toTypedArray' @ [89:123] ==> public inline fun <reified T> Collection<String>.toTypedArray(): Array<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> String

'result' @ [90:45] ==> val result: Array<String> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray.<no name provided>.visitEnd[LocalVariableDescriptor]

'isEmpty' @ [90:52] ==> @InlineOnly public inline fun <T> Array<out String>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'with' @ [91:41] ==> @InlineOnly public inline fun <T, R> with(receiver: (AnnotationVisitor..AnnotationVisitor?), block: (AnnotationVisitor..AnnotationVisitor?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.org.objectweb.asm.AnnotationVisitor..org.jetbrains.org.objectweb.asm.AnnotationVisitor?)
    <R> -> Unit

'invoke' @ [91:46] ==> public abstract operator fun invoke(): (AnnotationVisitor..AnnotationVisitor?) defined in kotlin.Function0[FunctionInvokeDescriptor]

'result' @ [92:59] ==> val result: Array<String> defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray.<no name provided>.visitEnd[LocalVariableDescriptor]

'visit' @ [93:49] ==> public open fun visit(p0: (String..String?), p1: (Any..Any?)): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'value' @ [93:61] ==> val value: String defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation.<no name provided>.visitArray.<no name provided>.visitEnd.<anonymous>[LocalVariableDescriptor]

'visitEnd' @ [95:45] ==> public open fun visitEnd(): Unit defined in org.jetbrains.org.objectweb.asm.AnnotationVisitor[JavaMethodDescriptor]

'superVisitor' @ [102:28] ==> val superVisitor: (AnnotationVisitor..AnnotationVisitor?) defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile.<no name provided>.visitAnnotation[LocalVariableDescriptor]

'writer' @ [105:20] ==> val writer: ClassWriter defined in org.jetbrains.kotlin.cli.WrongBytecodeVersionTest.Companion.transformMetadataInClassFile[LocalVariableDescriptor]

'toByteArray' @ [105:27] ==> public open fun toByteArray(): (ByteArray..ByteArray?) defined in org.jetbrains.org.objectweb.asm.ClassWriter[JavaMethodDescriptor]

