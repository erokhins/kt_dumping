'rttiInformation' @ [33:26] ==> value-parameter rttiInformation: RttiExpressionInformation defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'sourceType' @ [33:42] ==> public final val sourceType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionInformation[DeserializedPropertyDescriptor]

'rttiInformation' @ [34:26] ==> value-parameter rttiInformation: RttiExpressionInformation defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'targetType' @ [34:42] ==> public final val targetType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionInformation[DeserializedPropertyDescriptor]

'targetType' @ [35:32] ==> val targetType: KotlinType? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'constructor' @ [35:44] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [35:57] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'sourceType' @ [36:13] ==> val sourceType: KotlinType? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'targetDescriptor' @ [36:35] ==> val targetDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'isNativeInterface' @ [36:80] ==> public open fun isNativeInterface(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'targetDescriptor' @ [36:98] ==> val targetDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'when (rttiInformation.operation) {
                RttiOperation.IS,
                RttiOperation.NOT_IS -> trace.report(ErrorsJs.CANNOT_CHECK_FOR_NATIVE_INTERFACE.on(reportOn, targetType))

                RttiOperation.AS,
                RttiOperation.SAFE_AS -> trace.report(ErrorsJs.UNCHECKED_CAST_TO_NATIVE_INTERFACE.on(reportOn, sourceType, targetType))
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'rttiInformation' @ [37:19] ==> value-parameter rttiInformation: RttiExpressionInformation defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'operation' @ [37:35] ==> public final val operation: RttiOperation defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiExpressionInformation[DeserializedPropertyDescriptor]

'IS' @ [38:31] ==> enum entry IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'NOT_IS' @ [39:31] ==> enum entry NOT_IS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'trace' @ [39:41] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'report' @ [39:47] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'CANNOT_CHECK_FOR_NATIVE_INTERFACE' @ [39:63] ==> public final val CANNOT_CHECK_FOR_NATIVE_INTERFACE: (DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [39:97] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [39:100] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'targetType' @ [39:110] ==> val targetType: KotlinType? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'AS' @ [41:31] ==> enum entry AS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'SAFE_AS' @ [42:31] ==> enum entry SAFE_AS defined in org.jetbrains.kotlin.resolve.calls.checkers.RttiOperation[FakeCallableDescriptorForObject]

'trace' @ [42:42] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'report' @ [42:48] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UNCHECKED_CAST_TO_NATIVE_INTERFACE' @ [42:64] ==> public final val UNCHECKED_CAST_TO_NATIVE_INTERFACE: (DiagnosticFactory2<(PsiElement..PsiElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [42:99] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: KotlinType, @NotNull p2: KotlinType): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [42:102] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'sourceType' @ [42:112] ==> val sourceType: KotlinType? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'targetType' @ [42:124] ==> val targetType: KotlinType? defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'type' @ [48:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'constructor' @ [48:31] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [48:43] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'isNativeInterface' @ [49:30] ==> public open fun isNativeInterface(@NotNull descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'descriptor' @ [49:48] ==> val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[LocalVariableDescriptor]

'context' @ [50:13] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

'trace' @ [50:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [50:27] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NATIVE_INTERFACE_AS_CLASS_LITERAL' @ [50:43] ==> public final val NATIVE_INTERFACE_AS_CLASS_LITERAL: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [50:77] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'expression' @ [50:80] ==> value-parameter expression: KtClassLiteralExpression defined in org.jetbrains.kotlin.js.resolve.diagnostics.JsNativeRttiChecker.check[ValueParameterDescriptorImpl]

