'KotlinAbstractUExpression' @ [30:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [31:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinConverter' @ [31:34] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [31:50] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [31:65] ==> public open val psi: KtPrefixExpression defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[PropertyDescriptorImpl]

'baseExpression' @ [31:69] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [31:85] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[LazyClassReceiverParameterDescriptor]

'UIdentifier' @ [34:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'psi' @ [34:29] ==> public open val psi: KtPrefixExpression defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[PropertyDescriptorImpl]

'operationReference' @ [34:33] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'this' @ [34:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [36:38] ==> public open val psi: KtPrefixExpression defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[PropertyDescriptorImpl]

'operationReference' @ [36:42] ==> public final val KtPrefixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'resolveCallToDeclaration' @ [36:61] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [36:96] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[LazyClassReceiverParameterDescriptor]

'when (psi.operationToken) {
        KtTokens.EXCL -> UastPrefixOperator.LOGICAL_NOT
        KtTokens.PLUS -> UastPrefixOperator.UNARY_PLUS
        KtTokens.MINUS -> UastPrefixOperator.UNARY_MINUS
        KtTokens.PLUSPLUS -> UastPrefixOperator.INC
        KtTokens.MINUSMINUS -> UastPrefixOperator.DEC
        else -> UastPrefixOperator.UNKNOWN
    }' @ [38:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastPrefixOperator, entry1: UastPrefixOperator, entry2: UastPrefixOperator, entry3: UastPrefixOperator, entry4: UastPrefixOperator, entry5: UastPrefixOperator): UastPrefixOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastPrefixOperator

'psi' @ [38:35] ==> public open val psi: KtPrefixExpression defined in org.jetbrains.uast.kotlin.KotlinUPrefixExpression[PropertyDescriptorImpl]

'operationToken' @ [38:39] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCL' @ [39:18] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LOGICAL_NOT' @ [39:45] ==> @field:JvmField public final val LOGICAL_NOT: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

'PLUS' @ [40:18] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UNARY_PLUS' @ [40:45] ==> @field:JvmField public final val UNARY_PLUS: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

'MINUS' @ [41:18] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UNARY_MINUS' @ [41:46] ==> @field:JvmField public final val UNARY_MINUS: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

'PLUSPLUS' @ [42:18] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INC' @ [42:49] ==> @field:JvmField public final val INC: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

'MINUSMINUS' @ [43:18] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DEC' @ [43:51] ==> @field:JvmField public final val DEC: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

'UNKNOWN' @ [44:36] ==> @field:JvmField public final val UNKNOWN: UastPrefixOperator defined in org.jetbrains.uast.UastPrefixOperator.Companion[DeserializedPropertyDescriptor]

