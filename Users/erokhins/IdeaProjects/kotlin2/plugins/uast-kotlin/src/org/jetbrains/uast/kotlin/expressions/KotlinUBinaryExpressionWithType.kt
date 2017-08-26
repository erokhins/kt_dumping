'KotlinAbstractUExpression' @ [28:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [31:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinConverter' @ [31:34] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [31:50] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [31:65] ==> public open val psi: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[PropertyDescriptorImpl]

'left' @ [31:69] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'this' @ [31:75] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[LazyClassReceiverParameterDescriptor]

'getValue' @ [32:26] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [32:31] ==> public open val psi: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[PropertyDescriptorImpl]

'right' @ [32:35] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'toPsiType' @ [32:41] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [32:51] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[LazyClassReceiverParameterDescriptor]

'getValue' @ [34:35] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [35:9] ==> public open val psi: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[PropertyDescriptorImpl]

'right' @ [35:13] ==> public final val KtBinaryExpressionWithTypeRHS.right: KtTypeReference?[MyPropertyDescriptor]

'let' @ [35:20] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> LazyKotlinUTypeReferenceExpression): LazyKotlinUTypeReferenceExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> LazyKotlinUTypeReferenceExpression

'LazyKotlinUTypeReferenceExpression' @ [35:26] ==> public constructor LazyKotlinUTypeReferenceExpression(psi: PsiElement, uastParent: UElement?, typeSupplier: () -> PsiType) defined in org.jetbrains.uast.kotlin.LazyKotlinUTypeReferenceExpression[ClassConstructorDescriptorImpl]

'it' @ [35:61] ==> value-parameter it: KtTypeReference defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType.typeReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [35:65] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[LazyClassReceiverParameterDescriptor]

'it' @ [35:73] ==> value-parameter it: KtTypeReference defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType.typeReference.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toPsiType' @ [35:76] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [35:86] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[LazyClassReceiverParameterDescriptor]

'when (psi.operationReference.getReferencedNameElementType()) {
        KtTokens.AS_KEYWORD -> UastBinaryExpressionWithTypeKind.TYPE_CAST
        KtTokens.AS_SAFE -> KotlinBinaryExpressionWithTypeKinds.SAFE_TYPE_CAST
        else -> UastBinaryExpressionWithTypeKind.UNKNOWN
    }' @ [38:34] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastBinaryExpressionWithTypeKind, entry1: UastBinaryExpressionWithTypeKind, entry2: UastBinaryExpressionWithTypeKind): UastBinaryExpressionWithTypeKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastBinaryExpressionWithTypeKind

'psi' @ [38:40] ==> public open val psi: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.uast.kotlin.KotlinUBinaryExpressionWithType[PropertyDescriptorImpl]

'operationReference' @ [38:44] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [38:63] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'AS_KEYWORD' @ [39:18] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'TYPE_CAST' @ [39:65] ==> @field:JvmField public final val TYPE_CAST: UastBinaryExpressionWithTypeKind.TypeCast defined in org.jetbrains.uast.UastBinaryExpressionWithTypeKind.Companion[DeserializedPropertyDescriptor]

'AS_SAFE' @ [40:18] ==> public final val AS_SAFE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SAFE_TYPE_CAST' @ [40:65] ==> @JvmField public final val SAFE_TYPE_CAST: UastBinaryExpressionWithTypeKind.TypeCast defined in org.jetbrains.uast.kotlin.KotlinBinaryExpressionWithTypeKinds[PropertyDescriptorImpl]

'UNKNOWN' @ [41:50] ==> @field:JvmField public final val UNKNOWN: UastBinaryExpressionWithTypeKind defined in org.jetbrains.uast.UastBinaryExpressionWithTypeKind.Companion[DeserializedPropertyDescriptor]

'KotlinAbstractUExpression' @ [48:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [55:35] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'typeReference' @ [55:40] ==> public open var typeReference: UTypeReferenceExpression? defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpressionWithType[PropertyDescriptorImpl]

'type' @ [55:55] ==> public abstract val type: PsiType defined in org.jetbrains.uast.UTypeReferenceExpression[DeserializedPropertyDescriptor]

'UastErrorType' @ [55:63] ==> public object UastErrorType : PsiType defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

