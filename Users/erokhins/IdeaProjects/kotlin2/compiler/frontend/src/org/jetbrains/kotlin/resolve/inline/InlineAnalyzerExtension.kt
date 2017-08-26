'checkModalityAndOverrides' @ [37:9] ==> private final fun checkModalityAndOverrides(callableDescriptor: CallableMemberDescriptor, functionOrProperty: KtCallableDeclaration, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [37:35] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [37:47] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'trace' @ [37:67] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'notSupportedInInlineCheck' @ [38:9] ==> private final fun notSupportedInInlineCheck(descriptor: CallableMemberDescriptor, functionOrProperty: KtCallableDeclaration, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [38:35] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [38:47] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'trace' @ [38:67] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'if (descriptor is FunctionDescriptor) {
            assert (functionOrProperty is KtNamedFunction) {
                "Function descriptor $descriptor should have corresponded KtNamedFunction, but has $functionOrProperty"
            }
            checkDefaults(descriptor, functionOrProperty as KtNamedFunction, trace)
            checkHasInlinableAndNullability(descriptor, functionOrProperty, trace)
        }
        else {
            assert (descriptor is PropertyDescriptor) {
                "PropertyDescriptor expected, but was $descriptor"
            }
            assert (functionOrProperty is KtProperty) {
                "Property descriptor $descriptor should have corresponded KtProperty, but has $functionOrProperty"
            }

            val hasBackingField = trace.get(BindingContext.BACKING_FIELD_REQUIRED, descriptor as PropertyDescriptor) == true
            if (hasBackingField || (functionOrProperty as KtProperty).delegateExpression != null) {
                trace.report(Errors.INLINE_PROPERTY_WITH_BACKING_FIELD.on(functionOrProperty))
            }
        }' @ [40:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'descriptor' @ [40:13] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'assert' @ [41:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'functionOrProperty' @ [41:21] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'descriptor' @ [42:39] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [42:101] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'checkDefaults' @ [44:13] ==> private final fun checkDefaults(functionDescriptor: FunctionDescriptor, function: KtFunction, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [44:27] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [44:39] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'trace' @ [44:78] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'checkHasInlinableAndNullability' @ [45:13] ==> private final fun checkHasInlinableAndNullability(functionDescriptor: FunctionDescriptor, function: KtFunction, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [45:45] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [45:57] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'trace' @ [45:77] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'assert' @ [48:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [48:21] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'descriptor' @ [49:56] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'assert' @ [51:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'functionOrProperty' @ [51:21] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'descriptor' @ [52:39] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'functionOrProperty' @ [52:96] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'trace' @ [55:35] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'get' @ [55:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..ReadOnlySlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?), key: (PropertyDescriptor..PropertyDescriptor?)): Boolean? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.PropertyDescriptor..org.jetbrains.kotlin.descriptors.PropertyDescriptor?)
    <V : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'BACKING_FIELD_REQUIRED' @ [55:60] ==> public final val BACKING_FIELD_REQUIRED: (WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>..WritableSlice<(PropertyDescriptor..PropertyDescriptor?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [55:84] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'hasBackingField' @ [56:17] ==> val hasBackingField: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[LocalVariableDescriptor]

'!=' @ [56:36] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]

'functionOrProperty' @ [56:37] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'delegateExpression' @ [56:71] ==> public final val KtProperty.delegateExpression: KtExpression?[MyPropertyDescriptor]

'trace' @ [57:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'report' @ [57:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INLINE_PROPERTY_WITH_BACKING_FIELD' @ [57:37] ==> public final val INLINE_PROPERTY_WITH_BACKING_FIELD: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [57:72] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'functionOrProperty' @ [57:75] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.process[ValueParameterDescriptorImpl]

'KtVisitorVoid' @ [63:32] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [65:17] ==> <this> defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitKtElement' @ [65:23] ==> public open fun visitKtElement(@NotNull element: KtElement): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'element' @ [65:38] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'element' @ [66:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [66:25] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [66:40] ==> <this> defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>[LazyClassReceiverParameterDescriptor]

'trace' @ [70:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[ValueParameterDescriptorImpl]

'report' @ [70:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOT_YET_SUPPORTED_IN_INLINE' @ [70:37] ==> public final val NOT_YET_SUPPORTED_IN_INLINE: (DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [70:65] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KtNamedDeclaration, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'klass' @ [70:68] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'klass' @ [70:75] ==> value-parameter klass: KtClass defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitClass[ValueParameterDescriptorImpl]

'descriptor' @ [70:82] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[ValueParameterDescriptorImpl]

'if (function.parent.parent is KtObjectDeclaration) {
                    super.visitNamedFunction(function)
                }
                else {
                    trace.report(Errors.NOT_YET_SUPPORTED_IN_INLINE.on(function, function, descriptor))
                }' @ [74:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'function' @ [74:21] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'parent' @ [74:30] ==> public final val KtNamedFunction.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [74:37] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'super' @ [75:21] ==> <this> defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNamedFunction' @ [75:27] ==> public open fun visitNamedFunction(@NotNull function: KtNamedFunction): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'function' @ [75:46] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'trace' @ [78:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[ValueParameterDescriptorImpl]

'report' @ [78:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOT_YET_SUPPORTED_IN_INLINE' @ [78:41] ==> public final val NOT_YET_SUPPORTED_IN_INLINE: (DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [78:69] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KtNamedDeclaration, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'function' @ [78:72] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'function' @ [78:82] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'descriptor' @ [78:92] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[ValueParameterDescriptorImpl]

'functionOrProperty' @ [83:9] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[ValueParameterDescriptorImpl]

'acceptChildren' @ [83:28] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'visitor' @ [83:43] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.notSupportedInInlineCheck[LocalVariableDescriptor]

'function' @ [90:28] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'valueParameters' @ [90:37] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'functionDescriptor' @ [91:27] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'valueParameters' @ [91:46] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'parameter' @ [92:17] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'hasDefaultValue' @ [92:27] ==> public fun ValueParameterDescriptor.hasDefaultValue(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'ktParameters' @ [93:35] ==> val ktParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'parameter' @ [93:48] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'index' @ [93:58] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'!' @ [95:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameter' @ [95:45] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'declaresDefaultValue' @ [95:55] ==> public abstract fun declaresDefaultValue(): Boolean defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedSimpleFunctionDescriptor]

'checkInlinableParameter' @ [96:21] ==> private final fun checkInlinableParameter(parameter: ParameterDescriptor, expression: KtElement, functionDescriptor: CallableDescriptor, trace: BindingTrace?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'parameter' @ [96:45] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'ktParameter' @ [96:56] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'functionDescriptor' @ [96:69] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'inheritDefaultValues' @ [96:98] ==> val inheritDefaultValues: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'if (inheritDefaultValues || !languageVersionSettings.supportsFeature(LanguageFeature.InlineDefaultFunctionalParameters)) {
                        trace.report(Errors.NOT_YET_SUPPORTED_IN_INLINE.on(ktParameter, ktParameter, functionDescriptor))
                    }
                    else {
                        checkDefaultValue(trace, parameter, ktParameter)
                    }' @ [97:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'inheritDefaultValues' @ [97:25] ==> val inheritDefaultValues: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'!' @ [97:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'languageVersionSettings' @ [97:50] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[PropertyDescriptorImpl]

'supportsFeature' @ [97:74] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'InlineDefaultFunctionalParameters' @ [97:106] ==> enum entry InlineDefaultFunctionalParameters defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'trace' @ [98:25] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'report' @ [98:31] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOT_YET_SUPPORTED_IN_INLINE' @ [98:45] ==> public final val NOT_YET_SUPPORTED_IN_INLINE: (DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (KtNamedDeclaration..KtNamedDeclaration?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [98:73] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KtNamedDeclaration, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'ktParameter' @ [98:76] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'ktParameter' @ [98:89] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'functionDescriptor' @ [98:102] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'checkDefaultValue' @ [101:25] ==> private final fun checkDefaultValue(trace: BindingTrace, parameterDescriptor: ValueParameterDescriptor, ktParameter: KtParameter): Unit defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'trace' @ [101:43] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[ValueParameterDescriptorImpl]

'parameter' @ [101:50] ==> val parameter: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'ktParameter' @ [101:61] ==> val ktParameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaults[LocalVariableDescriptor]

'ktParameter' @ [109:9] ==> value-parameter ktParameter: KtParameter defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue[ValueParameterDescriptorImpl]

'defaultValue' @ [109:21] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'let' @ [109:35] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'!' @ [110:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInlinableParameterExpression' @ [110:29] ==> public open fun isInlinableParameterExpression(@Nullable deparenthesized: KtExpression?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'deparenthesize' @ [110:70] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'defaultValue' @ [110:85] ==> value-parameter defaultValue: KtExpression defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'trace' @ [111:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue[ValueParameterDescriptorImpl]

'report' @ [111:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INVALID_DEFAULT_FUNCTIONAL_PARAMETER_FOR_INLINE' @ [111:37] ==> public final val INVALID_DEFAULT_FUNCTIONAL_PARAMETER_FOR_INLINE: (DiagnosticFactory2<(KtElement..KtElement?), (KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [111:85] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KtExpression, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'defaultValue' @ [111:88] ==> value-parameter defaultValue: KtExpression defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'defaultValue' @ [111:102] ==> value-parameter defaultValue: KtExpression defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'parameterDescriptor' @ [111:116] ==> value-parameter parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkDefaultValue[ValueParameterDescriptorImpl]

'callableDescriptor' @ [120:13] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'containingDeclaration' @ [120:32] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'isPrivate' @ [124:26] ==> public open fun isPrivate(@NotNull p0: Visibility): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'callableDescriptor' @ [124:36] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'visibility' @ [124:55] ==> public final val CallableMemberDescriptor.visibility: Visibility[MyPropertyDescriptor]

'callableDescriptor' @ [128:33] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [128:52] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [128:74] ==> @InlineOnly public inline fun <T> Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overridesAnything' @ [130:13] ==> val overridesAnything: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'functionOrProperty' @ [131:36] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'typeParameters' @ [131:55] ==> public final val KtCallableDeclaration.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'callableDescriptor' @ [132:35] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'typeParameters' @ [132:54] ==> public final val CallableMemberDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeParameter' @ [133:21] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'isReified' @ [133:35] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

'ktTypeParameters' @ [134:43] ==> val ktTypeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'typeParameter' @ [134:60] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'index' @ [134:74] ==> public final val TypeParameterDescriptor.index: Int[MyPropertyDescriptor]

'ktTypeParameter' @ [135:36] ==> val ktTypeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'modifierList' @ [135:52] ==> public final val KtTypeParameter.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [135:66] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'REIFIED_KEYWORD' @ [135:87] ==> public final val REIFIED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ktTypeParameter' @ [135:107] ==> val ktTypeParameter: (KtTypeParameter..KtTypeParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'trace' @ [136:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'report' @ [136:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'REIFIED_TYPE_PARAMETER_IN_OVERRIDE' @ [136:41] ==> public final val REIFIED_TYPE_PARAMETER_IN_OVERRIDE: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [136:76] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'reportOn' @ [136:79] ==> val reportOn: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'callableDescriptor' @ [141:13] ==> value-parameter callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'isEffectivelyFinal' @ [141:32] ==> private final fun CallableMemberDescriptor.isEffectivelyFinal(): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'overridesAnything' @ [142:17] ==> val overridesAnything: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[LocalVariableDescriptor]

'trace' @ [143:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'report' @ [143:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'OVERRIDE_BY_INLINE' @ [143:37] ==> public final val OVERRIDE_BY_INLINE: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [143:56] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'functionOrProperty' @ [143:59] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'trace' @ [147:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'report' @ [147:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DECLARATION_CANT_BE_INLINED' @ [147:29] ==> public final val DECLARATION_CANT_BE_INLINED: (DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>..DiagnosticFactory0<(KtDeclaration..KtDeclaration?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [147:57] ==> @NotNull public open fun on(@NotNull element: KtDeclaration): SimpleDiagnostic<(KtDeclaration..KtDeclaration?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'functionOrProperty' @ [147:60] ==> value-parameter functionOrProperty: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkModalityAndOverrides[ValueParameterDescriptorImpl]

'modality' @ [151:13] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [151:34] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'containingDeclaration' @ [152:13] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'let' @ [152:35] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptor.let(block: (DeclarationDescriptor) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> Boolean

'containingDeclaration' @ [153:17] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.isEffectivelyFinal.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [153:61] ==> value-parameter containingDeclaration: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.isEffectivelyFinal.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [153:83] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'FINAL' @ [153:104] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'function' @ [158:9] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'valueParameters' @ [158:18] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'zip' @ [158:34] ==> public infix fun <T, R> Iterable<(KtParameter..KtParameter?)>.zip(other: Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>): List<Pair<(KtParameter..KtParameter?), (ValueParameterDescriptor..ValueParameterDescriptor?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)
    <R> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'functionDescriptor' @ [158:38] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'valueParameters' @ [158:57] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'forEach' @ [158:74] ==> @HidesMembers public inline fun <T> Iterable<Pair<(KtParameter..KtParameter?), (ValueParameterDescriptor..ValueParameterDescriptor?)>>.forEach(action: (Pair<(KtParameter..KtParameter?), (ValueParameterDescriptor..ValueParameterDescriptor?)>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?), (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)>

'component1' @ [159:14] ==> public final operator fun component1(): (KtParameter..KtParameter?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [159:25] ==> public final operator fun component2(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'hasInlineArgs' @ [160:13] ==> var hasInlineArgs: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[LocalVariableDescriptor]

'hasInlineArgs' @ [160:29] ==> var hasInlineArgs: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[LocalVariableDescriptor]

'checkInlinableParameter' @ [160:46] ==> private final fun checkInlinableParameter(parameter: ParameterDescriptor, expression: KtElement, functionDescriptor: CallableDescriptor, trace: BindingTrace?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[SimpleFunctionDescriptorImpl]

'descriptor' @ [160:70] ==> val descriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability.<anonymous>[LocalVariableDescriptor]

'parameter' @ [160:82] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability.<anonymous>[LocalVariableDescriptor]

'functionDescriptor' @ [160:93] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'trace' @ [160:113] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'hasInlineArgs' @ [162:13] ==> var hasInlineArgs: Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[LocalVariableDescriptor]

'functionDescriptor' @ [164:13] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'isInlineOnlyOrReifiable' @ [164:32] ==> public fun MemberDescriptor.isInlineOnlyOrReifiable(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations[DeserializedSimpleFunctionDescriptor]

'functionDescriptor' @ [164:61] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'isHeader' @ [164:80] ==> public final val FunctionDescriptor.isHeader: Boolean[MyPropertyDescriptor]

'reasonableInlineRules' @ [166:13] ==> private final val reasonableInlineRules: Iterable<ReasonableInlineRule> defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension[PropertyDescriptorImpl]

'any' @ [166:35] ==> public inline fun <T> Iterable<ReasonableInlineRule>.any(predicate: (ReasonableInlineRule) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReasonableInlineRule

'it' @ [166:41] ==> value-parameter it: ReasonableInlineRule defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability.<anonymous>[ValueParameterDescriptorImpl]

'isInlineReasonable' @ [166:44] ==> public abstract fun isInlineReasonable(descriptor: CallableMemberDescriptor, declaration: KtCallableDeclaration, context: BindingContext): Boolean defined in org.jetbrains.kotlin.resolve.inline.ReasonableInlineRule[SimpleFunctionDescriptorImpl]

'functionDescriptor' @ [166:63] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'function' @ [166:83] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'trace' @ [166:93] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'bindingContext' @ [166:99] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'function' @ [168:24] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'modifierList' @ [168:33] ==> public final val KtFunction.modifierList: KtModifierList?[MyPropertyDescriptor]

'getModifier' @ [168:47] ==> @Nullable public open fun getModifier(@NotNull tokenType: KtModifierKeywordToken): PsiElement? defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'INLINE_KEYWORD' @ [168:68] ==> public final val INLINE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'function' @ [168:87] ==> value-parameter function: KtFunction defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'trace' @ [169:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'report' @ [169:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NOTHING_TO_INLINE' @ [169:29] ==> public final val NOTHING_TO_INLINE: (DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [169:47] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [169:50] ==> val reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[LocalVariableDescriptor]

'functionDescriptor' @ [169:60] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkHasInlinableAndNullability[ValueParameterDescriptorImpl]

'isInlineParameterExceptNullability' @ [177:24] ==> public open fun isInlineParameterExceptNullability(@NotNull valueParameterOrReceiver: ParameterDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'parameter' @ [177:59] ==> value-parameter parameter: ParameterDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

'if (parameter.type.isMarkedNullable) {
                trace?.report(Errors.NULLABLE_INLINE_PARAMETER.on(expression, expression, functionDescriptor))
            }
            else {
                return true
            }' @ [178:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'parameter' @ [178:17] ==> value-parameter parameter: ParameterDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

'type' @ [178:27] ==> public final val ParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'isMarkedNullable' @ [178:32] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'trace' @ [179:17] ==> value-parameter trace: BindingTrace? defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

'report' @ [179:24] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'NULLABLE_INLINE_PARAMETER' @ [179:38] ==> public final val NULLABLE_INLINE_PARAMETER: (DiagnosticFactory2<(KtElement..KtElement?), (KtElement..KtElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory2<(KtElement..KtElement?), (KtElement..KtElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [179:64] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KtElement, @NotNull b: DeclarationDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'expression' @ [179:67] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

'expression' @ [179:79] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

'functionDescriptor' @ [179:91] ==> value-parameter functionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.inline.InlineAnalyzerExtension.checkInlinableParameter[ValueParameterDescriptorImpl]

