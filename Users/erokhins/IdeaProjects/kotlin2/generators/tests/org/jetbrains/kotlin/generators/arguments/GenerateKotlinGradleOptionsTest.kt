'UsefulTestCase' @ [24:41] ==> public constructor UsefulTestCase() defined in com.intellij.testFramework.UsefulTestCase[JavaClassConstructorDescriptor]

'ByteArrayOutputStream' @ [27:28] ==> public constructor ByteArrayOutputStream() defined in java.io.ByteArrayOutputStream[JavaClassConstructorDescriptor]

'PrintStream' @ [29:13] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'bytesOut' @ [29:25] ==> val bytesOut: ByteArrayOutputStream defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter[LocalVariableDescriptor]

'use' @ [29:35] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintStream.use(block: (PrintStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintStream
    <R> -> Unit

'Printer' @ [30:31] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'it' @ [30:39] ==> value-parameter it: PrintStream defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter.<anonymous>[ValueParameterDescriptorImpl]

'printer' @ [31:17] ==> val printer: Printer defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter.<anonymous>[LocalVariableDescriptor]

'invoke' @ [31:25] ==> public abstract operator fun Printer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'bytesOut' @ [34:35] ==> val bytesOut: ByteArrayOutputStream defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter[LocalVariableDescriptor]

'toString' @ [34:44] ==> public open fun toString(): String defined in java.io.ByteArrayOutputStream[JavaMethodDescriptor]

'assertSameLinesWithFile' @ [35:28] ==> public open fun assertSameLinesWithFile(p0: (String..String?), p1: (String..String?)): Unit defined in com.intellij.testFramework.UsefulTestCase[JavaMethodDescriptor]

'file' @ [35:52] ==> value-parameter file: File defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter[ValueParameterDescriptorImpl]

'absolutePath' @ [35:57] ==> public final val File.absolutePath: (String..String?)[MyPropertyDescriptor]

'upToDateContent' @ [35:71] ==> val upToDateContent: String defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate.getPrinter[LocalVariableDescriptor]

'generateKotlinGradleOptions' @ [38:9] ==> public fun generateKotlinGradleOptions(withPrinterToFile: (targetFile: File, Printer.() -> Unit) -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'getPrinter' @ [38:39] ==> local final fun getPrinter(file: File, fn: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments.test.GenerateKotlinGradleOptionsTest.testKotlinGradleOptionsAreUpToDate[SimpleFunctionDescriptorImpl]

