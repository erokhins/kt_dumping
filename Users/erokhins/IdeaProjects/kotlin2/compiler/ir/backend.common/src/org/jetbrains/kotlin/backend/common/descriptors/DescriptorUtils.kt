'this' @ [30:13] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.isSuspend[ReceiverParameterDescriptorImpl]

'isSuspend' @ [30:43] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'if (this is ConstructorDescriptor) {
        listOf(this.constructedClass.thisAsReceiverParameter) + explicitParameters
    } else {
        explicitParameters
    }' @ [36:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ParameterDescriptor>, elseBranch: List<ParameterDescriptor>): List<ParameterDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ParameterDescriptor>

'this' @ [36:17] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.allParameters[ReceiverParameterDescriptorImpl]

'listOf' @ [37:9] ==> public fun <T> listOf(element: ReceiverParameterDescriptor): List<ReceiverParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor

'this' @ [37:16] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.allParameters[ReceiverParameterDescriptorImpl]

'constructedClass' @ [37:21] ==> public final val ConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'thisAsReceiverParameter' @ [37:38] ==> public final val ClassDescriptor.thisAsReceiverParameter: ReceiverParameterDescriptor[MyPropertyDescriptor]

'explicitParameters' @ [37:65] ==> public val CallableDescriptor.explicitParameters: List<ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.descriptors in file DescriptorUtils.kt[PropertyDescriptorImpl]

'explicitParameters' @ [39:9] ==> public val CallableDescriptor.explicitParameters: List<ParameterDescriptor> defined in org.jetbrains.kotlin.backend.common.descriptors in file DescriptorUtils.kt[PropertyDescriptorImpl]

'ArrayList' @ [47:22] ==> public final fun <E> <init>(p0: Int): ArrayList<ParameterDescriptor> /* = ArrayList<ParameterDescriptor> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> ParameterDescriptor

'valueParameters' @ [47:53] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [47:69] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'this' @ [49:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.explicitParameters[ReceiverParameterDescriptorImpl]

'dispatchReceiverParameter' @ [49:14] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [49:41] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Boolean

'result' @ [50:13] ==> val result: ArrayList<ParameterDescriptor> /* = ArrayList<ParameterDescriptor> */ defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>[LocalVariableDescriptor]

'add' @ [50:20] ==> public open fun add(element: ParameterDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [50:24] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [53:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.explicitParameters[ReceiverParameterDescriptorImpl]

'extensionReceiverParameter' @ [53:14] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'let' @ [53:42] ==> @InlineOnly public inline fun <T, R> ReceiverParameterDescriptor.let(block: (ReceiverParameterDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> Boolean

'result' @ [54:13] ==> val result: ArrayList<ParameterDescriptor> /* = ArrayList<ParameterDescriptor> */ defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>[LocalVariableDescriptor]

'add' @ [54:20] ==> public open fun add(element: ParameterDescriptor): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [54:24] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [57:9] ==> val result: ArrayList<ParameterDescriptor> /* = ArrayList<ParameterDescriptor> */ defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>[LocalVariableDescriptor]

'addAll' @ [57:16] ==> public open fun addAll(elements: Collection<ParameterDescriptor>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'valueParameters' @ [57:23] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'result' @ [59:16] ==> val result: ArrayList<ParameterDescriptor> /* = ArrayList<ParameterDescriptor> */ defined in org.jetbrains.kotlin.backend.common.descriptors.<get-explicitParameters>[LocalVariableDescriptor]

'this' @ [62:51] ==> <this> defined in org.jetbrains.kotlin.backend.common.descriptors.replace[ReceiverParameterDescriptorImpl]

'replace' @ [62:56] ==> @JvmOverloads public fun KotlinType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'types' @ [62:64] ==> value-parameter types: List<KotlinType> defined in org.jetbrains.kotlin.backend.common.descriptors.replace[ValueParameterDescriptorImpl]

'map' @ [62:70] ==> public inline fun <T, R> Iterable<KotlinType>.map(transform: (KotlinType) -> TypeProjectionImpl): List<TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> TypeProjectionImpl

'TypeProjectionImpl' @ [62:76] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'create' @ [65:43] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeParameters' @ [66:13] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'withIndex' @ [67:22] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'associateBy' @ [68:22] ==> public inline fun <T, K, V> Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>>.associateBy(keySelector: (IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>) -> (TypeConstructor..TypeConstructor?), valueTransform: (IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>) -> TypeProjectionImpl): Map<(TypeConstructor..TypeConstructor?), TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>
    <K> -> (org.jetbrains.kotlin.types.TypeConstructor..org.jetbrains.kotlin.types.TypeConstructor?)
    <V> -> TypeProjectionImpl

'it' @ [68:36] ==> value-parameter it: IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.descriptors.substitute.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [68:39] ==> public final val value: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'typeConstructor' @ [68:45] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [68:66] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'types' @ [68:85] ==> value-parameter vararg types: KotlinType defined in org.jetbrains.kotlin.backend.common.descriptors.substitute[ValueParameterDescriptorImpl]

'it' @ [68:91] ==> value-parameter it: IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.descriptors.substitute.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [68:94] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'substitute' @ [70:12] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'typeSubstitutor' @ [70:23] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.backend.common.descriptors.substitute[LocalVariableDescriptor]

'create' @ [74:43] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeParameters' @ [75:13] ==> public final val FunctionDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'associateBy' @ [75:28] ==> public inline fun <T, K, V> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.associateBy(keySelector: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> (TypeConstructor..TypeConstructor?), valueTransform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeProjectionImpl): Map<(TypeConstructor..TypeConstructor?), TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <K> -> (org.jetbrains.kotlin.types.TypeConstructor..org.jetbrains.kotlin.types.TypeConstructor?)
    <V> -> TypeProjectionImpl

'it' @ [75:42] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.descriptors.substitute.<anonymous>[ValueParameterDescriptorImpl]

'typeConstructor' @ [75:45] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [75:66] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'typeArguments' @ [75:85] ==> value-parameter typeArguments: Map<TypeParameterDescriptor, KotlinType> defined in org.jetbrains.kotlin.backend.common.descriptors.substitute[ValueParameterDescriptorImpl]

'it' @ [75:99] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.backend.common.descriptors.substitute.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [77:12] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.FunctionDescriptor[JavaMethodDescriptor]

'typeSubstitutor' @ [77:23] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.backend.common.descriptors.substitute[LocalVariableDescriptor]

'create' @ [81:43] ==> @NotNull public open fun create(@NotNull p0: (MutableMap<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>..Map<(TypeConstructor..TypeConstructor?), (TypeProjection..TypeProjection?)>)): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'declaredTypeParameters' @ [82:13] ==> public final val ClassDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'withIndex' @ [83:22] ==> public fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.withIndex(): Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'associateBy' @ [84:22] ==> public inline fun <T, K, V> Iterable<IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>>.associateBy(keySelector: (IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>) -> (TypeConstructor..TypeConstructor?), valueTransform: (IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)>) -> TypeProjectionImpl): Map<(TypeConstructor..TypeConstructor?), TypeProjectionImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IndexedValue<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>
    <K> -> (org.jetbrains.kotlin.types.TypeConstructor..org.jetbrains.kotlin.types.TypeConstructor?)
    <V> -> TypeProjectionImpl

'it' @ [84:36] ==> value-parameter it: IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.descriptors.getFunction.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [84:39] ==> public final val value: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'typeConstructor' @ [84:45] ==> public final val TypeParameterDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'TypeProjectionImpl' @ [84:66] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'types' @ [84:85] ==> value-parameter types: List<KotlinType> defined in org.jetbrains.kotlin.backend.common.descriptors.getFunction[ValueParameterDescriptorImpl]

'it' @ [84:91] ==> value-parameter it: IndexedValue<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.backend.common.descriptors.getFunction.<anonymous>[ValueParameterDescriptorImpl]

'index' @ [84:94] ==> public final val index: Int defined in kotlin.collections.IndexedValue[DeserializedPropertyDescriptor]

'unsubstitutedMemberScope' @ [86:12] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [87:14] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [87:43] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [87:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.backend.common.descriptors.getFunction[ValueParameterDescriptorImpl]

'FROM_BACKEND' @ [87:78] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [87:92] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'substitute' @ [87:101] ==> @Nullable public abstract fun substitute(@NotNull substitutor: TypeSubstitutor): FunctionDescriptor? defined in org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor[JavaMethodDescriptor]

'typeSubstitutor' @ [87:112] ==> val typeSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.backend.common.descriptors.getFunction[LocalVariableDescriptor]

'constructor' @ [92:20] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [92:32] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'getFunctionalClassKind' @ [92:55] ==> public fun DeclarationDescriptor.getFunctionalClassKind(): FunctionClassDescriptor.Kind? defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'kind' @ [93:16] ==> val kind: FunctionClassDescriptor.Kind? defined in org.jetbrains.kotlin.backend.common.descriptors.<get-isFunctionOrKFunctionType>[LocalVariableDescriptor]

'Function' @ [93:53] ==> enum entry Function defined in org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor.Kind[FakeCallableDescriptorForObject]

'kind' @ [93:65] ==> val kind: FunctionClassDescriptor.Kind? defined in org.jetbrains.kotlin.backend.common.descriptors.<get-isFunctionOrKFunctionType>[LocalVariableDescriptor]

'KFunction' @ [93:102] ==> enum entry KFunction defined in org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor.Kind[FakeCallableDescriptorForObject]

