'hashSetOf' @ [47:32] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<T> /* = HashSet<T> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'classOrObject' @ [48:37] ==> private final val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'superTypeListEntries' @ [48:51] ==> public final val KtPureClassOrObject.superTypeListEntries: List<(KtSuperTypeListEntry..KtSuperTypeListEntry?)>[MyPropertyDescriptor]

'delegationSpecifier' @ [49:17] ==> val delegationSpecifier: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegationSpecifier' @ [52:33] ==> val delegationSpecifier: (KtSuperTypeListEntry..KtSuperTypeListEntry?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'typeReference' @ [52:53] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeResolver' @ [53:42] ==> private final val typeResolver: DelegationResolver.TypeResolver defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'resolve' @ [53:55] ==> public abstract fun resolve(reference: KtTypeReference): KotlinType? defined in org.jetbrains.kotlin.resolve.DelegationResolver.TypeResolver[SimpleFunctionDescriptorImpl]

'typeReference' @ [53:63] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegatedInterfaceType' @ [54:17] ==> val delegatedInterfaceType: KotlinType? defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegatedInterfaceType' @ [54:51] ==> val delegatedInterfaceType: KotlinType? defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'isError' @ [54:74] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'generateDelegatesForInterface' @ [57:41] ==> private final fun generateDelegatesForInterface(existingDelegates: Collection<T>, delegatedInterfaceType: KotlinType): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'delegatedMembers' @ [57:71] ==> val delegatedMembers: HashSet<T> /* = HashSet<T> */ defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegatedInterfaceType' @ [57:89] ==> val delegatedInterfaceType: KotlinType? defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegatedMembers' @ [58:13] ==> val delegatedMembers: HashSet<T> /* = HashSet<T> */ defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'addAll' @ [58:30] ==> public open fun addAll(elements: Collection<T>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'delegatesForInterface' @ [58:37] ==> val delegatesForInterface: Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'delegatedMembers' @ [60:16] ==> val delegatedMembers: HashSet<T> /* = HashSet<T> */ defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatedMembers[LocalVariableDescriptor]

'generateDelegationCandidates' @ [64:13] ==> private final fun generateDelegationCandidates(delegatedInterfaceType: KotlinType): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'delegatedInterfaceType' @ [64:42] ==> value-parameter delegatedInterfaceType: KotlinType defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatesForInterface[ValueParameterDescriptorImpl]

'filter' @ [64:66] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'!' @ [65:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOverridingAnyOf' @ [65:18] ==> private final fun isOverridingAnyOf(candidate: CallableMemberDescriptor, possiblyOverriddenBy: Collection<CallableDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[SimpleFunctionDescriptorImpl]

'candidate' @ [65:36] ==> value-parameter candidate: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatesForInterface.<anonymous>[ValueParameterDescriptorImpl]

'existingMembers' @ [65:47] ==> private final val existingMembers: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'!' @ [66:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkClashWithOtherDelegatedMember' @ [66:18] ==> private final fun checkClashWithOtherDelegatedMember(candidate: T, delegatedMembers: Collection<T>): Boolean defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'candidate' @ [66:53] ==> value-parameter candidate: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatesForInterface.<anonymous>[ValueParameterDescriptorImpl]

'existingDelegates' @ [66:64] ==> value-parameter existingDelegates: Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegatesForInterface[ValueParameterDescriptorImpl]

'getDelegatableMembers' @ [70:13] ==> private final fun getDelegatableMembers(interfaceType: KotlinType): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'delegatedInterfaceType' @ [70:35] ==> value-parameter delegatedInterfaceType: KotlinType defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegationCandidates[ValueParameterDescriptorImpl]

'map' @ [70:59] ==> public inline fun <T, R> Iterable<T>.map(transform: (T) -> T): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> T

'if (memberDescriptor.modality == Modality.ABSTRACT) Modality.OPEN else memberDescriptor.modality' @ [71:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modality, elseBranch: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modality

'memberDescriptor' @ [71:39] ==> value-parameter memberDescriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegationCandidates.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [71:56] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [71:68] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [71:77] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'Modality' @ [71:87] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [71:96] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'memberDescriptor' @ [71:106] ==> value-parameter memberDescriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegationCandidates.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [71:123] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Suppress' @ [72:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'memberDescriptor' @ [73:17] ==> value-parameter memberDescriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegationCandidates.<anonymous>[ValueParameterDescriptorImpl]

'newCopyBuilder' @ [73:34] ==> @NotNull public abstract fun newCopyBuilder(): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[JavaMethodDescriptor]

'setOwner' @ [74:26] ==> @NotNull public abstract fun setOwner(@NotNull p0: DeclarationDescriptor): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'ownerDescriptor' @ [74:35] ==> private final val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'setDispatchReceiverParameter' @ [75:26] ==> @NotNull public abstract fun setDispatchReceiverParameter(@Nullable p0: ReceiverParameterDescriptor?): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'ownerDescriptor' @ [75:55] ==> private final val ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'thisAsReceiverParameter' @ [75:71] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'setModality' @ [76:26] ==> @NotNull public abstract fun setModality(@NotNull p0: Modality): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'newModality' @ [76:38] ==> val newModality: Modality defined in org.jetbrains.kotlin.resolve.DelegationResolver.generateDelegationCandidates.<anonymous>[LocalVariableDescriptor]

'setVisibility' @ [77:26] ==> @NotNull public abstract fun setVisibility(@NotNull p0: Visibility): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'INHERITED' @ [77:53] ==> @NotNull public final val INHERITED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'setKind' @ [78:26] ==> @NotNull public abstract fun setKind(@NotNull p0: CallableMemberDescriptor.Kind): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'DELEGATION' @ [78:34] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'setCopyOverrides' @ [79:26] ==> @NotNull public abstract fun setCopyOverrides(p0: Boolean): CallableMemberDescriptor.CopyBuilder<out (CallableMemberDescriptor..CallableMemberDescriptor?)> defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'build' @ [80:26] ==> @Nullable public abstract fun build(): CallableMemberDescriptor? defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.CopyBuilder[JavaMethodDescriptor]

'delegatedMembers' @ [84:32] ==> value-parameter delegatedMembers: Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.checkClashWithOtherDelegatedMember[ValueParameterDescriptorImpl]

'firstOrNull' @ [84:49] ==> public inline fun <T> Iterable<T>.firstOrNull(predicate: (T) -> Boolean): T? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'isOverridableBy' @ [84:63] ==> private final fun isOverridableBy(memberOne: CallableDescriptor, memberTwo: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[SimpleFunctionDescriptorImpl]

'it' @ [84:79] ==> value-parameter it: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.checkClashWithOtherDelegatedMember.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [84:83] ==> value-parameter candidate: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.checkClashWithOtherDelegatedMember[ValueParameterDescriptorImpl]

'alreadyDelegated' @ [85:13] ==> val alreadyDelegated: T? defined in org.jetbrains.kotlin.resolve.DelegationResolver.checkClashWithOtherDelegatedMember[LocalVariableDescriptor]

'classOrObject' @ [86:17] ==> private final val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'trace' @ [87:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'report' @ [87:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'MANY_IMPL_MEMBER_NOT_IMPLEMENTED' @ [87:30] ==> public final val MANY_IMPL_MEMBER_NOT_IMPLEMENTED: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (KtClassOrObject..KtClassOrObject?), (CallableMemberDescriptor..CallableMemberDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [87:63] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: KtClassOrObject, @NotNull b: CallableMemberDescriptor): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'classOrObject' @ [87:66] ==> private final val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'classOrObject' @ [87:81] ==> private final val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'alreadyDelegated' @ [87:96] ==> val alreadyDelegated: T? defined in org.jetbrains.kotlin.resolve.DelegationResolver.checkClashWithOtherDelegatedMember[LocalVariableDescriptor]

'memberExtractor' @ [95:13] ==> private final val memberExtractor: DelegationResolver.MemberExtractor<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'getMembersByType' @ [95:29] ==> public abstract fun getMembersByType(type: KotlinType): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.MemberExtractor[SimpleFunctionDescriptorImpl]

'interfaceType' @ [95:46] ==> value-parameter interfaceType: KotlinType defined in org.jetbrains.kotlin.resolve.DelegationResolver.getDelegatableMembers[ValueParameterDescriptorImpl]

'filter' @ [95:61] ==> public inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'descriptor' @ [96:17] ==> value-parameter descriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.getDelegatableMembers.<anonymous>[ValueParameterDescriptorImpl]

'isOverridable' @ [96:28] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'descriptor' @ [97:18] ==> value-parameter descriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.getDelegatableMembers.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [97:29] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [97:34] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'!' @ [97:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [97:45] ==> value-parameter descriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.getDelegatableMembers.<anonymous>[ValueParameterDescriptorImpl]

'overridesClassMembersOnly' @ [97:56] ==> private final fun T.overridesClassMembersOnly(): Boolean defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'delegationFilter' @ [98:17] ==> private final val delegationFilter: DelegationFilter defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'filter' @ [98:34] ==> public abstract fun filter(interfaceMember: CallableMemberDescriptor, languageVersionSettings: LanguageVersionSettings): Boolean defined in org.jetbrains.kotlin.resolve.lazy.DelegationFilter[SimpleFunctionDescriptorImpl]

'descriptor' @ [98:41] ==> value-parameter descriptor: T defined in org.jetbrains.kotlin.resolve.DelegationResolver.getDelegatableMembers.<anonymous>[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [98:53] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DelegationResolver[PropertyDescriptorImpl]

'getAllOverriddenDeclarations' @ [102:29] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> getAllOverriddenDeclarations(@NotNull p0: T): (MutableSet<(T..T?)>..Set<(T..T?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> T

'this' @ [102:58] ==> <this> defined in org.jetbrains.kotlin.resolve.DelegationResolver.overridesClassMembersOnly[ReceiverParameterDescriptorImpl]

'all' @ [102:64] ==> public inline fun <T> Iterable<(T..T?)>.all(predicate: ((T..T?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (T..T?)

'isClass' @ [103:33] ==> public open fun isClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [103:41] ==> value-parameter it: (T..T?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.overridesClassMembersOnly.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [103:44] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'DelegationResolver' @ [125:17] ==> private constructor DelegationResolver<T : CallableMemberDescriptor>(classOrObject: KtPureClassOrObject, ownerDescriptor: ClassDescriptor, existingMembers: Collection<CallableDescriptor>, trace: BindingTrace, memberExtractor: DelegationResolver.MemberExtractor<T>, typeResolver: DelegationResolver.TypeResolver, delegationFilter: DelegationFilter, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.DelegationResolver[ClassConstructorDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> T

'classOrObject' @ [125:36] ==> value-parameter classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [125:51] ==> value-parameter ownerDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'existingMembers' @ [125:68] ==> value-parameter existingMembers: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'trace' @ [125:85] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'memberExtractor' @ [125:92] ==> value-parameter memberExtractor: DelegationResolver.MemberExtractor<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'typeResolver' @ [125:109] ==> value-parameter typeResolver: DelegationResolver.TypeResolver defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'delegationFilter' @ [125:123] ==> value-parameter delegationFilter: DelegationFilter defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [125:141] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.generateDelegatedMembers[ValueParameterDescriptorImpl]

'generateDelegatedMembers' @ [126:26] ==> private final fun generateDelegatedMembers(): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver[SimpleFunctionDescriptorImpl]

'possiblyOverriddenBy' @ [132:17] ==> value-parameter possiblyOverriddenBy: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.isOverridingAnyOf[ValueParameterDescriptorImpl]

'any' @ [132:38] ==> public inline fun <T> Iterable<CallableDescriptor>.any(predicate: (CallableDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor

'isOverridableBy' @ [132:44] ==> private final fun isOverridableBy(memberOne: CallableDescriptor, memberTwo: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[SimpleFunctionDescriptorImpl]

'it' @ [132:60] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.isOverridingAnyOf.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [132:64] ==> value-parameter candidate: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.isOverridingAnyOf[ValueParameterDescriptorImpl]

'==' @ [135:17] ==> public final fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[DeserializedSimpleFunctionDescriptor]

'DEFAULT' @ [135:32] ==> public final val DEFAULT: (OverridingUtil..OverridingUtil?) defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaPropertyDescriptor]

'isOverridableBy' @ [135:40] ==> @NotNull public open fun isOverridableBy(@NotNull p0: CallableDescriptor, @NotNull p1: CallableDescriptor, @Nullable p2: ClassDescriptor?): OverridingUtil.OverrideCompatibilityInfo defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'memberOne' @ [135:56] ==> value-parameter memberOne: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.isOverridableBy[ValueParameterDescriptorImpl]

'memberTwo' @ [135:67] ==> value-parameter memberTwo: CallableDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.isOverridableBy[ValueParameterDescriptorImpl]

'result' @ [135:84] ==> public final val OverridingUtil.OverrideCompatibilityInfo.result: OverridingUtil.OverrideCompatibilityInfo.Result[MyPropertyDescriptor]

'OVERRIDABLE' @ [135:94] ==> enum entry OVERRIDABLE defined in org.jetbrains.kotlin.resolve.OverridingUtil.OverrideCompatibilityInfo.Result[FakeCallableDescriptorForObject]

'delegateExpressionType' @ [147:17] ==> value-parameter delegateExpressionType: KotlinType? = ... defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[ValueParameterDescriptorImpl]

'isDynamic' @ [147:41] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'emptyMap' @ [147:70] ==> public fun <K, V> emptyMap(): Map<CallableMemberDescriptor, CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V> -> CallableMemberDescriptor

'descriptor' @ [149:36] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[ValueParameterDescriptorImpl]

'defaultType' @ [149:47] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [149:59] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [149:71] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'asSequence' @ [149:99] ==> public fun <T> Iterable<DeclarationDescriptor>.asSequence(): Sequence<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'filterIsInstance' @ [150:22] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<CallableMemberDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'filter' @ [151:22] ==> public fun <T> Sequence<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): Sequence<CallableMemberDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [151:31] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [151:34] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [151:72] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'asIterable' @ [152:22] ==> public fun <T> Sequence<CallableMemberDescriptor>.asIterable(): Iterable<CallableMemberDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'sortedWith' @ [153:22] ==> public fun <T> Iterable<CallableMemberDescriptor>.sortedWith(comparator: Comparator<in CallableMemberDescriptor> /* = Comparator<in CallableMemberDescriptor> */): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'INSTANCE' @ [153:50] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'delegatedMembers' @ [155:20] ==> val delegatedMembers: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[LocalVariableDescriptor]

'keysToMapExceptNulls' @ [156:22] ==> public fun <K, V : Any> Iterable<CallableMemberDescriptor>.keysToMapExceptNulls(value: (CallableMemberDescriptor) -> CallableMemberDescriptor?): Map<CallableMemberDescriptor, CallableMemberDescriptor> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> CallableMemberDescriptor
    <V : Any> -> CallableMemberDescriptor

'getAllOverriddenDescriptors' @ [157:63] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> getAllOverriddenDescriptors(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableMemberDescriptor

'delegatingMember' @ [157:91] ==> value-parameter delegatingMember: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [158:34] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.filter(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [158:43] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [158:46] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'toInterface' @ [158:71] ==> value-parameter toInterface: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[ValueParameterDescriptorImpl]

'map' @ [159:34] ==> public inline fun <T, R> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.map(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> CallableMemberDescriptor?): List<CallableMemberDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R> -> CallableMemberDescriptor?

'delegateExpressionType' @ [160:50] ==> value-parameter delegateExpressionType: KotlinType? = ... defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[ValueParameterDescriptorImpl]

'toInterface' @ [160:76] ==> value-parameter toInterface: ClassDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates[ValueParameterDescriptorImpl]

'defaultType' @ [160:88] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'memberScope' @ [160:101] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'overriddenDescriptor' @ [161:48] ==> value-parameter overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [161:69] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'scope' @ [164:38] ==> val scope: MemberScope defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getContributedFunctions' @ [164:44] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [164:68] ==> val name: Name defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'WHEN_CHECK_OVERRIDES' @ [164:91] ==> enum entry WHEN_CHECK_OVERRIDES defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'scope' @ [165:38] ==> val scope: MemberScope defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getContributedVariables' @ [165:44] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [165:68] ==> val name: Name defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'WHEN_CHECK_OVERRIDES' @ [165:91] ==> enum entry WHEN_CHECK_OVERRIDES defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [166:46] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.firstOrNull(predicate: (CallableMemberDescriptor) -> Boolean): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'it' @ [166:60] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [166:66] ==> value-parameter overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overrides' @ [166:105] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> overrides(@NotNull p0: (CallableMemberDescriptor..CallableMemberDescriptor?), @NotNull p1: (CallableMemberDescriptor..CallableMemberDescriptor?)): Boolean defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [166:115] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'overriddenDescriptor' @ [166:119] ==> value-parameter overriddenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'actualDelegates' @ [169:25] ==> val actualDelegates: List<CallableMemberDescriptor?> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion.getDelegates.<anonymous>[LocalVariableDescriptor]

'firstOrNull' @ [169:41] ==> public fun <T> List<CallableMemberDescriptor?>.firstOrNull(): CallableMemberDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor?

