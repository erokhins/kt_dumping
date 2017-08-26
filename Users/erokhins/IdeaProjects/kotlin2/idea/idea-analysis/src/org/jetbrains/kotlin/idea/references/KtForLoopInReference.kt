'KtMultiReference<KtForExpression>' @ [26:56] ==> public constructor KtMultiReference<T : KtElement>(expression: KtForExpression) defined in org.jetbrains.kotlin.idea.references.KtMultiReference[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtForExpression

'element' @ [26:90] ==> value-parameter element: KtForExpression defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.<init>[ValueParameterDescriptorImpl]

'expression' @ [29:25] ==> public final val expression: KtForExpression defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference[PropertyDescriptorImpl]

'inKeyword' @ [29:36] ==> public final val KtForExpression.inKeyword: PsiElement?[MyPropertyDescriptor]

'EMPTY_RANGE' @ [29:66] ==> public final val EMPTY_RANGE: (TextRange..TextRange?) defined in com.intellij.openapi.util.TextRange[JavaPropertyDescriptor]

'inKeyword' @ [31:22] ==> val inKeyword: PsiElement defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getRangeInElement[LocalVariableDescriptor]

'startOffsetInParent' @ [31:32] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'TextRange' @ [32:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'offset' @ [32:26] ==> val offset: Int defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getRangeInElement[LocalVariableDescriptor]

'offset' @ [32:34] ==> val offset: Int defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getRangeInElement[LocalVariableDescriptor]

'inKeyword' @ [32:43] ==> val inKeyword: PsiElement defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getRangeInElement[LocalVariableDescriptor]

'textLength' @ [32:53] ==> public final val PsiElement.textLength: Int[MyPropertyDescriptor]

'expression' @ [36:25] ==> public final val expression: KtForExpression defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference[PropertyDescriptorImpl]

'loopRange' @ [36:36] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'emptyList' @ [36:56] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'LOOP_RANGE_KEYS' @ [37:16] ==> private final val LOOP_RANGE_KEYS: Array<(WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)> defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.Companion[PropertyDescriptorImpl]

'mapNotNull' @ [37:32] ==> public inline fun <T, R : Any> Array<out (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)>.mapNotNull(transform: ((WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)) -> FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)>..org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)>?)
    <R : Any> -> FunctionDescriptor

'context' @ [37:52] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'get' @ [37:60] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'key' @ [37:64] ==> value-parameter key: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getTargetDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'loopRange' @ [37:69] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.getTargetDescriptors[LocalVariableDescriptor]

'candidateDescriptor' @ [37:81] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: (FunctionDescriptor..FunctionDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'NAMES' @ [41:17] ==> private final val NAMES: List<Name> defined in org.jetbrains.kotlin.idea.references.KtForLoopInReference.Companion[PropertyDescriptorImpl]

'arrayOf' @ [44:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)): Array<(WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)>..org.jetbrains.kotlin.util.slicedMap.WritableSlice<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?), (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)>?)

'LOOP_RANGE_ITERATOR_RESOLVED_CALL' @ [45:32] ==> public final val LOOP_RANGE_ITERATOR_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'LOOP_RANGE_NEXT_RESOLVED_CALL' @ [46:32] ==> public final val LOOP_RANGE_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'LOOP_RANGE_HAS_NEXT_RESOLVED_CALL' @ [47:32] ==> public final val LOOP_RANGE_HAS_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'listOf' @ [50:29] ==> public fun <T> listOf(vararg elements: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'OperatorNameConventions' @ [51:17] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'ITERATOR' @ [51:41] ==> @field:JvmField public final val ITERATOR: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'OperatorNameConventions' @ [52:17] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'NEXT' @ [52:41] ==> @field:JvmField public final val NEXT: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'OperatorNameConventions' @ [53:17] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'HAS_NEXT' @ [53:41] ==> @field:JvmField public final val HAS_NEXT: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

