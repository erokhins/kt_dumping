'resolvedCall' @ [56:30] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [56:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'when (receiverValue) {
        resolvedCall.extensionReceiver -> {
            val receiverParameter = callableDescriptor.extensionReceiverParameter
            if (receiverParameter != null) return receiverParameter.type.getSubtypesPredicate()
        }
        resolvedCall.dispatchReceiver -> {
            val rootCallableDescriptors = callableDescriptor.findTopMostOverriddenDescriptors()
            return or(rootCallableDescriptors.mapNotNull {
                it.dispatchReceiverParameter?.type?.let { TypeUtils.makeNullableIfNeeded(it, resolvedCall.call.isSafeCall()) }?.getSubtypesPredicate()
            })
        }
    }' @ [58:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'receiverValue' @ [58:11] ==> value-parameter receiverValue: ReceiverValue defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[ValueParameterDescriptorImpl]

'resolvedCall' @ [59:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[ValueParameterDescriptorImpl]

'extensionReceiver' @ [59:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callableDescriptor' @ [60:37] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[LocalVariableDescriptor]

'extensionReceiverParameter' @ [60:56] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'receiverParameter' @ [61:17] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[LocalVariableDescriptor]

'receiverParameter' @ [61:51] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[LocalVariableDescriptor]

'type' @ [61:69] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'getSubtypesPredicate' @ [61:74] ==> public fun KotlinType.getSubtypesPredicate(): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [63:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [63:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callableDescriptor' @ [64:43] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[LocalVariableDescriptor]

'findTopMostOverriddenDescriptors' @ [64:62] ==> public fun <D : CallableDescriptor> CallableDescriptor.findTopMostOverriddenDescriptors(): List<CallableDescriptor> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'or' @ [65:20] ==> public fun or(predicates: Collection<TypePredicate>): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'rootCallableDescriptors' @ [65:23] ==> val rootCallableDescriptors: List<CallableDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[LocalVariableDescriptor]

'mapNotNull' @ [65:47] ==> public inline fun <T, R : Any> Iterable<CallableDescriptor>.mapNotNull(transform: (CallableDescriptor) -> TypePredicate?): List<TypePredicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableDescriptor
    <R : Any> -> TypePredicate

'it' @ [66:17] ==> value-parameter it: CallableDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate.<anonymous>[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [66:20] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [66:47] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'let' @ [66:53] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'makeNullableIfNeeded' @ [66:69] ==> @NotNull public open fun makeNullableIfNeeded(@NotNull p0: KotlinType, p1: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [66:90] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [66:94] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.getReceiverTypePredicate[ValueParameterDescriptorImpl]

'call' @ [66:107] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'isSafeCall' @ [66:112] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'getSubtypesPredicate' @ [66:129] ==> public fun KotlinType.getSubtypesPredicate(): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'value' @ [79:22] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'createdAt' @ [79:28] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[PropertyDescriptorImpl]

'owner' @ [79:39] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.InstructionWithValue[PropertyDescriptorImpl]

'AllTypes' @ [79:55] ==> public object AllTypes : TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[FakeCallableDescriptorForObject]

'LinkedHashSet' @ [80:26] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypePredicate?

'typePredicates' @ [82:47] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'add' @ [82:62] ==> public open fun add(element: TypePredicate?): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'jetType' @ [82:66] ==> value-parameter jetType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addSubtypesOf[ValueParameterDescriptorImpl]

'getSubtypesPredicate' @ [82:75] ==> public fun KotlinType.getSubtypesPredicate(): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [85:30] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addByExplicitReceiver[ValueParameterDescriptorImpl]

'getExplicitReceiverValue' @ [85:54] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'receiverValue' @ [86:13] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addByExplicitReceiver[LocalVariableDescriptor]

'typePredicates' @ [86:36] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'add' @ [86:51] ==> public open fun add(element: TypePredicate?): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getReceiverTypePredicate' @ [86:55] ==> public fun getReceiverTypePredicate(resolvedCall: ResolvedCall<*>, receiverValue: ReceiverValue): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [86:80] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addByExplicitReceiver[ValueParameterDescriptorImpl]

'receiverValue' @ [86:94] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addByExplicitReceiver[LocalVariableDescriptor]

'inputValueIndex' @ [90:13] ==> value-parameter inputValueIndex: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[ValueParameterDescriptorImpl]

'to' @ [91:20] ==> value-parameter to: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[ValueParameterDescriptorImpl]

'getCall' @ [91:23] ==> public fun KtElement.getCall(context: BindingContext): Call? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [91:31] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'call' @ [92:22] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'calleeExpression' @ [92:27] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'callee' @ [94:26] ==> val callee: KtExpression defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'getReferenceTargets' @ [94:33] ==> public fun KtExpression.getReferenceTargets(context: BindingContext): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [94:53] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'filterIsInstance' @ [95:18] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> FunctionDescriptor

'sortedBy' @ [96:18] ==> public inline fun <T, R : Comparable<String>> Iterable<FunctionDescriptor>.sortedBy(crossinline selector: (FunctionDescriptor) -> String?): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R : Comparable<R>> -> String

'DescriptorRenderer' @ [96:29] ==> public companion object defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[FakeCallableDescriptorForObject]

'FQ_NAMES_IN_TYPES' @ [96:48] ==> @field:JvmField public final val FQ_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer.Companion[DeserializedPropertyDescriptor]

'render' @ [96:66] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [96:73] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument.<anonymous>[ValueParameterDescriptorImpl]

'candidates' @ [97:13] ==> val candidates: List<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'isEmpty' @ [97:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'call' @ [99:32] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'explicitReceiver' @ [99:37] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'if (explicitReceiver != null) 1 else 0' @ [100:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'explicitReceiver' @ [100:34] ==> val explicitReceiver: Receiver? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'ArrayList' @ [102:26] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypePredicate

'candidates' @ [104:27] ==> val candidates: List<FunctionDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'create' @ [105:59] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> create(@NotNull call: Call, @NotNull descriptor: FunctionDescriptor, @Nullable dispatchReceiver: ReceiverValue?, @NotNull explicitReceiverKind: ExplicitReceiverKind, @Nullable knownTypeParametersResultingSubstitutor: TypeSubstitutor?): (ResolutionCandidate<(FunctionDescriptor..FunctionDescriptor?)>..ResolutionCandidate<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.calls.tasks.ResolutionCandidate[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'call' @ [106:21] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'candidate' @ [107:21] ==> val candidate: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'NO_EXPLICIT_RECEIVER' @ [109:42] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'create' @ [112:50] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> create(@NotNull candidate: ResolutionCandidate<(FunctionDescriptor..FunctionDescriptor?)>, @NotNull trace: DelegatingBindingTrace, @NotNull tracing: TracingStrategy, @NotNull dataFlowInfoForArguments: MutableDataFlowInfoForArguments): ResolvedCallImpl<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'resolutionCandidate' @ [113:21] ==> val resolutionCandidate: (ResolutionCandidate<(FunctionDescriptor..FunctionDescriptor?)>..ResolutionCandidate<(FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'DelegatingBindingTrace' @ [114:21] ==> public constructor DelegatingBindingTrace(parentContext: BindingContext, name: String, withParentDiagnostics: Boolean = ..., filter: BindingTraceFilter = ..., allowSliceRewrite: Boolean = ...) defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[ClassConstructorDescriptorImpl]

'bindingContext' @ [114:44] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'EMPTY' @ [115:37] ==> public final val EMPTY: (TracingStrategy..TracingStrategy?) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaPropertyDescriptor]

'DataFlowInfoForArgumentsImpl' @ [116:21] ==> public constructor DataFlowInfoForArgumentsImpl(@NotNull initialInfo: DataFlowInfo, @NotNull call: Call) defined in org.jetbrains.kotlin.resolve.calls.model.DataFlowInfoForArgumentsImpl[JavaClassConstructorDescriptor]

'EMPTY' @ [116:63] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[PropertyDescriptorImpl]

'call' @ [116:70] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'mapValueArgumentsToParameters' @ [118:59] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> mapValueArgumentsToParameters(@NotNull call: Call, @NotNull tracing: TracingStrategy, @NotNull candidateCall: MutableResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>): (ValueArgumentsToParametersMapper.Status..ValueArgumentsToParametersMapper.Status?) defined in org.jetbrains.kotlin.resolve.calls.ValueArgumentsToParametersMapper[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'call' @ [118:89] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'EMPTY' @ [118:111] ==> public final val EMPTY: (TracingStrategy..TracingStrategy?) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaPropertyDescriptor]

'candidateCall' @ [118:118] ==> val candidateCall: ResolvedCallImpl<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'!' @ [119:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'status' @ [119:18] ==> val status: (ValueArgumentsToParametersMapper.Status..ValueArgumentsToParametersMapper.Status?) defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'isSuccess' @ [119:25] ==> public final val ValueArgumentsToParametersMapper.Status.isSuccess: Boolean[MyPropertyDescriptor]

'candidateCall' @ [121:40] ==> val candidateCall: ResolvedCallImpl<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'valueArguments' @ [121:54] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCallImpl<(FunctionDescriptor..FunctionDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'call' @ [122:33] ==> val call: Call defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'valueArguments' @ [122:38] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'inputValueIndex' @ [123:21] ==> value-parameter inputValueIndex: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[ValueParameterDescriptorImpl]

'argValueOffset' @ [123:39] ==> val argValueOffset: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'i' @ [124:17] ==> val i: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'i' @ [124:26] ==> val i: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'callArguments' @ [124:31] ==> val callArguments: List<(ValueArgument..ValueArgument?)> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'size' @ [124:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'candidateCall' @ [126:27] ==> val candidateCall: ResolvedCallImpl<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'getArgumentMapping' @ [126:41] ==> @NotNull @Override public open fun getArgumentMapping(@NotNull valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]

'callArguments' @ [126:60] ==> val callArguments: List<(ValueArgument..ValueArgument?)> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'i' @ [126:74] ==> val i: Int defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'mapping' @ [128:38] ==> val mapping: ArgumentMatch defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'valueParameter' @ [128:46] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'candidateArgumentMap' @ [129:36] ==> val candidateArgumentMap: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>) defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'candidateParameter' @ [129:57] ==> val candidateParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'if (resolvedArgument is VarargValueArgument)
                candidateParameter.varargElementType
            else
                candidateParameter.type' @ [130:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'resolvedArgument' @ [130:36] ==> val resolvedArgument: ResolvedValueArgument? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'candidateParameter' @ [131:17] ==> val candidateParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'varargElementType' @ [131:36] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'candidateParameter' @ [133:17] ==> val candidateParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'type' @ [133:36] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'predicates' @ [135:13] ==> val predicates: ArrayList<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'add' @ [135:24] ==> public open fun add(element: TypePredicate): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'if (expectedType != null) AllSubtypes(expectedType) else AllTypes' @ [135:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypePredicate, elseBranch: TypePredicate): TypePredicate[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypePredicate

'expectedType' @ [135:32] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'AllSubtypes' @ [135:54] ==> public constructor AllSubtypes(upperBound: KotlinType) defined in org.jetbrains.kotlin.cfg.pseudocode.AllSubtypes[ClassConstructorDescriptorImpl]

'expectedType' @ [135:66] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'AllTypes' @ [135:85] ==> public object AllTypes : TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[FakeCallableDescriptorForObject]

'or' @ [138:16] ==> public fun or(predicates: Collection<TypePredicate>): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'predicates' @ [138:19] ==> val predicates: ArrayList<TypePredicate> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.getTypePredicateForUnresolvedCallArgument[LocalVariableDescriptor]

'pseudocode' @ [142:9] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'getUsages' @ [142:20] ==> public abstract fun getUsages(value: PseudoValue?): List<Instruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'value' @ [142:30] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'forEach' @ [142:37] ==> @HidesMembers public inline fun <T> Iterable<Instruction>.forEach(action: (Instruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Instruction

'when (it) {
                is ReturnValueInstruction -> {
                    val returnElement = it.element
                    val functionDescriptor = when(returnElement) {
                        is KtReturnExpression -> returnElement.getTargetFunctionDescriptor(bindingContext)
                        else -> bindingContext[DECLARATION_TO_DESCRIPTOR, pseudocode.correspondingElement]
                    }
                    addSubtypesOf((functionDescriptor as? CallableDescriptor)?.returnType)
                }

                is ConditionalJumpInstruction ->
                    addSubtypesOf(builtIns.booleanType)

                is ThrowExceptionInstruction ->
                    addSubtypesOf(builtIns.throwable.defaultType)

                is MergeInstruction ->
                    addTypePredicates(it.outputValue)

                is AccessValueInstruction -> {
                    val accessTarget = it.target
                    val receiverValue = it.receiverValues[value]
                    if (receiverValue != null) {
                        typePredicates.add(getReceiverTypePredicate((accessTarget as AccessTarget.Call).resolvedCall, receiverValue))
                    }
                    else {
                        val expectedType = when (accessTarget) {
                            is AccessTarget.Call ->
                                (accessTarget.resolvedCall.resultingDescriptor as? VariableDescriptor)?.type
                            is AccessTarget.Declaration ->
                                accessTarget.descriptor.type
                            else ->
                                null
                        }
                        addSubtypesOf(expectedType)
                    }
                }

                is CallInstruction -> {
                    val receiverValue = it.receiverValues[value]
                    if (receiverValue != null) {
                        typePredicates.add(getReceiverTypePredicate(it.resolvedCall, receiverValue))
                    }
                    else {
                        it.arguments[value]?.let { parameter ->
                            val expectedType = when (it.resolvedCall.valueArguments[parameter]) {
                                is VarargValueArgument ->
                                    parameter.varargElementType
                                else ->
                                    parameter.type
                            }
                            addSubtypesOf(expectedType)
                        }
                    }
                }

                is MagicInstruction -> @Suppress("NON_EXHAUSTIVE_WHEN") when (it.kind) {
                    AND, OR ->
                        addSubtypesOf(builtIns.booleanType)

                    LOOP_RANGE_ITERATION ->
                        addByExplicitReceiver(bindingContext[LOOP_RANGE_ITERATOR_RESOLVED_CALL, value.element as? KtExpression])

                    VALUE_CONSUMER -> {
                        val element = it.element
                        when (element) {
                            element.getStrictParentOfType<KtWhileExpression>()?.condition -> addSubtypesOf(builtIns.booleanType)
                            is KtProperty -> {
                                val propertyDescriptor = bindingContext[DECLARATION_TO_DESCRIPTOR, element] as? PropertyDescriptor
                                propertyDescriptor?.accessors?.map {
                                    addByExplicitReceiver(bindingContext[DELEGATED_PROPERTY_RESOLVED_CALL, it])
                                }
                            }
                            is KtDelegatedSuperTypeEntry -> addSubtypesOf(bindingContext[TYPE, element.typeReference])
                        }
                    }

                    UNRESOLVED_CALL -> {
                        val typePredicate = getTypePredicateForUnresolvedCallArgument(it.element, it.inputValues.indexOf(value))
                        typePredicates.add(typePredicate)
                    }
                }
            }' @ [143:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?, entry4: Any?, entry5: Any?, entry6: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'it' @ [143:19] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [145:41] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [145:44] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.jumps.ReturnValueInstruction[PropertyDescriptorImpl]

'when(returnElement) {
                        is KtReturnExpression -> returnElement.getTargetFunctionDescriptor(bindingContext)
                        else -> bindingContext[DECLARATION_TO_DESCRIPTOR, pseudocode.correspondingElement]
                    }' @ [146:46] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'returnElement' @ [146:51] ==> val returnElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'returnElement' @ [147:50] ==> val returnElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'getTargetFunctionDescriptor' @ [147:64] ==> public fun KtReturnExpression.getTargetFunctionDescriptor(context: BindingContext): FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.bindingContextUtil in file BindingContextUtils.kt[SimpleFunctionDescriptorImpl]

'bindingContext' @ [147:92] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'bindingContext' @ [148:33] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [148:48] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'pseudocode' @ [148:75] ==> val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'correspondingElement' @ [148:86] ==> public abstract val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'addSubtypesOf' @ [150:21] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [150:36] ==> val functionDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'returnType' @ [150:80] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'addSubtypesOf' @ [154:21] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'builtIns' @ [154:35] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'booleanType' @ [154:44] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'addSubtypesOf' @ [157:21] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'builtIns' @ [157:35] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'throwable' @ [157:44] ==> public final val KotlinBuiltIns.throwable: ClassDescriptor[MyPropertyDescriptor]

'defaultType' @ [157:54] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'addTypePredicates' @ [160:21] ==> local final fun addTypePredicates(value: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'it' @ [160:39] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'outputValue' @ [160:42] ==> public open val outputValue: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MergeInstruction[PropertyDescriptorImpl]

'it' @ [163:40] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [163:43] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessValueInstruction[PropertyDescriptorImpl]

'it' @ [164:41] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'receiverValues' @ [164:44] ==> public open val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessValueInstruction[PropertyDescriptorImpl]

'value' @ [164:59] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'if (receiverValue != null) {
                        typePredicates.add(getReceiverTypePredicate((accessTarget as AccessTarget.Call).resolvedCall, receiverValue))
                    }
                    else {
                        val expectedType = when (accessTarget) {
                            is AccessTarget.Call ->
                                (accessTarget.resolvedCall.resultingDescriptor as? VariableDescriptor)?.type
                            is AccessTarget.Declaration ->
                                accessTarget.descriptor.type
                            else ->
                                null
                        }
                        addSubtypesOf(expectedType)
                    }' @ [165:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'receiverValue' @ [165:25] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'typePredicates' @ [166:25] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'add' @ [166:40] ==> public open fun add(element: TypePredicate?): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getReceiverTypePredicate' @ [166:44] ==> public fun getReceiverTypePredicate(resolvedCall: ResolvedCall<*>, receiverValue: ReceiverValue): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'accessTarget' @ [166:70] ==> val accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [166:105] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[PropertyDescriptorImpl]

'receiverValue' @ [166:119] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'when (accessTarget) {
                            is AccessTarget.Call ->
                                (accessTarget.resolvedCall.resultingDescriptor as? VariableDescriptor)?.type
                            is AccessTarget.Declaration ->
                                accessTarget.descriptor.type
                            else ->
                                null
                        }' @ [169:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'accessTarget' @ [169:50] ==> val accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'accessTarget' @ [171:34] ==> val accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [171:47] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[PropertyDescriptorImpl]

'resultingDescriptor' @ [171:60] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'type' @ [171:105] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'accessTarget' @ [173:33] ==> val accessTarget: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [173:46] ==> public final val descriptor: VariableDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Declaration[PropertyDescriptorImpl]

'type' @ [173:57] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'addSubtypesOf' @ [177:25] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'expectedType' @ [177:39] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'it' @ [182:41] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'receiverValues' @ [182:44] ==> public open val receiverValues: Map<PseudoValue, ReceiverValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'value' @ [182:59] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'if (receiverValue != null) {
                        typePredicates.add(getReceiverTypePredicate(it.resolvedCall, receiverValue))
                    }
                    else {
                        it.arguments[value]?.let { parameter ->
                            val expectedType = when (it.resolvedCall.valueArguments[parameter]) {
                                is VarargValueArgument ->
                                    parameter.varargElementType
                                else ->
                                    parameter.type
                            }
                            addSubtypesOf(expectedType)
                        }
                    }' @ [183:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean?, elseBranch: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean?

'receiverValue' @ [183:25] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'typePredicates' @ [184:25] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'add' @ [184:40] ==> public open fun add(element: TypePredicate?): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'getReceiverTypePredicate' @ [184:44] ==> public fun getReceiverTypePredicate(resolvedCall: ResolvedCall<*>, receiverValue: ReceiverValue): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'it' @ [184:69] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [184:72] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'receiverValue' @ [184:86] ==> val receiverValue: ReceiverValue? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'it' @ [187:25] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [187:28] ==> public final val arguments: Map<PseudoValue, ValueParameterDescriptor> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'value' @ [187:38] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'let' @ [187:46] ==> @InlineOnly public inline fun <T, R> ValueParameterDescriptor.let(block: (ValueParameterDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueParameterDescriptor
    <R> -> Boolean

'when (it.resolvedCall.valueArguments[parameter]) {
                                is VarargValueArgument ->
                                    parameter.varargElementType
                                else ->
                                    parameter.type
                            }' @ [188:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'it' @ [188:54] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [188:57] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'valueArguments' @ [188:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'parameter' @ [188:85] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'parameter' @ [190:37] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'varargElementType' @ [190:47] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'parameter' @ [192:37] ==> value-parameter parameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [192:47] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'addSubtypesOf' @ [194:29] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'expectedType' @ [194:43] ==> val expectedType: KotlinType? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>.<anonymous>[LocalVariableDescriptor]

'Suppress' @ [199:40] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'when (it.kind) {
                    AND, OR ->
                        addSubtypesOf(builtIns.booleanType)

                    LOOP_RANGE_ITERATION ->
                        addByExplicitReceiver(bindingContext[LOOP_RANGE_ITERATOR_RESOLVED_CALL, value.element as? KtExpression])

                    VALUE_CONSUMER -> {
                        val element = it.element
                        when (element) {
                            element.getStrictParentOfType<KtWhileExpression>()?.condition -> addSubtypesOf(builtIns.booleanType)
                            is KtProperty -> {
                                val propertyDescriptor = bindingContext[DECLARATION_TO_DESCRIPTOR, element] as? PropertyDescriptor
                                propertyDescriptor?.accessors?.map {
                                    addByExplicitReceiver(bindingContext[DELEGATED_PROPERTY_RESOLVED_CALL, it])
                                }
                            }
                            is KtDelegatedSuperTypeEntry -> addSubtypesOf(bindingContext[TYPE, element.typeReference])
                        }
                    }

                    UNRESOLVED_CALL -> {
                        val typePredicate = getTypePredicateForUnresolvedCallArgument(it.element, it.inputValues.indexOf(value))
                        typePredicates.add(typePredicate)
                    }
                }' @ [199:73] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?, entry3: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'it' @ [199:79] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [199:82] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'AND' @ [200:21] ==> enum entry AND defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'OR' @ [200:26] ==> enum entry OR defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'addSubtypesOf' @ [201:25] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'builtIns' @ [201:39] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'booleanType' @ [201:48] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'LOOP_RANGE_ITERATION' @ [203:21] ==> enum entry LOOP_RANGE_ITERATION defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'addByExplicitReceiver' @ [204:25] ==> local final fun addByExplicitReceiver(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'bindingContext' @ [204:47] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'LOOP_RANGE_ITERATOR_RESOLVED_CALL' @ [204:62] ==> public final val LOOP_RANGE_ITERATOR_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'value' @ [204:97] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'element' @ [204:103] ==> public abstract val element: KtElement? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[PropertyDescriptorImpl]

'VALUE_CONSUMER' @ [206:21] ==> enum entry VALUE_CONSUMER defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'it' @ [207:39] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [207:42] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'when (element) {
                            element.getStrictParentOfType<KtWhileExpression>()?.condition -> addSubtypesOf(builtIns.booleanType)
                            is KtProperty -> {
                                val propertyDescriptor = bindingContext[DECLARATION_TO_DESCRIPTOR, element] as? PropertyDescriptor
                                propertyDescriptor?.accessors?.map {
                                    addByExplicitReceiver(bindingContext[DELEGATED_PROPERTY_RESOLVED_CALL, it])
                                }
                            }
                            is KtDelegatedSuperTypeEntry -> addSubtypesOf(bindingContext[TYPE, element.typeReference])
                        }' @ [208:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any?, entry1: Any?, entry2: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any?

'element' @ [208:31] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'element' @ [209:29] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'getStrictParentOfType' @ [209:37] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtWhileExpression? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtWhileExpression

'condition' @ [209:81] ==> public final val KtWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'addSubtypesOf' @ [209:94] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'builtIns' @ [209:108] ==> value-parameter builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'booleanType' @ [209:117] ==> public final val KotlinBuiltIns.booleanType: SimpleType[MyPropertyDescriptor]

'bindingContext' @ [211:58] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [211:73] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [211:100] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'propertyDescriptor' @ [212:33] ==> val propertyDescriptor: PropertyDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'accessors' @ [212:53] ==> public final val PropertyDescriptor.accessors: (MutableList<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>..List<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>)[MyPropertyDescriptor]

'map' @ [212:64] ==> public inline fun <T, R> Iterable<(PropertyAccessorDescriptor..PropertyAccessorDescriptor?)>.map(transform: ((PropertyAccessorDescriptor..PropertyAccessorDescriptor?)) -> Unit): List<Unit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor..org.jetbrains.kotlin.descriptors.PropertyAccessorDescriptor?)
    <R> -> Unit

'addByExplicitReceiver' @ [213:37] ==> local final fun addByExplicitReceiver(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'bindingContext' @ [213:59] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'DELEGATED_PROPERTY_RESOLVED_CALL' @ [213:74] ==> public final val DELEGATED_PROPERTY_RESOLVED_CALL: (WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(VariableAccessorDescriptor..VariableAccessorDescriptor?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [213:108] ==> value-parameter it: (PropertyAccessorDescriptor..PropertyAccessorDescriptor?) defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addSubtypesOf' @ [216:61] ==> local final fun addSubtypesOf(jetType: KotlinType?): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'bindingContext' @ [216:75] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'TYPE' @ [216:90] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [216:96] ==> val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [216:104] ==> public final val KtDelegatedSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'UNRESOLVED_CALL' @ [220:21] ==> enum entry UNRESOLVED_CALL defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[FakeCallableDescriptorForObject]

'getTypePredicateForUnresolvedCallArgument' @ [221:45] ==> local final fun getTypePredicateForUnresolvedCallArgument(to: KtElement, inputValueIndex: Int): TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'it' @ [221:87] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [221:90] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'it' @ [221:99] ==> value-parameter it: Instruction defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[ValueParameterDescriptorImpl]

'inputValues' @ [221:102] ==> public abstract val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'indexOf' @ [221:114] ==> public abstract fun indexOf(element: PseudoValue): Int defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'value' @ [221:122] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates[ValueParameterDescriptorImpl]

'typePredicates' @ [222:25] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'add' @ [222:40] ==> public open fun add(element: TypePredicate?): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'typePredicate' @ [222:44] ==> val typePredicate: TypePredicate? defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate.addTypePredicates.<anonymous>[LocalVariableDescriptor]

'addTypePredicates' @ [229:5] ==> local final fun addTypePredicates(value: PseudoValue): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[SimpleFunctionDescriptorImpl]

'value' @ [229:23] ==> value-parameter value: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[ValueParameterDescriptorImpl]

'and' @ [230:12] ==> public fun and(predicates: Collection<TypePredicate>): TypePredicate defined in org.jetbrains.kotlin.cfg.pseudocode in file TypePredicate.kt[SimpleFunctionDescriptorImpl]

'typePredicates' @ [230:16] ==> val typePredicates: LinkedHashSet<TypePredicate?> defined in org.jetbrains.kotlin.cfg.pseudocode.getExpectedTypePredicate[LocalVariableDescriptor]

'filterNotNull' @ [230:31] ==> public fun <T : Any> Iterable<TypePredicate?>.filterNotNull(): List<TypePredicate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> TypePredicate

'when (this) {
        is CallInstruction -> return resolvedCall.resultingDescriptor
        else -> PseudocodeUtil.extractVariableDescriptorIfAny(this, bindingContext)
    }' @ [234:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'this' @ [234:18] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getPrimaryDeclarationDescriptorIfAny[ReceiverParameterDescriptorImpl]

'resolvedCall' @ [235:38] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.CallInstruction[PropertyDescriptorImpl]

'resultingDescriptor' @ [235:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'extractVariableDescriptorIfAny' @ [236:32] ==> @Nullable public open fun extractVariableDescriptorIfAny(@NotNull instruction: Instruction, @NotNull bindingContext: BindingContext): VariableDescriptor? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'this' @ [236:63] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getPrimaryDeclarationDescriptorIfAny[ReceiverParameterDescriptorImpl]

'bindingContext' @ [236:69] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getPrimaryDeclarationDescriptorIfAny[ValueParameterDescriptorImpl]

'owner' @ [241:13] ==> public abstract var owner: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'isSideEffectFree' @ [241:19] ==> public abstract fun isSideEffectFree(instruction: Instruction): Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'this' @ [241:36] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.sideEffectFree[ReceiverParameterDescriptorImpl]

'this' @ [244:9] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.calcSideEffectFree[ReceiverParameterDescriptorImpl]

'!' @ [245:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inputValues' @ [245:10] ==> public abstract val inputValues: List<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.Instruction[PropertyDescriptorImpl]

'all' @ [245:22] ==> public inline fun <T> Iterable<PseudoValue>.all(predicate: (PseudoValue) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue

'it' @ [245:28] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.calcSideEffectFree.<anonymous>[ValueParameterDescriptorImpl]

'createdAt' @ [245:31] ==> public abstract val createdAt: InstructionWithValue? defined in org.jetbrains.kotlin.cfg.pseudocode.PseudoValue[PropertyDescriptorImpl]

'sideEffectFree' @ [245:42] ==> public val Instruction.sideEffectFree: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[PropertyDescriptorImpl]

'when (this) {
        is ReadValueInstruction -> target.let {
            when (it) {
                is AccessTarget.Call -> when (it.resolvedCall.resultingDescriptor) {
                    is LocalVariableDescriptor, is ValueParameterDescriptor, is ReceiverParameterDescriptor -> true
                    else -> false
                }

                else -> when (element) {
                    is KtNamedFunction -> element.name == null
                    is KtConstantExpression, is KtLambdaExpression, is KtStringTemplateExpression -> true
                    else -> false
                }
            }
        }

        is MagicInstruction -> kind.sideEffectFree

        else -> false
    }' @ [247:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [247:18] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.calcSideEffectFree[ReceiverParameterDescriptorImpl]

'target' @ [248:36] ==> public final val target: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[PropertyDescriptorImpl]

'let' @ [248:43] ==> @InlineOnly public inline fun <T, R> AccessTarget.let(block: (AccessTarget) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AccessTarget
    <R> -> Boolean

'when (it) {
                is AccessTarget.Call -> when (it.resolvedCall.resultingDescriptor) {
                    is LocalVariableDescriptor, is ValueParameterDescriptor, is ReceiverParameterDescriptor -> true
                    else -> false
                }

                else -> when (element) {
                    is KtNamedFunction -> element.name == null
                    is KtConstantExpression, is KtLambdaExpression, is KtStringTemplateExpression -> true
                    else -> false
                }
            }' @ [249:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [249:19] ==> value-parameter it: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.calcSideEffectFree.<anonymous>[ValueParameterDescriptorImpl]

'when (it.resolvedCall.resultingDescriptor) {
                    is LocalVariableDescriptor, is ValueParameterDescriptor, is ReceiverParameterDescriptor -> true
                    else -> false
                }' @ [250:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'it' @ [250:47] ==> value-parameter it: AccessTarget defined in org.jetbrains.kotlin.cfg.pseudocode.calcSideEffectFree.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [250:50] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.AccessTarget.Call[PropertyDescriptorImpl]

'resultingDescriptor' @ [250:63] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'when (element) {
                    is KtNamedFunction -> element.name == null
                    is KtConstantExpression, is KtLambdaExpression, is KtStringTemplateExpression -> true
                    else -> false
                }' @ [255:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'element' @ [255:31] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[PropertyDescriptorImpl]

'element' @ [256:43] ==> public open val element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.ReadValueInstruction[PropertyDescriptorImpl]

'name' @ [256:51] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'kind' @ [263:32] ==> public final val kind: MagicKind defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicInstruction[PropertyDescriptorImpl]

'sideEffectFree' @ [263:37] ==> public final val sideEffectFree: Boolean defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.eval.MagicKind[PropertyDescriptorImpl]

'ArrayList' @ [270:19] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PseudoValue

'getElementValue' @ [273:9] ==> public abstract fun getElementValue(element: KtElement?): PseudoValue? defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[SimpleFunctionDescriptorImpl]

'element' @ [273:25] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively[ValueParameterDescriptorImpl]

'let' @ [273:35] ==> @InlineOnly public inline fun <T, R> PseudoValue.let(block: (PseudoValue) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PseudoValue
    <R> -> Boolean

'results' @ [273:41] ==> val results: ArrayList<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively[LocalVariableDescriptor]

'add' @ [273:49] ==> public open fun add(element: PseudoValue): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'it' @ [273:53] ==> value-parameter it: PseudoValue defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively.collectValues.<anonymous>[ValueParameterDescriptorImpl]

'localDeclarations' @ [274:31] ==> public abstract val localDeclarations: Set<LocalFunctionDeclarationInstruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'localFunction' @ [275:13] ==> val localFunction: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively.collectValues[LocalVariableDescriptor]

'body' @ [275:27] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'collectValues' @ [275:32] ==> local final fun Pseudocode.collectValues(): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively[SimpleFunctionDescriptorImpl]

'collectValues' @ [279:5] ==> local final fun Pseudocode.collectValues(): Unit defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively[SimpleFunctionDescriptorImpl]

'results' @ [280:12] ==> val results: ArrayList<PseudoValue> defined in org.jetbrains.kotlin.cfg.pseudocode.getElementValuesRecursively[LocalVariableDescriptor]

'?:' @ [284:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration?): KtDeclaration?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration?

'getParentOfType' @ [284:29] ==> @SafeVarargs @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getParentOfType(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (KtDeclaration..KtDeclaration?)>..Class<out (KtDeclaration..KtDeclaration?)>?)): KtDeclaration? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (org.jetbrains.kotlin.psi.KtDeclaration..org.jetbrains.kotlin.psi.KtDeclaration?)

'this' @ [284:45] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.containingDeclarationForPseudocode[ReceiverParameterDescriptorImpl]

'java' @ [284:80] ==> public val <T> KClass<KtDeclarationWithBody>.java: Class<KtDeclarationWithBody> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody

'java' @ [284:109] ==> public val <T> KClass<KtClassOrObject>.java: Class<KtClassOrObject> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtClassOrObject

'java' @ [284:131] ==> public val <T> KClass<KtScript>.java: Class<KtScript> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtScript

'getNonStrictParentOfType' @ [285:20] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'?:' @ [288:42] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtDeclaration?, right: KtDeclaration): KtDeclaration[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtDeclaration

'this' @ [288:43] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[ReceiverParameterDescriptorImpl]

'let' @ [288:72] ==> @InlineOnly public inline fun <T, R> KtFunctionLiteral.let(block: (KtFunctionLiteral) -> KtDeclaration?): KtDeclaration? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunctionLiteral
    <R> -> KtDeclaration?

'it' @ [289:9] ==> value-parameter it: KtFunctionLiteral defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode.<anonymous>[ValueParameterDescriptorImpl]

'parents' @ [289:12] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil in file psiUtils.kt[PropertyDescriptorImpl]

'firstOrNull' @ [289:20] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [289:34] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [289:57] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [290:10] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[ReceiverParameterDescriptorImpl]

'generatePseudocode' @ [292:46] ==> @NotNull public open fun generatePseudocode(@NotNull declaration: KtDeclaration, @NotNull bindingContext: BindingContext): Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.PseudocodeUtil[JavaMethodDescriptor]

'enclosingPseudocodeDeclaration' @ [292:65] ==> val enclosingPseudocodeDeclaration: KtDeclaration defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[LocalVariableDescriptor]

'context' @ [292:97] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[ValueParameterDescriptorImpl]

'enclosingPseudocode' @ [293:12] ==> val enclosingPseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[LocalVariableDescriptor]

'getPseudocodeByElement' @ [293:32] ==> public fun Pseudocode.getPseudocodeByElement(element: KtElement): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [293:55] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[ReceiverParameterDescriptorImpl]

'containingDeclarationForPseudocode' @ [296:66] ==> public val KtElement.containingDeclarationForPseudocode: KtDeclaration? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[PropertyDescriptorImpl]

'getContainingPseudocode' @ [296:102] ==> public fun KtDeclaration.getContainingPseudocode(context: BindingContext): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'context' @ [296:126] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.pseudocode.getContainingPseudocode[ValueParameterDescriptorImpl]

'correspondingElement' @ [299:9] ==> public abstract val correspondingElement: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'element' @ [299:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getPseudocodeByElement[ValueParameterDescriptorImpl]

'this' @ [299:49] ==> <this> defined in org.jetbrains.kotlin.cfg.pseudocode.getPseudocodeByElement[ReceiverParameterDescriptorImpl]

'localDeclarations' @ [301:5] ==> public abstract val localDeclarations: Set<LocalFunctionDeclarationInstruction> defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

'forEach' @ [301:23] ==> @HidesMembers public inline fun <T> Iterable<LocalFunctionDeclarationInstruction>.forEach(action: (LocalFunctionDeclarationInstruction) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalFunctionDeclarationInstruction

'decl' @ [301:41] ==> value-parameter decl: LocalFunctionDeclarationInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.getPseudocodeByElement.<anonymous>[ValueParameterDescriptorImpl]

'body' @ [301:46] ==> public final val body: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.instructions.special.LocalFunctionDeclarationInstruction[PropertyDescriptorImpl]

'getPseudocodeByElement' @ [301:51] ==> public fun Pseudocode.getPseudocodeByElement(element: KtElement): Pseudocode? defined in org.jetbrains.kotlin.cfg.pseudocode in file pseudocodeUtils.kt[SimpleFunctionDescriptorImpl]

'element' @ [301:74] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.cfg.pseudocode.getPseudocodeByElement[ValueParameterDescriptorImpl]

'let' @ [301:84] ==> @InlineOnly public inline fun <T, R> Pseudocode.let(block: (Pseudocode) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pseudocode
    <R> -> Nothing

'it' @ [301:97] ==> value-parameter it: Pseudocode defined in org.jetbrains.kotlin.cfg.pseudocode.getPseudocodeByElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToInstruction' @ [306:13] ==> public abstract fun resolveToInstruction(): Instruction defined in org.jetbrains.kotlin.cfg.Label[SimpleFunctionDescriptorImpl]

'pseudocode' @ [306:39] ==> public abstract val pseudocode: Pseudocode defined in org.jetbrains.kotlin.cfg.Label[PropertyDescriptorImpl]

'errorInstruction' @ [306:50] ==> public abstract val errorInstruction: SubroutineExitInstruction defined in org.jetbrains.kotlin.cfg.pseudocode.Pseudocode[PropertyDescriptorImpl]

