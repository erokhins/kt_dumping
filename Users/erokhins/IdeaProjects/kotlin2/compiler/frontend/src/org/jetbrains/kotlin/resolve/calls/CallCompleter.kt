'if (results.isSingleResult) results.resultingCall else null' @ [72:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: MutableResolvedCall<D>?, elseBranch: MutableResolvedCall<D>?): MutableResolvedCall<D>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MutableResolvedCall<D>?

'results' @ [72:32] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'isSingleResult' @ [72:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'results' @ [72:56] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'resultingCall' @ [72:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.resultingCall: MutableResolvedCall<(D..D?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'!' @ [76:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInvokeCallOnVariable' @ [76:14] ==> public fun isInvokeCallOnVariable(call: Call): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'context' @ [76:37] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'call' @ [76:45] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'create' @ [77:56] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'context' @ [77:63] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'trace' @ [77:71] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'completeResolvedCallAndArguments' @ [79:13] ==> private final fun <D : CallableDescriptor> completeResolvedCallAndArguments(resolvedCall: MutableResolvedCall<D>?, results: OverloadResolutionResultsImpl<D>, context: BasicCallResolutionContext, tracing: TracingStrategy): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'resolvedCall' @ [79:46] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'results' @ [79:60] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'context' @ [79:69] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [79:77] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'temporaryTrace' @ [79:97] ==> val temporaryTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'tracing' @ [79:114] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'completeAllCandidates' @ [81:13] ==> private final fun <D : CallableDescriptor> completeAllCandidates(context: BasicCallResolutionContext, results: OverloadResolutionResultsImpl<D>): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [81:35] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'results' @ [81:44] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'temporaryTrace' @ [83:13] ==> val temporaryTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'commit' @ [83:28] ==> public open fun commit(): Unit defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'resolvedCall' @ [86:13] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'context' @ [86:37] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'trace' @ [86:45] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'wantsDiagnostics' @ [86:51] ==> public abstract fun wantsDiagnostics(): Boolean defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'if (resolvedCall is VariableAsFunctionResolvedCall)
                resolvedCall.variableCall.call.calleeExpression
            else
                resolvedCall.call.calleeExpression' @ [87:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'resolvedCall' @ [87:40] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'resolvedCall' @ [88:17] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'variableCall' @ [88:30] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'call' @ [88:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'calleeExpression' @ [88:48] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'resolvedCall' @ [90:17] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'call' @ [90:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'calleeExpression' @ [90:35] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'if (calleeExpression != null && !calleeExpression.isFakeElement) calleeExpression
                    else resolvedCall.call.callElement' @ [92:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'calleeExpression' @ [92:25] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'!' @ [92:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'calleeExpression' @ [92:54] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'isFakeElement' @ [92:71] ==> public val KtElement.isFakeElement: Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[PropertyDescriptorImpl]

'calleeExpression' @ [92:86] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'resolvedCall' @ [93:26] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'call' @ [93:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'callElement' @ [93:44] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'CallCheckerContext' @ [95:38] ==> public constructor CallCheckerContext(c: ResolutionContext<*>, languageVersionSettings: LanguageVersionSettings) defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[ClassConstructorDescriptorImpl]

'context' @ [95:57] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [95:66] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'callCheckers' @ [96:33] ==> private final val callCheckers: Iterable<CallChecker> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'callChecker' @ [97:17] ==> val callChecker: CallChecker defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'check' @ [97:29] ==> public abstract fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [97:35] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'reportOn' @ [97:49] ==> val reportOn: KtElement defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'callCheckerContext' @ [97:59] ==> val callCheckerContext: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'resolvedCall' @ [99:21] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'callChecker' @ [100:21] ==> val callChecker: CallChecker defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'check' @ [100:33] ==> public abstract fun check(resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CallChecker[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [100:39] ==> val resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'variableCall' @ [100:52] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'reportOn' @ [100:66] ==> val reportOn: KtElement defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'callCheckerContext' @ [100:76] ==> val callCheckerContext: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[LocalVariableDescriptor]

'results' @ [105:13] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'isSingleResult' @ [105:21] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'results' @ [105:39] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'resultingCall' @ [105:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.resultingCall: MutableResolvedCall<(D..D?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'status' @ [105:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'isSuccess' @ [105:68] ==> public final val ResolutionStatus.isSuccess: Boolean[MyPropertyDescriptor]

'results' @ [106:20] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'changeStatusToSuccess' @ [106:28] ==> @NotNull public open fun changeStatusToSuccess(): OverloadResolutionResultsImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsImpl[JavaMethodDescriptor]

'results' @ [108:16] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCall[ValueParameterDescriptorImpl]

'Suppress' @ [115:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'if (context.collectAllCandidates) {
            results.allCandidates!!
        }
        else {
            results.resultingCalls
        }' @ [116:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (MutableCollection<out (ResolvedCall<D>..ResolvedCall<D>?)>..Collection<(ResolvedCall<D>..ResolvedCall<D>?)>), elseBranch: (MutableCollection<out (ResolvedCall<D>..ResolvedCall<D>?)>..Collection<(ResolvedCall<D>..ResolvedCall<D>?)>)): (MutableCollection<out (ResolvedCall<D>..ResolvedCall<D>?)>..Collection<(ResolvedCall<D>..ResolvedCall<D>?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<D>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<D>?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<D>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<D>?)>)

'context' @ [116:31] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'collectAllCandidates' @ [116:39] ==> public final val collectAllCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'results' @ [117:13] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'allCandidates' @ [117:21] ==> public final var <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.allCandidates: (MutableCollection<(ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>?..Collection<(ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'results' @ [120:13] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'resultingCalls' @ [120:21] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.resultingCalls: (MutableCollection<(MutableResolvedCall<(D..D?)>..MutableResolvedCall<(D..D?)>?)>..Collection<(MutableResolvedCall<(D..D?)>..MutableResolvedCall<(D..D?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'candidates' @ [123:9] ==> val candidates: Collection<MutableResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[LocalVariableDescriptor]

'filterNot' @ [123:20] ==> public inline fun <T> Iterable<MutableResolvedCall<D>>.filterNot(predicate: (MutableResolvedCall<D>) -> Boolean): List<MutableResolvedCall<D>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableResolvedCall<D>

'resolvedCall' @ [123:48] ==> value-parameter resolvedCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates.<anonymous>[ValueParameterDescriptorImpl]

'isCompleted' @ [123:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.isCompleted: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'forEach' @ [123:75] ==> @HidesMembers public inline fun <T> Iterable<MutableResolvedCall<D>>.forEach(action: (MutableResolvedCall<D>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableResolvedCall<D>

'create' @ [126:63] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'context' @ [126:70] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'trace' @ [126:78] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'completeResolvedCallAndArguments' @ [127:13] ==> private final fun <D : CallableDescriptor> completeResolvedCallAndArguments(resolvedCall: MutableResolvedCall<D>?, results: OverloadResolutionResultsImpl<D>, context: BasicCallResolutionContext, tracing: TracingStrategy): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'resolvedCall' @ [127:46] ==> value-parameter resolvedCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates.<anonymous>[ValueParameterDescriptorImpl]

'results' @ [127:60] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'context' @ [127:69] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [127:77] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'temporaryBindingTrace' @ [127:97] ==> val temporaryBindingTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeAllCandidates.<anonymous>[LocalVariableDescriptor]

'EMPTY' @ [127:137] ==> public final val EMPTY: (TracingStrategy..TracingStrategy?) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaPropertyDescriptor]

'resolvedCall' @ [137:13] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [137:37] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'isCompleted' @ [137:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.isCompleted: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'resolvedCall' @ [137:65] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'constraintSystem' @ [137:78] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.constraintSystem: ConstraintSystem?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'completeArguments' @ [138:13] ==> private final fun <D : CallableDescriptor> completeArguments(context: BasicCallResolutionContext, results: OverloadResolutionResultsImpl<D>): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [138:31] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'results' @ [138:40] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [139:13] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'markCallAsCompleted' @ [139:27] ==> public abstract fun markCallAsCompleted(): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'resolvedCall' @ [143:9] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'completeConstraintSystem' @ [143:22] ==> private final fun <D : CallableDescriptor> MutableResolvedCall<D>.completeConstraintSystem(expectedType: KotlinType, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [143:47] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'expectedType' @ [143:55] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [143:69] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'trace' @ [143:77] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'completeArguments' @ [145:9] ==> private final fun <D : CallableDescriptor> completeArguments(context: BasicCallResolutionContext, results: OverloadResolutionResultsImpl<D>): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [145:27] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'results' @ [145:36] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [147:9] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'updateResolutionStatusFromConstraintSystem' @ [147:22] ==> private final fun <D : CallableDescriptor> MutableResolvedCall<D>.updateResolutionStatusFromConstraintSystem(context: BasicCallResolutionContext, tracing: TracingStrategy): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [147:65] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'tracing' @ [147:74] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'resolvedCall' @ [148:9] ==> value-parameter resolvedCall: MutableResolvedCall<D>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeResolvedCallAndArguments[ValueParameterDescriptorImpl]

'markCallAsCompleted' @ [148:22] ==> public abstract fun markCallAsCompleted(): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'candidateDescriptor' @ [155:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'returnType' @ [155:46] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'if (call.isCallableReference()) {
                    // TODO: compute generic type argument for R in the kotlin.Function<R> supertype (KT-12963)
                    if (!TypeUtils.noExpectedType(expectedType) && expectedType.isFunctionType) expectedType.getReturnTypeFromFunctionType()
                    else TypeUtils.NO_EXPECTED_TYPE
                }
                else expectedType' @ [158:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'call' @ [158:21] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'isCallableReference' @ [158:26] ==> public fun Call.isCallableReference(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'if (!TypeUtils.noExpectedType(expectedType) && expectedType.isFunctionType) expectedType.getReturnTypeFromFunctionType()
                    else TypeUtils.NO_EXPECTED_TYPE' @ [160:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'!' @ [160:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [160:36] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [160:51] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'expectedType' @ [160:68] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'isFunctionType' @ [160:81] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'expectedType' @ [160:97] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'getReturnTypeFromFunctionType' @ [160:110] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'NO_EXPECTED_TYPE' @ [161:36] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'expectedType' @ [163:22] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'type' @ [166:17] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.typeInSystem[ValueParameterDescriptorImpl]

'let' @ [166:23] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType?

'typeVariableSubstitutors' @ [167:39] ==> public abstract val typeVariableSubstitutors: Map<CallHandle, TypeSubstitutor> defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[PropertyDescriptorImpl]

'call' @ [167:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'toHandle' @ [167:69] ==> public fun Call.toHandle(): CallHandle defined in org.jetbrains.kotlin.resolve.calls.inference in file TypeVariable.kt[SimpleFunctionDescriptorImpl]

'error' @ [167:84] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'call' @ [167:117] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'substitutor' @ [168:21] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.typeInSystem.<anonymous>[LocalVariableDescriptor]

'substitute' @ [168:33] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'it' @ [168:44] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.typeInSystem.<anonymous>[ValueParameterDescriptorImpl]

'INVARIANT' @ [168:57] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'invoke' @ [172:26] ==> public abstract operator fun invoke(p1: ConstraintSystem.Builder): ConstraintSystem? defined in kotlin.Function1[FunctionInvokeDescriptor]

'constraintSystem' @ [172:63] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.constraintSystem: ConstraintSystem?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'toBuilder' @ [172:82] ==> public abstract fun toBuilder(filterConstraintPosition: (ConstraintPosition) -> Boolean = ...): ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'system' @ [173:17] ==> val system: ConstraintSystem? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.updateSystemIfNeeded[LocalVariableDescriptor]

'setConstraintSystem' @ [174:17] ==> public abstract fun setConstraintSystem(@NotNull constraintSystem: ConstraintSystem): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'system' @ [174:37] ==> val system: ConstraintSystem? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.updateSystemIfNeeded[LocalVariableDescriptor]

'returnType' @ [178:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'!' @ [178:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [178:46] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedReturnType' @ [178:61] ==> val expectedReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'updateSystemIfNeeded' @ [179:13] ==> local final fun updateSystemIfNeeded(buildSystemWithAdditionalConstraints: (ConstraintSystem.Builder) -> ConstraintSystem?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'builder' @ [180:42] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'typeInSystem' @ [180:50] ==> local final fun ConstraintSystem.Builder.typeInSystem(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'returnType' @ [180:63] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'if (returnTypeInSystem != null) {
                    builder.addSubtypeConstraint(returnTypeInSystem, expectedReturnType, EXPECTED_TYPE_POSITION.position())
                    builder.build()
                }
                else null' @ [181:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintSystem?, elseBranch: ConstraintSystem?): ConstraintSystem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintSystem?

'returnTypeInSystem' @ [181:21] ==> val returnTypeInSystem: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'builder' @ [182:21] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [182:29] ==> public abstract fun addSubtypeConstraint(constrainingType: KotlinType?, subjectType: KotlinType?, constraintPosition: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'returnTypeInSystem' @ [182:50] ==> val returnTypeInSystem: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'expectedReturnType' @ [182:70] ==> val expectedReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'EXPECTED_TYPE_POSITION' @ [182:90] ==> enum entry EXPECTED_TYPE_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [182:113] ==> public final fun position(): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'builder' @ [183:21] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [183:29] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'trace' @ [189:41] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'CONSTRAINT_SYSTEM_COMPLETER' @ [189:47] ==> public final val CONSTRAINT_SYSTEM_COMPLETER: (WritableSlice<(KtElement..KtElement?), (ConstraintSystemCompleter..ConstraintSystemCompleter?)>..WritableSlice<(KtElement..KtElement?), (ConstraintSystemCompleter..ConstraintSystemCompleter?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'call' @ [189:76] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'calleeExpression' @ [189:81] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'constraintSystemCompleter' @ [190:13] ==> val constraintSystemCompleter: ConstraintSystemCompleter? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'updateSystemIfNeeded' @ [194:13] ==> local final fun updateSystemIfNeeded(buildSystemWithAdditionalConstraints: (ConstraintSystem.Builder) -> ConstraintSystem?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'constraintSystemCompleter' @ [195:17] ==> val constraintSystemCompleter: ConstraintSystemCompleter? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'completeConstraintSystem' @ [195:43] ==> public abstract fun completeConstraintSystem(@NotNull constraintSystem: ConstraintSystem.Builder, @NotNull resolvedCall: ResolvedCall<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemCompleter[JavaMethodDescriptor]

'builder' @ [195:68] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [195:77] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ReceiverParameterDescriptorImpl]

'builder' @ [196:30] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [196:38] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'system' @ [197:30] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'filterConstraintsOut' @ [197:37] ==> public fun ConstraintSystem.filterConstraintsOut(excludePositionKind: ConstraintPositionKind): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference in file constraintSystemUtils.kt[SimpleFunctionDescriptorImpl]

'TYPE_BOUND_POSITION' @ [197:58] ==> enum entry TYPE_BOUND_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'status' @ [197:79] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'if (status.hasOnlyErrorsDerivedFrom(FROM_COMPLETER)) null else system' @ [198:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintSystem?, elseBranch: ConstraintSystem?): ConstraintSystem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintSystem?

'status' @ [198:21] ==> val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'hasOnlyErrorsDerivedFrom' @ [198:28] ==> public abstract fun hasOnlyErrorsDerivedFrom(kind: ConstraintPositionKind): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'FROM_COMPLETER' @ [198:53] ==> enum entry FROM_COMPLETER defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'system' @ [198:80] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'returnType' @ [202:13] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'expectedReturnType' @ [202:35] ==> val expectedReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'UNIT_EXPECTED_TYPE' @ [202:68] ==> public final val UNIT_EXPECTED_TYPE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'updateSystemIfNeeded' @ [203:13] ==> local final fun updateSystemIfNeeded(buildSystemWithAdditionalConstraints: (ConstraintSystem.Builder) -> ConstraintSystem?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'builder' @ [204:42] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'typeInSystem' @ [204:50] ==> local final fun ConstraintSystem.Builder.typeInSystem(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'returnType' @ [204:63] ==> val returnType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'if (returnTypeInSystem != null) {
                    builder.addSubtypeConstraint(returnTypeInSystem, builtIns.unitType, EXPECTED_TYPE_POSITION.position())
                    val system = builder.build()
                    if (system.status.isSuccessful()) system else null
                }
                else null' @ [205:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintSystem?, elseBranch: ConstraintSystem?): ConstraintSystem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintSystem?

'returnTypeInSystem' @ [205:21] ==> val returnTypeInSystem: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'builder' @ [206:21] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [206:29] ==> public abstract fun addSubtypeConstraint(constrainingType: KotlinType?, subjectType: KotlinType?, constraintPosition: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'returnTypeInSystem' @ [206:50] ==> val returnTypeInSystem: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'builtIns' @ [206:70] ==> private final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'unitType' @ [206:79] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'EXPECTED_TYPE_POSITION' @ [206:89] ==> enum entry EXPECTED_TYPE_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [206:112] ==> public final fun position(): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'builder' @ [207:34] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [207:42] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'if (system.status.isSuccessful()) system else null' @ [208:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ConstraintSystem?, elseBranch: ConstraintSystem?): ConstraintSystem?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ConstraintSystem?

'system' @ [208:25] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'status' @ [208:32] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'isSuccessful' @ [208:39] ==> public abstract fun isSuccessful(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'system' @ [208:55] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[LocalVariableDescriptor]

'call' @ [214:13] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'isCallableReference' @ [214:18] ==> public fun Call.isCallableReference(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'!' @ [214:43] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [214:54] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [214:69] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'expectedType' @ [214:86] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'isFunctionType' @ [214:99] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'updateSystemIfNeeded' @ [215:13] ==> local final fun updateSystemIfNeeded(buildSystemWithAdditionalConstraints: (ConstraintSystem.Builder) -> ConstraintSystem?): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'candidateDescriptor' @ [216:17] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'valueParameters' @ [216:37] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'zip' @ [216:53] ==> public infix fun <T, R> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.zip(other: Iterable<TypeProjection>): List<Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), TypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> TypeProjection

'expectedType' @ [216:57] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[ValueParameterDescriptorImpl]

'getValueParameterTypesFromFunctionType' @ [216:70] ==> public fun KotlinType.getValueParameterTypesFromFunctionType(): List<TypeProjection> defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'forEach' @ [216:112] ==> @HidesMembers public inline fun <T> Iterable<Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), TypeProjection>>.forEach(action: (Pair<(ValueParameterDescriptor..ValueParameterDescriptor?), TypeProjection>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?), TypeProjection>

'component1' @ [216:123] ==> public final operator fun component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [216:134] ==> public final operator fun component2(): TypeProjection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'builder' @ [217:50] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'typeInSystem' @ [217:58] ==> local final fun ConstraintSystem.Builder.typeInSystem(type: KotlinType?): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[SimpleFunctionDescriptorImpl]

'parameter' @ [217:71] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>.<anonymous>[LocalVariableDescriptor]

'type' @ [217:81] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'builder' @ [218:21] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [218:29] ==> public abstract fun addSubtypeConstraint(constrainingType: KotlinType?, subjectType: KotlinType?, constraintPosition: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'valueParameterInSystem' @ [218:50] ==> val valueParameterInSystem: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>.<anonymous>[LocalVariableDescriptor]

'argument' @ [218:74] ==> val argument: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>.<anonymous>[LocalVariableDescriptor]

'type' @ [218:83] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'VALUE_PARAMETER_POSITION' @ [218:89] ==> enum entry VALUE_PARAMETER_POSITION defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[FakeCallableDescriptorForObject]

'position' @ [218:114] ==> public final fun position(index: Int): ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.constraintPosition.ConstraintPositionKind[SimpleFunctionDescriptorImpl]

'parameter' @ [218:123] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>.<anonymous>[LocalVariableDescriptor]

'index' @ [218:133] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'builder' @ [221:17] ==> value-parameter builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [221:25] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'constraintSystem' @ [225:23] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.constraintSystem: ConstraintSystem?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'toBuilder' @ [225:42] ==> public abstract fun toBuilder(filterConstraintPosition: (ConstraintPosition) -> Boolean = ...): ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[SimpleFunctionDescriptorImpl]

'builder' @ [226:9] ==> val builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'fixVariables' @ [226:17] ==> public abstract fun fixVariables(): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'builder' @ [227:22] ==> val builder: ConstraintSystem.Builder defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'build' @ [227:30] ==> public abstract fun build(): ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem.Builder[SimpleFunctionDescriptorImpl]

'setConstraintSystem' @ [228:9] ==> public abstract fun setConstraintSystem(@NotNull constraintSystem: ConstraintSystem): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'system' @ [228:29] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'setResultingSubstitutor' @ [230:9] ==> public abstract fun setResultingSubstitutor(@NotNull substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'system' @ [230:33] ==> val system: ConstraintSystem defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeConstraintSystem[LocalVariableDescriptor]

'resultingSubstitutor' @ [230:40] ==> public abstract val resultingSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'createForCallBeingAnalyzed' @ [237:70] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> createForCallBeingAnalyzed(@NotNull candidateCall: MutableResolvedCall<(D..D?)>, @NotNull context: BasicCallResolutionContext, @NotNull tracing: TracingStrategy): CallCandidateResolutionContext<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'this' @ [237:97] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ReceiverParameterDescriptorImpl]

'context' @ [237:103] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'tracing' @ [237:112] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'candidateResolver' @ [238:44] ==> private final val candidateResolver: CandidateResolver defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'checkAllValueArguments' @ [238:62] ==> public final fun <D : CallableDescriptor> checkAllValueArguments(context: CallCandidateResolutionContext<(D..D?)>, resolveFunctionArgumentBodies: ResolveArgumentsMode): CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (D..D?)

'contextWithResolvedCall' @ [238:85] ==> val contextWithResolvedCall: CallCandidateResolutionContext<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'RESOLVE_FUNCTION_ARGUMENTS' @ [238:110] ==> enum entry RESOLVE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'status' @ [240:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'constraintSystem' @ [241:13] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.constraintSystem: ConstraintSystem?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'status' @ [241:32] ==> public abstract val status: ConstraintSystemStatus defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystem[PropertyDescriptorImpl]

'isSuccessful' @ [241:39] ==> public abstract fun isSuccessful(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemStatus[SimpleFunctionDescriptorImpl]

'status' @ [242:17] ==> val status: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'UNKNOWN_STATUS' @ [242:44] ==> enum entry UNKNOWN_STATUS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'status' @ [242:62] ==> val status: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'INCOMPLETE_TYPE_INFERENCE' @ [242:89] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'setStatusToSuccess' @ [243:17] ==> public abstract fun setStatusToSuccess(): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'extensionReceiver' @ [248:28] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'type' @ [248:47] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'create' @ [250:44] ==> @NotNull public open fun create(@NotNull descriptor: CallableDescriptor, @NotNull constraintSystem: ConstraintSystem, @NotNull valueArgumentsTypes: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>), @Nullable receiverArgumentType: KotlinType?, @NotNull expectedType: KotlinType, @NotNull call: Call): InferenceErrorData defined in org.jetbrains.kotlin.resolve.calls.inference.InferenceErrorData[JavaMethodDescriptor]

'candidateDescriptor' @ [251:17] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'constraintSystem' @ [251:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.constraintSystem: ConstraintSystem?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'valueArgumentsCheckingResult' @ [251:58] ==> val valueArgumentsCheckingResult: CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'argumentTypes' @ [251:87] ==> public final val argumentTypes: List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[PropertyDescriptorImpl]

'receiverType' @ [252:17] ==> val receiverType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'context' @ [252:31] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'expectedType' @ [252:39] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [252:53] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'call' @ [252:61] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'tracing' @ [254:9] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'typeInferenceFailed' @ [254:17] ==> public abstract fun typeInferenceFailed(@NotNull context: ResolutionContext<*>, @NotNull inferenceErrorData: InferenceErrorData): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'context' @ [254:37] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[ValueParameterDescriptorImpl]

'errorData' @ [254:46] ==> val errorData: InferenceErrorData defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateResolutionStatusFromConstraintSystem[LocalVariableDescriptor]

'addStatus' @ [256:9] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [256:36] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'context' @ [263:13] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'checkArguments' @ [263:21] ==> @NotNull public final val checkArguments: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'CHECK_VALUE_ARGUMENTS' @ [263:62] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'if (results.isSingleResult) {
            val resolvedCall = results.resultingCall
            getArgumentMapping = { argument -> resolvedCall.getArgumentMapping(argument) }
            getDataFlowInfoForArgument = { argument -> resolvedCall.dataFlowInfoForArguments.getInfo(argument) }
        }
        else {
            getArgumentMapping = { ArgumentUnmapped }
            getDataFlowInfoForArgument = { context.dataFlowInfo }
        }' @ [267:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'results' @ [267:13] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'isSingleResult' @ [267:21] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'results' @ [268:32] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'resultingCall' @ [268:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.resultingCall: MutableResolvedCall<(D..D?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'getArgumentMapping' @ [269:13] ==> val getArgumentMapping: (ValueArgument) -> ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'resolvedCall' @ [269:48] ==> val resolvedCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'getArgumentMapping' @ [269:61] ==> @NotNull public abstract fun getArgumentMapping(@NotNull valueArgument: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'argument' @ [269:80] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments.<anonymous>[ValueParameterDescriptorImpl]

'getDataFlowInfoForArgument' @ [270:13] ==> val getDataFlowInfoForArgument: (ValueArgument) -> DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'resolvedCall' @ [270:56] ==> val resolvedCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'dataFlowInfoForArguments' @ [270:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.dataFlowInfoForArguments: MutableDataFlowInfoForArguments[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'getInfo' @ [270:94] ==> @NotNull public abstract fun getInfo(@NotNull valueArgument: ValueArgument): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.model.MutableDataFlowInfoForArguments[JavaMethodDescriptor]

'argument' @ [270:102] ==> value-parameter argument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments.<anonymous>[ValueParameterDescriptorImpl]

'getArgumentMapping' @ [273:13] ==> val getArgumentMapping: (ValueArgument) -> ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'ArgumentUnmapped' @ [273:36] ==> public object ArgumentUnmapped : ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model in file ArgumentMapping.kt[FakeCallableDescriptorForObject]

'getDataFlowInfoForArgument' @ [274:13] ==> val getDataFlowInfoForArgument: (ValueArgument) -> DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'context' @ [274:44] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [274:52] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [277:31] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'call' @ [277:39] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'valueArguments' @ [277:44] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'invoke' @ [278:35] ==> public abstract operator fun invoke(p1: ValueArgument): ArgumentMapping defined in kotlin.Function1[FunctionInvokeDescriptor]

'valueArgument' @ [278:54] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'component1' @ [279:18] ==> public final operator fun component1(): KotlinType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [279:32] ==> public final operator fun component2(): CallPosition defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (argumentMapping) {
                is ArgumentMatch -> Pair(
                        getEffectiveExpectedType(argumentMapping.valueParameter, valueArgument),
                        CallPosition.ValueArgumentPosition(results.resultingCall, argumentMapping.valueParameter, valueArgument))
                else -> Pair(TypeUtils.NO_EXPECTED_TYPE, CallPosition.Unknown)
            }' @ [279:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<KotlinType, CallPosition>, entry1: Pair<KotlinType, CallPosition>): Pair<KotlinType, CallPosition>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<KotlinType, CallPosition>

'argumentMapping' @ [279:54] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'Pair' @ [280:37] ==> public constructor Pair<out A, out B>(first: KotlinType, second: CallPosition.ValueArgumentPosition) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KotlinType
    <out B> -> ValueArgumentPosition

'getEffectiveExpectedType' @ [281:25] ==> public fun getEffectiveExpectedType(parameterDescriptor: ValueParameterDescriptor, argument: ValueArgument): KotlinType defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'argumentMapping' @ [281:50] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'valueParameter' @ [281:66] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'valueArgument' @ [281:82] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'ValueArgumentPosition' @ [282:38] ==> public constructor ValueArgumentPosition(resolvedCall: ResolvedCall<*>, valueParameter: ValueParameterDescriptor, valueArgument: ValueArgument) defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ValueArgumentPosition[ClassConstructorDescriptorImpl]

'results' @ [282:60] ==> value-parameter results: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'resultingCall' @ [282:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<D>.resultingCall: MutableResolvedCall<(D..D?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'argumentMapping' @ [282:83] ==> val argumentMapping: ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'valueParameter' @ [282:99] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[PropertyDescriptorImpl]

'valueArgument' @ [282:115] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'Pair' @ [283:25] ==> public constructor Pair<out A, out B>(first: SimpleType, second: CallPosition.Unknown) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> SimpleType
    <out B> -> Unknown

'NO_EXPECTED_TYPE' @ [283:40] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'Unknown' @ [283:71] ==> public object Unknown : CallPosition defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition[FakeCallableDescriptorForObject]

'context' @ [286:21] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[ValueParameterDescriptorImpl]

'replaceDataFlowInfo' @ [286:29] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'invoke' @ [286:49] ==> public abstract operator fun invoke(p1: ValueArgument): DataFlowInfo defined in kotlin.Function1[FunctionInvokeDescriptor]

'valueArgument' @ [286:76] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'replaceExpectedType' @ [287:30] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'expectedType' @ [287:50] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'replaceCallPosition' @ [288:30] ==> @NotNull public open fun replaceCallPosition(@NotNull callPosition: CallPosition): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'callPosition' @ [288:50] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'completeOneArgument' @ [289:13] ==> private final fun completeOneArgument(valueArgument: ValueArgument, context: BasicCallResolutionContext): Unit defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]

'valueArgument' @ [289:33] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'newContext' @ [289:48] ==> val newContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeArguments[LocalVariableDescriptor]

'valueArgument' @ [297:13] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'isExternal' @ [297:27] ==> public abstract fun isExternal(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'valueArgument' @ [299:26] ==> value-parameter valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'getArgumentExpression' @ [299:40] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'?:' @ [300:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtExpression?, right: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtExpression

'getLastElementDeparenthesized' @ [300:41] ==> @Nullable public open fun getLastElementDeparenthesized(@Nullable expression: KtExpression?, @NotNull statementFilter: StatementFilter): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [300:71] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [300:83] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'statementFilter' @ [300:91] ==> @NotNull public final val statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [302:28] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'trace' @ [302:36] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'getType' @ [302:42] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [302:50] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'recordedType' @ [303:40] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'completeCallForArgument' @ [305:23] ==> private final fun completeCallForArgument(expression: KtExpression, context: BasicCallResolutionContext): OverloadResolutionResultsImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]

'deparenthesized' @ [305:47] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [305:64] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'results' @ [306:13] ==> val results: OverloadResolutionResultsImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'results' @ [306:32] ==> val results: OverloadResolutionResultsImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'isSingleResult' @ [306:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<out (CallableDescriptor..CallableDescriptor?)>.isSingleResult: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'results' @ [307:32] ==> val results: OverloadResolutionResultsImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'resultingCall' @ [307:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<out (CallableDescriptor..CallableDescriptor?)>.resultingCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'updatedType' @ [308:13] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'if (resolvedCall.hasInferredReturnType()) {
                resolvedCall.makeNullableTypeIfSafeReceiver(resolvedCall.resultingDescriptor?.returnType, context)
            }
            else null' @ [308:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType?, elseBranch: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType?

'resolvedCall' @ [308:31] ==> val resolvedCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'hasInferredReturnType' @ [308:44] ==> public abstract fun hasInferredReturnType(): Boolean defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'resolvedCall' @ [309:17] ==> val resolvedCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'makeNullableTypeIfSafeReceiver' @ [309:30] ==> public fun ResolvedCall<*>.makeNullableTypeIfSafeReceiver(type: KotlinType?, context: CallResolutionContext<*>): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [309:61] ==> val resolvedCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'resultingDescriptor' @ [309:74] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'returnType' @ [309:95] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'context' @ [309:107] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'recordedType' @ [316:13] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'!' @ [316:37] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'recordedType' @ [316:38] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'constructor' @ [316:51] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'isDenotable' @ [316:63] ==> public final val TypeConstructor.isDenotable: Boolean[MyPropertyDescriptor]

'updatedType' @ [317:13] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'argumentTypeResolver' @ [317:27] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'updateResultArgumentTypeIfNotDenotable' @ [317:48] ==> @Nullable public open fun updateResultArgumentTypeIfNotDenotable(@NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>), @NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'context' @ [317:87] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'expression' @ [317:96] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'updatedType' @ [317:111] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'updatedType' @ [320:9] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'updateRecordedTypeForArgument' @ [320:23] ==> private final fun updateRecordedTypeForArgument(updatedType: KotlinType?, recordedType: KotlinType?, argumentExpression: KtExpression, statementFilter: StatementFilter, trace: BindingTrace): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]

'updatedType' @ [320:53] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'recordedType' @ [320:66] ==> val recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'expression' @ [320:80] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [320:92] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'statementFilter' @ [320:100] ==> @NotNull public final val statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [320:117] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'trace' @ [320:125] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'getFunctionLiteralArgumentIfAny' @ [324:30] ==> @Nullable public open fun getFunctionLiteralArgumentIfAny(@NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KtFunction? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [324:62] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [324:74] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'let' @ [324:84] ==> @InlineOnly public inline fun <T, R> KtFunction.let(block: (KtFunction) -> KotlinTypeInfo): KotlinTypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFunction
    <R> -> KotlinTypeInfo

'argumentTypeResolver' @ [325:13] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'getFunctionLiteralTypeInfo' @ [325:34] ==> @NotNull public open fun getFunctionLiteralTypeInfo(@NotNull expression: KtExpression, @NotNull functionLiteral: KtFunction, @NotNull context: CallResolutionContext<*>, @NotNull resolveArgumentsMode: ResolveArgumentsMode): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [325:61] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'functionLiteralArgument' @ [325:73] ==> value-parameter functionLiteralArgument: KtFunction defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [325:98] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'RESOLVE_FUNCTION_ARGUMENTS' @ [325:107] ==> enum entry RESOLVE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'getCallableReferenceExpressionIfAny' @ [331:30] ==> @Nullable public open fun getCallableReferenceExpressionIfAny(@NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KtCallableReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [331:66] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [331:78] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'let' @ [331:88] ==> @InlineOnly public inline fun <T, R> KtCallableReferenceExpression.let(block: (KtCallableReferenceExpression) -> KotlinTypeInfo): KotlinTypeInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtCallableReferenceExpression
    <R> -> KotlinTypeInfo

'argumentTypeResolver' @ [332:13] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'getCallableReferenceTypeInfo' @ [332:34] ==> @NotNull public open fun getCallableReferenceTypeInfo(@NotNull expression: KtExpression, @NotNull callableReferenceExpression: KtCallableReferenceExpression, @NotNull context: CallResolutionContext<*>, @NotNull resolveArgumentsMode: ResolveArgumentsMode): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [332:63] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'callableReferenceArgument' @ [332:75] ==> value-parameter callableReferenceArgument: KtCallableReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [332:102] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'RESOLVE_FUNCTION_ARGUMENTS' @ [332:111] ==> enum entry RESOLVE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'dataFlowAnalyzer' @ [335:9] ==> private final val dataFlowAnalyzer: DataFlowAnalyzer defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[PropertyDescriptorImpl]

'checkType' @ [335:26] ==> @Nullable public open fun checkType(@Nullable expressionType: KotlinType?, @NotNull expression: KtExpression, @NotNull context: raw (ResolutionContext<(ResolutionContext<*>..ResolutionContext<*>?)>..ResolutionContext<out (ResolutionContext<*>..ResolutionContext<*>?)>)): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DataFlowAnalyzer[JavaMethodDescriptor]

'updatedType' @ [335:36] ==> var updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'deparenthesized' @ [335:49] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[LocalVariableDescriptor]

'context' @ [335:66] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeOneArgument[ValueParameterDescriptorImpl]

'getResolutionResultsCachedData' @ [342:26] ==> public fun getResolutionResultsCachedData(expression: KtExpression?, context: ResolutionContext<*>): ResolutionResultsCache.CachedData? defined in org.jetbrains.kotlin.resolve.calls in file GenericCandidateResolver.kt[SimpleFunctionDescriptorImpl]

'expression' @ [342:57] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[ValueParameterDescriptorImpl]

'context' @ [342:69] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[ValueParameterDescriptorImpl]

'component1' @ [343:14] ==> public final operator fun component1(): OverloadResolutionResultsImpl<*> defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCache.CachedData[SimpleFunctionDescriptorImpl]

'component2' @ [343:39] ==> public final operator fun component2(): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCache.CachedData[SimpleFunctionDescriptorImpl]

'component3' @ [343:54] ==> public final operator fun component3(): TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionResultsCache.CachedData[SimpleFunctionDescriptorImpl]

'cachedData' @ [343:65] ==> val cachedData: ResolutionResultsCache.CachedData defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[LocalVariableDescriptor]

'cachedContext' @ [345:34] ==> val cachedContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[LocalVariableDescriptor]

'replaceBindingTrace' @ [345:48] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [345:68] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[ValueParameterDescriptorImpl]

'trace' @ [345:76] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'replaceExpectedType' @ [346:18] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [346:38] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[ValueParameterDescriptorImpl]

'expectedType' @ [346:46] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'replaceCollectAllCandidates' @ [346:60] ==> @NotNull public open fun replaceCollectAllCandidates(newCollectAllCandidates: Boolean): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'replaceCallPosition' @ [346:95] ==> @NotNull public open fun replaceCallPosition(@NotNull callPosition: CallPosition): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'context' @ [346:115] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[ValueParameterDescriptorImpl]

'callPosition' @ [346:123] ==> @NotNull public final val callPosition: CallPosition defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'completeCall' @ [348:16] ==> public final fun <D : CallableDescriptor> completeCall(context: BasicCallResolutionContext, results: OverloadResolutionResultsImpl<out (CallableDescriptor..CallableDescriptor?)>, tracing: TracingStrategy): OverloadResolutionResultsImpl<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'contextForArgument' @ [348:29] ==> val contextForArgument: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[LocalVariableDescriptor]

'cachedResolutionResults' @ [348:49] ==> val cachedResolutionResults: OverloadResolutionResultsImpl<*> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[LocalVariableDescriptor]

'tracing' @ [348:74] ==> val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.completeCallForArgument[LocalVariableDescriptor]

'!' @ [359:14] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsErrorType' @ [359:26] ==> public open fun containsErrorType(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'recordedType' @ [359:44] ==> value-parameter recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'recordedType' @ [359:61] ==> value-parameter recordedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [359:77] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [359:93] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updatedType' @ [359:121] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'deparenthesizeOnce' @ [362:45] ==> @Nullable public open fun deparenthesizeOnce(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [362:64] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'deparenthesized' @ [363:17] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[LocalVariableDescriptor]

'expression' @ [363:36] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'deparenthesized' @ [363:55] ==> val deparenthesized: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[LocalVariableDescriptor]

'expression' @ [366:17] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'statementFilter' @ [367:24] ==> value-parameter statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'getLastStatementInABlock' @ [367:40] ==> public fun StatementFilter.getLastStatementInABlock(block: KtBlockExpression): KtExpression? defined in org.jetbrains.kotlin.resolve[SimpleFunctionDescriptorImpl]

'expression' @ [367:65] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'expression' @ [370:21] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.deparenthesizeOrGetSelector[ValueParameterDescriptorImpl]

'selectorExpression' @ [370:60] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'ArrayList' @ [373:27] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'argumentExpression' @ [374:41] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'expression' @ [375:16] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'expressions' @ [376:13] ==> val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'add' @ [376:25] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [376:29] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'expression' @ [377:13] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'deparenthesizeOrGetSelector' @ [377:26] ==> local final fun deparenthesizeOrGetSelector(expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[SimpleFunctionDescriptorImpl]

'expression' @ [377:54] ==> var expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'expressions' @ [381:9] ==> val expressions: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'asReversed' @ [381:21] ==> @JvmName public fun <T> MutableList<KtExpression>.asReversed(): MutableList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'forEach' @ [381:34] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'!' @ [382:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [382:19] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [382:62] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [382:99] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'shouldBeMadeNullable' @ [383:17] ==> var shouldBeMadeNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'hasNecessarySafeCall' @ [383:40] ==> private final fun hasNecessarySafeCall(expression: KtExpression, trace: BindingTrace): Boolean defined in org.jetbrains.kotlin.resolve.calls.CallCompleter[SimpleFunctionDescriptorImpl]

'expression' @ [383:61] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [383:73] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'updateRecordedType' @ [385:33] ==> @Nullable public open fun updateRecordedType(@Nullable type: KotlinType?, @NotNull expression: KtExpression, @NotNull trace: BindingTrace, shouldBeMadeNullable: Boolean): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContextUtils[JavaMethodDescriptor]

'updatedType' @ [385:52] ==> value-parameter updatedType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'expression' @ [385:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [385:77] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'shouldBeMadeNullable' @ [385:84] ==> var shouldBeMadeNullable: Boolean defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[LocalVariableDescriptor]

'trace' @ [387:16] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'getType' @ [387:22] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'argumentExpression' @ [387:30] ==> value-parameter argumentExpression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.updateRecordedTypeForArgument[ValueParameterDescriptorImpl]

'expression' @ [395:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'trace' @ [398:30] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'getType' @ [398:36] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'expression' @ [398:44] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.hasNecessarySafeCall[ValueParameterDescriptorImpl]

'receiverExpression' @ [398:55] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtSafeQualifiedExpression[PropertyDescriptorImpl]

'expressionType' @ [399:16] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.hasNecessarySafeCall[LocalVariableDescriptor]

'isNullableType' @ [399:52] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expressionType' @ [399:67] ==> val expressionType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CallCompleter.hasNecessarySafeCall[LocalVariableDescriptor]

