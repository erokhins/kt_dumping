'TextEditorHighlightingPass' @ [42:5] ==> protected/*protected and package*/ constructor TextEditorHighlightingPass(@NotNull p0: Project, @Nullable p1: Document?) defined in com.intellij.codeHighlighting.TextEditorHighlightingPass[JavaClassConstructorDescriptor]

'file' @ [42:32] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.<init>[ValueParameterDescriptorImpl]

'project' @ [42:37] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'document' @ [42:46] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.<init>[ValueParameterDescriptorImpl]

'Unit' @ [43:70] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'document' @ [46:24] ==> public final val ScriptExternalHighlightingPass.document: Document?[MyPropertyDescriptor]

'file' @ [48:23] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[PropertyDescriptorImpl]

'virtualFile' @ [48:28] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'getUserData' @ [48:40] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(List<ScriptReport>..List<ScriptReport>?)>): List<ScriptReport>? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> List<ScriptReport>

'Reports' @ [48:72] ==> public object Reports : Key<List<ScriptReport>> defined in org.jetbrains.kotlin.idea.core.script.IdeScriptReportSink[FakeCallableDescriptorForObject]

'reports' @ [50:27] ==> val reports: List<ScriptReport> defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor[LocalVariableDescriptor]

'mapNotNull' @ [50:35] ==> public inline fun <T, R : Any> Iterable<ScriptReport>.mapNotNull(transform: (ScriptReport) -> Annotation?): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScriptReport
    <R : Any> -> Annotation

'component1' @ [50:49] ==> public final operator fun component1(): String defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedSimpleFunctionDescriptor]

'component2' @ [50:58] ==> public final operator fun component2(): ScriptReport.Severity defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedSimpleFunctionDescriptor]

'component3' @ [50:68] ==> public final operator fun component3(): ScriptReport.Position? defined in kotlin.script.experimental.dependencies.ScriptReport[DeserializedSimpleFunctionDescriptor]

'component1' @ [51:18] ==> public final operator fun component1(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [51:31] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'computeOffsets' @ [51:44] ==> private final fun computeOffsets(document: Document, position: ScriptReport.Position?): Pair<Int, Int>? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'document' @ [51:59] ==> val document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor[LocalVariableDescriptor]

'position' @ [51:69] ==> val position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'Annotation' @ [52:13] ==> public constructor Annotation(p0: Int, p1: Int, @NotNull p2: HighlightSeverity, p3: (String..String?), p4: (String..String?)) defined in com.intellij.lang.annotation.Annotation[JavaClassConstructorDescriptor]

'startOffset' @ [53:21] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [54:21] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'severity' @ [55:21] ==> val severity: ScriptReport.Severity defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'convertSeverity' @ [55:30] ==> private final fun ScriptReport.Severity.convertSeverity(): HighlightSeverity? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'message' @ [56:21] ==> val message: String defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'message' @ [57:21] ==> val message: String defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[LocalVariableDescriptor]

'annotations' @ [61:21] ==> val annotations: List<Annotation> defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor[LocalVariableDescriptor]

'map' @ [61:33] ==> public inline fun <T, R> Iterable<Annotation>.map(transform: (Annotation) -> HighlightInfo): List<HighlightInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation
    <R> -> HighlightInfo

'fromAnnotation' @ [61:53] ==> @NotNull public open fun fromAnnotation(@NotNull p0: Annotation): HighlightInfo defined in com.intellij.codeInsight.daemon.impl.HighlightInfo[JavaMethodDescriptor]

'it' @ [61:68] ==> value-parameter it: Annotation defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor.<anonymous>[ValueParameterDescriptorImpl]

'setHighlightersToEditor' @ [62:32] ==> public open fun setHighlightersToEditor(@NotNull p0: Project, @NotNull p1: Document, p2: Int, p3: Int, @NotNull p4: (MutableCollection<(HighlightInfo..HighlightInfo?)>..Collection<(HighlightInfo..HighlightInfo?)>), @Nullable p5: EditorColorsScheme?, p6: Int): Unit defined in com.intellij.codeInsight.daemon.impl.UpdateHighlightersUtil[JavaMethodDescriptor]

'myProject' @ [62:56] ==> @NotNull protected/*protected and package*/ final val myProject: Project defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[JavaPropertyDescriptor]

'myDocument' @ [62:67] ==> @Nullable protected/*protected and package*/ final val myDocument: Document? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[JavaPropertyDescriptor]

'file' @ [62:84] ==> private final val file: KtFile defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[PropertyDescriptorImpl]

'textLength' @ [62:89] ==> public final val KtFile.textLength: Int[MyPropertyDescriptor]

'infos' @ [62:101] ==> val infos: List<HighlightInfo> defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.doApplyInformationToEditor[LocalVariableDescriptor]

'colorsScheme' @ [62:108] ==> public final var ScriptExternalHighlightingPass.colorsScheme: EditorColorsScheme?[MyPropertyDescriptor]

'id' @ [62:122] ==> public final var ScriptExternalHighlightingPass.id: Int[MyPropertyDescriptor]

'position' @ [66:13] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'computeOffsets' @ [69:20] ==> private final fun computeOffsets(document: Document, position: ScriptReport.Position?): Pair<Int, Int>? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'document' @ [69:35] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'Position' @ [69:58] ==> public constructor Position(startLine: Int, startColumn: Int, endLine: Int? = ..., endColumn: Int? = ...) defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedClassConstructorDescriptor]

'position' @ [72:25] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'startLine' @ [72:34] ==> public final val startLine: Int defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'coerceLineIn' @ [72:44] ==> private final fun Int.coerceLineIn(document: Document): Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'document' @ [72:57] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'document' @ [73:27] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'offsetBy' @ [73:36] ==> private final fun Document.offsetBy(line: Int, col: Int): Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'startLine' @ [73:45] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'position' @ [73:56] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'startColumn' @ [73:65] ==> public final val startColumn: Int defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'position' @ [75:23] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'endLine' @ [75:32] ==> public final val endLine: Int? defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'coerceAtLeast' @ [75:41] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'startLine' @ [75:55] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'coerceLineIn' @ [75:67] ==> private final fun Int.coerceLineIn(document: Document): Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'document' @ [75:80] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'startLine' @ [75:93] ==> val startLine: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'document' @ [76:25] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'offsetBy' @ [76:34] ==> private final fun Document.offsetBy(line: Int, col: Int): Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[SimpleFunctionDescriptorImpl]

'endLine' @ [77:17] ==> val endLine: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'position' @ [78:17] ==> value-parameter position: ScriptReport.Position? defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'endColumn' @ [78:26] ==> public final val endColumn: Int? defined in kotlin.script.experimental.dependencies.ScriptReport.Position[DeserializedPropertyDescriptor]

'document' @ [78:39] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[ValueParameterDescriptorImpl]

'getLineEndOffset' @ [78:48] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'endLine' @ [78:65] ==> val endLine: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'coerceAtLeast' @ [79:11] ==> public fun Int.coerceAtLeast(minimumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [79:25] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'startOffset' @ [82:16] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'endOffset' @ [82:31] ==> val endOffset: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.computeOffsets[LocalVariableDescriptor]

'coerceIn' @ [85:56] ==> public fun Int.coerceIn(minimumValue: Int, maximumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'document' @ [85:68] ==> value-parameter document: Document defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.coerceLineIn[ValueParameterDescriptorImpl]

'lineCount' @ [85:77] ==> public final val Document.lineCount: Int[MyPropertyDescriptor]

'getLineStartOffset' @ [88:17] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [88:36] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.offsetBy[ValueParameterDescriptorImpl]

'col' @ [88:44] ==> value-parameter col: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.offsetBy[ValueParameterDescriptorImpl]

'coerceIn' @ [89:17] ==> public fun Int.coerceIn(minimumValue: Int, maximumValue: Int): Int defined in kotlin.ranges[DeserializedSimpleFunctionDescriptor]

'getLineStartOffset' @ [89:26] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [89:45] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.offsetBy[ValueParameterDescriptorImpl]

'getLineEndOffset' @ [89:52] ==> @Contract public abstract fun getLineEndOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'line' @ [89:69] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.offsetBy[ValueParameterDescriptorImpl]

'when (this) {
            ScriptReport.Severity.ERROR -> ERROR
            ScriptReport.Severity.WARNING -> WARNING
            ScriptReport.Severity.INFO -> INFORMATION
            else -> null
        }' @ [93:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: HighlightSeverity?, entry1: HighlightSeverity?, entry2: HighlightSeverity?, entry3: HighlightSeverity?): HighlightSeverity?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> HighlightSeverity?

'this' @ [93:22] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.convertSeverity[ReceiverParameterDescriptorImpl]

'ERROR' @ [94:35] ==> enum entry ERROR defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'ERROR' @ [94:44] ==> public final val ERROR: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'WARNING' @ [95:35] ==> enum entry WARNING defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'WARNING' @ [95:46] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'INFO' @ [96:35] ==> enum entry INFO defined in kotlin.script.experimental.dependencies.ScriptReport.Severity[FakeCallableDescriptorForObject]

'INFORMATION' @ [96:43] ==> public final val INFORMATION: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'AbstractProjectComponent' @ [102:11] ==> protected/*protected and package*/ constructor AbstractProjectComponent(p0: (Project..Project?)) defined in com.intellij.openapi.components.AbstractProjectComponent[JavaClassConstructorDescriptor]

'project' @ [102:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory.<init>[ValueParameterDescriptorImpl]

'registrar' @ [104:13] ==> value-parameter registrar: TextEditorHighlightingPassRegistrar defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory.<init>[ValueParameterDescriptorImpl]

'registerTextEditorHighlightingPass' @ [104:23] ==> public open fun registerTextEditorHighlightingPass(p0: (TextEditorHighlightingPassFactory..TextEditorHighlightingPassFactory?), p1: (TextEditorHighlightingPassRegistrar.Anchor..TextEditorHighlightingPassRegistrar.Anchor?), p2: Int, p3: Boolean, p4: Boolean): Int defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar[JavaMethodDescriptor]

'this' @ [104:58] ==> <this> defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory[LazyClassReceiverParameterDescriptor]

'BEFORE' @ [104:107] ==> enum entry BEFORE defined in com.intellij.codeHighlighting.TextEditorHighlightingPassRegistrar.Anchor[FakeCallableDescriptorForObject]

'UPDATE_FOLDING' @ [104:120] ==> public const final val UPDATE_FOLDING: Int defined in com.intellij.codeHighlighting.Pass[JavaPropertyDescriptor]

'file' @ [108:17] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'ScriptExternalHighlightingPass' @ [109:20] ==> public constructor ScriptExternalHighlightingPass(file: KtFile, document: Document) defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass[ClassConstructorDescriptorImpl]

'file' @ [109:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'editor' @ [109:57] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.highlighter.ScriptExternalHighlightingPass.Factory.createHighlightingPass[ValueParameterDescriptorImpl]

'document' @ [109:64] ==> public final val Editor.document: Document[MyPropertyDescriptor]

