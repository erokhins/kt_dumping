'create' @ [55:47] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?), @Nullable resolutionSubjectForMessage: Any?): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'context' @ [55:54] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'trace' @ [55:62] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'name' @ [55:103] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'context' @ [56:32] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'replaceBindingTrace' @ [56:40] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaMethodDescriptor]

'fakeTrace' @ [56:60] ==> val fakeTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'makeAndResolveFakeCallInContext' @ [59:22] ==> @JvmOverloads public final fun makeAndResolveFakeCallInContext(receiver: ReceiverValue?, context: ResolutionContext<*>, valueArguments: List<KtExpression>, name: Name, callElement: KtExpression, onComplete: (KtSimpleNameExpression, Boolean) -> Unit = ...): Pair<Call, OverloadResolutionResults<FunctionDescriptor>> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver[SimpleFunctionDescriptorImpl]

'receiver' @ [59:54] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'fakeBindingTrace' @ [59:64] ==> val fakeBindingTrace: (ResolutionContext<*>..ResolutionContext<*>?) defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'valueArguments' @ [59:82] ==> value-parameter valueArguments: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'name' @ [59:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'callElement' @ [59:104] ==> value-parameter callElement: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'unreportedDiagnostic' @ [60:13] ==> var unreportedDiagnostic: Diagnostic? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'fakeTrace' @ [60:36] ==> val fakeTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'bindingContext' @ [60:46] ==> public final val TemporaryBindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'diagnostics' @ [60:61] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'noSuppression' @ [60:73] ==> public abstract fun noSuppression(): Diagnostics defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'forElement' @ [60:89] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'fake' @ [60:100] ==> value-parameter fake: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [60:106] ==> public inline fun <T> Iterable<Diagnostic>.firstOrNull(predicate: (Diagnostic) -> Boolean): Diagnostic? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [60:120] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'severity' @ [60:123] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'ERROR' @ [60:144] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'isSuccess' @ [62:17] ==> value-parameter isSuccess: Boolean defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall.<anonymous>[ValueParameterDescriptorImpl]

'fakeTrace' @ [63:17] ==> val fakeTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'commit' @ [63:27] ==> public final fun commit(@NotNull filter: (slice: WritableSlice<*, *>?, key: (Any..Any?)) -> Boolean, commitDiagnostics: Boolean): Unit defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[MyFunctionDescriptor]

'key' @ [67:29] ==> value-parameter key: (Any..Any?) defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fake' @ [67:36] ==> value-parameter fake: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [73:33] ==> val result: Pair<Call, OverloadResolutionResults<FunctionDescriptor>> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'second' @ [73:40] ==> public final val second: OverloadResolutionResults<FunctionDescriptor> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'!' @ [74:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolutionResults' @ [74:14] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'isSuccess' @ [74:32] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'unreportedDiagnostic' @ [74:45] ==> var unreportedDiagnostic: Diagnostic? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'unreportedDiagnostic' @ [75:32] ==> var unreportedDiagnostic: Diagnostic? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'factory' @ [75:54] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'UNSAFE_CALL' @ [75:72] ==> public final val UNSAFE_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'when (callKind) {
                FakeCallKind.ITERATOR ->
                    when {
                        resolutionResults.isAmbiguity -> Errors.ITERATOR_AMBIGUITY.on(reportErrorsOn, resolutionResults.resultingCalls)
                        isUnsafeCall                  -> Errors.ITERATOR_ON_NULLABLE.on(reportErrorsOn)
                        else                          -> Errors.ITERATOR_MISSING.on(reportErrorsOn)
                    }
                FakeCallKind.COMPONENT ->
                    when {
                        resolutionResults.isAmbiguity -> Errors.COMPONENT_FUNCTION_AMBIGUITY.on(
                                                            reportErrorsOn, name, resolutionResults.resultingCalls)
                        isUnsafeCall                  -> Errors.COMPONENT_FUNCTION_ON_NULLABLE.on(reportErrorsOn, name)
                        receiver != null              -> Errors.COMPONENT_FUNCTION_MISSING.on(reportErrorsOn, name, receiver.type)
                        else                          -> null
                    }
                FakeCallKind.OTHER -> null
            }' @ [76:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>?, entry1: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>?, entry2: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>?): ParametrizedDiagnostic<out (PsiElement..PsiElement?)>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParametrizedDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>?

'callKind' @ [76:36] ==> value-parameter callKind: FakeCallKind defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'ITERATOR' @ [77:30] ==> enum entry ITERATOR defined in org.jetbrains.kotlin.types.expressions.FakeCallKind[FakeCallableDescriptorForObject]

'when {
                        resolutionResults.isAmbiguity -> Errors.ITERATOR_AMBIGUITY.on(reportErrorsOn, resolutionResults.resultingCalls)
                        isUnsafeCall                  -> Errors.ITERATOR_ON_NULLABLE.on(reportErrorsOn)
                        else                          -> Errors.ITERATOR_MISSING.on(reportErrorsOn)
                    }' @ [78:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>, entry1: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>, entry2: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>): ParametrizedDiagnostic<out (PsiElement..PsiElement?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParametrizedDiagnostic<out (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'resolutionResults' @ [79:25] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'isAmbiguity' @ [79:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.isAmbiguity: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'ITERATOR_AMBIGUITY' @ [79:65] ==> public final val ITERATOR_AMBIGUITY: (DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [79:84] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>)): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportErrorsOn' @ [79:87] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'resolutionResults' @ [79:103] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'resultingCalls' @ [79:121] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.resultingCalls: (MutableCollection<out (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'isUnsafeCall' @ [80:25] ==> val isUnsafeCall: Boolean defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'ITERATOR_ON_NULLABLE' @ [80:65] ==> public final val ITERATOR_ON_NULLABLE: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [80:86] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportErrorsOn' @ [80:89] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'ITERATOR_MISSING' @ [81:65] ==> public final val ITERATOR_MISSING: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [81:82] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportErrorsOn' @ [81:85] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'COMPONENT' @ [83:30] ==> enum entry COMPONENT defined in org.jetbrains.kotlin.types.expressions.FakeCallKind[FakeCallableDescriptorForObject]

'when {
                        resolutionResults.isAmbiguity -> Errors.COMPONENT_FUNCTION_AMBIGUITY.on(
                                                            reportErrorsOn, name, resolutionResults.resultingCalls)
                        isUnsafeCall                  -> Errors.COMPONENT_FUNCTION_ON_NULLABLE.on(reportErrorsOn, name)
                        receiver != null              -> Errors.COMPONENT_FUNCTION_MISSING.on(reportErrorsOn, name, receiver.type)
                        else                          -> null
                    }' @ [84:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ParametrizedDiagnostic<(KtExpression..KtExpression?)>?, entry1: ParametrizedDiagnostic<(KtExpression..KtExpression?)>?, entry2: ParametrizedDiagnostic<(KtExpression..KtExpression?)>?, entry3: ParametrizedDiagnostic<(KtExpression..KtExpression?)>?): ParametrizedDiagnostic<(KtExpression..KtExpression?)>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ParametrizedDiagnostic<(org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)>?

'resolutionResults' @ [85:25] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'isAmbiguity' @ [85:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.isAmbiguity: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'COMPONENT_FUNCTION_AMBIGUITY' @ [85:65] ==> public final val COMPONENT_FUNCTION_AMBIGUITY: (DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [85:94] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: Name, @NotNull b: (MutableCollection<out (ResolvedCall<*>..ResolvedCall<*>?)>..Collection<(ResolvedCall<*>..ResolvedCall<*>?)>)): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportErrorsOn' @ [86:61] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'name' @ [86:77] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'resolutionResults' @ [86:83] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'resultingCalls' @ [86:101] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<FunctionDescriptor>.resultingCalls: (MutableCollection<out (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..Collection<(ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'isUnsafeCall' @ [87:25] ==> val isUnsafeCall: Boolean defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'COMPONENT_FUNCTION_ON_NULLABLE' @ [87:65] ==> public final val COMPONENT_FUNCTION_ON_NULLABLE: (DiagnosticFactory1<(KtExpression..KtExpression?), (Name..Name?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (Name..Name?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [87:96] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: Name): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportErrorsOn' @ [87:99] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'name' @ [87:115] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'receiver' @ [88:25] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'COMPONENT_FUNCTION_MISSING' @ [88:65] ==> public final val COMPONENT_FUNCTION_MISSING: (DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (Name..Name?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [88:92] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: Name, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportErrorsOn' @ [88:95] ==> value-parameter reportErrorsOn: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'name' @ [88:111] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'receiver' @ [88:117] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'type' @ [88:126] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'OTHER' @ [91:30] ==> enum entry OTHER defined in org.jetbrains.kotlin.types.expressions.FakeCallKind[FakeCallableDescriptorForObject]

'diagnostic' @ [94:17] ==> val diagnostic: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'context' @ [95:17] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[ValueParameterDescriptorImpl]

'trace' @ [95:25] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [95:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [95:38] ==> val diagnostic: ParametrizedDiagnostic<out (PsiElement..PsiElement?)>? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'resolutionResults' @ [99:16] ==> val resolutionResults: OverloadResolutionResults<FunctionDescriptor> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.resolveFakeCall[LocalVariableDescriptor]

'JvmOverloads' @ [102:5] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'KtPsiFactory' @ [111:36] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[ClassConstructorDescriptorImpl]

'project' @ [111:49] ==> private final val project: Project defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver[PropertyDescriptorImpl]

'createSimpleName' @ [111:81] ==> public final fun createSimpleName(name: String): KtSimpleNameExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[SimpleFunctionDescriptorImpl]

'name' @ [111:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'asString' @ [111:103] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'makeCallWithExpressions' @ [112:30] ==> @NotNull public open fun makeCallWithExpressions(@NotNull callElement: KtElement, @Nullable explicitReceiver: Receiver?, @Nullable callOperationNode: ASTNode?, @NotNull calleeExpression: KtExpression, @NotNull argumentExpressions: (MutableList<(KtExpression..KtExpression?)>..List<(KtExpression..KtExpression?)>)): Call defined in org.jetbrains.kotlin.resolve.calls.util.CallMaker[JavaMethodDescriptor]

'callElement' @ [113:17] ==> value-parameter callElement: KtExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'receiver' @ [113:30] ==> value-parameter receiver: ReceiverValue? defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'fakeCalleeExpression' @ [113:72] ==> val fakeCalleeExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'valueArguments' @ [113:94] ==> value-parameter valueArguments: List<KtExpression> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'callResolver' @ [115:23] ==> private final val callResolver: CallResolver defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver[PropertyDescriptorImpl]

'resolveCallWithGivenName' @ [115:36] ==> @NotNull public open fun resolveCallWithGivenName(@NotNull context: ResolutionContext<*>, @NotNull call: Call, @NotNull functionReference: KtReferenceExpression, @NotNull name: Name): OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CallResolver[JavaMethodDescriptor]

'context' @ [115:61] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'call' @ [115:70] ==> val call: Call defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'fakeCalleeExpression' @ [115:76] ==> val fakeCalleeExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'name' @ [115:98] ==> value-parameter name: Name defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[ValueParameterDescriptorImpl]

'invoke' @ [117:9] ==> public abstract operator fun invoke(p1: KtSimpleNameExpression, p2: Boolean): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'fakeCalleeExpression' @ [117:20] ==> val fakeCalleeExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'results' @ [117:42] ==> val results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'isSuccess' @ [117:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>.isSuccess: Boolean[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'Pair' @ [119:16] ==> public constructor Pair<out A, out B>(first: Call, second: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Call
    <out B> -> OverloadResolutionResults<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>

'call' @ [119:21] ==> val call: Call defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

'results' @ [119:27] ==> val results: OverloadResolutionResults<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.types.expressions.FakeCallResolver.makeAndResolveFakeCallInContext[LocalVariableDescriptor]

