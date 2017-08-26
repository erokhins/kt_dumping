'KtMultiReference<KtPropertyDelegate>' @ [29:75] ==> public constructor KtMultiReference<T : KtElement>(expression: KtPropertyDelegate) defined in org.jetbrains.kotlin.idea.references.KtMultiReference[ClassConstructorDescriptorImpl]
Inferred types:
    <T : KtElement> -> KtPropertyDelegate

'element' @ [29:112] ==> value-parameter element: KtPropertyDelegate defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.<init>[ValueParameterDescriptorImpl]

'expression' @ [32:29] ==> public final val expression: KtPropertyDelegate defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference[PropertyDescriptorImpl]

'byKeywordNode' @ [32:40] ==> public final val KtPropertyDelegate.byKeywordNode: ASTNode[MyPropertyDescriptor]

'byKeywordNode' @ [33:22] ==> val byKeywordNode: ASTNode defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getRangeInElement[LocalVariableDescriptor]

'psi' @ [33:36] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'startOffsetInParent' @ [33:42] ==> public final val PsiElement.startOffsetInParent: Int[MyPropertyDescriptor]

'TextRange' @ [34:16] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'offset' @ [34:26] ==> val offset: Int defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getRangeInElement[LocalVariableDescriptor]

'offset' @ [34:34] ==> val offset: Int defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getRangeInElement[LocalVariableDescriptor]

'byKeywordNode' @ [34:43] ==> val byKeywordNode: ASTNode defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getRangeInElement[LocalVariableDescriptor]

'textLength' @ [34:57] ==> public final val ASTNode.textLength: Int[MyPropertyDescriptor]

'expression' @ [38:24] ==> public final val expression: KtPropertyDelegate defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference[PropertyDescriptorImpl]

'getStrictParentOfType' @ [38:35] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'emptyList' @ [38:81] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'context' @ [39:26] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [39:49] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [39:76] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[LocalVariableDescriptor]

'emptyList' @ [39:119] ==> public fun <T> emptyList(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'descriptor' @ [40:17] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[LocalVariableDescriptor]

'accessors' @ [40:28] ==> public final val PropertyDescriptor.accessors: (MutableList<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>..List<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>)[MyPropertyDescriptor]

'mapNotNull' @ [40:38] ==> public inline fun <T, R : Any> Iterable<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>.mapNotNull(transform: ((PropertyAccessorDescriptor..PropertyAccessorDescriptor?)) -> FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor..org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor?)
    <R : Any> -> FunctionDescriptor

'context' @ [42:13] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'get' @ [42:21] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (VariableAccessorDescriptor..VariableAccessorDescriptor?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor..org.jetbrains.kotlin.descriptors.VariableAccessorDescriptor?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [42:40] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'accessor' @ [42:74] ==> value-parameter accessor: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [42:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'listOfNotNull' @ [43:13] ==> public fun <T : Any> listOfNotNull(element: FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FunctionDescriptor

'context' @ [43:27] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[ValueParameterDescriptorImpl]

'get' @ [43:35] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors..org.jetbrains.kotlin.descriptors.VariableDescriptorWithAccessors?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'PROVIDE_DELEGATE_RESOLVED_CALL' @ [43:54] ==> public final val PROVIDE_DELEGATE_RESOLVED_CALL: (WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableDescriptorWithAccessors..VariableDescriptorWithAccessors?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [43:86] ==> val descriptor: PropertyDescriptor defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.getTargetDescriptors[LocalVariableDescriptor]

'candidateDescriptor' @ [43:99] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>.candidateDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'NAMES' @ [46:60] ==> private final val NAMES: List<Name> defined in org.jetbrains.kotlin.idea.references.KtPropertyDelegationMethodsReference.Companion[PropertyDescriptorImpl]

'listOf' @ [49:29] ==> public fun <T> listOf(vararg elements: Name): List<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'GET_VALUE' @ [49:60] ==> @field:JvmField public final val GET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'SET_VALUE' @ [49:95] ==> @field:JvmField public final val SET_VALUE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

