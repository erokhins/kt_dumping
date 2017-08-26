'MemberScopeImpl' @ [41:5] ==> public constructor MemberScopeImpl() defined in org.jetbrains.kotlin.resolve.scopes.MemberScopeImpl[DeserializedClassConstructorDescriptor]

'c' @ [44:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [44:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [44:30] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, List<ProtoBuf.Function>>): NotNullLazyValue<Map<Name, List<ProtoBuf.Function>>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Map<Name, List<Function>>

'functionList' @ [45:17] ==> value-parameter functionList: Collection<ProtoBuf.Function> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.<init>[ValueParameterDescriptorImpl]

'groupByName' @ [45:30] ==> private final inline fun <M : MessageLite> Collection<ProtoBuf.Function>.groupByName(getNameIndex: (ProtoBuf.Function) -> Int): Map<Name, List<ProtoBuf.Function>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> Function

'it' @ [45:44] ==> value-parameter it: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.functionProtos.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [45:47] ==> public final val ProtoBuf.Function.name: Int[MyPropertyDescriptor]

'c' @ [48:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [48:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [48:30] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, List<ProtoBuf.Property>>): NotNullLazyValue<Map<Name, List<ProtoBuf.Property>>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Map<Name, List<Property>>

'propertyList' @ [49:17] ==> value-parameter propertyList: Collection<ProtoBuf.Property> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.<init>[ValueParameterDescriptorImpl]

'groupByName' @ [49:30] ==> private final inline fun <M : MessageLite> Collection<ProtoBuf.Property>.groupByName(getNameIndex: (ProtoBuf.Property) -> Int): Map<Name, List<ProtoBuf.Property>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> Property

'it' @ [49:44] ==> value-parameter it: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.propertyProtos.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [49:47] ==> public final val ProtoBuf.Property.name: Int[MyPropertyDescriptor]

'c' @ [52:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [52:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [52:30] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Map<Name, List<ProtoBuf.TypeAlias>>): NotNullLazyValue<Map<Name, List<ProtoBuf.TypeAlias>>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Map<Name, List<TypeAlias>>

'if (c.components.configuration.typeAliasesAllowed)
                    typeAliasList.groupByName { it.name }
                else emptyMap()' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Map<Name, List<ProtoBuf.TypeAlias>>, elseBranch: Map<Name, List<ProtoBuf.TypeAlias>>): Map<Name, List<ProtoBuf.TypeAlias>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Map<Name, List<TypeAlias>>

'c' @ [53:21] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'components' @ [53:23] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'configuration' @ [53:34] ==> public final val configuration: DeserializationConfiguration defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[PropertyDescriptorImpl]

'typeAliasesAllowed' @ [53:48] ==> public open val typeAliasesAllowed: Boolean defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationConfiguration[PropertyDescriptorImpl]

'typeAliasList' @ [54:21] ==> value-parameter typeAliasList: Collection<ProtoBuf.TypeAlias> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.<init>[ValueParameterDescriptorImpl]

'groupByName' @ [54:35] ==> private final inline fun <M : MessageLite> Collection<ProtoBuf.TypeAlias>.groupByName(getNameIndex: (ProtoBuf.TypeAlias) -> Int): Map<Name, List<ProtoBuf.TypeAlias>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> TypeAlias

'it' @ [54:49] ==> value-parameter it: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.typeAliasProtos.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [54:52] ==> public final val ProtoBuf.TypeAlias.name: Int[MyPropertyDescriptor]

'emptyMap' @ [55:22] ==> public fun <K, V> emptyMap(): Map<Name, List<ProtoBuf.TypeAlias>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V> -> List<TypeAlias>

'c' @ [59:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [59:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createMemoizedFunction' @ [59:30] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<SimpleFunctionDescriptor>): MemoizedFunctionToNotNull<Name, Collection<SimpleFunctionDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<SimpleFunctionDescriptor>

'computeFunctions' @ [59:99] ==> private final fun computeFunctions(name: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [59:116] ==> value-parameter it: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.functions.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [61:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [61:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createMemoizedFunction' @ [61:30] ==> public abstract fun <K, V : Any> createMemoizedFunction(compute: (Name) -> Collection<PropertyDescriptor>): MemoizedFunctionToNotNull<Name, Collection<PropertyDescriptor>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> Collection<PropertyDescriptor>

'computeProperties' @ [61:93] ==> private final fun computeProperties(name: Name): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [61:111] ==> value-parameter it: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.properties.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [63:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [63:15] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createMemoizedFunctionWithNullableValues' @ [63:30] ==> public abstract fun <K, V : Any> createMemoizedFunctionWithNullableValues(compute: (Name) -> TypeAliasDescriptor?): MemoizedFunctionToNullable<Name, TypeAliasDescriptor> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Name
    <V : Any> -> TypeAliasDescriptor

'createTypeAlias' @ [63:100] ==> private final fun createTypeAlias(name: Name): TypeAliasDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [63:116] ==> value-parameter it: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.typeAliasByName.<anonymous>[ValueParameterDescriptorImpl]

'c' @ [65:38] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [65:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [65:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<Name>

'functionProtos' @ [66:9] ==> private final val functionProtos: Map<Name, List<ProtoBuf.Function>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'keys' @ [66:24] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'getNonDeclaredFunctionNames' @ [66:31] ==> protected abstract fun getNonDeclaredFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'c' @ [69:38] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [69:40] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [69:55] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<Name>

'propertyProtos' @ [70:9] ==> private final val propertyProtos: Map<Name, List<ProtoBuf.Property>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'keys' @ [70:24] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'getNonDeclaredVariableNames' @ [70:31] ==> protected abstract fun getNonDeclaredVariableNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'typeAliasProtos' @ [73:51] ==> private final val typeAliasProtos: Map<Name, List<ProtoBuf.TypeAlias>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'keys' @ [73:67] ==> public abstract val keys: Set<Name> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'c' @ [75:32] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'storageManager' @ [75:34] ==> public final val storageManager: StorageManager defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'createLazyValue' @ [75:49] ==> public abstract fun <T : Any> createLazyValue(computable: () -> Set<Name>): NotNullLazyValue<Set<Name>> defined in org.jetbrains.kotlin.storage.StorageManager[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Set<Name>

'invoke' @ [75:67] ==> public abstract operator fun invoke(): Collection<Name> defined in kotlin.Function0[FunctionInvokeDescriptor]

'toSet' @ [75:80] ==> public fun <T> Iterable<Name>.toSet(): Set<Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name

'functionNamesLazy' @ [77:39] ==> private final val functionNamesLazy: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'variableNamesLazy' @ [78:39] ==> private final val variableNamesLazy: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'groupBy' @ [82:9] ==> public inline fun <T, K> Iterable<M>.groupBy(keySelector: (M) -> Name): Map<Name, List<M>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M
    <K> -> Name

'c' @ [82:19] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'nameResolver' @ [82:21] ==> public final val nameResolver: NameResolver defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'getName' @ [82:34] ==> @NotNull public abstract fun getName(index: Int): Name defined in org.jetbrains.kotlin.serialization.deserialization.NameResolver[JavaMethodDescriptor]

'invoke' @ [82:42] ==> public abstract operator fun invoke(p1: M): Int defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [82:55] ==> value-parameter it: M defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.groupByName.<anonymous>[ValueParameterDescriptorImpl]

'computeDescriptors' @ [85:13] ==> private final inline fun <M : MessageLite, D : DeclarationDescriptor> computeDescriptors(name: Name, protosByName: Map<Name, Collection<ProtoBuf.Function>>, factory: (ProtoBuf.Function) -> SimpleFunctionDescriptor, computeNonDeclared: (MutableCollection<SimpleFunctionDescriptor>) -> Unit): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> Function
    <D : DeclarationDescriptor> -> SimpleFunctionDescriptor

'name' @ [86:21] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeFunctions[ValueParameterDescriptorImpl]

'functionProtos' @ [87:21] ==> private final val functionProtos: Map<Name, List<ProtoBuf.Function>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'c' @ [88:23] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'memberDeserializer' @ [88:25] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'loadFunction' @ [88:44] ==> public final fun loadFunction(proto: ProtoBuf.Function): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [88:57] ==> value-parameter it: ProtoBuf.Function defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeFunctions.<anonymous>[ValueParameterDescriptorImpl]

'computeNonDeclaredFunctions' @ [89:23] ==> protected open fun computeNonDeclaredFunctions(name: Name, functions: MutableCollection<SimpleFunctionDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [89:51] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeFunctions[ValueParameterDescriptorImpl]

'it' @ [89:57] ==> value-parameter it: MutableCollection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeFunctions.<anonymous>[ValueParameterDescriptorImpl]

'protosByName' @ [98:22] ==> value-parameter protosByName: Map<Name, Collection<M>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'name' @ [98:35] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'orEmpty' @ [98:41] ==> @InlineOnly public inline fun <T> Collection<M>?.orEmpty(): Collection<M> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M

'protos' @ [100:27] ==> val protos: Collection<M> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'mapTo' @ [100:34] ==> public inline fun <T, R, C : MutableCollection<in D>> Iterable<M>.mapTo(destination: ArrayList<D> /* = ArrayList<D> */, transform: (M) -> D): ArrayList<D> /* = ArrayList<D> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> M
    <R> -> D
    <C : MutableCollection<in R>> -> ArrayList<D>

'arrayListOf' @ [100:40] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<D> /* = ArrayList<D> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'factory' @ [100:55] ==> value-parameter factory: (M) -> D defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'invoke' @ [102:9] ==> public abstract operator fun invoke(p1: MutableCollection<D>): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'descriptors' @ [102:28] ==> val descriptors: ArrayList<D> /* = ArrayList<D> */ defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'descriptors' @ [103:16] ==> val descriptors: ArrayList<D> /* = ArrayList<D> */ defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'compact' @ [103:28] ==> public fun <T> ArrayList<D>.compact(): List<D> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> D

'name' @ [110:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'getFunctionNames' @ [110:22] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'emptyList' @ [110:49] ==> public fun <T> emptyList(): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'invoke' @ [111:16] ==> public abstract fun invoke(p1: Name): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [111:26] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedFunctions[ValueParameterDescriptorImpl]

'computeDescriptors' @ [115:13] ==> private final inline fun <M : MessageLite, D : DeclarationDescriptor> computeDescriptors(name: Name, protosByName: Map<Name, Collection<ProtoBuf.Property>>, factory: (ProtoBuf.Property) -> PropertyDescriptor, computeNonDeclared: (MutableCollection<PropertyDescriptor>) -> Unit): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <M : MessageLite> -> Property
    <D : DeclarationDescriptor> -> PropertyDescriptor

'name' @ [116:21] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeProperties[ValueParameterDescriptorImpl]

'propertyProtos' @ [117:21] ==> private final val propertyProtos: Map<Name, List<ProtoBuf.Property>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'c' @ [118:23] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'memberDeserializer' @ [118:25] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'loadProperty' @ [118:44] ==> public final fun loadProperty(proto: ProtoBuf.Property): PropertyDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [118:57] ==> value-parameter it: ProtoBuf.Property defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeProperties.<anonymous>[ValueParameterDescriptorImpl]

'computeNonDeclaredProperties' @ [119:23] ==> protected open fun computeNonDeclaredProperties(name: Name, descriptors: MutableCollection<PropertyDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [119:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeProperties[ValueParameterDescriptorImpl]

'it' @ [119:58] ==> value-parameter it: MutableCollection<PropertyDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeProperties.<anonymous>[ValueParameterDescriptorImpl]

'typeAliasProtos' @ [126:13] ==> private final val typeAliasProtos: Map<Name, List<ProtoBuf.TypeAlias>> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'name' @ [126:29] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.createTypeAlias[ValueParameterDescriptorImpl]

'singleOrNull' @ [126:36] ==> public fun <T> List<ProtoBuf.TypeAlias>.singleOrNull(): ProtoBuf.TypeAlias? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAlias

'let' @ [126:52] ==> @InlineOnly public inline fun <T, R> ProtoBuf.TypeAlias.let(block: (ProtoBuf.TypeAlias) -> TypeAliasDescriptor): TypeAliasDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeAlias
    <R> -> TypeAliasDescriptor

'c' @ [127:17] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'memberDeserializer' @ [127:19] ==> public final val memberDeserializer: MemberDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'loadTypeAlias' @ [127:38] ==> public final fun loadTypeAlias(proto: ProtoBuf.TypeAlias): TypeAliasDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.MemberDeserializer[SimpleFunctionDescriptorImpl]

'it' @ [127:52] ==> value-parameter it: ProtoBuf.TypeAlias defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.createTypeAlias.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [131:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'getVariableNames' @ [131:22] ==> public open fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'emptyList' @ [131:49] ==> public fun <T> emptyList(): List<PropertyDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PropertyDescriptor

'invoke' @ [132:16] ==> public abstract fun invoke(p1: Name): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNotNull[FunctionInvokeDescriptor]

'name' @ [132:27] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedVariables[ValueParameterDescriptorImpl]

'ArrayList' @ [142:22] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'kindFilter' @ [144:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [144:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'SINGLETON_CLASSIFIERS_MASK' @ [144:58] ==> public final val SINGLETON_CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'addEnumEntryDescriptors' @ [145:13] ==> protected abstract fun addEnumEntryDescriptors(result: MutableCollection<DeclarationDescriptor>, nameFilter: (Name) -> Boolean): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [145:37] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'nameFilter' @ [145:45] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'addFunctionsAndProperties' @ [148:9] ==> private final fun addFunctionsAndProperties(result: MutableCollection<DeclarationDescriptor>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, location: LookupLocation): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'result' @ [148:35] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'kindFilter' @ [148:43] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'nameFilter' @ [148:55] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'location' @ [148:67] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'kindFilter' @ [150:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [150:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'CLASSIFIERS_MASK' @ [150:58] ==> public final val CLASSIFIERS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'classNames' @ [151:31] ==> internal final val classNames: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'invoke' @ [152:21] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'className' @ [152:32] ==> val className: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [153:21] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [153:28] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'deserializeClass' @ [153:41] ==> private final fun deserializeClass(name: Name): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'className' @ [153:58] ==> val className: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'kindFilter' @ [158:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[ValueParameterDescriptorImpl]

'acceptsKinds' @ [158:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'TYPE_ALIASES_MASK' @ [158:58] ==> public final val TYPE_ALIASES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'typeAliasNames' @ [159:35] ==> private final val typeAliasNames: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'invoke' @ [160:21] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'typeAliasName' @ [160:32] ==> val typeAliasName: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [161:21] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'addIfNotNull' @ [161:28] ==> public fun <T : Any> MutableCollection<DeclarationDescriptor>.addIfNotNull(t: DeclarationDescriptor?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'invoke' @ [161:41] ==> public abstract fun invoke(p1: Name): TypeAliasDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'typeAliasName' @ [161:57] ==> val typeAliasName: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'result' @ [166:16] ==> val result: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.computeDescriptors[LocalVariableDescriptor]

'compact' @ [166:23] ==> public fun <T> ArrayList<DeclarationDescriptor>.compact(): List<DeclarationDescriptor> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'kindFilter' @ [175:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'acceptsKinds' @ [175:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'VARIABLES_MASK' @ [175:58] ==> public final val VARIABLES_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'addMembers' @ [176:13] ==> private final inline fun addMembers(names: Collection<Name>, nameFilter: (Name) -> Boolean, result: MutableCollection<DeclarationDescriptor>, descriptorsByName: (Name) -> Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'getVariableNames' @ [177:21] ==> public open fun getVariableNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'nameFilter' @ [178:21] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'result' @ [179:21] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'getContributedVariables' @ [180:17] ==> public open fun getContributedVariables(name: Name, location: LookupLocation): Collection<PropertyDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [180:41] ==> value-parameter it: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties.<anonymous>[ValueParameterDescriptorImpl]

'location' @ [180:45] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'kindFilter' @ [183:13] ==> value-parameter kindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'acceptsKinds' @ [183:24] ==> public final fun acceptsKinds(kinds: Int): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'FUNCTIONS_MASK' @ [183:58] ==> public final val FUNCTIONS_MASK: Int defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'addMembers' @ [184:13] ==> private final inline fun addMembers(names: Collection<Name>, nameFilter: (Name) -> Boolean, result: MutableCollection<DeclarationDescriptor>, descriptorsByName: (Name) -> Collection<DeclarationDescriptor>): Unit defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'getFunctionNames' @ [185:21] ==> public open fun getFunctionNames(): Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'nameFilter' @ [186:21] ==> value-parameter nameFilter: (Name) -> Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'result' @ [187:21] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [188:17] ==> public open fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'it' @ [188:41] ==> value-parameter it: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties.<anonymous>[ValueParameterDescriptorImpl]

'location' @ [188:45] ==> value-parameter location: LookupLocation defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addFunctionsAndProperties[ValueParameterDescriptorImpl]

'ArrayList' @ [198:25] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> DeclarationDescriptor

'names' @ [199:22] ==> value-parameter names: Collection<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[ValueParameterDescriptorImpl]

'invoke' @ [200:17] ==> public abstract operator fun invoke(p1: Name): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [200:28] ==> val name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[LocalVariableDescriptor]

'subResult' @ [201:17] ==> val subResult: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[LocalVariableDescriptor]

'addAll' @ [201:27] ==> public open fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'invoke' @ [201:34] ==> public abstract operator fun invoke(p1: Name): Collection<DeclarationDescriptor> defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [201:52] ==> val name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[LocalVariableDescriptor]

'subResult' @ [205:9] ==> val subResult: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[LocalVariableDescriptor]

'sortWith' @ [205:19] ==> public fun <T> MutableList<DeclarationDescriptor>.sortWith(comparator: Comparator<in DeclarationDescriptor> /* = Comparator<in DeclarationDescriptor> */): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'INSTANCE' @ [205:45] ==> public final val INSTANCE: (MemberComparator..MemberComparator?) defined in org.jetbrains.kotlin.resolve.MemberComparator[JavaPropertyDescriptor]

'result' @ [206:9] ==> value-parameter result: MutableCollection<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[ValueParameterDescriptorImpl]

'addAll' @ [206:16] ==> public abstract fun addAll(elements: Collection<DeclarationDescriptor>): Boolean defined in kotlin.collections.MutableCollection[DeserializedSimpleFunctionDescriptor]

'subResult' @ [206:23] ==> val subResult: ArrayList<DeclarationDescriptor> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.addMembers[LocalVariableDescriptor]

'when {
                hasClass(name) -> deserializeClass(name)
                name in typeAliasNames -> typeAliasByName(name)
                else -> null
            }' @ [210:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassifierDescriptor?, entry1: ClassifierDescriptor?, entry2: ClassifierDescriptor?): ClassifierDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassifierDescriptor?

'hasClass' @ [211:17] ==> protected open fun hasClass(name: Name): Boolean defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [211:26] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'deserializeClass' @ [211:35] ==> private final fun deserializeClass(name: Name): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [211:52] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'name' @ [212:17] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'typeAliasNames' @ [212:25] ==> private final val typeAliasNames: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'invoke' @ [212:43] ==> public abstract fun invoke(p1: Name): TypeAliasDescriptor? defined in org.jetbrains.kotlin.storage.MemoizedFunctionToNullable[FunctionInvokeDescriptor]

'name' @ [212:59] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.getContributedClassifier[ValueParameterDescriptorImpl]

'c' @ [217:13] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'components' @ [217:15] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'deserializeClass' @ [217:26] ==> public final fun deserializeClass(classId: ClassId): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[SimpleFunctionDescriptorImpl]

'createClassId' @ [217:43] ==> protected abstract fun createClassId(name: Name): ClassId defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[SimpleFunctionDescriptorImpl]

'name' @ [217:57] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.deserializeClass[ValueParameterDescriptorImpl]

'name' @ [220:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.hasClass[ValueParameterDescriptorImpl]

'classNames' @ [220:21] ==> internal final val classNames: Set<Name> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'p' @ [230:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [230:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'this' @ [230:19] ==> <this> defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[LazyClassReceiverParameterDescriptor]

'java' @ [230:31] ==> public val <T> KClass<out DeserializedMemberScope>.java: Class<out DeserializedMemberScope> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out DeserializedMemberScope)

'simpleName' @ [230:36] ==> public final val <T : (Any..Any?)> Class<out DeserializedMemberScope>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out DeserializedMemberScope)

'p' @ [231:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'pushIndent' @ [231:11] ==> @NotNull public open fun pushIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [233:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [233:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'+' @ [233:19] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'c' @ [233:48] ==> protected final val c: DeserializationContext defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope[PropertyDescriptorImpl]

'containingDeclaration' @ [233:50] ==> public final val containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationContext[PropertyDescriptorImpl]

'p' @ [235:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'popIndent' @ [235:11] ==> @NotNull public open fun popIndent(): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

'p' @ [236:9] ==> value-parameter p: Printer defined in org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedMemberScope.printScopeStructure[ValueParameterDescriptorImpl]

'println' @ [236:11] ==> @NotNull public open fun println(vararg p0: (Any..Any?)): Printer defined in org.jetbrains.kotlin.utils.Printer[JavaMethodDescriptor]

