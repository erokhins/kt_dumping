'CodegenTestCase' @ [33:40] ==> public constructor CodegenTestCase() defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaClassConstructorDescriptor]

'File' @ [36:26] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'File' @ [36:31] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_DIR' @ [36:36] ==> public final val BASE_DIR: String defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.Companion[PropertyDescriptorImpl]

'parentFile' @ [36:46] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'super' @ [40:9] ==> <this> defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[LazyClassReceiverParameterDescriptor]

'doTest' @ [40:15] ==> protected/*protected and package*/ open fun doTest(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.codegen.CodegenTestCase[JavaMethodDescriptor]

'File' @ [40:22] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'BASE_DIR' @ [40:27] ==> public final val BASE_DIR: String defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.Companion[PropertyDescriptorImpl]

'filePath' @ [40:37] ==> value-parameter filePath: String defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doTest[ValueParameterDescriptorImpl]

'absolutePath' @ [40:55] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'URLClassLoader' @ [44:25] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [44:40] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'this' @ [44:51] ==> <this> defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[LazyClassReceiverParameterDescriptor]

'java' @ [44:63] ==> public val <T> KClass<out AbstractParcelBoxTest>.java: Class<out AbstractParcelBoxTest> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out AbstractParcelBoxTest)

'classLoader' @ [44:68] ==> public final val <T : (Any..Any?)> Class<out AbstractParcelBoxTest>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out AbstractParcelBoxTest)

'classFileFactory' @ [46:35] ==> protected/*protected and package*/ final var classFileFactory: (ClassFileFactory..ClassFileFactory?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[JavaPropertyDescriptor]

'getClassFiles' @ [46:52] ==> public fun ClassFileFactory.getClassFiles(): Iterable<OutputFile> defined in org.jetbrains.kotlin.codegen[DeserializedSimpleFunctionDescriptor]

'sortedBy' @ [46:68] ==> public inline fun <T, R : Comparable<String>> Iterable<OutputFile>.sortedBy(crossinline selector: (OutputFile) -> String?): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile
    <R : Comparable<R>> -> String

'it' @ [46:79] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [46:82] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'classFile' @ [47:33] ==> val classFile: OutputFile defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'asByteArray' @ [47:43] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'ClassNode' @ [48:37] ==> public constructor ClassNode() defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaClassConstructorDescriptor]

'also' @ [48:49] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassNode.also(block: (ClassNode) -> Unit): ClassNode defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassNode

'ClassReader' @ [48:56] ==> public constructor ClassReader(p0: (ByteArray..ByteArray?)) defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaClassConstructorDescriptor]

'bytes' @ [48:68] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'accept' @ [48:75] ==> public open fun accept(p0: (ClassVisitor..ClassVisitor?), p1: Int): Unit defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaMethodDescriptor]

'it' @ [48:82] ==> value-parameter it: ClassNode defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>.<anonymous>[ValueParameterDescriptorImpl]

'EXPAND_FRAMES' @ [48:98] ==> public const final val EXPAND_FRAMES: Int defined in org.jetbrains.org.objectweb.asm.ClassReader[JavaPropertyDescriptor]

'name' @ [48:115] ==> public final var name: (String..String?) defined in org.jetbrains.org.objectweb.asm.tree.ClassNode[JavaPropertyDescriptor]

'defineClass' @ [50:25] ==> protected/*protected and package*/ final fun defineClass(p0: (String..String?), p1: (ByteBuffer..ByteBuffer?), p2: (ProtectionDomain..ProtectionDomain?)): (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>[JavaMethodDescriptor]

'className' @ [50:37] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'replace' @ [50:47] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'wrap' @ [50:77] ==> public open fun wrap(p0: (ByteArray..ByteArray?)): (ByteBuffer..ByteBuffer?) defined in java.nio.ByteBuffer[JavaMethodDescriptor]

'bytes' @ [50:82] ==> val bytes: ByteArray defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'RuntimeException' @ [52:31] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'className' @ [52:67] ==> val className: (String..String?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'e' @ [52:79] ==> val e: Throwable defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.getClassLoaderWithGeneratedFiles.<no name provided>.<init>[LocalVariableDescriptor]

'compile' @ [64:9] ==> protected/*protected and package*/ open fun compile(@NotNull p0: (MutableList<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>..List<(CodegenTestCase.TestFile..CodegenTestCase.TestFile?)>), @Nullable p1: File?): Unit defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[JavaMethodDescriptor]

'files' @ [64:17] ==> value-parameter files: List<CodegenTestCase.TestFile> defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doMultiFileTest[ValueParameterDescriptorImpl]

'TestFile' @ [64:25] ==> public constructor TestFile(@NotNull p0: String, @NotNull p1: String) defined in org.jetbrains.kotlin.codegen.CodegenTestCase.TestFile[JavaClassConstructorDescriptor]

'LIBRARY_KT' @ [64:34] ==> public final val LIBRARY_KT: File defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.Companion[PropertyDescriptorImpl]

'name' @ [64:45] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'LIBRARY_KT' @ [64:51] ==> public final val LIBRARY_KT: File defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.Companion[PropertyDescriptorImpl]

'readText' @ [64:62] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'javaFilesDir' @ [64:75] ==> value-parameter javaFilesDir: File? defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doMultiFileTest[ValueParameterDescriptorImpl]

'forName' @ [66:31] ==> @CallerSensitive public open fun forName(p0: (String..String?), p1: Boolean, p2: (ClassLoader..ClassLoader?)): (Class<*>..Class<*>?) defined in java.lang.Class[JavaMethodDescriptor]

'getClassLoaderWithGeneratedFiles' @ [66:61] ==> protected open fun getClassLoaderWithGeneratedFiles(): ClassLoader defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[SimpleFunctionDescriptorImpl]

'testClass' @ [68:13] ==> val testClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doMultiFileTest[LocalVariableDescriptor]

'getDeclaredMethod' @ [68:23] ==> @CallerSensitive public open fun getDeclaredMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'invoke' @ [68:48] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'testClass' @ [68:55] ==> val testClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doMultiFileTest[LocalVariableDescriptor]

'AssertionError' @ [70:19] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'classFileFactory' @ [70:34] ==> protected/*protected and package*/ final var classFileFactory: (ClassFileFactory..ClassFileFactory?) defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest[JavaPropertyDescriptor]

'createText' @ [70:51] ==> @NotNull public open fun createText(): String defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'e' @ [70:65] ==> val e: Throwable defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.doMultiFileTest[LocalVariableDescriptor]

'AndroidComponentRegistrar' @ [75:9] ==> public companion object defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar[FakeCallableDescriptorForObject]

'registerParcelExtensions' @ [75:35] ==> public final fun registerParcelExtensions(project: Project): Unit defined in org.jetbrains.kotlin.android.synthetic.AndroidComponentRegistrar.Companion[DeserializedSimpleFunctionDescriptor]

'environment' @ [75:60] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.setupEnvironment[ValueParameterDescriptorImpl]

'project' @ [75:72] ==> public final val project: Project defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedPropertyDescriptor]

'addAndroidExtensionsRuntimeLibrary' @ [76:9] ==> public fun addAndroidExtensionsRuntimeLibrary(environment: KotlinCoreEnvironment): Unit defined in org.jetbrains.kotlin.android.synthetic.test in file CompilerTestUtils.kt[SimpleFunctionDescriptorImpl]

'environment' @ [76:44] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.setupEnvironment[ValueParameterDescriptorImpl]

'environment' @ [77:9] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.android.parcel.AbstractParcelBoxTest.setupEnvironment[ValueParameterDescriptorImpl]

'updateClasspath' @ [77:21] ==> public final fun updateClasspath(contentRoots: List<ContentRoot>): List<File>? defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[DeserializedSimpleFunctionDescriptor]

'listOf' @ [77:37] ==> public fun <T> listOf(element: JvmClasspathRoot): List<JvmClasspathRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JvmClasspathRoot

'JvmClasspathRoot' @ [77:44] ==> public constructor JvmClasspathRoot(file: File) defined in org.jetbrains.kotlin.cli.jvm.config.JvmClasspathRoot[DeserializedClassConstructorDescriptor]

'File' @ [77:61] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

