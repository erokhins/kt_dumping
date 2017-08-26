'KotlinAbstractUExpression' @ [39:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'lz' @ [40:40] ==> internal fun <T> lz(initializer: () -> PsiElement?): Lazy<PsiElement?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiElement?

'psi' @ [40:45] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'resolveCallToDeclaration' @ [40:49] ==> internal fun KtElement.resolveCallToDeclaration(context: KotlinAbstractUElement, resultingDescriptor: DeclarationDescriptor? = ...): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [40:74] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [42:37] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'getReferencedName' @ [42:41] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'resolvedDeclaration' @ [44:30] ==> private final val resolvedDeclaration: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'resolvedDeclaration' @ [47:18] ==> private final val resolvedDeclaration: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'name' @ [47:60] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'visitor' @ [50:9] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[ValueParameterDescriptorImpl]

'visitSimpleNameReferenceExpression' @ [50:17] ==> public open fun visitSimpleNameReferenceExpression(node: USimpleNameReferenceExpression): Boolean defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [50:52] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [53:30] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'analyze' @ [53:34] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'psi' @ [54:22] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'readWriteAccess' @ [54:26] ==> private final fun KtExpression.readWriteAccess(): KotlinUSimpleReferenceExpression.ReferenceAccess defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[SimpleFunctionDescriptorImpl]

'psi' @ [55:28] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'getResolvedCall' @ [55:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [55:48] ==> val bindingContext: BindingContext defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'resolvedCall' @ [56:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'resultingDescriptor' @ [56:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [57:13] ==> val resultingDescriptor: SyntheticJavaPropertyDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'if (access.isWrite) {
                findAssignment(psi, psi.parent)?.right ?: run {
                    visitor.afterVisitSimpleNameReferenceExpression(this)
                    return
                }
            } else {
                null
            }' @ [58:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'access' @ [58:35] ==> val access: KotlinUSimpleReferenceExpression.ReferenceAccess defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'isWrite' @ [58:42] ==> public final val isWrite: Boolean defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[PropertyDescriptorImpl]

'findAssignment' @ [59:17] ==> private final tailrec fun findAssignment(prev: PsiElement?, element: PsiElement?): KtBinaryExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[SimpleFunctionDescriptorImpl]

'psi' @ [59:32] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'psi' @ [59:37] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'parent' @ [59:41] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'right' @ [59:50] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'run' @ [59:59] ==> @InlineOnly public inline fun <T, R> KotlinUSimpleReferenceExpression.run(block: KotlinUSimpleReferenceExpression.() -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinUSimpleReferenceExpression
    <R> -> KtExpression

'visitor' @ [60:21] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[ValueParameterDescriptorImpl]

'afterVisitSimpleNameReferenceExpression' @ [60:29] ==> public open fun afterVisitSimpleNameReferenceExpression(node: USimpleNameReferenceExpression): Unit defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [60:69] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept.<anonymous>[ReceiverParameterDescriptorImpl]

'resolvedCall' @ [67:17] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'access' @ [68:21] ==> val access: KotlinUSimpleReferenceExpression.ReferenceAccess defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'isRead' @ [68:28] ==> public final val isRead: Boolean defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[PropertyDescriptorImpl]

'resultingDescriptor' @ [69:41] ==> val resultingDescriptor: SyntheticJavaPropertyDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'getMethod' @ [69:61] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'KotlinAccessorCallExpression' @ [70:21] ==> public constructor KotlinAccessorCallExpression(psi: KtElement, uastParent: KotlinUSimpleReferenceExpression, resolvedCall: ResolvedCall<*>, accessorDescriptor: DeclarationDescriptor, setterValue: KtExpression?) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[ClassConstructorDescriptorImpl]

'psi' @ [70:50] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'this' @ [70:55] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'resolvedCall' @ [70:61] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'getDescriptor' @ [70:75] ==> val getDescriptor: FunctionDescriptor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'accept' @ [70:96] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [70:103] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[ValueParameterDescriptorImpl]

'access' @ [73:21] ==> val access: KotlinUSimpleReferenceExpression.ReferenceAccess defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'isWrite' @ [73:28] ==> public final val isWrite: Boolean defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[PropertyDescriptorImpl]

'setterValue' @ [73:39] ==> val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'resultingDescriptor' @ [74:41] ==> val resultingDescriptor: SyntheticJavaPropertyDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'setMethod' @ [74:61] ==> public abstract val setMethod: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[DeserializedPropertyDescriptor]

'setDescriptor' @ [75:25] ==> val setDescriptor: FunctionDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'KotlinAccessorCallExpression' @ [76:25] ==> public constructor KotlinAccessorCallExpression(psi: KtElement, uastParent: KotlinUSimpleReferenceExpression, resolvedCall: ResolvedCall<*>, accessorDescriptor: DeclarationDescriptor, setterValue: KtExpression?) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[ClassConstructorDescriptorImpl]

'psi' @ [76:54] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'this' @ [76:59] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'resolvedCall' @ [76:65] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'setDescriptor' @ [76:79] ==> val setDescriptor: FunctionDescriptor? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'setterValue' @ [76:94] ==> val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[LocalVariableDescriptor]

'accept' @ [76:107] ==> public open fun accept(visitor: UastVisitor): Unit defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[DeserializedSimpleFunctionDescriptor]

'visitor' @ [76:114] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[ValueParameterDescriptorImpl]

'visitor' @ [82:9] ==> value-parameter visitor: UastVisitor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.accept[ValueParameterDescriptorImpl]

'afterVisitSimpleNameReferenceExpression' @ [82:17] ==> public open fun afterVisitSimpleNameReferenceExpression(node: USimpleNameReferenceExpression): Unit defined in org.jetbrains.uast.visitor.UastVisitor[DeserializedSimpleFunctionDescriptor]

'this' @ [82:57] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'when (element) {
        is KtBinaryExpression -> if (element.left == prev && element.operationToken == KtTokens.EQ) element else null
        is KtQualifiedExpression -> findAssignment(element, element.parent)
        is KtSimpleNameExpression -> findAssignment(element, element.parent)
        else -> null
    }' @ [85:104] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtBinaryExpression?, entry1: KtBinaryExpression?, entry2: KtBinaryExpression?, entry3: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtBinaryExpression?

'element' @ [85:110] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'if (element.left == prev && element.operationToken == KtTokens.EQ) element else null' @ [86:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtBinaryExpression?, elseBranch: KtBinaryExpression?): KtBinaryExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtBinaryExpression?

'element' @ [86:38] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'left' @ [86:46] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'prev' @ [86:54] ==> value-parameter prev: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'element' @ [86:62] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'operationToken' @ [86:70] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [86:97] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [86:101] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'findAssignment' @ [87:37] ==> private final tailrec fun findAssignment(prev: PsiElement?, element: PsiElement?): KtBinaryExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[SimpleFunctionDescriptorImpl]

'element' @ [87:52] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'element' @ [87:61] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'parent' @ [87:69] ==> public final val KtQualifiedExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'findAssignment' @ [88:38] ==> private final tailrec fun findAssignment(prev: PsiElement?, element: PsiElement?): KtBinaryExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[SimpleFunctionDescriptorImpl]

'element' @ [88:53] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'element' @ [88:62] ==> value-parameter element: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.findAssignment[ValueParameterDescriptorImpl]

'parent' @ [88:70] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'accessorDescriptor' @ [100:21] ==> private final val accessorDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'name' @ [100:40] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [100:45] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'uastParent' @ [104:41] ==> public open val uastParent: KotlinUSimpleReferenceExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'uastParent' @ [104:52] ==> public open val uastParent: UElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'if (containingElement is UQualifiedReferenceExpression && containingElement.selector == this)
                    containingElement.receiver
                else
                    null' @ [105:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UExpression?, elseBranch: UExpression?): UExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UExpression?

'containingElement' @ [105:28] ==> val containingElement: UElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.<get-receiver>[LocalVariableDescriptor]

'containingElement' @ [105:82] ==> val containingElement: UElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.<get-receiver>[LocalVariableDescriptor]

'selector' @ [105:100] ==> public abstract val selector: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'this' @ [105:112] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'containingElement' @ [106:21] ==> val containingElement: UElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.<get-receiver>[LocalVariableDescriptor]

'receiver' @ [106:39] ==> public abstract val receiver: UExpression defined in org.jetbrains.uast.UQualifiedReferenceExpression[DeserializedPropertyDescriptor]

'emptyList' @ [112:21] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

'lz' @ [114:38] ==> internal fun <T> lz(initializer: () -> PsiType?): Lazy<PsiType?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiType?

'?:' @ [115:24] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinType?, right: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinType

'resolvedCall' @ [115:25] ==> private final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'dispatchReceiver' @ [115:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [115:58] ==> private final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'extensionReceiver' @ [115:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'type' @ [115:91] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'type' @ [116:13] ==> val type: KotlinType defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.receiverType.<anonymous>[LocalVariableDescriptor]

'toPsiType' @ [116:18] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [116:28] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [116:34] ==> public open val psi: KtElement defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'UIdentifier' @ [120:21] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'uastParent' @ [120:33] ==> public open val uastParent: KotlinUSimpleReferenceExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'psi' @ [120:44] ==> public open val psi: KtSimpleNameExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression[PropertyDescriptorImpl]

'this' @ [120:49] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'if (setterValue != null) 1 else 0' @ [126:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'setterValue' @ [126:25] ==> public final val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'lz' @ [128:40] ==> internal fun <T> lz(initializer: () -> List<UExpression>): Lazy<List<UExpression>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<UExpression>

'if (setterValue != null)
                listOf(KotlinConverter.convertOrEmpty(setterValue, this))
            else
                emptyList()' @ [129:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<UExpression>, elseBranch: List<UExpression>): List<UExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<UExpression>

'setterValue' @ [129:17] ==> public final val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'listOf' @ [130:17] ==> public fun <T> listOf(element: UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'KotlinConverter' @ [130:24] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [130:40] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'setterValue' @ [130:55] ==> public final val setterValue: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'this' @ [130:68] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'emptyList' @ [132:17] ==> public fun <T> emptyList(): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'resolvedCall' @ [136:21] ==> private final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'typeArguments' @ [136:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'size' @ [136:48] ==> public abstract val size: Int defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'lz' @ [138:39] ==> internal fun <T> lz(initializer: () -> List<PsiType>): Lazy<List<PsiType>> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> List<PsiType>

'resolvedCall' @ [139:13] ==> private final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'typeArguments' @ [139:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.typeArguments: (MutableMap<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>..Map<(TypeParameterDescriptor..TypeParameterDescriptor?), (KotlinType..KotlinType?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'values' @ [139:40] ==> public abstract val values: MutableCollection<(KotlinType..KotlinType?)> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'map' @ [139:47] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.map(transform: ((KotlinType..KotlinType?)) -> PsiType): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> PsiType

'it' @ [139:53] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.typeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toPsiType' @ [139:56] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [139:66] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [139:72] ==> public open val psi: KtElement defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'lz' @ [142:36] ==> internal fun <T> lz(initializer: () -> PsiType?): Lazy<PsiType?> defined in org.jetbrains.uast.kotlin[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> PsiType?

'accessorDescriptor' @ [143:14] ==> private final val accessorDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'returnType' @ [143:58] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'toPsiType' @ [143:70] ==> internal fun KotlinType.toPsiType(source: UElement, element: KtElement, boxed: Boolean): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [143:80] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [143:86] ==> public open val psi: KtElement defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'UastCallKind' @ [147:21] ==> public companion object defined in org.jetbrains.uast.UastCallKind[FakeCallableDescriptorForObject]

'METHOD_CALL' @ [147:34] ==> @field:JvmField public final val METHOD_CALL: UastCallKind defined in org.jetbrains.uast.UastCallKind.Companion[DeserializedPropertyDescriptor]

'accessorDescriptor' @ [150:26] ==> private final val accessorDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'toSource' @ [150:45] ==> internal fun DeclarationDescriptor.toSource(): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'KotlinUFunctionCallExpression' @ [151:20] ==> public companion object defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression[FakeCallableDescriptorForObject]

'resolveSource' @ [151:50] ==> public final fun resolveSource(descriptor: DeclarationDescriptor, source: PsiElement?): PsiMethod? defined in org.jetbrains.uast.kotlin.KotlinUFunctionCallExpression.Companion[SimpleFunctionDescriptorImpl]

'accessorDescriptor' @ [151:64] ==> private final val accessorDescriptor: DeclarationDescriptor defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression[PropertyDescriptorImpl]

'source' @ [151:84] ==> val source: PsiElement? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.KotlinAccessorCallExpression.resolve[LocalVariableDescriptor]

'' @ [156:13] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[ClassConstructorDescriptorImpl]

'' @ [156:33] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[ClassConstructorDescriptorImpl]

'' @ [156:58] ==> private constructor ReferenceAccess(isRead: Boolean, isWrite: Boolean) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[ClassConstructorDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [160:26] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'expression' @ [162:26] ==> var expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'parent' @ [162:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtParenthesizedExpression, is KtAnnotatedExpression, is KtLabeledExpression -> expression = parent as KtExpression
                else -> break@loop
            }' @ [163:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parent' @ [163:19] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'expression' @ [164:99] ==> var expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'parent' @ [164:112] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'expression' @ [169:26] ==> var expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'getAssignmentByLHS' @ [169:37] ==> public fun KtExpression.getAssignmentByLHS(): KtBinaryExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'assignment' @ [170:13] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'when (assignment.operationToken) {
                KtTokens.EQ -> ReferenceAccess.WRITE
                else -> ReferenceAccess.READ_WRITE
            }' @ [171:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinUSimpleReferenceExpression.ReferenceAccess, entry1: KotlinUSimpleReferenceExpression.ReferenceAccess): KotlinUSimpleReferenceExpression.ReferenceAccess[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReferenceAccess

'assignment' @ [171:26] ==> val assignment: KtBinaryExpression? defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'operationToken' @ [171:37] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'EQ' @ [172:26] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'WRITE' @ [172:48] ==> enum entry WRITE defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[FakeCallableDescriptorForObject]

'READ_WRITE' @ [173:41] ==> enum entry READ_WRITE defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[FakeCallableDescriptorForObject]

'if ((expression.parent as? KtUnaryExpression)?.operationToken
                in constant { setOf(KtTokens.PLUSPLUS, KtTokens.MINUSMINUS) })
            ReferenceAccess.READ_WRITE
        else
            ReferenceAccess.READ' @ [177:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinUSimpleReferenceExpression.ReferenceAccess, elseBranch: KotlinUSimpleReferenceExpression.ReferenceAccess): KotlinUSimpleReferenceExpression.ReferenceAccess[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReferenceAccess

'in' @ [177:20] ==> public operator fun <@OnlyInputTypes T> Iterable<IElementType?>.contains(element: IElementType?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> IElementType?

'expression' @ [177:21] ==> var expression: KtExpression defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.readWriteAccess[LocalVariableDescriptor]

'parent' @ [177:32] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'operationToken' @ [177:63] ==> public final val KtUnaryExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'constant' @ [178:20] ==> public fun <T : Any> constant(calculator: () -> Set<(KtSingleValueToken..KtSingleValueToken?)>): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<(org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)>

'setOf' @ [178:31] ==> public fun <T> setOf(vararg elements: (KtSingleValueToken..KtSingleValueToken?)): Set<(KtSingleValueToken..KtSingleValueToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtSingleValueToken..org.jetbrains.kotlin.lexer.KtSingleValueToken?)

'PLUSPLUS' @ [178:46] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSMINUS' @ [178:65] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'READ_WRITE' @ [179:29] ==> enum entry READ_WRITE defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[FakeCallableDescriptorForObject]

'READ' @ [181:29] ==> enum entry READ defined in org.jetbrains.uast.kotlin.KotlinUSimpleReferenceExpression.ReferenceAccess[FakeCallableDescriptorForObject]

'KotlinAbstractUExpression' @ [189:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'psi' @ [191:18] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[PropertyDescriptorImpl]

'getResolvedCall' @ [191:22] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'psi' @ [191:38] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[PropertyDescriptorImpl]

'analyze' @ [191:42] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [191:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'containingDeclaration' @ [192:19] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'name' @ [192:42] ==> public final val ClassifierDescriptorWithTypeParameters.name: Name[MyPropertyDescriptor]

'asString' @ [192:48] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'psi' @ [195:28] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[PropertyDescriptorImpl]

'getResolvedCall' @ [195:32] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'psi' @ [195:48] ==> public open val psi: KtCallExpression defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[PropertyDescriptorImpl]

'analyze' @ [195:52] ==> internal fun KtElement.analyze(): BindingContext defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [196:35] ==> val resolvedCall: ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression.resolve[LocalVariableDescriptor]

'resultingDescriptor' @ [196:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resultingDescriptor' @ [197:21] ==> val resultingDescriptor: ConstructorDescriptor defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression.resolve[LocalVariableDescriptor]

'containingDeclaration' @ [197:41] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'clazz' @ [198:16] ==> val clazz: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression.resolve[LocalVariableDescriptor]

'toSource' @ [198:22] ==> internal fun DeclarationDescriptor.toSource(): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'getMaybeLightElement' @ [198:34] ==> internal fun PsiElement.getMaybeLightElement(context: UElement): PsiElement? defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [198:55] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinClassViaConstructorUSimpleReferenceExpression[LazyClassReceiverParameterDescriptor]

'KotlinAbstractUExpression' @ [205:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'identifier' @ [210:17] ==> public open val identifier: String defined in org.jetbrains.uast.kotlin.KotlinStringUSimpleReferenceExpression[PropertyDescriptorImpl]

