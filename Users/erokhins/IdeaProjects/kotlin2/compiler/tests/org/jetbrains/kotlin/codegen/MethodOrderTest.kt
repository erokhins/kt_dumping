'CodegenTestCase' @ [27:24] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'doTest' @ [29:9] ==> private final fun doTest(sourceText: String, classSuffix: String, expectedOrder: List<String>): Unit defined in org.jetbrains.kotlin.codegen.MethodOrderTest[SimpleFunctionDescriptorImpl]

'listOf' @ [47:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'doTest' @ [52:9] ==> private final fun doTest(sourceText: String, classSuffix: String, expectedOrder: List<String>): Unit defined in org.jetbrains.kotlin.codegen.MethodOrderTest[SimpleFunctionDescriptorImpl]

'listOf' @ [61:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'doTest' @ [66:9] ==> private final fun doTest(sourceText: String, classSuffix: String, expectedOrder: List<String>): Unit defined in org.jetbrains.kotlin.codegen.MethodOrderTest[SimpleFunctionDescriptorImpl]

'listOf' @ [79:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'doTest' @ [84:9] ==> private final fun doTest(sourceText: String, classSuffix: String, expectedOrder: List<String>): Unit defined in org.jetbrains.kotlin.codegen.MethodOrderTest[SimpleFunctionDescriptorImpl]

'listOf' @ [99:17] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [111:9] ==> protected/*protected and package*/ final fun createEnvironmentWithMockJdkAndIdeaAnnotations(@NotNull p0: ConfigurationKind, @Nullable vararg p1: (File..File?)): Unit defined in org.jetbrains.kotlin.codegen.MethodOrderTest[JavaMethodDescriptor]

'JDK_ONLY' @ [111:74] ==> enum entry JDK_ONLY defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'myFiles' @ [112:9] ==> protected/*protected and package*/ final var myFiles: (CodegenTestFiles..CodegenTestFiles?) defined in org.jetbrains.kotlin.codegen.MethodOrderTest[JavaPropertyDescriptor]

'create' @ [112:36] ==> @NotNull public open fun create(@NotNull p0: String, @NotNull p1: String, @NotNull p2: Project): CodegenTestFiles defined in org.jetbrains.kotlin.codegen.CodegenTestFiles[JavaMethodDescriptor]

'sourceText' @ [112:54] ==> value-parameter sourceText: String defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[ValueParameterDescriptorImpl]

'myEnvironment' @ [112:66] ==> protected/*protected and package*/ final var myEnvironment: (KotlinCoreEnvironment..KotlinCoreEnvironment?) defined in org.jetbrains.kotlin.codegen.MethodOrderTest[JavaPropertyDescriptor]

'project' @ [112:82] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'generateClassesInFile' @ [114:34] ==> @NotNull protected/*protected and package*/ open fun generateClassesInFile(): ClassFileFactory defined in org.jetbrains.kotlin.codegen.MethodOrderTest[JavaMethodDescriptor]

'asList' @ [114:58] ==> @NotNull public open fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'first' @ [114:67] ==> public inline fun <T> Iterable<OutputFile>.first(predicate: (OutputFile) -> Boolean): OutputFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'it' @ [114:75] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [114:78] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'endsWith' @ [114:91] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classSuffix' @ [114:102] ==> value-parameter classSuffix: String defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[ValueParameterDescriptorImpl]

'ClassReader' @ [115:27] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'classFileForObject' @ [115:39] ==> val classFileForObject: OutputFile defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[LocalVariableDescriptor]

'asByteArray' @ [115:58] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [117:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'classReader' @ [119:9] ==> val classReader: ClassReader defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[LocalVariableDescriptor]

'accept' @ [119:21] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'ClassVisitor' @ [119:37] ==> public constructor ClassVisitor(p0: Int) defined in org.jetbrains.org.objectweb.asm.ClassVisitor[JavaClassConstructorDescriptor]

'ASM4' @ [119:58] ==> public const final val ASM4: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'methodNames' @ [121:17] ==> val methodNames: ArrayList<String> defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[LocalVariableDescriptor]

'add' @ [121:29] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [121:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'desc' @ [121:40] ==> value-parameter desc: String defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest.<no name provided>.visitMethod[ValueParameterDescriptorImpl]

'and' @ [124:12] ==> public final infix fun and(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'SKIP_CODE' @ [124:24] ==> public const final val SKIP_CODE: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_DEBUG' @ [124:50] ==> public const final val SKIP_DEBUG: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'SKIP_FRAMES' @ [124:77] ==> public const final val SKIP_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'assertEquals' @ [126:18] ==> public open fun assertEquals(p0: (Any..Any?), p1: (Any..Any?)): Unit defined in junit.framework.TestCase[JavaMethodDescriptor]

'expectedOrder' @ [126:31] ==> value-parameter expectedOrder: List<String> defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[ValueParameterDescriptorImpl]

'methodNames' @ [126:46] ==> val methodNames: ArrayList<String> defined in org.jetbrains.kotlin.codegen.MethodOrderTest.doTest[LocalVariableDescriptor]

