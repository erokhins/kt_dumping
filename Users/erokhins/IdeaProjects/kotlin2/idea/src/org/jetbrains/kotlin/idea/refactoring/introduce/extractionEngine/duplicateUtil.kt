'getPhysicalTextRange' @ [41:21] ==> public fun KotlinPsiRange.getPhysicalTextRange(): TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'ArrayList' @ [42:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> RangeHighlighter

'!!' @ [43:22] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: TextAttributes?): TextAttributes[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> TextAttributes

'getInstance' @ [43:42] ==> public open fun getInstance(): (EditorColorsManager..EditorColorsManager?) defined in com.intellij.openapi.editor.colors.EditorColorsManager[JavaMethodDescriptor]

'globalScheme' @ [43:56] ==> public final var EditorColorsManager.globalScheme: EditorColorsScheme[MyPropertyDescriptor]

'getAttributes' @ [43:69] ==> public abstract fun getAttributes(p0: (TextAttributesKey..TextAttributesKey?)): (TextAttributes..TextAttributes?) defined in com.intellij.openapi.editor.colors.EditorColorsScheme[JavaMethodDescriptor]

'SEARCH_RESULT_ATTRIBUTES' @ [43:96] ==> public final val SEARCH_RESULT_ATTRIBUTES: (TextAttributesKey..TextAttributesKey?) defined in com.intellij.openapi.editor.colors.EditorColors[JavaPropertyDescriptor]

'getInstance' @ [44:22] ==> public open fun getInstance(p0: (Project..Project?)): (HighlightManager..HighlightManager?) defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'project' @ [44:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[ValueParameterDescriptorImpl]

'addRangeHighlight' @ [44:43] ==> public abstract fun addRangeHighlight(@NotNull p0: Editor, p1: Int, p2: Int, @NotNull p3: TextAttributes, p4: Boolean, @Nullable p5: (MutableCollection<(RangeHighlighter..RangeHighlighter?)>?..Collection<(RangeHighlighter..RangeHighlighter?)>?)): Unit defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'editor' @ [45:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[ValueParameterDescriptorImpl]

'textRange' @ [45:21] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[LocalVariableDescriptor]

'startOffset' @ [45:31] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'textRange' @ [45:44] ==> val textRange: TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[LocalVariableDescriptor]

'endOffset' @ [45:54] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'attributes' @ [45:65] ==> val attributes: TextAttributes defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[LocalVariableDescriptor]

'highlighters' @ [45:83] ==> val highlighters: ArrayList<RangeHighlighter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[LocalVariableDescriptor]

'highlighters' @ [47:12] ==> val highlighters: ArrayList<RangeHighlighter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.highlight[LocalVariableDescriptor]

'firstOrNull' @ [47:25] ==> public fun <T> List<RangeHighlighter>.firstOrNull(): RangeHighlighter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter

'highlight' @ [51:12] ==> public fun KotlinPsiRange.highlight(project: Project, editor: Editor): RangeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file duplicateUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [51:22] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'editor' @ [51:31] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'let' @ [51:40] ==> @InlineOnly public inline fun <T, R> RangeHighlighter.let(block: (RangeHighlighter) -> RangeHighlighter): RangeHighlighter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter
    <R> -> RangeHighlighter

'getPhysicalTextRange' @ [52:27] ==> public fun KotlinPsiRange.getPhysicalTextRange(): TextRange defined in org.jetbrains.kotlin.idea.refactoring.introduce in file introduceUtil.kt[SimpleFunctionDescriptorImpl]

'startOffset' @ [52:50] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'getInstance' @ [54:36] ==> public open fun getInstance(p0: (Project..Project?)): (CodeFoldingManager..CodeFoldingManager?) defined in com.intellij.codeInsight.folding.CodeFoldingManager[JavaMethodDescriptor]

'project' @ [54:48] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'getFoldRegionsAtOffset' @ [55:26] ==> public abstract fun getFoldRegionsAtOffset(@NotNull p0: Editor, p1: Int): (Array<(FoldRegion..FoldRegion?)>..Array<out (FoldRegion..FoldRegion?)>?) defined in com.intellij.codeInsight.folding.CodeFoldingManager[JavaMethodDescriptor]

'editor' @ [55:49] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'startOffset' @ [55:57] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>[LocalVariableDescriptor]

'filter' @ [56:26] ==> public inline fun <T> Array<out (FoldRegion..FoldRegion?)>.filter(predicate: ((FoldRegion..FoldRegion?)) -> Boolean): List<(FoldRegion..FoldRegion?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.FoldRegion..com.intellij.openapi.editor.FoldRegion?)

'!' @ [56:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [56:36] ==> value-parameter it: (FoldRegion..FoldRegion?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isExpanded' @ [56:39] ==> public final var FoldRegion.isExpanded: Boolean[MyPropertyDescriptor]

'!' @ [57:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'foldedRegions' @ [57:14] ==> val foldedRegions: List<(FoldRegion..FoldRegion?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [57:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'editor' @ [58:13] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'foldingModel' @ [58:20] ==> public final val Editor.foldingModel: FoldingModel[MyPropertyDescriptor]

'runBatchFoldingOperation' @ [58:33] ==> public final fun runBatchFoldingOperation(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.editor.FoldingModel[MyFunctionDescriptor]

'foldedRegions' @ [58:60] ==> val foldedRegions: List<(FoldRegion..FoldRegion?)> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>[LocalVariableDescriptor]

'forEach' @ [58:74] ==> @HidesMembers public inline fun <T> Iterable<(FoldRegion..FoldRegion?)>.forEach(action: ((FoldRegion..FoldRegion?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.editor.FoldRegion..com.intellij.openapi.editor.FoldRegion?)

'it' @ [58:84] ==> value-parameter it: (FoldRegion..FoldRegion?) defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isExpanded' @ [58:87] ==> public final var FoldRegion.isExpanded: Boolean[MyPropertyDescriptor]

'editor' @ [60:9] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'scrollingModel' @ [60:16] ==> public final val Editor.scrollingModel: ScrollingModel[MyPropertyDescriptor]

'scrollTo' @ [60:31] ==> public abstract fun scrollTo(@NotNull p0: LogicalPosition, @NotNull p1: ScrollType): Unit defined in com.intellij.openapi.editor.ScrollingModel[JavaMethodDescriptor]

'editor' @ [60:40] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview[ValueParameterDescriptorImpl]

'offsetToLogicalPosition' @ [60:47] ==> @NotNull public abstract fun offsetToLogicalPosition(p0: Int): LogicalPosition defined in com.intellij.openapi.editor.Editor[JavaMethodDescriptor]

'startOffset' @ [60:71] ==> val startOffset: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>[LocalVariableDescriptor]

'MAKE_VISIBLE' @ [60:96] ==> enum entry MAKE_VISIBLE defined in com.intellij.openapi.editor.ScrollType[FakeCallableDescriptorForObject]

'it' @ [62:9] ==> value-parameter it: RangeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.preview.<anonymous>[ValueParameterDescriptorImpl]

'duplicateReplacers' @ [73:16] ==> value-parameter duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'size' @ [73:35] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'size' @ [74:9] ==> val size: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'size' @ [76:9] ==> val size: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'duplicateReplacers' @ [77:9] ==> value-parameter duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'keys' @ [77:28] ==> public abstract val keys: Set<KotlinPsiRange> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'first' @ [77:33] ==> public fun <T> Iterable<KotlinPsiRange>.first(): KotlinPsiRange defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinPsiRange

'preview' @ [77:41] ==> public fun KotlinPsiRange.preview(project: Project, editor: Editor): RangeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file duplicateUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [77:49] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'editor' @ [77:58] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'if (ApplicationManager.getApplication()!!.isUnitTestMode)
        Messages.YES
    else
        Messages.showYesNoDialog(
                project,
                KotlinRefactoringBundle.message(
                        "0.has.detected.1.code.fragments.in.2.that.can.be.replaced.with.3",
                        ApplicationNamesInfo.getInstance().productName,
                        duplicateReplacers.size,
                        scopeDescription,
                        usageDescription
                ),
                "Process Duplicates",
                Messages.getQuestionIcon()
        )' @ [80:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'!!' @ [80:22] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [80:41] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [80:60] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'YES' @ [81:18] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'showYesNoDialog' @ [83:18] ==> @Messages.YesNoResult public open fun showYesNoDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'project' @ [84:17] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'message' @ [85:41] ==> @NotNull public open fun message(@NonNls @PropertyKey key: (String..String?), vararg params: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.refactoring.KotlinRefactoringBundle[JavaMethodDescriptor]

'getInstance' @ [87:46] ==> @NotNull public open fun getInstance(): ApplicationNamesInfo defined in com.intellij.openapi.application.ApplicationNamesInfo[JavaMethodDescriptor]

'productName' @ [87:60] ==> public final val ApplicationNamesInfo.productName: (String..String?)[MyPropertyDescriptor]

'duplicateReplacers' @ [88:25] ==> value-parameter duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'size' @ [88:44] ==> public abstract val size: Int defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'scopeDescription' @ [89:25] ==> value-parameter scopeDescription: String = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'usageDescription' @ [90:25] ==> value-parameter usageDescription: String = ... defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'getQuestionIcon' @ [93:26] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'answer' @ [95:9] ==> val answer: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'YES' @ [95:28] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'component1' @ [100:11] ==> public final operator fun component1(): Int defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'component2' @ [100:14] ==> public final operator fun component2(): Map.Entry<KotlinPsiRange, () -> Unit> defined in kotlin.collections.IndexedValue[DeserializedSimpleFunctionDescriptor]

'duplicateReplacers' @ [100:24] ==> value-parameter duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'entries' @ [100:43] ==> public abstract val entries: Set<Map.Entry<KotlinPsiRange, () -> Unit>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'withIndex' @ [100:51] ==> public fun <T> Iterable<Map.Entry<KotlinPsiRange, () -> Unit>>.withIndex(): Iterable<IndexedValue<Map.Entry<KotlinPsiRange, () -> Unit>>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Entry<KotlinPsiRange, Function0<Unit>>

'component1' @ [101:14] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KotlinPsiRange, () -> Unit>.component1(): KotlinPsiRange defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'component2' @ [101:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<KotlinPsiRange, () -> Unit>.component2(): () -> Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KotlinPsiRange
    <V> -> Function0<Unit>

'entry' @ [101:35] ==> val entry: Map.Entry<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'!' @ [102:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pattern' @ [102:14] ==> val pattern: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'isValid' @ [102:22] ==> public open fun isValid(): Boolean defined in org.jetbrains.kotlin.idea.util.psi.patternMatching.KotlinPsiRange[DeserializedSimpleFunctionDescriptor]

'pattern' @ [104:27] ==> val pattern: KotlinPsiRange defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'preview' @ [104:35] ==> public fun KotlinPsiRange.preview(project: Project, editor: Editor): RangeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine in file duplicateUtil.kt[SimpleFunctionDescriptorImpl]

'project' @ [104:43] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'editor' @ [104:52] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'!' @ [105:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'!!' @ [105:14] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [105:33] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [105:52] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'size' @ [106:17] ==> val size: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'!' @ [106:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'showAll' @ [106:30] ==> var showAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'ReplacePromptDialog' @ [107:36] ==> public constructor ReplacePromptDialog(p0: Boolean, p1: (String..String?), p2: (Project..Project?)) defined in com.intellij.ui.ReplacePromptDialog[JavaClassConstructorDescriptor]

'message' @ [107:81] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'i' @ [107:117] ==> val i: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'size' @ [107:124] ==> val size: Int defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'project' @ [107:131] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'promptDialog' @ [108:17] ==> val promptDialog: ReplacePromptDialog defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'show' @ [108:30] ==> public open fun show(): Unit defined in com.intellij.ui.ReplacePromptDialog[JavaMethodDescriptor]

'when(promptDialog.exitCode) {
                    FindManager.PromptResult.ALL -> showAll = true
                    FindManager.PromptResult.SKIP -> continue@duplicateReplacersLoop
                    FindManager.PromptResult.CANCEL -> return
                }' @ [109:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'promptDialog' @ [109:22] ==> val promptDialog: ReplacePromptDialog defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'exitCode' @ [109:35] ==> public final val ReplacePromptDialog.exitCode: Int[MyPropertyDescriptor]

'ALL' @ [110:46] ==> public const final val ALL: Int defined in com.intellij.find.FindManager.PromptResult[JavaPropertyDescriptor]

'showAll' @ [110:53] ==> var showAll: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'SKIP' @ [111:46] ==> public const final val SKIP: Int defined in com.intellij.find.FindManager.PromptResult[JavaPropertyDescriptor]

'CANCEL' @ [112:46] ==> public const final val CANCEL: Int defined in com.intellij.find.FindManager.PromptResult[JavaPropertyDescriptor]

'highlighter' @ [116:9] ==> val highlighter: RangeHighlighter? defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'let' @ [116:22] ==> @InlineOnly public inline fun <T, R> RangeHighlighter.let(block: (RangeHighlighter) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RangeHighlighter
    <R> -> Boolean

'getInstance' @ [116:45] ==> public open fun getInstance(p0: (Project..Project?)): (HighlightManager..HighlightManager?) defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'project' @ [116:57] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'removeSegmentHighlighter' @ [116:66] ==> public abstract fun removeSegmentHighlighter(@NotNull p0: Editor, @NotNull p1: RangeHighlighter): Boolean defined in com.intellij.codeInsight.highlighting.HighlightManager[JavaMethodDescriptor]

'editor' @ [116:91] ==> value-parameter editor: Editor defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'it' @ [116:99] ==> value-parameter it: RangeHighlighter defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [118:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [118:17] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'REFACTORING_NAME' @ [118:61] ==> public const final val REFACTORING_NAME: (String..String?) defined in com.intellij.refactoring.util.duplicates.MethodDuplicatesHandler[JavaPropertyDescriptor]

'replacer' @ [118:79] ==> val replacer: () -> Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicates[LocalVariableDescriptor]

'project' @ [123:5] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicatesSilently[ValueParameterDescriptorImpl]

'executeWriteCommand' @ [123:13] ==> public fun Project.executeWriteCommand(name: String, command: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]

'REFACTORING_NAME' @ [123:57] ==> public const final val REFACTORING_NAME: (String..String?) defined in com.intellij.refactoring.util.duplicates.MethodDuplicatesHandler[JavaPropertyDescriptor]

'duplicateReplacers' @ [124:9] ==> value-parameter duplicateReplacers: Map<KotlinPsiRange, () -> Unit> defined in org.jetbrains.kotlin.idea.refactoring.introduce.extractionEngine.processDuplicatesSilently[ValueParameterDescriptorImpl]

'values' @ [124:28] ==> public abstract val values: Collection<() -> Unit> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'forEach' @ [124:35] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [124:45] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

