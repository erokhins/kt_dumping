'KotlinAbstractUExpression' @ [33:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'psi' @ [38:25] ==> public open val psi: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[PropertyDescriptorImpl]

'ktElement' @ [39:32] ==> val ktElement: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUExpressionList.evaluate[LocalVariableDescriptor]

'analyze' @ [39:42] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'COMPILE_TIME_VALUE' @ [39:67] ==> public final val COMPILE_TIME_VALUE: (WritableSlice<(KtExpression..KtExpression?), (CompileTimeConstant<*>..CompileTimeConstant<*>?)>..WritableSlice<(KtExpression..KtExpression?), (CompileTimeConstant<*>..CompileTimeConstant<*>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'ktElement' @ [39:87] ==> val ktElement: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUExpressionList.evaluate[LocalVariableDescriptor]

'compileTimeConst' @ [40:16] ==> val compileTimeConst: CompileTimeConstant<*>? defined in org.jetbrains.uast.kotlin.KotlinUExpressionList.evaluate[LocalVariableDescriptor]

'getValue' @ [40:34] ==> public open fun getValue(expectedType: KotlinType): Any? defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstant[DeserializedSimpleFunctionDescriptor]

'NO_EXPECTED_TYPE' @ [40:53] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'KotlinUExpressionList' @ [45:17] ==> public constructor KotlinUExpressionList(psi: PsiElement?, kind: UastSpecialExpressionKind, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[ClassConstructorDescriptorImpl]

'psi' @ [45:39] ==> value-parameter psi: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUExpressionList.Companion.createClassBody[ValueParameterDescriptorImpl]

'CLASS_BODY' @ [45:73] ==> @JvmField public final val CLASS_BODY: UastSpecialExpressionKind defined in org.jetbrains.uast.kotlin.kinds.KotlinSpecialExpressionKinds[PropertyDescriptorImpl]

'uastParent' @ [45:85] ==> value-parameter uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUExpressionList.Companion.createClassBody[ValueParameterDescriptorImpl]

'apply' @ [45:97] ==> @InlineOnly public inline fun <T> KotlinUExpressionList.apply(block: KotlinUExpressionList.() -> Unit): KotlinUExpressionList defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUExpressionList

'expressions' @ [46:21] ==> public open lateinit var expressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[PropertyDescriptorImpl]

'emptyList' @ [46:35] ==> public fun <T> emptyList(): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

