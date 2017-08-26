'resolvedCall' @ [35:37] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [35:50] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'classDescriptorForImplicitReceiver' @ [35:67] ==> private val Receiver?.classDescriptorForImplicitReceiver: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers in file ConstructorHeaderCallChecker.kt[PropertyDescriptorImpl]

'resolvedCall' @ [36:38] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'extensionReceiver' @ [36:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'classDescriptorForImplicitReceiver' @ [36:69] ==> private val Receiver?.classDescriptorForImplicitReceiver: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers in file ConstructorHeaderCallChecker.kt[PropertyDescriptorImpl]

'resolvedCall' @ [38:27] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'call' @ [38:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [38:45] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'if (callElement is KtInstanceExpressionWithLabel) {
                    context.trace.get(BindingContext.REFERENCE_TARGET, callElement.instanceReference) as? ClassDescriptor
                }
                else null' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'callElement' @ [40:21] ==> val callElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'context' @ [41:21] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [41:29] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'get' @ [41:35] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [41:54] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'callElement' @ [41:72] ==> val callElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'instanceReference' @ [41:84] ==> public final val KtInstanceExpressionWithLabel.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'dispatchReceiverClass' @ [45:13] ==> val dispatchReceiverClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'extensionReceiverClass' @ [45:46] ==> val extensionReceiverClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'labelReferenceClass' @ [45:80] ==> val labelReferenceClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'setOf' @ [47:23] ==> public fun <T> setOf(vararg elements: ClassDescriptor?): Set<ClassDescriptor?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor?

'dispatchReceiverClass' @ [47:29] ==> val dispatchReceiverClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'extensionReceiverClass' @ [47:52] ==> val extensionReceiverClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'labelReferenceClass' @ [47:76] ==> val labelReferenceClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'context' @ [49:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'scope' @ [49:21] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'parentsWithSelf' @ [49:27] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedPropertyDescriptor]

'any' @ [49:43] ==> public inline fun <T> Sequence<HierarchicalScope>.any(predicate: (HierarchicalScope) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'scope' @ [50:13] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [50:38] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [50:44] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'CONSTRUCTOR_HEADER' @ [50:69] ==> enum entry CONSTRUCTOR_HEADER defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[FakeCallableDescriptorForObject]

'in' @ [51:13] ==> public abstract fun contains(element: ClassDescriptor?): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'scope' @ [51:14] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [51:20] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'containingDeclaration' @ [51:67] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'classes' @ [51:92] ==> val classes: Set<ClassDescriptor?> defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[LocalVariableDescriptor]

'context' @ [53:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [53:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[PropertyDescriptorImpl]

'report' @ [53:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INSTANCE_ACCESS_BEFORE_SUPER_CALL' @ [53:41] ==> public final val INSTANCE_ACCESS_BEFORE_SUPER_CALL: (DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [53:75] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'reportOn' @ [53:78] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'resolvedCall' @ [53:88] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.checkers.ConstructorHeaderCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [53:101] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'this' @ [59:14] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.checkers.classDescriptorForImplicitReceiver[ReceiverParameterDescriptorImpl]

'declarationDescriptor' @ [59:42] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

