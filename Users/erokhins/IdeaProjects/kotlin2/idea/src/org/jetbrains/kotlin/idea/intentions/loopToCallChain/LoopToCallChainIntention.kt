'IntentionBasedInspection<KtForExpression>' @ [30:35] ==> public constructor IntentionBasedInspection<TElement : PsiElement>(intentionInfos: List<IntentionBasedInspection.IntentionData<KtForExpression>>, problemText: String?) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'listOf' @ [31:9] ==> public fun <T> listOf(vararg elements: IntentionBasedInspection.IntentionData<KtForExpression>): List<IntentionBasedInspection.IntentionData<KtForExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IntentionData<KtForExpression>

'IntentionData' @ [31:16] ==> public constructor IntentionData<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtForExpression>>, additionalChecker: (KtForExpression, IntentionBasedInspection<KtForExpression>) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'LoopToCallChainIntention' @ [31:30] ==> public constructor LoopToCallChainIntention() defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopToCallChainIntention[ClassConstructorDescriptorImpl]

'IntentionData' @ [31:64] ==> public constructor IntentionData<TElement : PsiElement>(intention: KClass<out SelfTargetingRangeIntention<KtForExpression>>, additionalChecker: (KtForExpression, IntentionBasedInspection<KtForExpression>) -> Boolean = ...) defined in org.jetbrains.kotlin.idea.inspections.IntentionBasedInspection.IntentionData[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'LoopToLazyCallChainIntention' @ [31:78] ==> public constructor LoopToLazyCallChainIntention() defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.LoopToLazyCallChainIntention[ClassConstructorDescriptorImpl]

'AbstractLoopToCallChainIntention' @ [35:34] ==> public constructor AbstractLoopToCallChainIntention(lazy: Boolean, text: String) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[ClassConstructorDescriptorImpl]

'AbstractLoopToCallChainIntention' @ [37:38] ==> public constructor AbstractLoopToCallChainIntention(lazy: Boolean, text: String) defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[ClassConstructorDescriptorImpl]

'SelfTargetingRangeIntention<KtForExpression>' @ [39:92] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtForExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtForExpression

'KtForExpression' @ [40:9] ==> public constructor KtForExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtForExpression[JavaClassConstructorDescriptor]

'java' @ [40:32] ==> public val <T> KClass<KtForExpression>.java: Class<KtForExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtForExpression

'text' @ [41:9] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.<init>[ValueParameterDescriptorImpl]

'match' @ [44:21] ==> public fun match(loop: KtForExpression, useLazySequence: Boolean): MatchResult? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'element' @ [44:27] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applicabilityRange[ValueParameterDescriptorImpl]

'lazy' @ [44:36] ==> private final val lazy: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[PropertyDescriptorImpl]

'text' @ [45:9] ==> public final var AbstractLoopToCallChainIntention.text: String[MyPropertyDescriptor]

'if (match != null) "Replace with '${match.transformationMatch.buildPresentation()}'" else defaultText' @ [45:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'match' @ [45:20] ==> val match: MatchResult? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applicabilityRange[LocalVariableDescriptor]

'match' @ [45:52] ==> val match: MatchResult? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applicabilityRange[LocalVariableDescriptor]

'transformationMatch' @ [45:58] ==> public final val transformationMatch: TransformationMatch.Result defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.MatchResult[PropertyDescriptorImpl]

'buildPresentation' @ [45:78] ==> private final fun TransformationMatch.Result.buildPresentation(): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[SimpleFunctionDescriptorImpl]

'defaultText' @ [45:106] ==> protected final val defaultText: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[DeserializedPropertyDescriptor]

'if (match != null) element.forKeyword.textRange else null' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TextRange?, elseBranch: TextRange?): TextRange?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TextRange?

'match' @ [46:20] ==> val match: MatchResult? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applicabilityRange[LocalVariableDescriptor]

'element' @ [46:35] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applicabilityRange[ValueParameterDescriptorImpl]

'forKeyword' @ [46:43] ==> public final val KtForExpression.forKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [46:54] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'buildPresentation' @ [50:16] ==> private final fun buildPresentation(transformations: List<Transformation>, prevPresentation: String?): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[SimpleFunctionDescriptorImpl]

'sequenceTransformations' @ [50:34] ==> public final val sequenceTransformations: List<SequenceTransformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'resultTransformation' @ [50:60] ==> public final val resultTransformation: ResultTransformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.TransformationMatch.Result[PropertyDescriptorImpl]

'transformations' @ [55:13] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'size' @ [55:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'MAX' @ [55:36] ==> val MAX: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'transformations' @ [56:17] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'buildPresentation' @ [57:24] ==> private final fun buildPresentation(transformations: List<Transformation>, prevPresentation: String?): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[SimpleFunctionDescriptorImpl]

'transformations' @ [57:42] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'drop' @ [57:58] ==> public fun <T> Iterable<Transformation>.drop(n: Int): List<Transformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Transformation

'transformations' @ [57:67] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'presentation' @ [57:86] ==> public abstract val presentation: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.Transformation[PropertyDescriptorImpl]

'buildPresentation' @ [60:20] ==> private final fun buildPresentation(transformations: List<Transformation>, prevPresentation: String?): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[SimpleFunctionDescriptorImpl]

'transformations' @ [60:38] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'drop' @ [60:54] ==> public fun <T> Iterable<Transformation>.drop(n: Int): List<Transformation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Transformation

'transformations' @ [60:59] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'size' @ [60:75] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'MAX' @ [60:82] ==> val MAX: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'prevPresentation' @ [60:88] ==> value-parameter prevPresentation: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'let' @ [60:106] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'it' @ [60:112] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation.<anonymous>[ValueParameterDescriptorImpl]

'prevPresentation' @ [63:31] ==> value-parameter prevPresentation: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'transformations' @ [64:32] ==> value-parameter transformations: List<Transformation> defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[ValueParameterDescriptorImpl]

'result' @ [65:13] ==> var result: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'transformation' @ [65:22] ==> val transformation: Transformation defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'buildPresentation' @ [65:37] ==> public open fun buildPresentation(prevTransformationsPresentation: String?): String defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.Transformation[SimpleFunctionDescriptorImpl]

'result' @ [65:55] ==> var result: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'result' @ [67:16] ==> var result: String? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.buildPresentation[LocalVariableDescriptor]

'match' @ [71:21] ==> public fun match(loop: KtForExpression, useLazySequence: Boolean): MatchResult? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'element' @ [71:27] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[ValueParameterDescriptorImpl]

'lazy' @ [71:36] ==> private final val lazy: Boolean defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention[PropertyDescriptorImpl]

'convertLoop' @ [72:22] ==> public fun convertLoop(loop: KtForExpression, matchResult: MatchResult): KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain in file matchAndConvert.kt[SimpleFunctionDescriptorImpl]

'element' @ [72:34] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[ValueParameterDescriptorImpl]

'match' @ [72:43] ==> val match: MatchResult defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

'when (result) {
            // if result is variable declaration, put the caret onto its name to allow quick inline
            is KtProperty -> result.nameIdentifier?.startOffset ?: result.startOffset
            else -> result.startOffset
        }' @ [74:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'result' @ [74:28] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

'result' @ [76:30] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

'nameIdentifier' @ [76:37] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'startOffset' @ [76:53] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'result' @ [76:68] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [76:75] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'result' @ [77:21] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

'startOffset' @ [77:28] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'editor' @ [80:9] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[ValueParameterDescriptorImpl]

'moveCaret' @ [80:17] ==> public fun Editor.moveCaret(offset: Int, scrollType: ScrollType = ...): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'offset' @ [80:27] ==> val offset: Int defined in org.jetbrains.kotlin.idea.intentions.loopToCallChain.AbstractLoopToCallChainIntention.applyTo[LocalVariableDescriptor]

