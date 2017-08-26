'?:' @ [34:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ResolvedCall<out CallableDescriptor>?, right: ResolvedCall<out CallableDescriptor>): ResolvedCall<out CallableDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ResolvedCall<out CallableDescriptor>

'resolvedCall' @ [34:37] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[ValueParameterDescriptorImpl]

'variableCall' @ [34:87] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'resolvedCall' @ [34:103] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[ValueParameterDescriptorImpl]

'variableResolvedCall' @ [35:34] ==> val variableResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[LocalVariableDescriptor]

'resultingDescriptor' @ [35:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'variableDescriptor' @ [36:13] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[LocalVariableDescriptor]

'checkCapturingInClosure' @ [37:13] ==> private final fun checkCapturingInClosure(variable: VariableDescriptor, trace: BindingTrace, scope: LexicalScope): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[SimpleFunctionDescriptorImpl]

'variableDescriptor' @ [37:37] ==> val variableDescriptor: VariableDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[LocalVariableDescriptor]

'context' @ [37:57] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[ValueParameterDescriptorImpl]

'trace' @ [37:65] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'context' @ [37:72] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.check[ValueParameterDescriptorImpl]

'scope' @ [37:80] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'variable' @ [42:30] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'containingDeclaration' @ [42:39] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'scope' @ [43:30] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [43:36] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'isCapturedVariable' @ [44:13] ==> private final fun isCapturedVariable(variableParent: DeclarationDescriptor, scopeContainer: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[SimpleFunctionDescriptorImpl]

'variableParent' @ [44:32] ==> val variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[LocalVariableDescriptor]

'scopeContainer' @ [44:48] ==> val scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[LocalVariableDescriptor]

'trace' @ [45:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'get' @ [45:23] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..ReadOnlySlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?), key: (VariableDescriptor..VariableDescriptor?)): CaptureKind? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VariableDescriptor
    <V : (Any..Any?)> -> CaptureKind

'CAPTURED_IN_CLOSURE' @ [45:27] ==> public final val CAPTURED_IN_CLOSURE: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variable' @ [45:48] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'NOT_INLINE' @ [45:73] ==> enum entry NOT_INLINE defined in org.jetbrains.kotlin.types.expressions.CaptureKind[FakeCallableDescriptorForObject]

'isCapturedInInline' @ [46:30] ==> private final fun isCapturedInInline(context: BindingContext, scopeContainer: DeclarationDescriptor, variableParent: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[SimpleFunctionDescriptorImpl]

'trace' @ [46:49] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'bindingContext' @ [46:55] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'scopeContainer' @ [46:71] ==> val scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[LocalVariableDescriptor]

'variableParent' @ [46:87] ==> val variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[LocalVariableDescriptor]

'trace' @ [47:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'record' @ [47:23] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?), key: (VariableDescriptor..VariableDescriptor?), value: (CaptureKind..CaptureKind?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> VariableDescriptor
    <V : (Any..Any?)> -> CaptureKind

'CAPTURED_IN_CLOSURE' @ [47:30] ==> public final val CAPTURED_IN_CLOSURE: (WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>..WritableSlice<(VariableDescriptor..VariableDescriptor?), (CaptureKind..CaptureKind?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'variable' @ [47:51] ==> value-parameter variable: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[ValueParameterDescriptorImpl]

'if (inline) CaptureKind.INLINE_ONLY else CaptureKind.NOT_INLINE' @ [47:61] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CaptureKind, elseBranch: CaptureKind): CaptureKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CaptureKind

'inline' @ [47:65] ==> val inline: Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.checkCapturingInClosure[LocalVariableDescriptor]

'INLINE_ONLY' @ [47:85] ==> enum entry INLINE_ONLY defined in org.jetbrains.kotlin.types.expressions.CaptureKind[FakeCallableDescriptorForObject]

'NOT_INLINE' @ [47:114] ==> enum entry NOT_INLINE defined in org.jetbrains.kotlin.types.expressions.CaptureKind[FakeCallableDescriptorForObject]

'variableParent' @ [53:13] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'scopeContainer' @ [53:54] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'variableParent' @ [53:72] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'variableParent' @ [55:13] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'variableParent' @ [56:35] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'containingDeclaration' @ [56:50] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'scopeContainer' @ [58:17] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'classDescriptor' @ [58:35] ==> val classDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[LocalVariableDescriptor]

'scopeContainer' @ [59:17] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'scopeContainer' @ [59:57] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[ValueParameterDescriptorImpl]

'containingDeclaration' @ [59:72] ==> public final val PropertyDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'classDescriptor' @ [59:97] ==> val classDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedVariable[LocalVariableDescriptor]

'DescriptorToSourceUtils' @ [67:32] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [67:56] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'scopeContainer' @ [67:80] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'!' @ [68:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeInlineArgument' @ [68:25] ==> public open fun canBeInlineArgument(@Nullable functionalExpression: PsiElement?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'scopeDeclaration' @ [68:45] ==> val scopeDeclaration: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[LocalVariableDescriptor]

'isInlinedArgument' @ [70:24] ==> public open fun isInlinedArgument(@NotNull argument: KtFunction, @NotNull bindingContext: BindingContext, checkNonLocalReturn: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'scopeDeclaration' @ [70:42] ==> val scopeDeclaration: PsiElement? defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[LocalVariableDescriptor]

'context' @ [70:74] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'scopeContainer' @ [71:40] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'containingDeclaration' @ [71:55] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'error' @ [71:80] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'scopeContainer' @ [71:107] ==> value-parameter scopeContainer: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'!' @ [72:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCapturedVariable' @ [72:21] ==> private final fun isCapturedVariable(variableParent: DeclarationDescriptor, scopeContainer: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[SimpleFunctionDescriptorImpl]

'variableParent' @ [72:40] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'scopeContainerParent' @ [72:56] ==> val scopeContainerParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[LocalVariableDescriptor]

'isCapturedInInline' @ [73:20] ==> private final fun isCapturedInInline(context: BindingContext, scopeContainer: DeclarationDescriptor, variableParent: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker[SimpleFunctionDescriptorImpl]

'context' @ [73:39] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

'scopeContainerParent' @ [73:48] ==> val scopeContainerParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[LocalVariableDescriptor]

'variableParent' @ [73:70] ==> value-parameter variableParent: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.checkers.CapturingInClosureChecker.isCapturedInInline[ValueParameterDescriptorImpl]

