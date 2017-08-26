'lz' @ [14:39] ==> internal fun <T> lz(initializer: () -> AnnotationDescriptor?): Lazy<AnnotationDescriptor?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> AnnotationDescriptor?

'psi' @ [14:44] ==> public open val psi: KtAnnotationEntry defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'analyze' @ [14:48] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'ANNOTATION' @ [14:73] ==> public final val ANNOTATION: (WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>..WritableSlice<(KtAnnotationEntry..KtAnnotationEntry?), (AnnotationDescriptor..AnnotationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'psi' @ [14:85] ==> public open val psi: KtAnnotationEntry defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'resolvedAnnotation' @ [17:17] ==> private final val resolvedAnnotation: AnnotationDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'fqName' @ [17:37] ==> public open val fqName: FqName? defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'asString' @ [17:45] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'lz' @ [19:37] ==> internal fun <T> lz(initializer: () -> List<KotlinUNamedExpression>): Lazy<List<KotlinUNamedExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<KotlinUNamedExpression>

'getUastContext' @ [20:23] ==> public tailrec fun UElement.getUastContext(): UastContext defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]

'psi' @ [21:9] ==> public open val psi: KtAnnotationEntry defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'valueArguments' @ [21:13] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'map' @ [21:28] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> KotlinUNamedExpression): List<KotlinUNamedExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> KotlinUNamedExpression

'arg' @ [22:24] ==> value-parameter arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentName' @ [22:28] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'asName' @ [22:47] ==> public abstract val asName: Name defined in org.jetbrains.kotlin.psi.ValueArgumentName[DeserializedPropertyDescriptor]

'asString' @ [22:55] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'KotlinUNamedExpression' @ [23:13] ==> public constructor KotlinUNamedExpression(name: String, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUNamedExpression[ClassConstructorDescriptorImpl]

'name' @ [23:36] ==> val name: String defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [23:42] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[LazyClassReceiverParameterDescriptor]

'apply' @ [23:48] ==> @InlineOnly public inline fun <T> KotlinUNamedExpression.apply(block: KotlinUNamedExpression.() -> Unit): KotlinUNamedExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUNamedExpression

'arg' @ [24:29] ==> value-parameter arg: (ValueArgument..ValueArgument?) defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [24:33] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'let' @ [24:58] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> UElement?): UElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> UElement?

'context' @ [24:64] ==> val context: UastContext defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>[LocalVariableDescriptor]

'convertElement' @ [24:72] ==> public open fun convertElement(element: PsiElement, parent: UElement?, requiredType: Class<out UElement>?): UElement? defined in org.jetbrains.uast.UastContext[DeserializedSimpleFunctionDescriptor]

'it' @ [24:87] ==> value-parameter it: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [24:91] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'expression' @ [25:17] ==> public open lateinit var expression: UExpression defined in org.jetbrains.uast.kotlin.KotlinUNamedExpression[PropertyDescriptorImpl]

'value' @ [25:30] ==> val value: UExpression? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.attributeValues.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'UastEmptyExpression' @ [25:39] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'resolvedAnnotation' @ [31:26] ==> private final val resolvedAnnotation: AnnotationDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'annotationClass' @ [31:46] ==> public val AnnotationDescriptor.annotationClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'descriptor' @ [32:16] ==> val descriptor: ClassDescriptor defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.resolve[LocalVariableDescriptor]

'toSource' @ [32:27] ==> internal fun DeclarationDescriptor.toSource(): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getMaybeLightElement' @ [32:39] ==> internal fun PsiElement.getMaybeLightElement(context: UElement): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [32:60] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[LazyClassReceiverParameterDescriptor]

'findDeclaredAttributeValue' @ [36:54] ==> public open fun findDeclaredAttributeValue(name: String?): UExpression? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[SimpleFunctionDescriptorImpl]

'name' @ [36:81] ==> value-parameter name: String? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.findAttributeValue[ValueParameterDescriptorImpl]

'attributeValues' @ [39:16] ==> public open val attributeValues: List<KotlinUNamedExpression> defined in org.jetbrains.uast.kotlin.KotlinUAnnotation[PropertyDescriptorImpl]

'firstOrNull' @ [39:32] ==> public inline fun <T> Iterable<KotlinUNamedExpression>.firstOrNull(predicate: (KotlinUNamedExpression) -> Boolean): KotlinUNamedExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUNamedExpression

'it' @ [39:46] ==> value-parameter it: KotlinUNamedExpression defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.findDeclaredAttributeValue.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [39:49] ==> public open val name: String defined in org.jetbrains.uast.kotlin.KotlinUNamedExpression[PropertyDescriptorImpl]

'name' @ [39:58] ==> value-parameter name: String? defined in org.jetbrains.uast.kotlin.KotlinUAnnotation.findDeclaredAttributeValue[ValueParameterDescriptorImpl]

'expression' @ [39:78] ==> public open lateinit var expression: UExpression defined in org.jetbrains.uast.kotlin.KotlinUNamedExpression[PropertyDescriptorImpl]

'emptyList' @ [47:17] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

