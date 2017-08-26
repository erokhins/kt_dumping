'KotlinAbstractUExpression' @ [28:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [32:49] ==> internal fun <T> lz(initializer: () -> List<UExpression>): Lazy<List<UExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UExpression>

'psi' @ [32:54] ==> public open val psi: KtStringTemplateExpression defined in org.jetbrains.uast.kotlin.KotlinStringTemplateUPolyadicExpression[PropertyDescriptorImpl]

'entries' @ [32:58] ==> public final val KtStringTemplateExpression.entries: (Array<(KtStringTemplateEntry..KtStringTemplateEntry?)>..Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>)[MyPropertyDescriptor]

'map' @ [32:66] ==> public inline fun <T, R> Array<out (KtStringTemplateEntry..KtStringTemplateEntry?)>.map(transform: ((KtStringTemplateEntry..KtStringTemplateEntry?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtStringTemplateEntry..org.jetbrains.kotlin.psi.KtStringTemplateEntry?)
    <R> -> UExpression

'KotlinConverter' @ [32:72] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertEntry' @ [32:88] ==> internal final fun convertEntry(entry: KtStringTemplateEntry, parentCallback: (() -> UElement?)?, requiredType: Class<out UElement>? = ...): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [32:101] ==> value-parameter it: (KtStringTemplateEntry..KtStringTemplateEntry?) defined in org.jetbrains.uast.kotlin.KotlinStringTemplateUPolyadicExpression.operands.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [32:107] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinStringTemplateUPolyadicExpression[LazyClassReceiverParameterDescriptor]

'UastBinaryOperator' @ [33:29] ==> public companion object defined in org.jetbrains.uast.UastBinaryOperator[FakeCallableDescriptorForObject]

'PLUS' @ [33:48] ==> @field:JvmField public final val PLUS: UastBinaryOperator.ArithmeticOperator defined in org.jetbrains.uast.UastBinaryOperator.Companion[DeserializedPropertyDescriptor]

