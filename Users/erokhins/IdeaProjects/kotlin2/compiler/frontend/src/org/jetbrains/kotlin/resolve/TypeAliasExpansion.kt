'constructor' @ [31:26] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.getReplacement[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [31:38] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'if (descriptor is TypeParameterDescriptor)
            mapping[descriptor]
        else
            null' @ [32:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeProjection?, elseBranch: TypeProjection?): TypeProjection?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeProjection?

'descriptor' @ [32:20] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.getReplacement[LocalVariableDescriptor]

'mapping' @ [33:13] ==> public final val mapping: Map<TypeParameterDescriptor, TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[PropertyDescriptorImpl]

'descriptor' @ [33:21] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.getReplacement[LocalVariableDescriptor]

'this' @ [39:13] ==> <this> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[LazyClassReceiverParameterDescriptor]

'descriptor' @ [39:18] ==> public final val descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[PropertyDescriptorImpl]

'descriptor' @ [39:32] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.isRecursion[ValueParameterDescriptorImpl]

'parent' @ [39:47] ==> public final val parent: TypeAliasExpansion? defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[PropertyDescriptorImpl]

'isRecursion' @ [39:55] ==> public final fun isRecursion(descriptor: TypeAliasDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[SimpleFunctionDescriptorImpl]

'descriptor' @ [39:67] ==> value-parameter descriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.isRecursion[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [47:34] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[ValueParameterDescriptorImpl]

'typeConstructor' @ [47:54] ==> public final val TypeAliasDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'parameters' @ [47:70] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [47:81] ==> public inline fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.map(transform: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> TypeParameterDescriptor): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeParameterDescriptor

'it' @ [47:87] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create.<anonymous>[ValueParameterDescriptorImpl]

'original' @ [47:90] ==> public final val TypeParameterDescriptor.original: TypeParameterDescriptor[MyPropertyDescriptor]

'typeParameters' @ [48:35] ==> val typeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[LocalVariableDescriptor]

'zip' @ [48:50] ==> public infix fun <T, R> Iterable<TypeParameterDescriptor>.zip(other: Iterable<TypeProjection>): List<Pair<TypeParameterDescriptor, TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor
    <R> -> TypeProjection

'arguments' @ [48:54] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[ValueParameterDescriptorImpl]

'toMap' @ [48:65] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, TypeProjection>>.toMap(): Map<TypeParameterDescriptor, TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> TypeProjection

'TypeAliasExpansion' @ [49:20] ==> private constructor TypeAliasExpansion(parent: TypeAliasExpansion?, descriptor: TypeAliasDescriptor, arguments: List<TypeProjection>, mapping: Map<TypeParameterDescriptor, TypeProjection>) defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion[ClassConstructorDescriptorImpl]

'parent' @ [49:39] ==> value-parameter parent: TypeAliasExpansion? defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[ValueParameterDescriptorImpl]

'typeAliasDescriptor' @ [49:47] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[ValueParameterDescriptorImpl]

'arguments' @ [49:68] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[ValueParameterDescriptorImpl]

'mappedArguments' @ [49:79] ==> val mappedArguments: Map<TypeParameterDescriptor, TypeProjection> defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.create[LocalVariableDescriptor]

'create' @ [53:17] ==> public final fun create(parent: TypeAliasExpansion?, typeAliasDescriptor: TypeAliasDescriptor, arguments: List<TypeProjection>): TypeAliasExpansion defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion[SimpleFunctionDescriptorImpl]

'typeAliasDescriptor' @ [53:30] ==> value-parameter typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.TypeAliasExpansion.Companion.createWithFormalArguments[ValueParameterDescriptorImpl]

'emptyList' @ [53:51] ==> public fun <T> emptyList(): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

