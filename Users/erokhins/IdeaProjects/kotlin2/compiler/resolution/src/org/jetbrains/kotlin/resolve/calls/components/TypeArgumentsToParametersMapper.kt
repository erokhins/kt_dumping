'TypeArgumentsMapping' @ [30:38] ==> private constructor TypeArgumentsMapping(diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping[ClassConstructorDescriptorImpl]

'emptyList' @ [30:59] ==> public fun <T> emptyList(): List<KotlinCallDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'TypeArgumentPlaceholder' @ [32:21] ==> public object TypeArgumentPlaceholder : TypeArgument defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCallArguments.kt[FakeCallableDescriptorForObject]

'TypeArgumentsMapping' @ [38:12] ==> private constructor TypeArgumentsMapping(diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping[ClassConstructorDescriptorImpl]

'diagnostics' @ [38:33] ==> value-parameter diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping.TypeArgumentsMappingImpl.<init>[ValueParameterDescriptorImpl]

'typeParameterToArgumentMap' @ [40:21] ==> private final val typeParameterToArgumentMap: Map<TypeParameterDescriptor, TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping.TypeArgumentsMappingImpl[PropertyDescriptorImpl]

'typeParameterDescriptor' @ [40:48] ==> value-parameter typeParameterDescriptor: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping.TypeArgumentsMappingImpl.getTypeArgument[ValueParameterDescriptorImpl]

'TypeArgumentPlaceholder' @ [40:76] ==> public object TypeArgumentPlaceholder : TypeArgument defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCallArguments.kt[FakeCallableDescriptorForObject]

'call' @ [45:13] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [45:18] ==> public abstract val typeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'isEmpty' @ [45:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'NoExplicitArguments' @ [46:41] ==> public object NoExplicitArguments : TypeArgumentsToParametersMapper.TypeArgumentsMapping defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping[FakeCallableDescriptorForObject]

'if (call.typeArguments.size != descriptor.typeParameters.size) {
            return TypeArgumentsMapping.TypeArgumentsMappingImpl(
                    listOf(WrongCountOfTypeArguments(descriptor, call.typeArguments.size)), emptyMap())
        }
        else {
            val typeParameterToArgumentMap = descriptor.typeParameters.zip(call.typeArguments).associate { it }
            return TypeArgumentsMapping.TypeArgumentsMappingImpl(listOf(), typeParameterToArgumentMap)
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'call' @ [49:13] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [49:18] ==> public abstract val typeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'size' @ [49:32] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'descriptor' @ [49:40] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeParameters' @ [49:51] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [49:66] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'TypeArgumentsMappingImpl' @ [50:41] ==> public constructor TypeArgumentsMappingImpl(diagnostics: List<KotlinCallDiagnostic>, typeParameterToArgumentMap: Map<TypeParameterDescriptor, TypeArgument>) defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping.TypeArgumentsMappingImpl[ClassConstructorDescriptorImpl]

'listOf' @ [51:21] ==> public fun <T> listOf(element: WrongCountOfTypeArguments): List<WrongCountOfTypeArguments> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WrongCountOfTypeArguments

'WrongCountOfTypeArguments' @ [51:28] ==> public constructor WrongCountOfTypeArguments(descriptor: CallableDescriptor, currentCount: Int) defined in org.jetbrains.kotlin.resolve.calls.model.WrongCountOfTypeArguments[ClassConstructorDescriptorImpl]

'descriptor' @ [51:54] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'call' @ [51:66] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [51:71] ==> public abstract val typeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'size' @ [51:85] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'emptyMap' @ [51:93] ==> public fun <K, V> emptyMap(): Map<TypeParameterDescriptor, TypeArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> TypeArgument

'descriptor' @ [54:46] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeParameters' @ [54:57] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'zip' @ [54:72] ==> public infix fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.zip(other: Iterable<TypeArgument>): List<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> TypeArgument

'call' @ [54:76] ==> value-parameter call: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[ValueParameterDescriptorImpl]

'typeArguments' @ [54:81] ==> public abstract val typeArguments: List<TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'associate' @ [54:96] ==> public inline fun <T, K, V> Iterable<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument>>.associate(transform: (Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument>) -> Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument>): Map<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?), TypeArgument>
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> TypeArgument

'it' @ [54:108] ==> value-parameter it: Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'TypeArgumentsMappingImpl' @ [55:41] ==> public constructor TypeArgumentsMappingImpl(diagnostics: List<KotlinCallDiagnostic>, typeParameterToArgumentMap: Map<TypeParameterDescriptor, TypeArgument>) defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.TypeArgumentsMapping.TypeArgumentsMappingImpl[ClassConstructorDescriptorImpl]

'listOf' @ [55:66] ==> @InlineOnly public inline fun <T> listOf(): List<KotlinCallDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'typeParameterToArgumentMap' @ [55:76] ==> val typeParameterToArgumentMap: Map<(TypeParameterDescriptor..TypeParameterDescriptor?), TypeArgument> defined in org.jetbrains.kotlin.resolve.calls.components.TypeArgumentsToParametersMapper.mapTypeArguments[LocalVariableDescriptor]

