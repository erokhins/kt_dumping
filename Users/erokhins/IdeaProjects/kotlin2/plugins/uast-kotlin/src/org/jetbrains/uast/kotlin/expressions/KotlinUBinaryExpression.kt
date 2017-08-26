'KotlinAbstractUExpression' @ [32:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'mapOf' @ [34:33] ==> public fun <K, V> mapOf(vararg pairs: Pair<String, UastBinaryOperator.BitwiseOperator>): Map<String, UastBinaryOperator.BitwiseOperator> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> BitwiseOperator

'to' @ [35:17] ==> public infix fun <A, B> String.to(that: UastBinaryOperator.BitwiseOperator): Pair<String, UastBinaryOperator.BitwiseOperator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> BitwiseOperator

'UastBinaryOperator' @ [35:25] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'BITWISE_OR' @ [35:44] ==> @field:JvmField public final val BITWISE_OR: UastBinaryOperator.BitwiseOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'to' @ [36:17] ==> public infix fun <A, B> String.to(that: UastBinaryOperator.BitwiseOperator): Pair<String, UastBinaryOperator.BitwiseOperator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> BitwiseOperator

'UastBinaryOperator' @ [36:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'BITWISE_AND' @ [36:45] ==> @field:JvmField public final val BITWISE_AND: UastBinaryOperator.BitwiseOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'to' @ [37:17] ==> public infix fun <A, B> String.to(that: UastBinaryOperator.BitwiseOperator): Pair<String, UastBinaryOperator.BitwiseOperator> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <A> -> String
    <B> -> BitwiseOperator

'UastBinaryOperator' @ [37:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'BITWISE_XOR' @ [37:45] ==> @field:JvmField public final val BITWISE_XOR: UastBinaryOperator.BitwiseOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'lz' @ [41:33] ==> internal fun <T> lz(initializer: () -> UExpression): Lazy<UExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [41:38] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [41:54] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [41:69] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'left' @ [41:73] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'this' @ [41:79] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[LazyClassReceiverParameterDescriptor]

'lz' @ [42:34] ==> internal fun <T> lz(initializer: () -> UExpression): Lazy<UExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [42:39] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [42:55] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [42:70] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'right' @ [42:74] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'this' @ [42:81] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[LazyClassReceiverParameterDescriptor]

'UIdentifier' @ [45:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'psi' @ [45:29] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'operationReference' @ [45:33] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'this' @ [45:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [47:38] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'operationReference' @ [47:42] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'resolveCallToDeclaration' @ [47:61] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [47:96] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[LazyClassReceiverParameterDescriptor]

'when (psi.operationToken) {
        KtTokens.EQ -> UastBinaryOperator.ASSIGN
        KtTokens.PLUS -> UastBinaryOperator.PLUS
        KtTokens.MINUS -> UastBinaryOperator.MINUS
        KtTokens.MUL -> UastBinaryOperator.MULTIPLY
        KtTokens.DIV -> UastBinaryOperator.DIV
        KtTokens.PERC -> UastBinaryOperator.MOD
        KtTokens.OROR -> UastBinaryOperator.LOGICAL_OR
        KtTokens.ANDAND -> UastBinaryOperator.LOGICAL_AND
        KtTokens.EQEQ -> UastBinaryOperator.EQUALS
        KtTokens.EXCLEQ -> UastBinaryOperator.NOT_EQUALS
        KtTokens.EQEQEQ -> UastBinaryOperator.IDENTITY_EQUALS
        KtTokens.EXCLEQEQEQ -> UastBinaryOperator.IDENTITY_NOT_EQUALS
        KtTokens.GT -> UastBinaryOperator.GREATER
        KtTokens.GTEQ -> UastBinaryOperator.GREATER_OR_EQUALS
        KtTokens.LT -> UastBinaryOperator.LESS
        KtTokens.LTEQ -> UastBinaryOperator.LESS_OR_EQUALS
        KtTokens.PLUSEQ -> UastBinaryOperator.PLUS_ASSIGN
        KtTokens.MINUSEQ -> UastBinaryOperator.MINUS_ASSIGN
        KtTokens.MULTEQ -> UastBinaryOperator.MULTIPLY_ASSIGN
        KtTokens.DIVEQ -> UastBinaryOperator.DIVIDE_ASSIGN
        KtTokens.PERCEQ -> UastBinaryOperator.REMAINDER_ASSIGN
        KtTokens.IN_KEYWORD -> KotlinBinaryOperators.IN
        KtTokens.NOT_IN -> KotlinBinaryOperators.NOT_IN
        KtTokens.RANGE -> KotlinBinaryOperators.RANGE_TO
        else -> run { // Handle bitwise operators
            val other = UastBinaryOperator.OTHER
            val ref = psi.operationReference
            val resolvedCall = psi.operationReference.getResolvedCall(ref.analyze()) ?: return@run other
            val resultingDescriptor = resolvedCall.resultingDescriptor as? FunctionDescriptor ?: return@run other
            val applicableOperator = BITWISE_OPERATORS[resultingDescriptor.name.asString()] ?: return@run other

            val containingClass = resultingDescriptor.containingDeclaration as? ClassDescriptor ?: return@run other
            if (containingClass.typeConstructor.supertypes.any {
                it.constructor.declarationDescriptor?.fqNameSafe?.asString() == "kotlin.Number"
            }) applicableOperator else other
        }
    }' @ [49:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastBinaryOperator, entry1: UastBinaryOperator, entry2: UastBinaryOperator, entry3: UastBinaryOperator, entry4: UastBinaryOperator, entry5: UastBinaryOperator, entry6: UastBinaryOperator, entry7: UastBinaryOperator, entry8: UastBinaryOperator, entry9: UastBinaryOperator, entry10: UastBinaryOperator, entry11: UastBinaryOperator, entry12: UastBinaryOperator, entry13: UastBinaryOperator, entry14: UastBinaryOperator, entry15: UastBinaryOperator, entry16: UastBinaryOperator, entry17: UastBinaryOperator, entry18: UastBinaryOperator, entry19: UastBinaryOperator, entry20: UastBinaryOperator, entry21: UastBinaryOperator, entry22: UastBinaryOperator, entry23: UastBinaryOperator, entry24: UastBinaryOperator): UastBinaryOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastBinaryOperator

'psi' @ [49:35] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'operationToken' @ [49:39] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [50:18] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [50:24] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'ASSIGN' @ [50:43] ==> @field:JvmField public final val ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'PLUS' @ [51:18] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [51:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'PLUS' @ [51:45] ==> @field:JvmField public final val PLUS: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'MINUS' @ [52:18] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [52:27] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'MINUS' @ [52:46] ==> @field:JvmField public final val MINUS: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'MUL' @ [53:18] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [53:25] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'MULTIPLY' @ [53:44] ==> @field:JvmField public final val MULTIPLY: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'DIV' @ [54:18] ==> public final val DIV: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [54:25] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'DIV' @ [54:44] ==> @field:JvmField public final val DIV: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'PERC' @ [55:18] ==> public final val PERC: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [55:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'MOD' @ [55:45] ==> @field:JvmField public final val MOD: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'OROR' @ [56:18] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [56:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'LOGICAL_OR' @ [56:45] ==> @field:JvmField public final val LOGICAL_OR: UastBinaryOperator.LogicalOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'ANDAND' @ [57:18] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [57:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'LOGICAL_AND' @ [57:47] ==> @field:JvmField public final val LOGICAL_AND: UastBinaryOperator.LogicalOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'EQEQ' @ [58:18] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [58:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'EQUALS' @ [58:45] ==> @field:JvmField public final val EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'EXCLEQ' @ [59:18] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [59:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'NOT_EQUALS' @ [59:47] ==> @field:JvmField public final val NOT_EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'EQEQEQ' @ [60:18] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [60:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'IDENTITY_EQUALS' @ [60:47] ==> @field:JvmField public final val IDENTITY_EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'EXCLEQEQEQ' @ [61:18] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [61:32] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'IDENTITY_NOT_EQUALS' @ [61:51] ==> @field:JvmField public final val IDENTITY_NOT_EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'GT' @ [62:18] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [62:24] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'GREATER' @ [62:43] ==> @field:JvmField public final val GREATER: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'GTEQ' @ [63:18] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [63:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'GREATER_OR_EQUALS' @ [63:45] ==> @field:JvmField public final val GREATER_OR_EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'LT' @ [64:18] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [64:24] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'LESS' @ [64:43] ==> @field:JvmField public final val LESS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'LTEQ' @ [65:18] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [65:26] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'LESS_OR_EQUALS' @ [65:45] ==> @field:JvmField public final val LESS_OR_EQUALS: UastBinaryOperator.ComparisonOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'PLUSEQ' @ [66:18] ==> public final val PLUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [66:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'PLUS_ASSIGN' @ [66:47] ==> @field:JvmField public final val PLUS_ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'MINUSEQ' @ [67:18] ==> public final val MINUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [67:29] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'MINUS_ASSIGN' @ [67:48] ==> @field:JvmField public final val MINUS_ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'MULTEQ' @ [68:18] ==> public final val MULTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [68:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'MULTIPLY_ASSIGN' @ [68:47] ==> @field:JvmField public final val MULTIPLY_ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'DIVEQ' @ [69:18] ==> public final val DIVEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [69:27] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'DIVIDE_ASSIGN' @ [69:46] ==> @field:JvmField public final val DIVIDE_ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'PERCEQ' @ [70:18] ==> public final val PERCEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastBinaryOperator' @ [70:28] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'REMAINDER_ASSIGN' @ [70:47] ==> @field:JvmField public final val REMAINDER_ASSIGN: UastBinaryOperator.AssignOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'IN_KEYWORD' @ [71:18] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinBinaryOperators' @ [71:32] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'IN' @ [71:54] ==> @JvmField public final val IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'NOT_IN' @ [72:18] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinBinaryOperators' @ [72:28] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'NOT_IN' @ [72:50] ==> @JvmField public final val NOT_IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'RANGE' @ [73:18] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinBinaryOperators' @ [73:27] ==> public object KotlinBinaryOperators defined in org.jetbrains.uast.kotlin in file KotlinBinaryOperators.kt[FakeCallableDescriptorForObject]

'RANGE_TO' @ [73:49] ==> @JvmField public final val RANGE_TO: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'run' @ [74:17] ==> @InlineOnly public inline fun <T, R> KotlinUBinaryExpression.run(block: KotlinUBinaryExpression.() -> UastBinaryOperator): UastBinaryOperator defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUBinaryExpression
    <R> -> UastBinaryOperator

'UastBinaryOperator' @ [75:25] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'OTHER' @ [75:44] ==> @field:JvmField public final val OTHER: UastBinaryOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

'psi' @ [76:23] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'operationReference' @ [76:27] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'psi' @ [77:32] ==> public open val psi: KtBinaryExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression[PropertyDescriptorImpl]

'operationReference' @ [77:36] ==> public final val KtBinaryExpression.operationReference: KtOperationReferenceExpression[MyPropertyDescriptor]

'getResolvedCall' @ [77:55] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'ref' @ [77:71] ==> val ref: KtOperationReferenceExpression defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'analyze' @ [77:75] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'other' @ [77:100] ==> val other: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [78:39] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [78:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'other' @ [78:109] ==> val other: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'BITWISE_OPERATORS' @ [79:38] ==> public final val BITWISE_OPERATORS: Map<String, UastBinaryOperator.BitwiseOperator> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.Companion[PropertyDescriptorImpl]

'resultingDescriptor' @ [79:56] ==> val resultingDescriptor: FunctionDescriptor defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'name' @ [79:76] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [79:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'other' @ [79:107] ==> val other: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'resultingDescriptor' @ [81:35] ==> val resultingDescriptor: FunctionDescriptor defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [81:55] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'other' @ [81:111] ==> val other: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'if (containingClass.typeConstructor.supertypes.any {
                it.constructor.declarationDescriptor?.fqNameSafe?.asString() == "kotlin.Number"
            }) applicableOperator else other' @ [82:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UastBinaryOperator, elseBranch: UastBinaryOperator): UastBinaryOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UastBinaryOperator

'containingClass' @ [82:17] ==> val containingClass: ClassDescriptor defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'typeConstructor' @ [82:33] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [82:49] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'any' @ [82:60] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.any(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [83:17] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [83:20] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [83:32] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [83:55] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'asString' @ [83:67] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'applicableOperator' @ [84:16] ==> val applicableOperator: UastBinaryOperator.BitwiseOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'other' @ [84:40] ==> val other: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpression.operator.<anonymous>[LocalVariableDescriptor]

'KotlinAbstractUExpression' @ [92:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

