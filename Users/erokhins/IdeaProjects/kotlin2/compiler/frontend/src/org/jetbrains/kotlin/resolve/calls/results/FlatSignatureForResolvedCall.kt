'candidateDescriptor' @ [33:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [33:50] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'originalDescriptor' @ [34:35] ==> val originalDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'valueParameters' @ [34:54] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'HashMap' @ [37:40] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueArgument
    <V : (Any..Any?)> -> KotlinType

'component1' @ [38:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'component2' @ [38:27] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'valueArguments' @ [38:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'entries' @ [38:68] ==> public abstract val entries: MutableSet<MutableMap.MutableEntry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'if (resolvedValueArgument is DefaultValueArgument) {
            numDefaults++
        }
        else {
            val originalValueParameter = originalValueParameters[valueParameter.index]
            val parameterType = originalValueParameter.argumentValueType
            for (valueArgument in resolvedValueArgument.arguments) {
                valueArgumentToParameterType[valueArgument] = parameterType
            }
        }' @ [39:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'resolvedValueArgument' @ [39:13] ==> val resolvedValueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'numDefaults' @ [40:13] ==> var numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'originalValueParameters' @ [43:42] ==> val originalValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'valueParameter' @ [43:66] ==> val valueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'index' @ [43:81] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'originalValueParameter' @ [44:33] ==> val originalValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'argumentValueType' @ [44:56] ==> public final val ValueParameterDescriptor.argumentValueType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[PropertyImportedFromObject]

'resolvedValueArgument' @ [45:35] ==> val resolvedValueArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'arguments' @ [45:57] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'valueArgumentToParameterType' @ [46:17] ==> val valueArgumentToParameterType: HashMap<ValueArgument, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'valueArgument' @ [46:46] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'parameterType' @ [46:63] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'FlatSignature' @ [51:12] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'create' @ [51:26] ==> public final fun <T> create(origin: RC, descriptor: CallableDescriptor, numDefaults: Int, parameterTypes: List<KotlinType?>): FlatSignature<RC> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> RC

'this' @ [51:33] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[ReceiverParameterDescriptorImpl]

'originalDescriptor' @ [51:39] ==> val originalDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'numDefaults' @ [51:59] ==> var numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'call' @ [51:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'valueArguments' @ [51:77] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'map' @ [51:92] ==> public inline fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.map(transform: ((ValueArgument..ValueArgument?)) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> KotlinType?

'valueArgumentToParameterType' @ [51:98] ==> val valueArgumentToParameterType: HashMap<ValueArgument, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature[LocalVariableDescriptor]

'it' @ [51:127] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.results.createFlatSignature.<anonymous>[ValueParameterDescriptorImpl]

'OverloadingConflictResolver' @ [57:5] ==> public constructor OverloadingConflictResolver<C : Any>(builtIns: KotlinBuiltIns, specificityComparator: TypeSpecificityComparator, getResultingDescriptor: (MutableResolvedCall<*>) -> CallableDescriptor, createEmptyConstraintSystem: () -> SimpleConstraintSystem, createFlatSignature: (MutableResolvedCall<*>) -> FlatSignature<MutableResolvedCall<*>>, getVariableCandidates: (MutableResolvedCall<*>) -> MutableResolvedCall<*>?, isFromSources: (CallableDescriptor) -> Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[DeserializedClassConstructorDescriptor]
Inferred types:
    <C : Any> -> MutableResolvedCall<*>

'builtIns' @ [58:9] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.results.createOverloadingConflictResolver[ValueParameterDescriptorImpl]

'specificityComparator' @ [59:9] ==> value-parameter specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.results.createOverloadingConflictResolver[ValueParameterDescriptorImpl]

'ConstraintSystemBuilderImpl' @ [61:9] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[FakeCallableDescriptorForObject]

'Companion' @ [61:37] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemBuilderImpl[FakeCallableDescriptorForObject]

'it' @ [63:12] ==> value-parameter it: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.results.createOverloadingConflictResolver.<anonymous>[ValueParameterDescriptorImpl]

'variableCall' @ [63:56] ==> public open val variableCall: MutableResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'DescriptorToSourceUtils' @ [64:11] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [64:35] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'it' @ [64:59] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.results.createOverloadingConflictResolver.<anonymous>[ValueParameterDescriptorImpl]

