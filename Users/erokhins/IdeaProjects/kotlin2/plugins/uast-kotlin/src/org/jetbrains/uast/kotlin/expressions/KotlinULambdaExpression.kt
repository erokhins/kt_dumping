'KotlinAbstractUExpression' @ [30:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getFunctionalInterfaceType' @ [32:17] ==> internal fun KotlinULambdaExpression.getFunctionalInterfaceType(): PsiType? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getValue' @ [34:26] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinConverter' @ [34:31] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [34:47] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [34:62] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'bodyExpression' @ [34:66] ==> public final val KtLambdaExpression.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'this' @ [34:82] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[LazyClassReceiverParameterDescriptor]

'getValue' @ [36:37] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [37:9] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'valueParameters' @ [37:13] ==> public final val KtLambdaExpression.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'mapIndexed' @ [37:29] ==> public inline fun <T, R> Iterable<(KtParameter..KtParameter?)>.mapIndexed(transform: (index: Int, (KtParameter..KtParameter?)) -> KotlinUParameter): List<KotlinUParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> KotlinUParameter

'KotlinUParameter' @ [38:13] ==> public constructor KotlinUParameter(psi: PsiParameter, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUParameter[ClassConstructorDescriptorImpl]

'create' @ [38:53] ==> public final fun create(parameter: KtParameter, parent: PsiElement, containingElement: UElement, index: Int): PsiParameter defined in org.jetbrains.uast.kotlin.psi.UastKotlinPsiParameter.Companion[SimpleFunctionDescriptorImpl]

'p' @ [38:60] ==> value-parameter p: (KtParameter..KtParameter?) defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.valueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [38:63] ==> public open val psi: KtLambdaExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'this' @ [38:68] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[LazyClassReceiverParameterDescriptor]

'i' @ [38:74] ==> value-parameter i: Int defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.valueParameters.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [38:78] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[LazyClassReceiverParameterDescriptor]

'if (valueParameters.isEmpty())
            ""
        else
            valueParameters.joinToString { it.asRenderString() } + " ->\n"' @ [43:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'valueParameters' @ [43:43] ==> public open val valueParameters: List<KotlinUParameter> defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'isEmpty' @ [43:59] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'valueParameters' @ [46:13] ==> public open val valueParameters: List<KotlinUParameter> defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'joinToString' @ [46:29] ==> public fun <T> Iterable<KotlinUParameter>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((KotlinUParameter) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUParameter

'it' @ [46:44] ==> value-parameter it: KotlinUParameter defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.asRenderString.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [46:47] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.kotlin.KotlinUParameter[DeserializedSimpleFunctionDescriptor]

'?:' @ [47:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'body' @ [47:28] ==> public open val body: UExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'expressions' @ [47:56] ==> public abstract val expressions: List<UExpression> defined in org.jetbrains.uast.UBlockExpression[DeserializedPropertyDescriptor]

'joinToString' @ [48:37] ==> public fun <T> Iterable<UExpression>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((UExpression) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'it' @ [48:58] ==> value-parameter it: UExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.asRenderString.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [48:61] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'withMargin' @ [48:78] ==> public val String.withMargin: String defined in org.jetbrains.uast[DeserializedPropertyDescriptor]

'body' @ [48:94] ==> public open val body: UExpression defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression[PropertyDescriptorImpl]

'asRenderString' @ [48:99] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'renderedValueParameters' @ [50:20] ==> val renderedValueParameters: String defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.asRenderString[LocalVariableDescriptor]

'expressions' @ [50:46] ==> val expressions: String defined in org.jetbrains.uast.kotlin.KotlinULambdaExpression.asRenderString[LocalVariableDescriptor]

