'usage' @ [29:30] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'analyze' @ [29:36] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [29:60] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'usage' @ [30:28] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'getResolvedCall' @ [30:34] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [30:50] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'!' @ [31:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [31:14] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'status' @ [31:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'isSuccess' @ [31:34] ==> public final val ResolutionStatus.isSuccess: Boolean[MyPropertyDescriptor]

'when (resolvedCall) {
            is VariableAsFunctionResolvedCall -> resolvedCall.variableCall.call.callElement
            else -> resolvedCall.call.callElement

        }' @ [33:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtElement, entry1: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtElement

'resolvedCall' @ [33:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'resolvedCall' @ [34:50] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'variableCall' @ [34:63] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[DeserializedPropertyDescriptor]

'call' @ [34:76] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'callElement' @ [34:81] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'resolvedCall' @ [35:21] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'call' @ [35:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'callElement' @ [35:39] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callElement' @ [39:13] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'callElement' @ [39:45] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'if (usage is KtOperationReferenceExpression && usage.getReferencedNameElementType() != KtTokens.IDENTIFIER) {
                val nameExpression = OperatorToFunctionIntention.convert(usage.parent as KtExpression).second
                createReplacer(nameExpression)?.invoke()
            }
            else {
                CodeInliner(usage, bindingContext, resolvedCall, callElement, replacement).doInline()
            }' @ [46:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement?, elseBranch: KtElement?): KtElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement?

'usage' @ [46:17] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'usage' @ [46:60] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [46:66] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'IDENTIFIER' @ [46:109] ==> public final val IDENTIFIER: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OperatorToFunctionIntention' @ [47:38] ==> public companion object defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention[FakeCallableDescriptorForObject]

'convert' @ [47:66] ==> public final fun convert(element: KtExpression): Pair<KtExpression, KtSimpleNameExpression> defined in org.jetbrains.kotlin.idea.intentions.OperatorToFunctionIntention.Companion[DeserializedSimpleFunctionDescriptor]

'usage' @ [47:74] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'parent' @ [47:80] ==> public final val KtOperationReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'second' @ [47:104] ==> public final val second: KtSimpleNameExpression defined in kotlin.Pair[DeserializedPropertyDescriptor]

'createReplacer' @ [48:17] ==> public open fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'nameExpression' @ [48:32] ==> val nameExpression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer.<anonymous>[LocalVariableDescriptor]

'invoke' @ [48:49] ==> public abstract operator fun invoke(): KtElement? defined in kotlin.Function0[FunctionInvokeDescriptor]

'CodeInliner' @ [51:17] ==> public constructor CodeInliner<TCallElement : KtElement>(nameExpression: KtSimpleNameExpression, bindingContext: BindingContext, resolvedCall: ResolvedCall<out CallableDescriptor>, callElement: KtElement, codeToInline: CodeToInline) defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[ClassConstructorDescriptorImpl]
Inferred types:
    <TCallElement : KtElement> -> KtElement

'usage' @ [51:29] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'bindingContext' @ [51:36] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'resolvedCall' @ [51:52] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'callElement' @ [51:66] ==> val callElement: KtElement defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'replacement' @ [51:79] ==> private final val replacement: CodeToInline defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[PropertyDescriptorImpl]

'doInline' @ [51:92] ==> public final fun doInline(): KtElement? defined in org.jetbrains.kotlin.idea.codeInliner.CodeInliner[SimpleFunctionDescriptorImpl]

