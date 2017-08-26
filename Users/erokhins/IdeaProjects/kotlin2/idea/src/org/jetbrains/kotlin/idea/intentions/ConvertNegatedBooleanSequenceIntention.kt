'SelfTargetingOffsetIndependentIntention<KtBinaryExpression>' @ [24:48] ==> public constructor SelfTargetingOffsetIndependentIntention<TElement : KtElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingOffsetIndependentIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : KtElement> -> KtBinaryExpression

'KtBinaryExpression' @ [25:9] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [25:35] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'element' @ [28:13] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'parent' @ [28:21] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [29:23] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationToken' @ [29:31] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'opToken' @ [30:13] ==> val opToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.isApplicableTo[LocalVariableDescriptor]

'ANDAND' @ [30:33] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'opToken' @ [30:43] ==> val opToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.isApplicableTo[LocalVariableDescriptor]

'OROR' @ [30:63] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'splitBooleanSequence' @ [32:16] ==> private final fun splitBooleanSequence(expression: KtBinaryExpression): List<KtPrefixExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention[SimpleFunctionDescriptorImpl]

'element' @ [32:37] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.isApplicableTo[ValueParameterDescriptorImpl]

'when(element.operationToken) {
            KtTokens.ANDAND -> KtTokens.OROR.value
            KtTokens.OROR -> KtTokens.ANDAND.value
            else -> throw IllegalArgumentException() // checked in isApplicableTo
        }' @ [36:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'element' @ [36:33] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[ValueParameterDescriptorImpl]

'operationToken' @ [36:41] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ANDAND' @ [37:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [37:41] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [37:46] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'OROR' @ [38:22] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANDAND' @ [38:39] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'value' @ [38:46] ==> public final val KtSingleValueToken.value: String[MyPropertyDescriptor]

'IllegalArgumentException' @ [39:27] ==> public final fun <init>(): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'splitBooleanSequence' @ [42:24] ==> private final fun splitBooleanSequence(expression: KtBinaryExpression): List<KtPrefixExpression>? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention[SimpleFunctionDescriptorImpl]

'element' @ [42:45] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[ValueParameterDescriptorImpl]

'elements' @ [43:31] ==> val elements: List<KtPrefixExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'map' @ [43:40] ==> public inline fun <T, R> Iterable<KtPrefixExpression>.map(transform: (KtPrefixExpression) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPrefixExpression
    <R> -> (kotlin.String..kotlin.String?)

'prefixExpression' @ [43:66] ==> value-parameter prefixExpression: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'baseExpression' @ [43:83] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [43:100] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'bareExpressions' @ [44:33] ==> val bareExpressions: List<(String..String?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'subList' @ [44:49] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<(String..String?)> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'bareExpressions' @ [44:60] ==> val bareExpressions: List<(String..String?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'lastIndex' @ [44:76] ==> public val <T> List<(String..String?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'foldRight' @ [44:87] ==> public inline fun <T, R> List<(String..String?)>.foldRight(initial: String, operation: ((String..String?), acc: String) -> String): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <R> -> String

'bareExpressions' @ [45:22] ==> val bareExpressions: List<(String..String?)> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'last' @ [45:38] ==> public fun <T> List<(String..String?)>.last(): (String..String?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'expression' @ [45:75] ==> value-parameter expression: String defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'operatorText' @ [45:87] ==> val operatorText: String defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'negated' @ [45:101] ==> value-parameter negated: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [48:29] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [48:42] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[ValueParameterDescriptorImpl]

'createExpression' @ [48:51] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'negatedExpression' @ [48:70] ==> val negatedExpression: String defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'element' @ [50:31] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [50:39] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'newExpression' @ [50:47] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'insertedElement' @ [51:37] ==> val insertedElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'parent' @ [51:53] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'areParenthesesUseless' @ [53:23] ==> public open fun areParenthesesUseless(@NotNull p0: KtParenthesizedExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'insertedElementParent' @ [53:45] ==> val insertedElementParent: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'insertedElementParent' @ [54:13] ==> val insertedElementParent: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'replace' @ [54:35] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtParenthesizedExpression[DeserializedSimpleFunctionDescriptor]

'insertedElement' @ [54:43] ==> val insertedElement: PsiElement defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.applyTo[LocalVariableDescriptor]

'LinkedList' @ [59:24] ==> public constructor LinkedList<E : (Any..Any?)>() defined in java.util.LinkedList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtPrefixExpression

'expression' @ [60:29] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[ValueParameterDescriptorImpl]

'operationToken' @ [60:40] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'expression' @ [62:48] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[ValueParameterDescriptorImpl]

'currentItem' @ [63:16] ==> var currentItem: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'currentItem' @ [64:17] ==> var currentItem: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'operationToken' @ [64:29] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'firstOperator' @ [64:47] ==> val firstOperator: IElementType defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'currentItem' @ [66:30] ==> var currentItem: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'right' @ [66:42] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'itemList' @ [67:13] ==> val itemList: LinkedList<KtPrefixExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'add' @ [67:22] ==> public open fun add(element: KtPrefixExpression): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'rightChild' @ [67:26] ==> val rightChild: KtPrefixExpression defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'currentItem' @ [69:29] ==> var currentItem: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'left' @ [69:41] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'when (leftChild) {
                is KtPrefixExpression -> itemList.add(leftChild)
                !is KtBinaryExpression -> return null
            }' @ [70:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'leftChild' @ [70:19] ==> val leftChild: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'itemList' @ [71:42] ==> val itemList: LinkedList<KtPrefixExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'add' @ [71:51] ==> public open fun add(element: KtPrefixExpression): Boolean defined in java.util.LinkedList[JavaMethodDescriptor]

'leftChild' @ [71:55] ==> val leftChild: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'currentItem' @ [75:13] ==> var currentItem: KtBinaryExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'leftChild' @ [75:27] ==> val leftChild: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

'itemList' @ [78:16] ==> val itemList: LinkedList<KtPrefixExpression> defined in org.jetbrains.kotlin.idea.intentions.ConvertNegatedBooleanSequenceIntention.splitBooleanSequence[LocalVariableDescriptor]

