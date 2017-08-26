'getContainingModule' @ [37:34] ==> @NotNull public open fun getContainingModule(@NotNull p0: DeclarationDescriptor): ModuleDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'container' @ [37:54] ==> value-parameter container: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'bindingContext' @ [38:22] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'MODULE_KIND' @ [38:37] ==> @JvmField public val MODULE_KIND: BasicWritableSlice<ModuleDescriptor, ModuleKind> defined in org.jetbrains.kotlin.js.resolve in file bindingContextSlicesJs.kt[PropertyDescriptorImpl]

'module' @ [38:50] ==> val module: ModuleDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'findRoot' @ [39:31] ==> private fun findRoot(callee: DeclarationDescriptor): DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleCheckUtil.kt[SimpleFunctionDescriptorImpl]

'callee' @ [39:40] ==> value-parameter callee: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'!=' @ [41:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getModuleName' @ [41:41] ==> @Nullable public open fun getModuleName(@NotNull declaration: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'calleeRootContainer' @ [41:55] ==> val calleeRootContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'!=' @ [42:24] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getFileModuleName' @ [42:41] ==> @Nullable public open fun getFileModuleName(@NotNull bindingContext: BindingContext, @NotNull declaration: DeclarationDescriptor): String? defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'bindingContext' @ [42:59] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'calleeRootContainer' @ [42:75] ==> val calleeRootContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'isNonModule' @ [43:44] ==> public open fun isNonModule(@NotNull declaration: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'calleeRootContainer' @ [43:56] ==> val calleeRootContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'isFromNonModuleFile' @ [44:44] ==> public open fun isFromNonModuleFile(@NotNull bindingContext: BindingContext, @NotNull declaration: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.js.translate.utils.AnnotationsUtils[JavaMethodDescriptor]

'bindingContext' @ [44:64] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'calleeRootContainer' @ [44:80] ==> val calleeRootContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'if (moduleKind == ModuleKind.UMD) {
        if (!callToNonModule && callToModule || callToNonModule && !callToModule) {
            diagnosticSink.report(ErrorsJs.CALL_FROM_UMD_MUST_BE_JS_MODULE_AND_JS_NON_MODULE.on(reportOn))
        }
    }
    else {
        if (moduleKind == ModuleKind.PLAIN) {
            if (!callToNonModule && callToModule) {
                diagnosticSink.report(ErrorsJs.CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM.on(reportOn, normalizeDescriptor(callee)))
            }
        }
        else {
            if (!callToModule && callToNonModule) {
                diagnosticSink.report(ErrorsJs.CALL_TO_JS_NON_MODULE_WITH_MODULE_SYSTEM.on(reportOn, normalizeDescriptor(callee)))
            }
        }
    }' @ [46:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'moduleKind' @ [46:9] ==> val moduleKind: ModuleKind defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'UMD' @ [46:34] ==> enum entry UMD defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'!' @ [47:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callToNonModule' @ [47:14] ==> val callToNonModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'callToModule' @ [47:33] ==> val callToModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'callToNonModule' @ [47:49] ==> val callToNonModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'!' @ [47:68] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callToModule' @ [47:69] ==> val callToModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'diagnosticSink' @ [48:13] ==> value-parameter diagnosticSink: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'report' @ [48:28] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CALL_FROM_UMD_MUST_BE_JS_MODULE_AND_JS_NON_MODULE' @ [48:44] ==> public final val CALL_FROM_UMD_MUST_BE_JS_MODULE_AND_JS_NON_MODULE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [48:94] ==> @NotNull public open fun on(@NotNull p0: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [48:97] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'if (moduleKind == ModuleKind.PLAIN) {
            if (!callToNonModule && callToModule) {
                diagnosticSink.report(ErrorsJs.CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM.on(reportOn, normalizeDescriptor(callee)))
            }
        }
        else {
            if (!callToModule && callToNonModule) {
                diagnosticSink.report(ErrorsJs.CALL_TO_JS_NON_MODULE_WITH_MODULE_SYSTEM.on(reportOn, normalizeDescriptor(callee)))
            }
        }' @ [52:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'moduleKind' @ [52:13] ==> val moduleKind: ModuleKind defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'PLAIN' @ [52:38] ==> enum entry PLAIN defined in org.jetbrains.kotlin.serialization.js.ModuleKind[FakeCallableDescriptorForObject]

'!' @ [53:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callToNonModule' @ [53:18] ==> val callToNonModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'callToModule' @ [53:37] ==> val callToModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'diagnosticSink' @ [54:17] ==> value-parameter diagnosticSink: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'report' @ [54:32] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM' @ [54:48] ==> public final val CALL_TO_JS_MODULE_WITHOUT_MODULE_SYSTEM: (DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [54:88] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [54:91] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'normalizeDescriptor' @ [54:101] ==> private fun normalizeDescriptor(descriptor: DeclarationDescriptor): DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleCheckUtil.kt[SimpleFunctionDescriptorImpl]

'callee' @ [54:121] ==> value-parameter callee: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'!' @ [58:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callToModule' @ [58:18] ==> val callToModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'callToNonModule' @ [58:34] ==> val callToNonModule: Boolean defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[LocalVariableDescriptor]

'diagnosticSink' @ [59:17] ==> value-parameter diagnosticSink: DiagnosticSink defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'report' @ [59:32] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'CALL_TO_JS_NON_MODULE_WITH_MODULE_SYSTEM' @ [59:48] ==> public final val CALL_TO_JS_NON_MODULE_WITH_MODULE_SYSTEM: (DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.js.resolve.diagnostics.ErrorsJs[JavaPropertyDescriptor]

'on' @ [59:89] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [59:92] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'normalizeDescriptor' @ [59:102] ==> private fun normalizeDescriptor(descriptor: DeclarationDescriptor): DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics in file JsModuleCheckUtil.kt[SimpleFunctionDescriptorImpl]

'callee' @ [59:122] ==> value-parameter callee: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.checkJsModuleUsage[ValueParameterDescriptorImpl]

'descriptor' @ [66:9] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.normalizeDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [66:63] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.normalizeDescriptor[ValueParameterDescriptorImpl]

'classDescriptor' @ [66:74] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedPropertyDescriptor]

'descriptor' @ [67:12] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.normalizeDescriptor[ValueParameterDescriptorImpl]

'generateSequence' @ [70:55] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: DeclarationDescriptor?, nextFunction: (DeclarationDescriptor) -> DeclarationDescriptor?): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'callee' @ [70:72] ==> value-parameter callee: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.findRoot[ValueParameterDescriptorImpl]

'it' @ [70:82] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.findRoot.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [70:85] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'takeWhile' @ [71:6] ==> public fun <T> Sequence<DeclarationDescriptor>.takeWhile(predicate: (DeclarationDescriptor) -> Boolean): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [71:18] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.js.resolve.diagnostics.findRoot.<anonymous>[ValueParameterDescriptorImpl]

'last' @ [72:6] ==> public fun <T> Sequence<DeclarationDescriptor>.last(): DeclarationDescriptor defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

