'Test' @ [26:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [27:9] ==> private final fun doTest(file: File): Unit defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest[SimpleFunctionDescriptorImpl]

'runtimeJarForTests' @ [27:38] ==> @NotNull public open fun runtimeJarForTests(): File defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'Test' @ [30:5] ==> public constructor Test(expected: KClass<out (Throwable..Throwable?)> = ..., timeout: Long = ...) defined in org.junit.Test[JavaClassConstructorDescriptor]

'doTest' @ [31:9] ==> private final fun doTest(file: File): Unit defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest[SimpleFunctionDescriptorImpl]

'reflectJarForTests' @ [31:38] ==> @NotNull public open fun reflectJarForTests(): File defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'ZipInputStream' @ [35:19] ==> public constructor ZipInputStream(p0: (InputStream..InputStream?)) defined in java.util.zip.ZipInputStream[JavaClassConstructorDescriptor]

'FileInputStream' @ [35:34] ==> public constructor FileInputStream(p0: (File..File?)) defined in java.io.FileInputStream[JavaClassConstructorDescriptor]

'file' @ [35:50] ==> value-parameter file: File defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest[ValueParameterDescriptorImpl]

'zip' @ [36:9] ==> val zip: ZipInputStream defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest[LocalVariableDescriptor]

'use' @ [36:13] ==> @InlineOnly public inline fun <T : Closeable?, R> ZipInputStream.use(block: (ZipInputStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> ZipInputStream
    <R> -> Unit

'generateSequence' @ [37:13] ==> public fun <T : Any> generateSequence(nextFunction: () -> ZipEntry?): Sequence<ZipEntry> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ZipEntry

'zip' @ [37:32] ==> val zip: ZipInputStream defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest[LocalVariableDescriptor]

'nextEntry' @ [37:36] ==> public final val ZipInputStream.nextEntry: (ZipEntry..ZipEntry?)[MyPropertyDescriptor]

'forEach' @ [37:48] ==> public inline fun <T> Sequence<ZipEntry>.forEach(action: (ZipEntry) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ZipEntry

'it' @ [38:21] ==> value-parameter it: ZipEntry defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [38:24] ==> public final val ZipEntry.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [38:29] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'checkFileWithDx' @ [39:31] ==> public open fun checkFileWithDx(p0: (ByteArray..ByteArray?), @NotNull p1: String): Unit defined in org.jetbrains.kotlin.codegen.DxChecker[JavaMethodDescriptor]

'zip' @ [39:47] ==> val zip: ZipInputStream defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest[LocalVariableDescriptor]

'readBytes' @ [39:51] ==> public fun InputStream.readBytes(estimatedSize: Int = ...): ByteArray defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'it' @ [39:64] ==> value-parameter it: ZipEntry defined in org.jetbrains.kotlin.codegen.TestStdlibWithDxTest.doTest.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [39:67] ==> public final val ZipEntry.name: (String..String?)[MyPropertyDescriptor]

