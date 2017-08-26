'storageManager' @ [56:40] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [56:55] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (FunctionDescriptor) -> FunctionDescriptor?): MemoizedFunctionToNullable<FunctionDescriptor, FunctionDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FunctionDescriptor
    <V : Any> -> FunctionDescriptor

'extensionForFunctionNotCached' @ [57:9] ==> private final fun extensionForFunctionNotCached(function: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'function' @ [57:39] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunction.<anonymous>[ValueParameterDescriptorImpl]

'storageManager' @ [61:13] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunction' @ [61:28] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (JavaMethodDescriptor) -> SamAdapterDescriptor<JavaMethodDescriptor>): MemoizedFunctionToNotNull<JavaMethodDescriptor, SamAdapterDescriptor<JavaMethodDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaMethodDescriptor
    <V : Any> -> SamAdapterDescriptor<JavaMethodDescriptor>

'createSamAdapterFunction' @ [62:43] ==> @NotNull public open fun createSamAdapterFunction(@NotNull original: JavaMethodDescriptor, @NotNull samResolver: SamConversionResolver): SamAdapterDescriptor<(JavaMethodDescriptor..JavaMethodDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'function' @ [62:68] ==> value-parameter function: JavaMethodDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samAdapterForStaticFunction.<anonymous>[ValueParameterDescriptorImpl]

'samResolver' @ [62:78] ==> private final val samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'storageManager' @ [66:13] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunction' @ [66:28] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (JavaClassDescriptor) -> SamConstructorDescriptor): MemoizedFunctionToNotNull<JavaClassDescriptor, SamConstructorDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaClassDescriptor
    <V : Any> -> SamConstructorDescriptor

'createSamConstructorFunction' @ [67:43] ==> @NotNull public open fun createSamConstructorFunction(@NotNull owner: DeclarationDescriptor, @NotNull samInterface: JavaClassDescriptor, @NotNull samResolver: SamConversionResolver): SamConstructorDescriptor defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'classifier' @ [67:72] ==> value-parameter classifier: JavaClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samConstructorForClassifier.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [67:83] ==> public final val JavaClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classifier' @ [67:106] ==> value-parameter classifier: JavaClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samConstructorForClassifier.<anonymous>[ValueParameterDescriptorImpl]

'samResolver' @ [67:118] ==> private final val samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'storageManager' @ [71:13] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunction' @ [71:28] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (JavaClassConstructorDescriptor) -> ClassConstructorDescriptor): MemoizedFunctionToNotNull<JavaClassConstructorDescriptor, ClassConstructorDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaClassConstructorDescriptor
    <V : Any> -> ClassConstructorDescriptor

'createSamAdapterConstructor' @ [72:43] ==> @NotNull public open fun createSamAdapterConstructor(@NotNull original: JavaClassConstructorDescriptor, @NotNull samResolver: SamConversionResolver): SamAdapterDescriptor<(JavaClassConstructorDescriptor..JavaClassConstructorDescriptor?)> defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'constructor' @ [72:71] ==> value-parameter constructor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samConstructorForJavaConstructor.<anonymous>[ValueParameterDescriptorImpl]

'samResolver' @ [72:84] ==> private final val samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'storageManager' @ [76:13] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [76:28] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (Pair<ClassConstructorDescriptor, TypeAliasDescriptor>) -> TypeAliasConstructorDescriptor?): MemoizedFunctionToNullable<Pair<ClassConstructorDescriptor, TypeAliasDescriptor>, TypeAliasConstructorDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Pair<ClassConstructorDescriptor, TypeAliasDescriptor>
    <V : Any> -> TypeAliasConstructorDescriptor

'component1' @ [77:18] ==> public final operator fun component1(): ClassConstructorDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [77:31] ==> public final operator fun component2(): TypeAliasDescriptor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'TypeAliasConstructorDescriptorImpl' @ [78:17] ==> public companion object defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl[FakeCallableDescriptorForObject]

'createIfAvailable' @ [78:52] ==> public final fun createIfAvailable(storageManager: StorageManager, typeAliasDescriptor: TypeAliasDescriptor, constructor: ClassConstructorDescriptor): TypeAliasConstructorDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl.Companion[DeserializedSimpleFunctionDescriptor]

'storageManager' @ [78:70] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.<init>[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [78:86] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samConstructorForTypeAliasConstructor.<anonymous>[LocalVariableDescriptor]

'constructor' @ [78:107] ==> val constructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.samConstructorForTypeAliasConstructor.<anonymous>[LocalVariableDescriptor]

'!' @ [82:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [82:14] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'visibility' @ [82:23] ==> public final val FunctionDescriptor.visibility: Visibility[MyPropertyDescriptor]

'isVisibleOutside' @ [82:34] ==> public fun Visibility.isVisibleOutside(): Boolean defined in org.jetbrains.kotlin.synthetic[SimpleFunctionDescriptorImpl]

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'function' @ [83:14] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'hasJavaOriginInHierarchy' @ [83:23] ==> public fun FunctionDescriptor.hasJavaOriginInHierarchy(): Boolean defined in org.jetbrains.kotlin.synthetic in file syntheticExtensionsUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [84:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSamAdapterNecessary' @ [84:40] ==> public open fun isSamAdapterNecessary(@NotNull `fun`: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'function' @ [84:62] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'function' @ [85:13] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'returnType' @ [85:22] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'function' @ [86:13] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'isHiddenInResolution' @ [86:22] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [86:43] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'MyFunctionDescriptor' @ [87:16] ==> public companion object defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[FakeCallableDescriptorForObject]

'create' @ [87:37] ==> public final fun create(sourceFunction: FunctionDescriptor, samResolver: SamConversionResolver): SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion[SimpleFunctionDescriptorImpl]

'function' @ [87:44] ==> value-parameter function: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.extensionForFunctionNotCached[ValueParameterDescriptorImpl]

'samResolver' @ [87:54] ==> private final val samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'receiverTypes' @ [92:22] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[ValueParameterDescriptorImpl]

'type' @ [93:30] ==> val type: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'memberScope' @ [93:35] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [93:47] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [93:71] ==> value-parameter name: Name defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[ValueParameterDescriptorImpl]

'location' @ [93:77] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[ValueParameterDescriptorImpl]

'invoke' @ [94:33] ==> public abstract fun invoke(p1: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'function' @ [94:54] ==> val function: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'original' @ [94:63] ==> public final val SimpleFunctionDescriptor.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'substituteForReceiverType' @ [94:74] ==> private final fun FunctionDescriptor.substituteForReceiverType(receiverType: KotlinType): FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'type' @ [94:100] ==> val type: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'extension' @ [95:21] ==> val extension: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'result' @ [96:25] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'result' @ [97:25] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'SmartList' @ [97:34] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FunctionDescriptor

'result' @ [99:21] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'add' @ [99:28] ==> public open fun add(element: (FunctionDescriptor..FunctionDescriptor?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'extension' @ [99:32] ==> val extension: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'when {
            result == null -> emptyList()
            result.size > 1 -> result.toSet()
            else -> result
        }' @ [103:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<FunctionDescriptor>, entry1: Collection<FunctionDescriptor>, entry2: Collection<FunctionDescriptor>): Collection<FunctionDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<FunctionDescriptor>

'result' @ [104:13] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'emptyList' @ [104:31] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'result' @ [105:13] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'size' @ [105:20] ==> public open val size: Int defined in com.intellij.util.SmartList[JavaPropertyDescriptor]

'result' @ [105:32] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'toSet' @ [105:39] ==> public fun <T> Iterable<(FunctionDescriptor..FunctionDescriptor?)>.toSet(): Set<(FunctionDescriptor..FunctionDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'result' @ [106:21] ==> var result: SmartList<FunctionDescriptor>? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[LocalVariableDescriptor]

'containingDeclaration' @ [111:31] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'findCorrespondingSupertype' @ [112:38] ==> public fun findCorrespondingSupertype(subtype: KotlinType, supertype: KotlinType, typeCheckingProcedureCallbacks: TypeCheckingProcedureCallbacks = ...): KotlinType? defined in org.jetbrains.kotlin.types.checker[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [112:65] ==> value-parameter receiverType: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.substituteForReceiverType[ValueParameterDescriptorImpl]

'containingClass' @ [112:79] ==> val containingClass: ClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.substituteForReceiverType[LocalVariableDescriptor]

'defaultType' @ [112:95] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'substitute' @ [114:16] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'TypeConstructorSubstitution' @ [115:17] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [116:26] ==> @JvmStatic public final fun create(kotlinType: KotlinType): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'correspondingSupertype' @ [116:33] ==> val correspondingSupertype: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.substituteForReceiverType[LocalVariableDescriptor]

'wrapWithCapturingSubstitution' @ [117:26] ==> public fun TypeSubstitution.wrapWithCapturingSubstitution(needApproximation: Boolean = ...): TypeSubstitution defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'buildSubstitutor' @ [118:26] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedSimpleFunctionDescriptor]

'receiverTypes' @ [123:16] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions[ValueParameterDescriptorImpl]

'flatMapTo' @ [123:30] ==> public inline fun <T, R, C : MutableCollection<in FunctionDescriptor>> Iterable<KotlinType>.flatMapTo(destination: LinkedHashSet<FunctionDescriptor> /* = LinkedHashSet<FunctionDescriptor> */, transform: (KotlinType) -> Iterable<FunctionDescriptor>): LinkedHashSet<FunctionDescriptor> /* = LinkedHashSet<FunctionDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> FunctionDescriptor
    <C : MutableCollection<in R>> -> LinkedHashSet<FunctionDescriptor>

'LinkedHashSet' @ [123:40] ==> public final fun <E> <init>(): LinkedHashSet<FunctionDescriptor> /* = LinkedHashSet<FunctionDescriptor> */ defined in kotlin.collections.LinkedHashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> FunctionDescriptor

'type' @ [124:13] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions.<anonymous>[ValueParameterDescriptorImpl]

'memberScope' @ [124:18] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedDescriptors' @ [124:30] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [124:56] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS' @ [124:77] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [125:22] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'mapNotNull' @ [126:22] ==> public inline fun <T, R : Any> Iterable<FunctionDescriptor>.mapNotNull(transform: (FunctionDescriptor) -> FunctionDescriptor?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R : Any> -> FunctionDescriptor

'invoke' @ [127:25] ==> public abstract fun invoke(p1: FunctionDescriptor): FunctionDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'it' @ [127:46] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [127:49] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'substituteForReceiverType' @ [127:60] ==> private final fun FunctionDescriptor.substituteForReceiverType(receiverType: KotlinType): FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'type' @ [127:86] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticMemberFunctions.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [132:161] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'emptyList' @ [134:123] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'getSamFunctions' @ [137:16] ==> private final fun getSamFunctions(functions: Collection<DeclarationDescriptor>): List<SamAdapterDescriptor<JavaMethodDescriptor>> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'scope' @ [137:32] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticStaticFunctions[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [137:38] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [137:62] ==> value-parameter name: Name defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticStaticFunctions[ValueParameterDescriptorImpl]

'location' @ [137:68] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticStaticFunctions[ValueParameterDescriptorImpl]

'scope' @ [141:26] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors[ValueParameterDescriptorImpl]

'getContributedClassifier' @ [141:32] ==> public abstract fun getContributedClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'name' @ [141:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors[ValueParameterDescriptorImpl]

'location' @ [141:63] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors[ValueParameterDescriptorImpl]

'emptyList' @ [141:83] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'getAllSamConstructors' @ [142:16] ==> private final fun getAllSamConstructors(classifier: ClassifierDescriptor): List<FunctionDescriptor> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'classifier' @ [142:38] ==> val classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors[LocalVariableDescriptor]

'getSamFunctions' @ [146:16] ==> private final fun getSamFunctions(functions: Collection<DeclarationDescriptor>): List<SamAdapterDescriptor<JavaMethodDescriptor>> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'scope' @ [146:32] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticStaticFunctions[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [146:38] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [146:64] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'FUNCTIONS' @ [146:85] ==> @field:JvmField public final val FUNCTIONS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'scope' @ [150:16] ==> value-parameter scope: ResolutionScope defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors[ValueParameterDescriptorImpl]

'getContributedDescriptors' @ [150:22] ==> public abstract fun getContributedDescriptors(kindFilter: DescriptorKindFilter = ..., nameFilter: (Name) -> Boolean = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.ResolutionScope[DeserializedSimpleFunctionDescriptor]

'DescriptorKindFilter' @ [150:48] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'CLASSIFIERS' @ [150:69] ==> @field:JvmField public final val CLASSIFIERS: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'filterIsInstance' @ [151:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassifierDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassifierDescriptor

'flatMap' @ [152:18] ==> public inline fun <T, R> Iterable<ClassifierDescriptor>.flatMap(transform: (ClassifierDescriptor) -> Iterable<FunctionDescriptor>): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor
    <R> -> FunctionDescriptor

'getAllSamConstructors' @ [152:28] ==> private final fun getAllSamConstructors(classifier: ClassifierDescriptor): List<FunctionDescriptor> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'it' @ [152:50] ==> value-parameter it: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructors.<anonymous>[ValueParameterDescriptorImpl]

'when (constructor) {
            is JavaClassConstructorDescriptor -> createJavaSamAdapterConstructor(constructor)
            is TypeAliasConstructorDescriptor -> {
                val underlyingConstructor = constructor.underlyingConstructorDescriptor
                if (underlyingConstructor !is JavaClassConstructorDescriptor) return null
                val underlyingSamConstructor = createJavaSamAdapterConstructor(underlyingConstructor) ?: return null

                samConstructorForTypeAliasConstructor(Pair(underlyingSamConstructor, constructor.typeAliasDescriptor))
            }
            else -> null
        }' @ [156:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ConstructorDescriptor?, entry1: ConstructorDescriptor?, entry2: ConstructorDescriptor?): ConstructorDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ConstructorDescriptor?

'constructor' @ [156:22] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[ValueParameterDescriptorImpl]

'createJavaSamAdapterConstructor' @ [157:50] ==> private final fun createJavaSamAdapterConstructor(constructor: JavaClassConstructorDescriptor): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'constructor' @ [157:82] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[ValueParameterDescriptorImpl]

'constructor' @ [159:45] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[ValueParameterDescriptorImpl]

'underlyingConstructorDescriptor' @ [159:57] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'underlyingConstructor' @ [160:21] ==> val underlyingConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[LocalVariableDescriptor]

'createJavaSamAdapterConstructor' @ [161:48] ==> private final fun createJavaSamAdapterConstructor(constructor: JavaClassConstructorDescriptor): ClassConstructorDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'underlyingConstructor' @ [161:80] ==> val underlyingConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[LocalVariableDescriptor]

'invoke' @ [163:17] ==> public abstract fun invoke(p1: Pair<ClassConstructorDescriptor, TypeAliasDescriptor>): TypeAliasConstructorDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'Pair' @ [163:55] ==> public constructor Pair<out A, out B>(first: ClassConstructorDescriptor, second: TypeAliasDescriptor) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ClassConstructorDescriptor
    <out B> -> TypeAliasDescriptor

'underlyingSamConstructor' @ [163:60] ==> val underlyingSamConstructor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[LocalVariableDescriptor]

'constructor' @ [163:86] ==> value-parameter constructor: ConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSyntheticConstructor[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [163:98] ==> public abstract val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'!' @ [170:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSamAdapterNecessary' @ [170:40] ==> public open fun isSamAdapterNecessary(@NotNull `fun`: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'constructor' @ [170:62] ==> value-parameter constructor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.createJavaSamAdapterConstructor[ValueParameterDescriptorImpl]

'invoke' @ [171:16] ==> public abstract fun invoke(p1: JavaClassConstructorDescriptor): ClassConstructorDescriptor defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'constructor' @ [171:49] ==> value-parameter constructor: JavaClassConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.createJavaSamAdapterConstructor[ValueParameterDescriptorImpl]

'functions' @ [175:16] ==> value-parameter functions: Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamFunctions[ValueParameterDescriptorImpl]

'mapNotNull' @ [175:26] ==> public inline fun <T, R : Any> Iterable<DeclarationDescriptor>.mapNotNull(transform: (DeclarationDescriptor) -> SamAdapterDescriptor<JavaMethodDescriptor>?): List<SamAdapterDescriptor<JavaMethodDescriptor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R : Any> -> SamAdapterDescriptor<JavaMethodDescriptor>

'function' @ [176:17] ==> value-parameter function: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamFunctions.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [177:17] ==> value-parameter function: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamFunctions.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [177:26] ==> public final val JavaMethodDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'!' @ [178:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSamAdapterNecessary' @ [178:44] ==> public open fun isSamAdapterNecessary(@NotNull `fun`: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'function' @ [178:66] ==> value-parameter function: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamFunctions.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [180:13] ==> public abstract fun invoke(p1: JavaMethodDescriptor): SamAdapterDescriptor<JavaMethodDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'function' @ [180:41] ==> value-parameter function: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamFunctions.<anonymous>[ValueParameterDescriptorImpl]

'getSamAdaptersFromConstructors' @ [185:16] ==> private final fun getSamAdaptersFromConstructors(classifier: ClassifierDescriptor): List<FunctionDescriptor> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'classifier' @ [185:47] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getAllSamConstructors[ValueParameterDescriptorImpl]

'listOfNotNull' @ [185:61] ==> public fun <T : Any> listOfNotNull(element: SamConstructorDescriptor?): List<SamConstructorDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SamConstructorDescriptor

'getSamConstructor' @ [185:75] ==> private final fun getSamConstructor(classifier: ClassifierDescriptor): SamConstructorDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'classifier' @ [185:93] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getAllSamConstructors[ValueParameterDescriptorImpl]

'classifier' @ [189:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamAdaptersFromConstructors[ValueParameterDescriptorImpl]

'emptyList' @ [189:56] ==> public fun <T> emptyList(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'arrayListOf' @ [191:16] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<FunctionDescriptor> /* = ArrayList<FunctionDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'apply' @ [191:50] ==> @InlineOnly public inline fun <T> ArrayList<FunctionDescriptor> /* = ArrayList<FunctionDescriptor> */.apply(block: ArrayList<FunctionDescriptor> /* = ArrayList<FunctionDescriptor> */.() -> Unit): ArrayList<FunctionDescriptor> /* = ArrayList<FunctionDescriptor> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<FunctionDescriptor>

'classifier' @ [192:33] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamAdaptersFromConstructors[ValueParameterDescriptorImpl]

'constructors' @ [192:44] ==> public final val JavaClassDescriptor.constructors: Collection<(ClassConstructorDescriptor..ClassConstructorDescriptor?)>[MyPropertyDescriptor]

'getSyntheticConstructor' @ [193:38] ==> public open fun getSyntheticConstructor(constructor: ConstructorDescriptor): ConstructorDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'constructor' @ [193:62] ==> val constructor: (ClassConstructorDescriptor..ClassConstructorDescriptor?) defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamAdaptersFromConstructors.<anonymous>[LocalVariableDescriptor]

'add' @ [194:17] ==> public open fun add(element: FunctionDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'samConstructor' @ [194:21] ==> val samConstructor: ConstructorDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamAdaptersFromConstructors.<anonymous>[LocalVariableDescriptor]

'classifier' @ [200:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamConstructor[ValueParameterDescriptorImpl]

'getTypeAliasSamConstructor' @ [201:20] ==> private final fun getTypeAliasSamConstructor(classifier: TypeAliasDescriptor): SamConstructorDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[SimpleFunctionDescriptorImpl]

'classifier' @ [201:47] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamConstructor[ValueParameterDescriptorImpl]

'classifier' @ [204:13] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamConstructor[ValueParameterDescriptorImpl]

'classifier' @ [204:55] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamConstructor[ValueParameterDescriptorImpl]

'defaultFunctionTypeForSamInterface' @ [204:66] ==> public final val LazyJavaClassDescriptor.defaultFunctionTypeForSamInterface: SimpleType?[MyPropertyDescriptor]

'invoke' @ [205:16] ==> public abstract fun invoke(p1: JavaClassDescriptor): SamConstructorDescriptor defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'classifier' @ [205:44] ==> value-parameter classifier: ClassifierDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getSamConstructor[ValueParameterDescriptorImpl]

'classifier' @ [209:31] ==> value-parameter classifier: TypeAliasDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getTypeAliasSamConstructor[ValueParameterDescriptorImpl]

'classDescriptor' @ [209:42] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'classDescriptor' @ [210:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getTypeAliasSamConstructor[LocalVariableDescriptor]

'classDescriptor' @ [210:60] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getTypeAliasSamConstructor[LocalVariableDescriptor]

'defaultFunctionTypeForSamInterface' @ [210:76] ==> public final val LazyJavaClassDescriptor.defaultFunctionTypeForSamInterface: SimpleType?[MyPropertyDescriptor]

'createTypeAliasSamConstructorFunction' @ [212:42] ==> public open fun createTypeAliasSamConstructorFunction(@NotNull typeAliasDescriptor: TypeAliasDescriptor, @NotNull underlyingSamConstructor: SamConstructorDescriptor, @NotNull samResolver: SamConversionResolver): (SamConstructorDescriptor..SamConstructorDescriptor?) defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'classifier' @ [213:17] ==> value-parameter classifier: TypeAliasDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getTypeAliasSamConstructor[ValueParameterDescriptorImpl]

'invoke' @ [213:29] ==> public abstract fun invoke(p1: JavaClassDescriptor): SamConstructorDescriptor defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'classDescriptor' @ [213:57] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.getTypeAliasSamConstructor[LocalVariableDescriptor]

'samResolver' @ [213:75] ==> private final val samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope[PropertyDescriptorImpl]

'SimpleFunctionDescriptorImpl' @ [223:48] ==> protected/*protected and package*/ constructor SimpleFunctionDescriptorImpl(@NotNull p0: DeclarationDescriptor, @Nullable p1: SimpleFunctionDescriptor?, @NotNull p2: Annotations, @NotNull p3: Name, @NotNull p4: CallableMemberDescriptor.Kind, @NotNull p5: SourceElement) defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaClassConstructorDescriptor]

'containingDeclaration' @ [223:77] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'original' @ [223:100] ==> value-parameter original: SimpleFunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'annotations' @ [223:110] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'name' @ [223:123] ==> value-parameter name: Name defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'kind' @ [223:129] ==> value-parameter kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'source' @ [223:135] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.<init>[ValueParameterDescriptorImpl]

'Delegates' @ [225:72] ==> public object Delegates defined in kotlin.properties[FakeCallableDescriptorForObject]

'notNull' @ [225:82] ==> public final fun <T : Any> notNull(): ReadWriteProperty<Any?, FunctionDescriptor> defined in kotlin.properties.Delegates[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> FunctionDescriptor

'lazy' @ [228:112] ==> public fun <T> lazy(initializer: () -> Map<TypeParameterDescriptor, (TypeParameterDescriptor..TypeParameterDescriptor?)>): Lazy<Map<TypeParameterDescriptor, (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Map<TypeParameterDescriptor, (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>

'baseDescriptorForSynthetic' @ [229:13] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'typeParameters' @ [229:40] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'zip' @ [229:55] ==> public infix fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.zip(other: Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>): List<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), (TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'typeParameters' @ [229:59] ==> public final val SamAdapterFunctionsScope.MyFunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'toMap' @ [229:75] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, (TypeParameterDescriptor..TypeParameterDescriptor?)>>.toMap(): Map<TypeParameterDescriptor, (TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'MyFunctionDescriptor' @ [234:34] ==> public constructor MyFunctionDescriptor(containingDeclaration: DeclarationDescriptor, original: SimpleFunctionDescriptor?, annotations: Annotations, name: Name, kind: CallableMemberDescriptor.Kind, source: SourceElement) defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[ClassConstructorDescriptorImpl]

'sourceFunction' @ [234:55] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'containingDeclaration' @ [234:70] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'sourceFunction' @ [236:55] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'annotations' @ [236:70] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[DeserializedPropertyDescriptor]

'sourceFunction' @ [237:55] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'name' @ [237:70] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'SYNTHESIZED' @ [238:85] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'sourceFunction' @ [239:55] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'original' @ [239:70] ==> public final val FunctionDescriptor.original: FunctionDescriptor[MyPropertyDescriptor]

'source' @ [239:79] ==> public final val FunctionDescriptor.source: SourceElement[MyPropertyDescriptor]

'descriptor' @ [240:17] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [240:28] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'sourceFunction' @ [240:57] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'sourceFunction' @ [242:41] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'typeParameters' @ [242:56] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'toMutableList' @ [242:72] ==> public fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.toMutableList(): MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'sourceFunction' @ [243:34] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'containingDeclaration' @ [243:49] ==> public final val FunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'ArrayList' @ [245:38] ==> public final fun <E> <init>(p0: Int): ArrayList<TypeParameterDescriptor> /* = ArrayList<TypeParameterDescriptor> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> TypeParameterDescriptor

'sourceTypeParams' @ [245:73] ==> val sourceTypeParams: MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'size' @ [245:90] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'substituteTypeParameters' @ [246:61] ==> @NotNull public open fun substituteTypeParameters(@ReadOnly @NotNull p0: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>, @NotNull p1: TypeSubstitution, @NotNull p2: DeclarationDescriptor, @NotNull @Mutable p3: MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)>): TypeSubstitutor defined in org.jetbrains.kotlin.types.DescriptorSubstitutor[JavaMethodDescriptor]

'sourceTypeParams' @ [246:86] ==> val sourceTypeParams: MutableList<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'TypeSubstitution' @ [246:104] ==> public companion object defined in org.jetbrains.kotlin.types.TypeSubstitution[FakeCallableDescriptorForObject]

'EMPTY' @ [246:121] ==> @field:JvmField public final val EMPTY: TypeSubstitution defined in org.jetbrains.kotlin.types.TypeSubstitution.Companion[DeserializedPropertyDescriptor]

'descriptor' @ [246:128] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'typeParameters' @ [246:140] ==> val typeParameters: ArrayList<TypeParameterDescriptor> /* = ArrayList<TypeParameterDescriptor> */ defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'typeSubstitutor' @ [248:34] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'safeSubstitute' @ [248:50] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'sourceFunction' @ [248:65] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'returnType' @ [248:80] ==> public final val FunctionDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'INVARIANT' @ [248:103] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'createValueParametersForSamAdapter' @ [249:65] ==> public open fun createValueParametersForSamAdapter(@NotNull original: FunctionDescriptor, @NotNull samAdapter: FunctionDescriptor, @NotNull substitutor: TypeSubstitutor, @NotNull samResolver: SamConversionResolver): (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.load.java.sam.SingleAbstractMethodUtils[JavaMethodDescriptor]

'sourceFunction' @ [250:25] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'descriptor' @ [250:41] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'typeSubstitutor' @ [250:53] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'samResolver' @ [250:70] ==> value-parameter samResolver: SamConversionResolver defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'syntheticVisibility' @ [252:34] ==> public fun syntheticVisibility(originalDescriptor: DeclarationDescriptorWithVisibility, isUsedForExtension: Boolean): Visibility defined in org.jetbrains.kotlin.synthetic in file syntheticExtensionsUtils.kt[SimpleFunctionDescriptorImpl]

'sourceFunction' @ [252:54] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'descriptor' @ [254:17] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'initialize' @ [254:28] ==> @NotNull public open fun initialize(@Nullable p0: KotlinType?, @Nullable p1: ReceiverParameterDescriptor?, @NotNull p2: (MutableList<out (TypeParameterDescriptor..TypeParameterDescriptor?)>..List<(TypeParameterDescriptor..TypeParameterDescriptor?)>), @NotNull p3: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>), @Nullable p4: KotlinType?, @Nullable p5: Modality?, @NotNull p6: Visibility): SimpleFunctionDescriptorImpl defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[JavaMethodDescriptor]

'ownerClass' @ [254:45] ==> val ownerClass: ClassDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'thisAsReceiverParameter' @ [254:56] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'typeParameters' @ [254:81] ==> val typeParameters: ArrayList<TypeParameterDescriptor> /* = ArrayList<TypeParameterDescriptor> */ defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'valueParameters' @ [254:97] ==> val valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>?) defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'returnType' @ [254:114] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'Modality' @ [255:39] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [255:48] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'visibility' @ [255:55] ==> val visibility: Visibility defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'descriptor' @ [257:17] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'isOperator' @ [257:28] ==> public final var SamAdapterFunctionsScope.MyFunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'sourceFunction' @ [257:41] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'isOperator' @ [257:56] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'descriptor' @ [258:17] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'isInfix' @ [258:28] ==> public final var SamAdapterFunctionsScope.MyFunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'sourceFunction' @ [258:38] ==> value-parameter sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[ValueParameterDescriptorImpl]

'isInfix' @ [258:53] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'descriptor' @ [260:24] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.Companion.create[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [264:50] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'hasStableParameterNames' @ [264:77] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'baseDescriptorForSynthetic' @ [265:55] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'hasSynthesizedParameterNames' @ [265:82] ==> public abstract fun hasSynthesizedParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'MyFunctionDescriptor' @ [275:20] ==> public constructor MyFunctionDescriptor(containingDeclaration: DeclarationDescriptor, original: SimpleFunctionDescriptor?, annotations: Annotations, name: Name, kind: CallableMemberDescriptor.Kind, source: SourceElement) defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[ClassConstructorDescriptorImpl]

'containingDeclaration' @ [276:21] ==> public final val SamAdapterFunctionsScope.MyFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'original' @ [276:44] ==> value-parameter original: FunctionDescriptor? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.createSubstitutedCopy[ValueParameterDescriptorImpl]

'annotations' @ [276:83] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.createSubstitutedCopy[ValueParameterDescriptorImpl]

'newName' @ [276:96] ==> value-parameter newName: Name? defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.createSubstitutedCopy[ValueParameterDescriptorImpl]

'name' @ [276:107] ==> public final val SamAdapterFunctionsScope.MyFunctionDescriptor.name: Name[MyPropertyDescriptor]

'kind' @ [276:113] ==> value-parameter kind: CallableMemberDescriptor.Kind defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.createSubstitutedCopy[ValueParameterDescriptorImpl]

'source' @ [276:119] ==> value-parameter source: SourceElement defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.createSubstitutedCopy[ValueParameterDescriptorImpl]

'apply' @ [277:15] ==> @InlineOnly public inline fun <T> SamAdapterFunctionsScope.MyFunctionDescriptor.apply(block: SamAdapterFunctionsScope.MyFunctionDescriptor.() -> Unit): SamAdapterFunctionsScope.MyFunctionDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MyFunctionDescriptor

'baseDescriptorForSynthetic' @ [278:17] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'this@MyFunctionDescriptor' @ [278:46] ==> <this> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[LazyClassReceiverParameterDescriptor]

'baseDescriptorForSynthetic' @ [278:72] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'super' @ [283:17] ==> <this> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[LazyClassReceiverParameterDescriptor]

'newCopyBuilder' @ [283:23] ==> @NotNull protected/*protected and package*/ open fun newCopyBuilder(@NotNull p0: TypeSubstitutor): FunctionDescriptorImpl.CopyConfiguration defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'substitutor' @ [283:38] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.newCopyBuilder[ValueParameterDescriptorImpl]

'setOriginal' @ [283:51] ==> @NotNull public open fun setOriginal(@Nullable p0: CallableMemberDescriptor?): FunctionDescriptorImpl.CopyConfiguration defined in org.jetbrains.kotlin.descriptors.impl.FunctionDescriptorImpl.CopyConfiguration[JavaMethodDescriptor]

'this' @ [283:63] ==> <this> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[LazyClassReceiverParameterDescriptor]

'original' @ [283:68] ==> public final val SamAdapterFunctionsScope.MyFunctionDescriptor.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'super' @ [286:30] ==> <this> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[LazyClassReceiverParameterDescriptor]

'doSubstitute' @ [286:36] ==> @Nullable protected/*protected and package*/ open fun doSubstitute(@NotNull p0: FunctionDescriptorImpl.CopyConfiguration): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.impl.SimpleFunctionDescriptorImpl[JavaMethodDescriptor]

'configuration' @ [286:49] ==> value-parameter configuration: FunctionDescriptorImpl.CopyConfiguration defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[ValueParameterDescriptorImpl]

'configuration' @ [287:28] ==> value-parameter configuration: FunctionDescriptorImpl.CopyConfiguration defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[ValueParameterDescriptorImpl]

'original' @ [287:42] ==> public final val FunctionDescriptorImpl.CopyConfiguration.original: FunctionDescriptor?[MyPropertyDescriptor]

'UnsupportedOperationException' @ [288:37] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'this' @ [288:144] ==> <this> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[LazyClassReceiverParameterDescriptor]

'original' @ [290:13] ==> val original: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'assert' @ [291:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'original' @ [291:20] ==> val original: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'original' @ [291:29] ==> public final val SamAdapterFunctionsScope.MyFunctionDescriptor.original: SimpleFunctionDescriptor[MyPropertyDescriptor]

'original' @ [291:41] ==> val original: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'CompositionTypeSubstitution' @ [294:21] ==> public constructor CompositionTypeSubstitution(outer: TypeSubstitution, inner: Map<TypeParameterDescriptor, TypeParameterDescriptor>) defined in org.jetbrains.kotlin.types.CompositionTypeSubstitution[DeserializedClassConstructorDescriptor]

'configuration' @ [294:49] ==> value-parameter configuration: FunctionDescriptorImpl.CopyConfiguration defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[ValueParameterDescriptorImpl]

'substitution' @ [294:63] ==> public final var FunctionDescriptorImpl.CopyConfiguration.substitution: TypeSubstitution[MyPropertyDescriptor]

'fromSourceFunctionTypeParameters' @ [294:77] ==> private final val fromSourceFunctionTypeParameters: Map<TypeParameterDescriptor, TypeParameterDescriptor> defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'buildSubstitutor' @ [294:111] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.CompositionTypeSubstitution[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [296:13] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [296:24] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'original' @ [296:53] ==> val original: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [296:62] ==> public open var baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor[PropertyDescriptorImpl]

'substitute' @ [296:89] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'sourceFunctionSubstitutor' @ [296:100] ==> val sourceFunctionSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

'descriptor' @ [297:20] ==> val descriptor: SamAdapterFunctionsScope.MyFunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterFunctionsScope.MyFunctionDescriptor.doSubstitute[LocalVariableDescriptor]

