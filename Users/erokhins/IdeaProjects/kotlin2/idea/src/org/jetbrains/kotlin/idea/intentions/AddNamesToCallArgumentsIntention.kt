'SelfTargetingRangeIntention<KtCallElement>' @ [29:42] ==> public constructor SelfTargetingRangeIntention<TElement : PsiElement>(elementType: Class<KtCallElement>, text: String, familyName: String = ...) defined in org.jetbrains.kotlin.idea.intentions.SelfTargetingRangeIntention[DeserializedClassConstructorDescriptor]
Inferred types:
    <TElement : PsiElement> -> KtCallElement

'java' @ [30:30] ==> public val <T> KClass<KtCallElement>.java: Class<KtCallElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallElement

'element' @ [34:25] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'valueArguments' @ [34:33] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'arguments' @ [35:13] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'all' @ [35:23] ==> public inline fun <T> Iterable<(ValueArgument..ValueArgument?)>.all(predicate: ((ValueArgument..ValueArgument?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'it' @ [35:29] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [35:32] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'it' @ [35:45] ==> value-parameter it: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [37:28] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'getResolvedCall' @ [37:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [37:52] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'analyze' @ [37:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [37:84] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'!' @ [38:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [38:14] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'resultingDescriptor' @ [38:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'hasStableParameterNames' @ [38:47] ==> public abstract fun hasStableParameterNames(): Boolean defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[JavaMethodDescriptor]

'arguments' @ [40:26] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'resolvedCall' @ [41:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'getArgumentMapping' @ [41:46] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [41:65] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'argumentMatch' @ [42:17] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'status' @ [42:31] ==> public abstract val status: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'SUCCESS' @ [42:61] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'argumentMatch' @ [44:17] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'valueParameter' @ [44:31] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'varargElementType' @ [44:46] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'resolvedCall' @ [45:38] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'valueArguments' @ [45:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'argumentMatch' @ [45:66] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'valueParameter' @ [45:80] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'varargArgument' @ [46:21] ==> val varargArgument: VarargValueArgument defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[LocalVariableDescriptor]

'arguments' @ [46:36] ==> public final val VarargValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'size' @ [46:46] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'element' @ [50:16] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applicabilityRange[ValueParameterDescriptorImpl]

'calleeExpression' @ [50:24] ==> public final val KtCallElement.calleeExpression: KtExpression?[MyPropertyDescriptor]

'textRange' @ [50:42] ==> public final val KtExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'element' @ [54:25] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[ValueParameterDescriptorImpl]

'valueArguments' @ [54:33] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'element' @ [55:28] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[ValueParameterDescriptorImpl]

'getResolvedCall' @ [55:36] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [55:52] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[ValueParameterDescriptorImpl]

'analyze' @ [55:60] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [55:84] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'arguments' @ [56:26] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'argument' @ [57:17] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'argument' @ [57:49] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'resolvedCall' @ [58:33] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'getArgumentMapping' @ [58:46] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'argument' @ [58:65] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'argumentMatch' @ [59:24] ==> val argumentMatch: ArgumentMatch defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'valueParameter' @ [59:38] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'name' @ [59:53] ==> public final val ValueParameterDescriptor.name: Name[MyPropertyDescriptor]

'KtPsiFactory' @ [60:31] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'element' @ [60:44] ==> value-parameter element: KtCallElement defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[ValueParameterDescriptorImpl]

'createArgument' @ [60:53] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'argument' @ [60:68] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'getArgumentExpression' @ [60:77] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'name' @ [61:68] ==> val name: Name defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'argument' @ [62:68] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'getSpreadElement' @ [62:77] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'argument' @ [63:13] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

'replace' @ [63:22] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'newArgument' @ [63:30] ==> val newArgument: KtValueArgument defined in org.jetbrains.kotlin.idea.intentions.AddNamesToCallArgumentsIntention.applyTo[LocalVariableDescriptor]

