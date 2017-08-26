'ExceptionFilter' @ [33:35] ==> public constructor ExceptionFilter(@NotNull p0: GlobalSearchScope) defined in com.intellij.execution.filters.ExceptionFilter[JavaClassConstructorDescriptor]

'searchScope' @ [33:51] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'exceptionFilter' @ [36:22] ==> private final val exceptionFilter: ExceptionFilter defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'applyFilter' @ [36:38] ==> public open fun applyFilter(p0: (String..String?), p1: Int): Filter.Result? defined in com.intellij.execution.filters.ExceptionFilter[JavaMethodDescriptor]

'line' @ [36:50] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.applyFilter[ValueParameterDescriptorImpl]

'entireLength' @ [36:56] ==> value-parameter entireLength: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.applyFilter[ValueParameterDescriptorImpl]

'if (result == null) null else patchResult(result, line)' @ [37:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Filter.Result?, elseBranch: Filter.Result?): Filter.Result?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Result?

'result' @ [37:20] ==> val result: Filter.Result? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.applyFilter[LocalVariableDescriptor]

'patchResult' @ [37:46] ==> private final fun patchResult(result: Filter.Result, line: String): Filter.Result defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[SimpleFunctionDescriptorImpl]

'result' @ [37:58] ==> val result: Filter.Result? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.applyFilter[LocalVariableDescriptor]

'line' @ [37:66] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.applyFilter[ValueParameterDescriptorImpl]

'createHyperlinkInfo' @ [41:32] ==> private final fun createHyperlinkInfo(line: String, defaultResult: Filter.Result): HyperlinkInfo? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[SimpleFunctionDescriptorImpl]

'line' @ [41:52] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult[ValueParameterDescriptorImpl]

'result' @ [41:58] ==> value-parameter result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult[ValueParameterDescriptorImpl]

'result' @ [41:76] ==> value-parameter result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult[ValueParameterDescriptorImpl]

'Result' @ [43:23] ==> public constructor Result(@NotNull p0: (MutableList<(Filter.ResultItem..Filter.ResultItem?)>..List<(Filter.ResultItem..Filter.ResultItem?)>)) defined in com.intellij.execution.filters.Filter.Result[JavaClassConstructorDescriptor]

'result' @ [43:30] ==> value-parameter result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult[ValueParameterDescriptorImpl]

'resultItems' @ [43:37] ==> public final val Filter.Result.resultItems: (MutableList<(Filter.ResultItem..Filter.ResultItem?)>..List<(Filter.ResultItem..Filter.ResultItem?)>)[MyPropertyDescriptor]

'map' @ [43:49] ==> public inline fun <T, R> Iterable<(Filter.ResultItem..Filter.ResultItem?)>.map(transform: ((Filter.ResultItem..Filter.ResultItem?)) -> Filter.ResultItem): List<Filter.ResultItem> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.execution.filters.Filter.ResultItem..com.intellij.execution.filters.Filter.ResultItem?)
    <R> -> ResultItem

'ResultItem' @ [44:20] ==> public constructor ResultItem(p0: Int, p1: Int, @Nullable p2: HyperlinkInfo?, @Nullable p3: TextAttributes?) defined in com.intellij.execution.filters.Filter.ResultItem[JavaClassConstructorDescriptor]

'it' @ [44:31] ==> value-parameter it: (Filter.ResultItem..Filter.ResultItem?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult.<anonymous>[ValueParameterDescriptorImpl]

'getHighlightStartOffset' @ [44:34] ==> public open fun getHighlightStartOffset(): Int defined in com.intellij.execution.filters.Filter.ResultItem[JavaMethodDescriptor]

'it' @ [44:61] ==> value-parameter it: (Filter.ResultItem..Filter.ResultItem?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult.<anonymous>[ValueParameterDescriptorImpl]

'getHighlightEndOffset' @ [44:64] ==> public open fun getHighlightEndOffset(): Int defined in com.intellij.execution.filters.Filter.ResultItem[JavaMethodDescriptor]

'newHyperlinkInfo' @ [44:89] ==> val newHyperlinkInfo: HyperlinkInfo defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult[LocalVariableDescriptor]

'it' @ [44:107] ==> value-parameter it: (Filter.ResultItem..Filter.ResultItem?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.patchResult.<anonymous>[ValueParameterDescriptorImpl]

'getHighlightAttributes' @ [44:110] ==> @Nullable public open fun getHighlightAttributes(): TextAttributes? defined in com.intellij.execution.filters.Filter.ResultItem[JavaMethodDescriptor]

'searchScope' @ [49:23] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'project' @ [49:35] ==> public final val GlobalSearchScope.project: Project?[MyPropertyDescriptor]

'parseStackTraceLine' @ [51:33] ==> private final fun parseStackTraceLine(line: String): StackTraceElement? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion[SimpleFunctionDescriptorImpl]

'line' @ [51:53] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[ValueParameterDescriptorImpl]

'stackTraceElement' @ [60:24] ==> val stackTraceElement: StackTraceElement defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'fileName' @ [60:42] ==> public final val StackTraceElement.fileName: (String..String?)[MyPropertyDescriptor]

'getExtension' @ [62:36] ==> @NotNull public open fun getExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'fileName' @ [62:49] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'toLowerCase' @ [62:59] ==> @InlineOnly public inline fun String.toLowerCase(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'extension' @ [63:13] ==> val extension: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'KOTLIN_EXTENSIONS' @ [63:49] ==> public final val KOTLIN_EXTENSIONS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.kotlin.idea.KotlinFileTypeFactory[JavaPropertyDescriptor]

'stackTraceElement' @ [66:34] ==> val stackTraceElement: StackTraceElement defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'className' @ [66:52] ==> public final val StackTraceElement.className: (String..String?)[MyPropertyDescriptor]

'stackTraceElement' @ [67:26] ==> val stackTraceElement: StackTraceElement defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'lineNumber' @ [67:44] ==> public final val StackTraceElement.lineNumber: Int[MyPropertyDescriptor]

'fullyQualifiedName' @ [69:28] ==> val fullyQualifiedName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'replace' @ [69:47] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'byInternalName' @ [70:41] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'internalName' @ [70:56] ==> val internalName: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'DebuggerUtils' @ [72:20] ==> public object DebuggerUtils defined in org.jetbrains.kotlin.idea.debugger in file DebuggerUtils.kt[FakeCallableDescriptorForObject]

'findSourceFileForClassIncludeLibrarySources' @ [72:34] ==> public final fun findSourceFileForClassIncludeLibrarySources(project: Project, scope: GlobalSearchScope, className: JvmClassName, fileName: String): KtFile? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'project' @ [72:78] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'searchScope' @ [72:87] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'jvmClassName' @ [72:100] ==> val jvmClassName: JvmClassName defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'fileName' @ [72:114] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'file' @ [74:13] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'defaultResult' @ [78:40] ==> value-parameter defaultResult: Filter.Result defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[ValueParameterDescriptorImpl]

'resultItems' @ [78:54] ==> public final val Filter.Result.resultItems: (MutableList<(Filter.ResultItem..Filter.ResultItem?)>..List<(Filter.ResultItem..Filter.ResultItem?)>)[MyPropertyDescriptor]

'mapNotNullTo' @ [78:66] ==> public inline fun <T, R : Any, C : MutableCollection<in String>> Iterable<(Filter.ResultItem..Filter.ResultItem?)>.mapNotNullTo(destination: HashSet<String>, transform: ((Filter.ResultItem..Filter.ResultItem?)) -> String?): HashSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.execution.filters.Filter.ResultItem..com.intellij.execution.filters.Filter.ResultItem?)
    <R : Any> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'HashSet' @ [78:79] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'it' @ [78:93] ==> value-parameter it: (Filter.ResultItem..Filter.ResultItem?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [78:120] ==> public final val FileHyperlinkInfo.descriptor: OpenFileDescriptor?[MyPropertyDescriptor]

'file' @ [78:132] ==> public final val OpenFileDescriptor.file: VirtualFile[MyPropertyDescriptor]

'name' @ [78:138] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'!' @ [79:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'defaultLinkFileNames' @ [79:18] ==> val defaultLinkFileNames: HashSet<String> defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'contains' @ [79:39] ==> public open fun contains(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'fileName' @ [79:48] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'getFilesByName' @ [80:49] ==> @NotNull public open fun getFilesByName(p0: (Project..Project?), p1: (String..String?), p2: (GlobalSearchScope..GlobalSearchScope?)): (Array<(PsiFile..PsiFile?)>..Array<out (PsiFile..PsiFile?)>) defined in com.intellij.psi.search.FilenameIndex[JavaMethodDescriptor]

'project' @ [80:64] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'fileName' @ [80:73] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'searchScope' @ [80:83] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'mapNotNullTo' @ [80:96] ==> public inline fun <T, R : Any, C : MutableCollection<in VirtualFile>> Array<out (PsiFile..PsiFile?)>.mapNotNullTo(destination: HashSet<VirtualFile>, transform: ((PsiFile..PsiFile?)) -> VirtualFile?): HashSet<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiFile..com.intellij.psi.PsiFile?)
    <R : Any> -> VirtualFile
    <C : MutableCollection<in R>> -> HashSet<VirtualFile>

'HashSet' @ [80:109] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> VirtualFile

'!' @ [81:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [81:26] ==> value-parameter it: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [81:29] ==> public final val PsiFile.isValid: Boolean[MyPropertyDescriptor]

'it' @ [82:21] ==> value-parameter it: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [82:24] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'filesByName' @ [85:21] ==> val filesByName: HashSet<VirtualFile> defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'isNotEmpty' @ [85:33] ==> @InlineOnly public inline fun <T> Collection<VirtualFile>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'if (filesByName.size > 1) {
                        HyperlinkInfoFactoryImpl.getInstance().createMultipleFilesHyperlinkInfo(filesByName.toList(), lineNumber, project)
                    }
                    else {
                        OpenFileHyperlinkInfo(project, filesByName.first(), lineNumber)
                    }' @ [86:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HyperlinkInfo?, elseBranch: HyperlinkInfo?): HyperlinkInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HyperlinkInfo?

'filesByName' @ [86:32] ==> val filesByName: HashSet<VirtualFile> defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'size' @ [86:44] ==> public open val size: Int defined in java.util.HashSet[JavaPropertyDescriptor]

'getInstance' @ [87:50] ==> @NotNull public open fun getInstance(): HyperlinkInfoFactory defined in com.intellij.execution.filters.impl.HyperlinkInfoFactoryImpl[JavaMethodDescriptor]

'createMultipleFilesHyperlinkInfo' @ [87:64] ==> @NotNull public abstract fun createMultipleFilesHyperlinkInfo(@NotNull p0: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>), p1: Int, @NotNull p2: Project): HyperlinkInfo defined in com.intellij.execution.filters.HyperlinkInfoFactory[JavaMethodDescriptor]

'filesByName' @ [87:97] ==> val filesByName: HashSet<VirtualFile> defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'toList' @ [87:109] ==> public fun <T> Iterable<VirtualFile>.toList(): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'lineNumber' @ [87:119] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'project' @ [87:131] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'OpenFileHyperlinkInfo' @ [90:25] ==> public constructor OpenFileHyperlinkInfo(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[JavaClassConstructorDescriptor]

'project' @ [90:47] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'filesByName' @ [90:56] ==> val filesByName: HashSet<VirtualFile> defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'first' @ [90:68] ==> public fun <T> Iterable<VirtualFile>.first(): VirtualFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'lineNumber' @ [90:77] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'file' @ [98:27] ==> val file: KtFile? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'virtualFile' @ [98:32] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'createHyperlinks' @ [100:38] ==> private final fun createHyperlinks(jvmName: JvmClassName, file: VirtualFile, line: Int, project: Project): InlineFunctionHyperLinkInfo? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[SimpleFunctionDescriptorImpl]

'jvmClassName' @ [100:55] ==> val jvmClassName: JvmClassName defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'virtualFile' @ [100:69] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'lineNumber' @ [100:82] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'project' @ [100:98] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'hyperlinkInfoForInline' @ [101:13] ==> val hyperlinkInfoForInline: InlineFunctionHyperLinkInfo? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'hyperlinkInfoForInline' @ [102:20] ==> val hyperlinkInfoForInline: InlineFunctionHyperLinkInfo? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'OpenFileHyperlinkInfo' @ [105:16] ==> public constructor OpenFileHyperlinkInfo(@NotNull p0: Project, @NotNull p1: VirtualFile, p2: Int) defined in com.intellij.execution.filters.OpenFileHyperlinkInfo[JavaClassConstructorDescriptor]

'project' @ [105:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'virtualFile' @ [105:47] ==> val virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'lineNumber' @ [105:60] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinkInfo[LocalVariableDescriptor]

'!' @ [109:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlineFunctionLineNumber' @ [109:14] ==> public fun isInlineFunctionLineNumber(file: VirtualFile, lineNumber: Int, project: Project): Boolean defined in org.jetbrains.kotlin.idea.debugger in file NoStrataPositionManagerHelper.kt[SimpleFunctionDescriptorImpl]

'file' @ [109:41] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'line' @ [109:47] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'project' @ [109:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'readBytecodeInfo' @ [111:25] ==> public fun readBytecodeInfo(project: Project, jvmName: JvmClassName, file: VirtualFile): BytecodeDebugInfo? defined in org.jetbrains.kotlin.idea.debugger in file NoStrataPositionManagerHelper.kt[SimpleFunctionDescriptorImpl]

'project' @ [111:42] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'jvmName' @ [111:51] ==> value-parameter jvmName: JvmClassName defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'file' @ [111:60] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'debugInfo' @ [112:24] ==> val debugInfo: BytecodeDebugInfo defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'smapData' @ [112:34] ==> public final val smapData: SmapData? defined in org.jetbrains.kotlin.idea.debugger.BytecodeDebugInfo[PropertyDescriptorImpl]

'arrayListOf' @ [114:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> /* = ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineInfo

'component1' @ [116:14] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [116:38] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'mapStacktraceLineToSource' @ [117:17] ==> public fun mapStacktraceLineToSource(smapData: SmapData, line: Int, project: Project, lineKind: SourceLineKind, searchScope: GlobalSearchScope): Pair<KtFile, Int>? defined in org.jetbrains.kotlin.idea.debugger in file smapUtil.kt[SimpleFunctionDescriptorImpl]

'smapData' @ [117:43] ==> val smapData: SmapData defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'line' @ [117:53] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'project' @ [117:59] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'EXECUTED_LINE' @ [117:83] ==> enum entry EXECUTED_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'searchScope' @ [117:98] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'inlineInfos' @ [119:9] ==> val inlineInfos: ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> /* = ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> */ defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'add' @ [119:21] ==> public open fun add(element: InlineFunctionHyperLinkInfo.InlineInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'InlineFunctionBodyInfo' @ [119:64] ==> public constructor InlineFunctionBodyInfo(file: VirtualFile, line: Int) defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.InlineFunctionBodyInfo[ClassConstructorDescriptorImpl]

'inlineFunctionBodyFile' @ [120:17] ==> val inlineFunctionBodyFile: KtFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'virtualFile' @ [120:40] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'inlineFunctionBodyLine' @ [121:17] ==> val inlineFunctionBodyLine: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'mapStacktraceLineToSource' @ [123:33] ==> public fun mapStacktraceLineToSource(smapData: SmapData, line: Int, project: Project, lineKind: SourceLineKind, searchScope: GlobalSearchScope): Pair<KtFile, Int>? defined in org.jetbrains.kotlin.idea.debugger in file smapUtil.kt[SimpleFunctionDescriptorImpl]

'smapData' @ [123:59] ==> val smapData: SmapData defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'line' @ [123:69] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'project' @ [123:75] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'CALL_LINE' @ [123:99] ==> enum entry CALL_LINE defined in org.jetbrains.kotlin.idea.debugger.SourceLineKind[FakeCallableDescriptorForObject]

'searchScope' @ [123:110] ==> private final val searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter[PropertyDescriptorImpl]

'inlineFunCallInfo' @ [124:13] ==> val inlineFunCallInfo: Pair<KtFile, Int>? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'component1' @ [125:18] ==> public final operator fun component1(): KtFile defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [125:32] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'inlineFunCallInfo' @ [125:48] ==> val inlineFunCallInfo: Pair<KtFile, Int>? defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'inlineInfos' @ [126:13] ==> val inlineInfos: ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> /* = ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> */ defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'add' @ [126:25] ==> public open fun add(element: InlineFunctionHyperLinkInfo.InlineInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'CallSiteInfo' @ [126:68] ==> public constructor CallSiteInfo(file: VirtualFile, line: Int) defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo.InlineInfo.CallSiteInfo[ClassConstructorDescriptorImpl]

'callSiteFile' @ [126:81] ==> val callSiteFile: KtFile defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'virtualFile' @ [126:94] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'callSiteLine' @ [126:107] ==> val callSiteLine: Int defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'InlineFunctionHyperLinkInfo' @ [129:16] ==> public constructor InlineFunctionHyperLinkInfo(project: Project, inlineInfo: List<InlineFunctionHyperLinkInfo.InlineInfo>) defined in org.jetbrains.kotlin.idea.filters.InlineFunctionHyperLinkInfo[ClassConstructorDescriptorImpl]

'project' @ [129:44] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[ValueParameterDescriptorImpl]

'inlineInfos' @ [129:53] ==> val inlineInfos: ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> /* = ArrayList<InlineFunctionHyperLinkInfo.InlineInfo> */ defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.createHyperlinks[LocalVariableDescriptor]

'compile' @ [135:59] ==> public open fun compile(p0: (String..String?)): (Pattern..Pattern?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'STACK_TRACE_ELEMENT_PATTERN' @ [138:27] ==> private final val STACK_TRACE_ELEMENT_PATTERN: (Pattern..Pattern?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion[PropertyDescriptorImpl]

'matcher' @ [138:55] ==> public open fun matcher(p0: (CharSequence..CharSequence?)): (Matcher..Matcher?) defined in java.util.regex.Pattern[JavaMethodDescriptor]

'line' @ [138:63] ==> value-parameter line: String defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[ValueParameterDescriptorImpl]

'matcher' @ [139:17] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'matches' @ [139:25] ==> public open fun matches(): Boolean defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [140:38] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'group' @ [140:46] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [141:34] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'group' @ [141:42] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [142:32] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'group' @ [142:40] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'matcher' @ [143:34] ==> val matcher: (Matcher..Matcher?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'group' @ [143:42] ==> public open fun group(p0: Int): (String..String?) defined in java.util.regex.Matcher[JavaMethodDescriptor]

'StackTraceElement' @ [145:24] ==> public constructor StackTraceElement(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Int) defined in java.lang.StackTraceElement[JavaClassConstructorDescriptor]

'declaringClass' @ [145:42] ==> val declaringClass: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'methodName' @ [145:58] ==> val methodName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'fileName' @ [145:70] ==> val fileName: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

'parseInt' @ [145:88] ==> public open fun parseInt(p0: (String..String?)): Int defined in java.lang.Integer[JavaMethodDescriptor]

'lineNumber' @ [145:97] ==> val lineNumber: (String..String?) defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilter.Companion.parseStackTraceLine[LocalVariableDescriptor]

