'transformToResolvedCall' @ [76:26] ==> public final fun <D : CallableDescriptor> transformToResolvedCall(completedCallAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor? = ...): ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'resolvedCallAtom' @ [76:50] ==> value-parameter resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.onlyTransform[ValueParameterDescriptorImpl]

'baseResolvedCall' @ [82:25] ==> value-parameter baseResolvedCall: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'resultCallAtom' @ [82:42] ==> public final val resultCallAtom: ResolvedCallAtom? defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[DeserializedPropertyDescriptor]

'when (baseResolvedCall.type) {
            CallResolutionResult.Type.PARTIAL -> {
                context.trace.record(BindingContext.ONLY_RESOLVED_CALL, candidate.atom.psiKotlinCall.psiCall, baseResolvedCall)

                return createStubResolvedCallAndWriteItToTrace(candidate, context.trace)
            }
            CallResolutionResult.Type.ERROR, CallResolutionResult.Type.COMPLETED -> {
                val resultSubstitutor = baseResolvedCall.constraintSystem.buildResultingSubstitutor()
                val ktPrimitiveCompleter = ResolvedAtomCompleter(resultSubstitutor, context.trace, context, this,
                                                                 expressionTypingServices, argumentTypeResolver, doubleColonExpressionResolver,
                                                                 languageFeatureSettings)

                for (subKtPrimitive in candidate.subResolvedAtoms) {
                    ktPrimitiveCompleter.completeAll(subKtPrimitive)
                }

                return ktPrimitiveCompleter.completeResolvedCall(candidate) as ResolvedCall<D>
            }
            CallResolutionResult.Type.ALL_CANDIDATES -> error("Cannot transform result for ALL_CANDIDATES mode")
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'baseResolvedCall' @ [83:15] ==> value-parameter baseResolvedCall: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'type' @ [83:32] ==> public final val type: CallResolutionResult.Type defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[DeserializedPropertyDescriptor]

'PARTIAL' @ [84:39] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'context' @ [85:17] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'trace' @ [85:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'record' @ [85:31] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(Call..Call?), (CallResolutionResult..CallResolutionResult?)>..WritableSlice<(Call..Call?), (CallResolutionResult..CallResolutionResult?)>?), key: (Call..Call?), value: (CallResolutionResult..CallResolutionResult?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult..org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult?)

'ONLY_RESOLVED_CALL' @ [85:53] ==> public final val ONLY_RESOLVED_CALL: (WritableSlice<(Call..Call?), (CallResolutionResult..CallResolutionResult?)>..WritableSlice<(Call..Call?), (CallResolutionResult..CallResolutionResult?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'candidate' @ [85:73] ==> val candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'atom' @ [85:83] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [85:88] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'psiCall' @ [85:102] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'baseResolvedCall' @ [85:111] ==> value-parameter baseResolvedCall: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'createStubResolvedCallAndWriteItToTrace' @ [87:24] ==> public final fun <D : CallableDescriptor> createStubResolvedCallAndWriteItToTrace(candidate: ResolvedCallAtom, trace: BindingTrace): ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidate' @ [87:64] ==> val candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'context' @ [87:75] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'trace' @ [87:83] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'ERROR' @ [89:39] ==> enum entry ERROR defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'COMPLETED' @ [89:72] ==> enum entry COMPLETED defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'baseResolvedCall' @ [90:41] ==> value-parameter baseResolvedCall: CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'constraintSystem' @ [90:58] ==> public final val constraintSystem: ConstraintStorage defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult[DeserializedPropertyDescriptor]

'buildResultingSubstitutor' @ [90:75] ==> public fun ConstraintStorage.buildResultingSubstitutor(): NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'ResolvedAtomCompleter' @ [91:44] ==> public constructor ResolvedAtomCompleter(resultSubstitutor: NewTypeSubstitutor, trace: BindingTrace, topLevelCallContext: BasicCallResolutionContext, kotlinToResolvedCallTransformer: KotlinToResolvedCallTransformer, expressionTypingServices: ExpressionTypingServices, argumentTypeResolver: ArgumentTypeResolver, doubleColonExpressionResolver: DoubleColonExpressionResolver, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[ClassConstructorDescriptorImpl]

'resultSubstitutor' @ [91:66] ==> val resultSubstitutor: NewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'context' @ [91:85] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'trace' @ [91:93] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [91:100] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[ValueParameterDescriptorImpl]

'this' @ [91:109] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[LazyClassReceiverParameterDescriptor]

'expressionTypingServices' @ [92:66] ==> private final val expressionTypingServices: ExpressionTypingServices defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'argumentTypeResolver' @ [92:92] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'doubleColonExpressionResolver' @ [92:114] ==> private final val doubleColonExpressionResolver: DoubleColonExpressionResolver defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'languageFeatureSettings' @ [93:66] ==> private final val languageFeatureSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'candidate' @ [95:40] ==> val candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'subResolvedAtoms' @ [95:50] ==> public final lateinit var subResolvedAtoms: List<ResolvedAtom> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'ktPrimitiveCompleter' @ [96:21] ==> val ktPrimitiveCompleter: ResolvedAtomCompleter defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'completeAll' @ [96:42] ==> public final fun completeAll(resolvedAtom: ResolvedAtom): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'subKtPrimitive' @ [96:54] ==> val subKtPrimitive: ResolvedAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'ktPrimitiveCompleter' @ [99:24] ==> val ktPrimitiveCompleter: ResolvedAtomCompleter defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'completeResolvedCall' @ [99:45] ==> public final fun completeResolvedCall(resolvedCallAtom: ResolvedCallAtom): ResolvedCall<*>? defined in org.jetbrains.kotlin.resolve.calls.tower.ResolvedAtomCompleter[SimpleFunctionDescriptorImpl]

'candidate' @ [99:66] ==> val candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformAndReport[LocalVariableDescriptor]

'ALL_CANDIDATES' @ [101:39] ==> enum entry ALL_CANDIDATES defined in org.jetbrains.kotlin.resolve.calls.model.CallResolutionResult.Type[FakeCallableDescriptorForObject]

'error' @ [101:57] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'transformToResolvedCall' @ [106:22] ==> public final fun <D : CallableDescriptor> transformToResolvedCall(completedCallAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor? = ...): ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidate' @ [106:49] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[ValueParameterDescriptorImpl]

'trace' @ [106:60] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[ValueParameterDescriptorImpl]

'candidate' @ [107:29] ==> value-parameter candidate: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[ValueParameterDescriptorImpl]

'atom' @ [107:39] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [107:44] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'psiKotlinCall' @ [108:23] ==> val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'safeAs' @ [108:37] ==> public inline fun <reified T : Any> Any?.safeAs(): PSIKotlinCallForInvoke? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PSIKotlinCallForInvoke

'baseCall' @ [108:71] ==> public final val baseCall: PSIKotlinCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallForInvoke[PropertyDescriptorImpl]

'tracingStrategy' @ [108:81] ==> public open val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallImpl[PropertyDescriptorImpl]

'psiKotlinCall' @ [108:100] ==> val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'tracingStrategy' @ [108:114] ==> public abstract val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'tracing' @ [110:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'bindReference' @ [110:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(D..D?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'trace' @ [110:31] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[ValueParameterDescriptorImpl]

'result' @ [110:38] ==> val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'tracing' @ [111:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'bindResolvedCall' @ [111:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(D..D?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'trace' @ [111:34] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[ValueParameterDescriptorImpl]

'result' @ [111:41] ==> val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'result' @ [112:16] ==> val result: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createStubResolvedCallAndWriteItToTrace[LocalVariableDescriptor]

'completedCallAtom' @ [120:29] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'atom' @ [120:47] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [120:52] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'if (psiKotlinCall is PSIKotlinCallForInvoke) {
            @Suppress("UNCHECKED_CAST")
            NewVariableAsFunctionResolvedCallImpl(
                    createOrGet(psiKotlinCall.variableCall.resolvedCall, trace, resultSubstitutor),
                    createOrGet(completedCallAtom, trace, resultSubstitutor)
            ) as ResolvedCall<D>
        }
        else {
            createOrGet(completedCallAtom, trace, resultSubstitutor)
        }' @ [121:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedCall<D>, elseBranch: ResolvedCall<D>): ResolvedCall<D>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedCall<D>

'psiKotlinCall' @ [121:20] ==> val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[LocalVariableDescriptor]

'Suppress' @ [122:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'NewVariableAsFunctionResolvedCallImpl' @ [123:13] ==> public constructor NewVariableAsFunctionResolvedCallImpl(variableCall: NewResolvedCallImpl<VariableDescriptor>, functionCall: NewResolvedCallImpl<FunctionDescriptor>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[ClassConstructorDescriptorImpl]

'createOrGet' @ [124:21] ==> private final fun <D : CallableDescriptor> createOrGet(completedSimpleAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor?): NewResolvedCallImpl<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> VariableDescriptor

'psiKotlinCall' @ [124:33] ==> val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[LocalVariableDescriptor]

'variableCall' @ [124:47] ==> public final val variableCall: KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallForInvoke[PropertyDescriptorImpl]

'resolvedCall' @ [124:60] ==> public final val resolvedCall: MutableResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.model.KotlinResolutionCandidate[DeserializedPropertyDescriptor]

'trace' @ [124:74] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'resultSubstitutor' @ [124:81] ==> value-parameter resultSubstitutor: NewTypeSubstitutor? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'createOrGet' @ [125:21] ==> private final fun <D : CallableDescriptor> createOrGet(completedSimpleAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor?): NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'completedCallAtom' @ [125:33] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'trace' @ [125:52] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'resultSubstitutor' @ [125:59] ==> value-parameter resultSubstitutor: NewTypeSubstitutor? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'createOrGet' @ [129:13] ==> private final fun <D : CallableDescriptor> createOrGet(completedSimpleAtom: ResolvedCallAtom, trace: BindingTrace?, resultSubstitutor: NewTypeSubstitutor?): NewResolvedCallImpl<D> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'completedCallAtom' @ [129:25] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'trace' @ [129:44] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'resultSubstitutor' @ [129:51] ==> value-parameter resultSubstitutor: NewTypeSubstitutor? = ... defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.transformToResolvedCall[ValueParameterDescriptorImpl]

'trace' @ [138:13] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'completedSimpleAtom' @ [139:38] ==> value-parameter completedSimpleAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'atom' @ [139:58] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [139:63] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'psiCall' @ [139:77] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'getResolvedCall' @ [139:85] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'trace' @ [139:101] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'bindingContext' @ [139:107] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'safeAs' @ [140:21] ==> public inline fun <reified T : Any> Any?.safeAs(): NewResolvedCallImpl<D>? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NewResolvedCallImpl<D>

'storedResolvedCall' @ [141:17] ==> val storedResolvedCall: NewResolvedCallImpl<D>? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[LocalVariableDescriptor]

'storedResolvedCall' @ [142:17] ==> val storedResolvedCall: NewResolvedCallImpl<D>? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[LocalVariableDescriptor]

'setResultingSubstitutor' @ [142:36] ==> public final fun setResultingSubstitutor(substitutor: NewTypeSubstitutor?): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[SimpleFunctionDescriptorImpl]

'resultSubstitutor' @ [142:60] ==> value-parameter resultSubstitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'storedResolvedCall' @ [143:24] ==> val storedResolvedCall: NewResolvedCallImpl<D>? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[LocalVariableDescriptor]

'NewResolvedCallImpl' @ [146:16] ==> public constructor NewResolvedCallImpl<D : CallableDescriptor>(resolvedCallAtom: ResolvedCallAtom, substitutor: NewTypeSubstitutor?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'completedSimpleAtom' @ [146:36] ==> value-parameter completedSimpleAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'resultSubstitutor' @ [146:57] ==> value-parameter resultSubstitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.createOrGet[ValueParameterDescriptorImpl]

'if (resolvedCall is VariableAsFunctionResolvedCall)
            resolvedCall.variableCall.call.calleeExpression
        else
            resolvedCall.call.calleeExpression' @ [150:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'resolvedCall' @ [150:36] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'resolvedCall' @ [151:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'variableCall' @ [151:26] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'call' @ [151:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'calleeExpression' @ [151:44] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'resolvedCall' @ [153:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'call' @ [153:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'calleeExpression' @ [153:31] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (calleeExpression != null && !calleeExpression.isFakeElement) calleeExpression
                else resolvedCall.call.callElement' @ [155:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'calleeExpression' @ [155:21] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'!' @ [155:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'calleeExpression' @ [155:50] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'isFakeElement' @ [155:67] ==> public val KtElement.isFakeElement: Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[PropertyDescriptorImpl]

'calleeExpression' @ [155:82] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'resolvedCall' @ [156:22] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'call' @ [156:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [156:40] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callCheckers' @ [158:29] ==> private final val callCheckers: Iterable<CallChecker> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'callChecker' @ [159:13] ==> val callChecker: CallChecker defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'check' @ [159:25] ==> public abstract fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [159:31] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'reportOn' @ [159:45] ==> val reportOn: KtElement defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'callCheckerContext' @ [159:55] ==> value-parameter callCheckerContext: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'resolvedCall' @ [161:17] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'callChecker' @ [162:17] ==> val callChecker: CallChecker defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'check' @ [162:29] ==> public abstract fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [162:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'variableCall' @ [162:48] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'reportOn' @ [162:62] ==> val reportOn: KtElement defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[LocalVariableDescriptor]

'callCheckerContext' @ [162:72] ==> value-parameter callCheckerContext: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runCallCheckers[ValueParameterDescriptorImpl]

'resolvedCall' @ [174:31] ==> value-parameter resolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'call' @ [174:44] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(*)

'valueArguments' @ [174:49] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'resolvedCall' @ [175:35] ==> value-parameter resolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'getArgumentMapping' @ [175:48] ==> public open fun getArgumentMapping(valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[SimpleFunctionDescriptorImpl]

'valueArgument' @ [175:67] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'component1' @ [176:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [176:32] ==> public final operator fun component2(): CallPosition defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (argumentMapping) {
                is ArgumentMatch -> Pair(
                        getEffectiveExpectedType(argumentMapping.valueParameter, valueArgument),
                        CallPosition.ValueArgumentPosition(resolvedCall, argumentMapping.valueParameter, valueArgument))
                else -> Pair(TypeUtils.NO_EXPECTED_TYPE, CallPosition.Unknown)
            }' @ [176:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KotlinType, CallPosition>, entry1: Pair<KotlinType, CallPosition>): Pair<KotlinType, CallPosition>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KotlinType, CallPosition>

'argumentMapping' @ [176:54] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'Pair' @ [177:37] ==> public constructor Pair<out A, out B>(first: KotlinType, second: CallPosition.ValueArgumentPosition) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KotlinType
    <out B> -> ValueArgumentPosition

'getEffectiveExpectedType' @ [178:25] ==> public fun getEffectiveExpectedType(parameterDescriptor: ValueParameterDescriptor, argument: ValueArgument): KotlinType defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'argumentMapping' @ [178:50] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'valueParameter' @ [178:66] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'valueArgument' @ [178:82] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'ValueArgumentPosition' @ [179:38] ==> public constructor ValueArgumentPosition(resolvedCall: ResolvedCall<*>, valueParameter: ValueParameterDescriptor, valueArgument: ValueArgument) defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ValueArgumentPosition[ClassConstructorDescriptorImpl]

'resolvedCall' @ [179:60] ==> value-parameter resolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'argumentMapping' @ [179:74] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'valueParameter' @ [179:90] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'valueArgument' @ [179:106] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'Pair' @ [180:25] ==> public constructor Pair<out A, out B>(first: SimpleType, second: CallPosition.Unknown) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SimpleType
    <out B> -> Unknown

'NO_EXPECTED_TYPE' @ [180:40] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'Unknown' @ [180:71] ==> public object Unknown : CallPosition defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition[FakeCallableDescriptorForObject]

'context' @ [183:21] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'replaceDataFlowInfo' @ [183:29] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'resolvedCall' @ [183:49] ==> value-parameter resolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'dataFlowInfoForArguments' @ [183:62] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<out CallableDescriptor>.dataFlowInfoForArguments: DataFlowInfoForArguments[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(*)

'getInfo' @ [183:87] ==> @NotNull public abstract fun getInfo(@NotNull valueArgument: ValueArgument): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.model.DataFlowInfoForArguments[JavaMethodDescriptor]

'valueArgument' @ [183:95] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'replaceExpectedType' @ [184:30] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'expectedType' @ [184:50] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'replaceCallPosition' @ [185:30] ==> @NotNull public open fun replaceCallPosition(@NotNull callPosition: CallPosition): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'callPosition' @ [185:50] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'replaceBindingTrace' @ [186:30] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'trace' @ [186:50] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[ValueParameterDescriptorImpl]

'valueArgument' @ [190:38] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'getArgumentExpression' @ [190:52] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'updateRecordedType' @ [191:13] ==> public final fun updateRecordedType(expression: KtExpression, context: BasicCallResolutionContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [191:32] ==> val argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'newContext' @ [191:52] ==> val newContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.runArgumentsChecks[LocalVariableDescriptor]

'expression' @ [200:31] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'let' @ [200:42] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtExpression?): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtExpression?

'getLastElementDeparenthesized' @ [201:23] ==> @Nullable public open fun getLastElementDeparenthesized(@Nullable expression: KtExpression?, @NotNull statementFilter: StatementFilter): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'it' @ [201:53] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [201:57] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'statementFilter' @ [201:65] ==> @NotNull public final val statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [204:28] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'trace' @ [204:36] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'getType' @ [204:42] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'deparenthesized' @ [204:50] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'getResolvedCallForArgumentExpression' @ [205:27] ==> private final fun getResolvedCallForArgumentExpression(expression: KtExpression, context: BasicCallResolutionContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'deparenthesized' @ [205:64] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'context' @ [205:81] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'run' @ [205:91] ==> @InlineOnly public inline fun <T, R> ResolvedCall<out CallableDescriptor>.run(block: ResolvedCall<out CallableDescriptor>.() -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedCall<out CallableDescriptor>
    <R> -> KotlinType?

'makeNullableTypeIfSafeReceiver' @ [206:13] ==> public fun ResolvedCall<*>.makeNullableTypeIfSafeReceiver(type: KotlinType?, context: CallResolutionContext<*>): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [206:44] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'returnType' @ [206:64] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'context' @ [206:76] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'recordedType' @ [207:14] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'recordedType' @ [211:13] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'!' @ [211:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'recordedType' @ [211:38] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'constructor' @ [211:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isDenotable' @ [211:63] ==> public final val TypeConstructor.isDenotable: Boolean[MyPropertyDescriptor]

'updatedType' @ [212:13] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'argumentTypeResolver' @ [212:27] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'updateResultArgumentTypeIfNotDenotable' @ [212:48] ==> @Nullable public open fun updateResultArgumentTypeIfNotDenotable(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'context' @ [212:87] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'deparenthesized' @ [212:96] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'updatedType' @ [212:116] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'updatedType' @ [215:9] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'updateRecordedTypeForArgument' @ [215:23] ==> private final fun updateRecordedTypeForArgument(updatedType: KotlinType?, recordedType: KotlinType?, argumentExpression: KtExpression, context: BasicCallResolutionContext): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'updatedType' @ [215:53] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'recordedType' @ [215:66] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'expression' @ [215:80] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'context' @ [215:92] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'dataFlowAnalyzer' @ [217:9] ==> private final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'checkType' @ [217:26] ==> @Nullable public open fun checkType(@Nullable expressionType: KotlinType?, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'updatedType' @ [217:36] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'deparenthesized' @ [217:49] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'context' @ [217:66] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[ValueParameterDescriptorImpl]

'updatedType' @ [219:16] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedType[LocalVariableDescriptor]

'if (!ExpressionTypingUtils.dependsOnExpectedType(expression))
                null
            else
                expression.getResolvedCall(context.trace.bindingContext)' @ [223:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedCall<out CallableDescriptor>?, elseBranch: ResolvedCall<out CallableDescriptor>?): ResolvedCall<out CallableDescriptor>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>?

'!' @ [223:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dependsOnExpectedType' @ [223:40] ==> public open fun dependsOnExpectedType(@Nullable expression: KtExpression?): Boolean defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingUtils[JavaMethodDescriptor]

'expression' @ [223:62] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.getResolvedCallForArgumentExpression[ValueParameterDescriptorImpl]

'expression' @ [226:17] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.getResolvedCallForArgumentExpression[ValueParameterDescriptorImpl]

'getResolvedCall' @ [226:28] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'context' @ [226:44] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.getResolvedCallForArgumentExpression[ValueParameterDescriptorImpl]

'trace' @ [226:52] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [226:58] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'!' @ [235:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsErrorType' @ [235:26] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'recordedType' @ [235:44] ==> value-parameter recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'recordedType' @ [235:61] ==> value-parameter recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [235:77] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [235:93] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [235:121] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'ArrayList' @ [237:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'also' @ [237:53] ==> @InlineOnly @SinceKotlin public inline fun <T> ArrayList<KtExpression>.also(block: (ArrayList<KtExpression>) -> Unit): ArrayList<KtExpression> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<KtExpression>

'argumentExpression' @ [238:45] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'expression' @ [239:20] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[LocalVariableDescriptor]

'expressions' @ [240:17] ==> value-parameter expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'add' @ [240:29] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [240:33] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[LocalVariableDescriptor]

'expression' @ [241:17] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[LocalVariableDescriptor]

'deparenthesizeOrGetSelector' @ [241:30] ==> private final fun deparenthesizeOrGetSelector(expression: KtExpression, statementFilter: StatementFilter): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [241:58] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[LocalVariableDescriptor]

'context' @ [241:70] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'statementFilter' @ [241:78] ==> @NotNull public final val statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'expressions' @ [243:13] ==> value-parameter expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'reverse' @ [243:25] ==> public fun <T> MutableList<KtExpression>.reverse(): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'expressions' @ [247:28] ==> val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'!' @ [248:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [248:19] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'expression' @ [248:62] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'expression' @ [248:99] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'shouldBeMadeNullable' @ [249:17] ==> var shouldBeMadeNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'hasNecessarySafeCall' @ [249:40] ==> private final fun hasNecessarySafeCall(expression: KtExpression, trace: BindingTrace): Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [249:61] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'context' @ [249:73] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'trace' @ [249:81] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'updateRecordedType' @ [251:33] ==> @Nullable public open fun updateRecordedType(@Nullable type: KotlinType?, @NotNull expression: KtExpression, @NotNull trace: BindingTrace, shouldBeMadeNullable: Boolean): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'updatedType' @ [251:52] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'expression' @ [251:65] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'context' @ [251:77] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'trace' @ [251:85] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'shouldBeMadeNullable' @ [251:92] ==> var shouldBeMadeNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[LocalVariableDescriptor]

'context' @ [254:16] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'trace' @ [254:24] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'getType' @ [254:30] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'argumentExpression' @ [254:38] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'deparenthesizeOnce' @ [258:41] ==> @Nullable public open fun deparenthesizeOnce(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [258:60] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'deparenthesized' @ [259:13] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[LocalVariableDescriptor]

'expression' @ [259:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'deparenthesized' @ [259:51] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[LocalVariableDescriptor]

'when (expression) {
            is KtBlockExpression -> statementFilter.getLastStatementInABlock(expression)
            is KtQualifiedExpression -> expression.selectorExpression
            else -> null
        }' @ [261:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'expression' @ [261:22] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'statementFilter' @ [262:37] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'getLastStatementInABlock' @ [262:53] ==> public fun StatementFilter.getLastStatementInABlock(block: KtBlockExpression): KtExpression? defined in org.jetbrains.kotlin.resolve in file StatementFilter.kt[SimpleFunctionDescriptorImpl]

'expression' @ [262:78] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'expression' @ [263:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'selectorExpression' @ [263:52] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'expression' @ [273:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'trace' @ [276:30] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'getType' @ [276:36] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [276:44] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'receiverExpression' @ [276:55] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[PropertyDescriptorImpl]

'expressionType' @ [277:16] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.hasNecessarySafeCall[LocalVariableDescriptor]

'isNullableType' @ [277:52] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expressionType' @ [277:67] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.hasNecessarySafeCall[LocalVariableDescriptor]

'resolvedCall' @ [281:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'safeAs' @ [281:22] ==> public inline fun <reified T : Any> Any?.safeAs(): NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NewResolvedCallImpl<*>

'let' @ [281:56] ==> @InlineOnly public inline fun <T, R> NewResolvedCallImpl<*>.let(block: (NewResolvedCallImpl<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewResolvedCallImpl<*>
    <R> -> Unit

'bindAndReport' @ [281:62] ==> private final fun bindAndReport(context: BasicCallResolutionContext, trace: BindingTrace, simpleResolvedCall: NewResolvedCallImpl<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'context' @ [281:76] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'trace' @ [281:85] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'it' @ [281:92] ==> value-parameter it: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [282:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'safeAs' @ [282:22] ==> public inline fun <reified T : Any> Any?.safeAs(): NewVariableAsFunctionResolvedCallImpl? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NewVariableAsFunctionResolvedCallImpl

'let' @ [282:71] ==> @InlineOnly public inline fun <T, R> NewVariableAsFunctionResolvedCallImpl.let(block: (NewVariableAsFunctionResolvedCallImpl) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewVariableAsFunctionResolvedCallImpl
    <R> -> Unit

'bindAndReport' @ [282:77] ==> private final fun bindAndReport(context: BasicCallResolutionContext, trace: BindingTrace, variableAsFunction: NewVariableAsFunctionResolvedCallImpl): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'context' @ [282:91] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'trace' @ [282:100] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'it' @ [282:107] ==> value-parameter it: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport.<anonymous>[ValueParameterDescriptorImpl]

'simpleResolvedCall' @ [286:23] ==> value-parameter simpleResolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'resolvedCallAtom' @ [286:42] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'atom' @ [286:59] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [286:64] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'tracingStrategy' @ [286:78] ==> public abstract val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'tracing' @ [288:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[LocalVariableDescriptor]

'bindReference' @ [288:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out CallableDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'trace' @ [288:31] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'simpleResolvedCall' @ [288:38] ==> value-parameter simpleResolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'tracing' @ [289:9] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[LocalVariableDescriptor]

'bindResolvedCall' @ [289:17] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out CallableDescriptor>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'trace' @ [289:34] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'simpleResolvedCall' @ [289:41] ==> value-parameter simpleResolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'reportCallDiagnostic' @ [291:9] ==> private final fun reportCallDiagnostic(context: BasicCallResolutionContext, trace: BindingTrace, completedCallAtom: ResolvedCallAtom, resultingDescriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'context' @ [291:30] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'trace' @ [291:39] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'simpleResolvedCall' @ [291:46] ==> value-parameter simpleResolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'resolvedCallAtom' @ [291:65] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'simpleResolvedCall' @ [291:83] ==> value-parameter simpleResolvedCall: NewResolvedCallImpl<*> defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [291:102] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(*)

'variableAsFunction' @ [295:36] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'baseCall' @ [295:55] ==> public final val baseCall: PSIKotlinCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'tracingStrategy' @ [295:64] ==> public open val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallImpl[PropertyDescriptorImpl]

'outerTracingStrategy' @ [296:9] ==> val outerTracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[LocalVariableDescriptor]

'bindReference' @ [296:30] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(VariableDescriptor..VariableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.VariableDescriptor..org.jetbrains.kotlin.descriptors.VariableDescriptor?)

'trace' @ [296:44] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [296:51] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableCall' @ [296:70] ==> public open val variableCall: NewResolvedCallImpl<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'outerTracingStrategy' @ [297:9] ==> val outerTracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[LocalVariableDescriptor]

'bindResolvedCall' @ [297:30] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'trace' @ [297:47] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [297:54] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [298:9] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'functionCall' @ [298:28] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'kotlinCall' @ [298:41] ==> public open val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'psiKotlinCall' @ [298:52] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'tracingStrategy' @ [298:66] ==> public abstract val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'bindReference' @ [298:82] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'trace' @ [298:96] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [298:103] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'functionCall' @ [298:122] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'reportCallDiagnostic' @ [300:9] ==> private final fun reportCallDiagnostic(context: BasicCallResolutionContext, trace: BindingTrace, completedCallAtom: ResolvedCallAtom, resultingDescriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'context' @ [300:30] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'trace' @ [300:39] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [300:46] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableCall' @ [300:65] ==> public open val variableCall: NewResolvedCallImpl<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'resolvedCallAtom' @ [300:78] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'variableAsFunction' @ [300:96] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableCall' @ [300:115] ==> public open val variableCall: NewResolvedCallImpl<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'resultingDescriptor' @ [300:128] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<VariableDescriptor>.resultingDescriptor: VariableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> VariableDescriptor

'reportCallDiagnostic' @ [301:9] ==> private final fun reportCallDiagnostic(context: BasicCallResolutionContext, trace: BindingTrace, completedCallAtom: ResolvedCallAtom, resultingDescriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[SimpleFunctionDescriptorImpl]

'context' @ [301:30] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'trace' @ [301:39] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'variableAsFunction' @ [301:46] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'functionCall' @ [301:65] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'resolvedCallAtom' @ [301:78] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'variableAsFunction' @ [301:96] ==> value-parameter variableAsFunction: NewVariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.bindAndReport[ValueParameterDescriptorImpl]

'functionCall' @ [301:115] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'resultingDescriptor' @ [301:128] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<FunctionDescriptor>.resultingDescriptor: FunctionDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'TrackingBindingTrace' @ [310:29] ==> public constructor TrackingBindingTrace(trace: BindingTrace) defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[ClassConstructorDescriptorImpl]

'trace' @ [310:50] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'context' @ [311:26] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [311:34] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'trackingTrace' @ [311:54] ==> val trackingTrace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'DiagnosticReporterByTrackingStrategy' @ [312:34] ==> public constructor DiagnosticReporterByTrackingStrategy(constantExpressionEvaluator: ConstantExpressionEvaluator, context: BasicCallResolutionContext, psiKotlinCall: PSIKotlinCall) defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[ClassConstructorDescriptorImpl]

'constantExpressionEvaluator' @ [312:71] ==> private final val constantExpressionEvaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'newContext' @ [312:100] ==> val newContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'completedCallAtom' @ [312:112] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'atom' @ [312:130] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [312:135] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'SimpleHolder' @ [314:56] ==> public constructor SimpleHolder() defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[DeserializedClassConstructorDescriptor]

'additionalDiagnosticReporter' @ [315:9] ==> private final val additionalDiagnosticReporter: AdditionalDiagnosticReporter defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer[PropertyDescriptorImpl]

'reportAdditionalDiagnostics' @ [315:38] ==> public final fun reportAdditionalDiagnostics(candidate: ResolvedCallAtom, resultingDescriptor: CallableDescriptor, kotlinDiagnosticsHolder: KotlinDiagnosticsHolder): Unit defined in org.jetbrains.kotlin.resolve.calls.components.AdditionalDiagnosticReporter[DeserializedSimpleFunctionDescriptor]

'completedCallAtom' @ [315:66] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [315:85] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'diagnosticHolder' @ [315:106] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'completedCallAtom' @ [317:28] ==> value-parameter completedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'diagnostics' @ [317:46] ==> public final lateinit var diagnostics: Collection<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'diagnosticHolder' @ [317:60] ==> val diagnosticHolder: KotlinDiagnosticsHolder.SimpleHolder defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'getDiagnostics' @ [317:77] ==> public final fun getDiagnostics(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.KotlinDiagnosticsHolder.SimpleHolder[DeserializedSimpleFunctionDescriptor]

'trackingTrace' @ [318:13] ==> val trackingTrace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'reported' @ [318:27] ==> public final var reported: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[PropertyDescriptorImpl]

'diagnostic' @ [319:13] ==> val diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'report' @ [319:24] ==> public abstract fun report(reporter: DiagnosticReporter): Unit defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic[DeserializedSimpleFunctionDescriptor]

'diagnosticReporter' @ [319:31] ==> val diagnosticReporter: DiagnosticReporterByTrackingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'diagnostic' @ [321:41] ==> val diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'diagnostic' @ [321:79] ==> val diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'!' @ [322:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'trackingTrace' @ [322:50] ==> val trackingTrace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'reported' @ [322:64] ==> public final var reported: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[PropertyDescriptorImpl]

'!' @ [322:76] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dontRecordToTraceAsIs' @ [322:77] ==> val dontRecordToTraceAsIs: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'shouldReportMissingDiagnostic' @ [323:17] ==> val shouldReportMissingDiagnostic: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'REPORT_MISSING_NEW_INFERENCE_DIAGNOSTIC' @ [323:50] ==> public val REPORT_MISSING_NEW_INFERENCE_DIAGNOSTIC: Boolean defined in org.jetbrains.kotlin.resolve.calls[DeserializedPropertyDescriptor]

'if (diagnostic.candidateApplicability.isSuccess) Errors.NEW_INFERENCE_DIAGNOSTIC else Errors.NEW_INFERENCE_ERROR' @ [324:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?), elseBranch: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?)): (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.String..kotlin.String?)>..org.jetbrains.kotlin.diagnostics.DiagnosticFactory1<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?), (kotlin.String..kotlin.String?)>?)

'diagnostic' @ [324:35] ==> val diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'candidateApplicability' @ [324:46] ==> public final val candidateApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic[DeserializedPropertyDescriptor]

'isSuccess' @ [324:69] ==> public val ResolutionCandidateApplicability.isSuccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedPropertyDescriptor]

'NEW_INFERENCE_DIAGNOSTIC' @ [324:87] ==> public final val NEW_INFERENCE_DIAGNOSTIC: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'NEW_INFERENCE_ERROR' @ [324:124] ==> public final val NEW_INFERENCE_ERROR: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'trace' @ [325:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[ValueParameterDescriptorImpl]

'report' @ [325:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'factory' @ [325:30] ==> val factory: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'on' @ [325:38] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'diagnosticReporter' @ [325:41] ==> val diagnosticReporter: DiagnosticReporterByTrackingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'psiKotlinCall' @ [325:60] ==> public final val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'psiCall' @ [325:74] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'callElement' @ [325:82] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'diagnostic' @ [325:117] ==> val diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.KotlinToResolvedCallTransformer.reportCallDiagnostic[LocalVariableDescriptor]

'trace' @ [331:71] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace.<init>[ValueParameterDescriptorImpl]

'trace' @ [335:9] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[PropertyDescriptorImpl]

'report' @ [335:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [335:22] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace.report[ValueParameterDescriptorImpl]

'reported' @ [336:9] ==> public final var reported: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[PropertyDescriptorImpl]

'reported' @ [340:9] ==> public final var reported: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[PropertyDescriptorImpl]

'kotlinCall' @ [351:36] ==> public abstract val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'psiKotlinCall' @ [351:47] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'psiCall' @ [351:61] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'_valueArguments' @ [354:13] ==> protected final var _valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'_valueArguments' @ [355:13] ==> protected final var _valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'createValueArguments' @ [355:31] ==> private final fun createValueArguments(): Map<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[SimpleFunctionDescriptorImpl]

'_valueArguments' @ [357:16] ==> protected final var _valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'ArrayList' @ [361:25] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ResolvedValueArgument?

'candidateDescriptor' @ [361:59] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'valueParameters' @ [361:79] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [361:95] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'..' @ [362:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'candidateDescriptor' @ [362:22] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'valueParameters' @ [362:42] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [362:58] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'arguments' @ [363:13] ==> val arguments: ArrayList<ResolvedValueArgument?> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'add' @ [363:23] ==> public open fun add(element: ResolvedValueArgument?): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'component1' @ [366:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedValueArgument

'component2' @ [366:36] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedValueArgument>.component2(): ResolvedValueArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedValueArgument

'valueArguments' @ [366:46] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'arguments' @ [367:28] ==> val arguments: ArrayList<ResolvedValueArgument?> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'set' @ [367:38] ==> public open fun set(index: Int, element: ResolvedValueArgument?): ResolvedValueArgument? defined in java.util.ArrayList[JavaMethodDescriptor]

'parameterDescriptor' @ [367:42] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'index' @ [367:62] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'value' @ [367:69] ==> val value: ResolvedValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'oldValue' @ [368:17] ==> val oldValue: ResolvedValueArgument? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'arguments' @ [373:13] ==> val arguments: ArrayList<ResolvedValueArgument?> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'any' @ [373:23] ==> public inline fun <T> Iterable<ResolvedValueArgument?>.any(predicate: (ResolvedValueArgument?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolvedValueArgument?

'it' @ [373:29] ==> value-parameter it: ResolvedValueArgument? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex.<anonymous>[ValueParameterDescriptorImpl]

'Suppress' @ [375:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'arguments' @ [376:16] ==> val arguments: ArrayList<ResolvedValueArgument?> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getValueArgumentsByIndex[LocalVariableDescriptor]

'argumentToParameterMap' @ [380:13] ==> protected final var argumentToParameterMap: Map<ValueArgument, ArgumentMatchImpl>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'argumentToParameterMap' @ [381:13] ==> protected final var argumentToParameterMap: Map<ValueArgument, ArgumentMatchImpl>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'argumentToParameterMap' @ [381:38] ==> private final fun argumentToParameterMap(resultingDescriptor: CallableDescriptor, valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>): Map<ValueArgument, ArgumentMatchImpl> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[SimpleFunctionDescriptorImpl]

'resultingDescriptor' @ [381:61] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.resultingDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'valueArguments' @ [381:82] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'argumentToParameterMap' @ [383:16] ==> protected final var argumentToParameterMap: Map<ValueArgument, ArgumentMatchImpl>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'valueArgument' @ [383:41] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getArgumentMapping[ValueParameterDescriptorImpl]

'ArgumentUnmapped' @ [383:59] ==> public object ArgumentUnmapped : ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model in file ArgumentMapping.kt[FakeCallableDescriptorForObject]

'kotlinCall' @ [387:40] ==> public abstract val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'psiKotlinCall' @ [387:51] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'resultDataFlowInfo' @ [387:65] ==> public abstract val resultDataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'kotlinCall' @ [389:43] ==> public abstract val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'externalArgument' @ [389:54] ==> public abstract val externalArgument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[DeserializedPropertyDescriptor]

'psiCallArgument' @ [389:72] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'externalPsiCallArgument' @ [390:17] ==> val externalPsiCallArgument: PSIKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getDataFlowInfoForArguments.<no name provided>.getInfo[LocalVariableDescriptor]

'valueArgument' @ [390:42] ==> public abstract val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'valueArgument' @ [390:59] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getDataFlowInfoForArguments.<no name provided>.getInfo[ValueParameterDescriptorImpl]

'externalPsiCallArgument' @ [391:24] ==> val externalPsiCallArgument: PSIKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getDataFlowInfoForArguments.<no name provided>.getInfo[LocalVariableDescriptor]

'dataFlowInfoAfterThisArgument' @ [391:48] ==> public abstract val dataFlowInfoAfterThisArgument: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'kotlinCall' @ [393:20] ==> public abstract val kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'psiKotlinCall' @ [393:31] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'dataFlowInfoForArguments' @ [393:45] ==> public abstract val dataFlowInfoForArguments: DataFlowInfoForArguments defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'getInfo' @ [393:70] ==> @NotNull public abstract fun getInfo(@NotNull valueArgument: ValueArgument): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.model.DataFlowInfoForArguments[JavaMethodDescriptor]

'valueArgument' @ [393:78] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.getDataFlowInfoForArguments.<no name provided>.getInfo[ValueParameterDescriptorImpl]

'LinkedHashMap' @ [401:13] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueArgument
    <V : (Any..Any?)> -> ArgumentMatchImpl

'also' @ [401:63] ==> @InlineOnly @SinceKotlin public inline fun <T> LinkedHashMap<ValueArgument, ArgumentMatchImpl>.also(block: (LinkedHashMap<ValueArgument, ArgumentMatchImpl>) -> Unit): LinkedHashMap<ValueArgument, ArgumentMatchImpl> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<ValueArgument, ArgumentMatchImpl>

'resultingDescriptor' @ [402:35] ==> value-parameter resultingDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap[ValueParameterDescriptorImpl]

'valueParameters' @ [402:55] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'valueArguments' @ [403:44] ==> value-parameter valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap[ValueParameterDescriptorImpl]

'parameter' @ [403:59] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap.<anonymous>[LocalVariableDescriptor]

'resolvedArgument' @ [404:39] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap.<anonymous>[LocalVariableDescriptor]

'arguments' @ [404:56] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'result' @ [405:25] ==> value-parameter result: LinkedHashMap<ValueArgument, ArgumentMatchImpl> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [405:32] ==> val arguments: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap.<anonymous>[LocalVariableDescriptor]

'ArgumentMatchImpl' @ [405:45] ==> public constructor ArgumentMatchImpl(valueParameter: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchImpl[ClassConstructorDescriptorImpl]

'parameter' @ [405:63] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.argumentToParameterMap.<anonymous>[LocalVariableDescriptor]

'apply' @ [405:74] ==> @InlineOnly public inline fun <T> ArgumentMatchImpl.apply(block: ArgumentMatchImpl.() -> Unit): ArgumentMatchImpl defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentMatchImpl

'recordMatchStatus' @ [405:82] ==> public final fun recordMatchStatus(status: ArgumentMatchStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchImpl[SimpleFunctionDescriptorImpl]

'SUCCESS' @ [405:120] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'LinkedHashMap' @ [411:13] ==> public constructor LinkedHashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.LinkedHashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ValueParameterDescriptor
    <V : (Any..Any?)> -> ResolvedValueArgument

'also' @ [411:78] ==> @InlineOnly @SinceKotlin public inline fun <T> LinkedHashMap<ValueParameterDescriptor, ResolvedValueArgument>.also(block: (LinkedHashMap<ValueParameterDescriptor, ResolvedValueArgument>) -> Unit): LinkedHashMap<ValueParameterDescriptor, ResolvedValueArgument> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LinkedHashMap<ValueParameterDescriptor, ResolvedValueArgument>

'component1' @ [412:23] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'component2' @ [412:42] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component2(): ResolvedCallArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'argumentMappingByOriginal' @ [412:67] ==> public abstract val argumentMappingByOriginal: Map<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[PropertyDescriptorImpl]

'resultingDescriptor' @ [413:46] ==> public final val <D : CallableDescriptor> NewAbstractResolvedCall<D>.resultingDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'valueParameters' @ [413:66] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'originalParameter' @ [413:82] ==> val originalParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'index' @ [413:100] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'result' @ [414:21] ==> value-parameter result: LinkedHashMap<ValueParameterDescriptor, ResolvedValueArgument> defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[ValueParameterDescriptorImpl]

'resultingParameter' @ [414:28] ==> val resultingParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'when (resolvedCallArgument) {
                        ResolvedCallArgument.DefaultArgument ->
                            DefaultValueArgument.DEFAULT
                        is ResolvedCallArgument.SimpleArgument -> {
                            val valueArgument = resolvedCallArgument.callArgument.psiCallArgument.valueArgument
                            if (resultingParameter.isVararg)
                                VarargValueArgument().apply { addArgument(valueArgument) }
                            else
                                ExpressionValueArgument(valueArgument)
                        }
                        is ResolvedCallArgument.VarargArgument ->
                            VarargValueArgument().apply {
                                resolvedCallArgument.arguments.map { it.psiCallArgument.valueArgument }.forEach { addArgument(it) }
                            }
                    }' @ [414:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (ResolvedValueArgument..ResolvedValueArgument?), entry1: (ResolvedValueArgument..ResolvedValueArgument?), entry2: (ResolvedValueArgument..ResolvedValueArgument?)): (ResolvedValueArgument..ResolvedValueArgument?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'resolvedCallArgument' @ [414:56] ==> val resolvedCallArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'DefaultArgument' @ [415:46] ==> public object DefaultArgument : ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[FakeCallableDescriptorForObject]

'DEFAULT' @ [416:50] ==> public final val DEFAULT: (DefaultValueArgument..DefaultValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.model.DefaultValueArgument[JavaPropertyDescriptor]

'resolvedCallArgument' @ [418:49] ==> val resolvedCallArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'callArgument' @ [418:70] ==> public final val callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument.SimpleArgument[DeserializedPropertyDescriptor]

'psiCallArgument' @ [418:83] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'valueArgument' @ [418:99] ==> public abstract val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'if (resultingParameter.isVararg)
                                VarargValueArgument().apply { addArgument(valueArgument) }
                            else
                                ExpressionValueArgument(valueArgument)' @ [419:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolvedValueArgument, elseBranch: ResolvedValueArgument): ResolvedValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolvedValueArgument

'resultingParameter' @ [419:33] ==> val resultingParameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'isVararg' @ [419:52] ==> public val ValueParameterDescriptor.isVararg: Boolean defined in org.jetbrains.kotlin.resolve.calls.components[DeserializedPropertyDescriptor]

'VarargValueArgument' @ [420:33] ==> public constructor VarargValueArgument() defined in org.jetbrains.kotlin.resolve.calls.model.VarargValueArgument[JavaClassConstructorDescriptor]

'apply' @ [420:55] ==> @InlineOnly public inline fun <T> VarargValueArgument.apply(block: VarargValueArgument.() -> Unit): VarargValueArgument defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VarargValueArgument

'addArgument' @ [420:63] ==> public open fun addArgument(@NotNull argument: ValueArgument): Unit defined in org.jetbrains.kotlin.resolve.calls.model.VarargValueArgument[JavaMethodDescriptor]

'valueArgument' @ [420:75] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'ExpressionValueArgument' @ [422:33] ==> public constructor ExpressionValueArgument(@Nullable valueArgument: ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionValueArgument[JavaClassConstructorDescriptor]

'valueArgument' @ [422:57] ==> val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'VarargValueArgument' @ [425:29] ==> public constructor VarargValueArgument() defined in org.jetbrains.kotlin.resolve.calls.model.VarargValueArgument[JavaClassConstructorDescriptor]

'apply' @ [425:51] ==> @InlineOnly public inline fun <T> VarargValueArgument.apply(block: VarargValueArgument.() -> Unit): VarargValueArgument defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VarargValueArgument

'resolvedCallArgument' @ [426:33] ==> val resolvedCallArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>[LocalVariableDescriptor]

'arguments' @ [426:54] ==> public abstract val arguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[DeserializedPropertyDescriptor]

'map' @ [426:64] ==> public inline fun <T, R> Iterable<KotlinCallArgument>.map(transform: (KotlinCallArgument) -> ValueArgument): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument
    <R> -> ValueArgument

'it' @ [426:70] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'psiCallArgument' @ [426:73] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'valueArgument' @ [426:89] ==> public abstract val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'forEach' @ [426:105] ==> @HidesMembers public inline fun <T> Iterable<ValueArgument>.forEach(action: (ValueArgument) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'addArgument' @ [426:115] ==> public open fun addArgument(@NotNull argument: ValueArgument): Unit defined in org.jetbrains.kotlin.resolve.calls.model.VarargValueArgument[JavaMethodDescriptor]

'it' @ [426:127] ==> value-parameter it: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall.createValueArguments.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'NewAbstractResolvedCall<D>' @ [437:4] ==> private constructor NewAbstractResolvedCall<D : CallableDescriptor>() defined in org.jetbrains.kotlin.resolve.calls.tower.NewAbstractResolvedCall[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'resolvedCallAtom' @ [444:37] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'extensionReceiverArgument' @ [444:54] ==> public abstract val extensionReceiverArgument: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'receiver' @ [444:81] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [444:91] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'resolvedCallAtom' @ [447:49] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'atom' @ [447:66] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'getResultApplicability' @ [449:50] ==> public fun getResultApplicability(diagnostics: Collection<KotlinCallDiagnostic>): ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'resolvedCallAtom' @ [449:73] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'diagnostics' @ [449:90] ==> public final lateinit var diagnostics: Collection<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'toResolutionStatus' @ [449:103] ==> public fun ResolutionCandidateApplicability.toResolutionStatus(): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.tower in file KotlinToResolvedCallTransformer.kt[SimpleFunctionDescriptorImpl]

'resolvedCallAtom' @ [452:17] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'argumentMappingByOriginal' @ [452:34] ==> public abstract val argumentMappingByOriginal: Map<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'resolvedCallAtom' @ [454:48] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'candidateDescriptor' @ [454:65] ==> public abstract val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'resultingDescriptor' @ [455:48] ==> private final lateinit var resultingDescriptor: D defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'extensionReceiver' @ [456:59] ==> private final var extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'resolvedCallAtom' @ [457:58] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'dispatchReceiverArgument' @ [457:75] ==> public abstract val dispatchReceiverArgument: SimpleKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'receiver' @ [457:101] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [457:111] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'resolvedCallAtom' @ [458:68] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'explicitReceiverKind' @ [458:85] ==> public abstract val explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [461:30] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> D

'typeParameters' @ [461:50] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'takeIf' @ [461:65] ==> @InlineOnly @SinceKotlin public inline fun <T> List<(TypeParameterDescriptor..TypeParameterDescriptor?)>.takeIf(predicate: (List<(TypeParameterDescriptor..TypeParameterDescriptor?)>) -> Boolean): List<(TypeParameterDescriptor..TypeParameterDescriptor?)>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<(org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>

'it' @ [461:74] ==> value-parameter it: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.getTypeArguments.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [461:77] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'emptyMap' @ [461:102] ==> public fun <K, V> emptyMap(): Map<TypeParameterDescriptor, KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> KotlinType

'typeParameters' @ [462:16] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.getTypeArguments[LocalVariableDescriptor]

'zip' @ [462:31] ==> public infix fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.zip(other: Iterable<UnwrappedType>): List<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), UnwrappedType>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> UnwrappedType

'typeArguments' @ [462:35] ==> private final lateinit var typeArguments: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'toMap' @ [462:50] ==> public fun <K, V> Iterable<Pair<TypeParameterDescriptor, UnwrappedType>>.toMap(): Map<TypeParameterDescriptor, UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> TypeParameterDescriptor
    <V> -> UnwrappedType

'smartCastDispatchReceiverType' @ [465:68] ==> private final var smartCastDispatchReceiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'extensionReceiver' @ [468:13] ==> private final var extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'extensionReceiver' @ [469:13] ==> private final var extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'CastImplicitClassReceiver' @ [469:33] ==> public constructor CastImplicitClassReceiver(originalDescriptor: ClassDescriptor, targetType: KotlinType) defined in org.jetbrains.kotlin.resolve.scopes.receivers.CastImplicitClassReceiver[DeserializedClassConstructorDescriptor]

'extensionReceiver' @ [470:22] ==> private final var extensionReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'classDescriptor' @ [470:66] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'smartCastExtensionReceiverType' @ [471:21] ==> value-parameter smartCastExtensionReceiverType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.updateExtensionReceiverWithSmartCastIfNeeded[ValueParameterDescriptorImpl]

'this' @ [477:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[LazyClassReceiverParameterDescriptor]

'smartCastDispatchReceiverType' @ [477:14] ==> private final var smartCastDispatchReceiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'smartCastDispatchReceiverType' @ [477:46] ==> value-parameter smartCastDispatchReceiverType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setSmartCastDispatchReceiverType[ValueParameterDescriptorImpl]

'argumentToParameterMap' @ [482:9] ==> protected final var argumentToParameterMap: Map<ValueArgument, ArgumentMatchImpl>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'_valueArguments' @ [483:9] ==> protected final var _valueArguments: Map<ValueParameterDescriptor, ResolvedValueArgument>? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'substitutor' @ [484:13] ==> value-parameter substitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor[ValueParameterDescriptorImpl]

'isCompleted' @ [486:13] ==> public final var isCompleted: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'resultingDescriptor' @ [489:9] ==> private final lateinit var resultingDescriptor: D defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'run' @ [489:31] ==> @InlineOnly public inline fun <T, R> NewResolvedCallImpl<D>.run(block: NewResolvedCallImpl<D>.() -> CallableDescriptor): CallableDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewResolvedCallImpl<D>
    <R> -> CallableDescriptor

'resolvedCallAtom' @ [490:39] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'candidateDescriptor' @ [490:56] ==> public abstract val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'resolvedCallAtom' @ [491:41] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'candidateDescriptor' @ [491:58] ==> public abstract val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'returnType' @ [491:78] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'contains' @ [491:90] ==> public fun KotlinType.contains(predicate: (UnwrappedType) -> Boolean): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [491:101] ==> value-parameter it: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when {
                candidateDescriptor is FunctionDescriptor ||
                (candidateDescriptor is PropertyDescriptor && (candidateDescriptor.typeParameters.isNotEmpty() || containsCapturedTypes)) ->
                    // this code is very suspicious. Now it is very useful for BE, because they cannot do nothing with captured types,
                    // but it seems like temporary solution.
                    candidateDescriptor.substitute(resolvedCallAtom.substitutor).substituteAndApproximateCapturedTypes(
                            substitutor ?: FreshVariableNewTypeSubstitutor.Empty)
                else ->
                    candidateDescriptor
            }' @ [493:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableDescriptor, entry1: CallableDescriptor): CallableDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableDescriptor

'candidateDescriptor' @ [494:17] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [495:18] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [495:64] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'typeParameters' @ [495:84] ==> public final val PropertyDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isNotEmpty' @ [495:99] ==> @InlineOnly public inline fun <T> Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'containsCapturedTypes' @ [495:115] ==> val containsCapturedTypes: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [498:21] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'substitute' @ [498:41] ==> public fun CallableDescriptor.substitute(substitutor: NewTypeSubstitutor): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'resolvedCallAtom' @ [498:52] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'substitutor' @ [498:69] ==> public abstract val substitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'substituteAndApproximateCapturedTypes' @ [498:82] ==> public fun CallableDescriptor.substituteAndApproximateCapturedTypes(substitutor: NewTypeSubstitutor): CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [499:29] ==> value-parameter substitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor[ValueParameterDescriptorImpl]

'Empty' @ [499:76] ==> public final val Empty: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.Companion[DeserializedPropertyDescriptor]

'candidateDescriptor' @ [501:21] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'typeArguments' @ [505:9] ==> private final lateinit var typeArguments: List<UnwrappedType> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'resolvedCallAtom' @ [505:25] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'substitutor' @ [505:42] ==> public abstract val substitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'freshVariables' @ [505:54] ==> public final val freshVariables: List<TypeVariableFromCallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[DeserializedPropertyDescriptor]

'map' @ [505:69] ==> public inline fun <T, R> Iterable<TypeVariableFromCallableDescriptor>.map(transform: (TypeVariableFromCallableDescriptor) -> UnwrappedType): List<UnwrappedType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeVariableFromCallableDescriptor
    <R> -> UnwrappedType

'substitutor' @ [506:32] ==> value-parameter substitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor[ValueParameterDescriptorImpl]

'Empty' @ [506:79] ==> public final val Empty: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor.Companion[DeserializedPropertyDescriptor]

'safeSubstitute' @ [506:86] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.NewTypeSubstitutor[DeserializedSimpleFunctionDescriptor]

'it' @ [506:101] ==> value-parameter it: TypeVariableFromCallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [506:104] ==> public final val defaultType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.inference.model.TypeVariableFromCallableDescriptor[DeserializedPropertyDescriptor]

'TypeApproximator' @ [507:13] ==> public constructor TypeApproximator() defined in org.jetbrains.kotlin.types.TypeApproximator[DeserializedClassConstructorDescriptor]

'approximateToSuperType' @ [507:32] ==> public final fun approximateToSuperType(type: UnwrappedType, conf: TypeApproximatorConfiguration): UnwrappedType? defined in org.jetbrains.kotlin.types.TypeApproximator[DeserializedSimpleFunctionDescriptor]

'substituted' @ [507:55] ==> val substituted: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'CapturedTypesApproximation' @ [507:98] ==> public object CapturedTypesApproximation : TypeApproximatorConfiguration.AbstractCapturedTypesApproximation defined in org.jetbrains.kotlin.types.TypeApproximatorConfiguration[FakeCallableDescriptorForObject]

'substituted' @ [507:129] ==> val substituted: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.setResultingSubstitutor.<anonymous>[LocalVariableDescriptor]

'setResultingSubstitutor' @ [512:9] ==> public final fun setResultingSubstitutor(substitutor: NewTypeSubstitutor?): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[SimpleFunctionDescriptorImpl]

'substitutor' @ [512:33] ==> value-parameter substitutor: NewTypeSubstitutor? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl.<init>[ValueParameterDescriptorImpl]

'when (this) {
    ResolutionCandidateApplicability.RESOLVED, ResolutionCandidateApplicability.RESOLVED_LOW_PRIORITY -> ResolutionStatus.SUCCESS
    ResolutionCandidateApplicability.INAPPLICABLE_WRONG_RECEIVER -> ResolutionStatus.RECEIVER_TYPE_ERROR
    else -> ResolutionStatus.OTHER_ERROR
}' @ [516:79] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolutionStatus, entry1: ResolutionStatus, entry2: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolutionStatus

'this' @ [516:85] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.toResolutionStatus[ReceiverParameterDescriptorImpl]

'RESOLVED' @ [517:38] ==> enum entry RESOLVED defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'RESOLVED_LOW_PRIORITY' @ [517:81] ==> enum entry RESOLVED_LOW_PRIORITY defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'SUCCESS' @ [517:123] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INAPPLICABLE_WRONG_RECEIVER' @ [518:38] ==> enum entry INAPPLICABLE_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'RECEIVER_TYPE_ERROR' @ [518:86] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'OTHER_ERROR' @ [519:30] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'functionCall' @ [525:72] ==> value-parameter functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl.<init>[ValueParameterDescriptorImpl]

'functionCall' @ [526:26] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'resolvedCallAtom' @ [526:39] ==> public final val resolvedCallAtom: ResolvedCallAtom defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'atom' @ [526:56] ==> public abstract val atom: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallAtom[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [526:61] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'cast' @ [526:75] ==> public inline fun <reified T : Any> Any?.cast(): PSIKotlinCallForInvoke defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PSIKotlinCallForInvoke

'baseCall' @ [526:106] ==> public final val baseCall: PSIKotlinCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallForInvoke[PropertyDescriptorImpl]

'this' @ [530:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.isNewNotCompleted[ReceiverParameterDescriptorImpl]

'!' @ [531:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'functionCall' @ [531:17] ==> public open val functionCall: NewResolvedCallImpl<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewVariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'isCompleted' @ [531:30] ==> public final var isCompleted: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

'this' @ [533:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.isNewNotCompleted[ReceiverParameterDescriptorImpl]

'!' @ [534:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCompleted' @ [534:17] ==> public final var isCompleted: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[PropertyDescriptorImpl]

