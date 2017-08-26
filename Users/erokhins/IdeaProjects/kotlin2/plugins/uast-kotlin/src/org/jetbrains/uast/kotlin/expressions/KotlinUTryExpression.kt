'KotlinAbstractUExpression' @ [28:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [29:31] ==> internal fun <T> lz(initializer: () -> UExpression): Lazy<UExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [29:36] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [29:52] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [29:67] ==> public open val psi: KtTryExpression defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[PropertyDescriptorImpl]

'tryBlock' @ [29:71] ==> public final val KtTryExpression.tryBlock: KtBlockExpression[MyPropertyDescriptor]

'this' @ [29:81] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[LazyClassReceiverParameterDescriptor]

'lz' @ [30:34] ==> internal fun <T> lz(initializer: () -> List<KotlinUCatchClause>): Lazy<List<KotlinUCatchClause>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<KotlinUCatchClause>

'psi' @ [30:39] ==> public open val psi: KtTryExpression defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[PropertyDescriptorImpl]

'catchClauses' @ [30:43] ==> public final val KtTryExpression.catchClauses: (MutableList<(KtCatchClause..KtCatchClause?)>..List<(KtCatchClause..KtCatchClause?)>)[MyPropertyDescriptor]

'map' @ [30:56] ==> public inline fun <T, R> Iterable<(KtCatchClause..KtCatchClause?)>.map(transform: ((KtCatchClause..KtCatchClause?)) -> KotlinUCatchClause): List<KotlinUCatchClause> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtCatchClause..org.jetbrains.kotlin.psi.KtCatchClause?)
    <R> -> KotlinUCatchClause

'KotlinUCatchClause' @ [30:62] ==> public constructor KotlinUCatchClause(psi: KtCatchClause, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUCatchClause[ClassConstructorDescriptorImpl]

'it' @ [30:81] ==> value-parameter it: (KtCatchClause..KtCatchClause?) defined in org.jetbrains.uast.kotlin.KotlinUTryExpression.catchClauses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [30:85] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[LazyClassReceiverParameterDescriptor]

'lz' @ [31:35] ==> internal fun <T> lz(initializer: () -> UExpression?): Lazy<UExpression?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression?

'psi' @ [31:40] ==> public open val psi: KtTryExpression defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[PropertyDescriptorImpl]

'finallyBlock' @ [31:44] ==> public final val KtTryExpression.finallyBlock: KtFinallySection?[MyPropertyDescriptor]

'finalExpression' @ [31:58] ==> public final val KtFinallySection.finalExpression: (KtBlockExpression..KtBlockExpression?)[MyPropertyDescriptor]

'let' @ [31:75] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> UExpression?): UExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> UExpression?

'KotlinConverter' @ [31:81] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertExpression' @ [31:97] ==> internal final fun convertExpression(expression: KtExpression, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [31:115] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.uast.kotlin.KotlinUTryExpression.finallyClause.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [31:121] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[LazyClassReceiverParameterDescriptor]

'emptyList' @ [34:17] ==> public fun <T> emptyList(): List<UVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UVariable

'UIdentifier' @ [40:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'this' @ [40:35] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTryExpression[LazyClassReceiverParameterDescriptor]

