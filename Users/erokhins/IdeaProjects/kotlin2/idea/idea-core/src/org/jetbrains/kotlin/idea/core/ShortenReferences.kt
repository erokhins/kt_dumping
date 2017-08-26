'Options' @ [57:65] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[FakeCallableDescriptorForObject]

'DEFAULT' @ [57:73] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[PropertyDescriptorImpl]

'Options' @ [65:27] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[ClassConstructorDescriptorImpl]

'Options' @ [66:31] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[ClassConstructorDescriptorImpl]

'JvmField' @ [71:9] ==> public constructor JvmField() defined in kotlin.jvm.JvmField[DeserializedClassConstructorDescriptor]

'ShortenReferences' @ [72:23] ==> public constructor ShortenReferences(options: (KtElement) -> ShortenReferences.Options = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences[ClassConstructorDescriptorImpl]

'ShortenReferences' @ [74:32] ==> public constructor ShortenReferences(options: (KtElement) -> ShortenReferences.Options = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences[ClassConstructorDescriptorImpl]

'Options' @ [74:52] ==> public constructor Options(removeThisLabels: Boolean = ..., removeThis: Boolean = ..., removeExplicitCompanion: Boolean = ...) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[ClassConstructorDescriptorImpl]

'DescriptorRenderer' @ [77:19] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [77:38] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [77:56] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'this' @ [77:63] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion.asString[ReceiverParameterDescriptorImpl]

'getImportableTargets' @ [79:78] ==> public fun KtReferenceExpression.getImportableTargets(bindingContext: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.imports[DeserializedSimpleFunctionDescriptor]

'context' @ [79:99] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion.targets[ValueParameterDescriptorImpl]

'descriptor' @ [82:20] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion.mayImport[ValueParameterDescriptorImpl]

'canBeReferencedViaImport' @ [82:31] ==> public fun DeclarationDescriptor.canBeReferencedViaImport(): Boolean defined in org.jetbrains.kotlin.idea.imports[DeserializedSimpleFunctionDescriptor]

'ImportInsertHelper' @ [83:23] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [83:42] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'file' @ [83:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion.mayImport[ValueParameterDescriptorImpl]

'project' @ [83:59] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'mayImportOnShortenReferences' @ [83:68] ==> public abstract fun mayImportOnShortenReferences(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [83:97] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion.mayImport[ValueParameterDescriptorImpl]

'JvmOverloads' @ [87:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'PROCESS' @ [87:112] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'process' @ [88:16] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'listOf' @ [88:24] ==> public fun <T> listOf(element: KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'element' @ [88:31] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'elementFilter' @ [88:41] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ... defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'single' @ [88:56] ==> public fun <T> Iterable<KtElement>.single(): KtElement defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'getInstance' @ [92:50] ==> public open fun getInstance(@NotNull p0: Project): (PsiDocumentManager..PsiDocumentManager?) defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'file' @ [92:62] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'project' @ [92:67] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'file' @ [93:24] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'viewProvider' @ [93:29] ==> public final val KtFile.viewProvider: FileViewProvider[MyPropertyDescriptor]

'document' @ [93:42] ==> public final val FileViewProvider.document: Document?[MyPropertyDescriptor]

'!' @ [94:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'documentManager' @ [94:14] ==> val documentManager: (PsiDocumentManager..PsiDocumentManager?) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'isCommitted' @ [94:30] ==> public abstract fun isCommitted(@NotNull p0: Document): Boolean defined in com.intellij.psi.PsiDocumentManager[JavaMethodDescriptor]

'document' @ [94:42] ==> val document: Document defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'IllegalStateException' @ [95:19] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'document' @ [98:27] ==> val document: Document defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'createRangeMarker' @ [98:36] ==> @NotNull public open fun createRangeMarker(p0: Int, p1: Int): RangeMarker defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'startOffset' @ [98:54] ==> value-parameter startOffset: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'endOffset' @ [98:67] ==> value-parameter endOffset: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'rangeMarker' @ [99:9] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'isGreedyToLeft' @ [99:21] ==> public final var RangeMarker.isGreedyToLeft: Boolean[MyPropertyDescriptor]

'rangeMarker' @ [100:9] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'isGreedyToRight' @ [100:21] ==> public final var RangeMarker.isGreedyToRight: Boolean[MyPropertyDescriptor]

'process' @ [102:13] ==> @JvmOverloads public final fun process(elements: Iterable<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'listOf' @ [102:21] ==> public fun <T> listOf(element: KtFile): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [102:28] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'if (rangeMarker.isValid) {
                    val range = TextRange(rangeMarker.startOffset, rangeMarker.endOffset)

                    val elementRange = element.textRange!!
                    when {
                        range.contains(elementRange) -> FilterResult.PROCESS

                        range.intersects(elementRange) -> {
                            // for qualified call expression allow to shorten only the part without parenthesis
                            val calleeExpression = ((element as? KtDotQualifiedExpression)
                                    ?.selectorExpression as? KtCallExpression)
                                    ?.calleeExpression
                            if (calleeExpression != null) {
                                val rangeWithoutParenthesis = TextRange(elementRange.startOffset, calleeExpression.textRange!!.endOffset)
                                if (range.contains(rangeWithoutParenthesis)) FilterResult.PROCESS else FilterResult.GO_INSIDE
                            }
                            else {
                                FilterResult.GO_INSIDE
                            }
                        }

                        else -> FilterResult.SKIP
                    }
                }
                else {
                    FilterResult.SKIP
                }' @ [103:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'rangeMarker' @ [103:21] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'isValid' @ [103:33] ==> public final val RangeMarker.isValid: Boolean[MyPropertyDescriptor]

'TextRange' @ [104:33] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'rangeMarker' @ [104:43] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'startOffset' @ [104:55] ==> public final val RangeMarker.startOffset: Int[MyPropertyDescriptor]

'rangeMarker' @ [104:68] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'endOffset' @ [104:80] ==> public final val RangeMarker.endOffset: Int[MyPropertyDescriptor]

'element' @ [106:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[ValueParameterDescriptorImpl]

'textRange' @ [106:48] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'when {
                        range.contains(elementRange) -> FilterResult.PROCESS

                        range.intersects(elementRange) -> {
                            // for qualified call expression allow to shorten only the part without parenthesis
                            val calleeExpression = ((element as? KtDotQualifiedExpression)
                                    ?.selectorExpression as? KtCallExpression)
                                    ?.calleeExpression
                            if (calleeExpression != null) {
                                val rangeWithoutParenthesis = TextRange(elementRange.startOffset, calleeExpression.textRange!!.endOffset)
                                if (range.contains(rangeWithoutParenthesis)) FilterResult.PROCESS else FilterResult.GO_INSIDE
                            }
                            else {
                                FilterResult.GO_INSIDE
                            }
                        }

                        else -> FilterResult.SKIP
                    }' @ [107:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ShortenReferences.FilterResult, entry1: ShortenReferences.FilterResult, entry2: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FilterResult

'range' @ [108:25] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'contains' @ [108:31] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [108:40] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'PROCESS' @ [108:70] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'range' @ [110:25] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'intersects' @ [110:31] ==> public open fun intersects(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'elementRange' @ [110:42] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'element' @ [112:54] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[ValueParameterDescriptorImpl]

'selectorExpression' @ [113:39] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'calleeExpression' @ [114:39] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (calleeExpression != null) {
                                val rangeWithoutParenthesis = TextRange(elementRange.startOffset, calleeExpression.textRange!!.endOffset)
                                if (range.contains(rangeWithoutParenthesis)) FilterResult.PROCESS else FilterResult.GO_INSIDE
                            }
                            else {
                                FilterResult.GO_INSIDE
                            }' @ [115:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'calleeExpression' @ [115:33] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'TextRange' @ [116:63] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'elementRange' @ [116:73] ==> val elementRange: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [116:86] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'calleeExpression' @ [116:99] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'textRange' @ [116:116] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'endOffset' @ [116:128] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'if (range.contains(rangeWithoutParenthesis)) FilterResult.PROCESS else FilterResult.GO_INSIDE' @ [117:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'range' @ [117:37] ==> val range: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'contains' @ [117:43] ==> public open operator fun contains(@NotNull p0: TextRange): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'rangeWithoutParenthesis' @ [117:52] ==> val rangeWithoutParenthesis: TextRange defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[LocalVariableDescriptor]

'PROCESS' @ [117:91] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'GO_INSIDE' @ [117:117] ==> enum entry GO_INSIDE defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'GO_INSIDE' @ [120:46] ==> enum entry GO_INSIDE defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'SKIP' @ [124:46] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'SKIP' @ [128:34] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'rangeMarker' @ [133:13] ==> val rangeMarker: RangeMarker defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[LocalVariableDescriptor]

'dispose' @ [133:25] ==> public abstract fun dispose(): Unit defined in com.intellij.openapi.editor.RangeMarker[JavaMethodDescriptor]

'JvmOverloads' @ [143:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'PROCESS' @ [143:123] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'elements' @ [144:16] ==> value-parameter elements: Iterable<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'groupBy' @ [144:25] ==> public inline fun <T, K> Iterable<KtElement>.groupBy(keySelector: (KtElement) -> KtFile): Map<KtFile, List<KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <K> -> KtFile

'flatMap' @ [145:18] ==> public inline fun <K, V, R> Map<out KtFile, List<KtElement>>.flatMap(transform: (Map.Entry<KtFile, List<KtElement>>) -> Iterable<KtElement>): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> KtFile
    <V> -> List<KtElement>
    <R> -> KtElement

'shortenReferencesInFile' @ [145:28] ==> private final fun shortenReferencesInFile(file: KtFile, elements: List<KtElement>, elementFilter: (PsiElement) -> ShortenReferences.FilterResult): Collection<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'it' @ [145:52] ==> value-parameter it: Map.Entry<KtFile, List<KtElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [145:55] ==> public abstract val key: KtFile defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [145:60] ==> value-parameter it: Map.Entry<KtFile, List<KtElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [145:63] ==> public abstract val value: List<KtElement> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'elementFilter' @ [145:70] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ... defined in org.jetbrains.kotlin.idea.core.ShortenReferences.process[ValueParameterDescriptorImpl]

'dropNestedElements' @ [154:29] ==> private final fun dropNestedElements(elements: List<KtElement>): LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'elements' @ [154:48] ==> value-parameter elements: List<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'ImportInsertHelper' @ [156:22] ==> public companion object defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[FakeCallableDescriptorForObject]

'getInstance' @ [156:41] ==> @JvmStatic public final fun getInstance(project: Project): ImportInsertHelper defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper.Companion[DeserializedSimpleFunctionDescriptor]

'file' @ [156:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'project' @ [156:58] ==> public final val KtFile.project: Project[MyPropertyDescriptor]

'LinkedHashSet' @ [158:41] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'if (element is KtElement && !options(element).removeExplicitCompanion) {
                FilterResult.SKIP
            }
            else {
                elementFilter(element)
            }' @ [161:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.FilterResult, elseBranch: ShortenReferences.FilterResult): ShortenReferences.FilterResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FilterResult

'element' @ [161:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [161:41] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [161:42] ==> public abstract operator fun invoke(p1: KtElement): ShortenReferences.Options defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [161:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'removeExplicitCompanion' @ [161:59] ==> public final val removeExplicitCompanion: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[PropertyDescriptorImpl]

'SKIP' @ [162:30] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'invoke' @ [165:17] ==> public abstract operator fun invoke(p1: PsiElement): ShortenReferences.FilterResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [165:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [172:60] ==> public fun <T> listOf(vararg elements: ShortenReferences.ShorteningProcessor<out {KtElement & ASTDelegatePsiElement}>): List<ShortenReferences.ShorteningProcessor<out {KtElement & ASTDelegatePsiElement}>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShorteningProcessor<out {KtElement & ASTDelegatePsiElement}>

'ShortenTypesProcessor' @ [173:21] ==> public constructor ShortenTypesProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor[ClassConstructorDescriptorImpl]

'file' @ [173:43] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'elementFilter' @ [173:49] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [173:64] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'ShortenThisExpressionsProcessor' @ [174:21] ==> public constructor ShortenThisExpressionsProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor[ClassConstructorDescriptorImpl]

'file' @ [174:53] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'elementFilter' @ [174:59] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [174:74] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'ShortenQualifiedExpressionsProcessor' @ [175:21] ==> public constructor ShortenQualifiedExpressionsProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[ClassConstructorDescriptorImpl]

'file' @ [175:58] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'elementFilter' @ [175:64] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [175:79] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'RemoveExplicitCompanionObjectReferenceProcessor' @ [176:21] ==> public constructor RemoveExplicitCompanionObjectReferenceProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor[ClassConstructorDescriptorImpl]

'file' @ [176:69] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'companionElementFilter' @ [176:75] ==> val companionElementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'failedToImportDescriptors' @ [176:99] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'processors' @ [180:28] ==> val processors: List<ShortenReferences.ShorteningProcessor<*>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'map' @ [180:39] ==> public inline fun <T, R> Iterable<ShortenReferences.ShorteningProcessor<*>>.map(transform: (ShortenReferences.ShorteningProcessor<*>) -> ShortenReferences.CollectElementsVisitor<out KtElement>): List<ShortenReferences.CollectElementsVisitor<out KtElement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShorteningProcessor<*>
    <R> -> CollectElementsVisitor<out KtElement>

'it' @ [180:45] ==> value-parameter it: ShortenReferences.ShorteningProcessor<*> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'collectElementsVisitor' @ [180:48] ==> public abstract val collectElementsVisitor: ShortenReferences.CollectElementsVisitor<out KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'visitors' @ [181:29] ==> val visitors: List<ShortenReferences.CollectElementsVisitor<out KtElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'elementsToUse' @ [182:33] ==> val elementsToUse: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'visitor' @ [183:21] ==> val visitor: ShortenReferences.CollectElementsVisitor<out KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'options' @ [183:29] ==> public final var options: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'invoke' @ [183:39] ==> public abstract operator fun invoke(p1: KtElement): ShortenReferences.Options defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [183:47] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'element' @ [184:21] ==> val element: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'accept' @ [184:29] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'visitor' @ [184:36] ==> val visitor: ShortenReferences.CollectElementsVisitor<out KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'visitors' @ [189:40] ==> val visitors: List<ShortenReferences.CollectElementsVisitor<out KtElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'flatMap' @ [189:49] ==> public inline fun <T, R> Iterable<ShortenReferences.CollectElementsVisitor<out KtElement>>.flatMap(transform: (ShortenReferences.CollectElementsVisitor<out KtElement>) -> Iterable<KtElement>): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CollectElementsVisitor<out KtElement>
    <R> -> KtElement

'it' @ [189:59] ==> value-parameter it: ShortenReferences.CollectElementsVisitor<out KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'getElementsToAnalyze' @ [189:62] ==> public final fun getElementsToAnalyze(): List<ShortenReferences.ElementToAnalyze<out KtElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[SimpleFunctionDescriptorImpl]

'map' @ [189:85] ==> public inline fun <T, R> Iterable<ShortenReferences.ElementToAnalyze<out KtElement>>.map(transform: (ShortenReferences.ElementToAnalyze<out KtElement>) -> KtElement): List<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ElementToAnalyze<out KtElement>
    <R> -> KtElement

'it' @ [189:91] ==> value-parameter it: ShortenReferences.ElementToAnalyze<out KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [189:94] ==> public final val element: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ElementToAnalyze[PropertyDescriptorImpl]

'file' @ [190:34] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [190:39] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'analyze' @ [190:61] ==> public abstract fun analyze(elements: Collection<KtElement>, bodyResolveMode: BodyResolveMode): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'allElementsToAnalyze' @ [190:69] ==> val allElementsToAnalyze: List<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'PARTIAL' @ [190:107] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'processors' @ [191:13] ==> val processors: List<ShortenReferences.ShorteningProcessor<*>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'forEach' @ [191:24] ==> @HidesMembers public inline fun <T> Iterable<ShortenReferences.ShorteningProcessor<*>>.forEach(action: (ShortenReferences.ShorteningProcessor<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShorteningProcessor<*>

'it' @ [191:34] ==> value-parameter it: ShortenReferences.ShorteningProcessor<*> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'analyzeCollectedElements' @ [191:37] ==> public final fun analyzeCollectedElements(bindingContext: BindingContext): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[SimpleFunctionDescriptorImpl]

'bindingContext' @ [191:62] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'processors' @ [194:13] ==> val processors: List<ShortenReferences.ShorteningProcessor<*>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'forEach' @ [194:24] ==> @HidesMembers public inline fun <T> Iterable<ShortenReferences.ShorteningProcessor<*>>.forEach(action: (ShortenReferences.ShorteningProcessor<*>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShorteningProcessor<*>

'it' @ [194:34] ==> value-parameter it: ShortenReferences.ShorteningProcessor<*> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'shortenElements' @ [194:37] ==> public final fun shortenElements(elementSetToUpdate: MutableSet<KtElement>): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[SimpleFunctionDescriptorImpl]

'elementsToUse' @ [194:74] ==> val elementsToUse: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'processors' @ [197:39] ==> val processors: List<ShortenReferences.ShorteningProcessor<*>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'flatMap' @ [197:50] ==> public inline fun <T, R> Iterable<ShortenReferences.ShorteningProcessor<*>>.flatMap(transform: (ShortenReferences.ShorteningProcessor<*>) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ShorteningProcessor<*>
    <R> -> DeclarationDescriptor

'it' @ [197:60] ==> value-parameter it: ShortenReferences.ShorteningProcessor<*> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile.<anonymous>[ValueParameterDescriptorImpl]

'getDescriptorsToImport' @ [197:63] ==> public final fun getDescriptorsToImport(): Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[SimpleFunctionDescriptorImpl]

'toSet' @ [197:90] ==> public fun <T> Iterable<DeclarationDescriptor>.toSet(): Set<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptorsToImport' @ [199:32] ==> val descriptorsToImport: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'assert' @ [200:17] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [200:24] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'failedToImportDescriptors' @ [200:39] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'helper' @ [202:30] ==> val helper: ImportInsertHelper defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'importDescriptor' @ [202:37] ==> public abstract fun importDescriptor(file: KtFile, descriptor: DeclarationDescriptor, forceAllUnderImport: Boolean = ...): ImportDescriptorResult defined in org.jetbrains.kotlin.idea.util.ImportInsertHelper[DeserializedSimpleFunctionDescriptor]

'file' @ [202:54] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[ValueParameterDescriptorImpl]

'descriptor' @ [202:60] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'result' @ [203:21] ==> val result: ImportDescriptorResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'ALREADY_IMPORTED' @ [203:54] ==> enum entry ALREADY_IMPORTED defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'anyChange' @ [204:21] ==> var anyChange: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'result' @ [206:21] ==> val result: ImportDescriptorResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'FAIL' @ [206:54] ==> enum entry FAIL defined in org.jetbrains.kotlin.idea.util.ImportDescriptorResult[FakeCallableDescriptorForObject]

'failedToImportDescriptors' @ [207:21] ==> val failedToImportDescriptors: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'add' @ [207:47] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'descriptor' @ [207:51] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'!' @ [210:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'anyChange' @ [210:18] ==> var anyChange: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'elementsToUse' @ [213:16] ==> val elementsToUse: LinkedHashSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.shortenReferencesInFile[LocalVariableDescriptor]

'elements' @ [217:26] ==> value-parameter elements: List<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements[ValueParameterDescriptorImpl]

'toSet' @ [217:35] ==> public fun <T> Iterable<KtElement>.toSet(): Set<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'elementSet' @ [218:16] ==> val elementSet: Set<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements[LocalVariableDescriptor]

'filterTo' @ [218:27] ==> public inline fun <T, C : MutableCollection<in KtElement>> Iterable<KtElement>.filterTo(destination: LinkedHashSet<KtElement>, predicate: (KtElement) -> Boolean): LinkedHashSet<KtElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <C : MutableCollection<in T>> -> LinkedHashSet<KtElement>

'LinkedHashSet' @ [218:36] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: Int) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'elementSet' @ [218:61] ==> val elementSet: Set<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements[LocalVariableDescriptor]

'size' @ [218:72] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'element' @ [219:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [219:21] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'none' @ [219:29] ==> public inline fun <T> Sequence<PsiElement>.none(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [219:36] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'elementSet' @ [219:42] ==> val elementSet: Set<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.dropNestedElements[LocalVariableDescriptor]

'KtVisitorVoid' @ [227:9] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'Options' @ [229:32] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[FakeCallableDescriptorForObject]

'DEFAULT' @ [229:40] ==> public final val DEFAULT: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options.Companion[PropertyDescriptorImpl]

'ArrayList' @ [231:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ElementToAnalyze<TElement>

'level' @ [236:13] ==> private final var level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'level' @ [240:13] ==> private final var level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'assert' @ [241:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'level' @ [241:20] ==> private final var level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'elementsToAnalyze' @ [248:13] ==> private final val elementsToAnalyze: ArrayList<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'add' @ [248:31] ==> public open fun add(element: ShortenReferences.ElementToAnalyze<TElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ElementToAnalyze' @ [248:35] ==> public constructor ElementToAnalyze<TElement>(element: TElement, level: Int) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ElementToAnalyze[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement> -> TElement

'element' @ [248:52] ==> value-parameter element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor.addQualifiedElementToAnalyze[ValueParameterDescriptorImpl]

'level' @ [248:61] ==> private final var level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'invoke' @ [252:17] ==> public abstract operator fun invoke(p1: PsiElement): ShortenReferences.FilterResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'element' @ [252:31] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor.visitElement[ValueParameterDescriptorImpl]

'SKIP' @ [252:56] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'element' @ [253:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor.visitElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [253:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'this' @ [253:40] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[LazyClassReceiverParameterDescriptor]

'elementsToAnalyze' @ [257:72] ==> private final val elementsToAnalyze: ArrayList<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[PropertyDescriptorImpl]

'file' @ [264:42] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'getResolutionFacade' @ [264:47] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'ArrayList' @ [265:41] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> SmartPsiElementPointer<TElement>

'LinkedHashSet' @ [266:43] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'collectElementsVisitor' @ [271:28] ==> public abstract val collectElementsVisitor: ShortenReferences.CollectElementsVisitor<TElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'getElementsToAnalyze' @ [271:51] ==> public final fun getElementsToAnalyze(): List<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[SimpleFunctionDescriptorImpl]

'index' @ [274:20] ==> var index: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'elements' @ [274:28] ==> val elements: List<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'size' @ [274:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [275:22] ==> public final operator fun component1(): TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ElementToAnalyze[SimpleFunctionDescriptorImpl]

'component2' @ [275:31] ==> public final operator fun component2(): Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ElementToAnalyze[SimpleFunctionDescriptorImpl]

'elements' @ [275:40] ==> val elements: List<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'index' @ [275:49] ==> var index: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'analyzeQualifiedElement' @ [277:30] ==> protected abstract fun analyzeQualifiedElement(element: TElement, bindingContext: BindingContext): ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[SimpleFunctionDescriptorImpl]

'element' @ [277:54] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'bindingContext' @ [277:63] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[ValueParameterDescriptorImpl]

'when (result) {
                    is AnalyzeQualifiedElementResult.ShortenNow -> {
                        elementsToShorten.add(element.createSmartPointer())
                        toBeShortened = true
                    }

                    is AnalyzeQualifiedElementResult.ImportDescriptors -> {
                        val tryImport = result.descriptors.isNotEmpty()
                                        && result.descriptors.none { it in failedToImportDescriptors }
                                        && result.descriptors.all { mayImport(it, file) }
                        toBeShortened = if (tryImport) {
                            descriptorsToImport.addAll(result.descriptors)
                            true
                        }
                        else {
                            false
                        }
                    }

                    is AnalyzeQualifiedElementResult.Skip -> {
                        toBeShortened = false
                    }
                }' @ [280:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'result' @ [280:23] ==> val result: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'elementsToShorten' @ [282:25] ==> private final val elementsToShorten: ArrayList<SmartPsiElementPointer<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'add' @ [282:43] ==> public open fun add(element: SmartPsiElementPointer<TElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'element' @ [282:47] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'createSmartPointer' @ [282:55] ==> public fun <E : PsiElement> TElement.createSmartPointer(): SmartPsiElementPointer<TElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> TElement

'toBeShortened' @ [283:25] ==> val toBeShortened: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'result' @ [287:41] ==> val result: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'descriptors' @ [287:48] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[PropertyDescriptorImpl]

'isNotEmpty' @ [287:60] ==> @InlineOnly public inline fun <T> Collection<DeclarationDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'result' @ [288:44] ==> val result: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'descriptors' @ [288:51] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[PropertyDescriptorImpl]

'none' @ [288:63] ==> public inline fun <T> Iterable<DeclarationDescriptor>.none(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [288:70] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements.<anonymous>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [288:76] ==> protected final val failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'result' @ [289:44] ==> val result: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'descriptors' @ [289:51] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[PropertyDescriptorImpl]

'all' @ [289:63] ==> public inline fun <T> Iterable<DeclarationDescriptor>.all(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'mayImport' @ [289:69] ==> private final fun mayImport(descriptor: DeclarationDescriptor, file: KtFile): Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'it' @ [289:79] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [289:83] ==> protected final val file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'toBeShortened' @ [290:25] ==> val toBeShortened: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'if (tryImport) {
                            descriptorsToImport.addAll(result.descriptors)
                            true
                        }
                        else {
                            false
                        }' @ [290:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'tryImport' @ [290:45] ==> val tryImport: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'descriptorsToImport' @ [291:29] ==> private final val descriptorsToImport: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'addAll' @ [291:49] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'result' @ [291:56] ==> val result: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'descriptors' @ [291:63] ==> public final val descriptors: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[PropertyDescriptorImpl]

'toBeShortened' @ [300:25] ==> val toBeShortened: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'toBeShortened' @ [304:21] ==> val toBeShortened: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'index' @ [306:28] ==> var index: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'elements' @ [306:36] ==> val elements: List<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'size' @ [306:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'elements' @ [306:53] ==> val elements: List<ShortenReferences.ElementToAnalyze<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'index' @ [306:62] ==> var index: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'level' @ [306:69] ==> public final val level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ElementToAnalyze[PropertyDescriptorImpl]

'level' @ [306:77] ==> val level: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'index' @ [307:25] ==> var index: Int defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.analyzeCollectedElements[LocalVariableDescriptor]

'AnalyzeQualifiedElementResult' @ [319:27] ==> private constructor AnalyzeQualifiedElementResult() defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[ClassConstructorDescriptorImpl]

'AnalyzeQualifiedElementResult' @ [321:33] ==> private constructor AnalyzeQualifiedElementResult() defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[ClassConstructorDescriptorImpl]

'AnalyzeQualifiedElementResult' @ [323:91] ==> private constructor AnalyzeQualifiedElementResult() defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[ClassConstructorDescriptorImpl]

'elementsToShorten' @ [329:36] ==> private final val elementsToShorten: ArrayList<SmartPsiElementPointer<TElement>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'elementPointer' @ [330:31] ==> val elementPointer: SmartPsiElementPointer<TElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'element' @ [330:46] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<TElement>.element: TElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> TElement

'!' @ [331:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [331:22] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'isValid' @ [331:30] ==> public final val KtElement.isValid: Boolean[MyPropertyDescriptor]

'getInstance' @ [335:47] ==> public open fun getInstance(p0: (Project..Project?)): (PostprocessReformattingAspect..PostprocessReformattingAspect?) defined in com.intellij.psi.impl.source.PostprocessReformattingAspect[JavaMethodDescriptor]

'element' @ [335:59] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'project' @ [335:67] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'disablePostprocessFormattingInside' @ [335:76] ==> public final fun disablePostprocessFormattingInside(@NotNull p0: () -> Unit): Unit defined in com.intellij.psi.impl.source.PostprocessReformattingAspect[MyFunctionDescriptor]

'newElement' @ [336:21] ==> var newElement: KtElement? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'shortenElement' @ [336:34] ==> protected abstract fun shortenElement(element: TElement): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[SimpleFunctionDescriptorImpl]

'element' @ [336:49] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'element' @ [339:21] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'elementSetToUpdate' @ [339:32] ==> value-parameter elementSetToUpdate: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[ValueParameterDescriptorImpl]

'newElement' @ [339:54] ==> var newElement: KtElement? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'element' @ [339:68] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'elementSetToUpdate' @ [340:21] ==> value-parameter elementSetToUpdate: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[ValueParameterDescriptorImpl]

'remove' @ [340:40] ==> public abstract fun remove(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'element' @ [340:47] ==> val element: TElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'elementSetToUpdate' @ [341:21] ==> value-parameter elementSetToUpdate: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[ValueParameterDescriptorImpl]

'add' @ [341:40] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'newElement' @ [341:44] ==> var newElement: KtElement? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.shortenElements[LocalVariableDescriptor]

'descriptorsToImport' @ [346:68] ==> private final val descriptorsToImport: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[PropertyDescriptorImpl]

'ShorteningProcessor<KtUserType>' @ [353:9] ==> public constructor ShorteningProcessor<TElement : KtElement>(file: KtFile, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtUserType

'file' @ [353:41] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.<init>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [353:47] ==> value-parameter failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.<init>[ValueParameterDescriptorImpl]

'CollectElementsVisitor<KtUserType>' @ [356:26] ==> public constructor CollectElementsVisitor<TElement : KtElement>(elementFilter: (PsiElement) -> ShortenReferences.FilterResult) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtUserType

'elementFilter' @ [356:61] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.<init>[ValueParameterDescriptorImpl]

'invoke' @ [358:44] ==> public abstract operator fun invoke(p1: PsiElement): ShortenReferences.FilterResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'userType' @ [358:58] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'filterResult' @ [359:29] ==> val filterResult: ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[LocalVariableDescriptor]

'SKIP' @ [359:58] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'userType' @ [361:25] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'typeArgumentList' @ [361:34] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'accept' @ [361:52] ==> public final fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtTypeArgumentList[JavaMethodDescriptor]

'this' @ [361:59] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'filterResult' @ [363:29] ==> val filterResult: ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[LocalVariableDescriptor]

'PROCESS' @ [363:58] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'addQualifiedElementToAnalyze' @ [364:29] ==> protected final fun addQualifiedElementToAnalyze(element: KtUserType): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'userType' @ [364:58] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'nextLevel' @ [368:25] ==> protected final fun nextLevel(): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'userType' @ [369:25] ==> value-parameter userType: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>.visitUserType[ValueParameterDescriptorImpl]

'qualifier' @ [369:34] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'accept' @ [369:45] ==> public final fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtUserType[JavaMethodDescriptor]

'this' @ [369:52] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'prevLevel' @ [370:25] ==> protected final fun prevLevel(): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.collectElementsVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'element' @ [375:17] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'qualifier' @ [375:25] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'Skip' @ [375:81] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [376:39] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'referenceExpression' @ [376:47] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'Skip' @ [376:107] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'referenceExpression' @ [378:26] ==> val referenceExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targets' @ [378:46] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [378:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'singleOrNull' @ [378:70] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'Skip' @ [379:66] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [381:25] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'getResolutionScope' @ [381:33] ==> public fun PsiElement.getResolutionScope(bindingContext: BindingContext, resolutionFacade: ResolutionFacade): LexicalScope defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [381:52] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'resolutionFacade' @ [381:68] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor[PropertyDescriptorImpl]

'target' @ [382:24] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'name' @ [382:31] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'if (target is ClassifierDescriptor)
                scope.findClassifier(name, NoLookupLocation.FROM_IDE)
            else
                scope.findPackage(name)' @ [383:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeclarationDescriptor?, elseBranch: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeclarationDescriptor?

'target' @ [383:36] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'scope' @ [384:17] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'findClassifier' @ [384:23] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [384:38] ==> val name: Name defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'FROM_IDE' @ [384:61] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [386:17] ==> val scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'findPackage' @ [386:23] ==> public fun HierarchicalScope.findPackage(name: Name): PackageViewDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'name' @ [386:35] ==> val name: Name defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targetByName' @ [388:33] ==> val targetByName: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'asString' @ [388:47] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'target' @ [388:61] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'asString' @ [388:68] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'if (canShortenNow) AnalyzeQualifiedElementResult.ShortenNow else AnalyzeQualifiedElementResult.ImportDescriptors(listOfNotNull(target))' @ [389:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult, elseBranch: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult): ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalyzeQualifiedElementResult

'canShortenNow' @ [389:24] ==> val canShortenNow: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'ShortenNow' @ [389:69] ==> public object ShortenNow : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'ImportDescriptors' @ [389:115] ==> public constructor ImportDescriptors(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[ClassConstructorDescriptorImpl]

'listOfNotNull' @ [389:133] ==> public fun <T : Any> listOfNotNull(element: DeclarationDescriptor?): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'target' @ [389:147] ==> val target: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'element' @ [393:13] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.shortenElement[ValueParameterDescriptorImpl]

'deleteQualifier' @ [393:21] ==> public open fun deleteQualifier(): Unit defined in org.jetbrains.kotlin.psi.KtUserType[JavaMethodDescriptor]

'element' @ [394:20] ==> value-parameter element: KtUserType defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenTypesProcessor.shortenElement[ValueParameterDescriptorImpl]

'ShorteningProcessor<KtDotQualifiedExpression>' @ [402:9] ==> public constructor ShorteningProcessor<TElement : KtElement>(file: KtFile, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtDotQualifiedExpression

'file' @ [402:55] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.<init>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [402:61] ==> value-parameter failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.<init>[ValueParameterDescriptorImpl]

'CollectElementsVisitor<KtDotQualifiedExpression>' @ [404:87] ==> public constructor CollectElementsVisitor<TElement : KtElement>(elementFilter: (PsiElement) -> ShortenReferences.FilterResult) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtDotQualifiedExpression

'elementFilter' @ [404:136] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.<init>[ValueParameterDescriptorImpl]

'invoke' @ [406:36] ==> public abstract operator fun invoke(p1: PsiElement): ShortenReferences.FilterResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'expression' @ [406:50] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'filterResult' @ [407:21] ==> val filterResult: ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[LocalVariableDescriptor]

'SKIP' @ [407:50] ==> enum entry SKIP defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'expression' @ [409:17] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'selectorExpression' @ [409:28] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'acceptChildren' @ [409:48] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [409:63] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[LazyClassReceiverParameterDescriptor]

'filterResult' @ [411:21] ==> val filterResult: ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[LocalVariableDescriptor]

'PROCESS' @ [411:50] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'addQualifiedElementToAnalyze' @ [412:21] ==> protected final fun addQualifiedElementToAnalyze(element: KtDotQualifiedExpression): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [412:50] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'nextLevel' @ [416:17] ==> protected final fun nextLevel(): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [417:17] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [417:28] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'accept' @ [417:47] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [417:54] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[LazyClassReceiverParameterDescriptor]

'prevLevel' @ [418:17] ==> protected final fun prevLevel(): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[SimpleFunctionDescriptorImpl]

'MyVisitor' @ [422:47] ==> public constructor MyVisitor(elementFilter: (PsiElement) -> ShortenReferences.FilterResult) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[ClassConstructorDescriptorImpl]

'elementFilter' @ [422:57] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.<init>[ValueParameterDescriptorImpl]

'QualifiedExpressionShorteningProcessor' @ [429:9] ==> public constructor QualifiedExpressionShorteningProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor[ClassConstructorDescriptorImpl]

'file' @ [429:48] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'elementFilter' @ [429:54] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [429:69] ==> value-parameter failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'MyVisitor' @ [431:56] ==> public constructor MyVisitor(elementFilter: (PsiElement) -> ShortenReferences.FilterResult) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[ClassConstructorDescriptorImpl]

'elementFilter' @ [431:66] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'expression' @ [433:21] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.collectElementsVisitor.<no name provided>.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'receiverExpression' @ [433:32] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'!' @ [433:74] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [433:75] ==> public final var options: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.collectElementsVisitor.<no name provided>[PropertyDescriptorImpl]

'removeThis' @ [433:83] ==> public final val removeThis: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[PropertyDescriptorImpl]

'super' @ [434:17] ==> <this> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.collectElementsVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDotQualifiedExpression' @ [434:23] ==> public open fun visitDotQualifiedExpression(expression: KtDotQualifiedExpression): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor.MyVisitor[SimpleFunctionDescriptorImpl]

'expression' @ [434:51] ==> value-parameter expression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.collectElementsVisitor.<no name provided>.visitDotQualifiedExpression[ValueParameterDescriptorImpl]

'element' @ [439:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'receiverExpression' @ [439:36] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [440:17] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'bindingContext' @ [440:50] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'QUALIFIER' @ [440:80] ==> public final val QUALIFIER: (WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>..WritableSlice<(KtExpression..KtExpression?), (Qualifier..Qualifier?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'receiver' @ [440:91] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'Skip' @ [440:147] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'!=' @ [442:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtElementImplStub[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [442:29] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?)>..Class<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?)>?)): KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>?)>

'element' @ [443:21] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'java' @ [444:46] ==> public val <T> KClass<KtImportDirective>.java: Class<KtImportDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtImportDirective

'java' @ [444:78] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'Skip' @ [444:130] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [446:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'selectorExpression' @ [446:36] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'Skip' @ [446:95] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selector' @ [447:26] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [447:35] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'Skip' @ [447:128] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'callee' @ [450:27] ==> val callee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targets' @ [450:34] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [450:42] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'callee' @ [451:32] ==> val callee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getResolvedCall' @ [451:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [451:55] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'targets' @ [453:17] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'isEmpty' @ [453:25] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'Skip' @ [453:73] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'component1' @ [455:18] ==> public final operator fun component1(): BindingContext defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [455:30] ==> public final operator fun component2(): KtExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'copyShortenAndAnalyze' @ [455:57] ==> private final fun copyShortenAndAnalyze(element: KtDotQualifiedExpression, bindingContext: BindingContext): Pair<BindingContext, KtExpression> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[SimpleFunctionDescriptorImpl]

'element' @ [455:79] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'bindingContext' @ [455:88] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'selectorAfterShortening' @ [456:29] ==> val selectorAfterShortening: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [456:53] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newCallee' @ [458:36] ==> val newCallee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targets' @ [458:46] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'newContext' @ [458:54] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'newCallee' @ [460:41] ==> val newCallee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getResolvedCall' @ [460:51] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [460:67] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targetsMatch' @ [461:32] ==> private final fun targetsMatch(targets1: Collection<DeclarationDescriptor>, targets2: Collection<DeclarationDescriptor>): Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[SimpleFunctionDescriptorImpl]

'targets' @ [461:45] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targetsWhenShort' @ [461:54] ==> val targetsWhenShort: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCall' @ [462:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCallWhenShort' @ [463:40] ==> val resolvedCallWhenShort: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCallsMatch' @ [464:40] ==> private final fun resolvedCallsMatch(rc1: VariableAsFunctionResolvedCall?, rc2: VariableAsFunctionResolvedCall?): Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [464:59] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCallWhenShort' @ [464:73] ==> val resolvedCallWhenShort: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'if (resolvedCall != null && resolvedCallWhenShort != null) {
                resolvedCall.resultingDescriptor.original == resolvedCallWhenShort.resultingDescriptor.original
            }
            else {
                val resolvedCalls = selector.getCall(bindingContext)?.resolveCandidates(bindingContext, resolutionFacade) ?: emptyList()
                val callWhenShort = selectorAfterShortening.getCall(newContext)
                val resolvedCallsWhenShort = selectorAfterShortening.getCall(newContext)?.resolveCandidates(newContext, resolutionFacade) ?: emptyList()

                val descriptorsOfResolvedCallsWhenShort = resolvedCallsWhenShort.map { it.resultingDescriptor.original }
                val descriptorsOfResolvedCalls = resolvedCalls.mapTo(mutableSetOf()) { it.resultingDescriptor.original }

                val filter = ShadowedDeclarationsFilter(newContext, resolutionFacade, newCallee, callWhenShort?.explicitReceiver as? ReceiverValue)
                val availableDescriptorsWhenShort = filter.filter(descriptorsOfResolvedCallsWhenShort)

                availableDescriptorsWhenShort.any { it in descriptorsOfResolvedCalls }
            }' @ [475:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'resolvedCall' @ [475:42] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCallWhenShort' @ [475:66] ==> val resolvedCallWhenShort: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCall' @ [476:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resultingDescriptor' @ [476:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'original' @ [476:50] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'resolvedCallWhenShort' @ [476:62] ==> val resolvedCallWhenShort: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resultingDescriptor' @ [476:84] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'original' @ [476:104] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'selector' @ [479:37] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getCall' @ [479:46] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [479:54] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'resolveCandidates' @ [479:71] ==> public fun Call.resolveCandidates(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, expectedType: KotlinType = ..., filterOutWrongReceiver: Boolean = ..., filterOutByVisibility: Boolean = ...): Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]

'bindingContext' @ [479:89] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'resolutionFacade' @ [479:105] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'emptyList' @ [479:126] ==> public fun <T> emptyList(): List<ResolvedCall<FunctionDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>

'selectorAfterShortening' @ [480:37] ==> val selectorAfterShortening: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getCall' @ [480:61] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [480:69] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'selectorAfterShortening' @ [481:46] ==> val selectorAfterShortening: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getCall' @ [481:70] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [481:78] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolveCandidates' @ [481:91] ==> public fun Call.resolveCandidates(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, expectedType: KotlinType = ..., filterOutWrongReceiver: Boolean = ..., filterOutByVisibility: Boolean = ...): Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]

'newContext' @ [481:109] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolutionFacade' @ [481:121] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'emptyList' @ [481:142] ==> public fun <T> emptyList(): List<ResolvedCall<FunctionDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>

'resolvedCallsWhenShort' @ [483:59] ==> val resolvedCallsWhenShort: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'map' @ [483:82] ==> public inline fun <T, R> Iterable<ResolvedCall<FunctionDescriptor>>.map(transform: (ResolvedCall<FunctionDescriptor>) -> FunctionDescriptor): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>
    <R> -> FunctionDescriptor

'it' @ [483:88] ==> value-parameter it: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [483:91] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'original' @ [483:111] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'resolvedCalls' @ [484:50] ==> val resolvedCalls: Collection<ResolvedCall<FunctionDescriptor>> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'mapTo' @ [484:64] ==> public inline fun <T, R, C : MutableCollection<in FunctionDescriptor>> Iterable<ResolvedCall<FunctionDescriptor>>.mapTo(destination: MutableSet<FunctionDescriptor>, transform: (ResolvedCall<FunctionDescriptor>) -> FunctionDescriptor): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<FunctionDescriptor>
    <R> -> FunctionDescriptor
    <C : MutableCollection<in R>> -> MutableSet<FunctionDescriptor>

'mutableSetOf' @ [484:70] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [484:88] ==> value-parameter it: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement.<anonymous>[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [484:91] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'original' @ [484:111] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'ShadowedDeclarationsFilter' @ [486:30] ==> public constructor ShadowedDeclarationsFilter(bindingContext: BindingContext, resolutionFacade: ResolutionFacade, context: PsiElement, explicitReceiverValue: ReceiverValue?) defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedClassConstructorDescriptor]

'newContext' @ [486:57] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolutionFacade' @ [486:69] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'newCallee' @ [486:87] ==> val newCallee: KtReferenceExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'callWhenShort' @ [486:98] ==> val callWhenShort: Call? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'explicitReceiver' @ [486:113] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'filter' @ [487:53] ==> val filter: ShadowedDeclarationsFilter defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'filter' @ [487:60] ==> public final fun <TDescriptor : DeclarationDescriptor> filter(declarations: Collection<FunctionDescriptor>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.util.ShadowedDeclarationsFilter[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <TDescriptor : DeclarationDescriptor> -> FunctionDescriptor

'descriptorsOfResolvedCallsWhenShort' @ [487:67] ==> val descriptorsOfResolvedCallsWhenShort: List<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'availableDescriptorsWhenShort' @ [489:17] ==> val availableDescriptorsWhenShort: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'any' @ [489:47] ==> public inline fun <T> Iterable<FunctionDescriptor>.any(predicate: (FunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [489:53] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement.<anonymous>[ValueParameterDescriptorImpl]

'descriptorsOfResolvedCalls' @ [489:59] ==> val descriptorsOfResolvedCalls: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'receiver' @ [493:17] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'!' @ [494:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'targetsMatch' @ [494:22] ==> val targetsMatch: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'Skip' @ [494:73] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selector' @ [495:36] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getResolvedCall' @ [495:45] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [495:61] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'Skip' @ [495:117] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selectorAfterShortening' @ [496:31] ==> val selectorAfterShortening: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'getResolvedCall' @ [496:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'newContext' @ [496:71] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'Skip' @ [496:123] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'originalCall' @ [497:36] ==> val originalCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'explicitReceiverKind' @ [497:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'when (receiverKind) {
                                      ExplicitReceiverKind.BOTH_RECEIVERS, ExplicitReceiverKind.EXTENSION_RECEIVER -> newCall.extensionReceiver
                                      ExplicitReceiverKind.DISPATCH_RECEIVER -> newCall.dispatchReceiver
                                      else -> return AnalyzeQualifiedElementResult.Skip
                                  }' @ [498:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReceiverValue?, entry1: ReceiverValue?, entry2: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReceiverValue?

'receiverKind' @ [498:41] ==> val receiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'BOTH_RECEIVERS' @ [499:60] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'EXTENSION_RECEIVER' @ [499:97] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'newCall' @ [499:119] ==> val newCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'extensionReceiver' @ [499:127] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'DISPATCH_RECEIVER' @ [500:60] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'newCall' @ [500:81] ==> val newCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'dispatchReceiver' @ [500:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'Skip' @ [501:84] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'Skip' @ [502:98] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'receiver' @ [504:34] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'instanceReference' @ [504:43] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'targets' @ [504:61] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [504:69] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'singleOrNull' @ [504:85] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'newReceiver' @ [505:21] ==> val newReceiver: ImplicitReceiver defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'declarationDescriptor' @ [505:33] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'asString' @ [505:55] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'thisTarget' @ [505:69] ==> val thisTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'asString' @ [505:81] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'Skip' @ [505:130] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'when {
                targetsMatch || resolvedCallsMatch -> AnalyzeQualifiedElementResult.ShortenNow

            // it makes no sense to insert import when there is a conflict with function, property etc
                targetsWhenShort.any { it !is ClassifierDescriptorWithTypeParameters && it !is PackageViewDescriptor } -> AnalyzeQualifiedElementResult.Skip


                else -> AnalyzeQualifiedElementResult.ImportDescriptors(targets)
            }' @ [508:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult, entry1: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult, entry2: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult): ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> AnalyzeQualifiedElementResult

'targetsMatch' @ [509:17] ==> val targetsMatch: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'resolvedCallsMatch' @ [509:33] ==> val resolvedCallsMatch: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'ShortenNow' @ [509:85] ==> public object ShortenNow : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'targetsWhenShort' @ [512:17] ==> val targetsWhenShort: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'any' @ [512:34] ==> public inline fun <T> Iterable<DeclarationDescriptor>.any(predicate: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [512:40] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [512:89] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement.<anonymous>[ValueParameterDescriptorImpl]

'Skip' @ [512:153] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'ImportDescriptors' @ [515:55] ==> public constructor ImportDescriptors(descriptors: Collection<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult.ImportDescriptors[ClassConstructorDescriptorImpl]

'targets' @ [515:73] ==> val targets: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'element' @ [520:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'selectorExpression' @ [520:36] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [528:41] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'getParentOfType' @ [528:49] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtDoubleColonExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDoubleColonExpression

'doubleColonExpression' @ [529:17] ==> val doubleColonExpression: KtDoubleColonExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'doubleColonExpression' @ [529:50] ==> val doubleColonExpression: KtDoubleColonExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'receiverExpression' @ [529:72] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[DeserializedPropertyDescriptor]

'element' @ [529:94] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'doubleColonExpression' @ [530:49] ==> val doubleColonExpression: KtDoubleColonExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'copied' @ [530:71] ==> @Suppress public fun <T : PsiElement> KtDoubleColonExpression.copied(): KtDoubleColonExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtDoubleColonExpression

'doubleColonExpressionCopy' @ [531:17] ==> val doubleColonExpressionCopy: KtDoubleColonExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'receiverExpression' @ [531:43] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[DeserializedPropertyDescriptor]

'replace' @ [531:64] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'selector' @ [531:72] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'doubleColonExpressionCopy' @ [532:41] ==> val doubleColonExpressionCopy: KtDoubleColonExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'analyzeAsReplacement' @ [532:67] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'doubleColonExpression' @ [532:88] ==> val doubleColonExpression: KtDoubleColonExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'bindingContext' @ [532:111] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'resolutionFacade' @ [532:127] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'newBindingContext' @ [533:24] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'doubleColonExpressionCopy' @ [533:45] ==> val doubleColonExpressionCopy: KtDoubleColonExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'receiverExpression' @ [533:71] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDoubleColonExpression[DeserializedPropertyDescriptor]

'element' @ [536:34] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'getQualifiedExpressionForReceiver' @ [536:42] ==> public fun KtExpression.getQualifiedExpressionForReceiver(): KtQualifiedExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'qualifiedAbove' @ [537:17] ==> val qualifiedAbove: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'qualifiedAbove' @ [538:42] ==> val qualifiedAbove: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'copied' @ [538:57] ==> @Suppress public fun <T : PsiElement> KtQualifiedExpression.copied(): KtQualifiedExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtQualifiedExpression

'qualifiedAboveCopy' @ [539:17] ==> val qualifiedAboveCopy: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'receiverExpression' @ [539:36] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'replace' @ [539:55] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'selector' @ [539:63] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'qualifiedAboveCopy' @ [540:41] ==> val qualifiedAboveCopy: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'analyzeAsReplacement' @ [540:60] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'qualifiedAbove' @ [540:81] ==> val qualifiedAbove: KtQualifiedExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'bindingContext' @ [540:97] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'resolutionFacade' @ [540:113] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'newBindingContext' @ [541:24] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'qualifiedAboveCopy' @ [541:45] ==> val qualifiedAboveCopy: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'receiverExpression' @ [541:64] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'selector' @ [544:26] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'copied' @ [544:35] ==> @Suppress public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtExpression

'copied' @ [545:37] ==> val copied: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'analyzeAsReplacement' @ [545:44] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'element' @ [545:65] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'bindingContext' @ [545:74] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[ValueParameterDescriptorImpl]

'resolutionFacade' @ [545:90] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor[PropertyDescriptorImpl]

'newBindingContext' @ [546:20] ==> val newBindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'copied' @ [546:41] ==> val copied: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.copyShortenAndAnalyze[LocalVariableDescriptor]

'targets1' @ [550:17] ==> value-parameter targets1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'size' @ [550:26] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'targets2' @ [550:34] ==> value-parameter targets2: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'size' @ [550:43] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'if (targets1.size == 1) {
                targets1.single().asString() == targets2.single().asString()
            }
            else {
                targets1.map { it.asString() }.toSet() == targets2.map { it.asString() }.toSet()
            }' @ [551:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'targets1' @ [551:24] ==> value-parameter targets1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'size' @ [551:33] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'targets1' @ [552:17] ==> value-parameter targets1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'single' @ [552:26] ==> public fun <T> Iterable<DeclarationDescriptor>.single(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'asString' @ [552:35] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'targets2' @ [552:49] ==> value-parameter targets2: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'single' @ [552:58] ==> public fun <T> Iterable<DeclarationDescriptor>.single(): DeclarationDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'asString' @ [552:67] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'targets1' @ [555:17] ==> value-parameter targets1: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'map' @ [555:26] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'it' @ [555:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [555:35] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'toSet' @ [555:48] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'targets2' @ [555:59] ==> value-parameter targets2: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch[ValueParameterDescriptorImpl]

'map' @ [555:68] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> String

'it' @ [555:74] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.targetsMatch.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [555:77] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'toSet' @ [555:90] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'rc1' @ [560:20] ==> value-parameter rc1: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.resolvedCallsMatch[ValueParameterDescriptorImpl]

'variableCall' @ [560:25] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [560:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.candidateDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'asString' @ [560:60] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'rc2' @ [560:74] ==> value-parameter rc2: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.resolvedCallsMatch[ValueParameterDescriptorImpl]

'variableCall' @ [560:79] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [560:93] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.candidateDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'asString' @ [560:114] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'rc1' @ [561:20] ==> value-parameter rc1: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.resolvedCallsMatch[ValueParameterDescriptorImpl]

'functionCall' @ [561:25] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [561:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'asString' @ [561:60] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'rc2' @ [561:74] ==> value-parameter rc2: VariableAsFunctionResolvedCall? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.resolvedCallsMatch[ValueParameterDescriptorImpl]

'functionCall' @ [561:79] ==> public abstract val functionCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [561:93] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<FunctionDescriptor>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'asString' @ [561:114] ==> private final fun DeclarationDescriptor.asString(): String defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'element' @ [565:26] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[ValueParameterDescriptorImpl]

'parent' @ [565:34] ==> public final val KtDotQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parens' @ [566:34] ==> val parens: KtParenthesizedExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'!' @ [566:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areParenthesesUseless' @ [566:63] ==> public open fun areParenthesesUseless(@NotNull p0: KtParenthesizedExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parens' @ [566:85] ==> val parens: KtParenthesizedExpression? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'element' @ [567:36] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[ValueParameterDescriptorImpl]

'replace' @ [567:44] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'element' @ [567:52] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[ValueParameterDescriptorImpl]

'selectorExpression' @ [567:60] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'requiredParens' @ [568:17] ==> val requiredParens: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'shortenedElement' @ [568:40] ==> val shortenedElement: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'parent' @ [568:57] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'replaced' @ [568:64] ==> @Suppress public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtElement): KtElement defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtElement

'shortenedElement' @ [568:73] ==> val shortenedElement: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'shortenedElement' @ [569:20] ==> val shortenedElement: KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenQualifiedExpressionsProcessor.shortenElement[LocalVariableDescriptor]

'ShorteningProcessor<KtThisExpression>' @ [577:9] ==> public constructor ShorteningProcessor<TElement : KtElement>(file: KtFile, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtThisExpression

'file' @ [577:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [577:53] ==> value-parameter failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [579:34] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [579:47] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'createExpression' @ [579:53] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'CollectElementsVisitor<KtThisExpression>' @ [582:26] ==> public constructor CollectElementsVisitor<TElement : KtElement>(elementFilter: (PsiElement) -> ShortenReferences.FilterResult) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.CollectElementsVisitor[ClassConstructorDescriptorImpl]
Inferred types:
    <TElement : KtElement> -> KtThisExpression

'elementFilter' @ [582:67] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.<init>[ValueParameterDescriptorImpl]

'options' @ [584:29] ==> public final var options: ShortenReferences.Options defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.collectElementsVisitor.<no name provided>[PropertyDescriptorImpl]

'removeThisLabels' @ [584:37] ==> public final val removeThisLabels: Boolean defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Options[PropertyDescriptorImpl]

'invoke' @ [584:57] ==> public abstract operator fun invoke(p1: PsiElement): ShortenReferences.FilterResult defined in kotlin.Function1[FunctionInvokeDescriptor]

'expression' @ [584:71] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.collectElementsVisitor.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'PROCESS' @ [584:99] ==> enum entry PROCESS defined in org.jetbrains.kotlin.idea.core.ShortenReferences.FilterResult[FakeCallableDescriptorForObject]

'expression' @ [584:110] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.collectElementsVisitor.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'getTargetLabel' @ [584:121] ==> public final fun getTargetLabel(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedSimpleFunctionDescriptor]

'addQualifiedElementToAnalyze' @ [585:29] ==> protected final fun addQualifiedElementToAnalyze(element: KtThisExpression): Unit defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.collectElementsVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'expression' @ [585:58] ==> value-parameter expression: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.collectElementsVisitor.<no name provided>.visitThisExpression[ValueParameterDescriptorImpl]

'element' @ [591:32] ==> value-parameter element: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'instanceReference' @ [591:40] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'targets' @ [591:58] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'bindingContext' @ [591:66] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'singleOrNull' @ [591:82] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'Skip' @ [591:137] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'simpleThis' @ [592:30] ==> private final val simpleThis: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor[PropertyDescriptorImpl]

'analyzeAsReplacement' @ [592:41] ==> @JvmOverloads public fun KtExpression.analyzeAsReplacement(expressionToBeReplaced: KtExpression, bindingContext: BindingContext, resolutionFacade: ResolutionFacade = ..., trace: BindingTrace = ..., contextDependency: ContextDependency = ...): BindingContext defined in org.jetbrains.kotlin.idea.analysis[DeserializedSimpleFunctionDescriptor]

'element' @ [592:62] ==> value-parameter element: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'bindingContext' @ [592:71] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'resolutionFacade' @ [592:87] ==> protected final val resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor[PropertyDescriptorImpl]

'simpleThis' @ [593:31] ==> private final val simpleThis: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor[PropertyDescriptorImpl]

'instanceReference' @ [593:42] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'targets' @ [593:60] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'newContext' @ [593:68] ==> val newContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'singleOrNull' @ [593:80] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'if (targetBefore == targetAfter) AnalyzeQualifiedElementResult.ShortenNow else AnalyzeQualifiedElementResult.Skip' @ [594:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult, elseBranch: ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult): ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> AnalyzeQualifiedElementResult

'targetBefore' @ [594:24] ==> val targetBefore: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'targetAfter' @ [594:40] ==> val targetAfter: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'ShortenNow' @ [594:83] ==> public object ShortenNow : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'Skip' @ [594:129] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [598:20] ==> value-parameter element: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor.shortenElement[ValueParameterDescriptorImpl]

'replace' @ [598:28] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtThisExpression[DeserializedSimpleFunctionDescriptor]

'simpleThis' @ [598:36] ==> private final val simpleThis: KtThisExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShortenThisExpressionsProcessor[PropertyDescriptorImpl]

'QualifiedExpressionShorteningProcessor' @ [606:9] ==> public constructor QualifiedExpressionShorteningProcessor(file: KtFile, elementFilter: (PsiElement) -> ShortenReferences.FilterResult, failedToImportDescriptors: Set<DeclarationDescriptor>) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.QualifiedExpressionShorteningProcessor[ClassConstructorDescriptorImpl]

'file' @ [606:48] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.<init>[ValueParameterDescriptorImpl]

'elementFilter' @ [606:54] ==> value-parameter elementFilter: (PsiElement) -> ShortenReferences.FilterResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.<init>[ValueParameterDescriptorImpl]

'failedToImportDescriptors' @ [606:69] ==> value-parameter failedToImportDescriptors: Set<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.<init>[ValueParameterDescriptorImpl]

'getCalleeExpressionIfAny' @ [609:21] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'targets' @ [609:76] ==> private final fun KtReferenceExpression.targets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[SimpleFunctionDescriptorImpl]

'context' @ [609:84] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.singleTarget[ValueParameterDescriptorImpl]

'singleOrNull' @ [609:94] ==> public fun <T> Iterable<DeclarationDescriptor>.singleOrNull(): DeclarationDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'element' @ [613:26] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'parent' @ [613:34] ==> public final val KtDotQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [615:17] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'parent' @ [615:60] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'receiverExpression' @ [615:67] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[DeserializedPropertyDescriptor]

'element' @ [615:89] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'Skip' @ [615:135] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [617:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'receiverExpression' @ [617:36] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'!=' @ [619:17] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtElementImplStub[DeserializedSimpleFunctionDescriptor]

'getParentOfType' @ [619:29] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?)>..Class<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>?)>?)): KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>..KtElementImplStub<out (StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>..StubElement<out (KtElementImplStub<out (StubElement<*>..StubElement<*>?)>..KtElementImplStub<out (StubElement<*>..StubElement<*>?)>?)>?)>?)>?)>? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>..com.intellij.psi.stubs.StubElement<out (org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>..org.jetbrains.kotlin.psi.KtElementImplStub<out (com.intellij.psi.stubs.StubElement<*>..com.intellij.psi.stubs.StubElement<*>?)>?)>?)>?)>?)>

'element' @ [620:21] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'java' @ [621:46] ==> public val <T> KClass<KtImportDirective>.java: Class<KtImportDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtImportDirective

'java' @ [621:78] ==> public val <T> KClass<KtPackageDirective>.java: Class<KtPackageDirective> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'Skip' @ [621:130] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'receiver' @ [623:34] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'singleTarget' @ [623:43] ==> private final fun KtExpression.singleTarget(context: BindingContext): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor[SimpleFunctionDescriptorImpl]

'bindingContext' @ [623:56] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'Skip' @ [623:132] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [625:38] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'selectorExpression' @ [625:46] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'Skip' @ [625:105] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selectorExpression' @ [626:34] ==> val selectorExpression: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'singleTarget' @ [626:53] ==> private final fun KtExpression.singleTarget(context: BindingContext): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor[SimpleFunctionDescriptorImpl]

'bindingContext' @ [626:66] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'Skip' @ [626:122] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'receiverTarget' @ [628:17] ==> val receiverTarget: ClassDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'companionObjectDescriptor' @ [628:32] ==> public final val ClassDescriptor.companionObjectDescriptor: ClassDescriptor?[MyPropertyDescriptor]

'selectorTarget' @ [628:61] ==> val selectorTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'Skip' @ [628:114] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'?:' @ [630:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'parent' @ [630:38] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'selectorExpression' @ [630:76] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'ShortenNow' @ [631:77] ==> public object ShortenNow : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selectorsSelector' @ [633:43] ==> val selectorsSelector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'singleTarget' @ [633:61] ==> private final fun KtExpression.singleTarget(context: BindingContext): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor[SimpleFunctionDescriptorImpl]

'bindingContext' @ [633:74] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[ValueParameterDescriptorImpl]

'Skip' @ [633:130] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selectorsSelectorTarget' @ [634:17] ==> val selectorsSelectorTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'Skip' @ [634:98] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'selectorsSelectorTarget' @ [636:17] ==> val selectorsSelectorTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'selectorsSelectorTarget' @ [637:30] ==> val selectorsSelectorTarget: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'source' @ [637:54] ==> public final val PropertyDescriptor.source: SourceElement[MyPropertyDescriptor]

'getPsi' @ [637:61] ==> public fun SourceElement.getPsi(): PsiElement? defined in org.jetbrains.kotlin.resolve.source[DeserializedSimpleFunctionDescriptor]

'source' @ [638:21] ==> val source: KtProperty? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'isEnumCompanionPropertyWithEntryConflict' @ [638:39] ==> public fun isEnumCompanionPropertyWithEntryConflict(element: PsiElement, expectedName: String): Boolean defined in org.jetbrains.kotlin.idea.core in file Utils.kt[SimpleFunctionDescriptorImpl]

'source' @ [638:80] ==> val source: KtProperty? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'source' @ [638:88] ==> val source: KtProperty? defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.analyzeQualifiedElement[LocalVariableDescriptor]

'name' @ [638:95] ==> public final val KtProperty.name: String?[MyPropertyDescriptor]

'Skip' @ [638:145] ==> public object Skip : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'ShortenNow' @ [641:50] ==> public object ShortenNow : ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult defined in org.jetbrains.kotlin.idea.core.ShortenReferences.ShorteningProcessor.AnalyzeQualifiedElementResult[FakeCallableDescriptorForObject]

'element' @ [645:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'receiverExpression' @ [645:36] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [646:28] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'selectorExpression' @ [646:36] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'element' @ [646:65] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'when (receiver) {
                is KtSimpleNameExpression -> {
                    val identifier = receiver.getIdentifier() ?: return element
                    (selector.getCalleeExpressionIfAny() as? KtSimpleNameExpression)?.getIdentifier()?.replace(identifier)
                    element.replace(selector) as KtExpression
                }

                is KtQualifiedExpression -> {
                    val identifier = (receiver.selectorExpression as? KtSimpleNameExpression)?.getIdentifier() ?: return element
                    (selector.getCalleeExpressionIfAny() as? KtSimpleNameExpression)?.getIdentifier()?.replace(identifier)
                    receiver.selectorExpression?.replace(selector)
                    element.replace(receiver) as KtExpression
                }

                else -> element
            }' @ [648:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement, entry1: KtElement, entry2: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement

'receiver' @ [648:26] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'receiver' @ [650:38] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'getIdentifier' @ [650:47] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [650:73] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'selector' @ [651:22] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [651:31] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'getIdentifier' @ [651:87] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'replace' @ [651:104] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'identifier' @ [651:112] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'element' @ [652:21] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'replace' @ [652:29] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'selector' @ [652:37] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'?:' @ [656:38] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'receiver' @ [656:39] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'selectorExpression' @ [656:48] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'getIdentifier' @ [656:96] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'element' @ [656:122] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'selector' @ [657:22] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'getCalleeExpressionIfAny' @ [657:31] ==> public fun KtElement?.getCalleeExpressionIfAny(): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'getIdentifier' @ [657:87] ==> public abstract fun getIdentifier(): PsiElement? defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'replace' @ [657:104] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'identifier' @ [657:112] ==> val identifier: PsiElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'receiver' @ [658:21] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'selectorExpression' @ [658:30] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'replace' @ [658:50] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'selector' @ [658:58] ==> val selector: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'element' @ [659:21] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

'replace' @ [659:29] ==> @NotNull public open fun replace(@NotNull p0: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[JavaMethodDescriptor]

'receiver' @ [659:37] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[LocalVariableDescriptor]

'element' @ [662:25] ==> value-parameter element: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.core.ShortenReferences.RemoveExplicitCompanionObjectReferenceProcessor.shortenElement[ValueParameterDescriptorImpl]

