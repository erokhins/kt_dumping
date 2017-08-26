'KotlinAbstractUExpression' @ [39:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'descriptor' @ [42:17] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'descriptor' @ [42:56] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'isPrimary' @ [42:67] ==> public final val ConstructorDescriptor.isPrimary: Boolean[MyPropertyDescriptor]

'source' @ [43:24] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'source' @ [43:53] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'primaryConstructor' @ [43:60] ==> public final val KtClassOrObject.primaryConstructor: KtPrimaryConstructor?[MyPropertyDescriptor]

'source' @ [44:24] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'secondaryConstructors' @ [44:31] ==> public final val KtClassOrObject.secondaryConstructors: List<KtSecondaryConstructor>[MyPropertyDescriptor]

'isEmpty' @ [44:53] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'source' @ [45:24] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'toLightClass' @ [45:31] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'constructors' @ [45:47] ==> public final val KtLightClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [45:61] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'when (source) {
                is KtFunction -> LightClassUtil.getLightClassMethod(source)
                is PsiMethod -> source
                else -> null
            }' @ [48:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?, entry2: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'source' @ [48:26] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'LightClassUtil' @ [49:34] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethod' @ [49:49] ==> public final fun getLightClassMethod(function: KtFunction): PsiMethod? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'source' @ [49:69] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'source' @ [50:33] ==> value-parameter source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion.resolveSource[ValueParameterDescriptorImpl]

'this' @ [56:64] ==> public constructor KotlinUFunctionCallExpression(psi: KtCallExpression, uastParent: UElement?, _resolvedCall: ResolvedCall<*>?) defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[ClassConstructorDescriptorImpl]

'psi' @ [56:69] ==> value-parameter psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.<init>[ValueParameterDescriptorImpl]

'uastParent' @ [56:74] ==> value-parameter uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.<init>[ValueParameterDescriptorImpl]

'lz' @ [58:33] ==> internal fun <T> lz(initializer: () -> ResolvedCall<out CallableDescriptor>?): Lazy<ResolvedCall<out CallableDescriptor>?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>?

'_resolvedCall' @ [59:9] ==> private final val _resolvedCall: ResolvedCall<*>? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'psi' @ [59:26] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'getResolvedCall' @ [59:30] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'psi' @ [59:46] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'analyze' @ [59:50] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'lz' @ [62:34] ==> internal fun <T> lz(initializer: () -> PsiType?): Lazy<PsiType?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiType?

'this' @ [63:28] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'resolvedCall' @ [63:33] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'resolvedCall' @ [64:24] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.receiverType.<anonymous>[LocalVariableDescriptor]

'dispatchReceiver' @ [64:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [64:57] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.receiverType.<anonymous>[LocalVariableDescriptor]

'extensionReceiver' @ [64:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'receiver' @ [65:9] ==> val receiver: ReceiverValue defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.receiverType.<anonymous>[LocalVariableDescriptor]

'type' @ [65:18] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'toPsiType' @ [65:23] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [65:33] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [65:39] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'lz' @ [68:32] ==> internal fun <T> lz(initializer: () -> String?): Lazy<String?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> String?

'resolvedCall' @ [68:37] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'resultingDescriptor' @ [68:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'name' @ [68:72] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [68:78] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'lz' @ [70:36] ==> internal fun <T> lz(initializer: () -> KotlinClassViaConstructorUSimpleReferenceExpression): Lazy<KotlinClassViaConstructorUSimpleReferenceExpression> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KotlinClassViaConstructorUSimpleReferenceExpression

'KotlinClassViaConstructorUSimpleReferenceExpression' @ [71:9] ==> public constructor KotlinClassViaConstructorUSimpleReferenceExpression(psi: KtCallExpression, identifier: String, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[ClassConstructorDescriptorImpl]

'psi' @ [71:61] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'methodName' @ [71:66] ==> public open val methodName: String? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'orAnonymous' @ [71:77] ==> @Suppress internal inline fun String?.orAnonymous(kind: String = ...): String defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [71:99] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'lz' @ [74:38] ==> internal fun <T> lz(initializer: () -> UIdentifier?): Lazy<UIdentifier?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UIdentifier?

'psi' @ [75:32] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'calleeExpression' @ [75:36] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'UIdentifier' @ [76:9] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'calleeExpression' @ [76:21] ==> val calleeExpression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.methodIdentifier.<anonymous>[LocalVariableDescriptor]

'this' @ [76:39] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [80:17] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'valueArguments' @ [80:21] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [80:36] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lz' @ [82:36] ==> internal fun <T> lz(initializer: () -> List<UExpression>): Lazy<List<UExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UExpression>

'psi' @ [82:41] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'valueArguments' @ [82:45] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'map' @ [82:60] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> UExpression

'KotlinConverter' @ [82:66] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [82:82] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [82:97] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.valueArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [82:100] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'this' @ [82:125] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [85:17] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'typeArguments' @ [85:21] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'size' @ [85:35] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'lz' @ [87:35] ==> internal fun <T> lz(initializer: () -> List<PsiType>): Lazy<List<PsiType>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PsiType>

'psi' @ [87:40] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'typeArguments' @ [87:44] ==> public final val KtCallExpression.typeArguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'map' @ [87:58] ==> public inline fun <T, R> Iterable<(KtTypeProjection..KtTypeProjection?)>.map(transform: ((KtTypeProjection..KtTypeProjection?)) -> PsiType): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)
    <R> -> PsiType

'it' @ [87:64] ==> value-parameter it: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.typeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [87:67] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'toPsiType' @ [87:81] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [87:91] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'getExpressionType' @ [90:17] ==> public open fun getExpressionType(): PsiType? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[DeserializedSimpleFunctionDescriptor]

'lz' @ [92:26] ==> internal fun <T> lz(initializer: () -> UastCallKind): Lazy<UastCallKind> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> UastCallKind

'when (resolvedCall?.resultingDescriptor) {
            is ConstructorDescriptor -> UastCallKind.CONSTRUCTOR_CALL
            else -> UastCallKind.METHOD_CALL
        }' @ [93:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastCallKind, entry1: UastCallKind): UastCallKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastCallKind

'resolvedCall' @ [93:15] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'resultingDescriptor' @ [93:29] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'UastCallKind' @ [94:41] ==> public companion object defined in org.jetbrains.uast.UastCallKind[FakeCallableDescriptorForObject]

'CONSTRUCTOR_CALL' @ [94:54] ==> @field:JvmField public final val CONSTRUCTOR_CALL: UastCallKind defined in org.jetbrains.uast.UastCallKind.Companion[DeserializedPropertyDescriptor]

'UastCallKind' @ [95:21] ==> public companion object defined in org.jetbrains.uast.UastCallKind[FakeCallableDescriptorForObject]

'METHOD_CALL' @ [95:34] ==> @field:JvmField public final val METHOD_CALL: UastCallKind defined in org.jetbrains.uast.UastCallKind.Companion[DeserializedPropertyDescriptor]

'if (uastParent is UQualifiedReferenceExpression && uastParent.selector == this)
                uastParent.receiver
            else
                null' @ [101:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'uastParent' @ [101:24] ==> public open val uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'uastParent' @ [101:71] ==> public open val uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'selector' @ [101:82] ==> public abstract val selector: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'this' @ [101:94] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'uastParent' @ [102:17] ==> public open val uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'receiver' @ [102:28] ==> public abstract val receiver: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'resolvedCall' @ [108:26] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'resultingDescriptor' @ [108:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'descriptor' @ [109:22] ==> val descriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.resolve[LocalVariableDescriptor]

'toSource' @ [109:33] ==> internal fun DeclarationDescriptor.toSource(): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resolveSource' @ [110:16] ==> public final fun resolveSource(descriptor: DeclarationDescriptor, source: PsiElement?): PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [110:30] ==> val descriptor: CallableDescriptor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.resolve[LocalVariableDescriptor]

'source' @ [110:42] ==> val source: PsiElement defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.resolve[LocalVariableDescriptor]

'visitor' @ [114:13] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.accept[ValueParameterDescriptorImpl]

'visitCallExpression' @ [114:21] ==> public open fun visitCallExpression(node: UCallExpression): Boolean defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [114:41] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

'methodIdentifier' @ [115:9] ==> public open val methodIdentifier: UIdentifier? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'accept' @ [115:27] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.UIdentifier[DeserializedSimpleFunctionDescriptor]

'visitor' @ [115:34] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.accept[ValueParameterDescriptorImpl]

'classReference' @ [116:9] ==> public open val classReference: KotlinClassViaConstructorUSimpleReferenceExpression defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'accept' @ [116:24] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [116:31] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.accept[ValueParameterDescriptorImpl]

'valueArguments' @ [117:9] ==> public open val valueArguments: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[PropertyDescriptorImpl]

'acceptList' @ [117:24] ==> public fun List<UElement>.acceptList(visitor: UastVisitor): Unit defined in org.jetbrains.uast.internal[DeserializedSimpleFunctionDescriptor]

'visitor' @ [117:35] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.accept[ValueParameterDescriptorImpl]

'visitor' @ [119:9] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.accept[ValueParameterDescriptorImpl]

'afterVisitCallExpression' @ [119:17] ==> public open fun afterVisitCallExpression(node: UCallExpression): Unit defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [119:42] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[LazyClassReceiverParameterDescriptor]

