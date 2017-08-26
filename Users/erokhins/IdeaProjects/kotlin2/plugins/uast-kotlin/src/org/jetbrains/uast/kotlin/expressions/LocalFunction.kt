'psi' @ [16:31] ==> value-parameter psi: PsiVariable defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable.<init>[ValueParameterDescriptorImpl]

'lz' @ [17:51] ==> internal fun <T> lz(initializer: () -> ULambdaExpression): Lazy<ULambdaExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ULambdaExpression

'createLocalFunctionLambdaExpression' @ [18:9] ==> public fun createLocalFunctionLambdaExpression(function: KtFunction, parent: UElement?): ULambdaExpression defined in org.jetbrains.uast.kotlin.expressions in file LocalFunction.kt[SimpleFunctionDescriptorImpl]

'function' @ [18:45] ==> public final val function: KtFunction defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[PropertyDescriptorImpl]

'this' @ [18:55] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[LazyClassReceiverParameterDescriptor]

'emptyList' @ [22:51] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

'other' @ [24:40] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable.equals[ValueParameterDescriptorImpl]

'psi' @ [24:81] ==> public open val psi: PsiVariable defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[PropertyDescriptorImpl]

'other' @ [24:88] ==> value-parameter other: Any? defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable.equals[ValueParameterDescriptorImpl]

'psi' @ [24:94] ==> public open val psi: PsiVariable defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[PropertyDescriptorImpl]

'psi' @ [25:31] ==> public open val psi: PsiVariable defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[PropertyDescriptorImpl]

'hashCode' @ [25:35] ==> public open fun hashCode(): Int defined in com.intellij.psi.PsiVariable[DeserializedSimpleFunctionDescriptor]

'KotlinAbstractUExpression' @ [32:4] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [36:26] ==> internal fun <T> lz(initializer: () -> UExpression): Lazy<UExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [36:31] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [36:47] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [36:62] ==> public open val psi: KtFunction defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'bodyExpression' @ [36:66] ==> public final val KtFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [36:82] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[LazyClassReceiverParameterDescriptor]

'lz' @ [38:37] ==> internal fun <T> lz(initializer: () -> List<KotlinUParameter>): Lazy<List<KotlinUParameter>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<KotlinUParameter>

'psi' @ [39:9] ==> public open val psi: KtFunction defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'valueParameters' @ [39:13] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'mapIndexed' @ [39:29] ==> public inline fun <T, R> Iterable<(KtParameter..KtParameter?)>.mapIndexed(transform: (index: Int, (KtParameter..KtParameter?)) -> KotlinUParameter): List<KotlinUParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> KotlinUParameter

'KotlinUParameter' @ [40:13] ==> public constructor KotlinUParameter(psi: PsiParameter, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUParameter[ClassConstructorDescriptorImpl]

'UastKotlinPsiParameter' @ [40:30] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter[FakeCallableDescriptorForObject]

'create' @ [40:53] ==> public final fun create(parameter: KtParameter, parent: PsiElement, containingElement: UElement, index: Int): PsiParameter defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter.Companion[SimpleFunctionDescriptorImpl]

'p' @ [40:60] ==> value-parameter p: (KtParameter..KtParameter?) defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression.valueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [40:63] ==> public open val psi: KtFunction defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'this' @ [40:68] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[LazyClassReceiverParameterDescriptor]

'i' @ [40:74] ==> value-parameter i: Int defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression.valueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [40:78] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[LazyClassReceiverParameterDescriptor]

'valueParameters' @ [45:39] ==> public open val valueParameters: List<KotlinUParameter> defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'joinToString' @ [45:55] ==> public fun <T> Iterable<KotlinUParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinUParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUParameter

'KotlinUParameter' @ [46:29] ==> public constructor KotlinUParameter(psi: PsiParameter, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUParameter[ClassConstructorDescriptorImpl]

'?:' @ [47:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'body' @ [47:28] ==> public open val body: UExpression defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'expressions' @ [47:56] ==> public abstract val expressions: List<UExpression> defined in org.jetbrains.uast.UBlockExpression[DeserializedPropertyDescriptor]

'joinToString' @ [47:69] ==> public fun <T> Iterable<UExpression>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((UExpression) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'it' @ [48:13] ==> value-parameter it: UExpression defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression.asRenderString.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [48:16] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'withMargin' @ [48:33] ==> public val String.withMargin: String defined in org.jetbrains.uast[DeserializedPropertyDescriptor]

'body' @ [49:14] ==> public open val body: UExpression defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[PropertyDescriptorImpl]

'asRenderString' @ [49:19] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'renderedValueParameters' @ [50:22] ==> val renderedValueParameters: String defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression.asRenderString[LocalVariableDescriptor]

'expressions' @ [50:51] ==> val expressions: String defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression.asRenderString[LocalVariableDescriptor]

'withMargin' @ [50:63] ==> public val String.withMargin: String defined in org.jetbrains.uast[DeserializedPropertyDescriptor]

'KotlinUDeclarationsExpression' @ [56:12] ==> public constructor KotlinUDeclarationsExpression(uastParent: UElement?) defined in org.jetbrains.uast.KotlinUDeclarationsExpression[ClassConstructorDescriptorImpl]

'parent' @ [56:42] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'apply' @ [56:50] ==> @InlineOnly public inline fun <T> KotlinUDeclarationsExpression.apply(block: KotlinUDeclarationsExpression.() -> Unit): KotlinUDeclarationsExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUDeclarationsExpression

'UastKotlinPsiVariable' @ [57:32] ==> public companion object defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable[FakeCallableDescriptorForObject]

'create' @ [57:54] ==> public final fun create(name: String, localFunction: KtFunction, containingElement: UElement): PsiLocalVariable defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiVariable.Companion[SimpleFunctionDescriptorImpl]

'function' @ [57:61] ==> value-parameter function: KtFunction defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'name' @ [57:70] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'orAnonymous' @ [57:75] ==> @Suppress internal inline fun String?.orAnonymous(kind: String = ...): String defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'function' @ [57:90] ==> value-parameter function: KtFunction defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'this' @ [57:100] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration.<anonymous>[ReceiverParameterDescriptorImpl]

'declarations' @ [58:9] ==> public open lateinit var declarations: List<UDeclaration> defined in org.jetbrains.uast.KotlinUDeclarationsExpression[PropertyDescriptorImpl]

'listOf' @ [58:24] ==> public fun <T> listOf(element: KotlinLocalFunctionUVariable): List<KotlinLocalFunctionUVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinLocalFunctionUVariable

'KotlinLocalFunctionUVariable' @ [58:31] ==> public constructor KotlinLocalFunctionUVariable(function: KtFunction, psi: PsiVariable, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionUVariable[ClassConstructorDescriptorImpl]

'function' @ [58:60] ==> value-parameter function: KtFunction defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'functionVariable' @ [58:70] ==> val functionVariable: PsiLocalVariable defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration.<anonymous>[LocalVariableDescriptor]

'this' @ [58:88] ==> <this> defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionDeclaration.<anonymous>[ReceiverParameterDescriptorImpl]

'KotlinLocalFunctionULambdaExpression' @ [63:9] ==> public constructor KotlinLocalFunctionULambdaExpression(psi: KtFunction, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.expressions.KotlinLocalFunctionULambdaExpression[ClassConstructorDescriptorImpl]

'function' @ [63:46] ==> value-parameter function: KtFunction defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionLambdaExpression[ValueParameterDescriptorImpl]

'parent' @ [63:56] ==> value-parameter parent: UElement? defined in org.jetbrains.uast.kotlin.expressions.createLocalFunctionLambdaExpression[ValueParameterDescriptorImpl]

