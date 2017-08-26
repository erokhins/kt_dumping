'descriptor' @ [42:13] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [43:13] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'declaration' @ [45:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'superTypeListEntries' @ [45:39] ==> public final val KtClassOrObject.superTypeListEntries: List<KtSuperTypeListEntry>[MyPropertyDescriptor]

'specifier' @ [46:17] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'specifier' @ [47:33] ==> val specifier: KtSuperTypeListEntry defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'typeReference' @ [47:43] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [47:58] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> KotlinType?

'bindingContext' @ [47:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'get' @ [47:79] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtTypeReference..org.jetbrains.kotlin.psi.KtTypeReference?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'TYPE' @ [47:98] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [47:104] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'superType' @ [48:43] ==> val superType: KotlinType defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'constructor' @ [48:53] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [48:65] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'component1' @ [50:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, CallableMemberDescriptor>.component1(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> CallableMemberDescriptor

'component2' @ [50:34] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<CallableMemberDescriptor, CallableMemberDescriptor>.component2(): CallableMemberDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> CallableMemberDescriptor

'DelegationResolver' @ [50:50] ==> public companion object defined in org.jetbrains.kotlin.resolve.DelegationResolver[FakeCallableDescriptorForObject]

'getDelegates' @ [50:69] ==> public final fun getDelegates(descriptor: ClassDescriptor, toInterface: ClassDescriptor, delegateExpressionType: KotlinType? = ...): Map<CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [50:82] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'superTypeDescriptor' @ [50:94] ==> val superTypeDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'checkDescriptor' @ [51:21] ==> private final fun checkDescriptor(classDeclaration: KtClassOrObject, delegatedDescriptor: CallableMemberDescriptor, delegatedToDescriptor: CallableMemberDescriptor, diagnosticHolder: DiagnosticSink): Unit defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker[SimpleFunctionDescriptorImpl]

'declaration' @ [51:37] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'delegated' @ [51:50] ==> val delegated: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'delegatedTo' @ [51:61] ==> val delegatedTo: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[LocalVariableDescriptor]

'diagnosticHolder' @ [51:74] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.check[ValueParameterDescriptorImpl]

'-' @ [64:17] ==> public operator fun <T> Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>.minus(element: (CallableMemberDescriptor..CallableMemberDescriptor?)): Set<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'filterOutOverridden' @ [64:32] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> filterOutOverridden(@NotNull p0: (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'getAllOverriddenDescriptors' @ [65:41] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableMemberDescriptor

'delegatedDescriptor' @ [65:69] ==> value-parameter delegatedDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[ValueParameterDescriptorImpl]

'filter' @ [65:90] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.filter(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [65:99] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [65:102] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [65:107] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'toSet' @ [65:116] ==> public fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.toSet(): Set<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'unwrapFakeOverride' @ [66:37] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> unwrapFakeOverride(@NotNull p0: CallableMemberDescriptor): CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'delegatedToDescriptor' @ [66:56] ==> value-parameter delegatedToDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[ValueParameterDescriptorImpl]

'original' @ [66:79] ==> public final val CallableMemberDescriptor.original: CallableMemberDescriptor[MyPropertyDescriptor]

'reachableFromDelegated' @ [68:36] ==> val reachableFromDelegated: Set<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[LocalVariableDescriptor]

'filter' @ [68:59] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.filter(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [68:68] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [68:71] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'OPEN' @ [68:92] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'nonAbstractReachable' @ [70:13] ==> val nonAbstractReachable: List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[LocalVariableDescriptor]

'isNotEmpty' @ [70:34] ==> @InlineOnly public inline fun <T> Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'diagnosticHolder' @ [72:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[ValueParameterDescriptorImpl]

'report' @ [72:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE' @ [72:37] ==> public final val DELEGATED_MEMBER_HIDES_SUPERTYPE_OVERRIDE: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?), (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [72:79] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: CallableMemberDescriptor, @NotNull b: (MutableList<(CallableMemberDescriptor..CallableMemberDescriptor?)>..List<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'classDeclaration' @ [72:82] ==> value-parameter classDeclaration: KtClassOrObject defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[ValueParameterDescriptorImpl]

'delegatedDescriptor' @ [72:100] ==> value-parameter delegatedDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[ValueParameterDescriptorImpl]

'nonAbstractReachable' @ [72:121] ==> val nonAbstractReachable: List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.resolve.checkers.DelegationChecker.checkDescriptor[LocalVariableDescriptor]

