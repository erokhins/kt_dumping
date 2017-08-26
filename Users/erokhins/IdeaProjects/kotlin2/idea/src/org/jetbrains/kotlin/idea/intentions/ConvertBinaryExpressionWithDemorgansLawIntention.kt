'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [25:58] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [25:118] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [25:144] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [27:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [27:28] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [27:44] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [27:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.isApplicableTo.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [27:83] ==> public fun <T> Sequence<PsiElement>.last(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'text' @ [29:9] ==> public final var ConvertBinaryExpressionWithDemorgansLawIntention.text: String[MyPropertyDescriptor]

'when (expr.operationToken) {
            KtTokens.ANDAND -> "Replace '&&' with '||'"
            KtTokens.OROR -> "Replace '||' with '&&'"
            else -> return false
        }' @ [29:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'expr' @ [29:22] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.isApplicableTo[LocalVariableDescriptor]

'operationToken' @ [29:27] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [30:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [31:22] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'splitBooleanSequence' @ [35:16] ==> private final fun splitBooleanSequence(expression: KtBinaryExpression): List<KtExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[SimpleFunctionDescriptorImpl]

'expr' @ [35:37] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.isApplicableTo[LocalVariableDescriptor]

'applyTo' @ [39:9] ==> public final fun applyTo(element: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[SimpleFunctionDescriptorImpl]

'element' @ [39:17] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[ValueParameterDescriptorImpl]

'element' @ [43:20] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [43:28] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [43:44] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [43:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [43:83] ==> public fun <T> Sequence<PsiElement>.last(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'when (expr.operationToken) {
            KtTokens.ANDAND -> KtTokens.OROR.value
            KtTokens.OROR -> KtTokens.ANDAND.value
            else -> throw IllegalArgumentException()
        }' @ [45:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'expr' @ [45:34] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'operationToken' @ [45:39] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [46:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [46:41] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [46:46] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'OROR' @ [47:22] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANDAND' @ [47:39] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [47:46] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'IllegalArgumentException' @ [48:27] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'splitBooleanSequence' @ [51:24] ==> private final fun splitBooleanSequence(expression: KtBinaryExpression): List<KtExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention[SimpleFunctionDescriptorImpl]

'expr' @ [51:45] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'asReversed' @ [51:53] ==> public fun <T> List<KtExpression>.asReversed(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'KtPsiFactory' @ [53:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expr' @ [53:42] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'buildExpression' @ [53:48] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendExpressions' @ [54:13] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'operands' @ [54:31] ==> val operands: List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'map' @ [54:40] ==> public inline fun <T, R> Iterable<KtExpression>.map(transform: (KtExpression) -> KtExpression): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression

'it' @ [54:46] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'negate' @ [54:49] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'operatorText' @ [54:73] ==> val operatorText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'expr' @ [57:33] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'parent' @ [57:38] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [57:45] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expr' @ [58:23] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'parent' @ [58:28] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'grandParentPrefix' @ [59:23] ==> val grandParentPrefix: KtPrefixExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'operationReference' @ [59:42] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [59:62] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'EXCL' @ [59:105] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (negated) {
            grandParentPrefix?.replace(newExpression)
        } else {
            expr.replace(newExpression.negate())
        }' @ [60:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement?, elseBranch: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement?

'negated' @ [60:13] ==> val negated: Boolean defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'grandParentPrefix' @ [61:13] ==> val grandParentPrefix: KtPrefixExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'replace' @ [61:32] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtPrefixExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [61:40] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'expr' @ [63:13] ==> val expr: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'replace' @ [63:18] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [63:26] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.applyTo[LocalVariableDescriptor]

'negate' @ [63:40] ==> public fun KtExpression.negate(): KtExpression defined in org.jetbrains.kotlin.idea.intentions in file Utils.kt[SimpleFunctionDescriptorImpl]

'ArrayList' @ [68:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'expression' @ [69:29] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[ValueParameterDescriptorImpl]

'operationToken' @ [69:40] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'expression' @ [71:49] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[ValueParameterDescriptorImpl]

'remainingExpression' @ [73:17] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'remainingExpression' @ [75:29] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'operationToken' @ [75:49] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'operation' @ [76:17] ==> val operation: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'ANDAND' @ [76:39] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operation' @ [76:49] ==> val operation: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'OROR' @ [76:71] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operation' @ [78:17] ==> val operation: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'firstOperator' @ [78:30] ==> val firstOperator: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'result' @ [80:13] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'add' @ [80:20] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'remainingExpression' @ [80:24] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'right' @ [80:44] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'remainingExpression' @ [81:13] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'remainingExpression' @ [81:35] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'left' @ [81:55] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'result' @ [84:9] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'add' @ [84:16] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'remainingExpression' @ [84:20] ==> var remainingExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

'result' @ [85:16] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertBinaryExpressionWithDemorgansLawIntention.splitBooleanSequence[LocalVariableDescriptor]

