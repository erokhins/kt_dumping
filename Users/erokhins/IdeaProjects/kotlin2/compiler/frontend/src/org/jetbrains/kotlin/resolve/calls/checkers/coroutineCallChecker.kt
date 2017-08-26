'setOf' @ [44:39] ==> public fun <T> setOf(vararg elements: LexicalScopeKind): Set<LexicalScopeKind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScopeKind

'FUNCTION_INNER_SCOPE' @ [44:62] ==> enum entry FUNCTION_INNER_SCOPE defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'FUNCTION_HEADER_FOR_DESTRUCTURING' @ [44:101] ==> enum entry FUNCTION_HEADER_FOR_DESTRUCTURING defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'resolvedCall' @ [47:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [47:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'!' @ [48:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [48:14] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'isSuspend' @ [48:25] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'context' @ [51:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'scope' @ [51:25] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'parentsWithSelf' @ [52:26] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'firstOrNull' @ [52:42] ==> public inline fun <T> Sequence<HierarchicalScope>.firstOrNull(predicate: (HierarchicalScope) -> Boolean): HierarchicalScope? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'it' @ [53:33] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [53:55] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [53:58] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'ALLOWED_SCOPE_KINDS' @ [53:66] ==> private final val ALLOWED_SCOPE_KINDS: Set<LexicalScopeKind> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker[PropertyDescriptorImpl]

'it' @ [54:37] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [54:40] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'safeAs' @ [54:56] ==> public inline fun <reified T : Any> Any?.safeAs(): FunctionDescriptor? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FunctionDescriptor

'isSuspend' @ [54:86] ==> public final val FunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

'cast' @ [55:28] ==> public inline fun <reified T : Any> Any?.cast(): LexicalScope defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> LexicalScope

'ownerDescriptor' @ [55:50] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'cast' @ [55:67] ==> public inline fun <reified T : Any> Any?.cast(): FunctionDescriptor defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> FunctionDescriptor

'when {
            enclosingSuspendFunction != null -> {
                val callElement = resolvedCall.call.callElement as KtExpression

                if (!InlineUtil.checkNonLocalReturnUsage(enclosingSuspendFunction, callElement, context.resolutionContext)) {
                    context.trace.report(Errors.NON_LOCAL_SUSPENSION_POINT.on(reportOn))
                }
                else if (context.scope.parentsWithSelf.any { it.isScopeForDefaultParameterValuesOf(enclosingSuspendFunction) }) {
                    context.trace.report(Errors.UNSUPPORTED.on(reportOn, "suspend function calls in a context of default parameter value"))
                }

                context.trace.record(BindingContext.ENCLOSING_SUSPEND_FUNCTION_FOR_SUSPEND_FUNCTION_CALL, resolvedCall.call, enclosingSuspendFunction)

                checkRestrictsSuspension(enclosingSuspendFunction, resolvedCall, reportOn, context)
            }
            else -> {
                context.trace.report(Errors.ILLEGAL_SUSPEND_FUNCTION_CALL.on(reportOn, resolvedCall.candidateDescriptor))
            }
        }' @ [57:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'enclosingSuspendFunction' @ [58:13] ==> val enclosingSuspendFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'resolvedCall' @ [59:35] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'call' @ [59:48] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'callElement' @ [59:53] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'if (!InlineUtil.checkNonLocalReturnUsage(enclosingSuspendFunction, callElement, context.resolutionContext)) {
                    context.trace.report(Errors.NON_LOCAL_SUSPENSION_POINT.on(reportOn))
                }
                else if (context.scope.parentsWithSelf.any { it.isScopeForDefaultParameterValuesOf(enclosingSuspendFunction) }) {
                    context.trace.report(Errors.UNSUPPORTED.on(reportOn, "suspend function calls in a context of default parameter value"))
                }' @ [61:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [61:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkNonLocalReturnUsage' @ [61:33] ==> public open fun checkNonLocalReturnUsage(@NotNull fromFunction: DeclarationDescriptor, @NotNull startExpression: KtExpression, @NotNull context: ResolutionContext<*>): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'enclosingSuspendFunction' @ [61:58] ==> val enclosingSuspendFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'callElement' @ [61:84] ==> val callElement: KtExpression defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'context' @ [61:97] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'resolutionContext' @ [61:105] ==> public final val resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'context' @ [62:21] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [62:29] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [62:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NON_LOCAL_SUSPENSION_POINT' @ [62:49] ==> public final val NON_LOCAL_SUSPENSION_POINT: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [62:76] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [62:79] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [64:26] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'scope' @ [64:34] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'parentsWithSelf' @ [64:40] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'any' @ [64:56] ==> public inline fun <T> Sequence<HierarchicalScope>.any(predicate: (HierarchicalScope) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'it' @ [64:62] ==> value-parameter it: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'isScopeForDefaultParameterValuesOf' @ [64:65] ==> private fun HierarchicalScope.isScopeForDefaultParameterValuesOf(enclosingSuspendFunction: FunctionDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[SimpleFunctionDescriptorImpl]

'enclosingSuspendFunction' @ [64:100] ==> val enclosingSuspendFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'context' @ [65:21] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [65:29] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [65:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNSUPPORTED' @ [65:49] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [65:61] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [65:64] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [68:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [68:25] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'record' @ [68:31] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>?), key: (Call..Call?), value: (FunctionDescriptor..FunctionDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)

'ENCLOSING_SUSPEND_FUNCTION_FOR_SUSPEND_FUNCTION_CALL' @ [68:53] ==> public final val ENCLOSING_SUSPEND_FUNCTION_FOR_SUSPEND_FUNCTION_CALL: (WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>..WritableSlice<(Call..Call?), (FunctionDescriptor..FunctionDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'resolvedCall' @ [68:107] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'call' @ [68:120] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'enclosingSuspendFunction' @ [68:126] ==> val enclosingSuspendFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'checkRestrictsSuspension' @ [70:17] ==> private fun checkRestrictsSuspension(enclosingCallableDescriptor: CallableDescriptor, resolvedCall: ResolvedCall<*>, reportOn: PsiElement, context: CallCheckerContext): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[SimpleFunctionDescriptorImpl]

'enclosingSuspendFunction' @ [70:42] ==> val enclosingSuspendFunction: FunctionDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[LocalVariableDescriptor]

'resolvedCall' @ [70:68] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'reportOn' @ [70:82] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [70:92] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'context' @ [73:17] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [73:25] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [73:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ILLEGAL_SUSPEND_FUNCTION_CALL' @ [73:45] ==> public final val ILLEGAL_SUSPEND_FUNCTION_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [73:75] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: CallableDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [73:78] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [73:88] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CoroutineSuspendCallChecker.check[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [73:101] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'this' @ [80:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.isScopeForDefaultParameterValuesOf[ReceiverParameterDescriptorImpl]

'this' @ [80:33] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.isScopeForDefaultParameterValuesOf[ReceiverParameterDescriptorImpl]

'kind' @ [80:38] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'DEFAULT_VALUE' @ [80:63] ==> enum entry DEFAULT_VALUE defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'this' @ [80:80] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.isScopeForDefaultParameterValuesOf[ReceiverParameterDescriptorImpl]

'ownerDescriptor' @ [80:85] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'enclosingSuspendFunction' @ [80:104] ==> value-parameter enclosingSuspendFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.isScopeForDefaultParameterValuesOf[ValueParameterDescriptorImpl]

'resolvedCall' @ [84:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [84:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'descriptor' @ [85:13] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check[LocalVariableDescriptor]

'valueParameters' @ [85:24] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'any' @ [85:40] ==> public inline fun <T> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.any(predicate: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'it' @ [85:46] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'hasSuspendFunctionType' @ [85:49] ==> public val ValueParameterDescriptor.hasSuspendFunctionType: Boolean defined in org.jetbrains.kotlin.coroutines in file coroutineUtil.kt[PropertyDescriptorImpl]

'checkCoroutinesFeature' @ [86:13] ==> public fun checkCoroutinesFeature(languageVersionSettings: LanguageVersionSettings, diagnosticHolder: DiagnosticSink, reportOn: PsiElement): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers in file coroutineCallChecker.kt[SimpleFunctionDescriptorImpl]

'context' @ [86:36] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [86:44] ==> public final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'context' @ [86:69] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [86:77] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'reportOn' @ [86:84] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.BuilderFunctionsCallChecker.check[ValueParameterDescriptorImpl]

'LanguageFeature' @ [92:26] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'Coroutines' @ [92:42] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'languageVersionSettings' @ [92:56] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'when (languageVersionSettings.getFeatureSupport(LanguageFeature.Coroutines)) {
        LanguageFeature.State.ENABLED -> {
        }
        LanguageFeature.State.ENABLED_WITH_WARNING -> {
            diagnosticHolder.report(Errors.EXPERIMENTAL_FEATURE_WARNING.on(reportOn, diagnosticData))
        }
        LanguageFeature.State.ENABLED_WITH_ERROR -> {
            diagnosticHolder.report(Errors.EXPERIMENTAL_FEATURE_ERROR.on(reportOn, diagnosticData))
        }
        LanguageFeature.State.DISABLED -> {
            diagnosticHolder.report(Errors.UNSUPPORTED_FEATURE.on(reportOn, diagnosticData))
        }
    }' @ [93:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'languageVersionSettings' @ [93:11] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'getFeatureSupport' @ [93:35] ==> public abstract fun getFeatureSupport(feature: LanguageFeature): LanguageFeature.State defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'Coroutines' @ [93:69] ==> enum entry Coroutines defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'LanguageFeature' @ [94:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED' @ [94:31] ==> enum entry ENABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'LanguageFeature' @ [96:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_WARNING' @ [96:31] ==> enum entry ENABLED_WITH_WARNING defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [97:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'report' @ [97:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPERIMENTAL_FEATURE_WARNING' @ [97:44] ==> public final val EXPERIMENTAL_FEATURE_WARNING: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [97:73] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [97:76] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'diagnosticData' @ [97:86] ==> val diagnosticData: Pair<LanguageFeature, LanguageVersionSettings> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[LocalVariableDescriptor]

'LanguageFeature' @ [99:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'ENABLED_WITH_ERROR' @ [99:31] ==> enum entry ENABLED_WITH_ERROR defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [100:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'report' @ [100:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'EXPERIMENTAL_FEATURE_ERROR' @ [100:44] ==> public final val EXPERIMENTAL_FEATURE_ERROR: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [100:71] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [100:74] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'diagnosticData' @ [100:84] ==> val diagnosticData: Pair<LanguageFeature, LanguageVersionSettings> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[LocalVariableDescriptor]

'LanguageFeature' @ [102:9] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'DISABLED' @ [102:31] ==> enum entry DISABLED defined in org.jetbrains.kotlin.config.LanguageFeature.State[FakeCallableDescriptorForObject]

'diagnosticHolder' @ [103:13] ==> value-parameter diagnosticHolder: DiagnosticSink defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'report' @ [103:30] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'UNSUPPORTED_FEATURE' @ [103:44] ==> public final val UNSUPPORTED_FEATURE: (DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>..Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [103:64] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Pair<(LanguageFeature..LanguageFeature?), (LanguageVersionSettings..LanguageVersionSettings?)>): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [103:67] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[ValueParameterDescriptorImpl]

'diagnosticData' @ [103:77] ==> val diagnosticData: Pair<LanguageFeature, LanguageVersionSettings> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkCoroutinesFeature[LocalVariableDescriptor]

'enclosingCallableDescriptor' @ [114:41] ==> value-parameter enclosingCallableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [114:69] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'value' @ [114:97] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [116:58] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'supertypes' @ [116:63] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [116:78] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'any' @ [116:84] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [117:9] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.isRestrictsSuspensionReceiver.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [117:12] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [117:24] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'hasRestrictsSuspensionAnnotation' @ [117:47] ==> public fun ClassifierDescriptor.hasRestrictsSuspensionAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'other' @ [121:13] ==> value-parameter other: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[ValueParameterDescriptorImpl]

'this' @ [122:13] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[ReceiverParameterDescriptorImpl]

'other' @ [122:22] ==> value-parameter other: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[ValueParameterDescriptorImpl]

'other' @ [124:37] ==> value-parameter other: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[ValueParameterDescriptorImpl]

'expression' @ [124:68] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'instanceReference' @ [124:102] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'referenceExpression' @ [125:31] ==> val referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[LocalVariableDescriptor]

'let' @ [125:52] ==> @InlineOnly public inline fun <T, R> KtReferenceExpression.let(block: (KtReferenceExpression) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtReferenceExpression
    <R> -> DeclarationDescriptor?

'context' @ [126:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'trace' @ [126:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'get' @ [126:27] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [126:46] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'referenceExpression' @ [126:64] ==> val referenceExpression: KtReferenceExpression? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[LocalVariableDescriptor]

'this' @ [129:16] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[ReceiverParameterDescriptorImpl]

'referenceTarget' @ [129:26] ==> val referenceTarget: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension.sameInstance[LocalVariableDescriptor]

'extensionReceiverParameter' @ [129:67] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'value' @ [129:95] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'!' @ [132:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'enclosingSuspendReceiverValue' @ [132:10] ==> val enclosingSuspendReceiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[LocalVariableDescriptor]

'isRestrictsSuspensionReceiver' @ [132:40] ==> local final fun ReceiverValue.isRestrictsSuspensionReceiver(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[SimpleFunctionDescriptorImpl]

'enclosingSuspendReceiverValue' @ [135:9] ==> val enclosingSuspendReceiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[LocalVariableDescriptor]

'resolvedCall' @ [135:52] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [135:65] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'enclosingSuspendReceiverValue' @ [137:9] ==> val enclosingSuspendReceiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[LocalVariableDescriptor]

'resolvedCall' @ [137:52] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'extensionReceiver' @ [137:65] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [138:9] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [138:22] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'extensionReceiverParameter' @ [138:42] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'value' @ [138:71] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'isRestrictsSuspensionReceiver' @ [138:77] ==> local final fun ReceiverValue.isRestrictsSuspensionReceiver(): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[SimpleFunctionDescriptorImpl]

'context' @ [140:5] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

'trace' @ [140:13] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [140:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'ILLEGAL_RESTRICTED_SUSPENDING_FUNCTION_CALL' @ [140:33] ==> public final val ILLEGAL_RESTRICTED_SUSPENDING_FUNCTION_CALL: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [140:77] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [140:80] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.checkRestrictsSuspension[ValueParameterDescriptorImpl]

