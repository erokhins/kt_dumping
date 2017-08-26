'when {
            file.canBeDecompiledToJava() -> bytecodeMapForExistingClassfile(file.virtualFile)
            !file.isCompiled -> bytecodeMapForSourceFile(file)
            else -> return null
        }' @ [39:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Map<File, () -> ByteArray>, entry1: Map<File, () -> ByteArray>, entry2: Map<File, () -> ByteArray>): Map<File, () -> ByteArray>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Map<File, Function0<ByteArray>>

'file' @ [40:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[ValueParameterDescriptorImpl]

'canBeDecompiledToJava' @ [40:18] ==> public fun KtFile.canBeDecompiledToJava(): Boolean defined in org.jetbrains.kotlin.idea.actions in file DecompileKotlinToJavaAction.kt[SimpleFunctionDescriptorImpl]

'bytecodeMapForExistingClassfile' @ [40:45] ==> private final fun bytecodeMapForExistingClassfile(file: VirtualFile): Map<File, () -> ByteArray> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl[SimpleFunctionDescriptorImpl]

'file' @ [40:77] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[ValueParameterDescriptorImpl]

'virtualFile' @ [40:82] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'!' @ [41:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [41:14] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[ValueParameterDescriptorImpl]

'isCompiled' @ [41:19] ==> public final val KtFile.isCompiled: Boolean[MyPropertyDescriptor]

'bytecodeMapForSourceFile' @ [41:33] ==> private final fun bytecodeMapForSourceFile(file: KtFile): Map<File, () -> ByteArray> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl[SimpleFunctionDescriptorImpl]

'file' @ [41:58] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[ValueParameterDescriptorImpl]

'KotlinResultSaver' @ [44:27] ==> public constructor KotlinResultSaver() defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver[ClassConstructorDescriptorImpl]

'hashMapOf' @ [45:23] ==> public fun <K, V> hashMapOf(vararg pairs: Pair<String, Any>): HashMap<String, Any> /* = HashMap<String, Any> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Any

'to' @ [46:17] ==> public infix fun <A, B> String.to(that: String): Pair<String, String> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> String

'REMOVE_BRIDGE' @ [46:40] ==> public const final val REMOVE_BRIDGE: String defined in org.jetbrains.java.decompiler.main.extern.IFernflowerPreferences[JavaPropertyDescriptor]

'IBytecodeProvider' @ [49:32] ==> public fun IBytecodeProvider(function: ((String..String?), (String..String?)) -> (ByteArray..ByteArray?)): IBytecodeProvider defined in org.jetbrains.java.decompiler.main.extern[SamConstructorDescriptorImpl]

'File' @ [51:24] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'toSystemIndependentName' @ [51:38] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'externalPath' @ [51:62] ==> value-parameter externalPath: (String..String?) defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile.<anonymous>[ValueParameterDescriptorImpl]

'bytecodeMap' @ [52:13] ==> val bytecodeMap: Map<File, () -> ByteArray> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'path' @ [52:25] ==> val path: File defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile.<anonymous>[LocalVariableDescriptor]

'invoke' @ [52:32] ==> public abstract operator fun invoke(): ByteArray defined in kotlin.Function0[FunctionInvokeDescriptor]

'BaseDecompiler' @ [55:26] ==> public constructor BaseDecompiler(p0: (IBytecodeProvider..IBytecodeProvider?), p1: (IResultSaver..IResultSaver?), p2: (MutableMap<(String..String?), (Any..Any?)>..Map<(String..String?), (Any..Any?)>?), p3: (IFernflowerLogger..IFernflowerLogger?)) defined in org.jetbrains.java.decompiler.main.decompiler.BaseDecompiler[JavaClassConstructorDescriptor]

'bytecodeProvider' @ [55:41] ==> val bytecodeProvider: IBytecodeProvider defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'resultSaver' @ [55:59] ==> val resultSaver: KotlinDecompilerServiceImpl.KotlinResultSaver defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'options' @ [55:72] ==> val options: HashMap<String, Any> /* = HashMap<String, Any> */ defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'IdeaLogger' @ [55:81] ==> public constructor IdeaLogger() defined in org.jetbrains.java.decompiler.IdeaLogger[DeserializedClassConstructorDescriptor]

'bytecodeMap' @ [56:22] ==> val bytecodeMap: Map<File, () -> ByteArray> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'keys' @ [56:34] ==> public abstract val keys: Set<File> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'decompiler' @ [57:13] ==> val decompiler: BaseDecompiler defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'addSpace' @ [57:24] ==> public open fun addSpace(p0: (File..File?), p1: Boolean): Unit defined in org.jetbrains.java.decompiler.main.decompiler.BaseDecompiler[JavaMethodDescriptor]

'path' @ [57:33] ==> val path: File defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'decompiler' @ [59:9] ==> val decompiler: BaseDecompiler defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'decompileContext' @ [59:20] ==> public open fun decompileContext(): Unit defined in org.jetbrains.java.decompiler.main.decompiler.BaseDecompiler[JavaMethodDescriptor]

'resultSaver' @ [60:16] ==> val resultSaver: KotlinDecompilerServiceImpl.KotlinResultSaver defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.decompile[LocalVariableDescriptor]

'resultText' @ [60:28] ==> public final val resultText: String defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver[PropertyDescriptorImpl]

'file' @ [64:23] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [64:28] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'mapOf' @ [66:17] ==> public fun <K, V> mapOf(pair: Pair<String, VirtualFile>): Map<String, VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> VirtualFile

'file' @ [66:23] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[ValueParameterDescriptorImpl]

'path' @ [66:28] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'file' @ [66:36] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[ValueParameterDescriptorImpl]

'file' @ [67:17] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[ValueParameterDescriptorImpl]

'parent' @ [67:22] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'children' @ [67:29] ==> public final val VirtualFile.children: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?)[MyPropertyDescriptor]

'filter' @ [67:38] ==> public inline fun <T> Array<out (VirtualFile..VirtualFile?)>.filter(predicate: ((VirtualFile..VirtualFile?)) -> Boolean): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'it' @ [68:21] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [68:24] ==> public final val VirtualFile.nameWithoutExtension: String[MyPropertyDescriptor]

'startsWith' @ [68:45] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mask' @ [68:56] ==> val mask: String defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[LocalVariableDescriptor]

'it' @ [68:65] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'fileType' @ [68:68] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'CLASS' @ [68:94] ==> public final val CLASS: (FileType..FileType?) defined in com.intellij.openapi.fileTypes.StdFileTypes[JavaPropertyDescriptor]

'map' @ [69:19] ==> public inline fun <T, R> Iterable<(VirtualFile..VirtualFile?)>.map(transform: ((VirtualFile..VirtualFile?)) -> Pair<String, (VirtualFile..VirtualFile?)>): List<Pair<String, (VirtualFile..VirtualFile?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)
    <R> -> Pair<String, (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>

'it' @ [69:25] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [69:28] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'it' @ [69:36] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'files' @ [71:16] ==> val files: Map<String, (VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile[LocalVariableDescriptor]

'entries' @ [71:22] ==> public abstract val entries: Set<Map.Entry<String, (VirtualFile..VirtualFile?)>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'associate' @ [71:30] ==> public inline fun <T, K, V> Iterable<Map.Entry<String, (VirtualFile..VirtualFile?)>>.associate(transform: (Map.Entry<String, (VirtualFile..VirtualFile?)>) -> Pair<File, () -> ByteArray>): Map<File, () -> ByteArray> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)>
    <K> -> File
    <V> -> Function0<ByteArray>

'Pair' @ [72:13] ==> public constructor Pair<out A, out B>(first: File, second: () -> ByteArray) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> File
    <out B> -> Function0<ByteArray>

'File' @ [72:18] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [72:23] ==> value-parameter it: Map.Entry<String, (VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [72:26] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [72:34] ==> value-parameter it: Map.Entry<String, (VirtualFile..VirtualFile?)> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForExistingClassfile.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [72:37] ==> public abstract val value: (VirtualFile..VirtualFile?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'contentsToByteArray' @ [72:43] ==> @NotNull public open fun contentsToByteArray(p0: Boolean): ByteArray defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'CompilerConfiguration' @ [77:29] ==> public constructor CompilerConfiguration() defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaClassConstructorDescriptor]

'apply' @ [77:53] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: CompilerConfiguration.() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'languageVersionSettings' @ [78:13] ==> public var CompilerConfiguration.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.config[DeserializedPropertyDescriptor]

'file' @ [78:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [78:44] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'compileSingleFile' @ [80:56] ==> @NotNull public open fun compileSingleFile(@NotNull ktFile: KtFile, @NotNull configuration: CompilerConfiguration): GenerationState defined in org.jetbrains.kotlin.idea.internal.KotlinBytecodeToolWindow[JavaMethodDescriptor]

'file' @ [80:74] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[ValueParameterDescriptorImpl]

'configuration' @ [80:80] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[LocalVariableDescriptor]

'hashMapOf' @ [82:27] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<File, () -> ByteArray> /* = HashMap<File, () -> ByteArray> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> Function0<ByteArray>

'generationState' @ [83:9] ==> val generationState: GenerationState defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[LocalVariableDescriptor]

'factory' @ [83:25] ==> public final val factory: ClassFileFactory defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'asList' @ [83:33] ==> @NotNull public open fun asList(): List<OutputFile> defined in org.jetbrains.kotlin.codegen.ClassFileFactory[JavaMethodDescriptor]

'filter' @ [83:42] ==> public inline fun <T> Iterable<OutputFile>.filter(predicate: (OutputFile) -> Boolean): List<OutputFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'extensionEquals' @ [83:62] ==> public open fun extensionEquals(@NotNull p0: String, @NotNull p1: String): Boolean defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'it' @ [83:78] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [83:81] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'forEach' @ [83:106] ==> @HidesMembers public inline fun <T> Iterable<OutputFile>.forEach(action: (OutputFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> OutputFile

'bytecodeMap' @ [84:13] ==> val bytecodeMap: HashMap<File, () -> ByteArray> /* = HashMap<File, () -> ByteArray> */ defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[LocalVariableDescriptor]

'File' @ [84:25] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'it' @ [84:34] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile.<anonymous>[ValueParameterDescriptorImpl]

'relativePath' @ [84:37] ==> public abstract val relativePath: String defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedPropertyDescriptor]

'absoluteFile' @ [84:53] ==> public final val File.absoluteFile: (File..File?)[MyPropertyDescriptor]

'it' @ [84:71] ==> value-parameter it: OutputFile defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile.<anonymous>[ValueParameterDescriptorImpl]

'asByteArray' @ [84:74] ==> public abstract fun asByteArray(): ByteArray defined in org.jetbrains.kotlin.backend.common.output.OutputFile[DeserializedSimpleFunctionDescriptor]

'bytecodeMap' @ [86:16] ==> val bytecodeMap: HashMap<File, () -> ByteArray> /* = HashMap<File, () -> ByteArray> */ defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.bytecodeMapForSourceFile[LocalVariableDescriptor]

'mutableMapOf' @ [90:38] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'decompiledText' @ [94:17] ==> private final val decompiledText: MutableMap<String, String> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver[PropertyDescriptorImpl]

'values' @ [94:32] ==> public abstract val values: MutableCollection<String> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'singleOrNull' @ [94:39] ==> public fun <T> Iterable<String>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [94:55] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Nothing

'it' @ [94:68] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.<get-resultText>.<anonymous>[ValueParameterDescriptorImpl]

'buildString' @ [95:24] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [96:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'component2' @ [96:37] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, String>.component2(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> String

'decompiledText' @ [96:49] ==> private final val decompiledText: MutableMap<String, String> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver[PropertyDescriptorImpl]

'appendln' @ [97:25] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filename' @ [97:39] ==> val filename: String defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.<get-resultText>.<anonymous>[LocalVariableDescriptor]

'append' @ [98:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'content' @ [98:32] ==> val content: String defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.<get-resultText>.<anonymous>[LocalVariableDescriptor]

'entryName' @ [112:17] ==> value-parameter entryName: String? defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.saveClassFile[ValueParameterDescriptorImpl]

'content' @ [112:38] ==> value-parameter content: String? defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.saveClassFile[ValueParameterDescriptorImpl]

'decompiledText' @ [113:17] ==> private final val decompiledText: MutableMap<String, String> defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver[PropertyDescriptorImpl]

'entryName' @ [113:32] ==> value-parameter entryName: String? defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.saveClassFile[ValueParameterDescriptorImpl]

'content' @ [113:45] ==> value-parameter content: String? defined in org.jetbrains.kotlin.idea.internal.KotlinDecompilerServiceImpl.KotlinResultSaver.saveClassFile[ValueParameterDescriptorImpl]

