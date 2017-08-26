'AbstractLazyMemberScope<ClassDescriptorWithResolutionScopes, ClassMemberDeclarationProvider>' @ [52:5] ==> protected constructor AbstractLazyMemberScope<out D : DeclarationDescriptor, out DP : DeclarationProvider>(c: LazyClassContext, declarationProvider: ClassMemberDeclarationProvider, thisDescriptor: ClassDescriptorWithResolutionScopes, trace: BindingTrace) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[ClassConstructorDescriptorImpl]
Inferred types:
    <out D : DeclarationDescriptor> -> ClassDescriptorWithResolutionScopes
    <out DP : DeclarationProvider> -> ClassMemberDeclarationProvider

'c' @ [52:98] ==> value-parameter c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'declarationProvider' @ [52:101] ==> value-parameter declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'thisClass' @ [52:122] ==> value-parameter thisClass: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'trace' @ [52:133] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [54:51] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'createLazyValue' @ [54:66] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<DeclarationDescriptor>): NotNullLazyValue<List<DeclarationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> List<DeclarationDescriptor>

'computeDescriptorsFromDeclaredElements' @ [55:9] ==> protected final fun computeDescriptorsFromDeclaredElements(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'DescriptorKindFilter' @ [55:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'ALL' @ [55:69] ==> @field:JvmField public final val ALL: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'MemberScope' @ [55:74] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[FakeCallableDescriptorForObject]

'ALL_NAME_FILTER' @ [55:86] ==> public final val ALL_NAME_FILTER: (Name) -> Boolean defined in org.jetbrains.kotlin.resolve.scopes.MemberScope.Companion[DeserializedPropertyDescriptor]

'WHEN_GET_ALL_DESCRIPTORS' @ [55:120] ==> enum entry WHEN_GET_ALL_DESCRIPTORS defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'storageManager' @ [57:89] ==> protected final val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'createLazyValue' @ [57:104] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Collection<DeclarationDescriptor>): NotNullLazyValue<Collection<DeclarationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<DeclarationDescriptor>

'computeExtraDescriptors' @ [58:9] ==> protected open fun computeExtraDescriptors(location: LookupLocation): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'FOR_ALREADY_TRACKED' @ [58:50] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'LinkedHashSet' @ [63:22] ==> public constructor LinkedHashSet<E : (Any..Any?)>(p0: (MutableCollection<out (DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)) defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'invoke' @ [63:36] ==> public abstract fun invoke(): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'result' @ [64:9] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedDescriptors[LocalVariableDescriptor]

'addAll' @ [64:16] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'invoke' @ [64:23] ==> public abstract fun invoke(): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'result' @ [65:16] ==> val result: LinkedHashSet<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedDescriptors[LocalVariableDescriptor]

'ArrayList' @ [69:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'thisDescriptor' @ [70:27] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [70:42] ==> public final val ClassDescriptorWithResolutionScopes.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [70:58] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'supertype' @ [71:32] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'memberScope' @ [71:42] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [71:54] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'if (descriptor is FunctionDescriptor) {
                    result.addAll(getContributedFunctions(descriptor.name, location))
                }
                else if (descriptor is PropertyDescriptor) {
                    result.addAll(getContributedVariables(descriptor.name, location))
                }' @ [72:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'descriptor' @ [72:21] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'result' @ [73:21] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'addAll' @ [73:28] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getContributedFunctions' @ [73:35] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'descriptor' @ [73:59] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'name' @ [73:70] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'location' @ [73:76] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[ValueParameterDescriptorImpl]

'descriptor' @ [75:26] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'result' @ [76:21] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'addAll' @ [76:28] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'getContributedVariables' @ [76:35] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'descriptor' @ [76:59] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'name' @ [76:70] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'location' @ [76:76] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[ValueParameterDescriptorImpl]

'addDataClassMethods' @ [82:9] ==> private final fun addDataClassMethods(result: MutableCollection<DeclarationDescriptor>, location: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [82:29] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'location' @ [82:37] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[ValueParameterDescriptorImpl]

'addSyntheticCompanionObject' @ [83:9] ==> private final fun addSyntheticCompanionObject(result: MutableCollection<DeclarationDescriptor>, location: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [83:37] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'location' @ [83:45] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[ValueParameterDescriptorImpl]

'addSyntheticNestedClasses' @ [84:9] ==> private final fun addSyntheticNestedClasses(result: MutableCollection<DeclarationDescriptor>, location: LookupLocation): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [84:35] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'location' @ [84:43] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[ValueParameterDescriptorImpl]

'result' @ [86:9] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'trimToSize' @ [86:16] ==> public open fun trimToSize(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'result' @ [87:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.computeExtraDescriptors[LocalVariableDescriptor]

'c' @ [95:15] ==> value-parameter c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [95:17] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'createNullableLazyValue' @ [95:32] ==> public abstract fun <T : Any> createNullableLazyValue(computable: () -> ClassConstructorDescriptor?): NullableLazyValue<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassConstructorDescriptor

'resolvePrimaryConstructor' @ [95:58] ==> protected open fun resolvePrimaryConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [98:13] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForMemberDeclarationResolution' @ [98:28] ==> public final val ClassDescriptorWithResolutionScopes.scopeForMemberDeclarationResolution: LexicalScope[MyPropertyDescriptor]

'thisDescriptor' @ [101:13] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForInitializerResolution' @ [101:28] ==> public final val ClassDescriptorWithResolutionScopes.scopeForInitializerResolution: LexicalScope[MyPropertyDescriptor]

'generateOverridesInFunctionGroup' @ [104:24] ==> public open fun generateOverridesInFunctionGroup(@NotNull p0: Name, @NotNull p1: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p2: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull p3: ClassDescriptor, @NotNull p4: OverridingStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'name' @ [104:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'fromSupertypes' @ [104:63] ==> value-parameter fromSupertypes: Collection<D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'ArrayList' @ [104:79] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (D..D?)>..Collection<(D..D?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> D

'result' @ [104:89] ==> value-parameter result: MutableCollection<D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'thisDescriptor' @ [104:98] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'OverridingStrategy' @ [104:123] ==> public constructor OverridingStrategy() defined in org.jetbrains.kotlin.resolve.OverridingStrategy[DeserializedClassConstructorDescriptor]

'assert' @ [106:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'exactDescriptorClass' @ [106:24] ==> value-parameter exactDescriptorClass: Class<out D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'isInstance' @ [106:45] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'fakeOverride' @ [106:56] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'+' @ [106:73] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'fakeOverride' @ [106:116] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'exactDescriptorClass' @ [106:153] ==> value-parameter exactDescriptorClass: Class<out D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'simpleName' @ [106:174] ==> public final val <T : (Any..Any?)> Class<out D>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> D

'Suppress' @ [107:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'result' @ [108:17] ==> value-parameter result: MutableCollection<D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'add' @ [108:24] ==> public abstract fun add(element: D): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'fakeOverride' @ [108:28] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'reportOnDeclarationOrFail' @ [112:17] ==> public inline fun reportOnDeclarationOrFail(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (PsiElement) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]

'trace' @ [112:43] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'fromCurrent' @ [112:50] ==> value-parameter fromCurrent: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.overrideConflict[ValueParameterDescriptorImpl]

'CONFLICTING_OVERLOADS' @ [112:72] ==> public final val CONFLICTING_OVERLOADS: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [112:94] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'it' @ [112:97] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.overrideConflict.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [112:101] ==> public fun <T> listOf(vararg elements: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'fromCurrent' @ [112:108] ==> value-parameter fromCurrent: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.overrideConflict[ValueParameterDescriptorImpl]

'fromSuper' @ [112:121] ==> value-parameter fromSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.overrideConflict[ValueParameterDescriptorImpl]

'reportOnDeclarationAs' @ [116:17] ==> public inline fun <reified T : KtDeclaration> reportOnDeclarationAs(trace: BindingTrace, descriptor: DeclarationDescriptor, what: (KtClassOrObject) -> Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : KtDeclaration> -> KtClassOrObject

'trace' @ [116:56] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'thisDescriptor' @ [116:63] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'CONFLICTING_INHERITED_MEMBERS' @ [117:28] ==> public final val CONFLICTING_INHERITED_MEMBERS: (DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>..DiagnosticFactory2<(KtClassOrObject..KtClassOrObject?), (ClassDescriptor..ClassDescriptor?), (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [117:58] ==> @NotNull public open fun on(@NotNull element: KtClassOrObject, @NotNull a: ClassDescriptor, @NotNull b: (MutableCollection<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): ParametrizedDiagnostic<(KtClassOrObject..KtClassOrObject?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'ktClassOrObject' @ [117:61] ==> value-parameter ktClassOrObject: KtClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.inheritanceConflict.<anonymous>[ValueParameterDescriptorImpl]

'thisDescriptor' @ [117:78] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'listOf' @ [117:94] ==> public fun <T> listOf(vararg elements: CallableMemberDescriptor): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'first' @ [117:101] ==> value-parameter first: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.inheritanceConflict[ValueParameterDescriptorImpl]

'second' @ [117:108] ==> value-parameter second: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides.<no name provided>.inheritanceConflict[ValueParameterDescriptorImpl]

'OverrideResolver' @ [121:9] ==> public companion object defined in org.jetbrains.kotlin.resolve.OverrideResolver[FakeCallableDescriptorForObject]

'resolveUnknownVisibilities' @ [121:26] ==> public final fun resolveUnknownVisibilities(descriptors: Collection<CallableMemberDescriptor>, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'result' @ [121:53] ==> value-parameter result: MutableCollection<D> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateFakeOverrides[ValueParameterDescriptorImpl]

'trace' @ [121:61] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'super' @ [126:25] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[LazyClassReceiverParameterDescriptor]

'getContributedFunctions' @ [126:31] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [126:55] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'location' @ [126:61] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'resolveUnknownVisibilitiesForMembers' @ [127:9] ==> private final fun resolveUnknownVisibilitiesForMembers(descriptors: Collection<CallableMemberDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'functions' @ [127:46] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions[LocalVariableDescriptor]

'functions' @ [128:16] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedFunctions[LocalVariableDescriptor]

'generateSyntheticCompanionObject' @ [132:9] ==> private final fun generateSyntheticCompanionObject(name: Name, result: MutableSet<ClassDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [132:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredClasses[ValueParameterDescriptorImpl]

'result' @ [132:48] ==> value-parameter result: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredClasses[ValueParameterDescriptorImpl]

'c' @ [133:9] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [133:11] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'generateSyntheticClasses' @ [133:37] ==> public open fun generateSyntheticClasses(thisDescriptor: ClassDescriptor, name: Name, ctx: LazyClassContext, declarationProvider: ClassMemberDeclarationProvider, result: MutableSet<ClassDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [133:62] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [133:78] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredClasses[ValueParameterDescriptorImpl]

'c' @ [133:84] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'declarationProvider' @ [133:87] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'result' @ [133:108] ==> value-parameter result: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredClasses[ValueParameterDescriptorImpl]

'FOR_ALREADY_TRACKED' @ [137:41] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'arrayListOf' @ [139:30] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<SimpleFunctionDescriptor> /* = ArrayList<SimpleFunctionDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'thisDescriptor' @ [140:27] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [140:42] ==> public final val ClassDescriptorWithResolutionScopes.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [140:58] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'fromSupertypes' @ [141:13] ==> val fromSupertypes: ArrayList<SimpleFunctionDescriptor> /* = ArrayList<SimpleFunctionDescriptor> */ defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'addAll' @ [141:28] ==> public open fun addAll(elements: Collection<SimpleFunctionDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'supertype' @ [141:35] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'memberScope' @ [141:45] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [141:57] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [141:81] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'location' @ [141:87] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'result' @ [143:9] ==> value-parameter result: MutableSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'addAll' @ [143:16] ==> public abstract fun addAll(elements: Collection<SimpleFunctionDescriptor>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'generateDelegatingDescriptors' @ [143:23] ==> private final fun <T : CallableMemberDescriptor> generateDelegatingDescriptors(name: Name, extractor: LazyClassMemberScope.MemberExtractor<SimpleFunctionDescriptor>, existingDescriptors: Collection<CallableDescriptor>): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> SimpleFunctionDescriptor

'name' @ [143:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'EXTRACT_FUNCTIONS' @ [143:59] ==> private final val EXTRACT_FUNCTIONS: LazyClassMemberScope.MemberExtractor<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion[PropertyDescriptorImpl]

'result' @ [143:78] ==> value-parameter result: MutableSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'generateDataClassMethods' @ [144:9] ==> private final fun generateDataClassMethods(result: MutableCollection<SimpleFunctionDescriptor>, name: Name, location: LookupLocation, fromSupertypes: List<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [144:34] ==> value-parameter result: MutableSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'name' @ [144:42] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'location' @ [144:48] ==> val location: NoLookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'fromSupertypes' @ [144:58] ==> val fromSupertypes: ArrayList<SimpleFunctionDescriptor> /* = ArrayList<SimpleFunctionDescriptor> */ defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'c' @ [145:9] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [145:11] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'generateSyntheticMethods' @ [145:37] ==> public open fun generateSyntheticMethods(thisDescriptor: ClassDescriptor, name: Name, fromSupertypes: List<SimpleFunctionDescriptor>, result: MutableCollection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [145:62] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [145:78] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'fromSupertypes' @ [145:84] ==> val fromSupertypes: ArrayList<SimpleFunctionDescriptor> /* = ArrayList<SimpleFunctionDescriptor> */ defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'result' @ [145:100] ==> value-parameter result: MutableSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'generateFakeOverrides' @ [146:9] ==> private final fun <D : CallableMemberDescriptor> generateFakeOverrides(name: Name, fromSupertypes: Collection<SimpleFunctionDescriptor>, result: MutableCollection<SimpleFunctionDescriptor>, exactDescriptorClass: Class<out SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> SimpleFunctionDescriptor

'name' @ [146:31] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'fromSupertypes' @ [146:37] ==> val fromSupertypes: ArrayList<SimpleFunctionDescriptor> /* = ArrayList<SimpleFunctionDescriptor> */ defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[LocalVariableDescriptor]

'result' @ [146:53] ==> value-parameter result: MutableSet<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredFunctions[ValueParameterDescriptorImpl]

'java' @ [146:93] ==> public val <T> KClass<SimpleFunctionDescriptor>.java: Class<SimpleFunctionDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'!' @ [155:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thisDescriptor' @ [155:14] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'isData' @ [155:29] ==> public final val ClassDescriptorWithResolutionScopes.isData: Boolean[MyPropertyDescriptor]

'getPrimaryConstructor' @ [157:27] ==> public final fun getPrimaryConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'declarationProvider' @ [158:44] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'primaryConstructorParameters' @ [158:64] ==> public open val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider[PropertyDescriptorImpl]

'assert' @ [160:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'constructor' @ [160:16] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'valueParameters' @ [160:28] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [160:44] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'primaryConstructorParameters' @ [160:52] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'size' @ [160:81] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'+' @ [160:89] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'constructor' @ [160:111] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'valueParameters' @ [160:123] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [160:139] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'primaryConstructorParameters' @ [160:166] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'size' @ [160:195] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'DataClassDescriptorResolver' @ [162:13] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'isComponentLike' @ [162:41] ==> public final fun isComponentLike(name: Name): Boolean defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'name' @ [162:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'constructor' @ [165:31] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'valueParameters' @ [165:43] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'!' @ [166:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'primaryConstructorParameters' @ [166:22] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'get' @ [166:51] ==> public abstract operator fun get(index: Int): KtParameter defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'parameter' @ [166:55] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'index' @ [166:65] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'hasValOrVar' @ [166:72] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'getContributedVariables' @ [168:34] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'parameter' @ [168:58] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'name' @ [168:68] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'location' @ [168:74] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'properties' @ [169:21] ==> val properties: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'isEmpty' @ [169:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'properties' @ [171:32] ==> val properties: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'iterator' @ [171:43] ==> public abstract fun iterator(): Iterator<PropertyDescriptor> defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'next' @ [171:54] ==> public abstract operator fun next(): PropertyDescriptor defined in kotlin.collections.Iterator[DeserializedSimpleFunctionDescriptor]

'++' @ [173:17] ==> public final operator fun inc(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'componentIndex' @ [173:19] ==> var componentIndex: Int defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'name' @ [175:21] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [175:29] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createComponentName' @ [175:57] ==> public final fun createComponentName(index: Int): Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'componentIndex' @ [175:77] ==> var componentIndex: Int defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'result' @ [176:21] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'add' @ [176:28] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [176:32] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createComponentFunctionDescriptor' @ [176:60] ==> public final fun createComponentFunctionDescriptor(parameterIndex: Int, property: PropertyDescriptor, parameter: ValueParameterDescriptor, classDescriptor: ClassDescriptor, trace: BindingTrace): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'componentIndex' @ [177:29] ==> var componentIndex: Int defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'property' @ [177:45] ==> val property: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'parameter' @ [177:55] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'thisDescriptor' @ [177:66] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'trace' @ [177:82] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [184:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [184:21] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'COPY_METHOD_NAME' @ [184:49] ==> public final val COPY_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[PropertyDescriptorImpl]

'constructor' @ [185:31] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'valueParameters' @ [185:43] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getContributedVariables' @ [187:17] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'parameter' @ [187:41] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'name' @ [187:51] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'location' @ [187:57] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'result' @ [190:13] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'add' @ [190:20] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [190:24] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createCopyFunctionDescriptor' @ [190:52] ==> public final fun createCopyFunctionDescriptor(constructorParameters: Collection<ValueParameterDescriptor>, classDescriptor: ClassDescriptor, trace: BindingTrace): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'constructor' @ [190:81] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[LocalVariableDescriptor]

'valueParameters' @ [190:93] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'thisDescriptor' @ [190:110] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'trace' @ [190:126] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'c' @ [193:13] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'languageVersionSettings' @ [193:15] ==> public abstract val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'supportsFeature' @ [193:39] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [193:55] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DataClassInheritance' @ [193:71] ==> enum entry DataClassInheritance defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'result' @ [196:24] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'none' @ [196:31] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.none(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'checkParameters' @ [196:36] ==> value-parameter checkParameters: (FunctionDescriptor) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.shouldAddFunctionFromAny[ValueParameterDescriptorImpl]

'fromSupertypes' @ [197:24] ==> value-parameter fromSupertypes: List<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'none' @ [197:39] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.none(predicate: (SimpleFunctionDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'invoke' @ [197:46] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [197:62] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.shouldAddFunctionFromAny.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [197:69] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.shouldAddFunctionFromAny.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [197:72] ==> public final val SimpleFunctionDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [197:84] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [197:93] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'name' @ [200:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [200:25] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'EQUALS_METHOD_NAME' @ [200:53] ==> public final val EQUALS_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[PropertyDescriptorImpl]

'shouldAddFunctionFromAny' @ [200:75] ==> local final fun shouldAddFunctionFromAny(checkParameters: (FunctionDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[SimpleFunctionDescriptorImpl]

'function' @ [201:34] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [201:43] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameters' @ [202:17] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.<anonymous>[LocalVariableDescriptor]

'size' @ [202:28] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'isNullableAny' @ [202:56] ==> public open fun isNullableAny(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'parameters' @ [202:70] ==> val parameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.<anonymous>[LocalVariableDescriptor]

'first' @ [202:81] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.first(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'type' @ [202:89] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'result' @ [204:17] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'add' @ [204:24] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [204:28] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createEqualsFunctionDescriptor' @ [204:56] ==> public final fun createEqualsFunctionDescriptor(classDescriptor: ClassDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [204:87] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [207:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [207:25] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'HASH_CODE_METHOD_NAME' @ [207:53] ==> public final val HASH_CODE_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[PropertyDescriptorImpl]

'shouldAddFunctionFromAny' @ [207:78] ==> local final fun shouldAddFunctionFromAny(checkParameters: (FunctionDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[SimpleFunctionDescriptorImpl]

'it' @ [207:105] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [207:108] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [207:124] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'result' @ [208:17] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'add' @ [208:24] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [208:28] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createHashCodeFunctionDescriptor' @ [208:56] ==> public final fun createHashCodeFunctionDescriptor(classDescriptor: ClassDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [208:89] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [211:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'DataClassDescriptorResolver' @ [211:25] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'TO_STRING_METHOD_NAME' @ [211:53] ==> public final val TO_STRING_METHOD_NAME: Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[PropertyDescriptorImpl]

'shouldAddFunctionFromAny' @ [211:78] ==> local final fun shouldAddFunctionFromAny(checkParameters: (FunctionDescriptor) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[SimpleFunctionDescriptorImpl]

'it' @ [211:105] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [211:108] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'isEmpty' @ [211:124] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'result' @ [212:17] ==> value-parameter result: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDataClassMethods[ValueParameterDescriptorImpl]

'add' @ [212:24] ==> public abstract fun add(element: SimpleFunctionDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'DataClassDescriptorResolver' @ [212:28] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createToStringFunctionDescriptor' @ [212:56] ==> public final fun createToStringFunctionDescriptor(classDescriptor: ClassDescriptor): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [212:89] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'c' @ [218:38] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [218:40] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getSyntheticCompanionObjectNameIfNeeded' @ [218:66] ==> public open fun getSyntheticCompanionObjectNameIfNeeded(thisDescriptor: ClassDescriptor): Name? defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [218:106] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'getContributedClassifier' @ [219:26] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'syntheticCompanionName' @ [219:51] ==> val syntheticCompanionName: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticCompanionObject[LocalVariableDescriptor]

'location' @ [219:75] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticCompanionObject[ValueParameterDescriptorImpl]

'result' @ [220:9] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticCompanionObject[ValueParameterDescriptorImpl]

'add' @ [220:16] ==> public abstract fun add(element: DeclarationDescriptor): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [220:20] ==> val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticCompanionObject[LocalVariableDescriptor]

'result' @ [224:9] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticNestedClasses[ValueParameterDescriptorImpl]

'addAll' @ [224:16] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'c' @ [224:23] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [224:25] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getSyntheticNestedClassNames' @ [224:51] ==> public open fun getSyntheticNestedClassNames(thisDescriptor: ClassDescriptor): List<Name> defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [224:80] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'mapNotNull' @ [224:96] ==> public inline fun <T, R : Any> Iterable<Name>.mapNotNull(transform: (Name) -> ClassifierDescriptor?): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R : Any> -> ClassifierDescriptor

'getContributedClassifier' @ [224:109] ==> public open fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [224:134] ==> value-parameter it: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticNestedClasses.<anonymous>[ValueParameterDescriptorImpl]

'location' @ [224:138] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addSyntheticNestedClasses[ValueParameterDescriptorImpl]

'toList' @ [224:150] ==> public fun <T> Iterable<ClassifierDescriptor>.toList(): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'c' @ [228:38] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [228:40] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'getSyntheticCompanionObjectNameIfNeeded' @ [228:66] ==> public open fun getSyntheticCompanionObjectNameIfNeeded(thisDescriptor: ClassDescriptor): Name? defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [228:106] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [229:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject[ValueParameterDescriptorImpl]

'syntheticCompanionName' @ [229:21] ==> val syntheticCompanionName: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject[LocalVariableDescriptor]

'result' @ [229:47] ==> value-parameter result: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject[ValueParameterDescriptorImpl]

'none' @ [229:54] ==> public inline fun <T> Iterable<ClassDescriptor>.none(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'it' @ [229:61] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'isCompanionObject' @ [229:64] ==> public final val ClassDescriptor.isCompanionObject: Boolean[MyPropertyDescriptor]

'thisDescriptor' @ [231:45] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'companionObjectDescriptor' @ [231:60] ==> public final val ClassDescriptorWithResolutionScopes.companionObjectDescriptor: ClassDescriptorWithResolutionScopes?[MyPropertyDescriptor]

'result' @ [232:13] ==> value-parameter result: MutableSet<ClassDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject[ValueParameterDescriptorImpl]

'add' @ [232:20] ==> public abstract fun add(element: ClassDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'companionObjectDescriptor' @ [232:24] ==> val companionObjectDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateSyntheticCompanionObject[LocalVariableDescriptor]

'super' @ [238:26] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[LazyClassReceiverParameterDescriptor]

'getContributedVariables' @ [238:32] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.AbstractLazyMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [238:56] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'location' @ [238:62] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'resolveUnknownVisibilitiesForMembers' @ [239:9] ==> private final fun resolveUnknownVisibilitiesForMembers(descriptors: Collection<CallableMemberDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'properties' @ [239:46] ==> val properties: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedVariables[LocalVariableDescriptor]

'properties' @ [240:16] ==> val properties: Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getContributedVariables[LocalVariableDescriptor]

'descriptors' @ [244:28] ==> value-parameter descriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveUnknownVisibilitiesForMembers[ValueParameterDescriptorImpl]

'descriptor' @ [245:17] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveUnknownVisibilitiesForMembers[LocalVariableDescriptor]

'kind' @ [245:28] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'FAKE_OVERRIDE' @ [245:36] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'descriptor' @ [245:53] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveUnknownVisibilitiesForMembers[LocalVariableDescriptor]

'kind' @ [245:64] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DELEGATION' @ [245:72] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'resolveUnknownVisibilityForMember' @ [246:32] ==> public open fun resolveUnknownVisibilityForMember(@NotNull p0: CallableMemberDescriptor, @Nullable p1: (((CallableMemberDescriptor..CallableMemberDescriptor?)) -> (Unit..Unit?))?): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'descriptor' @ [246:66] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveUnknownVisibilitiesForMembers[LocalVariableDescriptor]

'OverrideResolver' @ [246:78] ==> public companion object defined in org.jetbrains.kotlin.resolve.OverrideResolver[FakeCallableDescriptorForObject]

'createCannotInferVisibilityReporter' @ [246:95] ==> public final fun createCannotInferVisibilityReporter(trace: BindingTrace): (CallableMemberDescriptor) -> Unit defined in org.jetbrains.kotlin.resolve.OverrideResolver.Companion[SimpleFunctionDescriptorImpl]

'trace' @ [246:131] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'VarianceCheckerCore' @ [248:13] ==> public constructor VarianceCheckerCore(context: BindingContext, diagnosticSink: DiagnosticSink, manualVariance: ManualVariance? = ...) defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[ClassConstructorDescriptorImpl]

'trace' @ [248:33] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'bindingContext' @ [248:39] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'DO_NOTHING' @ [248:70] ==> public final val DO_NOTHING: (DiagnosticSink..DiagnosticSink?) defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaPropertyDescriptor]

'recordPrivateToThisIfNeeded' @ [248:82] ==> public final fun recordPrivateToThisIfNeeded(descriptor: CallableMemberDescriptor): Unit defined in org.jetbrains.kotlin.resolve.VarianceCheckerCore[SimpleFunctionDescriptorImpl]

'descriptor' @ [248:110] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveUnknownVisibilitiesForMembers[LocalVariableDescriptor]

'createPropertiesFromPrimaryConstructorParameters' @ [253:9] ==> protected open fun createPropertiesFromPrimaryConstructorParameters(name: Name, result: MutableSet<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [253:58] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'result' @ [253:64] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'ArrayList' @ [256:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PropertyDescriptor

'thisDescriptor' @ [257:27] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [257:42] ==> public final val ClassDescriptorWithResolutionScopes.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [257:58] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'fromSupertypes' @ [258:13] ==> val fromSupertypes: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[LocalVariableDescriptor]

'addAll' @ [258:28] ==> public open fun addAll(elements: Collection<PropertyDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'supertype' @ [258:35] ==> val supertype: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[LocalVariableDescriptor]

'memberScope' @ [258:45] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedVariables' @ [258:57] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [258:81] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'FOR_ALREADY_TRACKED' @ [258:104] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'result' @ [260:9] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'addAll' @ [260:16] ==> public abstract fun addAll(elements: Collection<PropertyDescriptor>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'generateDelegatingDescriptors' @ [260:23] ==> private final fun <T : CallableMemberDescriptor> generateDelegatingDescriptors(name: Name, extractor: LazyClassMemberScope.MemberExtractor<PropertyDescriptor>, existingDescriptors: Collection<CallableDescriptor>): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> PropertyDescriptor

'name' @ [260:53] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'EXTRACT_PROPERTIES' @ [260:59] ==> private final val EXTRACT_PROPERTIES: LazyClassMemberScope.MemberExtractor<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion[PropertyDescriptorImpl]

'result' @ [260:79] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'c' @ [261:9] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'syntheticResolveExtension' @ [261:11] ==> public abstract val syntheticResolveExtension: SyntheticResolveExtension defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'generateSyntheticProperties' @ [261:37] ==> public open fun generateSyntheticProperties(thisDescriptor: ClassDescriptor, name: Name, fromSupertypes: ArrayList<PropertyDescriptor>, result: MutableSet<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.extensions.SyntheticResolveExtension[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [261:65] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [261:81] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'fromSupertypes' @ [261:87] ==> val fromSupertypes: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[LocalVariableDescriptor]

'result' @ [261:103] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'generateFakeOverrides' @ [262:9] ==> private final fun <D : CallableMemberDescriptor> generateFakeOverrides(name: Name, fromSupertypes: Collection<PropertyDescriptor>, result: MutableCollection<PropertyDescriptor>, exactDescriptorClass: Class<out PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableMemberDescriptor> -> PropertyDescriptor

'name' @ [262:31] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'fromSupertypes' @ [262:37] ==> val fromSupertypes: ArrayList<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[LocalVariableDescriptor]

'result' @ [262:53] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getNonDeclaredProperties[ValueParameterDescriptorImpl]

'java' @ [262:87] ==> public val <T> KClass<PropertyDescriptor>.java: Class<PropertyDescriptor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'getPrimaryConstructor' @ [268:34] ==> public final fun getPrimaryConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'primaryConstructor' @ [270:41] ==> val primaryConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'valueParameters' @ [270:60] ==> public final val ClassConstructorDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'declarationProvider' @ [271:44] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'primaryConstructorParameters' @ [271:64] ==> public open val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider[PropertyDescriptorImpl]

'assert' @ [272:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'valueParameterDescriptors' @ [272:16] ==> val valueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'size' @ [272:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'primaryConstructorParameters' @ [272:50] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'size' @ [272:79] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueParameterDescriptors' @ [273:33] ==> val valueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'size' @ [273:59] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'primaryConstructorParameters' @ [273:81] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'size' @ [273:110] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'valueParameterDescriptors' @ [276:42] ==> val valueParameterDescriptors: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'name' @ [277:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'valueParameterDescriptor' @ [277:25] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'name' @ [277:50] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'primaryConstructorParameters' @ [279:29] ==> val primaryConstructorParameters: List<KtParameter> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'get' @ [279:58] ==> public abstract operator fun get(index: Int): KtParameter defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'valueParameterDescriptor' @ [279:62] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'index' @ [279:87] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [280:17] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'hasValOrVar' @ [280:27] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'c' @ [281:42] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'descriptorResolver' @ [281:44] ==> public abstract val descriptorResolver: DescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolvePrimaryConstructorParameterToAProperty' @ [281:63] ==> @NotNull public open fun resolvePrimaryConstructorParameterToAProperty(@NotNull classDescriptor: ClassDescriptor, @NotNull valueParameter: ValueParameterDescriptor, @NotNull scope: LexicalScope, @NotNull parameter: KtParameter, trace: (BindingTrace..BindingTrace?)): PropertyDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'thisDescriptor' @ [283:25] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'valueParameterDescriptor' @ [283:41] ==> val valueParameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'thisDescriptor' @ [283:67] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForConstructorHeaderResolution' @ [283:82] ==> public final val ClassDescriptorWithResolutionScopes.scopeForConstructorHeaderResolution: LexicalScope[MyPropertyDescriptor]

'parameter' @ [283:119] ==> val parameter: KtParameter defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'trace' @ [283:130] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'result' @ [284:17] ==> value-parameter result: MutableSet<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[ValueParameterDescriptorImpl]

'add' @ [284:24] ==> public abstract fun add(element: PropertyDescriptor): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'propertyDescriptor' @ [284:28] ==> val propertyDescriptor: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.createPropertiesFromPrimaryConstructorParameters[LocalVariableDescriptor]

'declarationProvider' @ [290:29] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'correspondingClassOrObject' @ [290:49] ==> public open val correspondingClassOrObject: KtPureClassOrObject? defined in org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider[PropertyDescriptorImpl]

'setOf' @ [290:86] ==> @InlineOnly public inline fun <T> setOf(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'c' @ [294:21] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'typeResolver' @ [294:23] ==> public abstract val typeResolver: TypeResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolveType' @ [294:36] ==> public final fun resolveType(scope: LexicalScope, typeReference: KtTypeReference, trace: BindingTrace, checkBounds: Boolean): KotlinType defined in org.jetbrains.kotlin.resolve.TypeResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [294:48] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForClassHeaderResolution' @ [294:63] ==> public final val ClassDescriptorWithResolutionScopes.scopeForClassHeaderResolution: LexicalScope[MyPropertyDescriptor]

'reference' @ [294:94] ==> value-parameter reference: KtTypeReference defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors.<no name provided>.resolve[ValueParameterDescriptorImpl]

'trace' @ [294:105] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'extractor' @ [298:21] ==> value-parameter extractor: LazyClassMemberScope.MemberExtractor<T> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[ValueParameterDescriptorImpl]

'extract' @ [298:31] ==> public abstract fun extract(extractFrom: KotlinType, name: Name): Collection<T> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.MemberExtractor[SimpleFunctionDescriptorImpl]

'type' @ [298:39] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors.<no name provided>.getMembersByType[ValueParameterDescriptorImpl]

'name' @ [298:45] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[ValueParameterDescriptorImpl]

'DelegationResolver' @ [300:16] ==> public companion object defined in org.jetbrains.kotlin.resolve.DelegationResolver[FakeCallableDescriptorForObject]

'generateDelegatedMembers' @ [300:35] ==> public final fun <T : CallableMemberDescriptor> generateDelegatedMembers(classOrObject: KtPureClassOrObject, ownerDescriptor: ClassDescriptor, existingMembers: Collection<CallableDescriptor>, trace: BindingTrace, memberExtractor: DelegationResolver.MemberExtractor<T>, typeResolver: DelegationResolver.TypeResolver, delegationFilter: DelegationFilter, languageVersionSettings: LanguageVersionSettings): Collection<T> defined in org.jetbrains.kotlin.resolve.DelegationResolver.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : CallableMemberDescriptor> -> T

'classOrObject' @ [301:17] ==> val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[LocalVariableDescriptor]

'thisDescriptor' @ [301:32] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'existingDescriptors' @ [301:48] ==> value-parameter existingDescriptors: Collection<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[ValueParameterDescriptorImpl]

'trace' @ [301:69] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'lazyMemberExtractor' @ [301:76] ==> val lazyMemberExtractor: <no name provided><T> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[LocalVariableDescriptor]

'lazyTypeResolver' @ [302:17] ==> val lazyTypeResolver: <no name provided><T> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.generateDelegatingDescriptors[LocalVariableDescriptor]

'c' @ [302:35] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'delegationFilter' @ [302:37] ==> public abstract val delegationFilter: DelegationFilter defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'c' @ [302:55] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'languageVersionSettings' @ [302:57] ==> public abstract val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'!' @ [307:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thisDescriptor' @ [307:14] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'isData' @ [307:29] ==> public final val ClassDescriptorWithResolutionScopes.isData: Boolean[MyPropertyDescriptor]

'getPrimaryConstructor' @ [309:13] ==> public final fun getPrimaryConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'DataClassDescriptorResolver' @ [314:33] ==> public object DataClassDescriptorResolver defined in org.jetbrains.kotlin.resolve in file DataClassDescriptorResolver.kt[FakeCallableDescriptorForObject]

'createComponentName' @ [314:61] ==> public final fun createComponentName(index: Int): Name defined in org.jetbrains.kotlin.resolve.DataClassDescriptorResolver[SimpleFunctionDescriptorImpl]

'n' @ [314:81] ==> var n: Int defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[LocalVariableDescriptor]

'getContributedFunctions' @ [315:29] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'componentName' @ [315:53] ==> val componentName: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[LocalVariableDescriptor]

'location' @ [315:68] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[ValueParameterDescriptorImpl]

'functions' @ [316:17] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[LocalVariableDescriptor]

'isEmpty' @ [316:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'result' @ [318:13] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[ValueParameterDescriptorImpl]

'addAll' @ [318:20] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'functions' @ [318:27] ==> val functions: Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[LocalVariableDescriptor]

'n' @ [320:13] ==> var n: Int defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[LocalVariableDescriptor]

'result' @ [322:9] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[ValueParameterDescriptorImpl]

'addAll' @ [322:16] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'getContributedFunctions' @ [322:23] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'identifier' @ [322:52] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'location' @ [322:72] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.addDataClassMethods[ValueParameterDescriptorImpl]

'c' @ [326:15] ==> value-parameter c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.<init>[ValueParameterDescriptorImpl]

'storageManager' @ [326:17] ==> public abstract val storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'createLazyValue' @ [326:32] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Collection<ClassConstructorDescriptor>): NotNullLazyValue<Collection<ClassConstructorDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<ClassConstructorDescriptor>

'resolveSecondaryConstructors' @ [326:50] ==> private final fun resolveSecondaryConstructors(): Collection<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'invoke' @ [329:22] ==> public abstract fun invoke(): Collection<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'getPrimaryConstructor' @ [330:34] ==> public final fun getPrimaryConstructor(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'if (primaryConstructor == null) result else result + primaryConstructor' @ [331:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<ClassConstructorDescriptor>, elseBranch: Collection<ClassConstructorDescriptor>): Collection<ClassConstructorDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<ClassConstructorDescriptor>

'primaryConstructor' @ [331:20] ==> val primaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getConstructors[LocalVariableDescriptor]

'result' @ [331:48] ==> val result: Collection<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getConstructors[LocalVariableDescriptor]

'result' @ [331:60] ==> val result: Collection<ClassConstructorDescriptor> defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getConstructors[LocalVariableDescriptor]

'primaryConstructor' @ [331:69] ==> val primaryConstructor: ClassConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.getConstructors[LocalVariableDescriptor]

'invoke' @ [334:64] ==> public abstract fun invoke(): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.storage.NullableLazyValue[FunctionInvokeDescriptor]

'declarationProvider' @ [337:29] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'correspondingClassOrObject' @ [337:49] ==> public open val correspondingClassOrObject: KtPureClassOrObject? defined in org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider[PropertyDescriptorImpl]

'classOrObject' @ [339:37] ==> val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'hasExplicitPrimaryConstructor' @ [339:51] ==> public abstract fun hasExplicitPrimaryConstructor(): Boolean defined in org.jetbrains.kotlin.psi.KtPureClassOrObject[JavaMethodDescriptor]

'!' @ [340:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasPrimaryConstructor' @ [340:14] ==> val hasPrimaryConstructor: Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'when (thisDescriptor.kind) {
                ClassKind.INTERFACE -> return null
                ClassKind.OBJECT, ClassKind.ENUM_CLASS -> if (thisDescriptor.isHeader) return null
                else -> {}
            }' @ [341:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'thisDescriptor' @ [341:19] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'kind' @ [341:34] ==> public final val ClassDescriptorWithResolutionScopes.kind: ClassKind[MyPropertyDescriptor]

'INTERFACE' @ [342:27] ==> enum entry INTERFACE defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'OBJECT' @ [343:27] ==> enum entry OBJECT defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'ENUM_CLASS' @ [343:45] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'thisDescriptor' @ [343:63] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'isHeader' @ [343:78] ==> public final val ClassDescriptorWithResolutionScopes.isHeader: Boolean[MyPropertyDescriptor]

'canHaveDeclaredConstructors' @ [348:29] ==> public open fun canHaveDeclaredConstructors(@NotNull p0: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'thisDescriptor' @ [348:57] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'hasPrimaryConstructor' @ [348:76] ==> val hasPrimaryConstructor: Boolean defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'c' @ [349:31] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'functionDescriptorResolver' @ [349:33] ==> public abstract val functionDescriptorResolver: FunctionDescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolvePrimaryConstructorDescriptor' @ [349:60] ==> public final fun resolvePrimaryConstructorDescriptor(scope: LexicalScope, classDescriptor: ClassDescriptor, classElement: KtPureClassOrObject, trace: BindingTrace): ClassConstructorDescriptorImpl? defined in org.jetbrains.kotlin.resolve.FunctionDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [350:21] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForConstructorHeaderResolution' @ [350:36] ==> public final val ClassDescriptorWithResolutionScopes.scopeForConstructorHeaderResolution: LexicalScope[MyPropertyDescriptor]

'thisDescriptor' @ [350:73] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'classOrObject' @ [350:89] ==> val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'trace' @ [350:104] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'constructor' @ [351:13] ==> val constructor: ClassConstructorDescriptorImpl? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'setDeferredReturnType' @ [352:13] ==> protected final fun setDeferredReturnType(descriptor: ClassConstructorDescriptorImpl): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'constructor' @ [352:35] ==> val constructor: ClassConstructorDescriptorImpl? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'constructor' @ [353:20] ==> val constructor: ClassConstructorDescriptorImpl? defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'createAndRecordPrimaryConstructorForObject' @ [356:46] ==> @NotNull public open fun createAndRecordPrimaryConstructorForObject(@Nullable `object`: KtPureClassOrObject?, @NotNull classDescriptor: ClassDescriptor, @NotNull trace: BindingTrace): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'classOrObject' @ [356:89] ==> val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'thisDescriptor' @ [356:104] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'trace' @ [356:120] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'setDeferredReturnType' @ [357:9] ==> protected final fun setDeferredReturnType(descriptor: ClassConstructorDescriptorImpl): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'constructor' @ [357:31] ==> val constructor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'constructor' @ [358:16] ==> val constructor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolvePrimaryConstructor[LocalVariableDescriptor]

'declarationProvider' @ [362:29] ==> protected final val declarationProvider: ClassMemberDeclarationProvider defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'correspondingClassOrObject' @ [362:49] ==> public open val correspondingClassOrObject: KtPureClassOrObject? defined in org.jetbrains.kotlin.resolve.lazy.declarations.ClassMemberDeclarationProvider[PropertyDescriptorImpl]

'emptyList' @ [362:86] ==> public fun <T> emptyList(): List<ClassConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassConstructorDescriptor

'classOrObject' @ [364:16] ==> val classOrObject: KtPureClassOrObject defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveSecondaryConstructors[LocalVariableDescriptor]

'secondaryConstructors' @ [364:30] ==> public final val KtPureClassOrObject.secondaryConstructors: List<(KtSecondaryConstructor..KtSecondaryConstructor?)>[MyPropertyDescriptor]

'map' @ [364:52] ==> public inline fun <T, R> Iterable<(KtSecondaryConstructor..KtSecondaryConstructor?)>.map(transform: ((KtSecondaryConstructor..KtSecondaryConstructor?)) -> ClassConstructorDescriptorImpl): List<ClassConstructorDescriptorImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtSecondaryConstructor..org.jetbrains.kotlin.psi.KtSecondaryConstructor?)
    <R> -> ClassConstructorDescriptorImpl

'c' @ [365:30] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'functionDescriptorResolver' @ [365:32] ==> public abstract val functionDescriptorResolver: FunctionDescriptorResolver defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'resolveSecondaryConstructorDescriptor' @ [365:59] ==> public final fun resolveSecondaryConstructorDescriptor(scope: LexicalScope, classDescriptor: ClassDescriptor, constructor: KtSecondaryConstructor, trace: BindingTrace): ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.FunctionDescriptorResolver[SimpleFunctionDescriptorImpl]

'thisDescriptor' @ [366:21] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'scopeForConstructorHeaderResolution' @ [366:36] ==> public final val ClassDescriptorWithResolutionScopes.scopeForConstructorHeaderResolution: LexicalScope[MyPropertyDescriptor]

'thisDescriptor' @ [366:73] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'constructor' @ [366:89] ==> value-parameter constructor: (KtSecondaryConstructor..KtSecondaryConstructor?) defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveSecondaryConstructors.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [366:102] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'setDeferredReturnType' @ [368:13] ==> protected final fun setDeferredReturnType(descriptor: ClassConstructorDescriptorImpl): Unit defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[SimpleFunctionDescriptorImpl]

'descriptor' @ [368:35] ==> val descriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveSecondaryConstructors.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [369:13] ==> val descriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.resolveSecondaryConstructors.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [374:9] ==> value-parameter descriptor: ClassConstructorDescriptorImpl defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.setDeferredReturnType[ValueParameterDescriptorImpl]

'returnType' @ [374:20] ==> public final var ClassConstructorDescriptorImpl.returnType: KotlinType[MyPropertyDescriptor]

'c' @ [374:33] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'wrappedTypeFactory' @ [374:35] ==> public abstract val wrappedTypeFactory: WrappedTypeFactory defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'createDeferredType' @ [374:54] ==> public open fun createDeferredType(trace: BindingTrace, computation: () -> KotlinType): KotlinType defined in org.jetbrains.kotlin.types.WrappedTypeFactory[SimpleFunctionDescriptorImpl]

'trace' @ [374:73] ==> protected final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'thisDescriptor' @ [374:82] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'defaultType' @ [374:97] ==> public final val ClassDescriptorWithResolutionScopes.defaultType: SimpleType[MyPropertyDescriptor]

'c' @ [378:9] ==> protected final val c: LazyClassContext defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'lookupTracker' @ [378:11] ==> public abstract val lookupTracker: LookupTracker defined in org.jetbrains.kotlin.resolve.lazy.LazyClassContext[PropertyDescriptorImpl]

'record' @ [378:25] ==> public fun LookupTracker.record(from: LookupLocation, scopeOwner: ClassDescriptor, name: Name): Unit defined in org.jetbrains.kotlin.incremental[DeserializedSimpleFunctionDescriptor]

'from' @ [378:32] ==> value-parameter from: LookupLocation defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.recordLookup[ValueParameterDescriptorImpl]

'thisDescriptor' @ [378:38] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [378:54] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.recordLookup[ValueParameterDescriptorImpl]

'thisDescriptor' @ [382:55] ==> protected final val thisDescriptor: ClassDescriptorWithResolutionScopes defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope[PropertyDescriptorImpl]

'name' @ [382:70] ==> public final val ClassDescriptorWithResolutionScopes.name: Name[MyPropertyDescriptor]

'extractFrom' @ [387:24] ==> value-parameter extractFrom: KotlinType defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion.EXTRACT_FUNCTIONS.<no name provided>.extract[ValueParameterDescriptorImpl]

'memberScope' @ [387:36] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [387:48] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [387:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion.EXTRACT_FUNCTIONS.<no name provided>.extract[ValueParameterDescriptorImpl]

'FOR_ALREADY_TRACKED' @ [387:95] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'extractFrom' @ [393:24] ==> value-parameter extractFrom: KotlinType defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion.EXTRACT_PROPERTIES.<no name provided>.extract[ValueParameterDescriptorImpl]

'memberScope' @ [393:36] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedVariables' @ [393:48] ==> public abstract fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [393:72] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.lazy.descriptors.LazyClassMemberScope.Companion.EXTRACT_PROPERTIES.<no name provided>.extract[ValueParameterDescriptorImpl]

'FOR_ALREADY_TRACKED' @ [393:95] ==> enum entry FOR_ALREADY_TRACKED defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

