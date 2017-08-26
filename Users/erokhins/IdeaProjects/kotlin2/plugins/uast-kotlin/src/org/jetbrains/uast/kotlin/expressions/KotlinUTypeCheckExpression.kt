'KotlinAbstractUExpression' @ [27:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [28:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinConverter' @ [28:34] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [28:50] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [28:65] ==> public open val psi: KtIsExpression defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[PropertyDescriptorImpl]

'leftHandSide' @ [28:69] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'this' @ [28:83] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[LazyClassReceiverParameterDescriptor]

'getValue' @ [30:26] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [30:31] ==> public open val psi: KtIsExpression defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[PropertyDescriptorImpl]

'typeReference' @ [30:35] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'toPsiType' @ [30:49] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [30:59] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [32:34] ==> public open val psi: KtIsExpression defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[PropertyDescriptorImpl]

'typeReference' @ [32:38] ==> public final val KtIsExpression.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [32:53] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> LazyKotlinUTypeReferenceExpression): LazyKotlinUTypeReferenceExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> LazyKotlinUTypeReferenceExpression

'LazyKotlinUTypeReferenceExpression' @ [33:9] ==> public constructor LazyKotlinUTypeReferenceExpression(psi: PsiElement, uastParent: UElement?, typeSupplier: () -> PsiType) defined in org.jetbrains.uast.kotlin.LazyKotlinUTypeReferenceExpression[ClassConstructorDescriptorImpl]

'it' @ [33:44] ==> value-parameter it: KtTypeReference defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression.typeReference.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [33:48] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[LazyClassReceiverParameterDescriptor]

'it' @ [33:56] ==> value-parameter it: KtTypeReference defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression.typeReference.<anonymous>[ValueParameterDescriptorImpl]

'toPsiType' @ [33:59] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [33:69] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[LazyClassReceiverParameterDescriptor]

'if(psi.isNegated)
                KotlinBinaryExpressionWithTypeKinds.NEGATED_INSTANCE_CHECK
            else
                UastBinaryExpressionWithTypeKind.INSTANCE_CHECK' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UastBinaryExpressionWithTypeKind.InstanceCheck, elseBranch: UastBinaryExpressionWithTypeKind.InstanceCheck): UastBinaryExpressionWithTypeKind.InstanceCheck[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InstanceCheck

'psi' @ [37:16] ==> public open val psi: KtIsExpression defined in org.jetbrains.uast.kotlin.KotlinUTypeCheckExpression[PropertyDescriptorImpl]

'isNegated' @ [37:20] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'NEGATED_INSTANCE_CHECK' @ [38:53] ==> @JvmField public final val NEGATED_INSTANCE_CHECK: UastBinaryExpressionWithTypeKind.InstanceCheck defined in org.jetbrains.uast.kotlin.KotlinBinaryExpressionWithTypeKinds[PropertyDescriptorImpl]

'INSTANCE_CHECK' @ [40:50] ==> @field:JvmField public final val INSTANCE_CHECK: UastBinaryExpressionWithTypeKind.InstanceCheck defined in org.jetbrains.uast.UastBinaryExpressionWithTypeKind.Companion[DeserializedPropertyDescriptor]

