'listOf' @ [23:24] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'COMMANDS' @ [24:38] ==> private val COMMANDS: List<String> defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'joinToString' @ [24:47] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'COMMANDS' @ [25:40] ==> private val COMMANDS: List<String> defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'joinToString' @ [25:49] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [25:74] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.testingUtils.COMMANDS_AS_MESSAGE_PART.<anonymous>[ValueParameterDescriptorImpl]

'hashMapOf' @ [33:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<File, File> /* = HashMap<File, File> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> File
    <V> -> File

'copyDir' @ [34:14] ==> public final fun copyDir(@NotNull p0: File, @NotNull p1: File, @Nullable p2: (((File..File?)) -> Boolean)?): Unit defined in com.intellij.openapi.util.io.FileUtil[SamAdapterFunctionDescriptor]

'testDataDir' @ [34:22] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'sourceDestinationDir' @ [34:35] ==> value-parameter sourceDestinationDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'it' @ [35:9] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources.<anonymous>[ValueParameterDescriptorImpl]

'isDirectory' @ [35:12] ==> public final val File.isDirectory: Boolean[MyPropertyDescriptor]

'it' @ [35:27] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [35:30] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'startsWith' @ [35:35] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filePrefix' @ [35:46] ==> value-parameter filePrefix: String defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'it' @ [35:62] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [35:65] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [35:70] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [35:89] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [35:92] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [35:97] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'sourceDestinationDir' @ [38:18] ==> value-parameter sourceDestinationDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'walk' @ [38:39] ==> public fun File.walk(direction: FileWalkDirection = ...): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [39:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [39:14] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'isFile' @ [39:19] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'if (filePrefix.isEmpty()) {
                    file
                }
                else {
                    File(sourceDestinationDir, file.name.removePrefix(filePrefix)).apply {
                        file.renameTo(this)
                    }
                }' @ [42:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: File, elseBranch: File): File[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> File

'filePrefix' @ [42:21] ==> value-parameter filePrefix: String defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'isEmpty' @ [42:32] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'file' @ [43:21] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'File' @ [46:21] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'sourceDestinationDir' @ [46:26] ==> value-parameter sourceDestinationDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'file' @ [46:48] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'name' @ [46:53] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'removePrefix' @ [46:58] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'filePrefix' @ [46:71] ==> value-parameter filePrefix: String defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'apply' @ [46:84] ==> @InlineOnly public inline fun <T> File.apply(block: File.() -> Unit): File defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'file' @ [47:25] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'renameTo' @ [47:30] ==> public open fun renameTo(p0: (File..File?)): Boolean defined in java.io.File[JavaMethodDescriptor]

'this' @ [47:39] ==> <this> defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources.<anonymous>[ReceiverParameterDescriptorImpl]

'mapping' @ [51:9] ==> val mapping: HashMap<File, File> /* = HashMap<File, File> */ defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'renamedFile' @ [51:17] ==> val renamedFile: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'File' @ [51:32] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'testDataDir' @ [51:37] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[ValueParameterDescriptorImpl]

'file' @ [51:50] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'name' @ [51:55] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'mapping' @ [54:12] ==> val mapping: HashMap<File, File> /* = HashMap<File, File> */ defined in org.jetbrains.kotlin.incremental.testingUtils.copyTestSources[LocalVariableDescriptor]

'fileName' @ [67:30] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'indexOf' @ [67:39] ==> public fun CharSequence.indexOf(string: String, startIndex: Int = ..., ignoreCase: Boolean = ...): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'underscore' @ [69:17] ==> val underscore: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[LocalVariableDescriptor]

'-' @ [69:31] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'fileName' @ [70:30] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'substring' @ [70:39] ==> @InlineOnly public inline fun String.substring(startIndex: Int, endIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'underscore' @ [70:52] ==> val underscore: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[LocalVariableDescriptor]

'assert' @ [72:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'moduleNames' @ [72:24] ==> value-parameter moduleNames: Collection<String>? defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'assert' @ [73:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'module' @ [73:24] ==> val module: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[LocalVariableDescriptor]

'moduleNames' @ [73:34] ==> value-parameter moduleNames: Collection<String>? defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'fileName' @ [73:92] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'Pair' @ [75:24] ==> public constructor Pair<out A, out B>(first: String, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> String
    <out B> -> String

'module' @ [75:29] ==> val module: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[LocalVariableDescriptor]

'fileName' @ [75:37] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'substring' @ [75:46] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'underscore' @ [75:56] ==> val underscore: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[LocalVariableDescriptor]

'assert' @ [78:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'moduleNames' @ [78:20] ==> value-parameter moduleNames: Collection<String>? defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'fileName' @ [78:98] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'Pair' @ [79:20] ==> public constructor Pair<out A, out B>(first: Nothing?, second: String) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing?
    <out B> -> String

'fileName' @ [79:31] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.splitToModuleNameAndFileName[ValueParameterDescriptorImpl]

'mapOf' @ [82:21] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, (String, File) -> Modification>): Map<String, (String, File) -> Modification> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function2<String, File, Modification>

'newSuffix' @ [83:17] ==> value-parameter newSuffix: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[ValueParameterDescriptorImpl]

'ModifyContent' @ [83:46] ==> public constructor ModifyContent(path: String, dataFile: File) defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[ClassConstructorDescriptorImpl]

'path' @ [83:60] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [83:66] ==> value-parameter file: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'touchSuffix' @ [84:17] ==> value-parameter touchSuffix: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[ValueParameterDescriptorImpl]

'TouchFile' @ [84:45] ==> public constructor TouchFile(path: String, touchPolicy: TouchPolicy) defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile[ClassConstructorDescriptorImpl]

'path' @ [84:55] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'touchPolicy' @ [84:61] ==> value-parameter touchPolicy: TouchPolicy defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'deleteSuffix' @ [85:17] ==> value-parameter deleteSuffix: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[ValueParameterDescriptorImpl]

'DeleteFile' @ [85:46] ==> public constructor DeleteFile(path: String) defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile[ClassConstructorDescriptorImpl]

'path' @ [85:57] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'ArrayList' @ [88:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Modification

'testDataDir' @ [90:22] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'walkTopDown' @ [90:34] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'!' @ [91:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'file' @ [91:18] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'isFile' @ [91:23] ==> public final val File.isFile: Boolean[MyPropertyDescriptor]

'file' @ [93:36] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'toRelativeString' @ [93:41] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'testDataDir' @ [93:58] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'component1' @ [95:18] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, (String, File) -> Modification>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function2<String, File, Modification>

'component2' @ [95:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, (String, File) -> Modification>.component2(): (String, File) -> Modification defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Function2<String, File, Modification>

'rules' @ [95:48] ==> val rules: Map<String, (String, File) -> Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'entries' @ [95:54] ==> public abstract val entries: Set<Map.Entry<String, (String, File) -> Modification>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'firstOrNull' @ [95:62] ==> public inline fun <T> Iterable<Map.Entry<String, (String, File) -> Modification>>.firstOrNull(predicate: (Map.Entry<String, (String, File) -> Modification>) -> Boolean): Map.Entry<String, (String, File) -> Modification>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<String, Function2<String, File, Modification>>

'file' @ [95:76] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'path' @ [95:81] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [95:86] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [95:95] ==> value-parameter it: Map.Entry<String, (String, File) -> Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [95:98] ==> public abstract val key: String defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'component1' @ [97:18] ==> public final operator fun component1(): String? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [97:30] ==> public final operator fun component2(): String defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'splitToModuleNameAndFileName' @ [97:42] ==> local final fun splitToModuleNameAndFileName(fileName: String): Pair<String?, String> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[SimpleFunctionDescriptorImpl]

'relativeFilePath' @ [97:71] ==> val relativeFilePath: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'moduleName' @ [98:26] ==> val moduleName: String? defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'let' @ [98:38] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [98:46] ==> value-parameter it: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration.<anonymous>[ValueParameterDescriptorImpl]

'modifications' @ [99:13] ==> val modifications: ArrayList<Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'add' @ [99:27] ==> public open fun add(element: Modification): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'invoke' @ [99:31] ==> public abstract operator fun invoke(p1: String, p2: File): Modification defined in kotlin.Function2[FunctionInvokeDescriptor]

'srcDir' @ [99:50] ==> val srcDir: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'fileName' @ [99:65] ==> val fileName: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'removeSuffix' @ [99:74] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'suffix' @ [99:87] ==> val suffix: String defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'file' @ [99:96] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'modifications' @ [102:16] ==> val modifications: ArrayList<Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.getModificationsForIteration[LocalVariableDescriptor]

'testDataDir' @ [105:35] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'walkTopDown' @ [105:47] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'any' @ [105:61] ==> public inline fun <T> Sequence<File>.any(predicate: (File) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [105:67] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [105:70] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'matches' @ [105:75] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'COMMANDS_AS_REGEX_PART' @ [105:91] ==> private val COMMANDS_AS_REGEX_PART: String defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'toRegex' @ [105:117] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'testDataDir' @ [106:32] ==> value-parameter testDataDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'walkTopDown' @ [106:44] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'any' @ [106:58] ==> public inline fun <T> Sequence<File>.any(predicate: (File) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [106:64] ==> value-parameter it: File defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [106:67] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'matches' @ [106:72] ==> @InlineOnly public infix inline fun CharSequence.matches(regex: Regex): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'COMMANDS_AS_REGEX_PART' @ [106:88] ==> private val COMMANDS_AS_REGEX_PART: String defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'toRegex' @ [106:121] ==> @InlineOnly public inline fun String.toRegex(): Regex defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'haveFilesWithoutNumbers' @ [108:9] ==> val haveFilesWithoutNumbers: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[LocalVariableDescriptor]

'haveFilesWithNumbers' @ [108:36] ==> val haveFilesWithNumbers: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[LocalVariableDescriptor]

'IllegalStateException' @ [109:15] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'COMMANDS_AS_MESSAGE_PART' @ [109:109] ==> private val COMMANDS_AS_MESSAGE_PART: String defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'!' @ [111:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'haveFilesWithoutNumbers' @ [111:10] ==> val haveFilesWithoutNumbers: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[LocalVariableDescriptor]

'!' @ [111:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'haveFilesWithNumbers' @ [111:38] ==> val haveFilesWithNumbers: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[LocalVariableDescriptor]

'if (allowNoFilesWithSuffixInTestData) {
            return listOf(listOf())
        }
        else {
            throw IllegalStateException("Bad test data format: no files ending with ${COMMANDS_AS_MESSAGE_PART} found")
        }' @ [112:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'allowNoFilesWithSuffixInTestData' @ [112:13] ==> value-parameter allowNoFilesWithSuffixInTestData: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[ValueParameterDescriptorImpl]

'listOf' @ [113:20] ==> public fun <T> listOf(element: List<Modification>): List<List<Modification>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Modification>

'listOf' @ [113:27] ==> @InlineOnly public inline fun <T> listOf(): List<Modification> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'IllegalStateException' @ [116:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'COMMANDS_AS_MESSAGE_PART' @ [116:87] ==> private val COMMANDS_AS_MESSAGE_PART: String defined in org.jetbrains.kotlin.incremental.testingUtils in file incrementalModificationUtils.kt[PropertyDescriptorImpl]

'if (haveFilesWithoutNumbers) {
        return listOf(getModificationsForIteration(".new", ".touch", ".delete"))
    }
    else {
        return (1..10)
                .map { getModificationsForIteration(".new.$it", ".touch.$it", ".delete.$it") }
                .filter { it.isNotEmpty() }
    }' @ [120:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'haveFilesWithoutNumbers' @ [120:9] ==> val haveFilesWithoutNumbers: Boolean defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[LocalVariableDescriptor]

'listOf' @ [121:16] ==> public fun <T> listOf(element: List<Modification>): List<List<Modification>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Modification>

'getModificationsForIteration' @ [121:23] ==> local final fun getModificationsForIteration(newSuffix: String, touchSuffix: String, deleteSuffix: String): List<Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[SimpleFunctionDescriptorImpl]

'..' @ [124:17] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'map' @ [125:18] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> List<Modification>): List<List<Modification>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> List<Modification>

'getModificationsForIteration' @ [125:24] ==> local final fun getModificationsForIteration(newSuffix: String, touchSuffix: String, deleteSuffix: String): List<Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform[SimpleFunctionDescriptorImpl]

'it' @ [125:60] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [125:74] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [125:89] ==> value-parameter it: Int defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [126:18] ==> public inline fun <T> Iterable<List<Modification>>.filter(predicate: (List<Modification>) -> Boolean): List<List<Modification>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Modification>

'it' @ [126:27] ==> value-parameter it: List<Modification> defined in org.jetbrains.kotlin.incremental.testingUtils.getModificationsToPerform.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [126:30] ==> @InlineOnly public inline fun <T> Collection<Modification>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'this' @ [133:42] ==> <this> defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[LazyClassReceiverParameterDescriptor]

'java' @ [133:54] ==> public val <T> KClass<out Modification>.java: Class<out Modification> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Modification)

'simpleName' @ [133:59] ==> public final val <T : (Any..Any?)> Class<out Modification>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Modification)

'path' @ [133:72] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[PropertyDescriptorImpl]

'Modification' @ [136:57] ==> public constructor Modification(path: String) defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[ClassConstructorDescriptorImpl]

'path' @ [136:70] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.<init>[ValueParameterDescriptorImpl]

'File' @ [138:20] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [138:25] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[ValueParameterDescriptorImpl]

'path' @ [138:34] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[PropertyDescriptorImpl]

'file' @ [140:31] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'lastModified' @ [140:36] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'file' @ [141:9] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'delete' @ [141:14] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'dataFile' @ [142:9] ==> public final val dataFile: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[PropertyDescriptorImpl]

'copyTo' @ [142:18] ==> public fun File.copyTo(target: File, overwrite: Boolean = ..., bufferSize: Int = ...): File defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [142:25] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'file' @ [144:31] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'lastModified' @ [144:36] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'newLastModified' @ [145:13] ==> val newLastModified: Long defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'oldLastModified' @ [145:32] ==> val oldLastModified: Long defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'file' @ [147:13] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'setLastModified' @ [147:18] ==> public open fun setLastModified(p0: Long): Boolean defined in java.io.File[JavaMethodDescriptor]

'oldLastModified' @ [147:34] ==> val oldLastModified: Long defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'mapping' @ [150:9] ==> value-parameter mapping: MutableMap<File, File> defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[ValueParameterDescriptorImpl]

'file' @ [150:17] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'dataFile' @ [150:25] ==> public final val dataFile: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent[PropertyDescriptorImpl]

'file' @ [151:16] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.ModifyContent.perform[LocalVariableDescriptor]

'Modification' @ [155:71] ==> public constructor Modification(path: String) defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[ClassConstructorDescriptorImpl]

'path' @ [155:84] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.<init>[ValueParameterDescriptorImpl]

'File' @ [157:20] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [157:25] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[ValueParameterDescriptorImpl]

'path' @ [157:34] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile[PropertyDescriptorImpl]

'when (touchPolicy) {
            TouchPolicy.TIMESTAMP -> {
                val oldLastModified = file.lastModified()
                //Mac OS and some versions of Linux truncate timestamp to nearest second
                file.setLastModified(Math.max(System.currentTimeMillis(), oldLastModified + 1000))
            }
            TouchPolicy.CHECKSUM -> {
                file.appendText(" ")
            }
        }' @ [159:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'touchPolicy' @ [159:15] ==> private final val touchPolicy: TouchPolicy defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile[PropertyDescriptorImpl]

'TIMESTAMP' @ [160:25] ==> enum entry TIMESTAMP defined in org.jetbrains.kotlin.incremental.testingUtils.TouchPolicy[FakeCallableDescriptorForObject]

'file' @ [161:39] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[LocalVariableDescriptor]

'lastModified' @ [161:44] ==> public open fun lastModified(): Long defined in java.io.File[JavaMethodDescriptor]

'file' @ [163:17] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[LocalVariableDescriptor]

'setLastModified' @ [163:22] ==> public open fun setLastModified(p0: Long): Boolean defined in java.io.File[JavaMethodDescriptor]

'max' @ [163:43] ==> public open fun max(p0: Long, p1: Long): Long defined in java.lang.Math[JavaMethodDescriptor]

'currentTimeMillis' @ [163:54] ==> public open fun currentTimeMillis(): Long defined in java.lang.System[JavaMethodDescriptor]

'oldLastModified' @ [163:75] ==> val oldLastModified: Long defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[LocalVariableDescriptor]

'CHECKSUM' @ [165:25] ==> enum entry CHECKSUM defined in org.jetbrains.kotlin.incremental.testingUtils.TouchPolicy[FakeCallableDescriptorForObject]

'file' @ [166:17] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[LocalVariableDescriptor]

'appendText' @ [166:22] ==> public fun File.appendText(text: String, charset: Charset = ...): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'file' @ [170:16] ==> val file: File defined in org.jetbrains.kotlin.incremental.testingUtils.TouchFile.perform[LocalVariableDescriptor]

'Modification' @ [174:34] ==> public constructor Modification(path: String) defined in org.jetbrains.kotlin.incremental.testingUtils.Modification[ClassConstructorDescriptorImpl]

'path' @ [174:47] ==> value-parameter path: String defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.<init>[ValueParameterDescriptorImpl]

'File' @ [176:28] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'workDir' @ [176:33] ==> value-parameter workDir: File defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.perform[ValueParameterDescriptorImpl]

'path' @ [176:42] ==> public final val path: String defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile[PropertyDescriptorImpl]

'!' @ [177:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'fileToDelete' @ [177:14] ==> val fileToDelete: File defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.perform[LocalVariableDescriptor]

'delete' @ [177:27] ==> public open fun delete(): Boolean defined in java.io.File[JavaMethodDescriptor]

'AssertionError' @ [178:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'fileToDelete' @ [178:52] ==> val fileToDelete: File defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.perform[LocalVariableDescriptor]

'mapping' @ [181:9] ==> value-parameter mapping: MutableMap<File, File> defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.perform[ValueParameterDescriptorImpl]

'remove' @ [181:17] ==> public abstract fun remove(key: File): File? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'fileToDelete' @ [181:24] ==> val fileToDelete: File defined in org.jetbrains.kotlin.incremental.testingUtils.DeleteFile.perform[LocalVariableDescriptor]

