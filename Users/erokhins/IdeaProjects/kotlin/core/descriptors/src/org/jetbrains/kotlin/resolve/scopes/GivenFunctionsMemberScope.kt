'MemberScopeImpl' @ [36:5] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[ClassConstructorDescriptorImpl]

'storageManager' @ [37:35] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [37:50] ==> public abstract fun <T : Any> createLazyValue(computable: () -> List<DeclarationDescriptor>): NotNullLazyValue<List<DeclarationDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> List<DeclarationDescriptor>

'computeDeclaredFunctions' @ [38:27] ==> protected abstract fun computeDeclaredFunctions(): List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[SimpleFunctionDescriptorImpl]

'fromCurrent' @ [39:9] ==> val fromCurrent: List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.allDescriptors.<anonymous>[LocalVariableDescriptor]

'createFakeOverrides' @ [39:23] ==> private final fun createFakeOverrides(functionsFromCurrent: List<FunctionDescriptor>): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[SimpleFunctionDescriptorImpl]

'fromCurrent' @ [39:43] ==> val fromCurrent: List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.allDescriptors.<anonymous>[LocalVariableDescriptor]

'!' @ [45:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kindFilter' @ [45:14] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.getContributedDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [45:25] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[SimpleFunctionDescriptorImpl]

'CALLABLES' @ [45:59] ==> @JvmField public final val CALLABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[PropertyDescriptorImpl]

'kindMask' @ [45:69] ==> public final val kindMask: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[PropertyDescriptorImpl]

'listOf' @ [45:87] ==> @InlineOnly public inline fun <T> listOf(): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'allDescriptors' @ [46:16] ==> private final val allDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'allDescriptors' @ [50:16] ==> private final val allDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'filterIsInstance' @ [50:31] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SimpleFunctionDescriptor

'filter' @ [50:76] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.filter(predicate: (SimpleFunctionDescriptor) -> Boolean): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [50:85] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.getContributedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [50:88] ==> public final val SimpleFunctionDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [50:96] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'allDescriptors' @ [54:16] ==> private final val allDescriptors: List<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'filterIsInstance' @ [54:31] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> PropertyDescriptor

'filter' @ [54:70] ==> public inline fun <T> Iterable<PropertyDescriptor>.filter(predicate: (PropertyDescriptor) -> Boolean): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'it' @ [54:79] ==> value-parameter it: PropertyDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.getContributedVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [54:82] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [54:90] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'ArrayList' @ [58:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'containingClass' @ [59:35] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'typeConstructor' @ [59:51] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'supertypes' @ [59:67] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'flatMap' @ [60:18] ==> public inline fun <T, R> Iterable<(KotlinType..KotlinType?)>.flatMap(transform: ((KotlinType..KotlinType?)) -> Iterable<DeclarationDescriptor>): List<DeclarationDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R> -> DeclarationDescriptor

'it' @ [60:28] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [60:31] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'getContributedDescriptors' @ [60:43] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[SimpleFunctionDescriptorImpl]

'filterIsInstance' @ [61:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> CallableMemberDescriptor

'component1' @ [62:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Name, List<CallableMemberDescriptor>>.component1(): Name defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<CallableMemberDescriptor>

'component2' @ [62:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Name, List<CallableMemberDescriptor>>.component2(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<CallableMemberDescriptor>

'allSuperDescriptors' @ [62:31] ==> val allSuperDescriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'groupBy' @ [62:51] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> Name): Map<Name, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Name

'it' @ [62:61] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [62:64] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'component1' @ [63:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Boolean, List<CallableMemberDescriptor>>.component1(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Boolean
    <V> -> List<CallableMemberDescriptor>

'component2' @ [63:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Boolean, List<CallableMemberDescriptor>>.component2(): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Boolean
    <V> -> List<CallableMemberDescriptor>

'group' @ [63:47] ==> val group: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'groupBy' @ [63:53] ==> public inline fun <T, K> Iterable<CallableMemberDescriptor>.groupBy(keySelector: (CallableMemberDescriptor) -> Boolean): Map<Boolean, List<CallableMemberDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <K> -> Boolean

'it' @ [63:63] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'generateOverridesInFunctionGroup' @ [64:32] ==> public open fun generateOverridesInFunctionGroup(@SuppressWarnings @NotNull name: Name, @NotNull membersFromSupertypes: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull membersFromCurrent: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>), @NotNull current: ClassDescriptor, @NotNull strategy: OverridingStrategy): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'name' @ [65:25] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'descriptors' @ [66:55] ==> val descriptors: List<CallableMemberDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'if (isFunction) functionsFromCurrent.filter { it.name == name } else listOf()' @ [67:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<(CallableMemberDescriptor..CallableMemberDescriptor?)>, elseBranch: List<(CallableMemberDescriptor..CallableMemberDescriptor?)>): List<(CallableMemberDescriptor..CallableMemberDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>

'isFunction' @ [67:56] ==> val isFunction: Boolean defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'functionsFromCurrent' @ [67:68] ==> value-parameter functionsFromCurrent: List<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[ValueParameterDescriptorImpl]

'filter' @ [67:89] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [67:98] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [67:101] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [67:109] ==> val name: Name defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'listOf' @ [67:121] ==> @InlineOnly public inline fun <T> listOf(): List<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'containingClass' @ [68:25] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'NonReportingOverrideStrategy' @ [69:34] ==> public constructor NonReportingOverrideStrategy() defined in org.jetbrains.kotlin.resolve.NonReportingOverrideStrategy[ClassConstructorDescriptorImpl]

'resolveUnknownVisibilityForMember' @ [71:48] ==> public open fun resolveUnknownVisibilityForMember(@NotNull memberDescriptor: CallableMemberDescriptor, @Nullable cannotInferVisibility: (((CallableMemberDescriptor..CallableMemberDescriptor?)) -> (Unit..Unit?))?): Unit defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'fakeOverride' @ [71:82] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'result' @ [72:33] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'add' @ [72:40] ==> public open fun add(element: DeclarationDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'fakeOverride' @ [72:44] ==> value-parameter fakeOverride: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<no name provided>.addFakeOverride[ValueParameterDescriptorImpl]

'error' @ [76:33] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'containingClass' @ [76:62] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

'fromSuper' @ [76:80] ==> value-parameter fromSuper: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<no name provided>.conflict[ValueParameterDescriptorImpl]

'fromCurrent' @ [76:94] ==> value-parameter fromCurrent: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides.<no name provided>.conflict[ValueParameterDescriptorImpl]

'result' @ [83:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.createFakeOverrides[LocalVariableDescriptor]

'compact' @ [83:23] ==> public fun <T> ArrayList<DeclarationDescriptor>.compact(): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.utils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> DeclarationDescriptor

'p' @ [87:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [87:11] ==> @NotNull public open fun println(vararg objects: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'containingClass' @ [87:37] ==> protected final val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.GivenFunctionsMemberScope[PropertyDescriptorImpl]

