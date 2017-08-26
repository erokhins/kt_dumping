'Suppress' @ [30:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'GradleOption' @ [32:5] ==> public constructor GradleOption(value: KClass<out DefaultValues> = ...) defined in org.jetbrains.kotlin.cli.common.arguments.GradleOption[DeserializedClassConstructorDescriptor]

'EmptyList' @ [32:19] ==> public object EmptyList : DefaultValues defined in org.jetbrains.kotlin.generators.arguments.AdditionalGradleProperties[FakeCallableDescriptorForObject]

'Argument' @ [33:5] ==> public constructor Argument(value: String, shortName: String = ..., deprecatedName: String = ..., delimiter: String = ..., valueDescription: String = ..., description: String) defined in org.jetbrains.kotlin.cli.common.arguments.Argument[DeserializedClassConstructorDescriptor]

'DefaultValues' @ [36:24] ==> public constructor DefaultValues(defaultValue: String, possibleValues: List<String>? = ...) defined in org.jetbrains.kotlin.cli.common.arguments.DefaultValues[DeserializedClassConstructorDescriptor]

'File' @ [40:18] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'FqName' @ [43:33] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'gradleOptions' @ [44:26] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CommonToolArguments

'gradleOptions' @ [45:29] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<AdditionalGradleProperties, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> AdditionalGradleProperties

'invoke' @ [46:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [46:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [46:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonInterfaceFqName' @ [46:36] ==> val commonInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateInterface' @ [47:9] ==> private fun Printer.generateInterface(type: FqName, properties: List<KProperty1<*, *>>, parentType: FqName? = ...): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'commonInterfaceFqName' @ [47:27] ==> val commonInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonOptions' @ [48:27] ==> val commonOptions: List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'additionalOptions' @ [48:43] ==> val additionalOptions: List<KProperty1<AdditionalGradleProperties, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'println' @ [51:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generateMarkdown' @ [52:5] ==> private fun generateMarkdown(properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'commonOptions' @ [52:22] ==> val commonOptions: List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'additionalOptions' @ [52:38] ==> val additionalOptions: List<KProperty1<AdditionalGradleProperties, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [54:41] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'gradleOptions' @ [55:33] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<CommonCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> CommonCompilerArguments

'invoke' @ [56:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [56:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [56:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerInterfaceFqName' @ [56:36] ==> val commonCompilerInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateInterface' @ [57:9] ==> private fun Printer.generateInterface(type: FqName, properties: List<KProperty1<*, *>>, parentType: FqName? = ...): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'commonCompilerInterfaceFqName' @ [57:27] ==> val commonCompilerInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerOptions' @ [58:27] ==> val commonCompilerOptions: List<KProperty1<CommonCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonInterfaceFqName' @ [59:40] ==> val commonInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'println' @ [62:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generateMarkdown' @ [63:5] ==> private fun generateMarkdown(properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'commonCompilerOptions' @ [63:22] ==> val commonCompilerOptions: List<KProperty1<CommonCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [66:30] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'gradleOptions' @ [67:22] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<K2JVMCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> K2JVMCompilerArguments

'invoke' @ [68:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [68:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [68:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jvmInterfaceFqName' @ [68:36] ==> val jvmInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateInterface' @ [69:9] ==> private fun Printer.generateInterface(type: FqName, properties: List<KProperty1<*, *>>, parentType: FqName? = ...): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jvmInterfaceFqName' @ [69:27] ==> val jvmInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jvmOptions' @ [70:27] ==> val jvmOptions: List<KProperty1<K2JVMCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerInterfaceFqName' @ [71:40] ==> val commonCompilerInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [75:40] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'K2JVMCompilerArguments' @ [75:47] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JVMCompilerArguments[FakeCallableDescriptorForObject]

'qualifiedName' @ [75:77] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'FqName' @ [76:25] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'invoke' @ [77:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [77:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [77:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jvmImplFqName' @ [77:36] ==> val jvmImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateImpl' @ [78:9] ==> private fun Printer.generateImpl(type: FqName, parentType: FqName, argsType: FqName, properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jvmImplFqName' @ [78:22] ==> val jvmImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jvmInterfaceFqName' @ [79:22] ==> val jvmInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'k2JvmCompilerArgumentsFqName' @ [80:22] ==> val k2JvmCompilerArgumentsFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonOptions' @ [81:22] ==> val commonOptions: List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerOptions' @ [81:38] ==> val commonCompilerOptions: List<KProperty1<CommonCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jvmOptions' @ [81:62] ==> val jvmOptions: List<KProperty1<K2JVMCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'println' @ [84:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generateMarkdown' @ [85:5] ==> private fun generateMarkdown(properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jvmOptions' @ [85:22] ==> val jvmOptions: List<KProperty1<K2JVMCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [88:29] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'gradleOptions' @ [89:21] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<K2JSCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> K2JSCompilerArguments

'invoke' @ [90:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [90:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [90:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsInterfaceFqName' @ [90:36] ==> val jsInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateInterface' @ [91:9] ==> private fun Printer.generateInterface(type: FqName, properties: List<KProperty1<*, *>>, parentType: FqName? = ...): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jsInterfaceFqName' @ [91:27] ==> val jsInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsOptions' @ [92:27] ==> val jsOptions: List<KProperty1<K2JSCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerInterfaceFqName' @ [93:40] ==> val commonCompilerInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [96:39] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'K2JSCompilerArguments' @ [96:46] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSCompilerArguments[FakeCallableDescriptorForObject]

'qualifiedName' @ [96:75] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'FqName' @ [97:24] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'invoke' @ [98:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [98:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [98:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsImplFqName' @ [98:36] ==> val jsImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateImpl' @ [99:9] ==> private fun Printer.generateImpl(type: FqName, parentType: FqName, argsType: FqName, properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jsImplFqName' @ [99:22] ==> val jsImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsInterfaceFqName' @ [100:22] ==> val jsInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'k2JsCompilerArgumentsFqName' @ [101:22] ==> val k2JsCompilerArgumentsFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonOptions' @ [102:22] ==> val commonOptions: List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonCompilerOptions' @ [102:38] ==> val commonCompilerOptions: List<KProperty1<CommonCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsOptions' @ [102:62] ==> val jsOptions: List<KProperty1<K2JSCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'println' @ [105:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'generateMarkdown' @ [106:5] ==> private fun generateMarkdown(properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jsOptions' @ [106:22] ==> val jsOptions: List<KProperty1<K2JSCompilerArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [109:32] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'gradleOptions' @ [110:24] ==> private inline fun <reified T : Any> gradleOptions(): List<KProperty1<K2JSDceArguments, *>> defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> K2JSDceArguments

'invoke' @ [111:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [111:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [111:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsDceInterfaceFqName' @ [111:36] ==> val jsDceInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateInterface' @ [112:9] ==> private fun Printer.generateInterface(type: FqName, properties: List<KProperty1<*, *>>, parentType: FqName? = ...): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jsDceInterfaceFqName' @ [112:27] ==> val jsDceInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsDceOptions' @ [113:27] ==> val jsDceOptions: List<KProperty1<K2JSDceArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonInterfaceFqName' @ [114:40] ==> val commonInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'FqName' @ [117:34] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'K2JSDceArguments' @ [117:41] ==> public companion object defined in org.jetbrains.kotlin.cli.common.arguments.K2JSDceArguments[FakeCallableDescriptorForObject]

'qualifiedName' @ [117:65] ==> public abstract val qualifiedName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'FqName' @ [118:27] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'invoke' @ [119:5] ==> public abstract operator fun invoke(targetFile: @ParameterName File, p2: Printer.() -> Unit): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'File' @ [119:23] ==> private fun File(baseDir: File, fqName: FqName): File defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'srcDir' @ [119:28] ==> val srcDir: File defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsDceImplFqName' @ [119:36] ==> val jsDceImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'generateImpl' @ [120:9] ==> private fun Printer.generateImpl(type: FqName, parentType: FqName, argsType: FqName, properties: List<KProperty1<*, *>>): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'jsDceImplFqName' @ [120:22] ==> val jsDceImplFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsDceInterfaceFqName' @ [121:22] ==> val jsDceInterfaceFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'k2JsDceArgumentsFqName' @ [122:22] ==> val k2JsDceArgumentsFqName: FqName defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'commonOptions' @ [123:22] ==> val commonOptions: List<KProperty1<CommonToolArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'jsDceOptions' @ [123:38] ==> val jsDceOptions: List<KProperty1<K2JSDceArguments, *>> defined in org.jetbrains.kotlin.generators.arguments.generateKotlinGradleOptions[LocalVariableDescriptor]

'!' @ [129:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [129:14] ==> value-parameter file: File defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter[ValueParameterDescriptorImpl]

'exists' @ [129:19] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [130:13] ==> value-parameter file: File defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter[ValueParameterDescriptorImpl]

'parentFile' @ [130:18] ==> public final val File.parentFile: (File..File?)[MyPropertyDescriptor]

'mkdirs' @ [130:29] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'file' @ [131:13] ==> value-parameter file: File defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter[ValueParameterDescriptorImpl]

'createNewFile' @ [131:18] ==> public open fun createNewFile(): Boolean defined in java.io.File[JavaMethodDescriptor]

'PrintStream' @ [133:9] ==> public constructor PrintStream(p0: (OutputStream..OutputStream?)) defined in java.io.PrintStream[JavaClassConstructorDescriptor]

'file' @ [133:21] ==> value-parameter file: File defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter[ValueParameterDescriptorImpl]

'outputStream' @ [133:26] ==> @InlineOnly public inline fun File.outputStream(): FileOutputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'use' @ [133:42] ==> @InlineOnly public inline fun <T : Closeable?, R> PrintStream.use(block: (PrintStream) -> Unit): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> PrintStream
    <R> -> Unit

'Printer' @ [134:27] ==> public constructor Printer(@NotNull p0: Appendable) defined in org.jetbrains.kotlin.utils.Printer[JavaClassConstructorDescriptor]

'it' @ [134:35] ==> value-parameter it: PrintStream defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter.<anonymous>[ValueParameterDescriptorImpl]

'printer' @ [135:13] ==> val printer: Printer defined in org.jetbrains.kotlin.generators.arguments.main.getPrinter.<anonymous>[LocalVariableDescriptor]

'invoke' @ [135:21] ==> public abstract operator fun Printer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'generateKotlinGradleOptions' @ [139:5] ==> public fun generateKotlinGradleOptions(withPrinterToFile: (targetFile: File, Printer.() -> Unit) -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'declaredMemberProperties' @ [143:18] ==> @SinceKotlin public val <T : Any> KClass<T>.declaredMemberProperties: Collection<KProperty1<T, *>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'filter' @ [143:43] ==> public inline fun <T> Iterable<KProperty1<T, *>>.filter(predicate: (KProperty1<T, *>) -> Boolean): List<KProperty1<T, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>

'it' @ [143:52] ==> value-parameter it: KProperty1<T, *> defined in org.jetbrains.kotlin.generators.arguments.gradleOptions.<anonymous>[ValueParameterDescriptorImpl]

'findAnnotation' @ [143:55] ==> private inline fun <reified T> KAnnotatedElement.findAnnotation(): GradleOption? defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> GradleOption

'sortedBy' @ [143:96] ==> public inline fun <T, R : Comparable<String>> Iterable<KProperty1<T, *>>.sortedBy(crossinline selector: (KProperty1<T, *>) -> String?): List<KProperty1<T, *>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KProperty1<T, *>
    <R : Comparable<R>> -> String

'it' @ [143:107] ==> value-parameter it: KProperty1<T, *> defined in org.jetbrains.kotlin.generators.arguments.gradleOptions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [143:110] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'fqName' @ [146:28] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.generators.arguments.File[ValueParameterDescriptorImpl]

'asString' @ [146:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'replace' @ [146:46] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [147:12] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'baseDir' @ [147:17] ==> value-parameter baseDir: File defined in org.jetbrains.kotlin.generators.arguments.File[ValueParameterDescriptorImpl]

'fileRelativePath' @ [147:26] ==> val fileRelativePath: String defined in org.jetbrains.kotlin.generators.arguments.File[LocalVariableDescriptor]

'parentType' @ [151:21] ==> value-parameter parentType: FqName? = ... defined in org.jetbrains.kotlin.generators.arguments.generateInterface[ValueParameterDescriptorImpl]

'let' @ [151:33] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> String

'it' @ [151:44] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.generators.arguments.generateInterface.<anonymous>[ValueParameterDescriptorImpl]

'generateDeclaration' @ [152:5] ==> private fun Printer.generateDeclaration(modifiers: String, type: FqName, afterType: String? = ..., generateBody: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'type' @ [152:38] ==> value-parameter type: FqName defined in org.jetbrains.kotlin.generators.arguments.generateInterface[ValueParameterDescriptorImpl]

'afterType' @ [152:56] ==> val afterType: String? defined in org.jetbrains.kotlin.generators.arguments.generateInterface[LocalVariableDescriptor]

'properties' @ [153:26] ==> value-parameter properties: List<KProperty1<*, *>> defined in org.jetbrains.kotlin.generators.arguments.generateInterface[ValueParameterDescriptorImpl]

'println' @ [154:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'generateDoc' @ [155:13] ==> private fun Printer.generateDoc(property: KProperty1<*, *>): Unit defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'property' @ [155:25] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateInterface.<anonymous>[LocalVariableDescriptor]

'generatePropertyDeclaration' @ [156:13] ==> private fun Printer.generatePropertyDeclaration(property: KProperty1<*, *>, modifiers: String = ...): Unit defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'property' @ [156:41] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateInterface.<anonymous>[LocalVariableDescriptor]

'generateDeclaration' @ [167:5] ==> private fun Printer.generateDeclaration(modifiers: String, type: FqName, afterType: String? = ..., generateBody: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'type' @ [167:52] ==> value-parameter type: FqName defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'parentType' @ [167:74] ==> value-parameter parentType: FqName defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'this' @ [168:58] ==> <this> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>.backingField[ReceiverParameterDescriptorImpl]

'name' @ [168:63] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'properties' @ [170:26] ==> value-parameter properties: List<KProperty1<*, *>> defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'println' @ [171:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'property' @ [172:32] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'backingField' @ [172:41] ==> local final fun KProperty1<*, *>.backingField(): String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[SimpleFunctionDescriptorImpl]

'property' @ [173:36] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'gradleReturnType' @ [173:45] ==> private val KProperty1<*, *>.gradleReturnType: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [174:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'backingField' @ [174:35] ==> val backingField: String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'backingFieldType' @ [174:50] ==> val backingFieldType: String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'generatePropertyDeclaration' @ [175:13] ==> private fun Printer.generatePropertyDeclaration(property: KProperty1<*, *>, modifiers: String = ...): Unit defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[SimpleFunctionDescriptorImpl]

'property' @ [175:41] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'withIndent' @ [176:13] ==> private inline fun Printer.withIndent(fn: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'println' @ [177:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'backingField' @ [177:35] ==> val backingField: String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'property' @ [177:53] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'gradleDefaultValue' @ [177:62] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [178:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'backingField' @ [178:40] ==> val backingField: String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'println' @ [182:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [183:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'argsType' @ [183:59] ==> value-parameter argsType: FqName defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'withIndent' @ [184:9] ==> private inline fun Printer.withIndent(fn: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'properties' @ [185:30] ==> value-parameter properties: List<KProperty1<*, *>> defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'property' @ [186:36] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>.<anonymous>[LocalVariableDescriptor]

'backingField' @ [186:45] ==> local final fun KProperty1<*, *>.backingField(): String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[SimpleFunctionDescriptorImpl]

'println' @ [187:17] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'backingField' @ [187:27] ==> val backingField: String defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>.<anonymous>[LocalVariableDescriptor]

'property' @ [187:54] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>.<anonymous>[LocalVariableDescriptor]

'name' @ [187:63] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'println' @ [190:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [193:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [194:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'argsType' @ [194:28] ==> value-parameter argsType: FqName defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'withIndent' @ [195:5] ==> private inline fun Printer.withIndent(fn: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'properties' @ [196:26] ==> value-parameter properties: List<KProperty1<*, *>> defined in org.jetbrains.kotlin.generators.arguments.generateImpl[ValueParameterDescriptorImpl]

'println' @ [197:13] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'property' @ [197:24] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'name' @ [197:33] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'property' @ [197:43] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateImpl.<anonymous>[LocalVariableDescriptor]

'gradleDefaultValue' @ [197:52] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [200:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [209:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [210:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'!' @ [211:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [211:10] ==> value-parameter type: FqName defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'parent' @ [211:15] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'isRoot' @ [211:24] ==> public final val FqName.isRoot: Boolean[MyPropertyDescriptor]

'println' @ [212:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'type' @ [212:28] ==> value-parameter type: FqName defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'parent' @ [212:33] ==> @NotNull public open fun parent(): FqName defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'println' @ [213:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'print' @ [215:5] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'modifiers' @ [215:13] ==> value-parameter modifiers: String defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'type' @ [215:25] ==> value-parameter type: FqName defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'shortName' @ [215:30] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'afterType' @ [216:5] ==> value-parameter afterType: String? = ... defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'let' @ [216:16] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Printer): Printer defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Printer

'print' @ [216:22] ==> @NotNull public open fun print(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'afterType' @ [216:30] ==> value-parameter afterType: String? = ... defined in org.jetbrains.kotlin.generators.arguments.generateDeclaration[ValueParameterDescriptorImpl]

'println' @ [217:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'withIndent' @ [218:5] ==> private inline fun Printer.withIndent(fn: Printer.() -> Unit): Unit defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]

'invoke' @ [219:9] ==> public abstract operator fun Printer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'println' @ [221:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'property' @ [225:22] ==> value-parameter property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'gradleReturnType' @ [225:31] ==> private val KProperty1<*, *>.gradleReturnType: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [226:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'modifiers' @ [226:15] ==> value-parameter modifiers: String = ... defined in org.jetbrains.kotlin.generators.arguments.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'property' @ [226:31] ==> value-parameter property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generatePropertyDeclaration[ValueParameterDescriptorImpl]

'name' @ [226:40] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'returnType' @ [226:48] ==> val returnType: String defined in org.jetbrains.kotlin.generators.arguments.generatePropertyDeclaration[LocalVariableDescriptor]

'property' @ [230:23] ==> value-parameter property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateDoc[ValueParameterDescriptorImpl]

'findAnnotation' @ [230:32] ==> private inline fun <reified T> KAnnotatedElement.findAnnotation(): Argument? defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> Argument

'description' @ [230:61] ==> public final val description: String defined in org.jetbrains.kotlin.cli.common.arguments.Argument[DeserializedPropertyDescriptor]

'property' @ [231:26] ==> value-parameter property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateDoc[ValueParameterDescriptorImpl]

'gradleValues' @ [231:35] ==> private val KProperty1<*, *>.gradleValues: DefaultValues defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'possibleValues' @ [231:48] ==> public final val possibleValues: List<String>? defined in org.jetbrains.kotlin.cli.common.arguments.DefaultValues[DeserializedPropertyDescriptor]

'property' @ [232:24] ==> value-parameter property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateDoc[ValueParameterDescriptorImpl]

'gradleDefaultValue' @ [232:33] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [234:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [235:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'description' @ [235:18] ==> val description: String defined in org.jetbrains.kotlin.generators.arguments.generateDoc[LocalVariableDescriptor]

'possibleValues' @ [236:9] ==> val possibleValues: List<String>? defined in org.jetbrains.kotlin.generators.arguments.generateDoc[LocalVariableDescriptor]

'println' @ [237:9] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'possibleValues' @ [237:40] ==> val possibleValues: List<String>? defined in org.jetbrains.kotlin.generators.arguments.generateDoc[LocalVariableDescriptor]

'joinToString' @ [237:55] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'println' @ [239:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'defaultValue' @ [239:33] ==> val defaultValue: String defined in org.jetbrains.kotlin.generators.arguments.generateDoc[LocalVariableDescriptor]

'println' @ [240:5] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'pushIndent' @ [244:5] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'invoke' @ [245:5] ==> public abstract operator fun Printer.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'popIndent' @ [246:5] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'println' @ [250:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'println' @ [251:5] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'properties' @ [252:22] ==> value-parameter properties: List<KProperty1<*, *>> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[ValueParameterDescriptorImpl]

'property' @ [253:20] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'name' @ [253:29] ==> public abstract val name: String defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'name' @ [254:13] ==> val name: String defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'property' @ [255:27] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'findAnnotation' @ [255:36] ==> private inline fun <reified T> KAnnotatedElement.findAnnotation(): Argument? defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> Argument

'description' @ [255:65] ==> public final val description: String defined in org.jetbrains.kotlin.cli.common.arguments.Argument[DeserializedPropertyDescriptor]

'property' @ [256:30] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'gradleValues' @ [256:39] ==> private val KProperty1<*, *>.gradleValues: DefaultValues defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'possibleValues' @ [256:52] ==> public final val possibleValues: List<String>? defined in org.jetbrains.kotlin.cli.common.arguments.DefaultValues[DeserializedPropertyDescriptor]

'when (property.gradleDefaultValue) {
            "null" -> ""
            "emptyList()" -> "[]"
            else -> property.gradleDefaultValue
        }' @ [257:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'property' @ [257:34] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'gradleDefaultValue' @ [257:43] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'property' @ [260:21] ==> val property: KProperty1<*, *> defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'gradleDefaultValue' @ [260:30] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'println' @ [263:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'name' @ [263:22] ==> val name: String defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'description' @ [263:31] ==> val description: String defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'possibleValues' @ [263:47] ==> val possibleValues: List<String>? defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'orEmpty' @ [263:62] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'joinToString' @ [263:72] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'defaultValue' @ [263:91] ==> val defaultValue: String defined in org.jetbrains.kotlin.generators.arguments.generateMarkdown[LocalVariableDescriptor]

'findAnnotation' @ [268:17] ==> private inline fun <reified T> KAnnotatedElement.findAnnotation(): GradleOption? defined in org.jetbrains.kotlin.generators.arguments[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> GradleOption

'value' @ [268:50] ==> public final val value: KClass<out DefaultValues> defined in org.jetbrains.kotlin.cli.common.arguments.GradleOption[DeserializedPropertyDescriptor]

'objectInstance' @ [268:56] ==> public abstract val objectInstance: DefaultValues? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'gradleValues' @ [271:17] ==> private val KProperty1<*, *>.gradleValues: DefaultValues defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'defaultValue' @ [271:30] ==> public final val defaultValue: String defined in org.jetbrains.kotlin.cli.common.arguments.DefaultValues[DeserializedPropertyDescriptor]

'returnType' @ [276:24] ==> public abstract val returnType: KType defined in kotlin.reflect.KProperty1[DeserializedPropertyDescriptor]

'withNullability' @ [276:35] ==> @SinceKotlin public fun KType.withNullability(nullable: Boolean): KType defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]

'toString' @ [276:58] ==> public open fun toString(): String defined in kotlin.reflect.KType[DeserializedSimpleFunctionDescriptor]

'substringBeforeLast' @ [276:69] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'gradleDefaultValue' @ [277:17] ==> private val KProperty1<*, *>.gradleDefaultValue: String defined in org.jetbrains.kotlin.generators.arguments in file GenerateGradleOptions.kt[PropertyDescriptorImpl]

'type' @ [278:17] ==> var type: String defined in org.jetbrains.kotlin.generators.arguments.<get-gradleReturnType>[LocalVariableDescriptor]

'type' @ [280:20] ==> var type: String defined in org.jetbrains.kotlin.generators.arguments.<get-gradleReturnType>[LocalVariableDescriptor]

'annotations' @ [284:9] ==> public abstract val annotations: List<Annotation> defined in kotlin.reflect.KAnnotatedElement[DeserializedPropertyDescriptor]

'filterIsInstance' @ [284:21] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> T

'firstOrNull' @ [284:43] ==> public fun <T> List<T>.firstOrNull(): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

