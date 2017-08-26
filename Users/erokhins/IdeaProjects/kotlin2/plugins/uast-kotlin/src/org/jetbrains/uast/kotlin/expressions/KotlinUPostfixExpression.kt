'KotlinAbstractUExpression' @ [27:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [28:29] ==> internal fun <T> lz(initializer: () -> UExpression): Lazy<UExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [28:34] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [28:50] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [28:65] ==> public open val psi: KtPostfixExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'baseExpression' @ [28:69] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [28:85] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[LazyClassReceiverParameterDescriptor]

'when (psi.operationToken) {
        KtTokens.PLUSPLUS -> UastPostfixOperator.INC
        KtTokens.MINUSMINUS -> UastPostfixOperator.DEC
        KtTokens.EXCLEXCL -> KotlinPostfixOperators.EXCLEXCL
        else -> UastPostfixOperator.UNKNOWN
    }' @ [30:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastPostfixOperator, entry1: UastPostfixOperator, entry2: UastPostfixOperator, entry3: UastPostfixOperator): UastPostfixOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastPostfixOperator

'psi' @ [30:35] ==> public open val psi: KtPostfixExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'operationToken' @ [30:39] ==> public final val KtPostfixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'PLUSPLUS' @ [31:18] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastPostfixOperator' @ [31:30] ==> public companion object defined in org.jetbrains.uast.UastPostfixOperator[FakeCallableDescriptorForObject]

'INC' @ [31:50] ==> @field:JvmField public final val INC: UastPostfixOperator defined in org.jetbrains.uast.UastPostfixOperator.Companion[DeserializedPropertyDescriptor]

'MINUSMINUS' @ [32:18] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UastPostfixOperator' @ [32:32] ==> public companion object defined in org.jetbrains.uast.UastPostfixOperator[FakeCallableDescriptorForObject]

'DEC' @ [32:52] ==> @field:JvmField public final val DEC: UastPostfixOperator defined in org.jetbrains.uast.UastPostfixOperator.Companion[DeserializedPropertyDescriptor]

'EXCLEXCL' @ [33:18] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinPostfixOperators' @ [33:30] ==> public object KotlinPostfixOperators defined in org.jetbrains.uast.kotlin in file KotlinPostfixOperators.kt[FakeCallableDescriptorForObject]

'EXCLEXCL' @ [33:53] ==> @JvmField public final val EXCLEXCL: UastPostfixOperator defined in org.jetbrains.uast.kotlin.KotlinPostfixOperators[PropertyDescriptorImpl]

'UastPostfixOperator' @ [34:17] ==> public companion object defined in org.jetbrains.uast.UastPostfixOperator[FakeCallableDescriptorForObject]

'UNKNOWN' @ [34:37] ==> @field:JvmField public final val UNKNOWN: UastPostfixOperator defined in org.jetbrains.uast.UastPostfixOperator.Companion[DeserializedPropertyDescriptor]

'UIdentifier' @ [38:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'psi' @ [38:29] ==> public open val psi: KtPostfixExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'operationReference' @ [38:33] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'this' @ [38:53] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [40:38] ==> public open val psi: KtPostfixExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'operationReference' @ [40:42] ==> public final val KtPostfixExpression.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'resolveCallToDeclaration' @ [40:61] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [40:96] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[LazyClassReceiverParameterDescriptor]

'when (psi.operationToken) {
        KtTokens.EXCLEXCL -> operand.tryResolve() as? PsiMethod
        else -> null
    }' @ [42:42] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'psi' @ [42:48] ==> public open val psi: KtPostfixExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'operationToken' @ [42:52] ==> public final val KtPostfixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCLEXCL' @ [43:18] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'operand' @ [43:30] ==> public open val operand: UExpression defined in org.jetbrains.uast.kotlin.KotlinUPostfixExpression[PropertyDescriptorImpl]

'tryResolve' @ [43:38] ==> public fun UElement.tryResolve(): PsiElement? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

