'OverloadingConflictResolver<KotlinResolutionCandidate>' @ [35:5] ==> public constructor OverloadingConflictResolver<C : Any>(builtIns: KotlinBuiltIns, specificityComparator: TypeSpecificityComparator, getResultingDescriptor: (KotlinResolutionCandidate) -> CallableDescriptor, createEmptyConstraintSystem: () -> SimpleConstraintSystem, createFlatSignature: (KotlinResolutionCandidate) -> FlatSignature<KotlinResolutionCandidate>, getVariableCandidates: (KotlinResolutionCandidate) -> KotlinResolutionCandidate?, isFromSources: (CallableDescriptor) -> Boolean) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadingConflictResolver[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Any> -> KotlinResolutionCandidate

'builtIns' @ [36:9] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>[ValueParameterDescriptorImpl]

'specificityComparator' @ [37:9] ==> value-parameter specificityComparator: TypeSpecificityComparator defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>[ValueParameterDescriptorImpl]

'it' @ [40:13] ==> value-parameter it: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [40:16] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'candidateDescriptor' @ [40:29] ==> public open val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'SimpleConstraintSystemImpl' @ [42:11] ==> public constructor SimpleConstraintSystemImpl(constraintInjector: ConstraintInjector, builtIns: KotlinBuiltIns) defined in org.jetbrains.kotlin.resolve.calls.inference.components.SimpleConstraintSystemImpl[ClassConstructorDescriptorImpl]

'constraintInjector' @ [42:38] ==> value-parameter constraintInjector: ConstraintInjector defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>[ValueParameterDescriptorImpl]

'builtIns' @ [42:58] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>[ValueParameterDescriptorImpl]

'Companion' @ [43:9] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver[FakeCallableDescriptorForObject]

'it' @ [44:11] ==> value-parameter it: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'variableCandidateIfInvoke' @ [44:14] ==> public final val variableCandidateIfInvoke: KotlinResolutionCandidate? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'statelessCallbacks' @ [45:11] ==> value-parameter statelessCallbacks: KotlinResolutionStatelessCallbacks defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>[ValueParameterDescriptorImpl]

'isDescriptorFromSource' @ [45:30] ==> public abstract fun isDescriptorFromSource(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.components.KotlinResolutionStatelessCallbacks[SimpleFunctionDescriptorImpl]

'it' @ [45:53] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.<init>.<anonymous>[ValueParameterDescriptorImpl]

'candidate' @ [51:32] ==> value-parameter candidate: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'resolvedCall' @ [51:42] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[PropertyDescriptorImpl]

'resolvedCall' @ [52:38] ==> val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'candidateDescriptor' @ [52:51] ==> public open val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'original' @ [52:71] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'originalDescriptor' @ [53:43] ==> val originalDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'valueParameters' @ [53:62] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'HashMap' @ [56:48] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KotlinCallArgument
    <V : (Any..Any?)> -> KotlinType

'component1' @ [57:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'component2' @ [57:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component2(): ResolvedCallArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'resolvedCall' @ [57:61] ==> val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'argumentMappingByOriginal' @ [57:74] ==> public open lateinit var argumentMappingByOriginal: Map<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'if (resolvedValueArgument is ResolvedCallArgument.DefaultArgument) {
                    numDefaults++
                }
                else {
                    val originalValueParameter = originalValueParameters[valueParameter.index]
                    val parameterType = originalValueParameter.argumentValueType
                    for (valueArgument in resolvedValueArgument.arguments) {
                        valueArgumentToParameterType[valueArgument] = parameterType
                    }
                }' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'resolvedValueArgument' @ [58:21] ==> val resolvedValueArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'numDefaults' @ [59:21] ==> var numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'originalValueParameters' @ [62:50] ==> val originalValueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>) defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'valueParameter' @ [62:74] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'index' @ [62:89] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'originalValueParameter' @ [63:41] ==> val originalValueParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'argumentValueType' @ [63:64] ==> public final val ValueParameterDescriptor.argumentValueType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[PropertyImportedFromObject]

'resolvedValueArgument' @ [64:43] ==> val resolvedValueArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'arguments' @ [64:65] ==> public abstract val arguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[PropertyDescriptorImpl]

'valueArgumentToParameterType' @ [65:25] ==> val valueArgumentToParameterType: HashMap<KotlinCallArgument, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'valueArgument' @ [65:54] ==> val valueArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'parameterType' @ [65:71] ==> val parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'FlatSignature' @ [70:20] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature[FakeCallableDescriptorForObject]

'create' @ [70:34] ==> public final fun <T> create(origin: KotlinResolutionCandidate, descriptor: CallableDescriptor, numDefaults: Int, parameterTypes: List<KotlinType?>): FlatSignature<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.results.FlatSignature.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> KotlinResolutionCandidate

'candidate' @ [70:41] ==> value-parameter candidate: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[ValueParameterDescriptorImpl]

'originalDescriptor' @ [71:41] ==> val originalDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'numDefaults' @ [72:41] ==> var numDefaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'resolvedCall' @ [73:41] ==> val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'atom' @ [73:54] ==> public open val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'argumentsInParenthesis' @ [73:59] ==> public abstract val argumentsInParenthesis: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'map' @ [73:82] ==> public inline fun <T, R> Iterable<KotlinCallArgument>.map(transform: (KotlinCallArgument) -> KotlinType?): List<KotlinType?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument
    <R> -> KotlinType?

'valueArgumentToParameterType' @ [73:88] ==> val valueArgumentToParameterType: HashMap<KotlinCallArgument, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'it' @ [73:117] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature.<anonymous>[ValueParameterDescriptorImpl]

'listOfNotNull' @ [74:41] ==> public fun <T : Any> listOfNotNull(element: KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> KotlinType

'resolvedCall' @ [74:55] ==> val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'atom' @ [74:68] ==> public open val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCallAtom[PropertyDescriptorImpl]

'externalArgument' @ [74:73] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'let' @ [74:91] ==> @InlineOnly public inline fun <T, R> KotlinCallArgument.let(block: (KotlinCallArgument) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument
    <R> -> KotlinType?

'valueArgumentToParameterType' @ [74:97] ==> val valueArgumentToParameterType: HashMap<KotlinCallArgument, KotlinType> defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature[LocalVariableDescriptor]

'it' @ [74:126] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver.Companion.createFlatSignature.<anonymous>[ValueParameterDescriptorImpl]

