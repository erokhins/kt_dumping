'SelfTargetingIntention<KtBinaryExpression>' @ [30:39] ==> public constructor SelfTargetingIntention<TElement : PsiElement>(elementType: Class<KtBinaryExpression>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtBinaryExpression

'KtBinaryExpression' @ [30:82] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'java' @ [30:108] ==> public val <T> KClass<KtBinaryExpression>.java: Class<KtBinaryExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtBinaryExpression

'setOf' @ [32:44] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'PLUS' @ [32:50] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUL' @ [32:56] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [32:61] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANDAND' @ [32:67] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQ' @ [32:75] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [32:81] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [32:89] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [32:97] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [32:109] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [32:113] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [32:117] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [32:123] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SUPPORTED_OPERATIONS' @ [34:49] ==> private final val SUPPORTED_OPERATIONS: Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.Companion[PropertyDescriptorImpl]

'mapNotNull' @ [34:70] ==> public inline fun <T, R : Any> Iterable<(KtSingleValueToken..KtSingleValueToken?)>.mapNotNull(transform: ((KtSingleValueToken..KtSingleValueToken?)) -> String?): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)
    <R : Any> -> String

'OperatorConventions.BINARY_OPERATION_NAMES[it]' @ [34:83] ==> public abstract fun get(@Nullable key: KtSingleValueToken?): Name? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'BINARY_OPERATION_NAMES' @ [34:103] ==> public final val BINARY_OPERATION_NAMES: (ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>..ImmutableBiMap<(KtSingleValueToken..KtSingleValueToken?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'it' @ [34:126] ==> value-parameter it: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.Companion.SUPPORTED_OPERATION_NAMES.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [34:131] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'toSet' @ [34:144] ==> public fun <T> Iterable<String>.toSet(): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'setOf' @ [35:41] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [39:21] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationReference' @ [39:29] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'!' @ [40:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'opRef' @ [40:14] ==> val opRef: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'textRange' @ [40:20] ==> public final val KtOperationReferenceExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'containsOffset' @ [40:30] ==> public open fun containsOffset(p0: Int): Boolean defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'caretOffset' @ [40:45] ==> value-parameter caretOffset: Int defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'leftSubject' @ [42:13] ==> private final fun leftSubject(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [42:25] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'rightSubject' @ [42:45] ==> private final fun rightSubject(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [42:58] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'element' @ [46:30] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[ValueParameterDescriptorImpl]

'operationToken' @ [46:38] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'opRef' @ [47:34] ==> val opRef: KtOperationReferenceExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'text' @ [47:40] ==> public final val KtOperationReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'operationToken' @ [48:13] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'SUPPORTED_OPERATIONS' @ [48:31] ==> private final val SUPPORTED_OPERATIONS: Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.Companion[PropertyDescriptorImpl]

'operationToken' @ [49:20] ==> val operationToken: IElementType defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'IDENTIFIER' @ [49:38] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operationTokenText' @ [49:52] ==> val operationTokenText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'SUPPORTED_OPERATION_NAMES' @ [49:74] ==> private final val SUPPORTED_OPERATION_NAMES: Set<String> defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.Companion[PropertyDescriptorImpl]

'text' @ [50:13] ==> public final var SwapBinaryExpressionIntention.text: String[MyPropertyDescriptor]

'operationTokenText' @ [50:28] ==> val operationTokenText: (String..String?) defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.isApplicableTo[LocalVariableDescriptor]

'element' @ [58:24] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'operationReference' @ [58:32] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'text' @ [58:51] ==> public final val KtOperationReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'when (operator) {
            ">" -> "<"
            "<" -> ">"
            "<=" -> ">="
            ">=" -> "<="
            else -> operator
        }' @ [59:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'operator' @ [59:39] ==> val operator: String defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'operator' @ [64:21] ==> val operator: String defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'leftSubject' @ [66:20] ==> private final fun leftSubject(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [66:32] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'rightSubject' @ [67:21] ==> private final fun rightSubject(element: KtBinaryExpression): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [67:34] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'right' @ [68:25] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'copied' @ [68:31] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'left' @ [69:24] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'copied' @ [69:29] ==> public fun <T : PsiElement> KtExpression.copied(): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : PsiElement> -> KtExpression

'left' @ [70:9] ==> val left: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'replace' @ [70:14] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'rightCopy' @ [70:22] ==> val rightCopy: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'right' @ [71:9] ==> val right: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'replace' @ [71:15] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'leftCopy' @ [71:23] ==> val leftCopy: KtExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'element' @ [72:9] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'replace' @ [72:17] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtBinaryExpression[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [72:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [72:38] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'createExpressionByPattern' @ [72:47] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'convertedOperator' @ [72:78] ==> val convertedOperator: String defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[LocalVariableDescriptor]

'element' @ [72:101] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'left' @ [72:109] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'element' @ [72:117] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.applyTo[ValueParameterDescriptorImpl]

'right' @ [72:125] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'firstDescendantOfTighterPrecedence' @ [76:16] ==> private final fun firstDescendantOfTighterPrecedence(expression: KtExpression?, precedence: Int, getChild: KtBinaryExpression.() -> KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [76:51] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.leftSubject[ValueParameterDescriptorImpl]

'left' @ [76:59] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'getPrecedence' @ [76:80] ==> public final fun getPrecedence(expression: KtExpression): Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[DeserializedSimpleFunctionDescriptor]

'element' @ [76:94] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.leftSubject[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [76:104] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'getRight' @ [76:124] ==> @IfNotParsed @Nullable public open fun getRight(): KtExpression? defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaMethodDescriptor]

'firstDescendantOfTighterPrecedence' @ [80:16] ==> private final fun firstDescendantOfTighterPrecedence(expression: KtExpression?, precedence: Int, getChild: KtBinaryExpression.() -> KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'element' @ [80:51] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.rightSubject[ValueParameterDescriptorImpl]

'right' @ [80:59] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'getPrecedence' @ [80:81] ==> public final fun getPrecedence(expression: KtExpression): Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[DeserializedSimpleFunctionDescriptor]

'element' @ [80:95] ==> value-parameter element: KtBinaryExpression defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.rightSubject[ValueParameterDescriptorImpl]

'KtBinaryExpression' @ [80:105] ==> public constructor KtBinaryExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaClassConstructorDescriptor]

'getLeft' @ [80:125] ==> @IfNotParsed @Nullable public open fun getLeft(): KtExpression? defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaMethodDescriptor]

'expression' @ [84:13] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'PsiPrecedences' @ [85:40] ==> public object PsiPrecedences defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'getPrecedence' @ [85:55] ==> public final fun getPrecedence(expression: KtExpression): Int defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[DeserializedSimpleFunctionDescriptor]

'expression' @ [85:69] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'!' @ [86:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'PsiPrecedences' @ [86:18] ==> public object PsiPrecedences defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isTighter' @ [86:33] ==> public final fun isTighter(subject: Int, tighterThan: Int): Boolean defined in org.jetbrains.kotlin.idea.util.PsiPrecedences[DeserializedSimpleFunctionDescriptor]

'expressionPrecedence' @ [86:43] ==> val expressionPrecedence: Int defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[LocalVariableDescriptor]

'precedence' @ [86:65] ==> value-parameter precedence: Int defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'firstDescendantOfTighterPrecedence' @ [87:24] ==> private final fun firstDescendantOfTighterPrecedence(expression: KtExpression?, precedence: Int, getChild: KtBinaryExpression.() -> KtExpression?): KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention[SimpleFunctionDescriptorImpl]

'expression' @ [87:59] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'invoke' @ [87:70] ==> public abstract operator fun KtBinaryExpression.invoke(): KtExpression? defined in kotlin.Function1[FunctionInvokeDescriptor]

'precedence' @ [87:82] ==> value-parameter precedence: Int defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'getChild' @ [87:94] ==> value-parameter getChild: KtBinaryExpression.() -> KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

'expression' @ [90:16] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.idea.intentions.SwapBinaryExpressionIntention.firstDescendantOfTighterPrecedence[ValueParameterDescriptorImpl]

