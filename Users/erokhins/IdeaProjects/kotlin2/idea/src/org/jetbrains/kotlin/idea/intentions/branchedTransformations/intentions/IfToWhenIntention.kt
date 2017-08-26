'SelfTargetingRangeIntention<KtIfExpression>' @ [35:27] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtIfExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtIfExpression

'KtIfExpression' @ [35:71] ==> public constructor KtIfExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtIfExpression[JavaClassConstructorDescriptor]

'java' @ [35:93] ==> public val <T> KClass<KtIfExpression>.java: Class<KtIfExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtIfExpression

'element' @ [37:13] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'then' @ [37:21] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'element' @ [38:16] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applicabilityRange[ValueParameterDescriptorImpl]

'ifKeyword' @ [38:24] ==> public final val KtIfExpression.ifKeyword: PsiElement[MyPropertyDescriptor]

'textRange' @ [38:34] ==> public final val PsiElement.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'when (expression) {
                is KtReturnExpression, is KtThrowExpression ->
                    false
                is KtBlockExpression ->
                    expression.statements.all { canPassThrough(it) }
                is KtIfExpression ->
                    canPassThrough(expression.then) || canPassThrough(expression.`else`)
                else ->
                    true
            }' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'expression' @ [42:19] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.canPassThrough[ValueParameterDescriptorImpl]

'expression' @ [46:21] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.canPassThrough[ValueParameterDescriptorImpl]

'statements' @ [46:32] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'all' @ [46:43] ==> public inline fun <T> Iterable<(KtExpression..KtExpression?)>.all(predicate: ((KtExpression..KtExpression?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'canPassThrough' @ [46:49] ==> private final fun canPassThrough(expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'it' @ [46:64] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.canPassThrough.<anonymous>[ValueParameterDescriptorImpl]

'canPassThrough' @ [48:21] ==> private final fun canPassThrough(expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'expression' @ [48:36] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.canPassThrough[ValueParameterDescriptorImpl]

'then' @ [48:47] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'canPassThrough' @ [48:56] ==> private final fun canPassThrough(expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'expression' @ [48:71] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.canPassThrough[ValueParameterDescriptorImpl]

'`else`' @ [48:82] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'ifExpression' @ [54:27] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[ValueParameterDescriptorImpl]

'getNextSiblingIgnoringWhitespaceAndComments' @ [54:40] ==> public fun PsiElement.getNextSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'when (nextSibling) {
            is KtIfExpression ->
                if (nextSibling.then == null) null else nextSibling
            else -> {
                val builder = StringBuilder()
                while (true) {
                    builder.append(nextSibling.text)
                    nextSibling = nextSibling.nextSibling ?: break
                }
                KtPsiFactory(ifExpression).createBlock(builder.toString())
            }
        }' @ [55:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'nextSibling' @ [55:22] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'if (nextSibling.then == null) null else nextSibling' @ [57:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtIfExpression?, elseBranch: KtIfExpression?): KtIfExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtIfExpression?

'nextSibling' @ [57:21] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'then' @ [57:33] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'nextSibling' @ [57:57] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'StringBuilder' @ [59:31] ==> public final fun <init>(): StringBuilder /* = StringBuilder */ defined in kotlin.text.StringBuilder[TypeAliasConstructorDescriptorImpl]

'builder' @ [61:21] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'append' @ [61:29] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'nextSibling' @ [61:36] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'text' @ [61:48] ==> public final val PsiElement.text: (String..String?)[MyPropertyDescriptor]

'nextSibling' @ [62:21] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'nextSibling' @ [62:35] ==> var nextSibling: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'nextSibling' @ [62:47] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'KtPsiFactory' @ [64:17] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'ifExpression' @ [64:30] ==> value-parameter ifExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[ValueParameterDescriptorImpl]

'createBlock' @ [64:44] ==> public final fun createBlock(bodyText: String): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'builder' @ [64:56] ==> val builder: StringBuilder /* = StringBuilder */ defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.buildNextBranch[LocalVariableDescriptor]

'toString' @ [64:64] ==> public open fun toString(): String defined in java.lang.StringBuilder[JavaMethodDescriptor]

'ArrayList' @ [70:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'nextSibling' @ [71:27] ==> public final val KtIfExpression.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'nextSibling' @ [73:16] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'nextSibling' @ [73:39] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'other' @ [73:54] ==> value-parameter other: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[ValueParameterDescriptorImpl]

'nextSibling' @ [75:17] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'nextSibling' @ [75:50] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'node' @ [75:62] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [75:67] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'RBRACE' @ [75:91] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'result' @ [76:17] ==> val result: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'add' @ [76:24] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'nextSibling' @ [76:28] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'nextSibling' @ [78:13] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'nextSibling' @ [78:27] ==> var nextSibling: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'nextSibling' @ [78:39] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'result' @ [80:16] ==> val result: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.siblingsUpTo[LocalVariableDescriptor]

'appendFixedText' @ [84:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<out Any?> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'appendExpression' @ [85:9] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<out Any?> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'block' @ [85:26] ==> value-parameter block: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.appendElseBlock[ValueParameterDescriptorImpl]

'unwrapBlockOrParenthesis' @ [85:33] ==> public fun KtExpression.unwrapBlockOrParenthesis(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'appendFixedText' @ [86:9] ==> public final fun appendFixedText(text: String): BuilderByPattern<out Any?> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [90:24] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'siblings' @ [90:32] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'CommentSaver' @ [91:35] ==> public constructor CommentSaver(originalElement: PsiElement, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'element' @ [91:48] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'CommentSaver' @ [92:32] ==> public constructor CommentSaver(originalElements: PsiChildRange, saveLineBreaks: Boolean = ...) defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedClassConstructorDescriptor]

'PsiChildRange' @ [92:45] ==> public constructor PsiChildRange(first: PsiElement?, last: PsiElement?) defined in org.jetbrains.kotlin.psi.psiUtil.PsiChildRange[DeserializedClassConstructorDescriptor]

'element' @ [92:59] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'siblings' @ [92:68] ==> val siblings: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'last' @ [92:77] ==> public fun <T> Sequence<PsiElement>.last(): PsiElement defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'ArrayList' @ [94:24] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'KtPsiFactory' @ [96:30] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [96:43] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'buildExpression' @ [96:52] ==> public fun KtPsiFactory.buildExpression(build: BuilderByPattern<KtExpression>.() -> Unit): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'appendFixedText' @ [97:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'element' @ [99:39] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'currentIfExpression' @ [100:54] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'currentIfExpression' @ [103:33] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'condition' @ [103:53] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'ArrayList' @ [104:34] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'condition' @ [105:21] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'orBranches' @ [106:21] ==> val orBranches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'addOrBranches' @ [106:32] ==> private final fun MutableList<KtExpression>.addOrBranches(expression: KtExpression): List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'condition' @ [106:46] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendExpressions' @ [109:17] ==> public final fun appendExpressions(expressions: Iterable<KtExpression?>, separator: String = ...): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'orBranches' @ [109:35] ==> val orBranches: ArrayList<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendFixedText' @ [111:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'currentIfExpression' @ [113:41] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'then' @ [113:61] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'appendExpression' @ [114:17] ==> public final fun appendExpression(expression: KtExpression?): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'currentThenBranch' @ [114:34] ==> val currentThenBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'unwrapBlockOrParenthesis' @ [114:53] ==> public fun KtExpression.unwrapBlockOrParenthesis(): KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file IfThenUtils.kt[SimpleFunctionDescriptorImpl]

'appendFixedText' @ [115:17] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'canPassThrough' @ [117:17] ==> var canPassThrough: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'canPassThrough' @ [117:34] ==> var canPassThrough: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'canPassThrough' @ [117:52] ==> private final fun canPassThrough(expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'currentThenBranch' @ [117:67] ==> val currentThenBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'currentIfExpression' @ [119:41] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'`else`' @ [119:61] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'if (currentElseBranch == null) {
                    // Try to build synthetic if / else according to KT-10750
                    val syntheticElseBranch = if (canPassThrough) break else buildNextBranch(baseIfExpressionForSyntheticBranch) ?: break
                    toDelete.addAll(baseIfExpressionForSyntheticBranch.siblingsUpTo(syntheticElseBranch))
                    if (syntheticElseBranch is KtIfExpression) {
                        baseIfExpressionForSyntheticBranch = syntheticElseBranch
                        currentIfExpression = syntheticElseBranch
                        toDelete.add(syntheticElseBranch)
                    }
                    else {
                        appendElseBlock(syntheticElseBranch)
                        break
                    }
                }
                else if (currentElseBranch is KtIfExpression) {
                    currentIfExpression = currentElseBranch
                }
                else {
                    appendElseBlock(currentElseBranch)
                    applyFullCommentSaver = false
                    break
                }' @ [120:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'currentElseBranch' @ [120:21] ==> val currentElseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'if (canPassThrough) break else buildNextBranch(baseIfExpressionForSyntheticBranch) ?: break' @ [122:47] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'canPassThrough' @ [122:51] ==> var canPassThrough: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'buildNextBranch' @ [122:78] ==> private final fun buildNextBranch(ifExpression: KtIfExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'baseIfExpressionForSyntheticBranch' @ [122:94] ==> var baseIfExpressionForSyntheticBranch: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [123:21] ==> val toDelete: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'addAll' @ [123:30] ==> public open fun addAll(elements: Collection<PsiElement>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'baseIfExpressionForSyntheticBranch' @ [123:37] ==> var baseIfExpressionForSyntheticBranch: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'siblingsUpTo' @ [123:72] ==> private final fun KtIfExpression.siblingsUpTo(other: KtExpression): List<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'syntheticElseBranch' @ [123:85] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'if (syntheticElseBranch is KtIfExpression) {
                        baseIfExpressionForSyntheticBranch = syntheticElseBranch
                        currentIfExpression = syntheticElseBranch
                        toDelete.add(syntheticElseBranch)
                    }
                    else {
                        appendElseBlock(syntheticElseBranch)
                        break
                    }' @ [124:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'syntheticElseBranch' @ [124:25] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'baseIfExpressionForSyntheticBranch' @ [125:25] ==> var baseIfExpressionForSyntheticBranch: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'syntheticElseBranch' @ [125:62] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'currentIfExpression' @ [126:25] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'syntheticElseBranch' @ [126:47] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'toDelete' @ [127:25] ==> val toDelete: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'add' @ [127:34] ==> public open fun add(element: PsiElement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'syntheticElseBranch' @ [127:38] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendElseBlock' @ [130:25] ==> private final fun BuilderByPattern<*>.appendElseBlock(block: KtExpression?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'syntheticElseBranch' @ [130:41] ==> val syntheticElseBranch: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'if (currentElseBranch is KtIfExpression) {
                    currentIfExpression = currentElseBranch
                }
                else {
                    appendElseBlock(currentElseBranch)
                    applyFullCommentSaver = false
                    break
                }' @ [134:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'currentElseBranch' @ [134:26] ==> val currentElseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'currentIfExpression' @ [135:21] ==> var currentIfExpression: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'currentElseBranch' @ [135:43] ==> val currentElseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'appendElseBlock' @ [138:21] ==> private final fun BuilderByPattern<*>.appendElseBlock(block: KtExpression?): Unit defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'currentElseBranch' @ [138:37] ==> val currentElseBranch: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo.<anonymous>[LocalVariableDescriptor]

'applyFullCommentSaver' @ [139:21] ==> var applyFullCommentSaver: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'appendFixedText' @ [144:13] ==> public final fun appendFixedText(text: String): BuilderByPattern<KtExpression> defined in org.jetbrains.kotlin.psi.BuilderByPattern[DeserializedSimpleFunctionDescriptor]

'whenExpression' @ [148:13] ==> var whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'getSubjectToIntroduce' @ [148:28] ==> public fun KtWhenExpression.getSubjectToIntroduce(): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'whenExpression' @ [149:13] ==> var whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'whenExpression' @ [149:30] ==> var whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'introduceSubject' @ [149:45] ==> public fun KtWhenExpression.introduceSubject(): KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations in file branchedTransformationUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [152:22] ==> value-parameter element: KtIfExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [152:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtIfExpression[DeserializedSimpleFunctionDescriptor]

'whenExpression' @ [152:38] ==> var whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'if (applyFullCommentSaver) fullCommentSaver else elementCommentSaver' @ [153:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CommentSaver, elseBranch: CommentSaver): CommentSaver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CommentSaver

'applyFullCommentSaver' @ [153:14] ==> var applyFullCommentSaver: Boolean defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'fullCommentSaver' @ [153:37] ==> val fullCommentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'elementCommentSaver' @ [153:59] ==> val elementCommentSaver: CommentSaver defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'restore' @ [153:80] ==> public final fun restore(resultElement: PsiElement, forceAdjustIndent: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.util.CommentSaver[DeserializedSimpleFunctionDescriptor]

'result' @ [153:88] ==> val result: PsiElement defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'toDelete' @ [154:9] ==> val toDelete: ArrayList<PsiElement> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.applyTo[LocalVariableDescriptor]

'forEach' @ [154:18] ==> @HidesMembers public inline fun <T> Iterable<PsiElement>.forEach(action: (PsiElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'expression' @ [158:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ValueParameterDescriptorImpl]

'expression' @ [158:49] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ValueParameterDescriptorImpl]

'operationToken' @ [158:60] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'OROR' @ [158:87] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [159:24] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ValueParameterDescriptorImpl]

'left' @ [159:35] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [160:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ValueParameterDescriptorImpl]

'right' @ [160:36] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [161:17] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[LocalVariableDescriptor]

'right' @ [161:33] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[LocalVariableDescriptor]

'addOrBranches' @ [162:17] ==> private final fun MutableList<KtExpression>.addOrBranches(expression: KtExpression): List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'left' @ [162:31] ==> val left: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[LocalVariableDescriptor]

'addOrBranches' @ [163:17] ==> private final fun MutableList<KtExpression>.addOrBranches(expression: KtExpression): List<KtExpression> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention[SimpleFunctionDescriptorImpl]

'right' @ [163:31] ==> val right: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[LocalVariableDescriptor]

'this' @ [164:24] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ReceiverParameterDescriptorImpl]

'add' @ [168:9] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'safeDeparenthesize' @ [168:23] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression, p1: Boolean): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [168:42] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ValueParameterDescriptorImpl]

'this' @ [169:16] ==> <this> defined in org.jetbrains.kotlin.idea.intentions.branchedTransformations.intentions.IfToWhenIntention.addOrBranches[ReceiverParameterDescriptorImpl]

