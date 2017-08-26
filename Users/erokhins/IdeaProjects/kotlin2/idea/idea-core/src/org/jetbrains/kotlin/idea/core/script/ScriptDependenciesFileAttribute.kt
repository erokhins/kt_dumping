'service' @ [36:40] ==> public inline fun <reified T : Any> service(): FileAttributeService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FileAttributeService

'fileAttributeService' @ [39:9] ==> private final val fileAttributeService: FileAttributeService defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'register' @ [39:30] ==> public open fun register(id: String, version: Int, fixedSize: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.caches.FileAttributeService[SimpleFunctionDescriptorImpl]

'ID' @ [39:39] ==> private final val ID: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'VERSION' @ [39:43] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'virtualFile' @ [43:13] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write[ValueParameterDescriptorImpl]

'fileAttributeService' @ [44:9] ==> private final val fileAttributeService: FileAttributeService defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'write' @ [44:30] ==> public abstract fun <T> write(file: VirtualFile, id: String, value: ScriptDependencies, writeValueFun: (DataOutput, ScriptDependencies) -> Unit): CachedAttributeData<ScriptDependencies> defined in org.jetbrains.kotlin.idea.caches.FileAttributeService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ScriptDependencies

'virtualFile' @ [44:36] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write[ValueParameterDescriptorImpl]

'ID' @ [44:49] ==> private final val ID: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'dependencies' @ [44:53] ==> value-parameter dependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write[ValueParameterDescriptorImpl]

'with' @ [45:13] ==> @InlineOnly public inline fun <T, R> with(receiver: ScriptDependencies, block: ScriptDependencies.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> Unit

'dep' @ [45:18] ==> value-parameter dep: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write.<anonymous>[ValueParameterDescriptorImpl]

'output' @ [46:17] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write.<anonymous>[ValueParameterDescriptorImpl]

'writeInt' @ [46:24] ==> public abstract fun writeInt(p0: Int): Unit defined in java.io.DataOutput[JavaMethodDescriptor]

'VERSION' @ [46:33] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'writeDependencies' @ [48:17] ==> private final fun writeDependencies(scriptDependencies: ScriptDependencies, output: DataOutput): Unit defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[SimpleFunctionDescriptorImpl]

'this' @ [48:35] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'output' @ [48:41] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.write.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [54:13] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.read[ValueParameterDescriptorImpl]

'fileAttributeService' @ [56:16] ==> private final val fileAttributeService: FileAttributeService defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'read' @ [56:37] ==> public abstract fun <T> read(file: VirtualFile, id: String, readValueFun: (DataInput) -> ScriptDependencies?): CachedAttributeData<ScriptDependencies?>? defined in org.jetbrains.kotlin.idea.caches.FileAttributeService[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ScriptDependencies?

'virtualFile' @ [56:42] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.read[ValueParameterDescriptorImpl]

'ID' @ [56:55] ==> private final val ID: String defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'input' @ [57:27] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.read.<anonymous>[ValueParameterDescriptorImpl]

'readInt' @ [57:33] ==> public abstract fun readInt(): Int defined in java.io.DataInput[JavaMethodDescriptor]

'if (version != VERSION) null
            else readDependencies(input)' @ [58:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScriptDependencies?, elseBranch: ScriptDependencies?): ScriptDependencies?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScriptDependencies?

'version' @ [58:17] ==> val version: Int defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.read.<anonymous>[LocalVariableDescriptor]

'VERSION' @ [58:28] ==> private final val VERSION: Int defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[PropertyDescriptorImpl]

'readDependencies' @ [59:18] ==> private final fun readDependencies(input: DataInput): ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute[SimpleFunctionDescriptorImpl]

'input' @ [59:35] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.read.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [60:12] ==> public final val value: ScriptDependencies? defined in org.jetbrains.kotlin.idea.caches.CachedAttributeData[PropertyDescriptorImpl]

'with' @ [64:9] ==> @InlineOnly public inline fun <T, R> with(receiver: ScriptDependencies, block: ScriptDependencies.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptDependencies
    <R> -> Unit

'scriptDependencies' @ [64:14] ==> value-parameter scriptDependencies: ScriptDependencies defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.writeDependencies[ValueParameterDescriptorImpl]

'with' @ [65:13] ==> @InlineOnly public inline fun <T, R> with(receiver: DataOutput, block: DataOutput.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataOutput
    <R> -> Unit

'output' @ [65:18] ==> value-parameter output: DataOutput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.writeDependencies[ValueParameterDescriptorImpl]

'writeFileList' @ [66:17] ==> private fun DataOutput.writeFileList(iterable: Iterable<File>): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'classpath' @ [66:31] ==> public final val classpath: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'writeStringList' @ [67:17] ==> private fun DataOutput.writeStringList(iterable: Iterable<String>): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'imports' @ [67:33] ==> public final val imports: List<String> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'writeNullable' @ [68:17] ==> private fun <T : Any> DataOutput.writeNullable(nullable: File?, writeT: DataOutput.(File) -> Unit): Unit defined in org.jetbrains.kotlin.idea.core.script[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> File

'javaHome' @ [68:31] ==> public final val javaHome: File? defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'writeFile' @ [68:53] ==> private fun DataOutput.writeFile(it: File): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'writeFileList' @ [69:17] ==> private fun DataOutput.writeFileList(iterable: Iterable<File>): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'scripts' @ [69:31] ==> public final val scripts: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'writeFileList' @ [70:17] ==> private fun DataOutput.writeFileList(iterable: Iterable<File>): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'sources' @ [70:31] ==> public final val sources: List<File> defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedPropertyDescriptor]

'with' @ [77:9] ==> @InlineOnly public inline fun <T, R> with(receiver: DataInput, block: DataInput.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DataInput
    <R> -> Nothing

'input' @ [77:14] ==> value-parameter input: DataInput defined in org.jetbrains.kotlin.idea.core.script.ScriptDependenciesFileAttribute.readDependencies[ValueParameterDescriptorImpl]

'ScriptDependencies' @ [78:20] ==> public constructor ScriptDependencies(javaHome: File? = ..., classpath: List<File> = ..., imports: List<String> = ..., sources: List<File> = ..., scripts: List<File> = ...) defined in kotlin.script.experimental.dependencies.ScriptDependencies[DeserializedClassConstructorDescriptor]

'readFileList' @ [79:33] ==> private fun DataInput.readFileList(): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readStringList' @ [80:31] ==> private fun DataInput.readStringList(): List<String> defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readNullable' @ [81:32] ==> private fun <T : Any> DataInput.readNullable(readT: DataInput.() -> File): File? defined in org.jetbrains.kotlin.idea.core.script[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> File

'readFile' @ [81:56] ==> private fun DataInput.readFile(): File defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readFileList' @ [82:31] ==> private fun DataInput.readFileList(): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readFileList' @ [83:31] ==> private fun DataInput.readFileList(): (MutableList<(File..File?)>..List<(File..File?)>) defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readSeq' @ [89:56] ==> @NotNull public final fun <T : (Any..Any?)> readSeq(@NotNull p0: DataInput, @NotNull p1: () -> (String..String?)): (MutableList<(String..String?)>..List<(String..String?)>) defined in com.intellij.util.io.DataInputOutputUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'this' @ [89:64] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.readStringList[ReceiverParameterDescriptorImpl]

'readString' @ [89:72] ==> private fun DataInput.readString(): (String..String?) defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readSeq' @ [90:40] ==> @NotNull public final fun <T : (Any..Any?)> readSeq(@NotNull p0: DataInput, @NotNull p1: () -> (File..File?)): (MutableList<(File..File?)>..List<(File..File?)>) defined in com.intellij.util.io.DataInputOutputUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'this' @ [90:48] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.readFileList[ReceiverParameterDescriptorImpl]

'readFile' @ [90:56] ==> private fun DataInput.readFile(): File defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'readUTF' @ [91:38] ==> public open fun readUTF(@NotNull p0: DataInput): (String..String?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'this' @ [91:46] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.readString[ReceiverParameterDescriptorImpl]

'readUTF' @ [92:36] ==> public open fun readUTF(@NotNull p0: DataInput): (String..String?) defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'this' @ [92:44] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.readFile[ReceiverParameterDescriptorImpl]

'let' @ [92:50] ==> @InlineOnly public inline fun <T, R> (String..String?).let(block: ((String..String?)) -> File): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> File

'File' @ [92:56] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [92:61] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.script.readFile.<anonymous>[ValueParameterDescriptorImpl]

'writeSeq' @ [94:66] ==> public final fun <T : (Any..Any?)> writeSeq(@NotNull p0: DataOutput, @NotNull p1: (MutableCollection<(File..File?)>..Collection<(File..File?)>), @NotNull p2: ((File..File?)) -> Unit): Unit defined in com.intellij.util.io.DataInputOutputUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.File..java.io.File?)

'this' @ [94:75] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.writeFileList[ReceiverParameterDescriptorImpl]

'iterable' @ [94:81] ==> value-parameter iterable: Iterable<File> defined in org.jetbrains.kotlin.idea.core.script.writeFileList[ValueParameterDescriptorImpl]

'toList' @ [94:90] ==> public fun <T> Iterable<File>.toList(): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'writeFile' @ [94:102] ==> private fun DataOutput.writeFile(it: File): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'it' @ [94:112] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.core.script.writeFileList.<anonymous>[ValueParameterDescriptorImpl]

'writeString' @ [95:46] ==> private fun DataOutput.writeString(string: String): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'it' @ [95:58] ==> value-parameter it: File defined in org.jetbrains.kotlin.idea.core.script.writeFile[ValueParameterDescriptorImpl]

'canonicalPath' @ [95:61] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'writeUTF' @ [96:54] ==> public open fun writeUTF(@NotNull p0: DataOutput, @NotNull p1: String): Unit defined in com.intellij.util.io.IOUtil[JavaMethodDescriptor]

'this' @ [96:63] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.writeString[ReceiverParameterDescriptorImpl]

'string' @ [96:69] ==> value-parameter string: String defined in org.jetbrains.kotlin.idea.core.script.writeString[ValueParameterDescriptorImpl]

'writeSeq' @ [97:70] ==> public final fun <T : (Any..Any?)> writeSeq(@NotNull p0: DataOutput, @NotNull p1: (MutableCollection<(String..String?)>..Collection<(String..String?)>), @NotNull p2: ((String..String?)) -> Unit): Unit defined in com.intellij.util.io.DataInputOutputUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'this' @ [97:79] ==> <this> defined in org.jetbrains.kotlin.idea.core.script.writeStringList[ReceiverParameterDescriptorImpl]

'iterable' @ [97:85] ==> value-parameter iterable: Iterable<String> defined in org.jetbrains.kotlin.idea.core.script.writeStringList[ValueParameterDescriptorImpl]

'toList' @ [97:94] ==> public fun <T> Iterable<String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'writeString' @ [97:106] ==> private fun DataOutput.writeString(string: String): Unit defined in org.jetbrains.kotlin.idea.core.script in file ScriptDependenciesFileAttribute.kt[SimpleFunctionDescriptorImpl]

'it' @ [97:118] ==> value-parameter it: (String..String?) defined in org.jetbrains.kotlin.idea.core.script.writeStringList.<anonymous>[ValueParameterDescriptorImpl]

'writeBoolean' @ [100:5] ==> public abstract fun writeBoolean(p0: Boolean): Unit defined in java.io.DataOutput[JavaMethodDescriptor]

'nullable' @ [100:18] ==> value-parameter nullable: T? defined in org.jetbrains.kotlin.idea.core.script.writeNullable[ValueParameterDescriptorImpl]

'nullable' @ [101:5] ==> value-parameter nullable: T? defined in org.jetbrains.kotlin.idea.core.script.writeNullable[ValueParameterDescriptorImpl]

'let' @ [101:15] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Unit

'invoke' @ [101:21] ==> public abstract operator fun DataOutput.invoke(p2: T): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'it' @ [101:28] ==> value-parameter it: T defined in org.jetbrains.kotlin.idea.core.script.writeNullable.<anonymous>[ValueParameterDescriptorImpl]

'readBoolean' @ [105:20] ==> public abstract fun readBoolean(): Boolean defined in java.io.DataInput[JavaMethodDescriptor]

'if (hasValue) readT() else null' @ [106:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T?, elseBranch: T?): T?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T?

'hasValue' @ [106:16] ==> val hasValue: Boolean defined in org.jetbrains.kotlin.idea.core.script.readNullable[LocalVariableDescriptor]

'invoke' @ [106:26] ==> public abstract operator fun DataInput.invoke(): T defined in kotlin.Function1[FunctionInvokeDescriptor]

