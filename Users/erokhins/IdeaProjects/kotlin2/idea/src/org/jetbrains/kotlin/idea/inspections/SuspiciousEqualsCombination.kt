'AbstractKotlinInspection' @ [26:37] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [28:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [30:25] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'parent' @ [30:36] ==> public final val KtBinaryExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [31:36] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'parseBinary' @ [31:47] ==> private final fun KtBinaryExpression.parseBinary(pair: ComparisonOperands = ...): ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'operands' @ [32:32] ==> val operands: ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'eqEqOperands' @ [32:41] ==> public final val eqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'map' @ [32:54] ==> public inline fun <T, R> Iterable<KtExpression>.map(transform: (KtExpression) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [32:60] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [32:63] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'operands' @ [33:34] ==> val operands: ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'eqEqEqOperands' @ [33:43] ==> public final val eqEqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'map' @ [33:58] ==> public inline fun <T, R> Iterable<KtExpression>.map(transform: (KtExpression) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [33:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [33:67] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'eqeq' @ [34:25] ==> val eqeq: List<(String..String?)> defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'intersect' @ [34:30] ==> public infix fun <T> Iterable<(String..String?)>.intersect(other: Iterable<(String..String?)>): Set<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'eqeqeq' @ [34:40] ==> val eqeqeq: List<(String..String?)> defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'isNotEmpty' @ [34:48] ==> @InlineOnly public inline fun <T> Collection<(String..String?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'holder' @ [35:25] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [35:32] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [35:48] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.buildVisitor.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'GENERIC_ERROR_OR_WARNING' @ [36:69] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'ComparisonOperands' @ [41:75] ==> public constructor ComparisonOperands(eqEqOperands: MutableList<KtExpression> = ..., eqEqEqOperands: MutableList<KtExpression> = ...) defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[ClassConstructorDescriptorImpl]

'when (operationToken) {
            KtTokens.EQEQ, KtTokens.EXCLEQ -> {
                (left as? KtNameReferenceExpression)?.let(pair.eqEqOperands::add)
                (right as? KtNameReferenceExpression)?.let(pair.eqEqOperands::add)
            }
            KtTokens.EQEQEQ, KtTokens.EXCLEQEQEQ -> {
                (left as? KtNameReferenceExpression)?.let(pair.eqEqEqOperands::add)
                (right as? KtNameReferenceExpression)?.let(pair.eqEqEqOperands::add)
            }
            KtTokens.ANDAND, KtTokens.OROR -> {
                right?.parseExpression(pair)
                left?.parseExpression(pair)
            }
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'operationToken' @ [42:15] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQEQ' @ [43:22] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [43:37] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'left' @ [44:18] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'let' @ [44:55] ==> @InlineOnly public inline fun <T, R> KtNameReferenceExpression.let(block: (KtNameReferenceExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression
    <R> -> Boolean

'pair' @ [44:59] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'eqEqOperands' @ [44:64] ==> public final val eqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'add' @ [44:78] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'right' @ [45:18] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'let' @ [45:56] ==> @InlineOnly public inline fun <T, R> KtNameReferenceExpression.let(block: (KtNameReferenceExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression
    <R> -> Boolean

'pair' @ [45:60] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'eqEqOperands' @ [45:65] ==> public final val eqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'add' @ [45:79] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'EQEQEQ' @ [47:22] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [47:39] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'left' @ [48:18] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'let' @ [48:55] ==> @InlineOnly public inline fun <T, R> KtNameReferenceExpression.let(block: (KtNameReferenceExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression
    <R> -> Boolean

'pair' @ [48:59] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'eqEqEqOperands' @ [48:64] ==> public final val eqEqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'add' @ [48:80] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'right' @ [49:18] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'let' @ [49:56] ==> @InlineOnly public inline fun <T, R> KtNameReferenceExpression.let(block: (KtNameReferenceExpression) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNameReferenceExpression
    <R> -> Boolean

'pair' @ [49:60] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'eqEqEqOperands' @ [49:65] ==> public final val eqEqEqOperands: MutableList<KtExpression> defined in org.jetbrains.kotlin.idea.inspections.ComparisonOperands[PropertyDescriptorImpl]

'add' @ [49:81] ==> public abstract fun add(element: KtExpression): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ANDAND' @ [51:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [51:39] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'right' @ [52:17] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'parseExpression' @ [52:24] ==> private final fun KtExpression.parseExpression(pair: ComparisonOperands): Unit defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'pair' @ [52:40] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'left' @ [53:17] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'parseExpression' @ [53:23] ==> private final fun KtExpression.parseExpression(pair: ComparisonOperands): Unit defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'pair' @ [53:39] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'pair' @ [56:16] ==> value-parameter pair: ComparisonOperands = ... defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseBinary[ValueParameterDescriptorImpl]

'when (this) {
            is KtBinaryExpression -> parseBinary(pair)
            is KtParenthesizedExpression -> expression?.parseExpression(pair)
            is KtPrefixExpression -> if (operationToken == KtTokens.EXCL) baseExpression?.parseExpression(pair)
        }' @ [60:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'this' @ [60:15] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseExpression[ReceiverParameterDescriptorImpl]

'parseBinary' @ [61:38] ==> private final fun KtBinaryExpression.parseBinary(pair: ComparisonOperands = ...): ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'pair' @ [61:50] ==> value-parameter pair: ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseExpression[ValueParameterDescriptorImpl]

'expression' @ [62:45] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'parseExpression' @ [62:57] ==> private final fun KtExpression.parseExpression(pair: ComparisonOperands): Unit defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'pair' @ [62:73] ==> value-parameter pair: ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseExpression[ValueParameterDescriptorImpl]

'operationToken' @ [63:42] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCL' @ [63:69] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'baseExpression' @ [63:75] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'parseExpression' @ [63:91] ==> private final fun KtExpression.parseExpression(pair: ComparisonOperands): Unit defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination[SimpleFunctionDescriptorImpl]

'pair' @ [63:107] ==> value-parameter pair: ComparisonOperands defined in org.jetbrains.kotlin.idea.inspections.SuspiciousEqualsCombination.parseExpression[ValueParameterDescriptorImpl]

'mutableListOf' @ [68:85] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'mutableListOf' @ [69:87] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

