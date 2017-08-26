'AbstractTracingStrategy' @ [41:5] ==> protected/*protected and package*/ constructor AbstractTracingStrategy(@NotNull reference: KtExpression, @NotNull call: Call) defined in org.jetbrains.kotlin.resolve.calls.tasks.AbstractTracingStrategy[JavaClassConstructorDescriptor]

'delegationCall' @ [41:29] ==> value-parameter delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.<init>[ValueParameterDescriptorImpl]

'calleeExpression' @ [41:44] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'call' @ [41:64] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.<init>[ValueParameterDescriptorImpl]

'delegationCall' @ [43:28] ==> public final val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'calleeExpression' @ [43:43] ==> public final val KtConstructorDelegationCall.calleeExpression: KtConstructorDelegationReferenceExpression?[MyPropertyDescriptor]

'trace' @ [46:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindCall[ValueParameterDescriptorImpl]

'record' @ [46:15] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?), key: (KtElement..KtElement?), value: (Call..Call?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtElement
    <V : (Any..Any?)> -> Call

'CALL' @ [46:22] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'call' @ [46:28] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindCall[ValueParameterDescriptorImpl]

'calleeExpression' @ [46:33] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'call' @ [46:51] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [50:26] ==> value-parameter resolvedCall: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [50:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'trace' @ [51:31] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[ValueParameterDescriptorImpl]

'get' @ [51:37] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [51:41] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'calleeExpression' @ [51:59] ==> public final val calleeExpression: KtConstructorDelegationReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'storedReference' @ [52:13] ==> val storedReference: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[LocalVariableDescriptor]

'!' @ [52:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isError' @ [52:52] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [52:60] ==> val descriptor: D defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[LocalVariableDescriptor]

'trace' @ [53:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[ValueParameterDescriptorImpl]

'record' @ [53:19] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [53:26] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'calleeExpression' @ [53:44] ==> public final val calleeExpression: KtConstructorDelegationReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'descriptor' @ [53:62] ==> val descriptor: D defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindReference[LocalVariableDescriptor]

'trace' @ [58:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindResolvedCall[ValueParameterDescriptorImpl]

'record' @ [58:15] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?), key: (Call..Call?), value: (ResolvedCall<*>..ResolvedCall<*>?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> Call
    <V : (Any..Any?)> -> ResolvedCall<*>

'RESOLVED_CALL' @ [58:22] ==> public final val RESOLVED_CALL: (WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'call' @ [58:37] ==> protected/*protected and package*/ final val call: (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[JavaPropertyDescriptor]

'resolvedCall' @ [58:43] ==> value-parameter resolvedCall: ResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.bindResolvedCall[ValueParameterDescriptorImpl]

'trace' @ [62:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.unresolvedReference[ValueParameterDescriptorImpl]

'report' @ [62:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE' @ [62:22] ==> public final val UNRESOLVED_REFERENCE: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [62:43] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'calleeExpression' @ [62:46] ==> public final val calleeExpression: KtConstructorDelegationReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'calleeExpression' @ [62:66] ==> public final val calleeExpression: KtConstructorDelegationReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'trace' @ [66:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.unresolvedReferenceWrongReceiver[ValueParameterDescriptorImpl]

'report' @ [66:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNRESOLVED_REFERENCE_WRONG_RECEIVER' @ [66:22] ==> public final val UNRESOLVED_REFERENCE_WRONG_RECEIVER: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [66:58] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reference' @ [66:61] ==> protected/*protected and package*/ final val reference: (KtExpression..KtExpression?) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[JavaPropertyDescriptor]

'candidates' @ [66:72] ==> value-parameter candidates: Collection<ResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.unresolvedReferenceWrongReceiver[ValueParameterDescriptorImpl]

'reportError' @ [70:9] ==> private final fun reportError(trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'trace' @ [70:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.noValueForParameter[ValueParameterDescriptorImpl]

'reportError' @ [74:9] ==> private final fun reportError(trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'trace' @ [74:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.ambiguity[ValueParameterDescriptorImpl]

'reportError' @ [78:9] ==> private final fun reportError(trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'trace' @ [78:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.noneApplicable[ValueParameterDescriptorImpl]

'reportError' @ [82:9] ==> private final fun reportError(trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'trace' @ [82:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.invisibleMember[ValueParameterDescriptorImpl]

'!' @ [86:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'trace' @ [86:14] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.reportError[ValueParameterDescriptorImpl]

'bindingContext' @ [86:20] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'diagnostics' @ [86:35] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [86:47] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'delegationCall' @ [86:58] ==> public final val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'any' @ [87:13] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [87:19] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.reportError.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [87:22] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'EXPLICIT_DELEGATION_CALL_REQUIRED' @ [87:40] ==> public final val EXPLICIT_DELEGATION_CALL_REQUIRED: (DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>..DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'trace' @ [89:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.reportError[ValueParameterDescriptorImpl]

'report' @ [89:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPLICIT_DELEGATION_CALL_REQUIRED' @ [89:33] ==> public final val EXPLICIT_DELEGATION_CALL_REQUIRED: (DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>..DiagnosticFactory0<(KtConstructorDelegationCall..KtConstructorDelegationCall?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [89:67] ==> @NotNull public open fun on(@NotNull element: KtConstructorDelegationCall): SimpleDiagnostic<(KtConstructorDelegationCall..KtConstructorDelegationCall?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'delegationCall' @ [89:70] ==> public final val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[PropertyDescriptorImpl]

'unexpectedError' @ [96:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [100:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [104:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [110:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [114:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [118:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [122:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [126:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [130:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'unexpectedError' @ [134:9] ==> private final fun unexpectedError(type: String): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall[SimpleFunctionDescriptorImpl]

'AssertionError' @ [138:15] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'type' @ [138:55] ==> value-parameter type: String defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForImplicitConstructorDelegationCall.unexpectedError[ValueParameterDescriptorImpl]

