'hashMapOf' @ [31:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<KtFile, ReplState.LineInfo> /* = HashMap<KtFile, ReplState.LineInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> LineInfo

'arrayListOf' @ [32:35] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SuccessfulLine

'successfulLines' @ [35:17] ==> private final val successfulLines: ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'size' @ [35:33] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'SubmittedLine' @ [38:29] ==> public constructor SubmittedLine(linePsi: KtFile, parentLine: ReplState.LineInfo.SuccessfulLine?) defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo.SubmittedLine[ClassConstructorDescriptorImpl]

'ktFile' @ [38:43] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[ValueParameterDescriptorImpl]

'successfulLines' @ [38:51] ==> private final val successfulLines: ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'lastOrNull' @ [38:67] ==> public fun <T> List<ReplState.LineInfo.SuccessfulLine>.lastOrNull(): ReplState.LineInfo.SuccessfulLine? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SuccessfulLine

'lines' @ [39:9] ==> private final val lines: HashMap<KtFile, ReplState.LineInfo> /* = HashMap<KtFile, ReplState.LineInfo> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'ktFile' @ [39:15] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[ValueParameterDescriptorImpl]

'line' @ [39:25] ==> val line: ReplState.LineInfo.SubmittedLine defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[LocalVariableDescriptor]

'ktFile' @ [40:9] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[ValueParameterDescriptorImpl]

'fileScopesCustomizer' @ [40:16] ==> public var KtFile.fileScopesCustomizer: FileScopesCustomizer? defined in org.jetbrains.kotlin.resolve.lazy in file FileScopeProvider.kt[PropertyDescriptorImpl]

'lineInfo' @ [42:24] ==> private final fun lineInfo(ktFile: KtFile): ReplState.LineInfo? defined in org.jetbrains.kotlin.resolve.repl.ReplState[SimpleFunctionDescriptorImpl]

'ktFile' @ [42:33] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[ValueParameterDescriptorImpl]

'let' @ [42:42] ==> @InlineOnly public inline fun <T, R> ReplState.LineInfo.let(block: (ReplState.LineInfo) -> FileScopes?): FileScopes? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LineInfo
    <R> -> FileScopes?

'computeFileScopes' @ [42:48] ==> private final fun computeFileScopes(lineInfo: ReplState.LineInfo, fileScopeFactory: FileScopeFactory): FileScopes? defined in org.jetbrains.kotlin.resolve.repl.ReplState[SimpleFunctionDescriptorImpl]

'it' @ [42:66] ==> value-parameter it: ReplState.LineInfo defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine.<no name provided>.createFileScopes.<anonymous>[ValueParameterDescriptorImpl]

'fileScopeFactory' @ [42:70] ==> value-parameter fileScopeFactory: FileScopeFactory defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine.<no name provided>.createFileScopes[ValueParameterDescriptorImpl]

'fileScopeFactory' @ [42:93] ==> value-parameter fileScopeFactory: FileScopeFactory defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine.<no name provided>.createFileScopes[ValueParameterDescriptorImpl]

'createScopesForFile' @ [42:110] ==> public final fun createScopesForFile(file: KtFile, existingImports: ImportingScope? = ...): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeFactory[SimpleFunctionDescriptorImpl]

'ktFile' @ [42:130] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.submitLine[ValueParameterDescriptorImpl]

'SuccessfulLine' @ [48:39] ==> public constructor SuccessfulLine(linePsi: KtFile, parentLine: ReplState.LineInfo.SuccessfulLine?, lineDescriptor: LazyScriptDescriptor) defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo.SuccessfulLine[ClassConstructorDescriptorImpl]

'ktFile' @ [48:54] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineSuccess[ValueParameterDescriptorImpl]

'successfulLines' @ [48:62] ==> private final val successfulLines: ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'lastOrNull' @ [48:78] ==> public fun <T> List<ReplState.LineInfo.SuccessfulLine>.lastOrNull(): ReplState.LineInfo.SuccessfulLine? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SuccessfulLine

'scriptDescriptor' @ [48:92] ==> value-parameter scriptDescriptor: LazyScriptDescriptor defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineSuccess[ValueParameterDescriptorImpl]

'lines' @ [49:9] ==> private final val lines: HashMap<KtFile, ReplState.LineInfo> /* = HashMap<KtFile, ReplState.LineInfo> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'ktFile' @ [49:15] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineSuccess[ValueParameterDescriptorImpl]

'successfulLine' @ [49:25] ==> val successfulLine: ReplState.LineInfo.SuccessfulLine defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineSuccess[LocalVariableDescriptor]

'successfulLines' @ [50:9] ==> private final val successfulLines: ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'add' @ [50:25] ==> public open fun add(element: ReplState.LineInfo.SuccessfulLine): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'successfulLine' @ [50:29] ==> val successfulLine: ReplState.LineInfo.SuccessfulLine defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineSuccess[LocalVariableDescriptor]

'lines' @ [54:9] ==> private final val lines: HashMap<KtFile, ReplState.LineInfo> /* = HashMap<KtFile, ReplState.LineInfo> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'ktFile' @ [54:15] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineFailure[ValueParameterDescriptorImpl]

'FailedLine' @ [54:34] ==> public constructor FailedLine(linePsi: KtFile, parentLine: ReplState.LineInfo.SuccessfulLine?) defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo.FailedLine[ClassConstructorDescriptorImpl]

'ktFile' @ [54:45] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineFailure[ValueParameterDescriptorImpl]

'successfulLines' @ [54:53] ==> private final val successfulLines: ArrayList<ReplState.LineInfo.SuccessfulLine> /* = ArrayList<ReplState.LineInfo.SuccessfulLine> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'lastOrNull' @ [54:69] ==> public fun <T> List<ReplState.LineInfo.SuccessfulLine>.lastOrNull(): ReplState.LineInfo.SuccessfulLine? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SuccessfulLine

'lines' @ [57:44] ==> private final val lines: HashMap<KtFile, ReplState.LineInfo> /* = HashMap<KtFile, ReplState.LineInfo> */ defined in org.jetbrains.kotlin.resolve.repl.ReplState[PropertyDescriptorImpl]

'ktFile' @ [57:50] ==> value-parameter ktFile: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.lineInfo[ValueParameterDescriptorImpl]

'LineInfo' @ [64:103] ==> private constructor LineInfo() defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo[ClassConstructorDescriptorImpl]

'LineInfo' @ [65:146] ==> private constructor LineInfo() defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo[ClassConstructorDescriptorImpl]

'LineInfo' @ [66:100] ==> private constructor LineInfo() defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo[ClassConstructorDescriptorImpl]

'lineInfo' @ [71:41] ==> value-parameter lineInfo: ReplState.LineInfo defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[ValueParameterDescriptorImpl]

'parentLine' @ [71:50] ==> public abstract val parentLine: ReplState.LineInfo.SuccessfulLine? defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo[PropertyDescriptorImpl]

'lineDescriptor' @ [71:62] ==> public final val lineDescriptor: LazyScriptDescriptor defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo.SuccessfulLine[PropertyDescriptorImpl]

'scopeForInitializerResolution' @ [71:78] ==> public final val LazyScriptDescriptor.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'lexicalScopeAfterLastLine' @ [72:31] ==> val lexicalScopeAfterLastLine: LexicalScope defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'parentsWithSelf' @ [72:57] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'firstIsInstance' @ [72:73] ==> public inline fun <reified T> Sequence<*>.firstIsInstance(): ImportingScope defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> ImportingScope

'fileScopeFactory' @ [73:33] ==> value-parameter fileScopeFactory: FileScopeFactory defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[ValueParameterDescriptorImpl]

'createScopesForFile' @ [73:50] ==> public final fun createScopesForFile(file: KtFile, existingImports: ImportingScope? = ...): FileScopes defined in org.jetbrains.kotlin.resolve.lazy.FileScopeFactory[SimpleFunctionDescriptorImpl]

'lineInfo' @ [73:70] ==> value-parameter lineInfo: ReplState.LineInfo defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[ValueParameterDescriptorImpl]

'linePsi' @ [73:79] ==> public abstract val linePsi: KtFile defined in org.jetbrains.kotlin.resolve.repl.ReplState.LineInfo[PropertyDescriptorImpl]

'lastLineImports' @ [73:88] ==> val lastLineImports: ImportingScope defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'lexicalScopeAfterLastLine' @ [74:37] ==> val lexicalScopeAfterLastLine: LexicalScope defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'replaceImportingScopes' @ [74:63] ==> public fun LexicalScope.replaceImportingScopes(importingScopeChain: ImportingScope?): LexicalScope defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'scopesForThisLine' @ [74:86] ==> val scopesForThisLine: FileScopes defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'importingScope' @ [74:104] ==> public final val importingScope: ImportingScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

'FileScopes' @ [75:16] ==> public constructor FileScopes(lexicalScope: LexicalScope, importingScope: ImportingScope, importResolver: ImportResolver) defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[ClassConstructorDescriptorImpl]

'combinedLexicalScopes' @ [75:27] ==> val combinedLexicalScopes: LexicalScope defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'scopesForThisLine' @ [75:50] ==> val scopesForThisLine: FileScopes defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'importingScope' @ [75:68] ==> public final val importingScope: ImportingScope defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

'scopesForThisLine' @ [75:84] ==> val scopesForThisLine: FileScopes defined in org.jetbrains.kotlin.resolve.repl.ReplState.computeFileScopes[LocalVariableDescriptor]

'importResolver' @ [75:102] ==> public final val importResolver: ImportResolver defined in org.jetbrains.kotlin.resolve.lazy.FileScopes[PropertyDescriptorImpl]

