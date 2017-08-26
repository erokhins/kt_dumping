'resolvedCall' @ [33:26] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [33:39] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'when (descriptor) {
            is SyntheticJavaPropertyDescriptor -> descriptor.getMethod
            // TODO: this branch becomes unnecessary, because common checks are applied to SAM adapters being resolved as common members
            // But this part may be still useful when we enable backward compatibility mode and SAM adapters become extensions again
            is SamAdapterExtensionFunctionDescriptor -> descriptor.baseDescriptorForSynthetic
            else -> return
        }' @ [35:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptor, entry1: FunctionDescriptor, entry2: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptor

'descriptor' @ [35:36] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'descriptor' @ [36:51] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'getMethod' @ [36:62] ==> public abstract val getMethod: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SyntheticJavaPropertyDescriptor[PropertyDescriptorImpl]

'descriptor' @ [39:57] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'baseDescriptorForSynthetic' @ [39:68] ==> public abstract val baseDescriptorForSynthetic: FunctionDescriptor defined in org.jetbrains.kotlin.synthetic.SamAdapterExtensionFunctionDescriptor[PropertyDescriptorImpl]

'context' @ [43:20] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'scope' @ [43:28] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'ownerDescriptor' @ [43:34] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'!' @ [46:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isVisibleIgnoringReceiver' @ [46:27] ==> public open fun isVisibleIgnoringReceiver(@NotNull p0: DeclarationDescriptorWithVisibility, @NotNull p1: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'descriptor' @ [46:53] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'from' @ [46:65] ==> val from: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'resolvedCall' @ [48:13] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [48:26] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [48:54] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'extensionReceiver' @ [48:67] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'resolvedCall' @ [50:29] ==> value-parameter resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'extensionReceiver' @ [50:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'listOf' @ [51:29] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'receiverValue' @ [51:36] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'type' @ [51:50] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'context' @ [51:58] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [51:66] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'getStableTypes' @ [51:79] ==> public abstract fun getStableTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[DeserializedSimpleFunctionDescriptor]

'createDataFlowValue' @ [52:38] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[DeserializedSimpleFunctionDescriptor]

'receiverValue' @ [52:58] ==> val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'context' @ [52:73] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [52:81] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'bindingContext' @ [52:87] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'context' @ [52:103] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'scope' @ [52:111] ==> public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'ownerDescriptor' @ [52:117] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'receiverTypes' @ [55:13] ==> val receiverTypes: List<KotlinType> defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'none' @ [55:27] ==> public inline fun <T> Iterable<KotlinType>.none(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'isVisible' @ [55:47] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'getReceiverValueWithSmartCast' @ [55:57] ==> public fun getReceiverValueWithSmartCast(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts[DeserializedSimpleFunctionDescriptor]

'it' @ [55:93] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check.<anonymous>[ValueParameterDescriptorImpl]

'sourceFunction' @ [55:98] ==> val sourceFunction: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'from' @ [55:114] ==> val from: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'context' @ [56:13] ==> value-parameter context: CallCheckerContext defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'trace' @ [56:21] ==> public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.checkers.CallCheckerContext[DeserializedPropertyDescriptor]

'report' @ [56:27] ==> public abstract fun report(@NotNull p0: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'INVISIBLE_MEMBER' @ [56:41] ==> public final val INVISIBLE_MEMBER: (DiagnosticFactory3<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory3<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?), (Visibility..Visibility?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [56:58] ==> @NotNull public open fun on(@NotNull p0: PsiElement, @NotNull p1: DeclarationDescriptor, @NotNull p2: Visibility, @NotNull p3: DeclarationDescriptor): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'reportOn' @ [56:61] ==> value-parameter reportOn: PsiElement defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[ValueParameterDescriptorImpl]

'descriptor' @ [56:71] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'descriptor' @ [56:83] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

'visibility' @ [56:94] ==> public final val CallableDescriptor.visibility: Visibility[MyPropertyDescriptor]

'from' @ [56:106] ==> val from: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.jvm.checkers.ProtectedSyntheticExtensionCallChecker.check[LocalVariableDescriptor]

