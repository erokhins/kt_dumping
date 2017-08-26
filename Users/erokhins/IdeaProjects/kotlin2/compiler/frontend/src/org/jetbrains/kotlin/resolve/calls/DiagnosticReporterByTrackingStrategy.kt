'context' @ [44:25] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'trace' @ [44:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'psiKotlinCall' @ [45:58] ==> public final val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'tracingStrategy' @ [45:72] ==> public abstract val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'psiKotlinCall' @ [46:36] ==> public final val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'psiCall' @ [46:50] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'when (diagnostic.javaClass) {
            VisibilityError::class.java -> tracingStrategy.invisibleMember(trace, (diagnostic as VisibilityError).invisibleMember)
            NoValueForParameter::class.java -> tracingStrategy.noValueForParameter(trace, (diagnostic as NoValueForParameter).parameterDescriptor)
            InstantiationOfAbstractClass::class.java -> tracingStrategy.instantiationOfAbstractClass(trace)
            AbstractSuperCall::class.java -> tracingStrategy.abstractSuperCall(trace)
        }' @ [53:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [53:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCall[ValueParameterDescriptorImpl]

'javaClass' @ [53:26] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'VisibilityError' @ [54:13] ==> public constructor VisibilityError(invisibleMember: DeclarationDescriptorWithVisibility) defined in org.jetbrains.kotlin.resolve.calls.tower.VisibilityError[DeserializedClassConstructorDescriptor]

'java' @ [54:36] ==> public val <T> KClass<VisibilityError>.java: Class<VisibilityError> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VisibilityError

'tracingStrategy' @ [54:44] ==> private final val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'invisibleMember' @ [54:60] ==> public abstract fun invisibleMember(@NotNull trace: BindingTrace, @NotNull descriptor: DeclarationDescriptorWithVisibility): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [54:76] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'diagnostic' @ [54:84] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCall[ValueParameterDescriptorImpl]

'invisibleMember' @ [54:115] ==> public final val invisibleMember: DeclarationDescriptorWithVisibility defined in org.jetbrains.kotlin.resolve.calls.tower.VisibilityError[DeserializedPropertyDescriptor]

'NoValueForParameter' @ [55:13] ==> public constructor NoValueForParameter(parameterDescriptor: ValueParameterDescriptor, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NoValueForParameter[DeserializedClassConstructorDescriptor]

'java' @ [55:40] ==> public val <T> KClass<NoValueForParameter>.java: Class<NoValueForParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NoValueForParameter

'tracingStrategy' @ [55:48] ==> private final val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'noValueForParameter' @ [55:64] ==> public abstract fun noValueForParameter(@NotNull trace: BindingTrace, @NotNull valueParameter: ValueParameterDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [55:84] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'diagnostic' @ [55:92] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCall[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [55:127] ==> public final val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.NoValueForParameter[DeserializedPropertyDescriptor]

'InstantiationOfAbstractClass' @ [56:13] ==> public object InstantiationOfAbstractClass : KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.model[FakeCallableDescriptorForObject]

'java' @ [56:49] ==> public val <T> KClass<InstantiationOfAbstractClass>.java: Class<InstantiationOfAbstractClass> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> InstantiationOfAbstractClass

'tracingStrategy' @ [56:57] ==> private final val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'instantiationOfAbstractClass' @ [56:73] ==> public abstract fun instantiationOfAbstractClass(@NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [56:102] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'AbstractSuperCall' @ [57:13] ==> public object AbstractSuperCall : KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.model[FakeCallableDescriptorForObject]

'java' @ [57:38] ==> public val <T> KClass<AbstractSuperCall>.java: Class<AbstractSuperCall> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractSuperCall

'tracingStrategy' @ [57:46] ==> private final val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'abstractSuperCall' @ [57:62] ==> public abstract fun abstractSuperCall(@NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [57:80] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'psiKotlinCall' @ [62:30] ==> public final val psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'psiCall' @ [62:44] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'callElement' @ [62:52] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'if (psiCallElement is KtCallExpression)
                    psiCallElement.typeArgumentList ?: psiCallElement.calleeExpression ?: psiCallElement
                else
                    psiCallElement' @ [64:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'psiCallElement' @ [64:21] ==> val psiCallElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'psiCallElement' @ [65:21] ==> val psiCallElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'typeArgumentList' @ [65:36] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'psiCallElement' @ [65:56] ==> val psiCallElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'calleeExpression' @ [65:71] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'psiCallElement' @ [65:91] ==> val psiCallElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'psiCallElement' @ [67:21] ==> val psiCallElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'when (diagnostic) {
            is WrongCountOfTypeArguments -> {
                val expectedTypeArgumentsCount = diagnostic.descriptor.typeParameters.size
                trace.report(WRONG_NUMBER_OF_TYPE_ARGUMENTS.on(reportElement, expectedTypeArgumentsCount, diagnostic.descriptor))
            }
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [69:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[ValueParameterDescriptorImpl]

'diagnostic' @ [71:50] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[ValueParameterDescriptorImpl]

'descriptor' @ [71:61] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.WrongCountOfTypeArguments[DeserializedPropertyDescriptor]

'typeParameters' @ [71:72] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [71:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'trace' @ [72:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [72:23] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'WRONG_NUMBER_OF_TYPE_ARGUMENTS' @ [72:30] ==> public final val WRONG_NUMBER_OF_TYPE_ARGUMENTS: (DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (Int..Int?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [72:61] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: Int, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportElement' @ [72:64] ==> val reportElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'expectedTypeArgumentsCount' @ [72:79] ==> val expectedTypeArgumentsCount: Int defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[LocalVariableDescriptor]

'diagnostic' @ [72:107] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onTypeArguments[ValueParameterDescriptorImpl]

'descriptor' @ [72:118] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.WrongCountOfTypeArguments[DeserializedPropertyDescriptor]

'when (diagnostic.javaClass) {
            UnsafeCallError::class.java -> {
                val implicitInvokeCheck = (callReceiver as? ReceiverExpressionKotlinCallArgument)?.isVariableReceiverForInvoke ?: false
                tracingStrategy.unsafeCall(trace, callReceiver.receiver.receiverValue.type, implicitInvokeCheck)
            }
        }' @ [86:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [86:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallReceiver[ValueParameterDescriptorImpl]

'javaClass' @ [86:26] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'UnsafeCallError' @ [87:13] ==> public constructor UnsafeCallError(receiver: SimpleKotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.UnsafeCallError[DeserializedClassConstructorDescriptor]

'java' @ [87:36] ==> public val <T> KClass<UnsafeCallError>.java: Class<UnsafeCallError> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnsafeCallError

'?:' @ [88:43] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'callReceiver' @ [88:44] ==> value-parameter callReceiver: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallReceiver[ValueParameterDescriptorImpl]

'isVariableReceiverForInvoke' @ [88:100] ==> public final val isVariableReceiverForInvoke: Boolean defined in org.jetbrains.kotlin.resolve.calls.model.ReceiverExpressionKotlinCallArgument[DeserializedPropertyDescriptor]

'tracingStrategy' @ [89:17] ==> private final val tracingStrategy: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'unsafeCall' @ [89:33] ==> public abstract fun unsafeCall(@NotNull trace: BindingTrace, @NotNull type: KotlinType, isCallForImplicitInvoke: Boolean): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [89:44] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'callReceiver' @ [89:51] ==> value-parameter callReceiver: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallReceiver[ValueParameterDescriptorImpl]

'receiver' @ [89:64] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [89:73] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'type' @ [89:87] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'implicitInvokeCheck' @ [89:93] ==> val implicitInvokeCheck: Boolean defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallReceiver[LocalVariableDescriptor]

'when (diagnostic.javaClass) {
            SmartCastDiagnostic::class.java -> reportSmartCast(diagnostic as SmartCastDiagnostic)
            UnstableSmartCast::class.java -> reportUnstableSmartCast(diagnostic as UnstableSmartCast)
            TooManyArguments::class.java -> {
                val psiExpression = callArgument.psiExpression
                if (psiExpression != null) {
                    trace.report(TOO_MANY_ARGUMENTS.on(psiExpression, (diagnostic as TooManyArguments).descriptor))
                }

                trace.markAsReported()
            }
            VarargArgumentOutsideParentheses::class.java ->
                trace.report(VARARG_OUTSIDE_PARENTHESES.on(callArgument.psiExpression!!))
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [95:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'javaClass' @ [95:26] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'SmartCastDiagnostic' @ [96:13] ==> public constructor SmartCastDiagnostic(argument: ExpressionKotlinCallArgument, smartCastType: UnwrappedType, kotlinCall: KotlinCall?) defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedClassConstructorDescriptor]

'java' @ [96:40] ==> public val <T> KClass<SmartCastDiagnostic>.java: Class<SmartCastDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SmartCastDiagnostic

'reportSmartCast' @ [96:48] ==> private final fun reportSmartCast(smartCastDiagnostic: SmartCastDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[SimpleFunctionDescriptorImpl]

'diagnostic' @ [96:64] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'UnstableSmartCast' @ [97:13] ==> public constructor UnstableSmartCast(argument: ExpressionKotlinCallArgument, targetType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[DeserializedClassConstructorDescriptor]

'java' @ [97:38] ==> public val <T> KClass<UnstableSmartCast>.java: Class<UnstableSmartCast> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UnstableSmartCast

'reportUnstableSmartCast' @ [97:46] ==> private final fun reportUnstableSmartCast(unstableSmartCast: UnstableSmartCast): Unit defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[SimpleFunctionDescriptorImpl]

'diagnostic' @ [97:70] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'TooManyArguments' @ [98:13] ==> public constructor TooManyArguments(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.TooManyArguments[DeserializedClassConstructorDescriptor]

'java' @ [98:37] ==> public val <T> KClass<TooManyArguments>.java: Class<TooManyArguments> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TooManyArguments

'callArgument' @ [99:37] ==> value-parameter callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'psiExpression' @ [99:50] ==> public val KotlinCallArgument.psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'psiExpression' @ [100:21] ==> val psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[LocalVariableDescriptor]

'trace' @ [101:21] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [101:27] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'TOO_MANY_ARGUMENTS' @ [101:34] ==> public final val TOO_MANY_ARGUMENTS: (DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [101:53] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: CallableDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'psiExpression' @ [101:56] ==> val psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[LocalVariableDescriptor]

'diagnostic' @ [101:72] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'descriptor' @ [101:104] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.TooManyArguments[DeserializedPropertyDescriptor]

'trace' @ [104:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'markAsReported' @ [104:23] ==> public final fun markAsReported(): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'VarargArgumentOutsideParentheses' @ [106:13] ==> public constructor VarargArgumentOutsideParentheses(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.VarargArgumentOutsideParentheses[DeserializedClassConstructorDescriptor]

'java' @ [106:53] ==> public val <T> KClass<VarargArgumentOutsideParentheses>.java: Class<VarargArgumentOutsideParentheses> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> VarargArgumentOutsideParentheses

'trace' @ [107:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [107:23] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'VARARG_OUTSIDE_PARENTHESES' @ [107:30] ==> public final val VARARG_OUTSIDE_PARENTHESES: (DiagnosticFactory0<(KtExpression..KtExpression?)>..DiagnosticFactory0<(KtExpression..KtExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [107:57] ==> @NotNull public open fun on(@NotNull element: KtExpression): SimpleDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'callArgument' @ [107:60] ==> value-parameter callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgument[ValueParameterDescriptorImpl]

'psiExpression' @ [107:73] ==> public val KotlinCallArgument.psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'callArgument' @ [112:29] ==> value-parameter callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[ValueParameterDescriptorImpl]

'psiCallArgument' @ [112:42] ==> public val KotlinCallArgument.psiCallArgument: PSIKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'valueArgument' @ [112:58] ==> public abstract val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCallArgument[PropertyDescriptorImpl]

'getArgumentName' @ [112:72] ==> public abstract fun getArgumentName(): ValueArgumentName? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'referenceExpression' @ [112:91] ==> public abstract val referenceExpression: KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.ValueArgumentName[PropertyDescriptorImpl]

'error' @ [113:28] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'callArgument' @ [113:83] ==> value-parameter callArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[ValueParameterDescriptorImpl]

'when (diagnostic.javaClass) {
            NamedArgumentReference::class.java -> {
                trace.record(BindingContext.REFERENCE_TARGET, nameReference, (diagnostic as NamedArgumentReference).parameterDescriptor)
                trace.markAsReported()
            }
            NameForAmbiguousParameter::class.java -> trace.report(NAME_FOR_AMBIGUOUS_PARAMETER.on(nameReference))
            NameNotFound::class.java -> trace.report(NAMED_PARAMETER_NOT_FOUND.on(nameReference, nameReference))

            NamedArgumentNotAllowed::class.java -> trace.report(NAMED_ARGUMENTS_NOT_ALLOWED.on(
                    nameReference,
                    if ((diagnostic as NamedArgumentNotAllowed).descriptor is FunctionInvokeDescriptor) INVOKE_ON_FUNCTION_TYPE else NON_KOTLIN_FUNCTION
            ))
            ArgumentPassedTwice::class.java -> trace.report(ARGUMENT_PASSED_TWICE.on(nameReference))
        }' @ [114:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [114:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[ValueParameterDescriptorImpl]

'javaClass' @ [114:26] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'NamedArgumentReference' @ [115:13] ==> public constructor NamedArgumentReference(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentReference[DeserializedClassConstructorDescriptor]

'java' @ [115:43] ==> public val <T> KClass<NamedArgumentReference>.java: Class<NamedArgumentReference> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NamedArgumentReference

'trace' @ [116:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'record' @ [116:23] ==> public open fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtReferenceExpression..org.jetbrains.kotlin.psi.KtReferenceExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'REFERENCE_TARGET' @ [116:45] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'nameReference' @ [116:63] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'diagnostic' @ [116:79] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [116:117] ==> public final val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentReference[DeserializedPropertyDescriptor]

'trace' @ [117:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'markAsReported' @ [117:23] ==> public final fun markAsReported(): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'NameForAmbiguousParameter' @ [119:13] ==> public constructor NameForAmbiguousParameter(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor, overriddenParameterWithOtherName: ValueParameterDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NameForAmbiguousParameter[DeserializedClassConstructorDescriptor]

'java' @ [119:46] ==> public val <T> KClass<NameForAmbiguousParameter>.java: Class<NameForAmbiguousParameter> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NameForAmbiguousParameter

'trace' @ [119:54] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [119:60] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'NAME_FOR_AMBIGUOUS_PARAMETER' @ [119:67] ==> public final val NAME_FOR_AMBIGUOUS_PARAMETER: (DiagnosticFactory0<(KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory0<(KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [119:96] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression): SimpleDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'nameReference' @ [119:99] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'NameNotFound' @ [120:13] ==> public constructor NameNotFound(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NameNotFound[DeserializedClassConstructorDescriptor]

'java' @ [120:33] ==> public val <T> KClass<NameNotFound>.java: Class<NameNotFound> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NameNotFound

'trace' @ [120:41] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [120:47] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'NAMED_PARAMETER_NOT_FOUND' @ [120:54] ==> public final val NAMED_PARAMETER_NOT_FOUND: (DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory1<(KtReferenceExpression..KtReferenceExpression?), (KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [120:80] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull argument: KtReferenceExpression): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'nameReference' @ [120:83] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'nameReference' @ [120:98] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'NamedArgumentNotAllowed' @ [122:13] ==> public constructor NamedArgumentNotAllowed(argument: KotlinCallArgument, descriptor: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentNotAllowed[DeserializedClassConstructorDescriptor]

'java' @ [122:44] ==> public val <T> KClass<NamedArgumentNotAllowed>.java: Class<NamedArgumentNotAllowed> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NamedArgumentNotAllowed

'trace' @ [122:52] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [122:58] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'NAMED_ARGUMENTS_NOT_ALLOWED' @ [122:65] ==> public final val NAMED_ARGUMENTS_NOT_ALLOWED: (DiagnosticFactory1<(PsiElement..PsiElement?), (Errors.BadNamedArgumentsTarget..Errors.BadNamedArgumentsTarget?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (Errors.BadNamedArgumentsTarget..Errors.BadNamedArgumentsTarget?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [122:93] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: Errors.BadNamedArgumentsTarget): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'nameReference' @ [123:21] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'if ((diagnostic as NamedArgumentNotAllowed).descriptor is FunctionInvokeDescriptor) INVOKE_ON_FUNCTION_TYPE else NON_KOTLIN_FUNCTION' @ [124:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Errors.BadNamedArgumentsTarget, elseBranch: Errors.BadNamedArgumentsTarget): Errors.BadNamedArgumentsTarget[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BadNamedArgumentsTarget

'diagnostic' @ [124:26] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[ValueParameterDescriptorImpl]

'descriptor' @ [124:65] ==> public final val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.NamedArgumentNotAllowed[DeserializedPropertyDescriptor]

'INVOKE_ON_FUNCTION_TYPE' @ [124:105] ==> enum entry INVOKE_ON_FUNCTION_TYPE defined in org.jetbrains.kotlin.diagnostics.Errors.BadNamedArgumentsTarget[FakeCallableDescriptorForObject]

'NON_KOTLIN_FUNCTION' @ [124:134] ==> enum entry NON_KOTLIN_FUNCTION defined in org.jetbrains.kotlin.diagnostics.Errors.BadNamedArgumentsTarget[FakeCallableDescriptorForObject]

'ArgumentPassedTwice' @ [126:13] ==> public constructor ArgumentPassedTwice(argument: KotlinCallArgument, parameterDescriptor: ValueParameterDescriptor, firstOccurrence: ResolvedCallArgument) defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentPassedTwice[DeserializedClassConstructorDescriptor]

'java' @ [126:40] ==> public val <T> KClass<ArgumentPassedTwice>.java: Class<ArgumentPassedTwice> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ArgumentPassedTwice

'trace' @ [126:48] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [126:54] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'ARGUMENT_PASSED_TWICE' @ [126:61] ==> public final val ARGUMENT_PASSED_TWICE: (DiagnosticFactory0<(KtReferenceExpression..KtReferenceExpression?)>..DiagnosticFactory0<(KtReferenceExpression..KtReferenceExpression?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [126:83] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression): SimpleDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'nameReference' @ [126:86] ==> val nameReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.onCallArgumentName[LocalVariableDescriptor]

'smartCastDiagnostic' @ [135:34] ==> value-parameter smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[ValueParameterDescriptorImpl]

'argument' @ [135:54] ==> public final val argument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedPropertyDescriptor]

'when (expressionArgument) {
            is ExpressionKotlinCallArgumentImpl -> {
                trace.markAsReported()
                val context = context.replaceDataFlowInfo(expressionArgument.dataFlowInfoBeforeThisArgument)
                val argumentExpression = KtPsiUtil.getLastElementDeparenthesized(expressionArgument.valueArgument.getArgumentExpression (), context.statementFilter)
                val dataFlowValue = DataFlowValueFactory.createDataFlowValue(expressionArgument.receiver.receiverValue, context)
                SmartCastManager.checkAndRecordPossibleCast(
                        dataFlowValue, smartCastDiagnostic.smartCastType, argumentExpression, context, call,
                        recordExpressionType = true)
            }
            is ReceiverExpressionKotlinCallArgument -> {
                trace.markAsReported()
                val receiverValue = expressionArgument.receiver.receiverValue
                val dataFlowValue = DataFlowValueFactory.createDataFlowValue(receiverValue, context)
                SmartCastManager.checkAndRecordPossibleCast(
                        dataFlowValue, smartCastDiagnostic.smartCastType, (receiverValue as? ExpressionReceiver)?.expression, context, call,
                        recordExpressionType = true)
            }
            else -> null
        }' @ [136:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SmartCastResult?, entry1: SmartCastResult?, entry2: SmartCastResult?): SmartCastResult?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SmartCastResult?

'expressionArgument' @ [136:37] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'trace' @ [138:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'markAsReported' @ [138:23] ==> public final fun markAsReported(): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'context' @ [139:31] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'replaceDataFlowInfo' @ [139:39] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'expressionArgument' @ [139:59] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'dataFlowInfoBeforeThisArgument' @ [139:78] ==> public open val dataFlowInfoBeforeThisArgument: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.ExpressionKotlinCallArgumentImpl[PropertyDescriptorImpl]

'getLastElementDeparenthesized' @ [140:52] ==> @Nullable public open fun getLastElementDeparenthesized(@Nullable expression: KtExpression?, @NotNull statementFilter: StatementFilter): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expressionArgument' @ [140:82] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'valueArgument' @ [140:101] ==> public open val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.tower.ExpressionKotlinCallArgumentImpl[PropertyDescriptorImpl]

'getArgumentExpression' @ [140:115] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'context' @ [140:141] ==> val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'statementFilter' @ [140:149] ==> @NotNull public final val statementFilter: StatementFilter defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'DataFlowValueFactory' @ [141:37] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [141:58] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expressionArgument' @ [141:78] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'receiver' @ [141:97] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [141:106] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'context' @ [141:121] ==> val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'checkAndRecordPossibleCast' @ [142:34] ==> public final fun checkAndRecordPossibleCast(dataFlowValue: DataFlowValue, expectedType: KotlinType, expression: KtExpression?, c: ResolutionContext<*>, call: Call?, recordExpressionType: Boolean): SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager.Companion[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [143:25] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'smartCastDiagnostic' @ [143:40] ==> value-parameter smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[ValueParameterDescriptorImpl]

'smartCastType' @ [143:60] ==> public final val smartCastType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedPropertyDescriptor]

'argumentExpression' @ [143:75] ==> val argumentExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'context' @ [143:95] ==> val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'call' @ [143:104] ==> private final val call: Call defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'trace' @ [147:17] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'markAsReported' @ [147:23] ==> public final fun markAsReported(): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'expressionArgument' @ [148:37] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'receiver' @ [148:56] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [148:65] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'DataFlowValueFactory' @ [149:37] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [149:58] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverValue' @ [149:78] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'context' @ [149:93] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'checkAndRecordPossibleCast' @ [150:34] ==> public final fun checkAndRecordPossibleCast(dataFlowValue: DataFlowValue, expectedType: KotlinType, expression: KtExpression?, c: ResolutionContext<*>, call: Call?, recordExpressionType: Boolean): SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager.Companion[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [151:25] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'smartCastDiagnostic' @ [151:40] ==> value-parameter smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[ValueParameterDescriptorImpl]

'smartCastType' @ [151:60] ==> public final val smartCastType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedPropertyDescriptor]

'receiverValue' @ [151:76] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'expression' @ [151:115] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'context' @ [151:127] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'call' @ [151:136] ==> private final val call: Call defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'smartCastDiagnostic' @ [156:28] ==> value-parameter smartCastDiagnostic: SmartCastDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[ValueParameterDescriptorImpl]

'kotlinCall' @ [156:48] ==> public final val kotlinCall: KotlinCall? defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedPropertyDescriptor]

'psiKotlinCall' @ [156:60] ==> public val KotlinCall.psiKotlinCall: PSIKotlinCall defined in org.jetbrains.kotlin.resolve.calls.tower in file PSIKotlinCalls.kt[PropertyDescriptorImpl]

'psiCall' @ [156:75] ==> public abstract val psiCall: Call defined in org.jetbrains.kotlin.resolve.calls.tower.PSIKotlinCall[PropertyDescriptorImpl]

'getResolvedCall' @ [156:84] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'trace' @ [156:100] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'bindingContext' @ [156:106] ==> public final val TrackingBindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'resolvedCall' @ [157:13] ==> val resolvedCall: NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'smartCastResult' @ [157:37] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'resolvedCall' @ [158:17] ==> val resolvedCall: NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'extensionReceiver' @ [158:30] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(*)

'expressionArgument' @ [158:51] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'receiver' @ [158:70] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [158:79] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'resolvedCall' @ [159:17] ==> val resolvedCall: NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'updateExtensionReceiverWithSmartCastIfNeeded' @ [159:30] ==> public final fun updateExtensionReceiverWithSmartCastIfNeeded(smartCastExtensionReceiverType: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[SimpleFunctionDescriptorImpl]

'smartCastResult' @ [159:75] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'resultType' @ [159:91] ==> public final val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'resolvedCall' @ [161:17] ==> val resolvedCall: NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'dispatchReceiver' @ [161:30] ==> public final val <D : CallableDescriptor> NewResolvedCallImpl<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : CallableDescriptor> -> Captured(*)

'expressionArgument' @ [161:50] ==> val expressionArgument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'receiver' @ [161:69] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.ExpressionKotlinCallArgument[DeserializedPropertyDescriptor]

'receiverValue' @ [161:78] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'resolvedCall' @ [162:17] ==> val resolvedCall: NewResolvedCallImpl<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'setSmartCastDispatchReceiverType' @ [162:30] ==> public final fun setSmartCastDispatchReceiverType(smartCastDispatchReceiverType: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolvedCallImpl[SimpleFunctionDescriptorImpl]

'smartCastResult' @ [162:63] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportSmartCast[LocalVariableDescriptor]

'resultType' @ [162:79] ==> public final val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'reportSmartCast' @ [169:9] ==> private final fun reportSmartCast(smartCastDiagnostic: SmartCastDiagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[SimpleFunctionDescriptorImpl]

'SmartCastDiagnostic' @ [169:25] ==> public constructor SmartCastDiagnostic(argument: ExpressionKotlinCallArgument, smartCastType: UnwrappedType, kotlinCall: KotlinCall?) defined in org.jetbrains.kotlin.resolve.calls.model.SmartCastDiagnostic[DeserializedClassConstructorDescriptor]

'unstableSmartCast' @ [169:45] ==> value-parameter unstableSmartCast: UnstableSmartCast defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportUnstableSmartCast[ValueParameterDescriptorImpl]

'argument' @ [169:63] ==> public final val argument: ExpressionKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[DeserializedPropertyDescriptor]

'unstableSmartCast' @ [169:73] ==> value-parameter unstableSmartCast: UnstableSmartCast defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportUnstableSmartCast[ValueParameterDescriptorImpl]

'targetType' @ [169:91] ==> public final val targetType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.model.UnstableSmartCast[DeserializedPropertyDescriptor]

'when (diagnostic.javaClass) {
            NewConstraintError::class.java -> {
                val constraintError = diagnostic as NewConstraintError
                val position = constraintError.position.from
                val argument = (position as? ArgumentConstraintPosition)?.argument
                               ?: (position as? ReceiverConstraintPosition)?.argument
                argument?.let {
                    val expression = it.psiExpression ?: return
                    val deparenthesized = KtPsiUtil.safeDeparenthesize(expression)
                    if (reportConstantTypeMismatch(constraintError, deparenthesized)) return
                    trace.report(Errors.TYPE_MISMATCH.on(deparenthesized, constraintError.upperType, constraintError.lowerType))
                }
                (position as? ExplicitTypeParameterConstraintPosition)?.let {
                    val typeArgumentReference = (it.typeArgument as SimpleTypeArgumentImpl).typeReference
                    trace.report(UPPER_BOUND_VIOLATED.on(typeArgumentReference, constraintError.upperType, constraintError.lowerType))
                }
            }
            CapturedTypeFromSubtyping::class.java -> {
                val capturedError = diagnostic as CapturedTypeFromSubtyping
                (capturedError.position as? ArgumentConstraintPosition)?.let {
                    val expression = it.argument.psiExpression ?: return
                    trace.report(NEW_INFERENCE_ERROR.on(expression, "Capture type from subtyping ${capturedError.constraintType} for variable ${capturedError.typeVariable}"))
                }
            }
        }' @ [173:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit?, entry1: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit?

'diagnostic' @ [173:15] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[ValueParameterDescriptorImpl]

'javaClass' @ [173:26] ==> public val <T : Any> KotlinCallDiagnostic.javaClass: Class<KotlinCallDiagnostic> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> KotlinCallDiagnostic

'NewConstraintError' @ [174:13] ==> public constructor NewConstraintError(lowerType: UnwrappedType, upperType: UnwrappedType, position: IncorporationConstraintPosition) defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedClassConstructorDescriptor]

'java' @ [174:39] ==> public val <T> KClass<NewConstraintError>.java: Class<NewConstraintError> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NewConstraintError

'diagnostic' @ [175:39] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[ValueParameterDescriptorImpl]

'constraintError' @ [176:32] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'position' @ [176:48] ==> public final val position: IncorporationConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'from' @ [176:57] ==> public final val from: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.IncorporationConstraintPosition[DeserializedPropertyDescriptor]

'?:' @ [177:32] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinCallArgument?, right: KotlinCallArgument?): KotlinCallArgument?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinCallArgument?

'position' @ [177:33] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'argument' @ [177:75] ==> public final val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[DeserializedPropertyDescriptor]

'position' @ [178:36] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'argument' @ [178:78] ==> public final val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.inference.model.ReceiverConstraintPosition[DeserializedPropertyDescriptor]

'argument' @ [179:17] ==> val argument: KotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'let' @ [179:27] ==> @InlineOnly public inline fun <T, R> KotlinCallArgument.let(block: (KotlinCallArgument) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallArgument
    <R> -> Unit

'it' @ [180:38] ==> value-parameter it: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[ValueParameterDescriptorImpl]

'psiExpression' @ [180:41] ==> public val KotlinCallArgument.psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'safeDeparenthesize' @ [181:53] ==> @NotNull public open fun safeDeparenthesize(@NotNull expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [181:72] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[LocalVariableDescriptor]

'reportConstantTypeMismatch' @ [182:25] ==> private final fun reportConstantTypeMismatch(constraintError: NewConstraintError, expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[SimpleFunctionDescriptorImpl]

'constraintError' @ [182:52] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'deparenthesized' @ [182:69] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[LocalVariableDescriptor]

'trace' @ [183:21] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [183:27] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'TYPE_MISMATCH' @ [183:41] ==> public final val TYPE_MISMATCH: (DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtExpression..KtExpression?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [183:55] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'deparenthesized' @ [183:58] ==> val deparenthesized: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[LocalVariableDescriptor]

'constraintError' @ [183:75] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'upperType' @ [183:91] ==> public final val upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'constraintError' @ [183:102] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'lowerType' @ [183:118] ==> public final val lowerType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'position' @ [185:18] ==> val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'let' @ [185:73] ==> @InlineOnly public inline fun <T, R> ExplicitTypeParameterConstraintPosition.let(block: (ExplicitTypeParameterConstraintPosition) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitTypeParameterConstraintPosition
    <R> -> Unit

'it' @ [186:50] ==> value-parameter it: ExplicitTypeParameterConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[ValueParameterDescriptorImpl]

'typeArgument' @ [186:53] ==> public final val typeArgument: SimpleTypeArgument defined in org.jetbrains.kotlin.resolve.calls.inference.model.ExplicitTypeParameterConstraintPosition[DeserializedPropertyDescriptor]

'typeReference' @ [186:93] ==> public final val typeReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.calls.tower.SimpleTypeArgumentImpl[PropertyDescriptorImpl]

'trace' @ [187:21] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [187:27] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'UPPER_BOUND_VIOLATED' @ [187:34] ==> public final val UPPER_BOUND_VIOLATED: (DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [187:55] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'typeArgumentReference' @ [187:58] ==> val typeArgumentReference: KtTypeReference defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[LocalVariableDescriptor]

'constraintError' @ [187:81] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'upperType' @ [187:97] ==> public final val upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'constraintError' @ [187:108] ==> val constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'lowerType' @ [187:124] ==> public final val lowerType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'CapturedTypeFromSubtyping' @ [190:13] ==> public constructor CapturedTypeFromSubtyping(typeVariable: NewTypeVariable, constraintType: UnwrappedType, position: ConstraintPosition) defined in org.jetbrains.kotlin.resolve.calls.inference.model.CapturedTypeFromSubtyping[DeserializedClassConstructorDescriptor]

'java' @ [190:46] ==> public val <T> KClass<CapturedTypeFromSubtyping>.java: Class<CapturedTypeFromSubtyping> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CapturedTypeFromSubtyping

'diagnostic' @ [191:37] ==> value-parameter diagnostic: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[ValueParameterDescriptorImpl]

'capturedError' @ [192:18] ==> val capturedError: CapturedTypeFromSubtyping defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'position' @ [192:32] ==> public final val position: ConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.inference.model.CapturedTypeFromSubtyping[DeserializedPropertyDescriptor]

'let' @ [192:74] ==> @InlineOnly public inline fun <T, R> ArgumentConstraintPosition.let(block: (ArgumentConstraintPosition) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArgumentConstraintPosition
    <R> -> Unit

'it' @ [193:38] ==> value-parameter it: ArgumentConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[ValueParameterDescriptorImpl]

'argument' @ [193:41] ==> public final val argument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[DeserializedPropertyDescriptor]

'psiExpression' @ [193:50] ==> public val KotlinCallArgument.psiExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewCallArguments.kt[PropertyDescriptorImpl]

'trace' @ [194:21] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'report' @ [194:27] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TrackingBindingTrace[SimpleFunctionDescriptorImpl]

'NEW_INFERENCE_ERROR' @ [194:34] ==> public final val NEW_INFERENCE_ERROR: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [194:54] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [194:57] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError.<anonymous>[LocalVariableDescriptor]

'capturedError' @ [194:100] ==> val capturedError: CapturedTypeFromSubtyping defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'constraintType' @ [194:114] ==> public final val constraintType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.CapturedTypeFromSubtyping[DeserializedPropertyDescriptor]

'capturedError' @ [194:145] ==> val capturedError: CapturedTypeFromSubtyping defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.constraintError[LocalVariableDescriptor]

'typeVariable' @ [194:159] ==> public final val typeVariable: NewTypeVariable defined in org.jetbrains.kotlin.resolve.calls.inference.model.CapturedTypeFromSubtyping[DeserializedPropertyDescriptor]

'expression' @ [201:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[ValueParameterDescriptorImpl]

'context' @ [202:28] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'scope' @ [202:36] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [202:42] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'builtIns' @ [202:58] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'constantExpressionEvaluator' @ [203:33] ==> public final val constantExpressionEvaluator: ConstantExpressionEvaluator defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'evaluateToConstantValue' @ [203:61] ==> public final fun evaluateToConstantValue(expression: KtExpression, trace: BindingTrace, expectedType: KotlinType): ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[SimpleFunctionDescriptorImpl]

'expression' @ [203:85] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[ValueParameterDescriptorImpl]

'trace' @ [203:97] ==> private final val trace: TrackingBindingTrace defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'context' @ [203:104] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'expectedType' @ [203:112] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'CompileTimeConstantChecker' @ [204:40] ==> public constructor CompileTimeConstantChecker(@NotNull context: ResolutionContext<*>, @NotNull builtIns: KotlinBuiltIns, checkOnlyErrorsThatDependOnExpectedType: Boolean) defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstantChecker[JavaClassConstructorDescriptor]

'context' @ [204:67] ==> public final val context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy[PropertyDescriptorImpl]

'builtIns' @ [204:76] ==> val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[LocalVariableDescriptor]

'checkConstantExpressionType' @ [205:22] ==> public open fun checkConstantExpressionType(@Nullable compileTimeConstant: ConstantValue<*>?, @NotNull expression: KtConstantExpression, @NotNull expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.constants.CompileTimeConstantChecker[JavaMethodDescriptor]

'constantValue' @ [205:50] ==> val constantValue: ConstantValue<*>? defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[LocalVariableDescriptor]

'expression' @ [205:65] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[ValueParameterDescriptorImpl]

'constraintError' @ [205:77] ==> value-parameter constraintError: NewConstraintError defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[ValueParameterDescriptorImpl]

'upperType' @ [205:93] ==> public final val upperType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.model.NewConstraintError[DeserializedPropertyDescriptor]

'hasConstantTypeError' @ [206:17] ==> val hasConstantTypeError: Boolean defined in org.jetbrains.kotlin.resolve.calls.DiagnosticReporterByTrackingStrategy.reportConstantTypeMismatch[LocalVariableDescriptor]

